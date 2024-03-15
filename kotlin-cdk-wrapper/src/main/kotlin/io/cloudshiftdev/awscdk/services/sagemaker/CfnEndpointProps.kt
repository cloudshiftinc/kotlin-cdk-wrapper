@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEndpointProps {
  public fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

  public fun endpointConfigName(): String

  public fun endpointName(): String? = unwrap(this).getEndpointName()

  public fun excludeRetainedVariantProperties(): Any? =
      unwrap(this).getExcludeRetainedVariantProperties()

  public fun retainAllVariantProperties(): Any? = unwrap(this).getRetainAllVariantProperties()

  public fun retainDeploymentConfig(): Any? = unwrap(this).getRetainDeploymentConfig()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun deploymentConfig(deploymentConfig: IResolvable)

    public fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2d6ba44edefbb0dfcf01841de554d4892cba2499abbd58c2e4446c59f7afb2")
    public
        fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty.Builder.() -> Unit)

    public fun endpointConfigName(endpointConfigName: String)

    public fun endpointName(endpointName: String)

    public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable)

    public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: List<Any>)

    public fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any)

    public fun retainAllVariantProperties(retainAllVariantProperties: Boolean)

    public fun retainAllVariantProperties(retainAllVariantProperties: IResolvable)

    public fun retainDeploymentConfig(retainDeploymentConfig: Boolean)

    public fun retainDeploymentConfig(retainDeploymentConfig: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnEndpointProps.builder()

    override fun deploymentConfig(deploymentConfig: IResolvable) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IResolvable::unwrap))
    }

    override fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(CfnEndpoint.DeploymentConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2d6ba44edefbb0dfcf01841de554d4892cba2499abbd58c2e4446c59f7afb2")
    override
        fun deploymentConfig(deploymentConfig: CfnEndpoint.DeploymentConfigProperty.Builder.() -> Unit):
        Unit = deploymentConfig(CfnEndpoint.DeploymentConfigProperty(deploymentConfig))

    override fun endpointConfigName(endpointConfigName: String) {
      cdkBuilder.endpointConfigName(endpointConfigName)
    }

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable) {
      cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties.let(IResolvable::unwrap))
    }

    override fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: List<Any>) {
      cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties)
    }

    override fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any):
        Unit = excludeRetainedVariantProperties(excludeRetainedVariantProperties.toList())

    override fun retainAllVariantProperties(retainAllVariantProperties: Boolean) {
      cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
    }

    override fun retainAllVariantProperties(retainAllVariantProperties: IResolvable) {
      cdkBuilder.retainAllVariantProperties(retainAllVariantProperties.let(IResolvable::unwrap))
    }

    override fun retainDeploymentConfig(retainDeploymentConfig: Boolean) {
      cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
    }

    override fun retainDeploymentConfig(retainDeploymentConfig: IResolvable) {
      cdkBuilder.retainDeploymentConfig(retainDeploymentConfig.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointProps,
  ) : CdkObject(cdkObject), CfnEndpointProps {
    override fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

    override fun endpointConfigName(): String = unwrap(this).getEndpointConfigName()

    override fun endpointName(): String? = unwrap(this).getEndpointName()

    override fun excludeRetainedVariantProperties(): Any? =
        unwrap(this).getExcludeRetainedVariantProperties()

    override fun retainAllVariantProperties(): Any? = unwrap(this).getRetainAllVariantProperties()

    override fun retainDeploymentConfig(): Any? = unwrap(this).getRetainDeploymentConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointProps):
        CfnEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointProps):
        software.amazon.awscdk.services.sagemaker.CfnEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnEndpointProps
  }
}
