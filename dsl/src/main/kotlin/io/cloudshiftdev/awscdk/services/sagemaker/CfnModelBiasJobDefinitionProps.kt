package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnModelBiasJobDefinitionProps {
  /**
   * The name of the endpoint used to run the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-endpointname)
   */
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * The name of the bias job definition.
   *
   * The name must be unique within an AWS Region in the AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobdefinitionname)
   */
  public fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  /**
   * Identifies the resources to deploy for a monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
   */
  public fun jobResources(): Any

  /**
   * Configures the model bias job to run a specified Docker container image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
   */
  public fun modelBiasAppSpecification(): Any

  /**
   * The baseline configuration for a model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
   */
  public fun modelBiasBaselineConfig(): Any? = unwrap(this).getModelBiasBaselineConfig()

  /**
   * Inputs for the model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
   */
  public fun modelBiasJobInput(): Any

  /**
   * The output configuration for monitoring jobs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
   */
  public fun modelBiasJobOutputConfig(): Any

  /**
   * Networking options for a model bias job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
   */
  public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks
   * on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-rolearn)
   */
  public fun roleArn(): String

  /**
   * A time limit for how long the monitoring job is allowed to run before stopping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
   */
  public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnModelBiasJobDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    public fun endpointName(endpointName: String)

    /**
     * @param jobDefinitionName The name of the bias job definition.
     * The name must be unique within an AWS Region in the AWS account.
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: IResolvable)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    public fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty)

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05015598cf20b4bf660540d2184b52c4aa4b2e188e3f45e42be3607b4fe40a1b")
    public
        fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit)

    /**
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    public fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable)

    /**
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    public
        fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty)

    /**
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04606c9a5f802d677437e5ab122418c0cd6eb9d9998cb1945f36913bcd8fd6a6")
    public
        fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder.() -> Unit)

    /**
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job.
     */
    public fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable)

    /**
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job.
     */
    public
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty)

    /**
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c54bcdd8ebf491243400f980c8c2c813997ae532a61cb47427994431a24dc2c4")
    public
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder.() -> Unit)

    /**
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    public fun modelBiasJobInput(modelBiasJobInput: IResolvable)

    /**
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    public
        fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty)

    /**
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b332f2f59e57634e770ffbe835b001a2f8e73c1047a3ec6f34c6a8e37099a44")
    public
        fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder.() -> Unit)

    /**
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable)

    /**
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    public
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty)

    /**
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89889f6fc8e16104655ab607b5a721e32a4892e446f93e3b53a3da135c179134")
    public
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit)

    /**
     * @param networkConfig Networking options for a model bias job.
     */
    public fun networkConfig(networkConfig: IResolvable)

    /**
     * @param networkConfig Networking options for a model bias job.
     */
    public fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty)

    /**
     * @param networkConfig Networking options for a model bias job.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e4519fb359cfb2a16ac76c6900437a304ef3d6d249a5b3df19925abd971a2d9")
    public
        fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    public fun stoppingCondition(stoppingCondition: IResolvable)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    public
        fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty)

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9c22ca3c4245e916d8ad4f273d98c611de86713bdd8743efe3b277516287079")
    public
        fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps.builder()

    /**
     * @param endpointName The name of the endpoint used to run the monitoring job.
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param jobDefinitionName The name of the bias job definition.
     * The name must be unique within an AWS Region in the AWS account.
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: IResolvable) {
      cdkBuilder.jobResources(jobResources.let(IResolvable::unwrap))
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    override fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty) {
      cdkBuilder.jobResources(jobResources.let(CfnModelBiasJobDefinition.MonitoringResourcesProperty::unwrap))
    }

    /**
     * @param jobResources Identifies the resources to deploy for a monitoring job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05015598cf20b4bf660540d2184b52c4aa4b2e188e3f45e42be3607b4fe40a1b")
    override
        fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty.Builder.() -> Unit):
        Unit = jobResources(CfnModelBiasJobDefinition.MonitoringResourcesProperty(jobResources))

    /**
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    override fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable) {
      cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    override
        fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty) {
      cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification.let(CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty::unwrap))
    }

    /**
     * @param modelBiasAppSpecification Configures the model bias job to run a specified Docker
     * container image. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04606c9a5f802d677437e5ab122418c0cd6eb9d9998cb1945f36913bcd8fd6a6")
    override
        fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder.() -> Unit):
        Unit =
        modelBiasAppSpecification(CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty(modelBiasAppSpecification))

    /**
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job.
     */
    override fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable) {
      cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig.let(IResolvable::unwrap))
    }

    /**
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job.
     */
    override
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty) {
      cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig.let(CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty::unwrap))
    }

    /**
     * @param modelBiasBaselineConfig The baseline configuration for a model bias job.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c54bcdd8ebf491243400f980c8c2c813997ae532a61cb47427994431a24dc2c4")
    override
        fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder.() -> Unit):
        Unit =
        modelBiasBaselineConfig(CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty(modelBiasBaselineConfig))

    /**
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    override fun modelBiasJobInput(modelBiasJobInput: IResolvable) {
      cdkBuilder.modelBiasJobInput(modelBiasJobInput.let(IResolvable::unwrap))
    }

    /**
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    override
        fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty) {
      cdkBuilder.modelBiasJobInput(modelBiasJobInput.let(CfnModelBiasJobDefinition.ModelBiasJobInputProperty::unwrap))
    }

    /**
     * @param modelBiasJobInput Inputs for the model bias job. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b332f2f59e57634e770ffbe835b001a2f8e73c1047a3ec6f34c6a8e37099a44")
    override
        fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder.() -> Unit):
        Unit =
        modelBiasJobInput(CfnModelBiasJobDefinition.ModelBiasJobInputProperty(modelBiasJobInput))

    /**
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    override fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable) {
      cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig.let(IResolvable::unwrap))
    }

    /**
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    override
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty) {
      cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig.let(CfnModelBiasJobDefinition.MonitoringOutputConfigProperty::unwrap))
    }

    /**
     * @param modelBiasJobOutputConfig The output configuration for monitoring jobs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89889f6fc8e16104655ab607b5a721e32a4892e446f93e3b53a3da135c179134")
    override
        fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty.Builder.() -> Unit):
        Unit =
        modelBiasJobOutputConfig(CfnModelBiasJobDefinition.MonitoringOutputConfigProperty(modelBiasJobOutputConfig))

    /**
     * @param networkConfig Networking options for a model bias job.
     */
    override fun networkConfig(networkConfig: IResolvable) {
      cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
    }

    /**
     * @param networkConfig Networking options for a model bias job.
     */
    override fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty) {
      cdkBuilder.networkConfig(networkConfig.let(CfnModelBiasJobDefinition.NetworkConfigProperty::unwrap))
    }

    /**
     * @param networkConfig Networking options for a model bias job.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e4519fb359cfb2a16ac76c6900437a304ef3d6d249a5b3df19925abd971a2d9")
    override
        fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty.Builder.() -> Unit):
        Unit = networkConfig(CfnModelBiasJobDefinition.NetworkConfigProperty(networkConfig))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume
     * to perform tasks on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    override fun stoppingCondition(stoppingCondition: IResolvable) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    override
        fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty) {
      cdkBuilder.stoppingCondition(stoppingCondition.let(CfnModelBiasJobDefinition.StoppingConditionProperty::unwrap))
    }

    /**
     * @param stoppingCondition A time limit for how long the monitoring job is allowed to run
     * before stopping.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9c22ca3c4245e916d8ad4f273d98c611de86713bdd8743efe3b277516287079")
    override
        fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty.Builder.() -> Unit):
        Unit =
        stoppingCondition(CfnModelBiasJobDefinition.StoppingConditionProperty(stoppingCondition))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps,
  ) : CdkObject(cdkObject), CfnModelBiasJobDefinitionProps {
    /**
     * The name of the endpoint used to run the monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-endpointname)
     */
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    /**
     * The name of the bias job definition.
     *
     * The name must be unique within an AWS Region in the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobdefinitionname)
     */
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-jobresources)
     */
    override fun jobResources(): Any = unwrap(this).getJobResources()

    /**
     * Configures the model bias job to run a specified Docker container image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasappspecification)
     */
    override fun modelBiasAppSpecification(): Any = unwrap(this).getModelBiasAppSpecification()

    /**
     * The baseline configuration for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig)
     */
    override fun modelBiasBaselineConfig(): Any? = unwrap(this).getModelBiasBaselineConfig()

    /**
     * Inputs for the model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjobinput)
     */
    override fun modelBiasJobInput(): Any = unwrap(this).getModelBiasJobInput()

    /**
     * The output configuration for monitoring jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-modelbiasjoboutputconfig)
     */
    override fun modelBiasJobOutputConfig(): Any = unwrap(this).getModelBiasJobOutputConfig()

    /**
     * Networking options for a model bias job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-networkconfig)
     */
    override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform
     * tasks on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * A time limit for how long the monitoring job is allowed to run before stopping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-stoppingcondition)
     */
    override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html#cfn-sagemaker-modelbiasjobdefinition-tags)
     */
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
