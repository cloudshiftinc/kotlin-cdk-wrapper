package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnUpdatePolicy {
  public fun autoScalingReplacingUpdate(): CfnAutoScalingReplacingUpdate? =
      unwrap(this).getAutoScalingReplacingUpdate()?.let(CfnAutoScalingReplacingUpdate::wrap)

  public fun autoScalingRollingUpdate(): CfnAutoScalingRollingUpdate? =
      unwrap(this).getAutoScalingRollingUpdate()?.let(CfnAutoScalingRollingUpdate::wrap)

  public fun autoScalingScheduledAction(): CfnAutoScalingScheduledAction? =
      unwrap(this).getAutoScalingScheduledAction()?.let(CfnAutoScalingScheduledAction::wrap)

  public fun codeDeployLambdaAliasUpdate(): CfnCodeDeployLambdaAliasUpdate? =
      unwrap(this).getCodeDeployLambdaAliasUpdate()?.let(CfnCodeDeployLambdaAliasUpdate::wrap)

  public fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

  public fun useOnlineResharding(): Boolean? = unwrap(this).getUseOnlineResharding()

  public interface Builder {
    public fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9295028b4bf917f5232bba8d006978ee8d823bd34a1070c622d4bc0f8fcca983")
    public
        fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate.Builder.() -> Unit)

    public fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a9ea3cbec2d08dcf140ff4470c95909986b1874b2511f5c1647775d302e4cec")
    public
        fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate.Builder.() -> Unit)

    public fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1b7d82b3b3d303975d080c4161a14ca8b852707a6a617e4c034961f6c565d17")
    public
        fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction.Builder.() -> Unit)

    public
        fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a985775f0ad132fa2a452a65d11fcd191a0dd165dd202ba61cb9278ca170ae73")
    public
        fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate.Builder.() -> Unit)

    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    public fun useOnlineResharding(useOnlineResharding: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnUpdatePolicy.Builder =
        software.amazon.awscdk.CfnUpdatePolicy.builder()

    override
        fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate) {
      cdkBuilder.autoScalingReplacingUpdate(autoScalingReplacingUpdate.let(CfnAutoScalingReplacingUpdate::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9295028b4bf917f5232bba8d006978ee8d823bd34a1070c622d4bc0f8fcca983")
    override
        fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate.Builder.() -> Unit):
        Unit = autoScalingReplacingUpdate(CfnAutoScalingReplacingUpdate(autoScalingReplacingUpdate))

    override fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate) {
      cdkBuilder.autoScalingRollingUpdate(autoScalingRollingUpdate.let(CfnAutoScalingRollingUpdate::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a9ea3cbec2d08dcf140ff4470c95909986b1874b2511f5c1647775d302e4cec")
    override
        fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate.Builder.() -> Unit):
        Unit = autoScalingRollingUpdate(CfnAutoScalingRollingUpdate(autoScalingRollingUpdate))

    override
        fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction) {
      cdkBuilder.autoScalingScheduledAction(autoScalingScheduledAction.let(CfnAutoScalingScheduledAction::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1b7d82b3b3d303975d080c4161a14ca8b852707a6a617e4c034961f6c565d17")
    override
        fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction.Builder.() -> Unit):
        Unit = autoScalingScheduledAction(CfnAutoScalingScheduledAction(autoScalingScheduledAction))

    override
        fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate) {
      cdkBuilder.codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate.let(CfnCodeDeployLambdaAliasUpdate::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a985775f0ad132fa2a452a65d11fcd191a0dd165dd202ba61cb9278ca170ae73")
    override
        fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate.Builder.() -> Unit):
        Unit =
        codeDeployLambdaAliasUpdate(CfnCodeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate))

    override fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
      cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    override fun useOnlineResharding(useOnlineResharding: Boolean) {
      cdkBuilder.useOnlineResharding(useOnlineResharding)
    }

    public fun build(): software.amazon.awscdk.CfnUpdatePolicy = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnUpdatePolicy,
  ) : CfnUpdatePolicy {
    override fun autoScalingReplacingUpdate(): CfnAutoScalingReplacingUpdate? =
        unwrap(this).getAutoScalingReplacingUpdate()?.let(CfnAutoScalingReplacingUpdate::wrap)

    override fun autoScalingRollingUpdate(): CfnAutoScalingRollingUpdate? =
        unwrap(this).getAutoScalingRollingUpdate()?.let(CfnAutoScalingRollingUpdate::wrap)

    override fun autoScalingScheduledAction(): CfnAutoScalingScheduledAction? =
        unwrap(this).getAutoScalingScheduledAction()?.let(CfnAutoScalingScheduledAction::wrap)

    override fun codeDeployLambdaAliasUpdate(): CfnCodeDeployLambdaAliasUpdate? =
        unwrap(this).getCodeDeployLambdaAliasUpdate()?.let(CfnCodeDeployLambdaAliasUpdate::wrap)

    override fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

    override fun useOnlineResharding(): Boolean? = unwrap(this).getUseOnlineResharding()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUpdatePolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnUpdatePolicy): CfnUpdatePolicy =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUpdatePolicy): software.amazon.awscdk.CfnUpdatePolicy = (wrapped
        as Wrapper).cdkObject
  }
}
