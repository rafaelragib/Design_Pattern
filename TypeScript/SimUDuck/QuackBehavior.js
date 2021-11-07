"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MuteQuack = exports.Quack = void 0;
var Quack = /** @class */ (function () {
    function Quack() {
    }
    Quack.prototype.quack = function () {
        console.log('Quack!');
    };
    return Quack;
}());
exports.Quack = Quack;
var MuteQuack = /** @class */ (function () {
    function MuteQuack() {
    }
    MuteQuack.prototype.quack = function () {
        console.log('No quack!');
    };
    return MuteQuack;
}());
exports.MuteQuack = MuteQuack;
