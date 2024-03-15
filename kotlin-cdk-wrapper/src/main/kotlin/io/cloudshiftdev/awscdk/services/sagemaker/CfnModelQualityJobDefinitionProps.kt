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

public interface CfnModelQualityJobDefinitionProps {
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public fun jobResources(): Any

  public fun modelQualityAppSpecification(): Any

  public fun modelQualityBaselineConfig(): Any? = unwrap(this).getModelQualityBaselineConfig()

  public fun modelQualityJobInput(): Any

  public fun modelQualityJobOutputConfig(): Any

  public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  public fun roleArn(): String

  public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun endpointName(endpointName: String)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun jobResources(jobResources: IResolvable)

    public fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4469e396ae16782927038126b69fd4d01236373725344fa61bac4cd01e30c289")
    public
        fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit)

    public fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable)

    public
        fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcaf3836e6466bd1a7bf80f2d12ee3538668efc606cf934218748437216a354b")
    public
        fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder.() -> Unit)

    public fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable)

    public
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f9f6fb13324c719ee9955fa264697119623423327224d5055bc336084b657d4")
    public
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.Builder.() -> Unit)

    public fun modelQualityJobInput(modelQualityJobInput: IResolvable)

    public
        fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ecd26305865124c4b92054fa71f8ad3c9fc38682b99983c33a7a8a3c5d8012f")
    public
        fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder.() -> Unit)

    public fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable)

    public
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69e84c795d77aa961acb15ff23181b730269b6cfe83f103923c3aeaa4bd345bc")
    public
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit)

    public fun networkConfig(networkConfig: IResolvable)

    public fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff488dbfc36b03ba810ad46a87af48ebbac1550381d0308a2d35268ba18c8c56")
    public
        fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stoppingCondition(stoppingCondition: IResolvable)

    public
        fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("779329dee6ab5e514166eb104df196aedad1aa20865464018baea43cb8e2465f")
    public
        fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps.builder()

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
        fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(CfnModelQualityJobDefinition.MonitoringResourcesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4469e396ae16782927038126b69fd4d01236373725344fa61bac4cd01e30c289")
    override
        fun jobResources(jobResources: CfnModelQualityJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit):
        Unit = jobResources(CfnModelQualityJobDefinition.MonitoringResourcesProperty(jobResources))

    override fun modelQualityAppSpecification(modelQualityAppSpecification: IResolvable) {
      cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification.let(IResolvable::unwrap))
    }

    override
        fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty) {
      cdkBuilder.modelQualityAppSpecification(modelQualityAppSpecification.let(CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcaf3836e6466bd1a7bf80f2d12ee3538668efc606cf934218748437216a354b")
    override
        fun modelQualityAppSpecification(modelQualityAppSpecification: CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelQualityAppSpecification(CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty(modelQualityAppSpecification))

    override fun modelQualityBaselineConfig(modelQualityBaselineConfig: IResolvable) {
      cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig.let(IResolvable::unwrap))
    }

    override
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty) {
      cdkBuilder.modelQualityBaselineConfig(modelQualityBaselineConfig.let(CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f9f6fb13324c719ee9955fa264697119623423327224d5055bc336084b657d4")
    override
        fun modelQualityBaselineConfig(modelQualityBaselineConfig: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelQualityBaselineConfig(CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty(modelQualityBaselineConfig))

    override fun modelQualityJobInput(modelQualityJobInput: IResolvable) {
      cdkBuilder.modelQualityJobInput(modelQualityJobInput.let(IResolvable::unwrap))
    }

    override
        fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty) {
      cdkBuilder.modelQualityJobInput(modelQualityJobInput.let(CfnModelQualityJobDefinition.ModelQualityJobInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ecd26305865124c4b92054fa71f8ad3c9fc38682b99983c33a7a8a3c5d8012f")
    override
        fun modelQualityJobInput(modelQualityJobInput: CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder.() -> Unit):
        Unit =
        modelQualityJobInput(CfnModelQualityJobDefinition.ModelQualityJobInputProperty(modelQualityJobInput))

    override fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: IResolvable) {
      cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig.let(IResolvable::unwrap))
    }

    override
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty) {
      cdkBuilder.modelQualityJobOutputConfig(modelQualityJobOutputConfig.let(CfnModelQualityJobDefinition.MonitoringOutputConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69e84c795d77aa961acb15ff23181b730269b6cfe83f103923c3aeaa4bd345bc")
    override
        fun modelQualityJobOutputConfig(modelQualityJobOutputConfig: CfnModelQualityJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelQualityJobOutputConfig(CfnModelQualityJobDefinition.MonitoringOutputConfigProperty(modelQualityJobOutputConfig))

    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    override fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(CfnModelQualityJobDefinition.NetworkConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff488dbfc36b03ba810ad46a87af48ebbac1550381d0308a2d35268ba18c8c56")
    override
        fun networkConfig(networkConfig: CfnModelQualityJobDefinition.NetworkConfigProperty.Builder.() -> Unit):
        Unit = networkConfig(CfnModelQualityJobDefinition.NetworkConfigProperty(networkConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    override
        fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(CfnModelQualityJobDefinition.StoppingConditionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("779329dee6ab5e514166eb104df196aedad1aa20865464018baea43cb8e2465f")
    override
        fun stoppingCondition(stoppingCondition: CfnModelQualityJobDefinition.StoppingConditionProperty.Builder.() -> Unit):
        Unit =
        stoppingCondition(CfnModelQualityJobDefinition.StoppingConditionProperty(stoppingCondition))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps,
  ) : CdkObject(cdkObject), CfnModelQualityJobDefinitionProps {
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    override fun jobResources(): Any = unwrap(this).getJobResources()

    override fun modelQualityAppSpecification(): Any =
        unwrap(this).getModelQualityAppSpecification()

    override fun modelQualityBaselineConfig(): Any? = unwrap(this).getModelQualityBaselineConfig()

    override fun modelQualityJobInput(): Any = unwrap(this).getModelQualityJobInput()

    override fun modelQualityJobOutputConfig(): Any = unwrap(this).getModelQualityJobOutputConfig()

    override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelQualityJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps):
        CfnModelQualityJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelQualityJobDefinitionProps):
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps
  }
}
