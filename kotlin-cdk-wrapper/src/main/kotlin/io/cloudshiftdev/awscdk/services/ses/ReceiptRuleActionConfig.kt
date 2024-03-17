@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a receipt rule action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
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
public interface ReceiptRuleActionConfig {
  /**
   * Adds a header to the received email.
   */
  public fun addHeaderAction(): AddHeaderActionConfig? =
      unwrap(this).getAddHeaderAction()?.let(AddHeaderActionConfig::wrap)

  /**
   * Rejects the received email by returning a bounce response to the sender and, optionally,
   * publishes a notification to Amazon SNS.
   */
  public fun bounceAction(): BounceActionConfig? =
      unwrap(this).getBounceAction()?.let(BounceActionConfig::wrap)

  /**
   * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
   */
  public fun lambdaAction(): LambdaActionConfig? =
      unwrap(this).getLambdaAction()?.let(LambdaActionConfig::wrap)

  /**
   * Saves the received message to an Amazon S3 bucket and, optionally, publishes a notification to
   * Amazon SNS.
   */
  public fun s3Action(): S3ActionConfig? = unwrap(this).getS3Action()?.let(S3ActionConfig::wrap)

  /**
   * Publishes the email content within a notification to Amazon SNS.
   */
  public fun snsAction(): SNSActionConfig? = unwrap(this).getSnsAction()?.let(SNSActionConfig::wrap)

  /**
   * Terminates the evaluation of the receipt rule set and optionally publishes a notification to
   * Amazon SNS.
   */
  public fun stopAction(): StopActionConfig? =
      unwrap(this).getStopAction()?.let(StopActionConfig::wrap)

  /**
   * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon SNS.
   */
  public fun workmailAction(): WorkmailActionConfig? =
      unwrap(this).getWorkmailAction()?.let(WorkmailActionConfig::wrap)

  /**
   * A builder for [ReceiptRuleActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addHeaderAction Adds a header to the received email.
     */
    public fun addHeaderAction(addHeaderAction: AddHeaderActionConfig)

    /**
     * @param addHeaderAction Adds a header to the received email.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc94015995ac94941610054de67804dc671933fc5691614b39920ba3e59d6c97")
    public fun addHeaderAction(addHeaderAction: AddHeaderActionConfig.Builder.() -> Unit)

    /**
     * @param bounceAction Rejects the received email by returning a bounce response to the sender
     * and, optionally, publishes a notification to Amazon SNS.
     */
    public fun bounceAction(bounceAction: BounceActionConfig)

    /**
     * @param bounceAction Rejects the received email by returning a bounce response to the sender
     * and, optionally, publishes a notification to Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b12d9b886d4898d9c7550824120f1354191d404624661cfb89c5ce776a03dc2")
    public fun bounceAction(bounceAction: BounceActionConfig.Builder.() -> Unit)

    /**
     * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification to
     * Amazon SNS.
     */
    public fun lambdaAction(lambdaAction: LambdaActionConfig)

    /**
     * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification to
     * Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e18fba56702ed60ff4b965b1411867fc64a59eb6adaaeb4a0dcaca401b520def")
    public fun lambdaAction(lambdaAction: LambdaActionConfig.Builder.() -> Unit)

    /**
     * @param s3Action Saves the received message to an Amazon S3 bucket and, optionally, publishes
     * a notification to Amazon SNS.
     */
    public fun s3Action(s3Action: S3ActionConfig)

    /**
     * @param s3Action Saves the received message to an Amazon S3 bucket and, optionally, publishes
     * a notification to Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de056fdae196834f2021e2102a1352b96688f532f852bf56434a69457957692f")
    public fun s3Action(s3Action: S3ActionConfig.Builder.() -> Unit)

    /**
     * @param snsAction Publishes the email content within a notification to Amazon SNS.
     */
    public fun snsAction(snsAction: SNSActionConfig)

    /**
     * @param snsAction Publishes the email content within a notification to Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b70f8fa1baa8caf6c07ce104f130f5c0f041a25f8ae656c153298aeaa78580fe")
    public fun snsAction(snsAction: SNSActionConfig.Builder.() -> Unit)

    /**
     * @param stopAction Terminates the evaluation of the receipt rule set and optionally publishes
     * a notification to Amazon SNS.
     */
    public fun stopAction(stopAction: StopActionConfig)

    /**
     * @param stopAction Terminates the evaluation of the receipt rule set and optionally publishes
     * a notification to Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05b4e6c502c24f318c1e1c74499fa50b42d9298c26e500a0ebdbf62dbbdde065")
    public fun stopAction(stopAction: StopActionConfig.Builder.() -> Unit)

    /**
     * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
     * Amazon SNS.
     */
    public fun workmailAction(workmailAction: WorkmailActionConfig)

    /**
     * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
     * Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7732b78e8f6176f3a701eeedf7220aa9e157dccdb097070688e186c961c4b29a")
    public fun workmailAction(workmailAction: WorkmailActionConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRuleActionConfig.Builder =
        software.amazon.awscdk.services.ses.ReceiptRuleActionConfig.builder()

    /**
     * @param addHeaderAction Adds a header to the received email.
     */
    override fun addHeaderAction(addHeaderAction: AddHeaderActionConfig) {
      cdkBuilder.addHeaderAction(addHeaderAction.let(AddHeaderActionConfig::unwrap))
    }

    /**
     * @param addHeaderAction Adds a header to the received email.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc94015995ac94941610054de67804dc671933fc5691614b39920ba3e59d6c97")
    override fun addHeaderAction(addHeaderAction: AddHeaderActionConfig.Builder.() -> Unit): Unit =
        addHeaderAction(AddHeaderActionConfig(addHeaderAction))

    /**
     * @param bounceAction Rejects the received email by returning a bounce response to the sender
     * and, optionally, publishes a notification to Amazon SNS.
     */
    override fun bounceAction(bounceAction: BounceActionConfig) {
      cdkBuilder.bounceAction(bounceAction.let(BounceActionConfig::unwrap))
    }

