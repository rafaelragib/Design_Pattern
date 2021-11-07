"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FlyNoWay = exports.FlyWithWings = void 0;
var FlyWithWings = /** @class */ (function () {
    function FlyWithWings() {
    }
    FlyWithWings.prototype.fly = function () {
        console.log('I am Flying');
    };
    return FlyWithWings;
}());
exports.FlyWithWings = FlyWithWings;
var FlyNoWay = /** @class */ (function () {
    function FlyNoWay() {
    }
    FlyNoWay.prototype.fly = function () {
        console.log('I can\'t fly');
    };
    return FlyNoWay;
}());
exports.FlyNoWay = FlyNoWay;
