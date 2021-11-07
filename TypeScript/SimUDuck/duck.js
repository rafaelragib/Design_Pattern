"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Duck = void 0;
var Duck = /** @class */ (function () {
    function Duck() {
    }
    Duck.prototype.performFly = function () {
        this.flyBehavior.fly();
    };
    Duck.prototype.performQuack = function () {
        this.quackBehavior.quack();
    };
    Duck.prototype.swim = function () {
        console.log('All ducks swim');
    };
    return Duck;
}());
exports.Duck = Duck;
