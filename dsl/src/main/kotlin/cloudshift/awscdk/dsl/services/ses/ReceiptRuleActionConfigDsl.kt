@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.ses.AddHeaderActionConfig
import software.amazon.awscdk.services.ses.BounceActionConfig
import software.amazon.awscdk.services.ses.LambdaActionConfig
import software.amazon.awscdk.services.ses.ReceiptRuleActionConfig
import software.amazon.awscdk.services.ses.S3ActionConfig
import software.amazon.awscdk.services.ses.SNSActionConfig
import software.amazon.awscdk.services.ses.StopActionConfig
import software.amazon.awscdk.services.ses.WorkmailActionConfig

/**
 * Properties for a receipt rule action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * ReceiptRuleActionConfig receiptRuleActionConfig = ReceiptRuleActionConfig.builder()
 * .addHeaderAction(AddHeaderActionConfig.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build())
 * .bounceAction(BounceActionConfig.builder()
 * .message("message")
 * .sender("sender")
 * .smtpReplyCode("smtpReplyCode")
 * // the properties below are optional
 * .statusCode("statusCode")
 * .topicArn("topicArn")
 * .build())
 * .lambdaAction(LambdaActionConfig.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .invocationType("invocationType")
 * .topicArn("topicArn")
 * .build())
 * .s3Action(S3ActionConfig.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .objectKeyPrefix("objectKeyPrefix")
 * .topicArn("topicArn")
 * .build())
 * .snsAction(SNSActionConfig.builder()
 * .encoding("encoding")
 * .topicArn("topicArn")
 * .build())
 * .stopAction(StopActionConfig.builder()
 * .scope("scope")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build())
 * .workmailAction(WorkmailActionConfig.builder()
 * .organizationArn("organizationArn")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ReceiptRuleActionConfigDsl {
    private val cdkBuilder: ReceiptRuleActionConfig.Builder = ReceiptRuleActionConfig.builder()

    /** @param addHeaderAction Adds a header to the received email. */
    public fun addHeaderAction(addHeaderAction: AddHeaderActionConfigDsl.() -> Unit = {}) {
        val builder = AddHeaderActionConfigDsl()
        builder.apply(addHeaderAction)
        cdkBuilder.addHeaderAction(builder.build())
    }

    /** @param addHeaderAction Adds a header to the received email. */
    public fun addHeaderAction(addHeaderAction: AddHeaderActionConfig) {
        cdkBuilder.addHeaderAction(addHeaderAction)
    }

    /**
     * @param bounceAction Rejects the received email by returning a bounce response to the sender
     *   and, optionally, publishes a notification to Amazon SNS.
     */
    public fun bounceAction(bounceAction: BounceActionConfigDsl.() -> Unit = {}) {
        val builder = BounceActionConfigDsl()
        builder.apply(bounceAction)
        cdkBuilder.bounceAction(builder.build())
    }

    /**
     * @param bounceAction Rejects the received email by returning a bounce response to the sender
     *   and, optionally, publishes a notification to Amazon SNS.
     */
    public fun bounceAction(bounceAction: BounceActionConfig) {
        cdkBuilder.bounceAction(bounceAction)
    }

    /**
     * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification to
     *   Amazon SNS.
     */
    public fun lambdaAction(lambdaAction: LambdaActionConfigDsl.() -> Unit = {}) {
        val builder = LambdaActionConfigDsl()
        builder.apply(lambdaAction)
        cdkBuilder.lambdaAction(builder.build())
    }

    /**
     * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification to
     *   Amazon SNS.
     */
    public fun lambdaAction(lambdaAction: LambdaActionConfig) {
        cdkBuilder.lambdaAction(lambdaAction)
    }

    /**
     * @param s3Action Saves the received message to an Amazon S3 bucket and, optionally, publishes
     *   a notification to Amazon SNS.
     */
    public fun s3Action(s3Action: S3ActionConfigDsl.() -> Unit = {}) {
        val builder = S3ActionConfigDsl()
        builder.apply(s3Action)
        cdkBuilder.s3Action(builder.build())
    }

    /**
     * @param s3Action Saves the received message to an Amazon S3 bucket and, optionally, publishes
     *   a notification to Amazon SNS.
     */
    public fun s3Action(s3Action: S3ActionConfig) {
        cdkBuilder.s3Action(s3Action)
    }

    /** @param snsAction Publishes the email content within a notification to Amazon SNS. */
    public fun snsAction(snsAction: SNSActionConfigDsl.() -> Unit = {}) {
        val builder = SNSActionConfigDsl()
        builder.apply(snsAction)
        cdkBuilder.snsAction(builder.build())
    }

    /** @param snsAction Publishes the email content within a notification to Amazon SNS. */
    public fun snsAction(snsAction: SNSActionConfig) {
        cdkBuilder.snsAction(snsAction)
    }

    /**
     * @param stopAction Terminates the evaluation of the receipt rule set and optionally publishes
     *   a notification to Amazon SNS.
     */
    public fun stopAction(stopAction: StopActionConfigDsl.() -> Unit = {}) {
        val builder = StopActionConfigDsl()
        builder.apply(stopAction)
        cdkBuilder.stopAction(builder.build())
    }

    /**
     * @param stopAction Terminates the evaluation of the receipt rule set and optionally publishes
     *   a notification to Amazon SNS.
     */
    public fun stopAction(stopAction: StopActionConfig) {
        cdkBuilder.stopAction(stopAction)
    }

    /**
     * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
     *   Amazon SNS.
     */
    public fun workmailAction(workmailAction: WorkmailActionConfigDsl.() -> Unit = {}) {
        val builder = WorkmailActionConfigDsl()
        builder.apply(workmailAction)
        cdkBuilder.workmailAction(builder.build())
    }

    /**
     * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
     *   Amazon SNS.
     */
    public fun workmailAction(workmailAction: WorkmailActionConfig) {
        cdkBuilder.workmailAction(workmailAction)
    }

    public fun build(): ReceiptRuleActionConfig = cdkBuilder.build()
}
