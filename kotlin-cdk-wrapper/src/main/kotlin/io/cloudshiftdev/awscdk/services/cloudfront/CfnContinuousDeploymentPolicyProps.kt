@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnContinuousDeploymentPolicyProps {
  public fun continuousDeploymentPolicyConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable)

    public
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("819d2076ae0e872b4d25846b0584f381602ec4d733c5327f8a61ae31e2819c9b")
    public
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps.builder()

    override fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
      cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig.let(IResolvable::unwrap))
    }

    override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty) {
      cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig.let(CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("819d2076ae0e872b4d25846b0584f381602ec4d733c5327f8a61ae31e2819c9b")
    override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        continuousDeploymentPolicyConfig(CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty(continuousDeploymentPolicyConfig))

    public fun build():
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps,
  ) : CdkObject(cdkObject), CfnContinuousDeploymentPolicyProps {
    override fun continuousDeploymentPolicyConfig(): Any =
        unwrap(this).getContinuousDeploymentPolicyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContinuousDeploymentPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps):
        CfnContinuousDeploymentPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContinuousDeploymentPolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps
  }
}
