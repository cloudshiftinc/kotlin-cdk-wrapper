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

/**
 * Properties for defining a `CfnModel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object environment;
 * CfnModelProps cfnModelProps = CfnModelProps.builder()
 * .containers(List.of(ContainerDefinitionProperty.builder()
 * .containerHostname("containerHostname")
 * .environment(environment)
 * .image("image")
 * .imageConfig(ImageConfigProperty.builder()
 * .repositoryAccessMode("repositoryAccessMode")
 * // the properties below are optional
 * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
 * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
 * .build())
 * .build())
 * .inferenceSpecificationName("inferenceSpecificationName")
 * .mode("mode")
 * .modelDataSource(ModelDataSourceProperty.builder()
 * .s3DataSource(S3DataSourceProperty.builder()
 * .compressionType("compressionType")
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .modelAccessConfig(ModelAccessConfigProperty.builder()
 * .acceptEula(false)
 * .build())
 * .build())
 * .build())
 * .modelDataUrl("modelDataUrl")
 * .modelPackageName("modelPackageName")
 * .multiModelConfig(MultiModelConfigProperty.builder()
 * .modelCacheSetting("modelCacheSetting")
 * .build())
 * .build()))
 * .enableNetworkIsolation(false)
 * .executionRoleArn("executionRoleArn")
 * .inferenceExecutionConfig(InferenceExecutionConfigProperty.builder()
 * .mode("mode")
 * .build())
 * .modelName("modelName")
 * .primaryContainer(ContainerDefinitionProperty.builder()
 * .containerHostname("containerHostname")
 * .environment(environment)
 * .image("image")
 * .imageConfig(ImageConfigProperty.builder()
 * .repositoryAccessMode("repositoryAccessMode")
 * // the properties below are optional
 * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
 * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
 * .build())
 * .build())
 * .inferenceSpecificationName("inferenceSpecificationName")
 * .mode("mode")
 * .modelDataSource(ModelDataSourceProperty.builder()
 * .s3DataSource(S3DataSourceProperty.builder()
 * .compressionType("compressionType")
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .modelAccessConfig(ModelAccessConfigProperty.builder()
 * .acceptEula(false)
 * .build())
 * .build())
 * .build())
 * .modelDataUrl("modelDataUrl")
 * .modelPackageName("modelPackageName")
 * .multiModelConfig(MultiModelConfigProperty.builder()
 * .modelCacheSetting("modelCacheSetting")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html)
 */
public interface CfnModelProps {
  /**
   * Specifies the containers in the inference pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
   */
  public fun containers(): Any? = unwrap(this).getContainers()

  /**
   * Isolates the model container.
   *
   * No inbound or outbound network calls can be made to or from the model container.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-enablenetworkisolation)
   */
  public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that SageMaker can assume to access model
   * artifacts and docker image for deployment on ML compute instances or for batch transform jobs.
   *
   * Deploying on ML compute instances is part of model hosting. For more information, see
   * [SageMaker Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
   *
   *
   * To be able to pass this role to SageMaker, the caller of this API must have the `iam:PassRole`
   * permission.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn)
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * Specifies details of how containers in a multi-container endpoint are called.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
   */
  public fun inferenceExecutionConfig(): Any? = unwrap(this).getInferenceExecutionConfig()

  /**
   * The name of the new model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname)
   */
  public fun modelName(): String? = unwrap(this).getModelName()

  /**
   * The location of the primary docker image containing inference code, associated artifacts, and
   * custom environment map that the inference code uses when the model is deployed for predictions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
   */
  public fun primaryContainer(): Any? = unwrap(this).getPrimaryContainer()

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnModelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containers Specifies the containers in the inference pipeline.
     */
    public fun containers(containers: IResolvable)

    /**
     * @param containers Specifies the containers in the inference pipeline.
     */
    public fun containers(containers: List<Any>)

    /**
     * @param containers Specifies the containers in the inference pipeline.
     */
    public fun containers(vararg containers: Any)

