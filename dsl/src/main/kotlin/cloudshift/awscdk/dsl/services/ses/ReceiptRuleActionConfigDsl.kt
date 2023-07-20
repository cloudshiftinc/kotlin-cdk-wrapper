@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.AddHeaderActionConfig
import software.amazon.awscdk.services.ses.BounceActionConfig
import software.amazon.awscdk.services.ses.LambdaActionConfig
import software.amazon.awscdk.services.ses.ReceiptRuleActionConfig
import software.amazon.awscdk.services.ses.S3ActionConfig
import software.amazon.awscdk.services.ses.SNSActionConfig
import software.amazon.awscdk.services.ses.StopActionConfig
import software.amazon.awscdk.services.ses.WorkmailActionConfig
import kotlin.Unit

@CdkDslMarker
public class ReceiptRuleActionConfigDsl {
    private val cdkBuilder: ReceiptRuleActionConfig.Builder = ReceiptRuleActionConfig.builder()

    public fun addHeaderAction(block: AddHeaderActionConfigDsl.() -> Unit = {}) {
        val builder = AddHeaderActionConfigDsl()
        builder.apply(block)
        cdkBuilder.addHeaderAction(builder.build())
    }

    public fun addHeaderAction(addHeaderAction: AddHeaderActionConfig) {
        cdkBuilder.addHeaderAction(addHeaderAction)
    }

    public fun bounceAction(block: BounceActionConfigDsl.() -> Unit = {}) {
        val builder = BounceActionConfigDsl()
        builder.apply(block)
        cdkBuilder.bounceAction(builder.build())
    }

    public fun bounceAction(bounceAction: BounceActionConfig) {
        cdkBuilder.bounceAction(bounceAction)
    }

    public fun lambdaAction(block: LambdaActionConfigDsl.() -> Unit = {}) {
        val builder = LambdaActionConfigDsl()
        builder.apply(block)
        cdkBuilder.lambdaAction(builder.build())
    }

    public fun lambdaAction(lambdaAction: LambdaActionConfig) {
        cdkBuilder.lambdaAction(lambdaAction)
    }

    public fun s3Action(block: S3ActionConfigDsl.() -> Unit = {}) {
        val builder = S3ActionConfigDsl()
        builder.apply(block)
        cdkBuilder.s3Action(builder.build())
    }

    public fun s3Action(s3Action: S3ActionConfig) {
        cdkBuilder.s3Action(s3Action)
    }

    public fun snsAction(block: SNSActionConfigDsl.() -> Unit = {}) {
        val builder = SNSActionConfigDsl()
        builder.apply(block)
        cdkBuilder.snsAction(builder.build())
    }

    public fun snsAction(snsAction: SNSActionConfig) {
        cdkBuilder.snsAction(snsAction)
    }

    public fun stopAction(block: StopActionConfigDsl.() -> Unit = {}) {
        val builder = StopActionConfigDsl()
        builder.apply(block)
        cdkBuilder.stopAction(builder.build())
    }

    public fun stopAction(stopAction: StopActionConfig) {
        cdkBuilder.stopAction(stopAction)
    }

    public fun workmailAction(block: WorkmailActionConfigDsl.() -> Unit = {}) {
        val builder = WorkmailActionConfigDsl()
        builder.apply(block)
        cdkBuilder.workmailAction(builder.build())
    }

    public fun workmailAction(workmailAction: WorkmailActionConfig) {
        cdkBuilder.workmailAction(workmailAction)
    }

    public fun build(): ReceiptRuleActionConfig = cdkBuilder.build()
}
