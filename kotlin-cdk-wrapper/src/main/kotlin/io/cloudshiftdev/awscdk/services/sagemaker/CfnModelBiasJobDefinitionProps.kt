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

public interface CfnModelBiasJobDefinitionProps {
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public fun jobResources(): Any

  public fun modelBiasAppSpecification(): Any

  public fun modelBiasBaselineConfig(): Any? = unwrap(this).getModelBiasBaselineConfig()

  public fun modelBiasJobInput(): Any

  public fun modelBiasJobOutputConfig(): Any

  public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  public fun roleArn(): String

  public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun endpointName(endpointName: String)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun jobResources(jobResources: IResolvable)

    public fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05015598cf20b4bf660540d2184b52c4aa4b2e188e3f45e42be3607b4fe40a1b")
    public
        fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit)

    public fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable)

    public
        fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04606c9a5f802d677437e5ab122418c0cd6eb9d9998cb1945f36913bcd8fd6a6")
    public
        fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder.() -> Unit)

    public fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable)

    public
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c54bcdd8ebf491243400f980c8c2c813997ae532a61cb47427994431a24dc2c4")
    public
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder.() -> Unit)

    public fun modelBiasJobInput(modelBiasJobInput: IResolvable)

    public
        fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b332f2f59e57634e770ffbe835b001a2f8e73c1047a3ec6f34c6a8e37099a44")
    public
        fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder.() -> Unit)

    public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable)

    public
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89889f6fc8e16104655ab607b5a721e32a4892e446f93e3b53a3da135c179134")
    public
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit)

    public fun networkConfig(networkConfig: IResolvable)

    public fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e4519fb359cfb2a16ac76c6900437a304ef3d6d249a5b3df19925abd971a2d9")
    public
        fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stoppingCondition(stoppingCondition: IResolvable)

    public
        fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9c22ca3c4245e916d8ad4f273d98c611de86713bdd8743efe3b277516287079")
    public
        fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps.builder()

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    override fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(CfnModelBiasJobDefinition.MonitoringResourcesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05015598cf20b4bf660540d2184b52c4aa4b2e188e3f45e42be3607b4fe40a1b")
    override
        fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit):
        Unit = jobResources(CfnModelBiasJobDefinition.MonitoringResourcesProperty(jobResources))

    override fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable) {
      cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification.let(IResolvable::unwrap))
    }

    override
        fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty) {
      cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification.let(CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04606c9a5f802d677437e5ab122418c0cd6eb9d9998cb1945f36913bcd8fd6a6")
    override
        fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelBiasAppSpecification(CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty(modelBiasAppSpecification))

    override fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable) {
      cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig.let(IResolvable::unwrap))
    }

    override
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty) {
      cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig.let(CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c54bcdd8ebf491243400f980c8c2c813997ae532a61cb47427994431a24dc2c4")
    override
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelBiasBaselineConfig(CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty(modelBiasBaselineConfig))

    override fun modelBiasJobInput(modelBiasJobInput: IResolvable) {
      cdkBuilder.modelBiasJobInput(modelBiasJobInput.let(IResolvable::unwrap))
    }

    override
        fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty) {
      cdkBuilder.modelBiasJobInput(modelBiasJobInput.let(CfnModelBiasJobDefinition.ModelBiasJobInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b332f2f59e57634e770ffbe835b001a2f8e73c1047a3ec6f34c6a8e37099a44")
    override
        fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder.() -> Unit):
        Unit =
        modelBiasJobInput(CfnModelBiasJobDefinition.ModelBiasJobInputProperty(modelBiasJobInput))

    override fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable) {
      cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig.let(IResolvable::unwrap))
    }

    override
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty) {
      cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig.let(CfnModelBiasJobDefinition.MonitoringOutputConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89889f6fc8e16104655ab607b5a721e32a4892e446f93e3b53a3da135c179134")
    override
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelBiasJobOutputConfig(CfnModelBiasJobDefinition.MonitoringOutputConfigProperty(modelBiasJobOutputConfig))

    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    override fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(CfnModelBiasJobDefinition.NetworkConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e4519fb359cfb2a16ac76c6900437a304ef3d6d249a5b3df19925abd971a2d9")
    override
        fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty.Builder.() -> Unit):
        Unit = networkConfig(CfnModelBiasJobDefinition.NetworkConfigProperty(networkConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    override
        fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(CfnModelBiasJobDefinition.StoppingConditionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9c22ca3c4245e916d8ad4f273d98c611de86713bdd8743efe3b277516287079")
    override
        fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty.Builder.() -> Unit):
        Unit =
        stoppingCondition(CfnModelBiasJobDefinition.StoppingConditionProperty(stoppingCondition))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps,
  ) : CdkObject(cdkObject), CfnModelBiasJobDefinitionProps {
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun jobResources(): Any = unwrap(this).getJobResources()

    override fun modelBiasAppSpecification(): Any = unwrap(this).getModelBiasAppSpecification()

    override fun modelBiasBaselineConfig(): Any? = unwrap(this).getModelBiasBaselineConfig()

    override fun modelBiasJobInput(): Any = unwrap(this).getModelBiasJobInput()

    override fun modelBiasJobOutputConfig(): Any = unwrap(this).getModelBiasJobOutputConfig()

    override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelBiasJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps):
        CfnModelBiasJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelBiasJobDefinitionProps):
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps
  }
}
