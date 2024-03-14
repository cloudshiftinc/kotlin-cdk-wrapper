package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNotebookInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook instance.
   */
  public open fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
      emptyList()

  /**
   * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook instance.
   */
  public open fun acceleratorTypes(`value`: List<String>) {
    unwrap(this).setAcceleratorTypes(`value`)
  }

  /**
   * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook instance.
   */
  public open fun acceleratorTypes(vararg `value`: String): Unit =
      acceleratorTypes(`value`.toList())

  /**
   * An array of up to three Git repositories associated with the notebook instance.
   */
  public open fun additionalCodeRepositories(): List<String> =
      unwrap(this).getAdditionalCodeRepositories() ?: emptyList()

  /**
   * An array of up to three Git repositories associated with the notebook instance.
   */
  public open fun additionalCodeRepositories(`value`: List<String>) {
    unwrap(this).setAdditionalCodeRepositories(`value`)
  }

  /**
   * An array of up to three Git repositories associated with the notebook instance.
   */
  public open fun additionalCodeRepositories(vararg `value`: String): Unit =
      additionalCodeRepositories(`value`.toList())

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the notebook instance, such as `MyNotebookInstance` .
   */
  public open fun attrNotebookInstanceName(): String = unwrap(this).getAttrNotebookInstanceName()

  /**
   * The Git repository associated with the notebook instance as its default code repository.
   */
  public open fun defaultCodeRepository(): String? = unwrap(this).getDefaultCodeRepository()

  /**
   * The Git repository associated with the notebook instance as its default code repository.
   */
  public open fun defaultCodeRepository(`value`: String) {
    unwrap(this).setDefaultCodeRepository(`value`)
  }

  /**
   * Sets whether SageMaker provides internet access to the notebook instance.
   */
  public open fun directInternetAccess(): String? = unwrap(this).getDirectInternetAccess()

  /**
   * Sets whether SageMaker provides internet access to the notebook instance.
   */
  public open fun directInternetAccess(`value`: String) {
    unwrap(this).setDirectInternetAccess(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Information on the IMDS configuration of the notebook instance.
   */
  public open fun instanceMetadataServiceConfiguration(): Any? =
      unwrap(this).getInstanceMetadataServiceConfiguration()

  /**
   * Information on the IMDS configuration of the notebook instance.
   */
  public open fun instanceMetadataServiceConfiguration(`value`: IResolvable) {
    unwrap(this).setInstanceMetadataServiceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information on the IMDS configuration of the notebook instance.
   */
  public open
      fun instanceMetadataServiceConfiguration(`value`: InstanceMetadataServiceConfigurationProperty) {
    unwrap(this).setInstanceMetadataServiceConfiguration(`value`.let(InstanceMetadataServiceConfigurationProperty::unwrap))
  }

  /**
   * Information on the IMDS configuration of the notebook instance.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5a654bf445f32c7dad3090c266d5d28ed405877f27b7f291154b5cec706e8970")
  public open
      fun instanceMetadataServiceConfiguration(`value`: InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit):
      Unit =
      instanceMetadataServiceConfiguration(InstanceMetadataServiceConfigurationProperty(`value`))

  /**
   * The type of ML compute instance to launch for the notebook instance.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The type of ML compute instance to launch for the notebook instance.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of a AWS Key Management Service key that SageMaker uses to
   * encrypt data on the storage volume attached to your notebook instance.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The Amazon Resource Name (ARN) of a AWS Key Management Service key that SageMaker uses to
   * encrypt data on the storage volume attached to your notebook instance.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The name of a lifecycle configuration to associate with the notebook instance.
   */
  public open fun lifecycleConfigName(): String? = unwrap(this).getLifecycleConfigName()

  /**
   * The name of a lifecycle configuration to associate with the notebook instance.
   */
  public open fun lifecycleConfigName(`value`: String) {
    unwrap(this).setLifecycleConfigName(`value`)
  }

  /**
   * The name of the new notebook instance.
   */
  public open fun notebookInstanceName(): String? = unwrap(this).getNotebookInstanceName()

  /**
   * The name of the new notebook instance.
   */
  public open fun notebookInstanceName(`value`: String) {
    unwrap(this).setNotebookInstanceName(`value`)
  }

  /**
   * The platform identifier of the notebook instance runtime environment.
   */
  public open fun platformIdentifier(): String? = unwrap(this).getPlatformIdentifier()

  /**
   * The platform identifier of the notebook instance runtime environment.
   */
  public open fun platformIdentifier(`value`: String) {
    unwrap(this).setPlatformIdentifier(`value`)
  }

  /**
   * When you send any requests to AWS resources from the notebook instance, SageMaker assumes this
   * role to perform tasks on your behalf.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * When you send any requests to AWS resources from the notebook instance, SageMaker assumes this
   * role to perform tasks on your behalf.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Whether root access is enabled or disabled for users of the notebook instance.
   *
   * The default value is `Enabled` .
   */
  public open fun rootAccess(): String? = unwrap(this).getRootAccess()

  /**
   * Whether root access is enabled or disabled for users of the notebook instance.
   *
   * The default value is `Enabled` .
   */
  public open fun rootAccess(`value`: String) {
    unwrap(this).setRootAccess(`value`)
  }

  /**
   * The VPC security group IDs, in the form sg-xxxxxxxx.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The VPC security group IDs, in the form sg-xxxxxxxx.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The VPC security group IDs, in the form sg-xxxxxxxx.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML
   * compute instance.
   */
  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML
   * compute instance.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

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
   * The size, in GB, of the ML storage volume to attach to the notebook instance.
   */
  public open fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()

  /**
   * The size, in GB, of the ML storage volume to attach to the notebook instance.
   */
  public open fun volumeSizeInGb(`value`: Number) {
    unwrap(this).setVolumeSizeInGb(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnNotebookInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook
     * instance.
     *
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-acceleratortypes)
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     * with the notebook instance. 
     */
    public fun acceleratorTypes(acceleratorTypes: List<String>)

    /**
     * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook
     * instance.
     *
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-acceleratortypes)
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     * with the notebook instance. 
     */
    public fun acceleratorTypes(vararg acceleratorTypes: String)

    /**
     * An array of up to three Git repositories associated with the notebook instance.
     *
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. These repositories are cloned at the same level as the default repository
     * of your notebook instance. For more information, see [Associating Git Repositories with
     * SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-additionalcoderepositories)
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     * the notebook instance. 
     */
    public fun additionalCodeRepositories(additionalCodeRepositories: List<String>)

    /**
     * An array of up to three Git repositories associated with the notebook instance.
     *
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. These repositories are cloned at the same level as the default repository
     * of your notebook instance. For more information, see [Associating Git Repositories with
     * SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-additionalcoderepositories)
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     * the notebook instance. 
     */
    public fun additionalCodeRepositories(vararg additionalCodeRepositories: String)

    /**
     * The Git repository associated with the notebook instance as its default code repository.
     *
     * This can be either the name of a Git repository stored as a resource in your account, or the
     * URL of a Git repository in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. When you open a notebook instance, it opens in the directory that contains
     * this repository. For more information, see [Associating Git Repositories with SageMaker Notebook
     * Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-defaultcoderepository)
     * @param defaultCodeRepository The Git repository associated with the notebook instance as its
     * default code repository. 
     */
    public fun defaultCodeRepository(defaultCodeRepository: String)

    /**
     * Sets whether SageMaker provides internet access to the notebook instance.
     *
     * If you set this to `Disabled` this notebook instance is able to access resources only in your
     * VPC, and is not be able to connect to SageMaker training and endpoint services unless you
     * configure a NAT Gateway in your VPC.
     *
     * For more information, see [Notebook Instances Are Internet-Enabled by
     * Default](https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access)
     * . You can set the value of this parameter to `Disabled` only if you set a value for the
     * `SubnetId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-directinternetaccess)
     * @param directInternetAccess Sets whether SageMaker provides internet access to the notebook
     * instance. 
     */
    public fun directInternetAccess(directInternetAccess: String)

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance. 
     */
    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: IResolvable)

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance. 
     */
    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: InstanceMetadataServiceConfigurationProperty)

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b053446600724a418f0f24fc84443bf425e028cfacad0c06880bafcbd6a26f5")
    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit)

    /**
     * The type of ML compute instance to launch for the notebook instance.
     *
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancetype)
     * @param instanceType The type of ML compute instance to launch for the notebook instance. 
     */
    public fun instanceType(instanceType: String)

    /**
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that SageMaker uses to
     * encrypt data on the storage volume attached to your notebook instance.
     *
     * The KMS key you provide must be enabled. For information, see [Enabling and Disabling
     * Keys](https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-kmskeyid)
     * @param kmsKeyId The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * SageMaker uses to encrypt data on the storage volume attached to your notebook instance. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The name of a lifecycle configuration to associate with the notebook instance.
     *
     * For information about lifecycle configurations, see [Customize a Notebook
     * Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html) in the
     * *Amazon SageMaker Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-lifecycleconfigname)
     * @param lifecycleConfigName The name of a lifecycle configuration to associate with the
     * notebook instance. 
     */
    public fun lifecycleConfigName(lifecycleConfigName: String)

    /**
     * The name of the new notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-notebookinstancename)
     * @param notebookInstanceName The name of the new notebook instance. 
     */
    public fun notebookInstanceName(notebookInstanceName: String)

    /**
     * The platform identifier of the notebook instance runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-platformidentifier)
     * @param platformIdentifier The platform identifier of the notebook instance runtime
     * environment. 
     */
    public fun platformIdentifier(platformIdentifier: String)

    /**
     * When you send any requests to AWS resources from the notebook instance, SageMaker assumes
     * this role to perform tasks on your behalf.
     *
     * You must grant this role necessary permissions so SageMaker can perform these tasks. The
     * policy must allow the SageMaker service principal (sagemaker.amazonaws.com) permissions to
     * assume this role. For more information, see [SageMaker
     * Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
     *
     *
     * To be able to pass this role to SageMaker, the caller of this API must have the
     * `iam:PassRole` permission.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-rolearn)
     * @param roleArn When you send any requests to AWS resources from the notebook instance,
     * SageMaker assumes this role to perform tasks on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Whether root access is enabled or disabled for users of the notebook instance. The default
     * value is `Enabled` .
     *
     *
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because
     * of this, lifecycle configurations associated with a notebook instance always run with root
     * access even if you disable root access for users.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-rootaccess)
     * @param rootAccess Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is `Enabled` . 
     */
    public fun rootAccess(rootAccess: String)

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx.
     *
     * The security groups must be for the same VPC as specified in the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-securitygroupids)
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx.
     *
     * The security groups must be for the same VPC as specified in the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-securitygroupids)
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML
     * compute instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-subnetid)
     * @param subnetId The ID of the subnet in a VPC to which you would like to have a connectivity
     * from your ML compute instance. 
     */
    public fun subnetId(subnetId: String)

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-tags)
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
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-tags)
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The size, in GB, of the ML storage volume to attach to the notebook instance.
     *
     * The default value is 5 GB.
     *
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-volumesizeingb)
     * @param volumeSizeInGb The size, in GB, of the ML storage volume to attach to the notebook
     * instance. 
     */
    public fun volumeSizeInGb(volumeSizeInGb: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.Builder =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.Builder.create(scope, id)

    /**
     * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook
     * instance.
     *
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-acceleratortypes)
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     * with the notebook instance. 
     */
    override fun acceleratorTypes(acceleratorTypes: List<String>) {
      cdkBuilder.acceleratorTypes(acceleratorTypes)
    }

    /**
     * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook
     * instance.
     *
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-acceleratortypes)
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     * with the notebook instance. 
     */
    override fun acceleratorTypes(vararg acceleratorTypes: String): Unit =
        acceleratorTypes(acceleratorTypes.toList())

    /**
     * An array of up to three Git repositories associated with the notebook instance.
     *
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. These repositories are cloned at the same level as the default repository
     * of your notebook instance. For more information, see [Associating Git Repositories with
     * SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-additionalcoderepositories)
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     * the notebook instance. 
     */
    override fun additionalCodeRepositories(additionalCodeRepositories: List<String>) {
      cdkBuilder.additionalCodeRepositories(additionalCodeRepositories)
    }

    /**
     * An array of up to three Git repositories associated with the notebook instance.
     *
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. These repositories are cloned at the same level as the default repository
     * of your notebook instance. For more information, see [Associating Git Repositories with
     * SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-additionalcoderepositories)
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     * the notebook instance. 
     */
    override fun additionalCodeRepositories(vararg additionalCodeRepositories: String): Unit =
        additionalCodeRepositories(additionalCodeRepositories.toList())

    /**
     * The Git repository associated with the notebook instance as its default code repository.
     *
     * This can be either the name of a Git repository stored as a resource in your account, or the
     * URL of a Git repository in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. When you open a notebook instance, it opens in the directory that contains
     * this repository. For more information, see [Associating Git Repositories with SageMaker Notebook
     * Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-defaultcoderepository)
     * @param defaultCodeRepository The Git repository associated with the notebook instance as its
     * default code repository. 
     */
    override fun defaultCodeRepository(defaultCodeRepository: String) {
      cdkBuilder.defaultCodeRepository(defaultCodeRepository)
    }

    /**
     * Sets whether SageMaker provides internet access to the notebook instance.
     *
     * If you set this to `Disabled` this notebook instance is able to access resources only in your
     * VPC, and is not be able to connect to SageMaker training and endpoint services unless you
     * configure a NAT Gateway in your VPC.
     *
     * For more information, see [Notebook Instances Are Internet-Enabled by
     * Default](https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access)
     * . You can set the value of this parameter to `Disabled` only if you set a value for the
     * `SubnetId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-directinternetaccess)
     * @param directInternetAccess Sets whether SageMaker provides internet access to the notebook
     * instance. 
     */
    override fun directInternetAccess(directInternetAccess: String) {
      cdkBuilder.directInternetAccess(directInternetAccess)
    }

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance. 
     */
    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: IResolvable) {
      cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance. 
     */
    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: InstanceMetadataServiceConfigurationProperty) {
      cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration.let(InstanceMetadataServiceConfigurationProperty::unwrap))
    }

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b053446600724a418f0f24fc84443bf425e028cfacad0c06880bafcbd6a26f5")
    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceMetadataServiceConfiguration(InstanceMetadataServiceConfigurationProperty(instanceMetadataServiceConfiguration))

    /**
     * The type of ML compute instance to launch for the notebook instance.
     *
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancetype)
     * @param instanceType The type of ML compute instance to launch for the notebook instance. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that SageMaker uses to
     * encrypt data on the storage volume attached to your notebook instance.
     *
     * The KMS key you provide must be enabled. For information, see [Enabling and Disabling
     * Keys](https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-kmskeyid)
     * @param kmsKeyId The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * SageMaker uses to encrypt data on the storage volume attached to your notebook instance. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of a lifecycle configuration to associate with the notebook instance.
     *
     * For information about lifecycle configurations, see [Customize a Notebook
     * Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html) in the
     * *Amazon SageMaker Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-lifecycleconfigname)
     * @param lifecycleConfigName The name of a lifecycle configuration to associate with the
     * notebook instance. 
     */
    override fun lifecycleConfigName(lifecycleConfigName: String) {
      cdkBuilder.lifecycleConfigName(lifecycleConfigName)
    }

    /**
     * The name of the new notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-notebookinstancename)
     * @param notebookInstanceName The name of the new notebook instance. 
     */
    override fun notebookInstanceName(notebookInstanceName: String) {
      cdkBuilder.notebookInstanceName(notebookInstanceName)
    }

    /**
     * The platform identifier of the notebook instance runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-platformidentifier)
     * @param platformIdentifier The platform identifier of the notebook instance runtime
     * environment. 
     */
    override fun platformIdentifier(platformIdentifier: String) {
      cdkBuilder.platformIdentifier(platformIdentifier)
    }

    /**
     * When you send any requests to AWS resources from the notebook instance, SageMaker assumes
     * this role to perform tasks on your behalf.
     *
     * You must grant this role necessary permissions so SageMaker can perform these tasks. The
     * policy must allow the SageMaker service principal (sagemaker.amazonaws.com) permissions to
     * assume this role. For more information, see [SageMaker
     * Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
     *
     *
     * To be able to pass this role to SageMaker, the caller of this API must have the
     * `iam:PassRole` permission.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-rolearn)
     * @param roleArn When you send any requests to AWS resources from the notebook instance,
     * SageMaker assumes this role to perform tasks on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Whether root access is enabled or disabled for users of the notebook instance. The default
     * value is `Enabled` .
     *
     *
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because
     * of this, lifecycle configurations associated with a notebook instance always run with root
     * access even if you disable root access for users.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-rootaccess)
     * @param rootAccess Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is `Enabled` . 
     */
    override fun rootAccess(rootAccess: String) {
      cdkBuilder.rootAccess(rootAccess)
    }

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx.
     *
     * The security groups must be for the same VPC as specified in the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-securitygroupids)
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx.
     *
     * The security groups must be for the same VPC as specified in the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-securitygroupids)
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML
     * compute instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-subnetid)
     * @param subnetId The ID of the subnet in a VPC to which you would like to have a connectivity
     * from your ML compute instance. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-tags)
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
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-tags)
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The size, in GB, of the ML storage volume to attach to the notebook instance.
     *
     * The default value is 5 GB.
     *
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-volumesizeingb)
     * @param volumeSizeInGb The size, in GB, of the ML storage volume to attach to the notebook
     * instance. 
     */
    override fun volumeSizeInGb(volumeSizeInGb: Number) {
      cdkBuilder.volumeSizeInGb(volumeSizeInGb)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnNotebookInstance =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotebookInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotebookInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstance):
        CfnNotebookInstance = CfnNotebookInstance(cdkObject)

    internal fun unwrap(wrapped: CfnNotebookInstance):
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstance = wrapped.cdkObject
  }

  public interface InstanceMetadataServiceConfigurationProperty {
    /**
     * Indicates the minimum IMDS version that the notebook instance supports.
     *
     * When passed as part of `CreateNotebookInstance` , if no value is selected, then it defaults
     * to IMDSv1. This means that both IMDSv1 and IMDSv2 are supported. If passed as part of
     * `UpdateNotebookInstance` , there is no default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstance-instancemetadataserviceconfiguration.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration-minimuminstancemetadataserviceversion)
     */
    public fun minimumInstanceMetadataServiceVersion(): String

    /**
     * A builder for [InstanceMetadataServiceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param minimumInstanceMetadataServiceVersion Indicates the minimum IMDS version that the
       * notebook instance supports. 
       * When passed as part of `CreateNotebookInstance` , if no value is selected, then it defaults
       * to IMDSv1. This means that both IMDSv1 and IMDSv2 are supported. If passed as part of
       * `UpdateNotebookInstance` , there is no default.
       */
      public
          fun minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.builder()

      /**
       * @param minimumInstanceMetadataServiceVersion Indicates the minimum IMDS version that the
       * notebook instance supports. 
       * When passed as part of `CreateNotebookInstance` , if no value is selected, then it defaults
       * to IMDSv1. This means that both IMDSv1 and IMDSv2 are supported. If passed as part of
       * `UpdateNotebookInstance` , there is no default.
       */
      override
          fun minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion: String) {
        cdkBuilder.minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty,
    ) : CdkObject(cdkObject), InstanceMetadataServiceConfigurationProperty {
      /**
       * Indicates the minimum IMDS version that the notebook instance supports.
       *
       * When passed as part of `CreateNotebookInstance` , if no value is selected, then it defaults
       * to IMDSv1. This means that both IMDSv1 and IMDSv2 are supported. If passed as part of
       * `UpdateNotebookInstance` , there is no default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstance-instancemetadataserviceconfiguration.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration-minimuminstancemetadataserviceversion)
       */
      override fun minimumInstanceMetadataServiceVersion(): String =
          unwrap(this).getMinimumInstanceMetadataServiceVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceMetadataServiceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty):
          InstanceMetadataServiceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceMetadataServiceConfigurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty
    }
  }
}
