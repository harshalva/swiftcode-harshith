var app = angular.module('chatApp', ['ngMaterial']);

app.controller('chatController', function ($scope) {
    $scope.messages = [
        {
            "sender": "USER",
            "text": "Wassap!"
        },
        {
            "sender": "BOT",
            "text": "How may I help you?"
        },
        {
            "sender": "USER",
            "text": "Find nearest petrol bunk"
        },
        {
            "sender": "BOT",
            "text": "Devegowda!"
        }];
});