package io.cloudshiftdev.awscdk.common

import io.cloudshiftdev.awscdk.App
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.s3.Bucket
import io.cloudshiftdev.constructs.Construct
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs

class WrappingTests : FunSpec() {

    init {
        test("tagging works") {
            val app = App()

            val stack = Stack(app, "MyStack")

            val bucket = Bucket(stack, "MyConstruct") {}

            val x  = bucket.node().children()

            bucket.node().children().filterIsInstance<CfnResource>().forEach {
                it.addMetadata(mapOf("cloudshift:comment" to "Some comment"))
            }

            bucket.node().children().filterIsInstance<CfnResource>().should {
                it.size shouldBe 1
                it.first().cfnOptions().metadata().get("cloudshift:comment") shouldBe "Some comment"
            }
        }

        test("wrapping works for custom constructs") {
            val app = App()

            val stack = Stack(app, "MyStack")

            val construct = MyConstruct(stack, "MyConstruct")

            val resolvedStack = Stack.of(construct)
            val construct2 = resolvedStack.node().tryFindChild("MyConstruct") as MyConstruct

            construct2.shouldBeSameInstanceAs(construct)
        }
    }

    private class MyConstruct(scope : Construct, id : String) : Construct(scope, id) {

    }
}


private fun CfnResource.addMetadata(newMetadata: Map<String, Any>) {
    if (newMetadata.isEmpty()) {
        return
    }
    var metadata = cfnOptions().metadata()
    metadata = metadata.toMutableMap()
    metadata.putAll(newMetadata)
    cfnOptions().metadata(metadata.toMap())
}

