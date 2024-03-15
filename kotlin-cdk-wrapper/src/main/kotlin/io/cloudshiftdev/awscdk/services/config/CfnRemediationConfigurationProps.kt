@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnRemediationConfigurationProps {
  public fun automatic(): Any? = unwrap(this).getAutomatic()

  public fun configRuleName(): String

  public fun executionControls(): Any? = unwrap(this).getExecutionControls()

  public fun maximumAutomaticAttempts(): Number? = unwrap(this).getMaximumAutomaticAttempts()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun resourceType(): String? = unwrap(this).getResourceType()

  public fun retryAttemptSeconds(): Number? = unwrap(this).getRetryAttemptSeconds()

  public fun targetId(): String

  public fun targetType(): String

  public fun targetVersion(): String? = unwrap(this).getTargetVersion()

  @CdkDslMarker
  public interface Builder {
    public fun automatic(automatic: Boolean)

    public fun automatic(automatic: IResolvable)

    public fun configRuleName(configRuleName: String)

    public fun executionControls(executionControls: IResolvable)

    public
        fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e20cdb25e82ee7bf91f5e29212f08cdf4f58a08a209868dccf0cfd2dca7cd236")
    public
        fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty.Builder.() -> Unit)

    public fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number)

    public fun parameters(parameters: Any)

    public fun resourceType(resourceType: String)

    public fun retryAttemptSeconds(retryAttemptSeconds: Number)

    public fun targetId(targetId: String)

    public fun targetType(targetType: String)

    public fun targetVersion(targetVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnRemediationConfigurationProps.Builder =
        software.amazon.awscdk.services.config.CfnRemediationConfigurationProps.builder()

    override fun automatic(automatic: Boolean) {
      cdkBuilder.automatic(automatic)
    }

    override fun automatic(automatic: IResolvable) {
      cdkBuilder.automatic(automatic.let(IResolvable::unwrap))
    }

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun executionControls(executionControls: IResolvable) {
      cdkBuilder.executionControls(executionControls.let(IResolvable::unwrap))
    }

    override
        fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty) {
      cdkBuilder.executionControls(executionControls.let(CfnRemediationConfiguration.ExecutionControlsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e20cdb25e82ee7bf91f5e29212f08cdf4f58a08a209868dccf0cfd2dca7cd236")
    override
        fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty.Builder.() -> Unit):
        Unit =
        executionControls(CfnRemediationConfiguration.ExecutionControlsProperty(executionControls))

    override fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number) {
      cdkBuilder.maximumAutomaticAttempts(maximumAutomaticAttempts)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun retryAttemptSeconds(retryAttemptSeconds: Number) {
      cdkBuilder.retryAttemptSeconds(retryAttemptSeconds)
    }

    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    override fun targetVersion(targetVersion: String) {
      cdkBuilder.targetVersion(targetVersion)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnRemediationConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfigurationProps,
  ) : CdkObject(cdkObject), CfnRemediationConfigurationProps {
    override fun automatic(): Any? = unwrap(this).getAutomatic()

    override fun configRuleName(): String = unwrap(this).getConfigRuleName()

    override fun executionControls(): Any? = unwrap(this).getExecutionControls()

    override fun maximumAutomaticAttempts(): Number? = unwrap(this).getMaximumAutomaticAttempts()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun resourceType(): String? = unwrap(this).getResourceType()

    override fun retryAttemptSeconds(): Number? = unwrap(this).getRetryAttemptSeconds()

    override fun targetId(): String = unwrap(this).getTargetId()

    override fun targetType(): String = unwrap(this).getTargetType()

    override fun targetVersion(): String? = unwrap(this).getTargetVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRemediationConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfigurationProps):
        CfnRemediationConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRemediationConfigurationProps):
        software.amazon.awscdk.services.config.CfnRemediationConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnRemediationConfigurationProps
  }
}