    /**
     * @param enableNetworkIsolation Isolates the model container.
     * No inbound or outbound network calls can be made to or from the model container.
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

    /**
     * @param enableNetworkIsolation Isolates the model container.
     * No inbound or outbound network calls can be made to or from the model container.
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role that SageMaker can
     * assume to access model artifacts and docker image for deployment on ML compute instances or for
     * batch transform jobs.
     * Deploying on ML compute instances is part of model hosting. For more information, see
     * [SageMaker Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
     *
     *
     * To be able to pass this role to SageMaker, the caller of this API must have the
     * `iam:PassRole` permission.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called.
     */
    public fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable)

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called.
     */
    public
        fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty)

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33198061e0e5ab36462a5cb1dd62cec09da9cd196a119c5c4f2f1bfda9b3d0bb")
    public
        fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty.Builder.() -> Unit)

    /**
     * @param modelName The name of the new model.
     */
    public fun modelName(modelName: String)

    /**
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions.
     */
    public fun primaryContainer(primaryContainer: IResolvable)

    /**
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions.
     */
    public fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty)

    /**
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be93ce039047b5193e8c2f2e41ece0f83660d89117586c7b43765253e7945057")
    public
        fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty.Builder.() -> Unit)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     */
    public fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty)

    /**
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57debcafdd9e36524917a89c71dd9639daa41671c47ad4affa89f4adcec82f42")
    public fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelProps.builder()

    /**
     * @param containers Specifies the containers in the inference pipeline.
     */
    override fun containers(containers: IResolvable) {
      cdkBuilder.containers(containers.let(IResolvable::unwrap))
    }

    /**
     * @param containers Specifies the containers in the inference pipeline.
     */
    override fun containers(containers: List<Any>) {
      cdkBuilder.containers(containers)
    }

    /**
     * @param containers Specifies the containers in the inference pipeline.
     */
    override fun containers(vararg containers: Any): Unit = containers(containers.toList())

    /**
     * @param enableNetworkIsolation Isolates the model container.
     * No inbound or outbound network calls can be made to or from the model container.
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    /**
     * @param enableNetworkIsolation Isolates the model container.
     * No inbound or outbound network calls can be made to or from the model container.
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
    }

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role that SageMaker can
     * assume to access model artifacts and docker image for deployment on ML compute instances or for
     * batch transform jobs.
     * Deploying on ML compute instances is part of model hosting. For more information, see
     * [SageMaker Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
     *
     *
     * To be able to pass this role to SageMaker, the caller of this API must have the
     * `iam:PassRole` permission.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called.
     */
    override fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable) {
      cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig.let(IResolvable::unwrap))
    }

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called.
     */
    override
        fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty) {
      cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig.let(CfnModel.InferenceExecutionConfigProperty::unwrap))
    }

    /**
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33198061e0e5ab36462a5cb1dd62cec09da9cd196a119c5c4f2f1bfda9b3d0bb")
    override
        fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty.Builder.() -> Unit):
        Unit =
        inferenceExecutionConfig(CfnModel.InferenceExecutionConfigProperty(inferenceExecutionConfig))

    /**
     * @param modelName The name of the new model.
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    /**
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions.
     */
    override fun primaryContainer(primaryContainer: IResolvable) {
      cdkBuilder.primaryContainer(primaryContainer.let(IResolvable::unwrap))
    }

    /**
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions.
     */
    override fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty) {
      cdkBuilder.primaryContainer(primaryContainer.let(CfnModel.ContainerDefinitionProperty::unwrap))
    }

    /**
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be93ce039047b5193e8c2f2e41ece0f83660d89117586c7b43765253e7945057")
    override
        fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty.Builder.() -> Unit):
        Unit = primaryContainer(CfnModel.ContainerDefinitionProperty(primaryContainer))

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     */
    override fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnModel.VpcConfigProperty::unwrap))
    }

    /**
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57debcafdd9e36524917a89c71dd9639daa41671c47ad4affa89f4adcec82f42")
    override fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnModel.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelProps,
  ) : CdkObject(cdkObject), CfnModelProps {
    /**
     * Specifies the containers in the inference pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
     */
    override fun containers(): Any? = unwrap(this).getContainers()

    /**
     * Isolates the model container.
     *
     * No inbound or outbound network calls can be made to or from the model container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-enablenetworkisolation)
     */
    override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that SageMaker can assume to access model
     * artifacts and docker image for deployment on ML compute instances or for batch transform jobs.
     *
     * Deploying on ML compute instances is part of model hosting. For more information, see
     * [SageMaker Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
     *
     *
     * To be able to pass this role to SageMaker, the caller of this API must have the
     * `iam:PassRole` permission.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn)
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * Specifies details of how containers in a multi-container endpoint are called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
     */
    override fun inferenceExecutionConfig(): Any? = unwrap(this).getInferenceExecutionConfig()

    /**
     * The name of the new model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname)
     */
    override fun modelName(): String? = unwrap(this).getModelName()

    /**
     * The location of the primary docker image containing inference code, associated artifacts, and
     * custom environment map that the inference code uses when the model is deployed for predictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
     */
    override fun primaryContainer(): Any? = unwrap(this).getPrimaryContainer()

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * in the *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
     */
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
