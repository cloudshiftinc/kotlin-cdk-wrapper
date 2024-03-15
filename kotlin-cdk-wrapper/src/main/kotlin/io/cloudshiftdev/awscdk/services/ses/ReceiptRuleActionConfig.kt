@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ReceiptRuleActionConfig {
  public fun addHeaderAction(): AddHeaderActionConfig? =
      unwrap(this).getAddHeaderAction()?.let(AddHeaderActionConfig::wrap)

  public fun bounceAction(): BounceActionConfig? =
      unwrap(this).getBounceAction()?.let(BounceActionConfig::wrap)

  public fun lambdaAction(): LambdaActionConfig? =
      unwrap(this).getLambdaAction()?.let(LambdaActionConfig::wrap)

  public fun s3Action(): S3ActionConfig? = unwrap(this).getS3Action()?.let(S3ActionConfig::wrap)

  public fun snsAction(): SNSActionConfig? = unwrap(this).getSnsAction()?.let(SNSActionConfig::wrap)

  public fun stopAction(): StopActionConfig? =
      unwrap(this).getStopAction()?.let(StopActionConfig::wrap)

  public fun workmailAction(): WorkmailActionConfig? =
      unwrap(this).getWorkmailAction()?.let(WorkmailActionConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun addHeaderAction(addHeaderAction: AddHeaderActionConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc94015995ac94941610054de67804dc671933fc5691614b39920ba3e59d6c97")
    public fun addHeaderAction(addHeaderAction: AddHeaderActionConfig.Builder.() -> Unit)

    public fun bounceAction(bounceAction: BounceActionConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b12d9b886d4898d9c7550824120f1354191d404624661cfb89c5ce776a03dc2")
    public fun bounceAction(bounceAction: BounceActionConfig.Builder.() -> Unit)

    public fun lambdaAction(lambdaAction: LambdaActionConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e18fba56702ed60ff4b965b1411867fc64a59eb6adaaeb4a0dcaca401b520def")
    public fun lambdaAction(lambdaAction: LambdaActionConfig.Builder.() -> Unit)

    public fun s3Action(s3Action: S3ActionConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de056fdae196834f2021e2102a1352b96688f532f852bf56434a69457957692f")
    public fun s3Action(s3Action: S3ActionConfig.Builder.() -> Unit)

    public fun snsAction(snsAction: SNSActionConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b70f8fa1baa8caf6c07ce104f130f5c0f041a25f8ae656c153298aeaa78580fe")
    public fun snsAction(snsAction: SNSActionConfig.Builder.() -> Unit)

    public fun stopAction(stopAction: StopActionConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05b4e6c502c24f318c1e1c74499fa50b42d9298c26e500a0ebdbf62dbbdde065")
    public fun stopAction(stopAction: StopActionConfig.Builder.() -> Unit)

    public fun workmailAction(workmailAction: WorkmailActionConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7732b78e8f6176f3a701eeedf7220aa9e157dccdb097070688e186c961c4b29a")
    public fun workmailAction(workmailAction: WorkmailActionConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRuleActionConfig.Builder =
        software.amazon.awscdk.services.ses.ReceiptRuleActionConfig.builder()

    override fun addHeaderAction(addHeaderAction: AddHeaderActionConfig) {
      cdkBuilder.addHeaderAction(addHeaderAction.let(AddHeaderActionConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc94015995ac94941610054de67804dc671933fc5691614b39920ba3e59d6c97")
    override fun addHeaderAction(addHeaderAction: AddHeaderActionConfig.Builder.() -> Unit): Unit =
        addHeaderAction(AddHeaderActionConfig(addHeaderAction))

    override fun bounceAction(bounceAction: BounceActionConfig) {
      cdkBuilder.bounceAction(bounceAction.let(BounceActionConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b12d9b886d4898d9c7550824120f1354191d404624661cfb89c5ce776a03dc2")
    override fun bounceAction(bounceAction: BounceActionConfig.Builder.() -> Unit): Unit =
        bounceAction(BounceActionConfig(bounceAction))

    override fun lambdaAction(lambdaAction: LambdaActionConfig) {
      cdkBuilder.lambdaAction(lambdaAction.let(LambdaActionConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e18fba56702ed60ff4b965b1411867fc64a59eb6adaaeb4a0dcaca401b520def")
    override fun lambdaAction(lambdaAction: LambdaActionConfig.Builder.() -> Unit): Unit =
        lambdaAction(LambdaActionConfig(lambdaAction))

    override fun s3Action(s3Action: S3ActionConfig) {
      cdkBuilder.s3Action(s3Action.let(S3ActionConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de056fdae196834f2021e2102a1352b96688f532f852bf56434a69457957692f")
    override fun s3Action(s3Action: S3ActionConfig.Builder.() -> Unit): Unit =
        s3Action(S3ActionConfig(s3Action))

    override fun snsAction(snsAction: SNSActionConfig) {
      cdkBuilder.snsAction(snsAction.let(SNSActionConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b70f8fa1baa8caf6c07ce104f130f5c0f041a25f8ae656c153298aeaa78580fe")
    override fun snsAction(snsAction: SNSActionConfig.Builder.() -> Unit): Unit =
        snsAction(SNSActionConfig(snsAction))

    override fun stopAction(stopAction: StopActionConfig) {
      cdkBuilder.stopAction(stopAction.let(StopActionConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05b4e6c502c24f318c1e1c74499fa50b42d9298c26e500a0ebdbf62dbbdde065")
    override fun stopAction(stopAction: StopActionConfig.Builder.() -> Unit): Unit =
        stopAction(StopActionConfig(stopAction))

    override fun workmailAction(workmailAction: WorkmailActionConfig) {
      cdkBuilder.workmailAction(workmailAction.let(WorkmailActionConfig::unwrap))
    }

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
    override fun addHeaderAction(): AddHeaderActionConfig? =
        unwrap(this).getAddHeaderAction()?.let(AddHeaderActionConfig::wrap)

    override fun bounceAction(): BounceActionConfig? =
        unwrap(this).getBounceAction()?.let(BounceActionConfig::wrap)

    override fun lambdaAction(): LambdaActionConfig? =
        unwrap(this).getLambdaAction()?.let(LambdaActionConfig::wrap)

    override fun s3Action(): S3ActionConfig? = unwrap(this).getS3Action()?.let(S3ActionConfig::wrap)

    override fun snsAction(): SNSActionConfig? =
        unwrap(this).getSnsAction()?.let(SNSActionConfig::wrap)

    override fun stopAction(): StopActionConfig? =
        unwrap(this).getStopAction()?.let(StopActionConfig::wrap)

    override fun workmailAction(): WorkmailActionConfig? =
        unwrap(this).getWorkmailAction()?.let(WorkmailActionConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReceiptRuleActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleActionConfig):
        ReceiptRuleActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReceiptRuleActionConfig):
        software.amazon.awscdk.services.ses.ReceiptRuleActionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.ReceiptRuleActionConfig
  }
}
