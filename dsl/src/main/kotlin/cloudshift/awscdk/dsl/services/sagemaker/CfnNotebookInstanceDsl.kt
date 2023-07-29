@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import software.constructs.Construct

/**
 * The `AWS::SageMaker::NotebookInstance` resource creates an Amazon SageMaker notebook instance.
 *
 * A notebook instance is a machine learning (ML) compute instance running on a Jupyter notebook.
 * For more information, see
 * [Use Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi.html) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnNotebookInstance cfnNotebookInstance = CfnNotebookInstance.Builder.create(this,
 * "MyCfnNotebookInstance")
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
@CdkDslMarker
public class CfnNotebookInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNotebookInstance.Builder =
        CfnNotebookInstance.Builder.create(scope, id)

    private val _acceleratorTypes: MutableList<String> = mutableListOf()

    private val _additionalCodeRepositories: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook
     * instance.
     *
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see
     * [Using Elastic Inference in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html)
     * .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-acceleratortypes)
     *
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     *   with the notebook instance.
     */
    public fun acceleratorTypes(vararg acceleratorTypes: String) {
        _acceleratorTypes.addAll(listOf(*acceleratorTypes))
    }

    /**
     * A list of Amazon Elastic Inference (EI) instance types to associate with the notebook
     * instance.
     *
     * Currently, only one instance type can be associated with a notebook instance. For more
     * information, see
     * [Using Elastic Inference in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html)
     * .
     *
     * *Valid Values:* `ml.eia1.medium | ml.eia1.large | ml.eia1.xlarge | ml.eia2.medium |
     * ml.eia2.large | ml.eia2.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-acceleratortypes)
     *
     * @param acceleratorTypes A list of Amazon Elastic Inference (EI) instance types to associate
     *   with the notebook instance.
     */
    public fun acceleratorTypes(acceleratorTypes: Collection<String>) {
        _acceleratorTypes.addAll(acceleratorTypes)
    }

    /**
     * An array of up to three Git repositories associated with the notebook instance.
     *
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in
     * [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in
     * any other Git repository. These repositories are cloned at the same level as the default
     * repository of your notebook instance. For more information, see
     * [Associating Git Repositories with SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-additionalcoderepositories)
     *
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     *   the notebook instance.
     */
    public fun additionalCodeRepositories(vararg additionalCodeRepositories: String) {
        _additionalCodeRepositories.addAll(listOf(*additionalCodeRepositories))
    }

    /**
     * An array of up to three Git repositories associated with the notebook instance.
     *
     * These can be either the names of Git repositories stored as resources in your account, or the
     * URL of Git repositories in
     * [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in
     * any other Git repository. These repositories are cloned at the same level as the default
     * repository of your notebook instance. For more information, see
     * [Associating Git Repositories with SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-additionalcoderepositories)
     *
     * @param additionalCodeRepositories An array of up to three Git repositories associated with
     *   the notebook instance.
     */
    public fun additionalCodeRepositories(additionalCodeRepositories: Collection<String>) {
        _additionalCodeRepositories.addAll(additionalCodeRepositories)
    }

    /**
     * The Git repository associated with the notebook instance as its default code repository.
     *
     * This can be either the name of a Git repository stored as a resource in your account, or the
     * URL of a Git repository in
     * [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in
     * any other Git repository. When you open a notebook instance, it opens in the directory that
     * contains this repository. For more information, see
     * [Associating Git Repositories with SageMaker Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-defaultcoderepository)
     *
     * @param defaultCodeRepository The Git repository associated with the notebook instance as its
     *   default code repository.
     */
    public fun defaultCodeRepository(defaultCodeRepository: String) {
        cdkBuilder.defaultCodeRepository(defaultCodeRepository)
    }

    /**
     * Sets whether SageMaker provides internet access to the notebook instance.
     *
     * If you set this to `Disabled` this notebook instance is able to access resources only in your
     * VPC, and is not be able to connect to SageMaker training and endpoint services unless you
     * configure a NAT Gateway in your VPC.
     *
     * For more information, see
     * [Notebook Instances Are Internet-Enabled by Default](https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access)
     * . You can set the value of this parameter to `Disabled` only if you set a value for the
     * `SubnetId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-directinternetaccess)
     *
     * @param directInternetAccess Sets whether SageMaker provides internet access to the notebook
     *   instance.
     */
    public fun directInternetAccess(directInternetAccess: String) {
        cdkBuilder.directInternetAccess(directInternetAccess)
    }

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     *
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     *   notebook instance.
     */
    public fun instanceMetadataServiceConfiguration(
        instanceMetadataServiceConfiguration: IResolvable
    ) {
        cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration)
    }

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancemetadataserviceconfiguration)
     *
     * @param instanceMetadataServiceConfiguration Information on the IMDS configuration of the
     *   notebook instance.
     */
    public fun instanceMetadataServiceConfiguration(
        instanceMetadataServiceConfiguration:
            CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty
    ) {
        cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration)
    }

    /**
     * The type of ML compute instance to launch for the notebook instance.
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-instancetype)
     *
     * @param instanceType The type of ML compute instance to launch for the notebook instance.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that SageMaker uses to
     * encrypt data on the storage volume attached to your notebook instance.
     *
     * The KMS key you provide must be enabled. For information, see
     * [Enabling and Disabling Keys](https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-kmskeyid)
     *
     * @param kmsKeyId The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     *   SageMaker uses to encrypt data on the storage volume attached to your notebook instance.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of a lifecycle configuration to associate with the notebook instance.
     *
     * For information about lifecycle configurations, see
     * [Customize a Notebook Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html)
     * in the *Amazon SageMaker Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-lifecycleconfigname)
     *
     * @param lifecycleConfigName The name of a lifecycle configuration to associate with the
     *   notebook instance.
     */
    public fun lifecycleConfigName(lifecycleConfigName: String) {
        cdkBuilder.lifecycleConfigName(lifecycleConfigName)
    }

    /**
     * The name of the new notebook instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-notebookinstancename)
     *
     * @param notebookInstanceName The name of the new notebook instance.
     */
    public fun notebookInstanceName(notebookInstanceName: String) {
        cdkBuilder.notebookInstanceName(notebookInstanceName)
    }

    /**
     * The platform identifier of the notebook instance runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-platformidentifier)
     *
     * @param platformIdentifier The platform identifier of the notebook instance runtime
     *   environment.
     */
    public fun platformIdentifier(platformIdentifier: String) {
        cdkBuilder.platformIdentifier(platformIdentifier)
    }

    /**
     * When you send any requests to AWS resources from the notebook instance, SageMaker assumes
     * this role to perform tasks on your behalf.
     *
     * You must grant this role necessary permissions so SageMaker can perform these tasks. The
     * policy must allow the SageMaker service principal (sagemaker.amazonaws.com) permissions to
     * assume this role. For more information, see
     * [SageMaker Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
     *
     * To be able to pass this role to SageMaker, the caller of this API must have the
     * `iam:PassRole` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-rolearn)
     *
     * @param roleArn When you send any requests to AWS resources from the notebook instance,
     *   SageMaker assumes this role to perform tasks on your behalf.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * Whether root access is enabled or disabled for users of the notebook instance. The default
     * value is `Enabled` .
     *
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because
     * of this, lifecycle configurations associated with a notebook instance always run with root
     * access even if you disable root access for users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-rootaccess)
     *
     * @param rootAccess Whether root access is enabled or disabled for users of the notebook
     *   instance. The default value is `Enabled` .
     */
    public fun rootAccess(rootAccess: String) {
        cdkBuilder.rootAccess(rootAccess)
    }

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx.
     *
     * The security groups must be for the same VPC as specified in the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-securitygroupids)
     *
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx.
     *
     * The security groups must be for the same VPC as specified in the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-securitygroupids)
     *
     * @param securityGroupIds The VPC security group IDs, in the form sg-xxxxxxxx.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML
     * compute instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-subnetid)
     *
     * @param subnetId The ID of the subnet in a VPC to which you would like to have a connectivity
     *   from your ML compute instance.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Resource Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and
     * [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-tags)
     *
     * @param tags A list of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Resource Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * and
     * [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     * .
     *
     * You can add tags later by using the `CreateTags` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-tags)
     *
     * @param tags A list of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The size, in GB, of the ML storage volume to attach to the notebook instance.
     *
     * The default value is 5 GB.
     *
     * Expect some interruption of service if this parameter is changed as CloudFormation stops a
     * notebook instance and starts it up again to update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html#cfn-sagemaker-notebookinstance-volumesizeingb)
     *
     * @param volumeSizeInGb The size, in GB, of the ML storage volume to attach to the notebook
     *   instance.
     */
    public fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
    }

    public fun build(): CfnNotebookInstance {
        if (_acceleratorTypes.isNotEmpty()) cdkBuilder.acceleratorTypes(_acceleratorTypes)
        if (_additionalCodeRepositories.isNotEmpty())
            cdkBuilder.additionalCodeRepositories(_additionalCodeRepositories)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
