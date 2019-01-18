package allure.kotlin.sample

import io.qameta.allure.Step


open class TestBase {

    @Step("test step {name} {optional}")
    fun myTestStep(name: String, optional: String = "foo") {

    }

}
