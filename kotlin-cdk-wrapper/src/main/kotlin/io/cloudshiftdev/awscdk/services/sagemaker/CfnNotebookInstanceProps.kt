@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnNotebookInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnNotebookInstanceProps cfnNotebookInstanceProps = CfnNotebookInstanceProps.builder()
 * .instanceType("instanceType")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .acceleratorTypes(List.of("acceleratorTypes"))
 * .additionalCodeRepositories(List.of("additionalCodeRepositories"))
 * .defaultCodeRepository("defaultCodeRepository")
 * .directInternetAccess("directInternetAccess")
 * .instanceMetadataServiceConfiguration(InstanceMetadataServiceConfigurationProperty.builder()
 * .minimumInstanceMetadataServiceVersion("minimumInstanceMetadataServiceVersion")
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .lifecycleConfigName("lifecycleConfigName")
 * .notebookInstanceName("notebookInstanceName")
 * .platformIdentifier("platformIdentifier")
 * .rootAccess("rootAccess")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetId("subnetId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .volumeSizeInGb(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html)
 */
public interface CfnNotebookInstanceProps {
  /**
   * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook instance.
   *
   * Currently, only one instance type can be associated with a notebook instance. For more
   * information, see [Using Elastic Inference in Amazon
   * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
   *
   * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
   * ml.eia2.large | ml.eia2.xlarge` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-acceleratortypes)
   */
  public fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?: emptyList()

  /**
   * An array of up to three Git repositories associated with the notebook instance.
   *
   * These can be either the names of Git repositories stored as resources in your account, or the
   * URL of Git repositories in [AWS
   * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other
   * Git repository. These repositories are cloned at the same level as the default repository of your
   * notebook instance. For more information, see [Associating Git Repositories with SageMaker Notebook
   * Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-additionalcoderepositories)
   */
  public fun additionalCodeRepositories(): List<String> =
      unwrap(this).getAdditionalCodeRepositories() ?: emptyList()

  /**
   * The Git repository associated with the notebook instance as its default code repository.
   *
   * This can be either the name of a Git repository stored as a resource in your account, or the
   * URL of a Git repository in [AWS
   * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other
   * Git repository. When you open a notebook instance, it opens in the directory that contains this
   * repository. For more information, see [Associating Git Repositories with SageMaker Notebook
   * Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-defaultcoderepository)
   */
  public fun defaultCodeRepository(): String? = unwrap(this).getDefaultCodeRepository()

  /**
   * Sets whether SageMaker provides internet access to the notebook instance.
   *
   * If you set this to `Disabled` this notebook instance is able to access resources only in your
   * VPC, and is not be able to connect to SageMaker training and endpoint services unless you
   * configure a NAT Gateway in your VPC.
   *
   * For more information, see [Notebook Instances Are Internet-Enabled by
   * Default](https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access)
   * . You can set the value of this parameter to `Disabled` only if you set a value for the `SubnetId`
   * parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-directinternetaccess)
   */
  public fun directInternetAccess(): String? = unwrap(this).getDirectInternetAccess()

  /**
   * Information on the IMDS configuration of the notebook instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
   */
  public fun instanceMetadataServiceConfiguration(): Any? =
      unwrap(this).getInstanceMetadataServiceConfiguration()

  /**
   * The type of ML compute instance to launch for the notebook instance.
   *
   *
   * Expect some interruption of service if this parameter is changed as CloudFormation stops a
   * notebook instance and starts it up again to update it.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancetype)
   */
  public fun instanceType(): String

  /**
   * The Amazon Resource Name (ARN) of a AWS Key Management Service key that SageMaker uses to
   * encrypt data on the storage volume attached to your notebook instance.
   *
   * The KMS key you provide must be enabled. For information, see [Enabling and Disabling
   * Keys](https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html) in the *AWS Key
   * Management Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The name of a lifecycle configuration to associate with the notebook instance.
   *
   * For information about lifecycle configurations, see [Customize a Notebook
   * Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html) in the
   * *Amazon SageMaker Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-lifecycleconfigname)
   */
  public fun lifecycleConfigName(): String? = unwrap(this).getLifecycleConfigName()

  /**
   * The name of the new notebook instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-notebookinstancename)
   */
  public fun notebookInstanceName(): String? = unwrap(this).getNotebookInstanceName()

  /**
   * The platform identifier of the notebook instance runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-platformidentifier)
   */
  public fun platformIdentifier(): String? = unwrap(this).getPlatformIdentifier()

  /**
   * When you send any requests to AWS resources from the notebook instance, SageMaker assumes this
   * role to perform tasks on your behalf.
   *
   * You must grant this role necessary permissions so SageMaker can perform these tasks. The policy
   * must allow the SageMaker service principal (sagemaker.amazonaws.com) permissions to assume this
   * role. For more information, see [SageMaker
   * Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
   *
   *
   * To be able to pass this role to SageMaker, the caller of this API must have the `iam:PassRole`
   * permission.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-rolearn)
   */
  public fun roleArn(): String

  /**
   * Whether root access is enabled or disabled for users of the notebook instance. The default
   * value is `Enabled` .
   *
   *
   * Lifecycle configurations need root access to be able to set up a notebook instance. Because of
   * this, lifecycle configurations associated with a notebook instance always run with root access
   * even if you disable root access for users.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-rootaccess)
   */
  public fun rootAccess(): String? = unwrap(this).getRootAccess()

  /**
   * The VPC security group IDs, in the form sg-xxxxxxxx.
   *
   * The security groups must be for the same VPC as specified in the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML
   * compute instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-subnetid)
   */
  public fun subnetId(): String? = unwrap(this).getSubnetId()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   */
  public fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()

  /**
   * A builder for [CfnNotebookInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     * with the notebook instance.
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     */
    public fun acceleratorTypes(acceleratorTypes: List<String>)

    /**
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     * with the notebook instance.
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     */
    public fun acceleratorTypes(vararg acceleratorTypes: String)

    /**
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     * the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. These repositories are cloned at the same level as the default repository
     * of your notebook instance. For more information, see [Associating Git Repositories with
     * SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     */
    public fun additionalCodeRepositories(additionalCodeRepositories: List<String>)

    /**
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     * the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. These repositories are cloned at the same level as the default repository
     * of your notebook instance. For more information, see [Associating Git Repositories with
     * SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     */
    public fun additionalCodeRepositories(vararg additionalCodeRepositories: String)

    /**
     * @param defaultCodeRepository The Git repository associated with the notebook instance as its
     * default code repository.
     * This can be either the name of a Git repository stored as a resource in your account, or the
     * URL of a Git repository in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. When you open a notebook instance, it opens in the directory that contains
     * this repository. For more information, see [Associating Git Repositories with SageMaker Notebook
     * Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html) .
     */
    public fun defaultCodeRepository(defaultCodeRepository: String)

    /**
     * @param directInternetAccess Sets whether SageMaker provides internet access to the notebook
     * instance.
     * If you set this to `Disabled` this notebook instance is able to access resources only in your
     * VPC, and is not be able to connect to SageMaker training and endpoint services unless you
     * configure a NAT Gateway in your VPC.
     *
     * For more information, see [Notebook Instances Are Internet-Enabled by
     * Default](https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access)
     * . You can set the value of this parameter to `Disabled` only if you set a value for the
     * `SubnetId` parameter.
     */
    public fun directInternetAccess(directInternetAccess: String)

    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance.
     */
    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: IResolvable)

    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance.
     */
    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty)

    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("795c4de11fe65f03fc2056ae5ec3bc870153a301dc5c3252a1098abbfc310766")
    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param instanceType The type of ML compute instance to launch for the notebook instance. 
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     */
    public fun instanceType(instanceType: String)

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * SageMaker uses to encrypt data on the storage volume attached to your notebook instance.
     * The KMS key you provide must be enabled. For information, see [Enabling and Disabling
     * Keys](https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param lifecycleConfigName The name of a lifecycle configuration to associate with the
     * notebook instance.
     * For information about lifecycle configurations, see [Customize a Notebook
     * Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html) in the
     * *Amazon SageMaker Developer Guide* .
     */
    public fun lifecycleConfigName(lifecycleConfigName: String)

    /**
     * @param notebookInstanceName The name of the new notebook instance.
     */
    public fun notebookInstanceName(notebookInstanceName: String)

    /**
     * @param platformIdentifier The platform identifier of the notebook instance runtime
     * environment.
     */
    public fun platformIdentifier(platformIdentifier: String)

    /**
     * @param roleArn When you send any requests to AWS resources from the notebook instance,
     * SageMaker assumes this role to perform tasks on your behalf. 
     * You must grant this role necessary permissions so SageMaker can perform these tasks. The
     * policy must allow the SageMaker service principal (sagemaker.amazonaws.com) permissions to
     * assume this role. For more information, see [SageMaker
     * Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
     *
     *
     * To be able to pass this role to SageMaker, the caller of this API must have the
     * `iam:PassRole` permission.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param rootAccess Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is `Enabled` .
     *
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because
     * of this, lifecycle configurations associated with a notebook instance always run with root
     * access even if you disable root access for users.
     */
    public fun rootAccess(rootAccess: String)

    /**
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx.
     * The security groups must be for the same VPC as specified in the subnet.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx.
     * The security groups must be for the same VPC as specified in the subnet.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetId The ID of the subnet in a VPC to which you would like to have a connectivity
     * from your ML compute instance.
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param volumeSizeInGb The size, in GB, of the ML storage volume to attach to the notebook
     * instance.
     * The default value is 5 GB.
     *
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     */
    public fun volumeSizeInGb(volumeSizeInGb: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.builder()

    /**
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     * with the notebook instance.
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     */
    override fun acceleratorTypes(acceleratorTypes: List<String>) {
      cdkBuilder.acceleratorTypes(acceleratorTypes)
    }

    /**
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     * with the notebook instance.
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see [Using Elastic Inference in Amazon
     * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     */
    override fun acceleratorTypes(vararg acceleratorTypes: String): Unit =
        acceleratorTypes(acceleratorTypes.toList())

    /**
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     * the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. These repositories are cloned at the same level as the default repository
     * of your notebook instance. For more information, see [Associating Git Repositories with
     * SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     */
    override fun additionalCodeRepositories(additionalCodeRepositories: List<String>) {
      cdkBuilder.additionalCodeRepositories(additionalCodeRepositories)
    }

    /**
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     * the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. These repositories are cloned at the same level as the default repository
     * of your notebook instance. For more information, see [Associating Git Repositories with
     * SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     */
    override fun additionalCodeRepositories(vararg additionalCodeRepositories: String): Unit =
        additionalCodeRepositories(additionalCodeRepositories.toList())

    /**
     * @param defaultCodeRepository The Git repository associated with the notebook instance as its
     * default code repository.
     * This can be either the name of a Git repository stored as a resource in your account, or the
     * URL of a Git repository in [AWS
     * CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any
     * other Git repository. When you open a notebook instance, it opens in the directory that contains
     * this repository. For more information, see [Associating Git Repositories with SageMaker Notebook
     * Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html) .
     */
    override fun defaultCodeRepository(defaultCodeRepository: String) {
      cdkBuilder.defaultCodeRepository(defaultCodeRepository)
    }

    /**
     * @param directInternetAccess Sets whether SageMaker provides internet access to the notebook
     * instance.
     * If you set this to `Disabled` this notebook instance is able to access resources only in your
     * VPC, and is not be able to connect to SageMaker training and endpoint services unless you
     * configure a NAT Gateway in your VPC.
     *
     * For more information, see [Notebook Instances Are Internet-Enabled by
     * Default](https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access)
     * . You can set the value of this parameter to `Disabled` only if you set a value for the
     * `SubnetId` parameter.
     */
    override fun directInternetAccess(directInternetAccess: String) {
      cdkBuilder.directInternetAccess(directInternetAccess)
    }

    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance.
     */
    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: IResolvable) {
      cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance.
     */
    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty) {
      cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration.let(CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     * notebook instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("795c4de11fe65f03fc2056ae5ec3bc870153a301dc5c3252a1098abbfc310766")
    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceMetadataServiceConfiguration(CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty(instanceMetadataServiceConfiguration))

    /**
     * @param instanceType The type of ML compute instance to launch for the notebook instance. 
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param kmsKeyId The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * SageMaker uses to encrypt data on the storage volume attached to your notebook instance.
     * The KMS key you provide must be enabled. For information, see [Enabling and Disabling
     * Keys](https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param lifecycleConfigName The name of a lifecycle configuration to associate with the
     * notebook instance.
     * For information about lifecycle configurations, see [Customize a Notebook
     * Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html) in the
     * *Amazon SageMaker Developer Guide* .
     */
    override fun lifecycleConfigName(lifecycleConfigName: String) {
      cdkBuilder.lifecycleConfigName(lifecycleConfigName)
    }

    /**
     * @param notebookInstanceName The name of the new notebook instance.
     */
    override fun notebookInstanceName(notebookInstanceName: String) {
      cdkBuilder.notebookInstanceName(notebookInstanceName)
    }

    /**
     * @param platformIdentifier The platform identifier of the notebook instance runtime
     * environment.
     */
    override fun platformIdentifier(platformIdentifier: String) {
      cdkBuilder.platformIdentifier(platformIdentifier)
    }

    /**
     * @param roleArn When you send any requests to AWS resources from the notebook instance,
     * SageMaker assumes this role to perform tasks on your behalf. 
     * You must grant this role necessary permissions so SageMaker can perform these tasks. The
     * policy must allow the SageMaker service principal (sagemaker.amazonaws.com) permissions to
     * assume this role. For more information, see [SageMaker
     * Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
     *
     *
     * To be able to pass this role to SageMaker, the caller of this API must have the
     * `iam:PassRole` permission.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param rootAccess Whether root access is enabled or disabled for users of the notebook
     * instance. The default value is `Enabled` .
     *
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because
     * of this, lifecycle configurations associated with a notebook instance always run with root
     * access even if you disable root access for users.
     */
    override fun rootAccess(rootAccess: String) {
      cdkBuilder.rootAccess(rootAccess)
    }

    /**
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx.
     * The security groups must be for the same VPC as specified in the subnet.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx.
     * The security groups must be for the same VPC as specified in the subnet.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetId The ID of the subnet in a VPC to which you would like to have a connectivity
     * from your ML compute instance.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * For more information, see [Resource
     * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param volumeSizeInGb The size, in GB, of the ML storage volume to attach to the notebook
     * instance.
     * The default value is 5 GB.
     *
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     */
    override fun volumeSizeInGb(volumeSizeInGb: Number) {
      cdkBuilder.volumeSizeInGb(volumeSizeInGb)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps,
  ) : CdkObject(cdkObject),
      CfnNotebookInstanceProps {
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
     */
    override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
        emptyList()

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
     */
    override fun additionalCodeRepositories(): List<String> =
        unwrap(this).getAdditionalCodeRepositories() ?: emptyList()

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
     */
    override fun defaultCodeRepository(): String? = unwrap(this).getDefaultCodeRepository()

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
     */
    override fun directInternetAccess(): String? = unwrap(this).getDirectInternetAccess()

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     */
    override fun instanceMetadataServiceConfiguration(): Any? =
        unwrap(this).getInstanceMetadataServiceConfiguration()

    /**
     * The type of ML compute instance to launch for the notebook instance.
     *
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that SageMaker uses to
     * encrypt data on the storage volume attached to your notebook instance.
     *
     * The KMS key you provide must be enabled. For information, see [Enabling and Disabling
     * Keys](https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The name of a lifecycle configuration to associate with the notebook instance.
     *
     * For information about lifecycle configurations, see [Customize a Notebook
     * Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html) in the
     * *Amazon SageMaker Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-lifecycleconfigname)
     */
    override fun lifecycleConfigName(): String? = unwrap(this).getLifecycleConfigName()

    /**
     * The name of the new notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-notebookinstancename)
     */
    override fun notebookInstanceName(): String? = unwrap(this).getNotebookInstanceName()

    /**
     * The platform identifier of the notebook instance runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-platformidentifier)
     */
    override fun platformIdentifier(): String? = unwrap(this).getPlatformIdentifier()

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
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

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
     */
    override fun rootAccess(): String? = unwrap(this).getRootAccess()

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx.
     *
     * The security groups must be for the same VPC as specified in the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML
     * compute instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-subnetid)
     */
    override fun subnetId(): String? = unwrap(this).getSubnetId()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotebookInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps):
        CfnNotebookInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNotebookInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotebookInstanceProps):
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps
  }
}
