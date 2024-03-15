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

public interface CfnDataQualityJobDefinitionProps {
  public fun dataQualityAppSpecification(): Any

  public fun dataQualityBaselineConfig(): Any? = unwrap(this).getDataQualityBaselineConfig()

  public fun dataQualityJobInput(): Any

  public fun dataQualityJobOutputConfig(): Any

  public fun endpointName(): String? = unwrap(this).getEndpointName()

  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public fun jobResources(): Any

  public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  public fun roleArn(): String

  public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dataQualityAppSpecification(dataQualityAppSpecification: IResolvable)

    public
        fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f4abc724e1fe117a55882714939e3ffc8da49603e52854c162051e42a27d863")
    public
        fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder.() -> Unit)

    public fun dataQualityBaselineConfig(dataQualityBaselineConfig: IResolvable)

    public
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42c492b24ef12546fe8040aac046abd5a6ed318a282e4c838c4af269774246c7")
    public
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder.() -> Unit)

    public fun dataQualityJobInput(dataQualityJobInput: IResolvable)

    public
        fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c9e4fc2b1e0fd7add9964fbb003d68d0eb25f422532e38d96a127512f7923ca")
    public
        fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder.() -> Unit)

    public fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: IResolvable)

    public
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8784558b2640200913d38941fd8869de01d60b9b021220e7bd943de34b11eda5")
    public
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit)

    public fun endpointName(endpointName: String)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun jobResources(jobResources: IResolvable)

    public fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6309b4c61e50acd19f5dc6a57a37dbb0d8f984b7583d7712b4958e3d5d8d41c5")
    public
        fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit)

    public fun networkConfig(networkConfig: IResolvable)

    public fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf4c8ca2f7ead6305ef6e31d4a4dd1d7e64ec0285d096a7446b23c7159a1da9d")
    public
        fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stoppingCondition(stoppingCondition: IResolvable)

    public
        fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("226d37f05446f7edd77ca8bdba63599a52a16c0cb95dc05cadddf1cfb35d0a15")
    public
        fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps.builder()

    override fun dataQualityAppSpecification(dataQualityAppSpecification: IResolvable) {
      cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification.let(IResolvable::unwrap))
    }

    override
        fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty) {
      cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification.let(CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f4abc724e1fe117a55882714939e3ffc8da49603e52854c162051e42a27d863")
    override
        fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        dataQualityAppSpecification(CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty(dataQualityAppSpecification))

    override fun dataQualityBaselineConfig(dataQualityBaselineConfig: IResolvable) {
      cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig.let(IResolvable::unwrap))
    }

    override
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty) {
      cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig.let(CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42c492b24ef12546fe8040aac046abd5a6ed318a282e4c838c4af269774246c7")
    override
        fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        dataQualityBaselineConfig(CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty(dataQualityBaselineConfig))

    override fun dataQualityJobInput(dataQualityJobInput: IResolvable) {
      cdkBuilder.dataQualityJobInput(dataQualityJobInput.let(IResolvable::unwrap))
    }

    override
        fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty) {
      cdkBuilder.dataQualityJobInput(dataQualityJobInput.let(CfnDataQualityJobDefinition.DataQualityJobInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c9e4fc2b1e0fd7add9964fbb003d68d0eb25f422532e38d96a127512f7923ca")
    override
        fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder.() -> Unit):
        Unit =
        dataQualityJobInput(CfnDataQualityJobDefinition.DataQualityJobInputProperty(dataQualityJobInput))

    override fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: IResolvable) {
      cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig.let(IResolvable::unwrap))
    }

    override
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty) {
      cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig.let(CfnDataQualityJobDefinition.MonitoringOutputConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8784558b2640200913d38941fd8869de01d60b9b021220e7bd943de34b11eda5")
    override
        fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        dataQualityJobOutputConfig(CfnDataQualityJobDefinition.MonitoringOutputConfigProperty(dataQualityJobOutputConfig))

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
        fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(CfnDataQualityJobDefinition.MonitoringResourcesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6309b4c61e50acd19f5dc6a57a37dbb0d8f984b7583d7712b4958e3d5d8d41c5")
    override
        fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit):
        Unit = jobResources(CfnDataQualityJobDefinition.MonitoringResourcesProperty(jobResources))

    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    override fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(CfnDataQualityJobDefinition.NetworkConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf4c8ca2f7ead6305ef6e31d4a4dd1d7e64ec0285d096a7446b23c7159a1da9d")
    override
        fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty.Builder.() -> Unit):
        Unit = networkConfig(CfnDataQualityJobDefinition.NetworkConfigProperty(networkConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    override
        fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(CfnDataQualityJobDefinition.StoppingConditionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("226d37f05446f7edd77ca8bdba63599a52a16c0cb95dc05cadddf1cfb35d0a15")
    override
        fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty.Builder.() -> Unit):
        Unit =
        stoppingCondition(CfnDataQualityJobDefinition.StoppingConditionProperty(stoppingCondition))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps,
  ) : CdkObject(cdkObject), CfnDataQualityJobDefinitionProps {
    override fun dataQualityAppSpecification(): Any = unwrap(this).getDataQualityAppSpecification()

    override fun dataQualityBaselineConfig(): Any? = unwrap(this).getDataQualityBaselineConfig()

    override fun dataQualityJobInput(): Any = unwrap(this).getDataQualityJobInput()

    override fun dataQualityJobOutputConfig(): Any = unwrap(this).getDataQualityJobOutputConfig()

    override fun endpointName(): String? = unwrap(this).getEndpointName()

    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun jobResources(): Any = unwrap(this).getJobResources()

    override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataQualityJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps):
        CfnDataQualityJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataQualityJobDefinitionProps):
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps
  }
}
