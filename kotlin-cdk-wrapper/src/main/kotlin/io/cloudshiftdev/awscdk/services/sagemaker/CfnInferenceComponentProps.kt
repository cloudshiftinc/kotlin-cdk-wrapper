@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInferenceComponentProps {
  public fun endpointArn(): String? = unwrap(this).getEndpointArn()

  public fun endpointName(): String

  public fun inferenceComponentName(): String? = unwrap(this).getInferenceComponentName()

  public fun runtimeConfig(): Any

  public fun specification(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun variantName(): String

  @CdkDslMarker
  public interface Builder {
    public fun endpointArn(endpointArn: String)

    public fun endpointName(endpointName: String)

    public fun inferenceComponentName(inferenceComponentName: String)

    public fun runtimeConfig(runtimeConfig: IResolvable)

    public
        fun runtimeConfig(runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fc0fc930e3310cfe254d100cd68219905cd2098aedcc54c0f79e6b49139b817")
    public
        fun runtimeConfig(runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.Builder.() -> Unit)

    public fun specification(specification: IResolvable)

    public
        fun specification(specification: CfnInferenceComponent.InferenceComponentSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("114dd8f0d37348ae9a92721a3e086c335f9a0f0829e9dd4c1610e14c95c7e9bf")
    public
        fun specification(specification: CfnInferenceComponent.InferenceComponentSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun variantName(variantName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps.builder()

    override fun endpointArn(endpointArn: String) {
      cdkBuilder.endpointArn(endpointArn)
    }

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun inferenceComponentName(inferenceComponentName: String) {
      cdkBuilder.inferenceComponentName(inferenceComponentName)
    }

    override fun runtimeConfig(runtimeConfig: IResolvable) {
      cdkBuilder.runtimeConfig(runtimeConfig.let(IResolvable::unwrap))
    }

    override
        fun runtimeConfig(runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty) {
      cdkBuilder.runtimeConfig(runtimeConfig.let(CfnInferenceComponent.InferenceComponentRuntimeConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fc0fc930e3310cfe254d100cd68219905cd2098aedcc54c0f79e6b49139b817")
    override
        fun runtimeConfig(runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.Builder.() -> Unit):
        Unit =
        runtimeConfig(CfnInferenceComponent.InferenceComponentRuntimeConfigProperty(runtimeConfig))

    override fun specification(specification: IResolvable) {
      cdkBuilder.specification(specification.let(IResolvable::unwrap))
    }

    override
        fun specification(specification: CfnInferenceComponent.InferenceComponentSpecificationProperty) {
      cdkBuilder.specification(specification.let(CfnInferenceComponent.InferenceComponentSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("114dd8f0d37348ae9a92721a3e086c335f9a0f0829e9dd4c1610e14c95c7e9bf")
    override
        fun specification(specification: CfnInferenceComponent.InferenceComponentSpecificationProperty.Builder.() -> Unit):
        Unit =
        specification(CfnInferenceComponent.InferenceComponentSpecificationProperty(specification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun variantName(variantName: String) {
      cdkBuilder.variantName(variantName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps,
  ) : CdkObject(cdkObject), CfnInferenceComponentProps {
    override fun endpointArn(): String? = unwrap(this).getEndpointArn()

    override fun endpointName(): String = unwrap(this).getEndpointName()

    override fun inferenceComponentName(): String? = unwrap(this).getInferenceComponentName()

    override fun runtimeConfig(): Any = unwrap(this).getRuntimeConfig()

    override fun specification(): Any = unwrap(this).getSpecification()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun variantName(): String = unwrap(this).getVariantName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInferenceComponentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps):
        CfnInferenceComponentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceComponentProps):
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps
  }
}
