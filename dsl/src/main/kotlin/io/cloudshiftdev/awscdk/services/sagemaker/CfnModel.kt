package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the model, such as `MyModel` .
   */
  public open fun attrModelName(): String = unwrap(this).getAttrModelName()

  /**
   * Specifies the containers in the inference pipeline.
   */
  public open fun containers(): Any? = unwrap(this).getContainers()

  /**
   * Specifies the containers in the inference pipeline.
   */
  public open fun containers(`value`: IResolvable) {
    unwrap(this).setContainers(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the containers in the inference pipeline.
   */
  public open fun containers(__idx_ac66f0: List<Any>) {
    unwrap(this).setContainers(__idx_ac66f0)
  }

  /**
   * Specifies the containers in the inference pipeline.
   */
  public open fun containers(vararg __idx_ac66f0: Any): Unit = containers(__idx_ac66f0.toList())

  /**
   * Isolates the model container.
   */
  public open fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

  /**
   * Isolates the model container.
   */
  public open fun enableNetworkIsolation(`value`: Boolean) {
    unwrap(this).setEnableNetworkIsolation(`value`)
  }

  /**
   * Isolates the model container.
   */
  public open fun enableNetworkIsolation(`value`: IResolvable) {
    unwrap(this).setEnableNetworkIsolation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role that SageMaker can assume to access model
   * artifacts and docker image for deployment on ML compute instances or for batch transform jobs.
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that SageMaker can assume to access model
   * artifacts and docker image for deployment on ML compute instances or for batch transform jobs.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  /**
   * Specifies details of how containers in a multi-container endpoint are called.
   */
  public open fun inferenceExecutionConfig(): Any? = unwrap(this).getInferenceExecutionConfig()

  /**
   * Specifies details of how containers in a multi-container endpoint are called.
   */
  public open fun inferenceExecutionConfig(`value`: IResolvable) {
    unwrap(this).setInferenceExecutionConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies details of how containers in a multi-container endpoint are called.
   */
  public open fun inferenceExecutionConfig(`value`: InferenceExecutionConfigProperty) {
    unwrap(this).setInferenceExecutionConfig(`value`.let(InferenceExecutionConfigProperty::unwrap))
  }

  /**
   * Specifies details of how containers in a multi-container endpoint are called.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("042e2b86599f1d355d28bdfd247011736350d0e51481df8a3b6f011942f585a5")
  public open
      fun inferenceExecutionConfig(`value`: InferenceExecutionConfigProperty.Builder.() -> Unit):
      Unit = inferenceExecutionConfig(InferenceExecutionConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the new model.
   */
  public open fun modelName(): String? = unwrap(this).getModelName()

  /**
   * The name of the new model.
   */
  public open fun modelName(`value`: String) {
    unwrap(this).setModelName(`value`)
  }

  /**
   * The location of the primary docker image containing inference code, associated artifacts, and
   * custom environment map that the inference code uses when the model is deployed for predictions.
   */
  public open fun primaryContainer(): Any? = unwrap(this).getPrimaryContainer()

  /**
   * The location of the primary docker image containing inference code, associated artifacts, and
   * custom environment map that the inference code uses when the model is deployed for predictions.
   */
  public open fun primaryContainer(`value`: IResolvable) {
    unwrap(this).setPrimaryContainer(`value`.let(IResolvable::unwrap))
  }

  /**
   * The location of the primary docker image containing inference code, associated artifacts, and
   * custom environment map that the inference code uses when the model is deployed for predictions.
   */
  public open fun primaryContainer(`value`: ContainerDefinitionProperty) {
    unwrap(this).setPrimaryContainer(`value`.let(ContainerDefinitionProperty::unwrap))
  }

  /**
   * The location of the primary docker image containing inference code, associated artifacts, and
   * custom environment map that the inference code uses when the model is deployed for predictions.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aecd9511227e1b88aa691097d77e9859d86e80ee76b58749c7bd715ab4b0f894")
  public open fun primaryContainer(`value`: ContainerDefinitionProperty.Builder.() -> Unit): Unit =
      primaryContainer(ContainerDefinitionProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  /**
   * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41166d7299798ff3924d684244192824d7e763ac95e4332cf6a122fd088051f7")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnModel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the containers in the inference pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
     * @param containers Specifies the containers in the inference pipeline. 
     */
    public fun containers(containers: IResolvable)

    /**
     * Specifies the containers in the inference pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
     * @param containers Specifies the containers in the inference pipeline. 
     */
    public fun containers(containers: List<Any>)

    /**
     * Specifies the containers in the inference pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
     * @param containers Specifies the containers in the inference pipeline. 
     */
    public fun containers(vararg containers: Any)

    /**
     * Isolates the model container.
     *
     * No inbound or outbound network calls can be made to or from the model container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-enablenetworkisolation)
     * @param enableNetworkIsolation Isolates the model container. 
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

    /**
     * Isolates the model container.
     *
     * No inbound or outbound network calls can be made to or from the model container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-enablenetworkisolation)
     * @param enableNetworkIsolation Isolates the model container. 
     */
    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

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
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role that SageMaker can
     * assume to access model artifacts and docker image for deployment on ML compute instances or for
     * batch transform jobs. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * Specifies details of how containers in a multi-container endpoint are called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called. 
     */
    public fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable)

    /**
     * Specifies details of how containers in a multi-container endpoint are called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called. 
     */
    public fun inferenceExecutionConfig(inferenceExecutionConfig: InferenceExecutionConfigProperty)

    /**
     * Specifies details of how containers in a multi-container endpoint are called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3683a6f9aa830bd3cc1a5f0101ba0088df894d6feaa302a5aec2476be4652bfe")
    public
        fun inferenceExecutionConfig(inferenceExecutionConfig: InferenceExecutionConfigProperty.Builder.() -> Unit)

    /**
     * The name of the new model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname)
     * @param modelName The name of the new model. 
     */
    public fun modelName(modelName: String)

    /**
     * The location of the primary docker image containing inference code, associated artifacts, and
     * custom environment map that the inference code uses when the model is deployed for predictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions. 
     */
    public fun primaryContainer(primaryContainer: IResolvable)

    /**
     * The location of the primary docker image containing inference code, associated artifacts, and
     * custom environment map that the inference code uses when the model is deployed for predictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions. 
     */
    public fun primaryContainer(primaryContainer: ContainerDefinitionProperty)

    /**
     * The location of the primary docker image containing inference code, associated artifacts, and
     * custom environment map that the inference code uses when the model is deployed for predictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc7087f1466baca961f3a66699c419ba9f23f39d16c606af0ac185eb96b667a4")
    public fun primaryContainer(primaryContainer: ContainerDefinitionProperty.Builder.() -> Unit)

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) . 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

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
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15ef9cae36b2546cd5e7da29187bccb6baf4a3433ddd65ab8196145903b74881")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModel.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModel.Builder.create(scope, id)

    /**
     * Specifies the containers in the inference pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
     * @param containers Specifies the containers in the inference pipeline. 
     */
    override fun containers(containers: IResolvable) {
      cdkBuilder.containers(containers.let(IResolvable::unwrap))
    }

    /**
     * Specifies the containers in the inference pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
     * @param containers Specifies the containers in the inference pipeline. 
     */
    override fun containers(containers: List<Any>) {
      cdkBuilder.containers(containers)
    }

    /**
     * Specifies the containers in the inference pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
     * @param containers Specifies the containers in the inference pipeline. 
     */
    override fun containers(vararg containers: Any): Unit = containers(containers.toList())

    /**
     * Isolates the model container.
     *
     * No inbound or outbound network calls can be made to or from the model container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-enablenetworkisolation)
     * @param enableNetworkIsolation Isolates the model container. 
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    /**
     * Isolates the model container.
     *
     * No inbound or outbound network calls can be made to or from the model container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-enablenetworkisolation)
     * @param enableNetworkIsolation Isolates the model container. 
     */
    override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
    }

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
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role that SageMaker can
     * assume to access model artifacts and docker image for deployment on ML compute instances or for
     * batch transform jobs. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * Specifies details of how containers in a multi-container endpoint are called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called. 
     */
    override fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable) {
      cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies details of how containers in a multi-container endpoint are called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called. 
     */
    override
        fun inferenceExecutionConfig(inferenceExecutionConfig: InferenceExecutionConfigProperty) {
      cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig.let(InferenceExecutionConfigProperty::unwrap))
    }

    /**
     * Specifies details of how containers in a multi-container endpoint are called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
     * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
     * endpoint are called. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3683a6f9aa830bd3cc1a5f0101ba0088df894d6feaa302a5aec2476be4652bfe")
    override
        fun inferenceExecutionConfig(inferenceExecutionConfig: InferenceExecutionConfigProperty.Builder.() -> Unit):
        Unit = inferenceExecutionConfig(InferenceExecutionConfigProperty(inferenceExecutionConfig))

    /**
     * The name of the new model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname)
     * @param modelName The name of the new model. 
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    /**
     * The location of the primary docker image containing inference code, associated artifacts, and
     * custom environment map that the inference code uses when the model is deployed for predictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions. 
     */
    override fun primaryContainer(primaryContainer: IResolvable) {
      cdkBuilder.primaryContainer(primaryContainer.let(IResolvable::unwrap))
    }

    /**
     * The location of the primary docker image containing inference code, associated artifacts, and
     * custom environment map that the inference code uses when the model is deployed for predictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions. 
     */
    override fun primaryContainer(primaryContainer: ContainerDefinitionProperty) {
      cdkBuilder.primaryContainer(primaryContainer.let(ContainerDefinitionProperty::unwrap))
    }

    /**
     * The location of the primary docker image containing inference code, associated artifacts, and
     * custom environment map that the inference code uses when the model is deployed for predictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
     * @param primaryContainer The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code uses when the model is
     * deployed for predictions. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc7087f1466baca961f3a66699c419ba9f23f39d16c606af0ac185eb96b667a4")
    override fun primaryContainer(primaryContainer: ContainerDefinitionProperty.Builder.() -> Unit):
        Unit = primaryContainer(ContainerDefinitionProperty(primaryContainer))

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) . 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

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
     * @param vpcConfig A
     * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
     * specifies the VPC that you want your model to connect to. Control access to and from your model
     * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch
     * transform. For more information, see [Protect Endpoints by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
     * Transform Jobs by Using an Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15ef9cae36b2546cd5e7da29187bccb6baf4a3433ddd65ab8196145903b74881")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel): CfnModel =
        CfnModel(cdkObject)

    internal fun unwrap(wrapped: CfnModel): software.amazon.awscdk.services.sagemaker.CfnModel =
        wrapped.cdkObject
  }

  public interface MultiModelConfigProperty {
    /**
     * Whether to cache models for a multi-model endpoint.
     *
     * By default, multi-model endpoints cache models so that a model does not have to be loaded
     * into memory each time it is invoked. Some use cases do not benefit from model caching. For
     * example, if an endpoint hosts a large number of models that are each invoked infrequently, the
     * endpoint might perform better if you disable model caching. To disable model caching, set the
     * value of this parameter to Disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-multimodelconfig.html#cfn-sagemaker-model-multimodelconfig-modelcachesetting)
     */
    public fun modelCacheSetting(): String? = unwrap(this).getModelCacheSetting()

    /**
     * A builder for [MultiModelConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modelCacheSetting Whether to cache models for a multi-model endpoint.
       * By default, multi-model endpoints cache models so that a model does not have to be loaded
       * into memory each time it is invoked. Some use cases do not benefit from model caching. For
       * example, if an endpoint hosts a large number of models that are each invoked infrequently, the
       * endpoint might perform better if you disable model caching. To disable model caching, set the
       * value of this parameter to Disabled.
       */
      public fun modelCacheSetting(modelCacheSetting: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty.builder()

      /**
       * @param modelCacheSetting Whether to cache models for a multi-model endpoint.
       * By default, multi-model endpoints cache models so that a model does not have to be loaded
       * into memory each time it is invoked. Some use cases do not benefit from model caching. For
       * example, if an endpoint hosts a large number of models that are each invoked infrequently, the
       * endpoint might perform better if you disable model caching. To disable model caching, set the
       * value of this parameter to Disabled.
       */
      override fun modelCacheSetting(modelCacheSetting: String) {
        cdkBuilder.modelCacheSetting(modelCacheSetting)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty,
    ) : MultiModelConfigProperty {
      /**
       * Whether to cache models for a multi-model endpoint.
       *
       * By default, multi-model endpoints cache models so that a model does not have to be loaded
       * into memory each time it is invoked. Some use cases do not benefit from model caching. For
       * example, if an endpoint hosts a large number of models that are each invoked infrequently, the
       * endpoint might perform better if you disable model caching. To disable model caching, set the
       * value of this parameter to Disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-multimodelconfig.html#cfn-sagemaker-model-multimodelconfig-modelcachesetting)
       */
      override fun modelCacheSetting(): String? = unwrap(this).getModelCacheSetting()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultiModelConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty):
          MultiModelConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiModelConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ModelDataSourceProperty {
    /**
     * Specifies the S3 location of ML model data to deploy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-modeldatasource.html#cfn-sagemaker-model-modeldatasource-s3datasource)
     */
    public fun s3DataSource(): Any

    /**
     * A builder for [ModelDataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy. 
       */
      public fun s3DataSource(s3DataSource: IResolvable)

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy. 
       */
      public fun s3DataSource(s3DataSource: S3DataSourceProperty)

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9666c7b9ff26a4a412d5a4183267d59e440c3892268204f9dcced0caf0067e1f")
      public fun s3DataSource(s3DataSource: S3DataSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty.builder()

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy. 
       */
      override fun s3DataSource(s3DataSource: IResolvable) {
        cdkBuilder.s3DataSource(s3DataSource.let(IResolvable::unwrap))
      }

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy. 
       */
      override fun s3DataSource(s3DataSource: S3DataSourceProperty) {
        cdkBuilder.s3DataSource(s3DataSource.let(S3DataSourceProperty::unwrap))
      }

      /**
       * @param s3DataSource Specifies the S3 location of ML model data to deploy. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9666c7b9ff26a4a412d5a4183267d59e440c3892268204f9dcced0caf0067e1f")
      override fun s3DataSource(s3DataSource: S3DataSourceProperty.Builder.() -> Unit): Unit =
          s3DataSource(S3DataSourceProperty(s3DataSource))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty,
    ) : ModelDataSourceProperty {
      /**
       * Specifies the S3 location of ML model data to deploy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-modeldatasource.html#cfn-sagemaker-model-modeldatasource-s3datasource)
       */
      override fun s3DataSource(): Any = unwrap(this).getS3DataSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty):
          ModelDataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelDataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelDataSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    /**
     * The VPC security group IDs, in the form `sg-xxxxxxxx` .
     *
     * Specify the security groups for the VPC that is specified in the `Subnets` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The ID of the subnets in the VPC to which you want to connect your training job or model.
     *
     * For information about the availability of specific instance types, see [Supported Instance
     * Types and Availability
     * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The VPC security group IDs, in the form `sg-xxxxxxxx` . 
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The ID of the subnets in the VPC to which you want to connect your training
       * job or model. 
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty,
    ) : VpcConfigProperty {
      /**
       * The VPC security group IDs, in the form `sg-xxxxxxxx` .
       *
       * Specify the security groups for the VPC that is specified in the `Subnets` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The ID of the subnets in the VPC to which you want to connect your training job or model.
       *
       * For information about the availability of specific instance types, see [Supported Instance
       * Types and Availability
       * Zones](https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3DataSourceProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html#cfn-sagemaker-model-s3datasource-compressiontype)
     */
    public fun compressionType(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html#cfn-sagemaker-model-s3datasource-modelaccessconfig)
     */
    public fun modelAccessConfig(): Any? = unwrap(this).getModelAccessConfig()

    /**
     * If you choose `S3Prefix` , `S3Uri` identifies a key name prefix.
     *
     * SageMaker uses all objects that match the specified key name prefix for model training.
     *
     * If you choose `ManifestFile` , `S3Uri` identifies an object that is a manifest file
     * containing a list of object keys that you want SageMaker to use for model training.
     *
     * If you choose `AugmentedManifestFile` , S3Uri identifies an object that is an augmented
     * manifest file in JSON lines format. This file contains the data you want to use for model
     * training. `AugmentedManifestFile` can only be used if the Channel's input mode is `Pipe` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html#cfn-sagemaker-model-s3datasource-s3datatype)
     */
    public fun s3DataType(): String

    /**
     * Depending on the value specified for the `S3DataType` , identifies either a key name prefix
     * or a manifest.
     *
     * For example:
     *
     * * A key name prefix might look like this: `s3://bucketname/exampleprefix/`
     * * A manifest might look like this: `s3://bucketname/example.manifest`
     *
     * A manifest is an S3 object which is a JSON file consisting of an array of elements. The first
     * element is a prefix which is followed by one or more suffixes. SageMaker appends the suffix
     * elements to the prefix to get a full set of `S3Uri` . Note that the prefix must be a valid
     * non-empty `S3Uri` that precludes users from specifying a manifest whose individual `S3Uri` is
     * sourced from different S3 buckets.
     *
     * The following code example shows a valid manifest format:
     *
     * `[ {"prefix": "s3://customer_bucket/some/prefix/"},`
     *
     * `"relative/path/to/custdata-1",`
     *
     * `"relative/path/custdata-2",`
     *
     * `...`
     *
     * `"relative/path/custdata-N"`
     *
     * `]`
     *
     * This JSON is equivalent to the following `S3Uri` list:
     *
     * `s3://customer_bucket/some/prefix/relative/path/to/custdata-1`
     *
     * `s3://customer_bucket/some/prefix/relative/path/custdata-2`
     *
     * `...`
     *
     * `s3://customer_bucket/some/prefix/relative/path/custdata-N`
     *
     * The complete set of `S3Uri` in this manifest is the input data for the channel for this data
     * source. The object that each `S3Uri` points to must be readable by the IAM role that SageMaker
     * uses to perform tasks on your behalf.
     *
     * Your input bucket must be located in same AWS region as your training job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html#cfn-sagemaker-model-s3datasource-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [S3DataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compressionType the value to be set. 
       */
      public fun compressionType(compressionType: String)

      /**
       * @param modelAccessConfig the value to be set.
       */
      public fun modelAccessConfig(modelAccessConfig: IResolvable)

      /**
       * @param modelAccessConfig the value to be set.
       */
      public fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty)

      /**
       * @param modelAccessConfig the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d89505c81977147be9ffaf680ecf6e6297222407045d3477357064c885b2e7f")
      public fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty.Builder.() -> Unit)

      /**
       * @param s3DataType If you choose `S3Prefix` , `S3Uri` identifies a key name prefix. 
       * SageMaker uses all objects that match the specified key name prefix for model training.
       *
       * If you choose `ManifestFile` , `S3Uri` identifies an object that is a manifest file
       * containing a list of object keys that you want SageMaker to use for model training.
       *
       * If you choose `AugmentedManifestFile` , S3Uri identifies an object that is an augmented
       * manifest file in JSON lines format. This file contains the data you want to use for model
       * training. `AugmentedManifestFile` can only be used if the Channel's input mode is `Pipe` .
       */
      public fun s3DataType(s3DataType: String)

      /**
       * @param s3Uri Depending on the value specified for the `S3DataType` , identifies either a
       * key name prefix or a manifest. 
       * For example:
       *
       * * A key name prefix might look like this: `s3://bucketname/exampleprefix/`
       * * A manifest might look like this: `s3://bucketname/example.manifest`
       *
       * A manifest is an S3 object which is a JSON file consisting of an array of elements. The
       * first element is a prefix which is followed by one or more suffixes. SageMaker appends the
       * suffix elements to the prefix to get a full set of `S3Uri` . Note that the prefix must be a
       * valid non-empty `S3Uri` that precludes users from specifying a manifest whose individual
       * `S3Uri` is sourced from different S3 buckets.
       *
       * The following code example shows a valid manifest format:
       *
       * `[ {"prefix": "s3://customer_bucket/some/prefix/"},`
       *
       * `"relative/path/to/custdata-1",`
       *
       * `"relative/path/custdata-2",`
       *
       * `...`
       *
       * `"relative/path/custdata-N"`
       *
       * `]`
       *
       * This JSON is equivalent to the following `S3Uri` list:
       *
       * `s3://customer_bucket/some/prefix/relative/path/to/custdata-1`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-2`
       *
       * `...`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-N`
       *
       * The complete set of `S3Uri` in this manifest is the input data for the channel for this
       * data source. The object that each `S3Uri` points to must be readable by the IAM role that
       * SageMaker uses to perform tasks on your behalf.
       *
       * Your input bucket must be located in same AWS region as your training job.
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty.builder()

      /**
       * @param compressionType the value to be set. 
       */
      override fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
      }

      /**
       * @param modelAccessConfig the value to be set.
       */
      override fun modelAccessConfig(modelAccessConfig: IResolvable) {
        cdkBuilder.modelAccessConfig(modelAccessConfig.let(IResolvable::unwrap))
      }

      /**
       * @param modelAccessConfig the value to be set.
       */
      override fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty) {
        cdkBuilder.modelAccessConfig(modelAccessConfig.let(ModelAccessConfigProperty::unwrap))
      }

      /**
       * @param modelAccessConfig the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d89505c81977147be9ffaf680ecf6e6297222407045d3477357064c885b2e7f")
      override
          fun modelAccessConfig(modelAccessConfig: ModelAccessConfigProperty.Builder.() -> Unit):
          Unit = modelAccessConfig(ModelAccessConfigProperty(modelAccessConfig))

      /**
       * @param s3DataType If you choose `S3Prefix` , `S3Uri` identifies a key name prefix. 
       * SageMaker uses all objects that match the specified key name prefix for model training.
       *
       * If you choose `ManifestFile` , `S3Uri` identifies an object that is a manifest file
       * containing a list of object keys that you want SageMaker to use for model training.
       *
       * If you choose `AugmentedManifestFile` , S3Uri identifies an object that is an augmented
       * manifest file in JSON lines format. This file contains the data you want to use for model
       * training. `AugmentedManifestFile` can only be used if the Channel's input mode is `Pipe` .
       */
      override fun s3DataType(s3DataType: String) {
        cdkBuilder.s3DataType(s3DataType)
      }

      /**
       * @param s3Uri Depending on the value specified for the `S3DataType` , identifies either a
       * key name prefix or a manifest. 
       * For example:
       *
       * * A key name prefix might look like this: `s3://bucketname/exampleprefix/`
       * * A manifest might look like this: `s3://bucketname/example.manifest`
       *
       * A manifest is an S3 object which is a JSON file consisting of an array of elements. The
       * first element is a prefix which is followed by one or more suffixes. SageMaker appends the
       * suffix elements to the prefix to get a full set of `S3Uri` . Note that the prefix must be a
       * valid non-empty `S3Uri` that precludes users from specifying a manifest whose individual
       * `S3Uri` is sourced from different S3 buckets.
       *
       * The following code example shows a valid manifest format:
       *
       * `[ {"prefix": "s3://customer_bucket/some/prefix/"},`
       *
       * `"relative/path/to/custdata-1",`
       *
       * `"relative/path/custdata-2",`
       *
       * `...`
       *
       * `"relative/path/custdata-N"`
       *
       * `]`
       *
       * This JSON is equivalent to the following `S3Uri` list:
       *
       * `s3://customer_bucket/some/prefix/relative/path/to/custdata-1`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-2`
       *
       * `...`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-N`
       *
       * The complete set of `S3Uri` in this manifest is the input data for the channel for this
       * data source. The object that each `S3Uri` points to must be readable by the IAM role that
       * SageMaker uses to perform tasks on your behalf.
       *
       * Your input bucket must be located in same AWS region as your training job.
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty,
    ) : S3DataSourceProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html#cfn-sagemaker-model-s3datasource-compressiontype)
       */
      override fun compressionType(): String = unwrap(this).getCompressionType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html#cfn-sagemaker-model-s3datasource-modelaccessconfig)
       */
      override fun modelAccessConfig(): Any? = unwrap(this).getModelAccessConfig()

      /**
       * If you choose `S3Prefix` , `S3Uri` identifies a key name prefix.
       *
       * SageMaker uses all objects that match the specified key name prefix for model training.
       *
       * If you choose `ManifestFile` , `S3Uri` identifies an object that is a manifest file
       * containing a list of object keys that you want SageMaker to use for model training.
       *
       * If you choose `AugmentedManifestFile` , S3Uri identifies an object that is an augmented
       * manifest file in JSON lines format. This file contains the data you want to use for model
       * training. `AugmentedManifestFile` can only be used if the Channel's input mode is `Pipe` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html#cfn-sagemaker-model-s3datasource-s3datatype)
       */
      override fun s3DataType(): String = unwrap(this).getS3DataType()

      /**
       * Depending on the value specified for the `S3DataType` , identifies either a key name prefix
       * or a manifest.
       *
       * For example:
       *
       * * A key name prefix might look like this: `s3://bucketname/exampleprefix/`
       * * A manifest might look like this: `s3://bucketname/example.manifest`
       *
       * A manifest is an S3 object which is a JSON file consisting of an array of elements. The
       * first element is a prefix which is followed by one or more suffixes. SageMaker appends the
       * suffix elements to the prefix to get a full set of `S3Uri` . Note that the prefix must be a
       * valid non-empty `S3Uri` that precludes users from specifying a manifest whose individual
       * `S3Uri` is sourced from different S3 buckets.
       *
       * The following code example shows a valid manifest format:
       *
       * `[ {"prefix": "s3://customer_bucket/some/prefix/"},`
       *
       * `"relative/path/to/custdata-1",`
       *
       * `"relative/path/custdata-2",`
       *
       * `...`
       *
       * `"relative/path/custdata-N"`
       *
       * `]`
       *
       * This JSON is equivalent to the following `S3Uri` list:
       *
       * `s3://customer_bucket/some/prefix/relative/path/to/custdata-1`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-2`
       *
       * `...`
       *
       * `s3://customer_bucket/some/prefix/relative/path/custdata-N`
       *
       * The complete set of `S3Uri` in this manifest is the input data for the channel for this
       * data source. The object that each `S3Uri` points to must be readable by the IAM role that
       * SageMaker uses to perform tasks on your behalf.
       *
       * Your input bucket must be located in same AWS region as your training job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html#cfn-sagemaker-model-s3datasource-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty):
          S3DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.S3DataSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ContainerDefinitionProperty {
    /**
     * This parameter is ignored for models that contain only a `PrimaryContainer` .
     *
     * When a `ContainerDefinition` is part of an inference pipeline, the value of the parameter
     * uniquely identifies the container for the purposes of logging and metrics. For information, see
     * [Use Logs and Metrics to Monitor an Inference
     * Pipeline](https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html)
     * . If you don't specify a value for this parameter for a `ContainerDefinition` that is part of an
     * inference pipeline, a unique name is automatically assigned based on the position of the
     * `ContainerDefinition` in the pipeline. If you specify a value for the `ContainerHostName` for
     * any `ContainerDefinition` that is part of an inference pipeline, you must specify a value for
     * the `ContainerHostName` parameter of every `ContainerDefinition` in that pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname)
     */
    public fun containerHostname(): String? = unwrap(this).getContainerHostname()

    /**
     * The environment variables to set in the Docker container.
     *
     * Each key and value in the `Environment` string to string map can have length of up to 1024.
     * We support up to 16 entries in the map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The path where inference code is stored.
     *
     * This can be either in Amazon EC2 Container Registry or in a Docker registry that is
     * accessible from the same VPC that you configure for your endpoint. If you are using your own
     * custom algorithm instead of an algorithm provided by SageMaker, the inference code must meet
     * SageMaker requirements. SageMaker supports both `registry/repository[:tag]` and
     * `registry/repository[&#64;digest]` image path formats. For more information, see [Using Your Own
     * Algorithms with Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html) .
     *
     *
     * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
     * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
     * creating.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image)
     */
    public fun image(): String? = unwrap(this).getImage()

    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry
     * accessible from your Amazon Virtual Private Cloud (VPC).
     *
     * For information about storing containers in a private Docker registry, see [Use a Private
     * Docker Registry for Real-Time Inference
     * Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
     * .
     *
     *
     * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
     * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
     * creating.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-imageconfig)
     */
    public fun imageConfig(): Any? = unwrap(this).getImageConfig()

    /**
     * The inference specification name in the model package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-inferencespecificationname)
     */
    public fun inferenceSpecificationName(): String? = unwrap(this).getInferenceSpecificationName()

    /**
     * Whether the container hosts a single model or multiple models.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * Specifies the location of ML model data to deploy.
     *
     *
     * Currently you cannot use `ModelDataSource` in conjunction with SageMaker batch transform,
     * SageMaker serverless endpoints, SageMaker multi-model endpoints, and SageMaker Marketplace.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldatasource)
     */
    public fun modelDataSource(): Any? = unwrap(this).getModelDataSource()

    /**
     * The S3 path where the model artifacts, which result from model training, are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path is
     * required for SageMaker built-in algorithms, but not if you use your own algorithms. For more
     * information on built-in algorithms, see [Common
     * Parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html)
     * .
     *
     *
     * The model artifacts must be in an S3 bucket that is in the same region as the model or
     * endpoint you are creating.
     *
     *
     * If you provide a value for this parameter, SageMaker uses AWS Security Token Service to
     * download model artifacts from the S3 path you provide. AWS STS is activated in your AWS account
     * by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
     * for that region. For more information, see [Activating and Deactivating AWS STS in an AWS
     * Region](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html)
     * in the *AWS Identity and Access Management User Guide* .
     *
     *
     * If you use a built-in algorithm to create a model, SageMaker requires that you provide a S3
     * path to the model artifacts in `ModelDataUrl` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl)
     */
    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    /**
     * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modelpackagename)
     */
    public fun modelPackageName(): String? = unwrap(this).getModelPackageName()

    /**
     * Specifies additional configuration for multi-model endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-multimodelconfig)
     */
    public fun multiModelConfig(): Any? = unwrap(this).getMultiModelConfig()

    /**
     * A builder for [ContainerDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerHostname This parameter is ignored for models that contain only a
       * `PrimaryContainer` .
       * When a `ContainerDefinition` is part of an inference pipeline, the value of the parameter
       * uniquely identifies the container for the purposes of logging and metrics. For information,
       * see [Use Logs and Metrics to Monitor an Inference
       * Pipeline](https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html)
       * . If you don't specify a value for this parameter for a `ContainerDefinition` that is part of
       * an inference pipeline, a unique name is automatically assigned based on the position of the
       * `ContainerDefinition` in the pipeline. If you specify a value for the `ContainerHostName` for
       * any `ContainerDefinition` that is part of an inference pipeline, you must specify a value for
       * the `ContainerHostName` parameter of every `ContainerDefinition` in that pipeline.
       */
      public fun containerHostname(containerHostname: String)

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the `Environment` string to string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      public fun environment(environment: Any)

      /**
       * @param image The path where inference code is stored.
       * This can be either in Amazon EC2 Container Registry or in a Docker registry that is
       * accessible from the same VPC that you configure for your endpoint. If you are using your own
       * custom algorithm instead of an algorithm provided by SageMaker, the inference code must meet
       * SageMaker requirements. SageMaker supports both `registry/repository[:tag]` and
       * `registry/repository[&#64;digest]` image path formats. For more information, see [Using Your
       * Own Algorithms with Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html) .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       */
      public fun image(image: String)

      /**
       * @param imageConfig Specifies whether the model container is in Amazon ECR or a private
       * Docker registry accessible from your Amazon Virtual Private Cloud (VPC).
       * For information about storing containers in a private Docker registry, see [Use a Private
       * Docker Registry for Real-Time Inference
       * Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
       * .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       */
      public fun imageConfig(imageConfig: IResolvable)

      /**
       * @param imageConfig Specifies whether the model container is in Amazon ECR or a private
       * Docker registry accessible from your Amazon Virtual Private Cloud (VPC).
       * For information about storing containers in a private Docker registry, see [Use a Private
       * Docker Registry for Real-Time Inference
       * Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
       * .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       */
      public fun imageConfig(imageConfig: ImageConfigProperty)

      /**
       * @param imageConfig Specifies whether the model container is in Amazon ECR or a private
       * Docker registry accessible from your Amazon Virtual Private Cloud (VPC).
       * For information about storing containers in a private Docker registry, see [Use a Private
       * Docker Registry for Real-Time Inference
       * Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
       * .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a019b9b9cb0667f94d2660ce306e655ad37088d5831a6cf57be5ab3a087088d9")
      public fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit)

      /**
       * @param inferenceSpecificationName The inference specification name in the model package
       * version.
       */
      public fun inferenceSpecificationName(inferenceSpecificationName: String)

      /**
       * @param mode Whether the container hosts a single model or multiple models.
       */
      public fun mode(mode: String)

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy.
       *
       * Currently you cannot use `ModelDataSource` in conjunction with SageMaker batch transform,
       * SageMaker serverless endpoints, SageMaker multi-model endpoints, and SageMaker Marketplace.
       */
      public fun modelDataSource(modelDataSource: IResolvable)

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy.
       *
       * Currently you cannot use `ModelDataSource` in conjunction with SageMaker batch transform,
       * SageMaker serverless endpoints, SageMaker multi-model endpoints, and SageMaker Marketplace.
       */
      public fun modelDataSource(modelDataSource: ModelDataSourceProperty)

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy.
       *
       * Currently you cannot use `ModelDataSource` in conjunction with SageMaker batch transform,
       * SageMaker serverless endpoints, SageMaker multi-model endpoints, and SageMaker Marketplace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11986e307cbd4a71922aeecec723d99a0a6975ce902004868c9f96ced93dbe7")
      public fun modelDataSource(modelDataSource: ModelDataSourceProperty.Builder.() -> Unit)

      /**
       * @param modelDataUrl The S3 path where the model artifacts, which result from model
       * training, are stored.
       * This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path
       * is required for SageMaker built-in algorithms, but not if you use your own algorithms. For
       * more information on built-in algorithms, see [Common
       * Parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html)
       * .
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same region as the model or
       * endpoint you are creating.
       *
       *
       * If you provide a value for this parameter, SageMaker uses AWS Security Token Service to
       * download model artifacts from the S3 path you provide. AWS STS is activated in your AWS
       * account by default. If you previously deactivated AWS STS for a region, you need to reactivate
       * AWS STS for that region. For more information, see [Activating and Deactivating AWS STS in an
       * AWS
       * Region](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html)
       * in the *AWS Identity and Access Management User Guide* .
       *
       *
       * If you use a built-in algorithm to create a model, SageMaker requires that you provide a S3
       * path to the model artifacts in `ModelDataUrl` .
       */
      public fun modelDataUrl(modelDataUrl: String)

      /**
       * @param modelPackageName The name or Amazon Resource Name (ARN) of the model package to use
       * to create the model.
       */
      public fun modelPackageName(modelPackageName: String)

      /**
       * @param multiModelConfig Specifies additional configuration for multi-model endpoints.
       */
      public fun multiModelConfig(multiModelConfig: IResolvable)

      /**
       * @param multiModelConfig Specifies additional configuration for multi-model endpoints.
       */
      public fun multiModelConfig(multiModelConfig: MultiModelConfigProperty)

      /**
       * @param multiModelConfig Specifies additional configuration for multi-model endpoints.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12b6e96f54abd5fd57cad1f48fd46f1f9cd6c8ee315852f233e2edd926f4b2f1")
      public fun multiModelConfig(multiModelConfig: MultiModelConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.builder()

      /**
       * @param containerHostname This parameter is ignored for models that contain only a
       * `PrimaryContainer` .
       * When a `ContainerDefinition` is part of an inference pipeline, the value of the parameter
       * uniquely identifies the container for the purposes of logging and metrics. For information,
       * see [Use Logs and Metrics to Monitor an Inference
       * Pipeline](https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html)
       * . If you don't specify a value for this parameter for a `ContainerDefinition` that is part of
       * an inference pipeline, a unique name is automatically assigned based on the position of the
       * `ContainerDefinition` in the pipeline. If you specify a value for the `ContainerHostName` for
       * any `ContainerDefinition` that is part of an inference pipeline, you must specify a value for
       * the `ContainerHostName` parameter of every `ContainerDefinition` in that pipeline.
       */
      override fun containerHostname(containerHostname: String) {
        cdkBuilder.containerHostname(containerHostname)
      }

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the `Environment` string to string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      override fun environment(environment: Any) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param image The path where inference code is stored.
       * This can be either in Amazon EC2 Container Registry or in a Docker registry that is
       * accessible from the same VPC that you configure for your endpoint. If you are using your own
       * custom algorithm instead of an algorithm provided by SageMaker, the inference code must meet
       * SageMaker requirements. SageMaker supports both `registry/repository[:tag]` and
       * `registry/repository[&#64;digest]` image path formats. For more information, see [Using Your
       * Own Algorithms with Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html) .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param imageConfig Specifies whether the model container is in Amazon ECR or a private
       * Docker registry accessible from your Amazon Virtual Private Cloud (VPC).
       * For information about storing containers in a private Docker registry, see [Use a Private
       * Docker Registry for Real-Time Inference
       * Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
       * .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       */
      override fun imageConfig(imageConfig: IResolvable) {
        cdkBuilder.imageConfig(imageConfig.let(IResolvable::unwrap))
      }

      /**
       * @param imageConfig Specifies whether the model container is in Amazon ECR or a private
       * Docker registry accessible from your Amazon Virtual Private Cloud (VPC).
       * For information about storing containers in a private Docker registry, see [Use a Private
       * Docker Registry for Real-Time Inference
       * Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
       * .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       */
      override fun imageConfig(imageConfig: ImageConfigProperty) {
        cdkBuilder.imageConfig(imageConfig.let(ImageConfigProperty::unwrap))
      }

      /**
       * @param imageConfig Specifies whether the model container is in Amazon ECR or a private
       * Docker registry accessible from your Amazon Virtual Private Cloud (VPC).
       * For information about storing containers in a private Docker registry, see [Use a Private
       * Docker Registry for Real-Time Inference
       * Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
       * .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a019b9b9cb0667f94d2660ce306e655ad37088d5831a6cf57be5ab3a087088d9")
      override fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit): Unit =
          imageConfig(ImageConfigProperty(imageConfig))

      /**
       * @param inferenceSpecificationName The inference specification name in the model package
       * version.
       */
      override fun inferenceSpecificationName(inferenceSpecificationName: String) {
        cdkBuilder.inferenceSpecificationName(inferenceSpecificationName)
      }

      /**
       * @param mode Whether the container hosts a single model or multiple models.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy.
       *
       * Currently you cannot use `ModelDataSource` in conjunction with SageMaker batch transform,
       * SageMaker serverless endpoints, SageMaker multi-model endpoints, and SageMaker Marketplace.
       */
      override fun modelDataSource(modelDataSource: IResolvable) {
        cdkBuilder.modelDataSource(modelDataSource.let(IResolvable::unwrap))
      }

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy.
       *
       * Currently you cannot use `ModelDataSource` in conjunction with SageMaker batch transform,
       * SageMaker serverless endpoints, SageMaker multi-model endpoints, and SageMaker Marketplace.
       */
      override fun modelDataSource(modelDataSource: ModelDataSourceProperty) {
        cdkBuilder.modelDataSource(modelDataSource.let(ModelDataSourceProperty::unwrap))
      }

      /**
       * @param modelDataSource Specifies the location of ML model data to deploy.
       *
       * Currently you cannot use `ModelDataSource` in conjunction with SageMaker batch transform,
       * SageMaker serverless endpoints, SageMaker multi-model endpoints, and SageMaker Marketplace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a11986e307cbd4a71922aeecec723d99a0a6975ce902004868c9f96ced93dbe7")
      override fun modelDataSource(modelDataSource: ModelDataSourceProperty.Builder.() -> Unit):
          Unit = modelDataSource(ModelDataSourceProperty(modelDataSource))

      /**
       * @param modelDataUrl The S3 path where the model artifacts, which result from model
       * training, are stored.
       * This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path
       * is required for SageMaker built-in algorithms, but not if you use your own algorithms. For
       * more information on built-in algorithms, see [Common
       * Parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html)
       * .
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same region as the model or
       * endpoint you are creating.
       *
       *
       * If you provide a value for this parameter, SageMaker uses AWS Security Token Service to
       * download model artifacts from the S3 path you provide. AWS STS is activated in your AWS
       * account by default. If you previously deactivated AWS STS for a region, you need to reactivate
       * AWS STS for that region. For more information, see [Activating and Deactivating AWS STS in an
       * AWS
       * Region](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html)
       * in the *AWS Identity and Access Management User Guide* .
       *
       *
       * If you use a built-in algorithm to create a model, SageMaker requires that you provide a S3
       * path to the model artifacts in `ModelDataUrl` .
       */
      override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      /**
       * @param modelPackageName The name or Amazon Resource Name (ARN) of the model package to use
       * to create the model.
       */
      override fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
      }

      /**
       * @param multiModelConfig Specifies additional configuration for multi-model endpoints.
       */
      override fun multiModelConfig(multiModelConfig: IResolvable) {
        cdkBuilder.multiModelConfig(multiModelConfig.let(IResolvable::unwrap))
      }

      /**
       * @param multiModelConfig Specifies additional configuration for multi-model endpoints.
       */
      override fun multiModelConfig(multiModelConfig: MultiModelConfigProperty) {
        cdkBuilder.multiModelConfig(multiModelConfig.let(MultiModelConfigProperty::unwrap))
      }

      /**
       * @param multiModelConfig Specifies additional configuration for multi-model endpoints.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12b6e96f54abd5fd57cad1f48fd46f1f9cd6c8ee315852f233e2edd926f4b2f1")
      override fun multiModelConfig(multiModelConfig: MultiModelConfigProperty.Builder.() -> Unit):
          Unit = multiModelConfig(MultiModelConfigProperty(multiModelConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty,
    ) : ContainerDefinitionProperty {
      /**
       * This parameter is ignored for models that contain only a `PrimaryContainer` .
       *
       * When a `ContainerDefinition` is part of an inference pipeline, the value of the parameter
       * uniquely identifies the container for the purposes of logging and metrics. For information,
       * see [Use Logs and Metrics to Monitor an Inference
       * Pipeline](https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html)
       * . If you don't specify a value for this parameter for a `ContainerDefinition` that is part of
       * an inference pipeline, a unique name is automatically assigned based on the position of the
       * `ContainerDefinition` in the pipeline. If you specify a value for the `ContainerHostName` for
       * any `ContainerDefinition` that is part of an inference pipeline, you must specify a value for
       * the `ContainerHostName` parameter of every `ContainerDefinition` in that pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname)
       */
      override fun containerHostname(): String? = unwrap(this).getContainerHostname()

      /**
       * The environment variables to set in the Docker container.
       *
       * Each key and value in the `Environment` string to string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The path where inference code is stored.
       *
       * This can be either in Amazon EC2 Container Registry or in a Docker registry that is
       * accessible from the same VPC that you configure for your endpoint. If you are using your own
       * custom algorithm instead of an algorithm provided by SageMaker, the inference code must meet
       * SageMaker requirements. SageMaker supports both `registry/repository[:tag]` and
       * `registry/repository[&#64;digest]` image path formats. For more information, see [Using Your
       * Own Algorithms with Amazon
       * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html) .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image)
       */
      override fun image(): String? = unwrap(this).getImage()

      /**
       * Specifies whether the model container is in Amazon ECR or a private Docker registry
       * accessible from your Amazon Virtual Private Cloud (VPC).
       *
       * For information about storing containers in a private Docker registry, see [Use a Private
       * Docker Registry for Real-Time Inference
       * Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
       * .
       *
       *
       * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
       * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
       * creating.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-imageconfig)
       */
      override fun imageConfig(): Any? = unwrap(this).getImageConfig()

      /**
       * The inference specification name in the model package version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-inferencespecificationname)
       */
      override fun inferenceSpecificationName(): String? =
          unwrap(this).getInferenceSpecificationName()

      /**
       * Whether the container hosts a single model or multiple models.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()

      /**
       * Specifies the location of ML model data to deploy.
       *
       *
       * Currently you cannot use `ModelDataSource` in conjunction with SageMaker batch transform,
       * SageMaker serverless endpoints, SageMaker multi-model endpoints, and SageMaker Marketplace.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldatasource)
       */
      override fun modelDataSource(): Any? = unwrap(this).getModelDataSource()

      /**
       * The S3 path where the model artifacts, which result from model training, are stored.
       *
       * This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path
       * is required for SageMaker built-in algorithms, but not if you use your own algorithms. For
       * more information on built-in algorithms, see [Common
       * Parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html)
       * .
       *
       *
       * The model artifacts must be in an S3 bucket that is in the same region as the model or
       * endpoint you are creating.
       *
       *
       * If you provide a value for this parameter, SageMaker uses AWS Security Token Service to
       * download model artifacts from the S3 path you provide. AWS STS is activated in your AWS
       * account by default. If you previously deactivated AWS STS for a region, you need to reactivate
       * AWS STS for that region. For more information, see [Activating and Deactivating AWS STS in an
       * AWS
       * Region](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html)
       * in the *AWS Identity and Access Management User Guide* .
       *
       *
       * If you use a built-in algorithm to create a model, SageMaker requires that you provide a S3
       * path to the model artifacts in `ModelDataUrl` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl)
       */
      override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

      /**
       * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modelpackagename)
       */
      override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

      /**
       * Specifies additional configuration for multi-model endpoints.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-multimodelconfig)
       */
      override fun multiModelConfig(): Any? = unwrap(this).getMultiModelConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty):
          ContainerDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ImageConfigProperty {
    /**
     * Set this to one of the following values:.
     *
     * * `Platform` - The model image is hosted in Amazon ECR.
     * * `Vpc` - The model image is hosted in a private Docker registry in your VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-imageconfig.html#cfn-sagemaker-model-imageconfig-repositoryaccessmode)
     */
    public fun repositoryAccessMode(): String

    /**
     * (Optional) Specifies an authentication configuration for the private docker registry where
     * your model image is hosted.
     *
     * Specify a value for this property only if you specified `Vpc` as the value for the
     * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
     * requires authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-imageconfig.html#cfn-sagemaker-model-imageconfig-repositoryauthconfig)
     */
    public fun repositoryAuthConfig(): Any? = unwrap(this).getRepositoryAuthConfig()

    /**
     * A builder for [ImageConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param repositoryAccessMode Set this to one of the following values:. 
       * * `Platform` - The model image is hosted in Amazon ECR.
       * * `Vpc` - The model image is hosted in a private Docker registry in your VPC.
       */
      public fun repositoryAccessMode(repositoryAccessMode: String)

      /**
       * @param repositoryAuthConfig (Optional) Specifies an authentication configuration for the
       * private docker registry where your model image is hosted.
       * Specify a value for this property only if you specified `Vpc` as the value for the
       * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
       * requires authentication.
       */
      public fun repositoryAuthConfig(repositoryAuthConfig: IResolvable)

      /**
       * @param repositoryAuthConfig (Optional) Specifies an authentication configuration for the
       * private docker registry where your model image is hosted.
       * Specify a value for this property only if you specified `Vpc` as the value for the
       * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
       * requires authentication.
       */
      public fun repositoryAuthConfig(repositoryAuthConfig: RepositoryAuthConfigProperty)

      /**
       * @param repositoryAuthConfig (Optional) Specifies an authentication configuration for the
       * private docker registry where your model image is hosted.
       * Specify a value for this property only if you specified `Vpc` as the value for the
       * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
       * requires authentication.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b6556dde91f4c6adedaecaa4eec4b70580f0a032691abc2c6456874da281405")
      public
          fun repositoryAuthConfig(repositoryAuthConfig: RepositoryAuthConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty.builder()

      /**
       * @param repositoryAccessMode Set this to one of the following values:. 
       * * `Platform` - The model image is hosted in Amazon ECR.
       * * `Vpc` - The model image is hosted in a private Docker registry in your VPC.
       */
      override fun repositoryAccessMode(repositoryAccessMode: String) {
        cdkBuilder.repositoryAccessMode(repositoryAccessMode)
      }

      /**
       * @param repositoryAuthConfig (Optional) Specifies an authentication configuration for the
       * private docker registry where your model image is hosted.
       * Specify a value for this property only if you specified `Vpc` as the value for the
       * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
       * requires authentication.
       */
      override fun repositoryAuthConfig(repositoryAuthConfig: IResolvable) {
        cdkBuilder.repositoryAuthConfig(repositoryAuthConfig.let(IResolvable::unwrap))
      }

      /**
       * @param repositoryAuthConfig (Optional) Specifies an authentication configuration for the
       * private docker registry where your model image is hosted.
       * Specify a value for this property only if you specified `Vpc` as the value for the
       * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
       * requires authentication.
       */
      override fun repositoryAuthConfig(repositoryAuthConfig: RepositoryAuthConfigProperty) {
        cdkBuilder.repositoryAuthConfig(repositoryAuthConfig.let(RepositoryAuthConfigProperty::unwrap))
      }

      /**
       * @param repositoryAuthConfig (Optional) Specifies an authentication configuration for the
       * private docker registry where your model image is hosted.
       * Specify a value for this property only if you specified `Vpc` as the value for the
       * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
       * requires authentication.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b6556dde91f4c6adedaecaa4eec4b70580f0a032691abc2c6456874da281405")
      override
          fun repositoryAuthConfig(repositoryAuthConfig: RepositoryAuthConfigProperty.Builder.() -> Unit):
          Unit = repositoryAuthConfig(RepositoryAuthConfigProperty(repositoryAuthConfig))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty,
    ) : ImageConfigProperty {
      /**
       * Set this to one of the following values:.
       *
       * * `Platform` - The model image is hosted in Amazon ECR.
       * * `Vpc` - The model image is hosted in a private Docker registry in your VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-imageconfig.html#cfn-sagemaker-model-imageconfig-repositoryaccessmode)
       */
      override fun repositoryAccessMode(): String = unwrap(this).getRepositoryAccessMode()

      /**
       * (Optional) Specifies an authentication configuration for the private docker registry where
       * your model image is hosted.
       *
       * Specify a value for this property only if you specified `Vpc` as the value for the
       * `RepositoryAccessMode` field, and the private Docker registry where the model image is hosted
       * requires authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-imageconfig.html#cfn-sagemaker-model-imageconfig-repositoryauthconfig)
       */
      override fun repositoryAuthConfig(): Any? = unwrap(this).getRepositoryAuthConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty):
          ImageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InferenceExecutionConfigProperty {
    /**
     * How containers in a multi-container are run. The following values are valid.
     *
     * * `Serial` - Containers run as a serial pipeline.
     * * `Direct` - Only the individual container that you specify is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-inferenceexecutionconfig.html#cfn-sagemaker-model-inferenceexecutionconfig-mode)
     */
    public fun mode(): String

    /**
     * A builder for [InferenceExecutionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode How containers in a multi-container are run. The following values are valid. 
       * * `Serial` - Containers run as a serial pipeline.
       * * `Direct` - Only the individual container that you specify is run.
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty.builder()

      /**
       * @param mode How containers in a multi-container are run. The following values are valid. 
       * * `Serial` - Containers run as a serial pipeline.
       * * `Direct` - Only the individual container that you specify is run.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty,
    ) : InferenceExecutionConfigProperty {
      /**
       * How containers in a multi-container are run. The following values are valid.
       *
       * * `Serial` - Containers run as a serial pipeline.
       * * `Direct` - Only the individual container that you specify is run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-inferenceexecutionconfig.html#cfn-sagemaker-model-inferenceexecutionconfig-mode)
       */
      override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceExecutionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty):
          InferenceExecutionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceExecutionConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RepositoryAuthConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of an AWS Lambda function that provides credentials to
     * authenticate to the private Docker registry where your model image is hosted.
     *
     * For information about how to create an AWS Lambda function, see [Create a Lambda function
     * with the
     * console](https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html) in
     * the *AWS Lambda Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-repositoryauthconfig.html#cfn-sagemaker-model-repositoryauthconfig-repositorycredentialsproviderarn)
     */
    public fun repositoryCredentialsProviderArn(): String

    /**
     * A builder for [RepositoryAuthConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param repositoryCredentialsProviderArn The Amazon Resource Name (ARN) of an AWS Lambda
       * function that provides credentials to authenticate to the private Docker registry where your
       * model image is hosted. 
       * For information about how to create an AWS Lambda function, see [Create a Lambda function
       * with the
       * console](https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html) in
       * the *AWS Lambda Developer Guide* .
       */
      public fun repositoryCredentialsProviderArn(repositoryCredentialsProviderArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty.builder()

      /**
       * @param repositoryCredentialsProviderArn The Amazon Resource Name (ARN) of an AWS Lambda
       * function that provides credentials to authenticate to the private Docker registry where your
       * model image is hosted. 
       * For information about how to create an AWS Lambda function, see [Create a Lambda function
       * with the
       * console](https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html) in
       * the *AWS Lambda Developer Guide* .
       */
      override fun repositoryCredentialsProviderArn(repositoryCredentialsProviderArn: String) {
        cdkBuilder.repositoryCredentialsProviderArn(repositoryCredentialsProviderArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty,
    ) : RepositoryAuthConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of an AWS Lambda function that provides credentials to
       * authenticate to the private Docker registry where your model image is hosted.
       *
       * For information about how to create an AWS Lambda function, see [Create a Lambda function
       * with the
       * console](https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html) in
       * the *AWS Lambda Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-repositoryauthconfig.html#cfn-sagemaker-model-repositoryauthconfig-repositorycredentialsproviderarn)
       */
      override fun repositoryCredentialsProviderArn(): String =
          unwrap(this).getRepositoryCredentialsProviderArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryAuthConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty):
          RepositoryAuthConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryAuthConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ModelAccessConfigProperty {
    /**
     * Specifies agreement to the model end-user license agreement (EULA).
     *
     * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA that
     * this model requires. You are responsible for reviewing and complying with any applicable license
     * terms and making sure they are acceptable for your use case before downloading or using a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-modelaccessconfig.html#cfn-sagemaker-model-modelaccessconfig-accepteula)
     */
    public fun acceptEula(): Any

    /**
     * A builder for [ModelAccessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). 
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      public fun acceptEula(acceptEula: Boolean)

      /**
       * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). 
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      public fun acceptEula(acceptEula: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty.builder()

      /**
       * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). 
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      override fun acceptEula(acceptEula: Boolean) {
        cdkBuilder.acceptEula(acceptEula)
      }

      /**
       * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). 
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       */
      override fun acceptEula(acceptEula: IResolvable) {
        cdkBuilder.acceptEula(acceptEula.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty,
    ) : ModelAccessConfigProperty {
      /**
       * Specifies agreement to the model end-user license agreement (EULA).
       *
       * The `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA
       * that this model requires. You are responsible for reviewing and complying with any applicable
       * license terms and making sure they are acceptable for your use case before downloading or
       * using a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-modelaccessconfig.html#cfn-sagemaker-model-modelaccessconfig-accepteula)
       */
      override fun acceptEula(): Any = unwrap(this).getAcceptEula()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelAccessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty):
          ModelAccessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelAccessConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModel.ModelAccessConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