    /**
     * @param bounceAction Rejects the received email by returning a bounce response to the sender
     * and, optionally, publishes a notification to Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b12d9b886d4898d9c7550824120f1354191d404624661cfb89c5ce776a03dc2")
    override fun bounceAction(bounceAction: BounceActionConfig.Builder.() -> Unit): Unit =
        bounceAction(BounceActionConfig(bounceAction))

    /**
     * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification to
     * Amazon SNS.
     */
    override fun lambdaAction(lambdaAction: LambdaActionConfig) {
      cdkBuilder.lambdaAction(lambdaAction.let(LambdaActionConfig::unwrap))
    }

    /**
     * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification to
     * Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e18fba56702ed60ff4b965b1411867fc64a59eb6adaaeb4a0dcaca401b520def")
    override fun lambdaAction(lambdaAction: LambdaActionConfig.Builder.() -> Unit): Unit =
        lambdaAction(LambdaActionConfig(lambdaAction))

    /**
     * @param s3Action Saves the received message to an Amazon S3 bucket and, optionally, publishes
     * a notification to Amazon SNS.
     */
    override fun s3Action(s3Action: S3ActionConfig) {
      cdkBuilder.s3Action(s3Action.let(S3ActionConfig::unwrap))
    }

    /**
     * @param s3Action Saves the received message to an Amazon S3 bucket and, optionally, publishes
     * a notification to Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de056fdae196834f2021e2102a1352b96688f532f852bf56434a69457957692f")
    override fun s3Action(s3Action: S3ActionConfig.Builder.() -> Unit): Unit =
        s3Action(S3ActionConfig(s3Action))

    /**
     * @param snsAction Publishes the email content within a notification to Amazon SNS.
     */
    override fun snsAction(snsAction: SNSActionConfig) {
      cdkBuilder.snsAction(snsAction.let(SNSActionConfig::unwrap))
    }

    /**
     * @param snsAction Publishes the email content within a notification to Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b70f8fa1baa8caf6c07ce104f130f5c0f041a25f8ae656c153298aeaa78580fe")
    override fun snsAction(snsAction: SNSActionConfig.Builder.() -> Unit): Unit =
        snsAction(SNSActionConfig(snsAction))

    /**
     * @param stopAction Terminates the evaluation of the receipt rule set and optionally publishes
     * a notification to Amazon SNS.
     */
    override fun stopAction(stopAction: StopActionConfig) {
      cdkBuilder.stopAction(stopAction.let(StopActionConfig::unwrap))
    }

    /**
     * @param stopAction Terminates the evaluation of the receipt rule set and optionally publishes
     * a notification to Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05b4e6c502c24f318c1e1c74499fa50b42d9298c26e500a0ebdbf62dbbdde065")
    override fun stopAction(stopAction: StopActionConfig.Builder.() -> Unit): Unit =
        stopAction(StopActionConfig(stopAction))

    /**
     * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
     * Amazon SNS.
     */
    override fun workmailAction(workmailAction: WorkmailActionConfig) {
      cdkBuilder.workmailAction(workmailAction.let(WorkmailActionConfig::unwrap))
    }

    /**
     * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
     * Amazon SNS.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7732b78e8f6176f3a701eeedf7220aa9e157dccdb097070688e186c961c4b29a")
    override fun workmailAction(workmailAction: WorkmailActionConfig.Builder.() -> Unit): Unit =
        workmailAction(WorkmailActionConfig(workmailAction))

    public fun build(): software.amazon.awscdk.services.ses.ReceiptRuleActionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleActionConfig,
  ) : CdkObject(cdkObject), ReceiptRuleActionConfig {
    /**
     * Adds a header to the received email.
     */
    override fun addHeaderAction(): AddHeaderActionConfig? =
        unwrap(this).getAddHeaderAction()?.let(AddHeaderActionConfig::wrap)

    /**
     * Rejects the received email by returning a bounce response to the sender and, optionally,
     * publishes a notification to Amazon SNS.
     */
    override fun bounceAction(): BounceActionConfig? =
        unwrap(this).getBounceAction()?.let(BounceActionConfig::wrap)

    /**
     * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     */
    override fun lambdaAction(): LambdaActionConfig? =
        unwrap(this).getLambdaAction()?.let(LambdaActionConfig::wrap)

    /**
     * Saves the received message to an Amazon S3 bucket and, optionally, publishes a notification
     * to Amazon SNS.
     */
    override fun s3Action(): S3ActionConfig? = unwrap(this).getS3Action()?.let(S3ActionConfig::wrap)

    /**
     * Publishes the email content within a notification to Amazon SNS.
     */
    override fun snsAction(): SNSActionConfig? =
        unwrap(this).getSnsAction()?.let(SNSActionConfig::wrap)

    /**
     * Terminates the evaluation of the receipt rule set and optionally publishes a notification to
     * Amazon SNS.
     */
    override fun stopAction(): StopActionConfig? =
        unwrap(this).getStopAction()?.let(StopActionConfig::wrap)

    /**
     * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon SNS.
     */
    override fun workmailAction(): WorkmailActionConfig? =
        unwrap(this).getWorkmailAction()?.let(WorkmailActionConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReceiptRuleActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleActionConfig):
        ReceiptRuleActionConfig = CdkObjectWrappers.wrap(cdkObject) as? ReceiptRuleActionConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReceiptRuleActionConfig):
        software.amazon.awscdk.services.ses.ReceiptRuleActionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.ReceiptRuleActionConfig
  }
}
