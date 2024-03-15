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

public interface CfnModelProps {
  public fun containers(): Any? = unwrap(this).getContainers()

  public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun inferenceExecutionConfig(): Any? = unwrap(this).getInferenceExecutionConfig()

  public fun modelName(): String? = unwrap(this).getModelName()

  public fun primaryContainer(): Any? = unwrap(this).getPrimaryContainer()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun containers(containers: IResolvable)

    public fun containers(containers: List<Any>)

    public fun containers(vararg containers: Any)

    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

    public fun executionRoleArn(executionRoleArn: String)

    public fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable)

    public
        fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33198061e0e5ab36462a5cb1dd62cec09da9cd196a119c5c4f2f1bfda9b3d0bb")
    public
        fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty.Builder.() -> Unit)

    public fun modelName(modelName: String)

    public fun primaryContainer(primaryContainer: IResolvable)

    public fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be93ce039047b5193e8c2f2e41ece0f83660d89117586c7b43765253e7945057")
    public
        fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57debcafdd9e36524917a89c71dd9639daa41671c47ad4affa89f4adcec82f42")
    public fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelProps.builder()

    override fun containers(containers: IResolvable) {
      cdkBuilder.containers(containers.let(IResolvable::unwrap))
    }

    override fun containers(containers: List<Any>) {
      cdkBuilder.containers(containers)
    }

    override fun containers(vararg containers: Any): Unit = containers(containers.toList())

    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
    }

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable) {
      cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig.let(IResolvable::unwrap))
    }

    override
        fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty) {
      cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig.let(CfnModel.InferenceExecutionConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33198061e0e5ab36462a5cb1dd62cec09da9cd196a119c5c4f2f1bfda9b3d0bb")
    override
        fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty.Builder.() -> Unit):
        Unit =
        inferenceExecutionConfig(CfnModel.InferenceExecutionConfigProperty(inferenceExecutionConfig))

    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    override fun primaryContainer(primaryContainer: IResolvable) {
      cdkBuilder.primaryContainer(primaryContainer.let(IResolvable::unwrap))
    }

    override fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty) {
      cdkBuilder.primaryContainer(primaryContainer.let(CfnModel.ContainerDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be93ce039047b5193e8c2f2e41ece0f83660d89117586c7b43765253e7945057")
    override
        fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty.Builder.() -> Unit):
        Unit = primaryContainer(CfnModel.ContainerDefinitionProperty(primaryContainer))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnModel.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57debcafdd9e36524917a89c71dd9639daa41671c47ad4affa89f4adcec82f42")
    override fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnModel.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelProps,
  ) : CdkObject(cdkObject), CfnModelProps {
    override fun containers(): Any? = unwrap(this).getContainers()

    override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun inferenceExecutionConfig(): Any? = unwrap(this).getInferenceExecutionConfig()

    override fun modelName(): String? = unwrap(this).getModelName()

    override fun primaryContainer(): Any? = unwrap(this).getPrimaryContainer()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelProps):
        CfnModelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelProps):
        software.amazon.awscdk.services.sagemaker.CfnModelProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnModelProps
  }
}
