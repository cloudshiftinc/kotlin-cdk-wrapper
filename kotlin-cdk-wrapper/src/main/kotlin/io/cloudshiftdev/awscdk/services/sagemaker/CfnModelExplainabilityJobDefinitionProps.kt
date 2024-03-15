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

public interface CfnModelExplainabilityJobDefinitionProps {
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public fun jobResources(): Any

  public fun modelExplainabilityAppSpecification(): Any

  public fun modelExplainabilityBaselineConfig(): Any? =
      unwrap(this).getModelExplainabilityBaselineConfig()

  public fun modelExplainabilityJobInput(): Any

  public fun modelExplainabilityJobOutputConfig(): Any

  public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  public fun roleArn(): String

  public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun endpointName(endpointName: String)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun jobResources(jobResources: IResolvable)

    public
        fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92c8ae970b31e381dba425fa94f9ccd888dd3c8f332bd5c75c8b730452d648f5")
    public
        fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit)

    public fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable)

    public
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c16cc762850226169ddb4a44f765c11b4fb19537e9d1088f0f0d7594a5bc152")
    public
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit)

    public fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable)

    public
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f061bae8fbfb875f703984b79ac655060fc0b29f70ebf85f2feac04c41b087cf")
    public
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit)

    public fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable)

    public
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7085c814f6a3d53b6daa3586fe2133a6f4110e0d3c5ce6e1dad5a53ca746e324")
    public
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder.() -> Unit)

    public fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable)

    public
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2f472fc8f53acd2c086bf94b80fec3414ba74a420c483a7323a572185ac4f8")
    public
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit)

    public fun networkConfig(networkConfig: IResolvable)

    public
        fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cf7cdf3ed3a733621e1162d8f3b348bdc606f8fdac04f6a5f2de9d0df453891")
    public
        fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stoppingCondition(stoppingCondition: IResolvable)

    public
        fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("559f91ab3ac57a3ed43b259e05a1f7d50573df632f145a9cba62751703e0d991")
    public
        fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps.builder()

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    override
        fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92c8ae970b31e381dba425fa94f9ccd888dd3c8f332bd5c75c8b730452d648f5")
    override
        fun jobResources(jobResources: CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit):
        Unit =
        jobResources(CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty(jobResources))

    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: IResolvable) {
      cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.let(IResolvable::unwrap))
    }

    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty) {
      cdkBuilder.modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.let(CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c16cc762850226169ddb4a44f765c11b4fb19537e9d1088f0f0d7594a5bc152")
    override
        fun modelExplainabilityAppSpecification(modelExplainabilityAppSpecification: CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityAppSpecification(CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty(modelExplainabilityAppSpecification))

    override fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: IResolvable) {
      cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.let(IResolvable::unwrap))
    }

    override
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty) {
      cdkBuilder.modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.let(CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f061bae8fbfb875f703984b79ac655060fc0b29f70ebf85f2feac04c41b087cf")
    override
        fun modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig: CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityBaselineConfig(CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty(modelExplainabilityBaselineConfig))

    override fun modelExplainabilityJobInput(modelExplainabilityJobInput: IResolvable) {
      cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput.let(IResolvable::unwrap))
    }

    override
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty) {
      cdkBuilder.modelExplainabilityJobInput(modelExplainabilityJobInput.let(CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7085c814f6a3d53b6daa3586fe2133a6f4110e0d3c5ce6e1dad5a53ca746e324")
    override
        fun modelExplainabilityJobInput(modelExplainabilityJobInput: CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityJobInput(CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty(modelExplainabilityJobInput))

    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: IResolvable) {
      cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.let(IResolvable::unwrap))
    }

    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty) {
      cdkBuilder.modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.let(CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2f472fc8f53acd2c086bf94b80fec3414ba74a420c483a7323a572185ac4f8")
    override
        fun modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig: CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelExplainabilityJobOutputConfig(CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty(modelExplainabilityJobOutputConfig))

    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    override
        fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(CfnModelExplainabilityJobDefinition.NetworkConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cf7cdf3ed3a733621e1162d8f3b348bdc606f8fdac04f6a5f2de9d0df453891")
    override
        fun networkConfig(networkConfig: CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Builder.() -> Unit):
        Unit =
        networkConfig(CfnModelExplainabilityJobDefinition.NetworkConfigProperty(networkConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    override
        fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(CfnModelExplainabilityJobDefinition.StoppingConditionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("559f91ab3ac57a3ed43b259e05a1f7d50573df632f145a9cba62751703e0d991")
    override
        fun stoppingCondition(stoppingCondition: CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Builder.() -> Unit):
        Unit =
        stoppingCondition(CfnModelExplainabilityJobDefinition.StoppingConditionProperty(stoppingCondition))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps,
  ) : CdkObject(cdkObject), CfnModelExplainabilityJobDefinitionProps {
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun jobResources(): Any = unwrap(this).getJobResources()

    override fun modelExplainabilityAppSpecification(): Any =
        unwrap(this).getModelExplainabilityAppSpecification()

    override fun modelExplainabilityBaselineConfig(): Any? =
        unwrap(this).getModelExplainabilityBaselineConfig()

    override fun modelExplainabilityJobInput(): Any = unwrap(this).getModelExplainabilityJobInput()

    override fun modelExplainabilityJobOutputConfig(): Any =
        unwrap(this).getModelExplainabilityJobOutputConfig()

    override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnModelExplainabilityJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps):
        CfnModelExplainabilityJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelExplainabilityJobDefinitionProps):
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps
  }
}
