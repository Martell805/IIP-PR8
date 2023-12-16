package com.example.iippr8;

import com.example.iippr8.generated.Service;
import com.example.iippr8.generated.UserDataServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.HashMap;
import java.util.Map;

@GrpcService
public class MainGrpcService extends UserDataServiceGrpc.UserDataServiceImplBase {
    private final Map<String, String> users = new HashMap<>();

    private void respond(io.grpc.stub.StreamObserver<Service.StringResponse> responseObserver, String response) {
        Service.StringResponse a = Service.StringResponse.newBuilder().setResponse(response).build();
        responseObserver.onNext(a);
        responseObserver.onCompleted();
    }

    @Override
    public void register(Service.UserData request, io.grpc.stub.StreamObserver<Service.StringResponse> responseObserver) {
        if (users.containsKey(request.getUsername())) {
            respond(responseObserver, "Username already taken");
            return;
        }

        users.put(request.getUsername(), request.getPassword());

        respond(responseObserver, "Account " + request.getUsername() + " registered successfully");
    }

    @Override
    public void login(Service.UserData request, io.grpc.stub.StreamObserver<Service.StringResponse> responseObserver) {
        if (!users.containsKey(request.getUsername()) || !users.get(request.getUsername()).equals(request.getPassword())) {
            respond(responseObserver, "Incorrect account data");
            return;
        }

        users.put(request.getUsername(), request.getPassword());

        respond(responseObserver, "Hello, " + request.getUsername() + "!");
    }
}
