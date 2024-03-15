@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Batch::ComputeEnvironment` resource defines your AWS Batch compute environment.
 *
 * You can define `MANAGED` or `UNMANAGED` compute environments. `MANAGED` compute environments can
 * use Amazon EC2 or AWS Fargate resources. `UNMANAGED` compute environments can only use EC2
 * resources. For more information, see [Compute
 * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in the
 * ** .
 *
 * In a managed compute environment, AWS Batch manages the capacity and instance types of the
 * compute resources within the environment. This is based on the compute resource specification that
 * you define or the [launch
 * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html) that you
 * specify when you create the compute environment. You can choose either to use EC2 On-Demand
 * Instances and EC2 Spot Instances, or to use Fargate and Fargate Spot capacity in your managed
 * compute environment. You can optionally set a maximum price so that Spot Instances only launch when
 * the Spot Instance price is below a specified percentage of the On-Demand price.
 *
 *
 * Multi-node parallel jobs are not supported on Spot Instances.
 *
 *
 * In an unmanaged compute environment, you can manage your own EC2 compute resources and have a lot
 * of flexibility with how you configure your compute resources. For example, you can use custom AMI.
 * However, you need to verify that your AMI meets the Amazon ECS container instance AMI specification.
 * For more information, see [container instance
 * AMIs](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html) in
 * the *Amazon Elastic Container Service Developer Guide* . After you have created your unmanaged
 * compute environment, you can use the
 * [DescribeComputeEnvironments](https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeComputeEnvironments.html)
 * operation to find the Amazon ECS cluster that is associated with it. Then, manually launch your
 * container instances into that Amazon ECS cluster. For more information, see [Launching an Amazon ECS
 * container
 * instance](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 *
 * To create a compute environment that uses EKS resources, the caller must have permissions to call
 * `eks:DescribeCluster` . &gt; AWS Batch doesn't upgrade the AMIs in a compute environment after it's
 * created except under specific conditions. For example, it doesn't automatically update the AMIs when
 * a newer version of the Amazon ECS optimized AMI is available. Therefore, you're responsible for the
 * management of the guest operating system (including updates and security patches) and any additional
 * application software or utilities that you install on the compute resources. There are two ways to
 * use a new AMI for your AWS Batch jobs. The original method is to complete these steps:
 *
 * * Create a new compute environment with the new AMI.
 * * Add the compute environment to an existing job queue.
 * * Remove the earlier compute environment from your job queue.
 * * Delete the earlier compute environment.
 *
 * In April 2022, AWS Batch added enhanced support for updating compute environments. For example,
 * the `UpdateComputeEnvironent` API lets you use the `ReplaceComputeEnvironment` property to
 * dynamically update compute environment parameters such as the launch template or instance type
 * without replacement. For more information, see [Updating compute
 * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
 * in the *AWS Batch User Guide* .
 *
 * To use the enhanced updating of compute environments to update AMIs, follow these rules:
 *
 * * Either do not set the
 * [ServiceRole](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole)
 * property or set it to the *AWSServiceRoleForBatch* service-linked role.
 * * Set the
 * [AllocationStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
 * property to `BEST_FIT_PROGRESSIVE` or `SPOT_CAPACITY_OPTIMIZED` .
 * * Set the
 * [ReplaceComputeEnvironment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-replacecomputeenvironment)
 * property to `false` .
 *
 *
 * Set the `ReplaceComputeEnvironment` property to `true` if the compute environment uses the
 * `BEST_FIT` allocation strategy. &gt; If the `ReplaceComputeEnvironment` property is set to `false` ,
 * you might receive an error message when you update the CFN template for a compute environment. This
 * issue occurs if the updated `desiredvcpus` value is less than the current `desiredvcpus` value. As a
 * workaround, delete the `desiredvcpus` value from the updated template or use the `minvcpus` property
 * to manage the number of vCPUs. For information, see [Error message when you update the
 * `DesiredvCpus`
 * setting](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update)
 * .
 *
 *
 * * Set the
 * [UpdateToLatestImageVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
 * property to `true` . This property is used when you update a compute environment. The
 * [UpdateToLatestImageVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
 * property is ignored when you create a compute environment.
 * * Either do not specify an image ID in
 * [ImageId](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
 * or
 * [ImageIdOverride](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html#cfn-batch-computeenvironment-ec2configurationobject-imageidoverride)
 * properties, or in the launch template identified by the [Launch
 * Template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
 * property. In that case AWS Batch will select the latest Amazon ECS optimized AMI supported by AWS
 * Batch at the time the infrastructure update is initiated. Alternatively you can specify the AMI ID
 * in the `ImageId` or `ImageIdOverride` properties, or the launch template identified by the
 * `LaunchTemplate` properties. Changing any of these properties will trigger an infrastructure update.
 *
 * If these rules are followed, any update that triggers an infrastructure update will cause the AMI
 * ID to be re-selected. If the
 * [Version](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-version)
 * property of the
 * [LaunchTemplateSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html)
 * is set to `$Latest` or `$Default` , the latest or default version of the launch template will be
 * evaluated up at the time of the infrastructure update, even if the `LaunchTemplateSpecification` was
 * not updated.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * CfnComputeEnvironment cfnComputeEnvironment = CfnComputeEnvironment.Builder.create(this,
 * "MyCfnComputeEnvironment")
 * .type("type")
 * // the properties below are optional
 * .computeEnvironmentName("computeEnvironmentName")
 * .computeResources(ComputeResourcesProperty.builder()
 * .maxvCpus(123)
 * .subnets(List.of("subnets"))
 * .type("type")
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .bidPercentage(123)
 * .desiredvCpus(123)
 * .ec2Configuration(List.of(Ec2ConfigurationObjectProperty.builder()
 * .imageType("imageType")
 * // the properties below are optional
 * .imageIdOverride("imageIdOverride")
 * .imageKubernetesVersion("imageKubernetesVersion")
 * .build()))
 * .ec2KeyPair("ec2KeyPair")
 * .imageId("imageId")
 * .instanceRole("instanceRole")
 * .instanceTypes(List.of("instanceTypes"))
 * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .version("version")
 * .build())
 * .minvCpus(123)
 * .placementGroup("placementGroup")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .spotIamFleetRole("spotIamFleetRole")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .updateToLatestImageVersion(false)
 * .build())
 * .eksConfiguration(EksConfigurationProperty.builder()
 * .eksClusterArn("eksClusterArn")
 * .kubernetesNamespace("kubernetesNamespace")
 * .build())
 * .replaceComputeEnvironment(false)
 * .serviceRole("serviceRole")
 * .state("state")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .unmanagedvCpus(123)
 * .updatePolicy(UpdatePolicyProperty.builder()
 * .jobExecutionTimeoutMinutes(123)
 * .terminateJobsOnUpdate(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html)
 */
public open class CfnComputeEnvironment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the compute environment ARN, such as `batch: *us-east-1* : *111122223333*
   * :compute-environment/ *ComputeEnvironmentName*` .
   */
  public open fun attrComputeEnvironmentArn(): String = unwrap(this).getAttrComputeEnvironmentArn()

  /**
   * The name for your compute environment.
   */
  public open fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

  /**
   * The name for your compute environment.
   */
  public open fun computeEnvironmentName(`value`: String) {
    unwrap(this).setComputeEnvironmentName(`value`)
  }

  /**
   * The ComputeResources property type specifies details of the compute resources managed by the
   * compute environment.
   */
  public open fun computeResources(): Any? = unwrap(this).getComputeResources()

  /**
   * The ComputeResources property type specifies details of the compute resources managed by the
   * compute environment.
   */
  public open fun computeResources(`value`: IResolvable) {
    unwrap(this).setComputeResources(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ComputeResources property type specifies details of the compute resources managed by the
   * compute environment.
   */
  public open fun computeResources(`value`: ComputeResourcesProperty) {
    unwrap(this).setComputeResources(`value`.let(ComputeResourcesProperty::unwrap))
  }

  /**
   * The ComputeResources property type specifies details of the compute resources managed by the
   * compute environment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5848bb91251b86183b3ea469b2c7529ed7ab8f70dbbc389524f94cd0e5079fb")
  public open fun computeResources(`value`: ComputeResourcesProperty.Builder.() -> Unit): Unit =
      computeResources(ComputeResourcesProperty(`value`))

  /**
   * The details for the Amazon EKS cluster that supports the compute environment.
   */
  public open fun eksConfiguration(): Any? = unwrap(this).getEksConfiguration()

  /**
   * The details for the Amazon EKS cluster that supports the compute environment.
   */
  public open fun eksConfiguration(`value`: IResolvable) {
    unwrap(this).setEksConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The details for the Amazon EKS cluster that supports the compute environment.
   */
  public open fun eksConfiguration(`value`: EksConfigurationProperty) {
    unwrap(this).setEksConfiguration(`value`.let(EksConfigurationProperty::unwrap))
  }

  /**
   * The details for the Amazon EKS cluster that supports the compute environment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a7ac2f3acb977dd704e35301bf1b1e50a07dc03e5d3714467f0c8d6e26707a67")
  public open fun eksConfiguration(`value`: EksConfigurationProperty.Builder.() -> Unit): Unit =
      eksConfiguration(EksConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies whether the compute environment is replaced if an update is made that requires
   * replacing the instances in the compute environment.
   */
  public open fun replaceComputeEnvironment(): Any? = unwrap(this).getReplaceComputeEnvironment()

  /**
   * Specifies whether the compute environment is replaced if an update is made that requires
   * replacing the instances in the compute environment.
   */
  public open fun replaceComputeEnvironment(`value`: Boolean) {
    unwrap(this).setReplaceComputeEnvironment(`value`)
  }

  /**
   * Specifies whether the compute environment is replaced if an update is made that requires
   * replacing the instances in the compute environment.
   */
  public open fun replaceComputeEnvironment(`value`: IResolvable) {
    unwrap(this).setReplaceComputeEnvironment(`value`.let(IResolvable::unwrap))
  }

  /**
   * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to
   * other AWS services on your behalf.
   */
  public open fun serviceRole(): String? = unwrap(this).getServiceRole()

  /**
   * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to
   * other AWS services on your behalf.
   */
  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  /**
   * The state of the compute environment.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The state of the compute environment.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags applied to the compute environment.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags applied to the compute environment.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The type of the compute environment: `MANAGED` or `UNMANAGED` .
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the compute environment: `MANAGED` or `UNMANAGED` .
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The maximum number of vCPUs for an unmanaged compute environment.
   */
  public open fun unmanagedvCpus(): Number? = unwrap(this).getUnmanagedvCpus()

  /**
   * The maximum number of vCPUs for an unmanaged compute environment.
   */
  public open fun unmanagedvCpus(`value`: Number) {
    unwrap(this).setUnmanagedvCpus(`value`)
  }

  /**
   * Specifies the infrastructure update policy for the compute environment.
   */
  public open fun updatePolicy(): Any? = unwrap(this).getUpdatePolicy()

  /**
   * Specifies the infrastructure update policy for the compute environment.
   */
  public open fun updatePolicy(`value`: IResolvable) {
    unwrap(this).setUpdatePolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the infrastructure update policy for the compute environment.
   */
  public open fun updatePolicy(`value`: UpdatePolicyProperty) {
    unwrap(this).setUpdatePolicy(`value`.let(UpdatePolicyProperty::unwrap))
  }

  /**
   * Specifies the infrastructure update policy for the compute environment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43e9768d3ae210b5c50e0040a03095541fc4fa3f91879ec7a20dd2ef9eed9581")
  public open fun updatePolicy(`value`: UpdatePolicyProperty.Builder.() -> Unit): Unit =
      updatePolicy(UpdatePolicyProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.CfnComputeEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name for your compute environment.
     *
     * It can be up to 128 characters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname)
     * @param computeEnvironmentName The name for your compute environment. 
     */
    public fun computeEnvironmentName(computeEnvironmentName: String)

    /**
     * The ComputeResources property type specifies details of the compute resources managed by the
     * compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute
     * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
     * @param computeResources The ComputeResources property type specifies details of the compute
     * resources managed by the compute environment. 
     */
    public fun computeResources(computeResources: IResolvable)

    /**
     * The ComputeResources property type specifies details of the compute resources managed by the
     * compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute
     * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
     * @param computeResources The ComputeResources property type specifies details of the compute
     * resources managed by the compute environment. 
     */
    public fun computeResources(computeResources: ComputeResourcesProperty)

    /**
     * The ComputeResources property type specifies details of the compute resources managed by the
     * compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute
     * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
     * @param computeResources The ComputeResources property type specifies details of the compute
     * resources managed by the compute environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e68d3d39757a2bb02d27a14eaf143cce0c2876be80e425917f05c02c84205abb")
    public fun computeResources(computeResources: ComputeResourcesProperty.Builder.() -> Unit)

    /**
     * The details for the Amazon EKS cluster that supports the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-eksconfiguration)
     * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
     * environment. 
     */
    public fun eksConfiguration(eksConfiguration: IResolvable)

    /**
     * The details for the Amazon EKS cluster that supports the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-eksconfiguration)
     * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
     * environment. 
     */
    public fun eksConfiguration(eksConfiguration: EksConfigurationProperty)

    /**
     * The details for the Amazon EKS cluster that supports the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-eksconfiguration)
     * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
     * environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("628654f205977f50317fb6bb74c7f132d076467b6a42e16fe1d1b5c152f2e10c")
    public fun eksConfiguration(eksConfiguration: EksConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies whether the compute environment is replaced if an update is made that requires
     * replacing the instances in the compute environment.
     *
     * The default value is `true` . To enable more properties to be updated, set this property to
     * `false` . When changing the value of this property to `false` , do not change any other
     * properties at the same time. If other properties are changed at the same time, and the change
     * needs to be rolled back but it can't, it's possible for the stack to go into the
     * `UPDATE_ROLLBACK_FAILED` state. You can't update a stack that is in the `UPDATE_ROLLBACK_FAILED`
     * state. However, if you can continue to roll it back, you can return the stack to its original
     * settings and then try to update it again. For more information, see [Continue rolling back an
     * update](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The properties that can't be changed without replacing the compute environment are in the
     * [`ComputeResources`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html)
     * property type:
     * [`AllocationStrategy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
     * ,
     * [`BidPercentage`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
     * ,
     * [`Ec2Configuration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2configuration)
     * ,
     * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     * ,
     * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     * ,
     * [`ImageId`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
     * ,
     * [`InstanceRole`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
     * ,
     * [`InstanceTypes`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
     * ,
     * [`LaunchTemplate`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
     * ,
     * [`MaxvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
     * ,
     * [`MinvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
     * ,
     * [`PlacementGroup`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup)
     * ,
     * [`SecurityGroupIds`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
     * ,
     * [`Subnets`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
     * ,
     * [Tags](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
     * ,
     * [`Type`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
     * , and
     * [`UpdateToLatestImageVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
     * .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-replacecomputeenvironment)
     * @param replaceComputeEnvironment Specifies whether the compute environment is replaced if an
     * update is made that requires replacing the instances in the compute environment. 
     */
    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean)

    /**
     * Specifies whether the compute environment is replaced if an update is made that requires
     * replacing the instances in the compute environment.
     *
     * The default value is `true` . To enable more properties to be updated, set this property to
     * `false` . When changing the value of this property to `false` , do not change any other
     * properties at the same time. If other properties are changed at the same time, and the change
     * needs to be rolled back but it can't, it's possible for the stack to go into the
     * `UPDATE_ROLLBACK_FAILED` state. You can't update a stack that is in the `UPDATE_ROLLBACK_FAILED`
     * state. However, if you can continue to roll it back, you can return the stack to its original
     * settings and then try to update it again. For more information, see [Continue rolling back an
     * update](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The properties that can't be changed without replacing the compute environment are in the
     * [`ComputeResources`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html)
     * property type:
     * [`AllocationStrategy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
     * ,
     * [`BidPercentage`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
     * ,
     * [`Ec2Configuration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2configuration)
     * ,
     * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     * ,
     * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     * ,
     * [`ImageId`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
     * ,
     * [`InstanceRole`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
     * ,
     * [`InstanceTypes`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
     * ,
     * [`LaunchTemplate`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
     * ,
     * [`MaxvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
     * ,
     * [`MinvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
     * ,
     * [`PlacementGroup`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup)
     * ,
     * [`SecurityGroupIds`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
     * ,
     * [`Subnets`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
     * ,
     * [Tags](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
     * ,
     * [`Type`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
     * , and
     * [`UpdateToLatestImageVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
     * .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-replacecomputeenvironment)
     * @param replaceComputeEnvironment Specifies whether the compute environment is replaced if an
     * update is made that requires replacing the instances in the compute environment. 
     */
    public fun replaceComputeEnvironment(replaceComputeEnvironment: IResolvable)

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to
     * other AWS services on your behalf.
     *
     * For more information, see [AWS Batch service IAM
     * role](https://docs.aws.amazon.com/batch/latest/userguide/service_IAM_role.html) in the *AWS
     * Batch User Guide* .
     *
     *
     * If your account already created the AWS Batch service-linked role, that role is used by
     * default for your compute environment unless you specify a different role here. If the AWS Batch
     * service-linked role doesn't exist in your account, and no role is specified here, the service
     * attempts to create the AWS Batch service-linked role in your account.
     *
     *
     * If your specified role has a path other than `/` , then you must specify either the full role
     * ARN (recommended) or prefix the role name with the path. For example, if a role with the name
     * `bar` has a path of `/foo/` , specify `/foo/bar` as the role name. For more information, see
     * [Friendly names and
     * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
     * in the *IAM User Guide* .
     *
     *
     * Depending on how you created your AWS Batch service role, its ARN might contain the
     * `service-role` path prefix. When you only specify the name of the service role, AWS Batch
     * assumes that your ARN doesn't use the `service-role` path prefix. Because of this, we recommend
     * that you specify the full ARN of your service role when you create compute environments.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole)
     * @param serviceRole The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch
     * to make calls to other AWS services on your behalf. 
     */
    public fun serviceRole(serviceRole: String)

    /**
     * The state of the compute environment.
     *
     * If the state is `ENABLED` , then the compute environment accepts jobs from a queue and can
     * scale out automatically based on queues.
     *
     * If the state is `ENABLED` , then the AWS Batch scheduler can attempt to place jobs from an
     * associated job queue on the compute resources within the environment. If the compute environment
     * is managed, then it can scale its instances out or in automatically, based on the job queue
     * demand.
     *
     * If the state is `DISABLED` , then the AWS Batch scheduler doesn't attempt to place jobs
     * within the environment. Jobs in a `STARTING` or `RUNNING` state continue to progress normally.
     * Managed compute environments in the `DISABLED` state don't scale out.
     *
     *
     * Compute environments in a `DISABLED` state may continue to incur billing charges. To prevent
     * additional charges, turn off and then delete the compute environment. For more information, see
     * [State](https://docs.aws.amazon.com/batch/latest/userguide/compute_environment_parameters.html#compute_environment_state)
     * in the *AWS Batch User Guide* .
     *
     *
     * When an instance is idle, the instance scales down to the `minvCpus` value. However, the
     * instance size doesn't change. For example, consider a `c5.8xlarge` instance with a `minvCpus`
     * value of `4` and a `desiredvCpus` value of `36` . This instance doesn't scale down to a
     * `c5.large` instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state)
     * @param state The state of the compute environment. 
     */
    public fun state(state: String)

    /**
     * The tags applied to the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-tags)
     * @param tags The tags applied to the compute environment. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The type of the compute environment: `MANAGED` or `UNMANAGED` .
     *
     * For more information, see [Compute
     * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type)
     * @param type The type of the compute environment: `MANAGED` or `UNMANAGED` . 
     */
    public fun type(type: String)

    /**
     * The maximum number of vCPUs for an unmanaged compute environment.
     *
     * This parameter is only used for fair share scheduling to reserve vCPU capacity for new share
     * identifiers. If this parameter isn't provided for a fair share job queue, no vCPU capacity is
     * reserved.
     *
     *
     * This parameter is only supported when the `type` parameter is set to `UNMANAGED` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-unmanagedvcpus)
     * @param unmanagedvCpus The maximum number of vCPUs for an unmanaged compute environment. 
     */
    public fun unmanagedvCpus(unmanagedvCpus: Number)

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-updatepolicy)
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment. 
     */
    public fun updatePolicy(updatePolicy: IResolvable)

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-updatepolicy)
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment. 
     */
    public fun updatePolicy(updatePolicy: UpdatePolicyProperty)

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-updatepolicy)
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adcb17e92adf67ccaad6ef9bc71615a32075fcca90b5091cee7b718d76f5919e")
    public fun updatePolicy(updatePolicy: UpdatePolicyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnComputeEnvironment.Builder =
        software.amazon.awscdk.services.batch.CfnComputeEnvironment.Builder.create(scope, id)

    /**
     * The name for your compute environment.
     *
     * It can be up to 128 characters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname)
     * @param computeEnvironmentName The name for your compute environment. 
     */
    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * The ComputeResources property type specifies details of the compute resources managed by the
     * compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute
     * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
     * @param computeResources The ComputeResources property type specifies details of the compute
     * resources managed by the compute environment. 
     */
    override fun computeResources(computeResources: IResolvable) {
      cdkBuilder.computeResources(computeResources.let(IResolvable::unwrap))
    }

    /**
     * The ComputeResources property type specifies details of the compute resources managed by the
     * compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute
     * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
     * @param computeResources The ComputeResources property type specifies details of the compute
     * resources managed by the compute environment. 
     */
    override fun computeResources(computeResources: ComputeResourcesProperty) {
      cdkBuilder.computeResources(computeResources.let(ComputeResourcesProperty::unwrap))
    }

    /**
     * The ComputeResources property type specifies details of the compute resources managed by the
     * compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute
     * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
     * @param computeResources The ComputeResources property type specifies details of the compute
     * resources managed by the compute environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e68d3d39757a2bb02d27a14eaf143cce0c2876be80e425917f05c02c84205abb")
    override fun computeResources(computeResources: ComputeResourcesProperty.Builder.() -> Unit):
        Unit = computeResources(ComputeResourcesProperty(computeResources))

    /**
     * The details for the Amazon EKS cluster that supports the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-eksconfiguration)
     * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
     * environment. 
     */
    override fun eksConfiguration(eksConfiguration: IResolvable) {
      cdkBuilder.eksConfiguration(eksConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The details for the Amazon EKS cluster that supports the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-eksconfiguration)
     * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
     * environment. 
     */
    override fun eksConfiguration(eksConfiguration: EksConfigurationProperty) {
      cdkBuilder.eksConfiguration(eksConfiguration.let(EksConfigurationProperty::unwrap))
    }

    /**
     * The details for the Amazon EKS cluster that supports the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-eksconfiguration)
     * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
     * environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("628654f205977f50317fb6bb74c7f132d076467b6a42e16fe1d1b5c152f2e10c")
    override fun eksConfiguration(eksConfiguration: EksConfigurationProperty.Builder.() -> Unit):
        Unit = eksConfiguration(EksConfigurationProperty(eksConfiguration))

    /**
     * Specifies whether the compute environment is replaced if an update is made that requires
     * replacing the instances in the compute environment.
     *
     * The default value is `true` . To enable more properties to be updated, set this property to
     * `false` . When changing the value of this property to `false` , do not change any other
     * properties at the same time. If other properties are changed at the same time, and the change
     * needs to be rolled back but it can't, it's possible for the stack to go into the
     * `UPDATE_ROLLBACK_FAILED` state. You can't update a stack that is in the `UPDATE_ROLLBACK_FAILED`
     * state. However, if you can continue to roll it back, you can return the stack to its original
     * settings and then try to update it again. For more information, see [Continue rolling back an
     * update](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The properties that can't be changed without replacing the compute environment are in the
     * [`ComputeResources`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html)
     * property type:
     * [`AllocationStrategy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
     * ,
     * [`BidPercentage`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
     * ,
     * [`Ec2Configuration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2configuration)
     * ,
     * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     * ,
     * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     * ,
     * [`ImageId`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
     * ,
     * [`InstanceRole`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
     * ,
     * [`InstanceTypes`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
     * ,
     * [`LaunchTemplate`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
     * ,
     * [`MaxvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
     * ,
     * [`MinvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
     * ,
     * [`PlacementGroup`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup)
     * ,
     * [`SecurityGroupIds`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
     * ,
     * [`Subnets`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
     * ,
     * [Tags](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
     * ,
     * [`Type`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
     * , and
     * [`UpdateToLatestImageVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
     * .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-replacecomputeenvironment)
     * @param replaceComputeEnvironment Specifies whether the compute environment is replaced if an
     * update is made that requires replacing the instances in the compute environment. 
     */
    override fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    /**
     * Specifies whether the compute environment is replaced if an update is made that requires
     * replacing the instances in the compute environment.
     *
     * The default value is `true` . To enable more properties to be updated, set this property to
     * `false` . When changing the value of this property to `false` , do not change any other
     * properties at the same time. If other properties are changed at the same time, and the change
     * needs to be rolled back but it can't, it's possible for the stack to go into the
     * `UPDATE_ROLLBACK_FAILED` state. You can't update a stack that is in the `UPDATE_ROLLBACK_FAILED`
     * state. However, if you can continue to roll it back, you can return the stack to its original
     * settings and then try to update it again. For more information, see [Continue rolling back an
     * update](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The properties that can't be changed without replacing the compute environment are in the
     * [`ComputeResources`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html)
     * property type:
     * [`AllocationStrategy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
     * ,
     * [`BidPercentage`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
     * ,
     * [`Ec2Configuration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2configuration)
     * ,
     * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     * ,
     * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     * ,
     * [`ImageId`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
     * ,
     * [`InstanceRole`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
     * ,
     * [`InstanceTypes`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
     * ,
     * [`LaunchTemplate`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
     * ,
     * [`MaxvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
     * ,
     * [`MinvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
     * ,
     * [`PlacementGroup`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup)
     * ,
     * [`SecurityGroupIds`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
     * ,
     * [`Subnets`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
     * ,
     * [Tags](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
     * ,
     * [`Type`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
     * , and
     * [`UpdateToLatestImageVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
     * .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-replacecomputeenvironment)
     * @param replaceComputeEnvironment Specifies whether the compute environment is replaced if an
     * update is made that requires replacing the instances in the compute environment. 
     */
    override fun replaceComputeEnvironment(replaceComputeEnvironment: IResolvable) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment.let(IResolvable::unwrap))
    }

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to
     * other AWS services on your behalf.
     *
     * For more information, see [AWS Batch service IAM
     * role](https://docs.aws.amazon.com/batch/latest/userguide/service_IAM_role.html) in the *AWS
     * Batch User Guide* .
     *
     *
     * If your account already created the AWS Batch service-linked role, that role is used by
     * default for your compute environment unless you specify a different role here. If the AWS Batch
     * service-linked role doesn't exist in your account, and no role is specified here, the service
     * attempts to create the AWS Batch service-linked role in your account.
     *
     *
     * If your specified role has a path other than `/` , then you must specify either the full role
     * ARN (recommended) or prefix the role name with the path. For example, if a role with the name
     * `bar` has a path of `/foo/` , specify `/foo/bar` as the role name. For more information, see
     * [Friendly names and
     * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
     * in the *IAM User Guide* .
     *
     *
     * Depending on how you created your AWS Batch service role, its ARN might contain the
     * `service-role` path prefix. When you only specify the name of the service role, AWS Batch
     * assumes that your ARN doesn't use the `service-role` path prefix. Because of this, we recommend
     * that you specify the full ARN of your service role when you create compute environments.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole)
     * @param serviceRole The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch
     * to make calls to other AWS services on your behalf. 
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * The state of the compute environment.
     *
     * If the state is `ENABLED` , then the compute environment accepts jobs from a queue and can
     * scale out automatically based on queues.
     *
     * If the state is `ENABLED` , then the AWS Batch scheduler can attempt to place jobs from an
     * associated job queue on the compute resources within the environment. If the compute environment
     * is managed, then it can scale its instances out or in automatically, based on the job queue
     * demand.
     *
     * If the state is `DISABLED` , then the AWS Batch scheduler doesn't attempt to place jobs
     * within the environment. Jobs in a `STARTING` or `RUNNING` state continue to progress normally.
     * Managed compute environments in the `DISABLED` state don't scale out.
     *
     *
     * Compute environments in a `DISABLED` state may continue to incur billing charges. To prevent
     * additional charges, turn off and then delete the compute environment. For more information, see
     * [State](https://docs.aws.amazon.com/batch/latest/userguide/compute_environment_parameters.html#compute_environment_state)
     * in the *AWS Batch User Guide* .
     *
     *
     * When an instance is idle, the instance scales down to the `minvCpus` value. However, the
     * instance size doesn't change. For example, consider a `c5.8xlarge` instance with a `minvCpus`
     * value of `4` and a `desiredvCpus` value of `36` . This instance doesn't scale down to a
     * `c5.large` instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state)
     * @param state The state of the compute environment. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * The tags applied to the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-tags)
     * @param tags The tags applied to the compute environment. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The type of the compute environment: `MANAGED` or `UNMANAGED` .
     *
     * For more information, see [Compute
     * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type)
     * @param type The type of the compute environment: `MANAGED` or `UNMANAGED` . 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The maximum number of vCPUs for an unmanaged compute environment.
     *
     * This parameter is only used for fair share scheduling to reserve vCPU capacity for new share
     * identifiers. If this parameter isn't provided for a fair share job queue, no vCPU capacity is
     * reserved.
     *
     *
     * This parameter is only supported when the `type` parameter is set to `UNMANAGED` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-unmanagedvcpus)
     * @param unmanagedvCpus The maximum number of vCPUs for an unmanaged compute environment. 
     */
    override fun unmanagedvCpus(unmanagedvCpus: Number) {
      cdkBuilder.unmanagedvCpus(unmanagedvCpus)
    }

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-updatepolicy)
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment. 
     */
    override fun updatePolicy(updatePolicy: IResolvable) {
      cdkBuilder.updatePolicy(updatePolicy.let(IResolvable::unwrap))
    }

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-updatepolicy)
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment. 
     */
    override fun updatePolicy(updatePolicy: UpdatePolicyProperty) {
      cdkBuilder.updatePolicy(updatePolicy.let(UpdatePolicyProperty::unwrap))
    }

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-updatepolicy)
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adcb17e92adf67ccaad6ef9bc71615a32075fcca90b5091cee7b718d76f5919e")
    override fun updatePolicy(updatePolicy: UpdatePolicyProperty.Builder.() -> Unit): Unit =
        updatePolicy(UpdatePolicyProperty(updatePolicy))

    public fun build(): software.amazon.awscdk.services.batch.CfnComputeEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.batch.CfnComputeEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComputeEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComputeEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment):
        CfnComputeEnvironment = CfnComputeEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnComputeEnvironment):
        software.amazon.awscdk.services.batch.CfnComputeEnvironment = wrapped.cdkObject
  }

  /**
   * Configuration for the Amazon EKS cluster that supports the AWS Batch compute environment.
   *
   * The cluster must exist before the compute environment can be created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * EksConfigurationProperty eksConfigurationProperty = EksConfigurationProperty.builder()
   * .eksClusterArn("eksClusterArn")
   * .kubernetesNamespace("kubernetesNamespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-eksconfiguration.html)
   */
  public interface EksConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon EKS cluster.
     *
     * An example is `arn: *aws* :eks: *us-east-1* : *123456789012* :cluster/ *ClusterForBatch*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-eksconfiguration.html#cfn-batch-computeenvironment-eksconfiguration-eksclusterarn)
     */
    public fun eksClusterArn(): String

    /**
     * The namespace of the Amazon EKS cluster.
     *
     * AWS Batch manages pods in this namespace. The value can't left empty or null. It must be
     * fewer than 64 characters long, can't be set to `default` , can't start with " `kube-` ," and
     * must match this regular expression: `^[a-z0-9]([-a-z0-9]*[a-z0-9])?$` . For more information,
     * see
     * [Namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/)
     * in the Kubernetes documentation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-eksconfiguration.html#cfn-batch-computeenvironment-eksconfiguration-kubernetesnamespace)
     */
    public fun kubernetesNamespace(): String

    /**
     * A builder for [EksConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eksClusterArn The Amazon Resource Name (ARN) of the Amazon EKS cluster. 
       * An example is `arn: *aws* :eks: *us-east-1* : *123456789012* :cluster/ *ClusterForBatch*` .
       */
      public fun eksClusterArn(eksClusterArn: String)

      /**
       * @param kubernetesNamespace The namespace of the Amazon EKS cluster. 
       * AWS Batch manages pods in this namespace. The value can't left empty or null. It must be
       * fewer than 64 characters long, can't be set to `default` , can't start with " `kube-` ," and
       * must match this regular expression: `^[a-z0-9]([-a-z0-9]*[a-z0-9])?$` . For more information,
       * see
       * [Namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/)
       * in the Kubernetes documentation.
       */
      public fun kubernetesNamespace(kubernetesNamespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty.builder()

      /**
       * @param eksClusterArn The Amazon Resource Name (ARN) of the Amazon EKS cluster. 
       * An example is `arn: *aws* :eks: *us-east-1* : *123456789012* :cluster/ *ClusterForBatch*` .
       */
      override fun eksClusterArn(eksClusterArn: String) {
        cdkBuilder.eksClusterArn(eksClusterArn)
      }

      /**
       * @param kubernetesNamespace The namespace of the Amazon EKS cluster. 
       * AWS Batch manages pods in this namespace. The value can't left empty or null. It must be
       * fewer than 64 characters long, can't be set to `default` , can't start with " `kube-` ," and
       * must match this regular expression: `^[a-z0-9]([-a-z0-9]*[a-z0-9])?$` . For more information,
       * see
       * [Namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/)
       * in the Kubernetes documentation.
       */
      override fun kubernetesNamespace(kubernetesNamespace: String) {
        cdkBuilder.kubernetesNamespace(kubernetesNamespace)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty,
    ) : CdkObject(cdkObject), EksConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon EKS cluster.
       *
       * An example is `arn: *aws* :eks: *us-east-1* : *123456789012* :cluster/ *ClusterForBatch*` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-eksconfiguration.html#cfn-batch-computeenvironment-eksconfiguration-eksclusterarn)
       */
      override fun eksClusterArn(): String = unwrap(this).getEksClusterArn()

      /**
       * The namespace of the Amazon EKS cluster.
       *
       * AWS Batch manages pods in this namespace. The value can't left empty or null. It must be
       * fewer than 64 characters long, can't be set to `default` , can't start with " `kube-` ," and
       * must match this regular expression: `^[a-z0-9]([-a-z0-9]*[a-z0-9])?$` . For more information,
       * see
       * [Namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/)
       * in the Kubernetes documentation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-eksconfiguration.html#cfn-batch-computeenvironment-eksconfiguration-kubernetesnamespace)
       */
      override fun kubernetesNamespace(): String = unwrap(this).getKubernetesNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EksConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty):
          EksConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty
    }
  }

  /**
   * Provides information used to select Amazon Machine Images (AMIs) for instances in the compute
   * environment.
   *
   * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` ( [Amazon Linux
   * 2](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) ).
   *
   *
   * This object isn't applicable to jobs that are running on Fargate resources.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * Ec2ConfigurationObjectProperty ec2ConfigurationObjectProperty =
   * Ec2ConfigurationObjectProperty.builder()
   * .imageType("imageType")
   * // the properties below are optional
   * .imageIdOverride("imageIdOverride")
   * .imageKubernetesVersion("imageKubernetesVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html)
   */
  public interface Ec2ConfigurationObjectProperty {
    /**
     * The AMI ID used for instances launched in the compute environment that match the image type.
     *
     * This setting overrides the `imageId` set in the `computeResource` object.
     *
     *
     * The AMI that you choose for a compute environment must match the architecture of the instance
     * types that you intend to use for that compute environment. For example, if your compute
     * environment uses A1 instance types, the compute resource AMI that you choose must support ARM
     * instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized Amazon Linux 2
     * AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html#cfn-batch-computeenvironment-ec2configurationobject-imageidoverride)
     */
    public fun imageIdOverride(): String? = unwrap(this).getImageIdOverride()

    /**
     * The Kubernetes version for the compute environment.
     *
     * If you don't specify a value, the latest version that AWS Batch supports is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html#cfn-batch-computeenvironment-ec2configurationobject-imagekubernetesversion)
     */
    public fun imageKubernetesVersion(): String? = unwrap(this).getImageKubernetesVersion()

    /**
     * The image type to match with the instance type to select an AMI.
     *
     * The supported values are different for `ECS` and `EKS` resources.
     *
     * * **ECS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
     * ECS-optimized Amazon Linux 2
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami)
     * ( `ECS_AL2` ) is used. If a new image type is specified in an update, but neither an `imageId`
     * nor a `imageIdOverride` parameter is specified, then the latest Amazon ECS optimized AMI for
     * that image type that's supported by AWS Batch is used.
     * * **ECS_AL2** - [Amazon Linux
     * 2](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) :
     * Default for all non-GPU instance families.
     * * **ECS_AL2_NVIDIA** - [Amazon Linux 2
     * (GPU)](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami)
     * : Default for all GPU instance families (for example `P4` and `G4` ) and can be used for all non
     * AWS Graviton-based instance types.
     * * **ECS_AL2023** - [Amazon Linux
     * 2023](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) : AWS
     * Batch supports Amazon Linux 2023.
     *
     *
     * Amazon Linux 2023 does not support `A1` instances.
     *
     *
     * * **ECS_AL1** - [Amazon
     * Linux](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami)
     * . Amazon Linux has reached the end-of-life of standard support. For more information, see
     * [Amazon Linux AMI](https://docs.aws.amazon.com/amazon-linux-ami/) .
     * * **EKS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
     * EKS-optimized Amazon Linux
     * AMI](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) ( `EKS_AL2` ) is
     * used. If a new image type is specified in an update, but neither an `imageId` nor a
     * `imageIdOverride` parameter is specified, then the latest Amazon EKS optimized AMI for that
     * image type that AWS Batch supports is used.
     * * **EKS_AL2** - [Amazon Linux
     * 2](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) : Default for all
     * non-GPU instance families.
     * * **EKS_AL2_NVIDIA** - [Amazon Linux 2
     * (accelerated)](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) :
     * Default for all GPU instance families (for example, `P4` and `G4` ) and can be used for all non
     * AWS Graviton-based instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html#cfn-batch-computeenvironment-ec2configurationobject-imagetype)
     */
    public fun imageType(): String

    /**
     * A builder for [Ec2ConfigurationObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param imageIdOverride The AMI ID used for instances launched in the compute environment
       * that match the image type.
       * This setting overrides the `imageId` set in the `computeResource` object.
       *
       *
       * The AMI that you choose for a compute environment must match the architecture of the
       * instance types that you intend to use for that compute environment. For example, if your
       * compute environment uses A1 instance types, the compute resource AMI that you choose must
       * support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized
       * Amazon Linux 2 AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun imageIdOverride(imageIdOverride: String)

      /**
       * @param imageKubernetesVersion The Kubernetes version for the compute environment.
       * If you don't specify a value, the latest version that AWS Batch supports is used.
       */
      public fun imageKubernetesVersion(imageKubernetesVersion: String)

      /**
       * @param imageType The image type to match with the instance type to select an AMI. 
       * The supported values are different for `ECS` and `EKS` resources.
       *
       * * **ECS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
       * ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami)
       * ( `ECS_AL2` ) is used. If a new image type is specified in an update, but neither an `imageId`
       * nor a `imageIdOverride` parameter is specified, then the latest Amazon ECS optimized AMI for
       * that image type that's supported by AWS Batch is used.
       * * **ECS_AL2** - [Amazon Linux
       * 2](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami)
       * : Default for all non-GPU instance families.
       * * **ECS_AL2_NVIDIA** - [Amazon Linux 2
       * (GPU)](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami)
       * : Default for all GPU instance families (for example `P4` and `G4` ) and can be used for all
       * non AWS Graviton-based instance types.
       * * **ECS_AL2023** - [Amazon Linux
       * 2023](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) :
       * AWS Batch supports Amazon Linux 2023.
       *
       *
       * Amazon Linux 2023 does not support `A1` instances.
       *
       *
       * * **ECS_AL1** - [Amazon
       * Linux](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami)
       * . Amazon Linux has reached the end-of-life of standard support. For more information, see
       * [Amazon Linux AMI](https://docs.aws.amazon.com/amazon-linux-ami/) .
       * * **EKS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
       * EKS-optimized Amazon Linux
       * AMI](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) ( `EKS_AL2` ) is
       * used. If a new image type is specified in an update, but neither an `imageId` nor a
       * `imageIdOverride` parameter is specified, then the latest Amazon EKS optimized AMI for that
       * image type that AWS Batch supports is used.
       * * **EKS_AL2** - [Amazon Linux
       * 2](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) : Default for all
       * non-GPU instance families.
       * * **EKS_AL2_NVIDIA** - [Amazon Linux 2
       * (accelerated)](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) :
       * Default for all GPU instance families (for example, `P4` and `G4` ) and can be used for all
       * non AWS Graviton-based instance types.
       */
      public fun imageType(imageType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty.builder()

      /**
       * @param imageIdOverride The AMI ID used for instances launched in the compute environment
       * that match the image type.
       * This setting overrides the `imageId` set in the `computeResource` object.
       *
       *
       * The AMI that you choose for a compute environment must match the architecture of the
       * instance types that you intend to use for that compute environment. For example, if your
       * compute environment uses A1 instance types, the compute resource AMI that you choose must
       * support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized
       * Amazon Linux 2 AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun imageIdOverride(imageIdOverride: String) {
        cdkBuilder.imageIdOverride(imageIdOverride)
      }

      /**
       * @param imageKubernetesVersion The Kubernetes version for the compute environment.
       * If you don't specify a value, the latest version that AWS Batch supports is used.
       */
      override fun imageKubernetesVersion(imageKubernetesVersion: String) {
        cdkBuilder.imageKubernetesVersion(imageKubernetesVersion)
      }

      /**
       * @param imageType The image type to match with the instance type to select an AMI. 
       * The supported values are different for `ECS` and `EKS` resources.
       *
       * * **ECS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
       * ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami)
       * ( `ECS_AL2` ) is used. If a new image type is specified in an update, but neither an `imageId`
       * nor a `imageIdOverride` parameter is specified, then the latest Amazon ECS optimized AMI for
       * that image type that's supported by AWS Batch is used.
       * * **ECS_AL2** - [Amazon Linux
       * 2](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami)
       * : Default for all non-GPU instance families.
       * * **ECS_AL2_NVIDIA** - [Amazon Linux 2
       * (GPU)](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami)
       * : Default for all GPU instance families (for example `P4` and `G4` ) and can be used for all
       * non AWS Graviton-based instance types.
       * * **ECS_AL2023** - [Amazon Linux
       * 2023](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) :
       * AWS Batch supports Amazon Linux 2023.
       *
       *
       * Amazon Linux 2023 does not support `A1` instances.
       *
       *
       * * **ECS_AL1** - [Amazon
       * Linux](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami)
       * . Amazon Linux has reached the end-of-life of standard support. For more information, see
       * [Amazon Linux AMI](https://docs.aws.amazon.com/amazon-linux-ami/) .
       * * **EKS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
       * EKS-optimized Amazon Linux
       * AMI](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) ( `EKS_AL2` ) is
       * used. If a new image type is specified in an update, but neither an `imageId` nor a
       * `imageIdOverride` parameter is specified, then the latest Amazon EKS optimized AMI for that
       * image type that AWS Batch supports is used.
       * * **EKS_AL2** - [Amazon Linux
       * 2](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) : Default for all
       * non-GPU instance families.
       * * **EKS_AL2_NVIDIA** - [Amazon Linux 2
       * (accelerated)](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) :
       * Default for all GPU instance families (for example, `P4` and `G4` ) and can be used for all
       * non AWS Graviton-based instance types.
       */
      override fun imageType(imageType: String) {
        cdkBuilder.imageType(imageType)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty,
    ) : CdkObject(cdkObject), Ec2ConfigurationObjectProperty {
      /**
       * The AMI ID used for instances launched in the compute environment that match the image
       * type.
       *
       * This setting overrides the `imageId` set in the `computeResource` object.
       *
       *
       * The AMI that you choose for a compute environment must match the architecture of the
       * instance types that you intend to use for that compute environment. For example, if your
       * compute environment uses A1 instance types, the compute resource AMI that you choose must
       * support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized
       * Amazon Linux 2 AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html#cfn-batch-computeenvironment-ec2configurationobject-imageidoverride)
       */
      override fun imageIdOverride(): String? = unwrap(this).getImageIdOverride()

      /**
       * The Kubernetes version for the compute environment.
       *
       * If you don't specify a value, the latest version that AWS Batch supports is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html#cfn-batch-computeenvironment-ec2configurationobject-imagekubernetesversion)
       */
      override fun imageKubernetesVersion(): String? = unwrap(this).getImageKubernetesVersion()

      /**
       * The image type to match with the instance type to select an AMI.
       *
       * The supported values are different for `ECS` and `EKS` resources.
       *
       * * **ECS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
       * ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami)
       * ( `ECS_AL2` ) is used. If a new image type is specified in an update, but neither an `imageId`
       * nor a `imageIdOverride` parameter is specified, then the latest Amazon ECS optimized AMI for
       * that image type that's supported by AWS Batch is used.
       * * **ECS_AL2** - [Amazon Linux
       * 2](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami)
       * : Default for all non-GPU instance families.
       * * **ECS_AL2_NVIDIA** - [Amazon Linux 2
       * (GPU)](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami)
       * : Default for all GPU instance families (for example `P4` and `G4` ) and can be used for all
       * non AWS Graviton-based instance types.
       * * **ECS_AL2023** - [Amazon Linux
       * 2023](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) :
       * AWS Batch supports Amazon Linux 2023.
       *
       *
       * Amazon Linux 2023 does not support `A1` instances.
       *
       *
       * * **ECS_AL1** - [Amazon
       * Linux](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami)
       * . Amazon Linux has reached the end-of-life of standard support. For more information, see
       * [Amazon Linux AMI](https://docs.aws.amazon.com/amazon-linux-ami/) .
       * * **EKS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
       * EKS-optimized Amazon Linux
       * AMI](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) ( `EKS_AL2` ) is
       * used. If a new image type is specified in an update, but neither an `imageId` nor a
       * `imageIdOverride` parameter is specified, then the latest Amazon EKS optimized AMI for that
       * image type that AWS Batch supports is used.
       * * **EKS_AL2** - [Amazon Linux
       * 2](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) : Default for all
       * non-GPU instance families.
       * * **EKS_AL2_NVIDIA** - [Amazon Linux 2
       * (accelerated)](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) :
       * Default for all GPU instance families (for example, `P4` and `G4` ) and can be used for all
       * non AWS Graviton-based instance types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html#cfn-batch-computeenvironment-ec2configurationobject-imagetype)
       */
      override fun imageType(): String = unwrap(this).getImageType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Ec2ConfigurationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty):
          Ec2ConfigurationObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ec2ConfigurationObjectProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty
    }
  }

  /**
   * An object that represents a launch template that's associated with a compute resource.
   *
   * You must specify either the launch template ID or launch template name in the request, but not
   * both.
   *
   * If security groups are specified using both the `securityGroupIds` parameter of
   * `CreateComputeEnvironment` and the launch template, the values in the `securityGroupIds` parameter
   * of `CreateComputeEnvironment` will be used.
   *
   *
   * This object isn't applicable to jobs that are running on Fargate resources.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * LaunchTemplateSpecificationProperty launchTemplateSpecificationProperty =
   * LaunchTemplateSpecificationProperty.builder()
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html)
   */
  public interface LaunchTemplateSpecificationProperty {
    /**
     * The ID of the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-launchtemplateid)
     */
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * The name of the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-launchtemplatename)
     */
    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The version number of the launch template, `$Latest` , or `$Default` .
     *
     * If the value is `$Latest` , the latest version of the launch template is used. If the value
     * is `$Default` , the default version of the launch template is used.
     *
     *
     * If the AMI ID that's used in a compute environment is from the launch template, the AMI isn't
     * changed when the compute environment is updated. It's only changed if the
     * `updateToLatestImageVersion` parameter for the compute environment is set to `true` . During an
     * infrastructure update, if either `$Latest` or `$Default` is specified, AWS Batch re-evaluates
     * the launch template version, and it might use a different version of the launch template. This
     * is the case even if the launch template isn't specified in the update. When updating a compute
     * environment, changing the launch template requires an infrastructure update of the compute
     * environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * Default: `$Default` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [LaunchTemplateSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateId The ID of the launch template.
       */
      public fun launchTemplateId(launchTemplateId: String)

      /**
       * @param launchTemplateName The name of the launch template.
       */
      public fun launchTemplateName(launchTemplateName: String)

      /**
       * @param version The version number of the launch template, `$Latest` , or `$Default` .
       * If the value is `$Latest` , the latest version of the launch template is used. If the value
       * is `$Default` , the default version of the launch template is used.
       *
       *
       * If the AMI ID that's used in a compute environment is from the launch template, the AMI
       * isn't changed when the compute environment is updated. It's only changed if the
       * `updateToLatestImageVersion` parameter for the compute environment is set to `true` . During
       * an infrastructure update, if either `$Latest` or `$Default` is specified, AWS Batch
       * re-evaluates the launch template version, and it might use a different version of the launch
       * template. This is the case even if the launch template isn't specified in the update. When
       * updating a compute environment, changing the launch template requires an infrastructure update
       * of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * Default: `$Default` .
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.builder()

      /**
       * @param launchTemplateId The ID of the launch template.
       */
      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      /**
       * @param launchTemplateName The name of the launch template.
       */
      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      /**
       * @param version The version number of the launch template, `$Latest` , or `$Default` .
       * If the value is `$Latest` , the latest version of the launch template is used. If the value
       * is `$Default` , the default version of the launch template is used.
       *
       *
       * If the AMI ID that's used in a compute environment is from the launch template, the AMI
       * isn't changed when the compute environment is updated. It's only changed if the
       * `updateToLatestImageVersion` parameter for the compute environment is set to `true` . During
       * an infrastructure update, if either `$Latest` or `$Default` is specified, AWS Batch
       * re-evaluates the launch template version, and it might use a different version of the launch
       * template. This is the case even if the launch template isn't specified in the update. When
       * updating a compute environment, changing the launch template requires an infrastructure update
       * of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * Default: `$Default` .
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty,
    ) : CdkObject(cdkObject), LaunchTemplateSpecificationProperty {
      /**
       * The ID of the launch template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-launchtemplateid)
       */
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      /**
       * The name of the launch template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-launchtemplatename)
       */
      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      /**
       * The version number of the launch template, `$Latest` , or `$Default` .
       *
       * If the value is `$Latest` , the latest version of the launch template is used. If the value
       * is `$Default` , the default version of the launch template is used.
       *
       *
       * If the AMI ID that's used in a compute environment is from the launch template, the AMI
       * isn't changed when the compute environment is updated. It's only changed if the
       * `updateToLatestImageVersion` parameter for the compute environment is set to `true` . During
       * an infrastructure update, if either `$Latest` or `$Default` is specified, AWS Batch
       * re-evaluates the launch template version, and it might use a different version of the launch
       * template. This is the case even if the launch template isn't specified in the update. When
       * updating a compute environment, changing the launch template requires an infrastructure update
       * of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * Default: `$Default` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty):
          LaunchTemplateSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty
    }
  }

  /**
   * Specifies the infrastructure update policy for the compute environment.
   *
   * For more information about infrastructure updates, see [Updating compute
   * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
   * in the *AWS Batch User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * UpdatePolicyProperty updatePolicyProperty = UpdatePolicyProperty.builder()
   * .jobExecutionTimeoutMinutes(123)
   * .terminateJobsOnUpdate(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-updatepolicy.html)
   */
  public interface UpdatePolicyProperty {
    /**
     * Specifies the job timeout (in minutes) when the compute environment infrastructure is
     * updated.
     *
     * The default value is 30.
     *
     * Default: - 30
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-updatepolicy.html#cfn-batch-computeenvironment-updatepolicy-jobexecutiontimeoutminutes)
     */
    public fun jobExecutionTimeoutMinutes(): Number? = unwrap(this).getJobExecutionTimeoutMinutes()

    /**
     * Specifies whether jobs are automatically terminated when the computer environment
     * infrastructure is updated.
     *
     * The default value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-updatepolicy.html#cfn-batch-computeenvironment-updatepolicy-terminatejobsonupdate)
     */
    public fun terminateJobsOnUpdate(): Any? = unwrap(this).getTerminateJobsOnUpdate()

    /**
     * A builder for [UpdatePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jobExecutionTimeoutMinutes Specifies the job timeout (in minutes) when the compute
       * environment infrastructure is updated.
       * The default value is 30.
       */
      public fun jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes: Number)

      /**
       * @param terminateJobsOnUpdate Specifies whether jobs are automatically terminated when the
       * computer environment infrastructure is updated.
       * The default value is `false` .
       */
      public fun terminateJobsOnUpdate(terminateJobsOnUpdate: Boolean)

      /**
       * @param terminateJobsOnUpdate Specifies whether jobs are automatically terminated when the
       * computer environment infrastructure is updated.
       * The default value is `false` .
       */
      public fun terminateJobsOnUpdate(terminateJobsOnUpdate: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty.Builder =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty.builder()

      /**
       * @param jobExecutionTimeoutMinutes Specifies the job timeout (in minutes) when the compute
       * environment infrastructure is updated.
       * The default value is 30.
       */
      override fun jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes: Number) {
        cdkBuilder.jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes)
      }

      /**
       * @param terminateJobsOnUpdate Specifies whether jobs are automatically terminated when the
       * computer environment infrastructure is updated.
       * The default value is `false` .
       */
      override fun terminateJobsOnUpdate(terminateJobsOnUpdate: Boolean) {
        cdkBuilder.terminateJobsOnUpdate(terminateJobsOnUpdate)
      }

      /**
       * @param terminateJobsOnUpdate Specifies whether jobs are automatically terminated when the
       * computer environment infrastructure is updated.
       * The default value is `false` .
       */
      override fun terminateJobsOnUpdate(terminateJobsOnUpdate: IResolvable) {
        cdkBuilder.terminateJobsOnUpdate(terminateJobsOnUpdate.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty,
    ) : CdkObject(cdkObject), UpdatePolicyProperty {
      /**
       * Specifies the job timeout (in minutes) when the compute environment infrastructure is
       * updated.
       *
       * The default value is 30.
       *
       * Default: - 30
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-updatepolicy.html#cfn-batch-computeenvironment-updatepolicy-jobexecutiontimeoutminutes)
       */
      override fun jobExecutionTimeoutMinutes(): Number? =
          unwrap(this).getJobExecutionTimeoutMinutes()

      /**
       * Specifies whether jobs are automatically terminated when the computer environment
       * infrastructure is updated.
       *
       * The default value is `false` .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-updatepolicy.html#cfn-batch-computeenvironment-updatepolicy-terminatejobsonupdate)
       */
      override fun terminateJobsOnUpdate(): Any? = unwrap(this).getTerminateJobsOnUpdate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty):
          UpdatePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdatePolicyProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty
    }
  }

  /**
   * Details about the compute resources managed by the compute environment.
   *
   * This parameter is required for managed compute environments. For more information, see [Compute
   * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in the
   * *AWS Batch User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * ComputeResourcesProperty computeResourcesProperty = ComputeResourcesProperty.builder()
   * .maxvCpus(123)
   * .subnets(List.of("subnets"))
   * .type("type")
   * // the properties below are optional
   * .allocationStrategy("allocationStrategy")
   * .bidPercentage(123)
   * .desiredvCpus(123)
   * .ec2Configuration(List.of(Ec2ConfigurationObjectProperty.builder()
   * .imageType("imageType")
   * // the properties below are optional
   * .imageIdOverride("imageIdOverride")
   * .imageKubernetesVersion("imageKubernetesVersion")
   * .build()))
   * .ec2KeyPair("ec2KeyPair")
   * .imageId("imageId")
   * .instanceRole("instanceRole")
   * .instanceTypes(List.of("instanceTypes"))
   * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .version("version")
   * .build())
   * .minvCpus(123)
   * .placementGroup("placementGroup")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .spotIamFleetRole("spotIamFleetRole")
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .updateToLatestImageVersion(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html)
   */
  public interface ComputeResourcesProperty {
    /**
     * The allocation strategy to use for the compute resource if not enough instances of the best
     * fitting instance type can be allocated.
     *
     * This might be because of availability of the instance type in the Region or [Amazon EC2
     * service limits](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html) .
     * For more information, see [Allocation
     * strategies](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) in
     * the *AWS Batch User Guide* .
     *
     * When updating a compute environment, changing the allocation strategy requires an
     * infrastructure update of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* . `BEST_FIT` is not supported when updating a compute environment.
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't
     * be specified.
     *
     *
     * * **BEST_FIT (default)** - AWS Batch selects an instance type that best fits the needs of the
     * jobs with a preference for the lowest-cost instance type. If additional instances of the
     * selected instance type aren't available, AWS Batch waits for the additional instances to be
     * available. If there aren't enough instances available, or if the user is reaching [Amazon EC2
     * service limits](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html)
     * then additional jobs aren't run until the currently running jobs have completed. This allocation
     * strategy keeps costs lower but can limit scaling. If you are using Spot Fleets with `BEST_FIT`
     * then the Spot Fleet IAM role must be specified.
     * * **BEST_FIT_PROGRESSIVE** - AWS Batch will select additional instance types that are large
     * enough to meet the requirements of the jobs in the queue, with a preference for instance types
     * with a lower cost per unit vCPU. If additional instances of the previously selected instance
     * types aren't available, AWS Batch will select new instance types.
     * * **SPOT_CAPACITY_OPTIMIZED** - AWS Batch will select one or more instance types that are
     * large enough to meet the requirements of the jobs in the queue, with a preference for instance
     * types that are less likely to be interrupted. This allocation strategy is only available for
     * Spot Instance compute resources.
     * * **SPOT_PRICE_CAPACITY_OPTIMIZED** - The price and capacity optimized allocation strategy
     * looks at both price and capacity to select the Spot Instance pools that are the least likely to
     * be interrupted and have the lowest possible price. This allocation strategy is only available
     * for Spot Instance compute resources.
     *
     *
     * We recommend that you use `SPOT_PRICE_CAPACITY_OPTIMIZED` rather than
     * `SPOT_CAPACITY_OPTIMIZED` in most instances.
     *
     *
     * With `BEST_FIT_PROGRESSIVE` , `SPOT_CAPACITY_OPTIMIZED` , and `SPOT_PRICE_CAPACITY_OPTIMIZED`
     * allocation strategies using On-Demand or Spot Instances, and the `BEST_FIT` strategy using Spot
     * Instances, AWS Batch might need to go above `maxvCpus` to meet your capacity requirements. In
     * this event, AWS Batch never exceeds `maxvCpus` by more than a single instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
     */
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    /**
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand
     * price for that instance type before instances are launched.
     *
     * For example, if your maximum percentage is 20%, the Spot price must be less than 20% of the
     * current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price
     * and never more than your maximum percentage. For most use cases, we recommend leaving this field
     * empty.
     *
     * When updating a compute environment, changing the bid percentage requires an infrastructure
     * update of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
     */
    public fun bidPercentage(): Number? = unwrap(this).getBidPercentage()

    /**
     * The desired number of vCPUS in the compute environment.
     *
     * AWS Batch modifies this value between the minimum and maximum values based on job queue
     * demand.
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it. &gt; AWS Batch doesn't support changing the desired number of vCPUs of an existing compute
     * environment. Don't specify this parameter for compute environments using Amazon EKS clusters.
     * &gt; When you update the `desiredvCpus` setting, the value must be between the `minvCpus` and
     * `maxvCpus` values.
     *
     * Additionally, the updated `desiredvCpus` value must be greater than or equal to the current
     * `desiredvCpus` value. For more information, see [Troubleshooting AWS
     * Batch](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update)
     * in the *AWS Batch User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus)
     */
    public fun desiredvCpus(): Number? = unwrap(this).getDesiredvCpus()

    /**
     * Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in
     * the compute environment.
     *
     * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` .
     *
     * When updating a compute environment, changing this setting requires an infrastructure update
     * of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* . To remove the Amazon EC2 configuration and any custom AMI ID
     * specified in `imageIdOverride` , set this value to an empty string.
     *
     * One or two values can be provided.
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2configuration)
     */
    public fun ec2Configuration(): Any? = unwrap(this).getEc2Configuration()

    /**
     * The Amazon EC2 key pair that's used for instances launched in the compute environment.
     *
     * You can use this key pair to log in to your instances with SSH. To remove the Amazon EC2 key
     * pair, set this value to an empty string.
     *
     * When updating a compute environment, changing the Amazon EC2 key pair requires an
     * infrastructure update of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
     */
    public fun ec2KeyPair(): String? = unwrap(this).getEc2KeyPair()

    /**
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
     *
     * This parameter is overridden by the `imageIdOverride` member of the `Ec2Configuration`
     * structure. To remove the custom AMI ID and use the default AMI ID, set this value to an empty
     * string.
     *
     * When updating a compute environment, changing the AMI ID requires an infrastructure update of
     * the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it. &gt; The AMI that you choose for a compute environment must match the architecture of the
     * instance types that you intend to use for that compute environment. For example, if your compute
     * environment uses A1 instance types, the compute resource AMI that you choose must support ARM
     * instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized Amazon Linux 2
     * AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
     */
    public fun imageId(): String? = unwrap(this).getImageId()

    /**
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment.
     *
     * Required for Amazon EC2 instances. You can specify the short name or full Amazon Resource
     * Name (ARN) of an instance profile. For example, `*ecsInstanceRole*` or `arn:aws:iam::
     * *&lt;aws_account_id&gt;* :instance-profile/ *ecsInstanceRole*` . For more information, see
     * [Amazon ECS instance
     * role](https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html) in the *AWS
     * Batch User Guide* .
     *
     * When updating a compute environment, changing this setting requires an infrastructure update
     * of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
     */
    public fun instanceRole(): String? = unwrap(this).getInstanceRole()

    /**
     * The instances types that can be launched.
     *
     * You can specify instance families to launch any instance type within those families (for
     * example, `c5` or `p3` ), or you can specify specific sizes within a family (such as `c5.8xlarge`
     * ). You can also choose `optimal` to select instance types (from the C4, M4, and R4 instance
     * families) that match the demand of your job queues.
     *
     * When updating a compute environment, changing this setting requires an infrastructure update
     * of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it. &gt; When you create a compute environment, the instance types that you select for the
     * compute environment must share the same architecture. For example, you can't mix x86 and ARM
     * instances in the same compute environment. &gt; Currently, `optimal` uses instance types from
     * the C4, M4, and R4 instance families. In Regions that don't have instance types from those
     * instance families, instance types from the C5, M5, and R5 instance families are used.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
     */
    public fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

    /**
     * The launch template to use for your compute resources.
     *
     * Any other compute resource parameters that you specify in a
     * [CreateComputeEnvironment](https://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html)
     * API operation override the same parameters in the launch template. You must specify either the
     * launch template ID or launch template name in the request, but not both. For more information,
     * see [Launch Template
     * Support](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the ** .
     * Removing the launch template from a compute environment will not remove the AMI specified in the
     * launch template. In order to update the AMI specified in a launch template, the
     * `updateToLatestImageVersion` parameter must be set to `true` .
     *
     * When updating a compute environment, changing the launch template requires an infrastructure
     * update of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the ** .
     *
     *
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be
     * specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
     */
    public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    /**
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     *
     *
     * With `BEST_FIT_PROGRESSIVE` , `SPOT_CAPACITY_OPTIMIZED` and `SPOT_PRICE_CAPACITY_OPTIMIZED`
     * (recommended) strategies using On-Demand or Spot Instances, and the `BEST_FIT` strategy using
     * Spot Instances, AWS Batch might need to exceed `maxvCpus` to meet your capacity requirements. In
     * this event, AWS Batch never exceeds `maxvCpus` by more than a single instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
     */
    public fun maxvCpus(): Number

    /**
     * The minimum number of vCPUs that an environment should maintain (even if the compute
     * environment is `DISABLED` ).
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
     */
    public fun minvCpus(): Number? = unwrap(this).getMinvCpus()

    /**
     * The Amazon EC2 placement group to associate with your compute resources.
     *
     * If you intend to submit multi-node parallel jobs to your compute environment, you should
     * consider creating a cluster placement group and associate it with your compute resources. This
     * keeps your multi-node parallel job on a logical grouping of instances within a single
     * Availability Zone with high network flow potential. For more information, see [Placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * When updating a compute environment, changing the placement group requires an infrastructure
     * update of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup)
     */
    public fun placementGroup(): String? = unwrap(this).getPlacementGroup()

    /**
     * The Amazon EC2 security groups that are associated with instances launched in the compute
     * environment.
     *
     * This parameter is required for Fargate compute resources, where it can contain up to 5
     * security groups. For Fargate compute resources, providing an empty list is handled as if this
     * parameter wasn't specified and no change is made. For Amazon EC2 compute resources, providing an
     * empty list removes the security groups from the compute resource.
     *
     * When updating a compute environment, changing the Amazon EC2 security groups requires an
     * infrastructure update of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a `SPOT`
     * compute environment.
     *
     * This role is required if the allocation strategy set to `BEST_FIT` or if the allocation
     * strategy isn't specified. For more information, see [Amazon EC2 spot fleet
     * role](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html) in the *AWS
     * Batch User Guide* .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it. &gt; To tag your Spot Instances on creation, the Spot Fleet IAM role specified here must use
     * the newer *AmazonEC2SpotFleetTaggingRole* managed policy. The previously recommended
     * *AmazonEC2SpotFleetRole* managed policy doesn't have the required permissions to tag Spot
     * Instances. For more information, see [Spot instances not tagged on
     * creation](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#spot-instance-no-tag)
     * in the *AWS Batch User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole)
     */
    public fun spotIamFleetRole(): String? = unwrap(this).getSpotIamFleetRole()

    /**
     * The VPC subnets where the compute resources are launched.
     *
     * Fargate compute resources can contain up to 16 subnets. For Fargate compute resources,
     * providing an empty list will be handled as if this parameter wasn't specified and no change is
     * made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from the
     * compute resource. For more information, see [VPCs and
     * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
     * User Guide* .
     *
     * When updating a compute environment, changing the VPC subnets requires an infrastructure
     * update of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * AWS Batch on Amazon EC2 and AWS Batch on Amazon EKS support Local Zones. For more
     * information, see [Local
     * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones)
     * in the *Amazon EC2 User Guide for Linux Instances* , [Amazon EKS and AWS Local
     * Zones](https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html) in the *Amazon EKS
     * User Guide* and [Amazon ECS clusters in Local Zones, Wavelength Zones, and AWS
     * Outposts](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones)
     * in the *Amazon ECS Developer Guide* .
     *
     * AWS Batch on Fargate doesn't currently support Local Zones.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
     */
    public fun subnets(): List<String>

    /**
     * Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute
     * environment.
     *
     * For AWS Batch , these take the form of `"String1": "String2"` , where `String1` is the tag
     * key and `String2` is the tag value-for example, `{ "Name": "Batch Instance - C4OnDemand" }` .
     * This is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags
     * aren't seen when using the AWS Batch `ListTagsForResource` API operation.
     *
     * When updating a compute environment, changing this setting requires an infrastructure update
     * of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify
     * it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
     */
    public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The type of compute environment: `EC2` , `SPOT` , `FARGATE` , or `FARGATE_SPOT` .
     *
     * For more information, see [Compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
     * the *AWS Batch User Guide* .
     *
     * If you choose `SPOT` , you must also specify an Amazon EC2 Spot Fleet role with the
     * `spotIamFleetRole` parameter. For more information, see [Amazon EC2 spot fleet
     * role](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html) in the *AWS
     * Batch User Guide* .
     *
     * When updating compute environment, changing the type of a compute environment requires an
     * infrastructure update of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * When updating the type of a compute environment, changing between `EC2` and `SPOT` or between
     * `FARGATE` and `FARGATE_SPOT` will initiate an infrastructure update, but if you switch between
     * `EC2` and `FARGATE` , AWS CloudFormation will create a new compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
     */
    public fun type(): String

    /**
     * Specifies whether the AMI ID is updated to the latest one that's supported by AWS Batch when
     * the compute environment has an infrastructure update.
     *
     * The default value is `false` .
     *
     *
     * An AMI ID can either be specified in the `imageId` or `imageIdOverride` parameters or be
     * determined by the launch template that's specified in the `launchTemplate` parameter. If an AMI
     * ID is specified any of these ways, this parameter is ignored. For more information about to
     * update AMI IDs during an infrastructure update, see [Updating the AMI
     * ID](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami)
     * in the *AWS Batch User Guide* .
     *
     *
     * When updating a compute environment, changing this setting requires an infrastructure update
     * of the compute environment. For more information, see [Updating compute
     * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
     */
    public fun updateToLatestImageVersion(): Any? = unwrap(this).getUpdateToLatestImageVersion()

    /**
     * A builder for [ComputeResourcesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy The allocation strategy to use for the compute resource if not
       * enough instances of the best fitting instance type can be allocated.
       * This might be because of availability of the instance type in the Region or [Amazon EC2
       * service limits](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html)
       * . For more information, see [Allocation
       * strategies](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) in
       * the *AWS Batch User Guide* .
       *
       * When updating a compute environment, changing the allocation strategy requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . `BEST_FIT` is not supported when updating a compute
       * environment.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources, and
       * shouldn't be specified.
       *
       *
       * * **BEST_FIT (default)** - AWS Batch selects an instance type that best fits the needs of
       * the jobs with a preference for the lowest-cost instance type. If additional instances of the
       * selected instance type aren't available, AWS Batch waits for the additional instances to be
       * available. If there aren't enough instances available, or if the user is reaching [Amazon EC2
       * service limits](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html)
       * then additional jobs aren't run until the currently running jobs have completed. This
       * allocation strategy keeps costs lower but can limit scaling. If you are using Spot Fleets with
       * `BEST_FIT` then the Spot Fleet IAM role must be specified.
       * * **BEST_FIT_PROGRESSIVE** - AWS Batch will select additional instance types that are large
       * enough to meet the requirements of the jobs in the queue, with a preference for instance types
       * with a lower cost per unit vCPU. If additional instances of the previously selected instance
       * types aren't available, AWS Batch will select new instance types.
       * * **SPOT_CAPACITY_OPTIMIZED** - AWS Batch will select one or more instance types that are
       * large enough to meet the requirements of the jobs in the queue, with a preference for instance
       * types that are less likely to be interrupted. This allocation strategy is only available for
       * Spot Instance compute resources.
       * * **SPOT_PRICE_CAPACITY_OPTIMIZED** - The price and capacity optimized allocation strategy
       * looks at both price and capacity to select the Spot Instance pools that are the least likely
       * to be interrupted and have the lowest possible price. This allocation strategy is only
       * available for Spot Instance compute resources.
       *
       *
       * We recommend that you use `SPOT_PRICE_CAPACITY_OPTIMIZED` rather than
       * `SPOT_CAPACITY_OPTIMIZED` in most instances.
       *
       *
       * With `BEST_FIT_PROGRESSIVE` , `SPOT_CAPACITY_OPTIMIZED` , and
       * `SPOT_PRICE_CAPACITY_OPTIMIZED` allocation strategies using On-Demand or Spot Instances, and
       * the `BEST_FIT` strategy using Spot Instances, AWS Batch might need to go above `maxvCpus` to
       * meet your capacity requirements. In this event, AWS Batch never exceeds `maxvCpus` by more
       * than a single instance.
       */
      public fun allocationStrategy(allocationStrategy: String)

      /**
       * @param bidPercentage The maximum percentage that a Spot Instance price can be when compared
       * with the On-Demand price for that instance type before instances are launched.
       * For example, if your maximum percentage is 20%, the Spot price must be less than 20% of the
       * current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price
       * and never more than your maximum percentage. For most use cases, we recommend leaving this
       * field empty.
       *
       * When updating a compute environment, changing the bid percentage requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun bidPercentage(bidPercentage: Number)

      /**
       * @param desiredvCpus The desired number of vCPUS in the compute environment.
       * AWS Batch modifies this value between the minimum and maximum values based on job queue
       * demand.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; AWS Batch doesn't support changing the desired number of vCPUs of an existing
       * compute environment. Don't specify this parameter for compute environments using Amazon EKS
       * clusters. &gt; When you update the `desiredvCpus` setting, the value must be between the
       * `minvCpus` and `maxvCpus` values.
       *
       * Additionally, the updated `desiredvCpus` value must be greater than or equal to the current
       * `desiredvCpus` value. For more information, see [Troubleshooting AWS
       * Batch](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update)
       * in the *AWS Batch User Guide* .
       */
      public fun desiredvCpus(desiredvCpus: Number)

      /**
       * @param ec2Configuration Provides information used to select Amazon Machine Images (AMIs)
       * for Amazon EC2 instances in the compute environment.
       * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . To remove the Amazon EC2 configuration and any custom AMI ID
       * specified in `imageIdOverride` , set this value to an empty string.
       *
       * One or two values can be provided.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun ec2Configuration(ec2Configuration: IResolvable)

      /**
       * @param ec2Configuration Provides information used to select Amazon Machine Images (AMIs)
       * for Amazon EC2 instances in the compute environment.
       * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . To remove the Amazon EC2 configuration and any custom AMI ID
       * specified in `imageIdOverride` , set this value to an empty string.
       *
       * One or two values can be provided.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun ec2Configuration(ec2Configuration: List<Any>)

      /**
       * @param ec2Configuration Provides information used to select Amazon Machine Images (AMIs)
       * for Amazon EC2 instances in the compute environment.
       * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . To remove the Amazon EC2 configuration and any custom AMI ID
       * specified in `imageIdOverride` , set this value to an empty string.
       *
       * One or two values can be provided.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun ec2Configuration(vararg ec2Configuration: Any)

      /**
       * @param ec2KeyPair The Amazon EC2 key pair that's used for instances launched in the compute
       * environment.
       * You can use this key pair to log in to your instances with SSH. To remove the Amazon EC2
       * key pair, set this value to an empty string.
       *
       * When updating a compute environment, changing the Amazon EC2 key pair requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun ec2KeyPair(ec2KeyPair: String)

      /**
       * @param imageId The Amazon Machine Image (AMI) ID used for instances launched in the compute
       * environment.
       * This parameter is overridden by the `imageIdOverride` member of the `Ec2Configuration`
       * structure. To remove the custom AMI ID and use the default AMI ID, set this value to an empty
       * string.
       *
       * When updating a compute environment, changing the AMI ID requires an infrastructure update
       * of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; The AMI that you choose for a compute environment must match the architecture
       * of the instance types that you intend to use for that compute environment. For example, if
       * your compute environment uses A1 instance types, the compute resource AMI that you choose must
       * support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized
       * Amazon Linux 2 AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun imageId(imageId: String)

      /**
       * @param instanceRole The Amazon ECS instance profile applied to Amazon EC2 instances in a
       * compute environment.
       * Required for Amazon EC2 instances. You can specify the short name or full Amazon Resource
       * Name (ARN) of an instance profile. For example, `*ecsInstanceRole*` or `arn:aws:iam::
       * *&lt;aws_account_id&gt;* :instance-profile/ *ecsInstanceRole*` . For more information, see
       * [Amazon ECS instance
       * role](https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun instanceRole(instanceRole: String)

      /**
       * @param instanceTypes The instances types that can be launched.
       * You can specify instance families to launch any instance type within those families (for
       * example, `c5` or `p3` ), or you can specify specific sizes within a family (such as
       * `c5.8xlarge` ). You can also choose `optimal` to select instance types (from the C4, M4, and
       * R4 instance families) that match the demand of your job queues.
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; When you create a compute environment, the instance types that you select for
       * the compute environment must share the same architecture. For example, you can't mix x86 and
       * ARM instances in the same compute environment. &gt; Currently, `optimal` uses instance types
       * from the C4, M4, and R4 instance families. In Regions that don't have instance types from
       * those instance families, instance types from the C5, M5, and R5 instance families are used.
       */
      public fun instanceTypes(instanceTypes: List<String>)

      /**
       * @param instanceTypes The instances types that can be launched.
       * You can specify instance families to launch any instance type within those families (for
       * example, `c5` or `p3` ), or you can specify specific sizes within a family (such as
       * `c5.8xlarge` ). You can also choose `optimal` to select instance types (from the C4, M4, and
       * R4 instance families) that match the demand of your job queues.
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; When you create a compute environment, the instance types that you select for
       * the compute environment must share the same architecture. For example, you can't mix x86 and
       * ARM instances in the same compute environment. &gt; Currently, `optimal` uses instance types
       * from the C4, M4, and R4 instance families. In Regions that don't have instance types from
       * those instance families, instance types from the C5, M5, and R5 instance families are used.
       */
      public fun instanceTypes(vararg instanceTypes: String)

      /**
       * @param launchTemplate The launch template to use for your compute resources.
       * Any other compute resource parameters that you specify in a
       * [CreateComputeEnvironment](https://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html)
       * API operation override the same parameters in the launch template. You must specify either the
       * launch template ID or launch template name in the request, but not both. For more information,
       * see [Launch Template
       * Support](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the ** .
       * Removing the launch template from a compute environment will not remove the AMI specified in
       * the launch template. In order to update the AMI specified in a launch template, the
       * `updateToLatestImageVersion` parameter must be set to `true` .
       *
       * When updating a compute environment, changing the launch template requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the ** .
       *
       *
       * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be
       * specified.
       */
      public fun launchTemplate(launchTemplate: IResolvable)

      /**
       * @param launchTemplate The launch template to use for your compute resources.
       * Any other compute resource parameters that you specify in a
       * [CreateComputeEnvironment](https://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html)
       * API operation override the same parameters in the launch template. You must specify either the
       * launch template ID or launch template name in the request, but not both. For more information,
       * see [Launch Template
       * Support](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the ** .
       * Removing the launch template from a compute environment will not remove the AMI specified in
       * the launch template. In order to update the AMI specified in a launch template, the
       * `updateToLatestImageVersion` parameter must be set to `true` .
       *
       * When updating a compute environment, changing the launch template requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the ** .
       *
       *
       * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be
       * specified.
       */
      public fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty)

      /**
       * @param launchTemplate The launch template to use for your compute resources.
       * Any other compute resource parameters that you specify in a
       * [CreateComputeEnvironment](https://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html)
       * API operation override the same parameters in the launch template. You must specify either the
       * launch template ID or launch template name in the request, but not both. For more information,
       * see [Launch Template
       * Support](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the ** .
       * Removing the launch template from a compute environment will not remove the AMI specified in
       * the launch template. In order to update the AMI specified in a launch template, the
       * `updateToLatestImageVersion` parameter must be set to `true` .
       *
       * When updating a compute environment, changing the launch template requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the ** .
       *
       *
       * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be
       * specified.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bd41018a6fa33ec98a87098a1d8f9d11f4aa26819b580cb26432a7dddf3ff5f")
      public
          fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

      /**
       * @param maxvCpus The maximum number of Amazon EC2 vCPUs that an environment can reach. 
       *
       * With `BEST_FIT_PROGRESSIVE` , `SPOT_CAPACITY_OPTIMIZED` and `SPOT_PRICE_CAPACITY_OPTIMIZED`
       * (recommended) strategies using On-Demand or Spot Instances, and the `BEST_FIT` strategy using
       * Spot Instances, AWS Batch might need to exceed `maxvCpus` to meet your capacity requirements.
       * In this event, AWS Batch never exceeds `maxvCpus` by more than a single instance.
       */
      public fun maxvCpus(maxvCpus: Number)

      /**
       * @param minvCpus The minimum number of vCPUs that an environment should maintain (even if
       * the compute environment is `DISABLED` ).
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun minvCpus(minvCpus: Number)

      /**
       * @param placementGroup The Amazon EC2 placement group to associate with your compute
       * resources.
       * If you intend to submit multi-node parallel jobs to your compute environment, you should
       * consider creating a cluster placement group and associate it with your compute resources. This
       * keeps your multi-node parallel job on a logical grouping of instances within a single
       * Availability Zone with high network flow potential. For more information, see [Placement
       * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * When updating a compute environment, changing the placement group requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun placementGroup(placementGroup: String)

      /**
       * @param securityGroupIds The Amazon EC2 security groups that are associated with instances
       * launched in the compute environment.
       * This parameter is required for Fargate compute resources, where it can contain up to 5
       * security groups. For Fargate compute resources, providing an empty list is handled as if this
       * parameter wasn't specified and no change is made. For Amazon EC2 compute resources, providing
       * an empty list removes the security groups from the compute resource.
       *
       * When updating a compute environment, changing the Amazon EC2 security groups requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The Amazon EC2 security groups that are associated with instances
       * launched in the compute environment.
       * This parameter is required for Fargate compute resources, where it can contain up to 5
       * security groups. For Fargate compute resources, providing an empty list is handled as if this
       * parameter wasn't specified and no change is made. For Amazon EC2 compute resources, providing
       * an empty list removes the security groups from the compute resource.
       *
       * When updating a compute environment, changing the Amazon EC2 security groups requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param spotIamFleetRole The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM
       * role applied to a `SPOT` compute environment.
       * This role is required if the allocation strategy set to `BEST_FIT` or if the allocation
       * strategy isn't specified. For more information, see [Amazon EC2 spot fleet
       * role](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; To tag your Spot Instances on creation, the Spot Fleet IAM role specified
       * here must use the newer *AmazonEC2SpotFleetTaggingRole* managed policy. The previously
       * recommended *AmazonEC2SpotFleetRole* managed policy doesn't have the required permissions to
       * tag Spot Instances. For more information, see [Spot instances not tagged on
       * creation](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#spot-instance-no-tag)
       * in the *AWS Batch User Guide* .
       */
      public fun spotIamFleetRole(spotIamFleetRole: String)

      /**
       * @param subnets The VPC subnets where the compute resources are launched. 
       * Fargate compute resources can contain up to 16 subnets. For Fargate compute resources,
       * providing an empty list will be handled as if this parameter wasn't specified and no change is
       * made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from
       * the compute resource. For more information, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * When updating a compute environment, changing the VPC subnets requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * AWS Batch on Amazon EC2 and AWS Batch on Amazon EKS support Local Zones. For more
       * information, see [Local
       * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones)
       * in the *Amazon EC2 User Guide for Linux Instances* , [Amazon EKS and AWS Local
       * Zones](https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html) in the *Amazon EKS
       * User Guide* and [Amazon ECS clusters in Local Zones, Wavelength Zones, and AWS
       * Outposts](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones)
       * in the *Amazon ECS Developer Guide* .
       *
       * AWS Batch on Fargate doesn't currently support Local Zones.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The VPC subnets where the compute resources are launched. 
       * Fargate compute resources can contain up to 16 subnets. For Fargate compute resources,
       * providing an empty list will be handled as if this parameter wasn't specified and no change is
       * made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from
       * the compute resource. For more information, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * When updating a compute environment, changing the VPC subnets requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * AWS Batch on Amazon EC2 and AWS Batch on Amazon EKS support Local Zones. For more
       * information, see [Local
       * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones)
       * in the *Amazon EC2 User Guide for Linux Instances* , [Amazon EKS and AWS Local
       * Zones](https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html) in the *Amazon EKS
       * User Guide* and [Amazon ECS clusters in Local Zones, Wavelength Zones, and AWS
       * Outposts](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones)
       * in the *Amazon ECS Developer Guide* .
       *
       * AWS Batch on Fargate doesn't currently support Local Zones.
       */
      public fun subnets(vararg subnets: String)

      /**
       * @param tags Key-value pair tags to be applied to Amazon EC2 resources that are launched in
       * the compute environment.
       * For AWS Batch , these take the form of `"String1": "String2"` , where `String1` is the tag
       * key and `String2` is the tag value-for example, `{ "Name": "Batch Instance - C4OnDemand" }` .
       * This is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags
       * aren't seen when using the AWS Batch `ListTagsForResource` API operation.
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      public fun tags(tags: Map<String, String>)

      /**
       * @param type The type of compute environment: `EC2` , `SPOT` , `FARGATE` , or `FARGATE_SPOT`
       * . 
       * For more information, see [Compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
       * the *AWS Batch User Guide* .
       *
       * If you choose `SPOT` , you must also specify an Amazon EC2 Spot Fleet role with the
       * `spotIamFleetRole` parameter. For more information, see [Amazon EC2 spot fleet
       * role](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       * When updating compute environment, changing the type of a compute environment requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       * When updating the type of a compute environment, changing between `EC2` and `SPOT` or
       * between `FARGATE` and `FARGATE_SPOT` will initiate an infrastructure update, but if you switch
       * between `EC2` and `FARGATE` , AWS CloudFormation will create a new compute environment.
       */
      public fun type(type: String)

      /**
       * @param updateToLatestImageVersion Specifies whether the AMI ID is updated to the latest one
       * that's supported by AWS Batch when the compute environment has an infrastructure update.
       * The default value is `false` .
       *
       *
       * An AMI ID can either be specified in the `imageId` or `imageIdOverride` parameters or be
       * determined by the launch template that's specified in the `launchTemplate` parameter. If an
       * AMI ID is specified any of these ways, this parameter is ignored. For more information about
       * to update AMI IDs during an infrastructure update, see [Updating the AMI
       * ID](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami)
       * in the *AWS Batch User Guide* .
       *
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       */
      public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean)

      /**
       * @param updateToLatestImageVersion Specifies whether the AMI ID is updated to the latest one
       * that's supported by AWS Batch when the compute environment has an infrastructure update.
       * The default value is `false` .
       *
       *
       * An AMI ID can either be specified in the `imageId` or `imageIdOverride` parameters or be
       * determined by the launch template that's specified in the `launchTemplate` parameter. If an
       * AMI ID is specified any of these ways, this parameter is ignored. For more information about
       * to update AMI IDs during an infrastructure update, see [Updating the AMI
       * ID](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami)
       * in the *AWS Batch User Guide* .
       *
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       */
      public fun updateToLatestImageVersion(updateToLatestImageVersion: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.builder()

      /**
       * @param allocationStrategy The allocation strategy to use for the compute resource if not
       * enough instances of the best fitting instance type can be allocated.
       * This might be because of availability of the instance type in the Region or [Amazon EC2
       * service limits](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html)
       * . For more information, see [Allocation
       * strategies](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) in
       * the *AWS Batch User Guide* .
       *
       * When updating a compute environment, changing the allocation strategy requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . `BEST_FIT` is not supported when updating a compute
       * environment.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources, and
       * shouldn't be specified.
       *
       *
       * * **BEST_FIT (default)** - AWS Batch selects an instance type that best fits the needs of
       * the jobs with a preference for the lowest-cost instance type. If additional instances of the
       * selected instance type aren't available, AWS Batch waits for the additional instances to be
       * available. If there aren't enough instances available, or if the user is reaching [Amazon EC2
       * service limits](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html)
       * then additional jobs aren't run until the currently running jobs have completed. This
       * allocation strategy keeps costs lower but can limit scaling. If you are using Spot Fleets with
       * `BEST_FIT` then the Spot Fleet IAM role must be specified.
       * * **BEST_FIT_PROGRESSIVE** - AWS Batch will select additional instance types that are large
       * enough to meet the requirements of the jobs in the queue, with a preference for instance types
       * with a lower cost per unit vCPU. If additional instances of the previously selected instance
       * types aren't available, AWS Batch will select new instance types.
       * * **SPOT_CAPACITY_OPTIMIZED** - AWS Batch will select one or more instance types that are
       * large enough to meet the requirements of the jobs in the queue, with a preference for instance
       * types that are less likely to be interrupted. This allocation strategy is only available for
       * Spot Instance compute resources.
       * * **SPOT_PRICE_CAPACITY_OPTIMIZED** - The price and capacity optimized allocation strategy
       * looks at both price and capacity to select the Spot Instance pools that are the least likely
       * to be interrupted and have the lowest possible price. This allocation strategy is only
       * available for Spot Instance compute resources.
       *
       *
       * We recommend that you use `SPOT_PRICE_CAPACITY_OPTIMIZED` rather than
       * `SPOT_CAPACITY_OPTIMIZED` in most instances.
       *
       *
       * With `BEST_FIT_PROGRESSIVE` , `SPOT_CAPACITY_OPTIMIZED` , and
       * `SPOT_PRICE_CAPACITY_OPTIMIZED` allocation strategies using On-Demand or Spot Instances, and
       * the `BEST_FIT` strategy using Spot Instances, AWS Batch might need to go above `maxvCpus` to
       * meet your capacity requirements. In this event, AWS Batch never exceeds `maxvCpus` by more
       * than a single instance.
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      /**
       * @param bidPercentage The maximum percentage that a Spot Instance price can be when compared
       * with the On-Demand price for that instance type before instances are launched.
       * For example, if your maximum percentage is 20%, the Spot price must be less than 20% of the
       * current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price
       * and never more than your maximum percentage. For most use cases, we recommend leaving this
       * field empty.
       *
       * When updating a compute environment, changing the bid percentage requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun bidPercentage(bidPercentage: Number) {
        cdkBuilder.bidPercentage(bidPercentage)
      }

      /**
       * @param desiredvCpus The desired number of vCPUS in the compute environment.
       * AWS Batch modifies this value between the minimum and maximum values based on job queue
       * demand.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; AWS Batch doesn't support changing the desired number of vCPUs of an existing
       * compute environment. Don't specify this parameter for compute environments using Amazon EKS
       * clusters. &gt; When you update the `desiredvCpus` setting, the value must be between the
       * `minvCpus` and `maxvCpus` values.
       *
       * Additionally, the updated `desiredvCpus` value must be greater than or equal to the current
       * `desiredvCpus` value. For more information, see [Troubleshooting AWS
       * Batch](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update)
       * in the *AWS Batch User Guide* .
       */
      override fun desiredvCpus(desiredvCpus: Number) {
        cdkBuilder.desiredvCpus(desiredvCpus)
      }

      /**
       * @param ec2Configuration Provides information used to select Amazon Machine Images (AMIs)
       * for Amazon EC2 instances in the compute environment.
       * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . To remove the Amazon EC2 configuration and any custom AMI ID
       * specified in `imageIdOverride` , set this value to an empty string.
       *
       * One or two values can be provided.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun ec2Configuration(ec2Configuration: IResolvable) {
        cdkBuilder.ec2Configuration(ec2Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param ec2Configuration Provides information used to select Amazon Machine Images (AMIs)
       * for Amazon EC2 instances in the compute environment.
       * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . To remove the Amazon EC2 configuration and any custom AMI ID
       * specified in `imageIdOverride` , set this value to an empty string.
       *
       * One or two values can be provided.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun ec2Configuration(ec2Configuration: List<Any>) {
        cdkBuilder.ec2Configuration(ec2Configuration)
      }

      /**
       * @param ec2Configuration Provides information used to select Amazon Machine Images (AMIs)
       * for Amazon EC2 instances in the compute environment.
       * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . To remove the Amazon EC2 configuration and any custom AMI ID
       * specified in `imageIdOverride` , set this value to an empty string.
       *
       * One or two values can be provided.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun ec2Configuration(vararg ec2Configuration: Any): Unit =
          ec2Configuration(ec2Configuration.toList())

      /**
       * @param ec2KeyPair The Amazon EC2 key pair that's used for instances launched in the compute
       * environment.
       * You can use this key pair to log in to your instances with SSH. To remove the Amazon EC2
       * key pair, set this value to an empty string.
       *
       * When updating a compute environment, changing the Amazon EC2 key pair requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun ec2KeyPair(ec2KeyPair: String) {
        cdkBuilder.ec2KeyPair(ec2KeyPair)
      }

      /**
       * @param imageId The Amazon Machine Image (AMI) ID used for instances launched in the compute
       * environment.
       * This parameter is overridden by the `imageIdOverride` member of the `Ec2Configuration`
       * structure. To remove the custom AMI ID and use the default AMI ID, set this value to an empty
       * string.
       *
       * When updating a compute environment, changing the AMI ID requires an infrastructure update
       * of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; The AMI that you choose for a compute environment must match the architecture
       * of the instance types that you intend to use for that compute environment. For example, if
       * your compute environment uses A1 instance types, the compute resource AMI that you choose must
       * support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized
       * Amazon Linux 2 AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
      }

      /**
       * @param instanceRole The Amazon ECS instance profile applied to Amazon EC2 instances in a
       * compute environment.
       * Required for Amazon EC2 instances. You can specify the short name or full Amazon Resource
       * Name (ARN) of an instance profile. For example, `*ecsInstanceRole*` or `arn:aws:iam::
       * *&lt;aws_account_id&gt;* :instance-profile/ *ecsInstanceRole*` . For more information, see
       * [Amazon ECS instance
       * role](https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun instanceRole(instanceRole: String) {
        cdkBuilder.instanceRole(instanceRole)
      }

      /**
       * @param instanceTypes The instances types that can be launched.
       * You can specify instance families to launch any instance type within those families (for
       * example, `c5` or `p3` ), or you can specify specific sizes within a family (such as
       * `c5.8xlarge` ). You can also choose `optimal` to select instance types (from the C4, M4, and
       * R4 instance families) that match the demand of your job queues.
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; When you create a compute environment, the instance types that you select for
       * the compute environment must share the same architecture. For example, you can't mix x86 and
       * ARM instances in the same compute environment. &gt; Currently, `optimal` uses instance types
       * from the C4, M4, and R4 instance families. In Regions that don't have instance types from
       * those instance families, instance types from the C5, M5, and R5 instance families are used.
       */
      override fun instanceTypes(instanceTypes: List<String>) {
        cdkBuilder.instanceTypes(instanceTypes)
      }

      /**
       * @param instanceTypes The instances types that can be launched.
       * You can specify instance families to launch any instance type within those families (for
       * example, `c5` or `p3` ), or you can specify specific sizes within a family (such as
       * `c5.8xlarge` ). You can also choose `optimal` to select instance types (from the C4, M4, and
       * R4 instance families) that match the demand of your job queues.
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; When you create a compute environment, the instance types that you select for
       * the compute environment must share the same architecture. For example, you can't mix x86 and
       * ARM instances in the same compute environment. &gt; Currently, `optimal` uses instance types
       * from the C4, M4, and R4 instance families. In Regions that don't have instance types from
       * those instance families, instance types from the C5, M5, and R5 instance families are used.
       */
      override fun instanceTypes(vararg instanceTypes: String): Unit =
          instanceTypes(instanceTypes.toList())

      /**
       * @param launchTemplate The launch template to use for your compute resources.
       * Any other compute resource parameters that you specify in a
       * [CreateComputeEnvironment](https://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html)
       * API operation override the same parameters in the launch template. You must specify either the
       * launch template ID or launch template name in the request, but not both. For more information,
       * see [Launch Template
       * Support](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the ** .
       * Removing the launch template from a compute environment will not remove the AMI specified in
       * the launch template. In order to update the AMI specified in a launch template, the
       * `updateToLatestImageVersion` parameter must be set to `true` .
       *
       * When updating a compute environment, changing the launch template requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the ** .
       *
       *
       * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be
       * specified.
       */
      override fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplate The launch template to use for your compute resources.
       * Any other compute resource parameters that you specify in a
       * [CreateComputeEnvironment](https://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html)
       * API operation override the same parameters in the launch template. You must specify either the
       * launch template ID or launch template name in the request, but not both. For more information,
       * see [Launch Template
       * Support](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the ** .
       * Removing the launch template from a compute environment will not remove the AMI specified in
       * the launch template. In order to update the AMI specified in a launch template, the
       * `updateToLatestImageVersion` parameter must be set to `true` .
       *
       * When updating a compute environment, changing the launch template requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the ** .
       *
       *
       * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be
       * specified.
       */
      override fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateSpecificationProperty::unwrap))
      }

      /**
       * @param launchTemplate The launch template to use for your compute resources.
       * Any other compute resource parameters that you specify in a
       * [CreateComputeEnvironment](https://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html)
       * API operation override the same parameters in the launch template. You must specify either the
       * launch template ID or launch template name in the request, but not both. For more information,
       * see [Launch Template
       * Support](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the ** .
       * Removing the launch template from a compute environment will not remove the AMI specified in
       * the launch template. In order to update the AMI specified in a launch template, the
       * `updateToLatestImageVersion` parameter must be set to `true` .
       *
       * When updating a compute environment, changing the launch template requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the ** .
       *
       *
       * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be
       * specified.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bd41018a6fa33ec98a87098a1d8f9d11f4aa26819b580cb26432a7dddf3ff5f")
      override
          fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit = launchTemplate(LaunchTemplateSpecificationProperty(launchTemplate))

      /**
       * @param maxvCpus The maximum number of Amazon EC2 vCPUs that an environment can reach. 
       *
       * With `BEST_FIT_PROGRESSIVE` , `SPOT_CAPACITY_OPTIMIZED` and `SPOT_PRICE_CAPACITY_OPTIMIZED`
       * (recommended) strategies using On-Demand or Spot Instances, and the `BEST_FIT` strategy using
       * Spot Instances, AWS Batch might need to exceed `maxvCpus` to meet your capacity requirements.
       * In this event, AWS Batch never exceeds `maxvCpus` by more than a single instance.
       */
      override fun maxvCpus(maxvCpus: Number) {
        cdkBuilder.maxvCpus(maxvCpus)
      }

      /**
       * @param minvCpus The minimum number of vCPUs that an environment should maintain (even if
       * the compute environment is `DISABLED` ).
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun minvCpus(minvCpus: Number) {
        cdkBuilder.minvCpus(minvCpus)
      }

      /**
       * @param placementGroup The Amazon EC2 placement group to associate with your compute
       * resources.
       * If you intend to submit multi-node parallel jobs to your compute environment, you should
       * consider creating a cluster placement group and associate it with your compute resources. This
       * keeps your multi-node parallel job on a logical grouping of instances within a single
       * Availability Zone with high network flow potential. For more information, see [Placement
       * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * When updating a compute environment, changing the placement group requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun placementGroup(placementGroup: String) {
        cdkBuilder.placementGroup(placementGroup)
      }

      /**
       * @param securityGroupIds The Amazon EC2 security groups that are associated with instances
       * launched in the compute environment.
       * This parameter is required for Fargate compute resources, where it can contain up to 5
       * security groups. For Fargate compute resources, providing an empty list is handled as if this
       * parameter wasn't specified and no change is made. For Amazon EC2 compute resources, providing
       * an empty list removes the security groups from the compute resource.
       *
       * When updating a compute environment, changing the Amazon EC2 security groups requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The Amazon EC2 security groups that are associated with instances
       * launched in the compute environment.
       * This parameter is required for Fargate compute resources, where it can contain up to 5
       * security groups. For Fargate compute resources, providing an empty list is handled as if this
       * parameter wasn't specified and no change is made. For Amazon EC2 compute resources, providing
       * an empty list removes the security groups from the compute resource.
       *
       * When updating a compute environment, changing the Amazon EC2 security groups requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param spotIamFleetRole The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM
       * role applied to a `SPOT` compute environment.
       * This role is required if the allocation strategy set to `BEST_FIT` or if the allocation
       * strategy isn't specified. For more information, see [Amazon EC2 spot fleet
       * role](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; To tag your Spot Instances on creation, the Spot Fleet IAM role specified
       * here must use the newer *AmazonEC2SpotFleetTaggingRole* managed policy. The previously
       * recommended *AmazonEC2SpotFleetRole* managed policy doesn't have the required permissions to
       * tag Spot Instances. For more information, see [Spot instances not tagged on
       * creation](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#spot-instance-no-tag)
       * in the *AWS Batch User Guide* .
       */
      override fun spotIamFleetRole(spotIamFleetRole: String) {
        cdkBuilder.spotIamFleetRole(spotIamFleetRole)
      }

      /**
       * @param subnets The VPC subnets where the compute resources are launched. 
       * Fargate compute resources can contain up to 16 subnets. For Fargate compute resources,
       * providing an empty list will be handled as if this parameter wasn't specified and no change is
       * made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from
       * the compute resource. For more information, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * When updating a compute environment, changing the VPC subnets requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * AWS Batch on Amazon EC2 and AWS Batch on Amazon EKS support Local Zones. For more
       * information, see [Local
       * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones)
       * in the *Amazon EC2 User Guide for Linux Instances* , [Amazon EKS and AWS Local
       * Zones](https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html) in the *Amazon EKS
       * User Guide* and [Amazon ECS clusters in Local Zones, Wavelength Zones, and AWS
       * Outposts](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones)
       * in the *Amazon ECS Developer Guide* .
       *
       * AWS Batch on Fargate doesn't currently support Local Zones.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The VPC subnets where the compute resources are launched. 
       * Fargate compute resources can contain up to 16 subnets. For Fargate compute resources,
       * providing an empty list will be handled as if this parameter wasn't specified and no change is
       * made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from
       * the compute resource. For more information, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * When updating a compute environment, changing the VPC subnets requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * AWS Batch on Amazon EC2 and AWS Batch on Amazon EKS support Local Zones. For more
       * information, see [Local
       * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones)
       * in the *Amazon EC2 User Guide for Linux Instances* , [Amazon EKS and AWS Local
       * Zones](https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html) in the *Amazon EKS
       * User Guide* and [Amazon ECS clusters in Local Zones, Wavelength Zones, and AWS
       * Outposts](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones)
       * in the *Amazon ECS Developer Guide* .
       *
       * AWS Batch on Fargate doesn't currently support Local Zones.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      /**
       * @param tags Key-value pair tags to be applied to Amazon EC2 resources that are launched in
       * the compute environment.
       * For AWS Batch , these take the form of `"String1": "String2"` , where `String1` is the tag
       * key and `String2` is the tag value-for example, `{ "Name": "Batch Instance - C4OnDemand" }` .
       * This is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags
       * aren't seen when using the AWS Batch `ListTagsForResource` API operation.
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       */
      override fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
      }

      /**
       * @param type The type of compute environment: `EC2` , `SPOT` , `FARGATE` , or `FARGATE_SPOT`
       * . 
       * For more information, see [Compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
       * the *AWS Batch User Guide* .
       *
       * If you choose `SPOT` , you must also specify an Amazon EC2 Spot Fleet role with the
       * `spotIamFleetRole` parameter. For more information, see [Amazon EC2 spot fleet
       * role](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       * When updating compute environment, changing the type of a compute environment requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       * When updating the type of a compute environment, changing between `EC2` and `SPOT` or
       * between `FARGATE` and `FARGATE_SPOT` will initiate an infrastructure update, but if you switch
       * between `EC2` and `FARGATE` , AWS CloudFormation will create a new compute environment.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param updateToLatestImageVersion Specifies whether the AMI ID is updated to the latest one
       * that's supported by AWS Batch when the compute environment has an infrastructure update.
       * The default value is `false` .
       *
       *
       * An AMI ID can either be specified in the `imageId` or `imageIdOverride` parameters or be
       * determined by the launch template that's specified in the `launchTemplate` parameter. If an
       * AMI ID is specified any of these ways, this parameter is ignored. For more information about
       * to update AMI IDs during an infrastructure update, see [Updating the AMI
       * ID](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami)
       * in the *AWS Batch User Guide* .
       *
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       */
      override fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
        cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
      }

      /**
       * @param updateToLatestImageVersion Specifies whether the AMI ID is updated to the latest one
       * that's supported by AWS Batch when the compute environment has an infrastructure update.
       * The default value is `false` .
       *
       *
       * An AMI ID can either be specified in the `imageId` or `imageIdOverride` parameters or be
       * determined by the launch template that's specified in the `launchTemplate` parameter. If an
       * AMI ID is specified any of these ways, this parameter is ignored. For more information about
       * to update AMI IDs during an infrastructure update, see [Updating the AMI
       * ID](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami)
       * in the *AWS Batch User Guide* .
       *
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       */
      override fun updateToLatestImageVersion(updateToLatestImageVersion: IResolvable) {
        cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty,
    ) : CdkObject(cdkObject), ComputeResourcesProperty {
      /**
       * The allocation strategy to use for the compute resource if not enough instances of the best
       * fitting instance type can be allocated.
       *
       * This might be because of availability of the instance type in the Region or [Amazon EC2
       * service limits](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html)
       * . For more information, see [Allocation
       * strategies](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) in
       * the *AWS Batch User Guide* .
       *
       * When updating a compute environment, changing the allocation strategy requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . `BEST_FIT` is not supported when updating a compute
       * environment.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources, and
       * shouldn't be specified.
       *
       *
       * * **BEST_FIT (default)** - AWS Batch selects an instance type that best fits the needs of
       * the jobs with a preference for the lowest-cost instance type. If additional instances of the
       * selected instance type aren't available, AWS Batch waits for the additional instances to be
       * available. If there aren't enough instances available, or if the user is reaching [Amazon EC2
       * service limits](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html)
       * then additional jobs aren't run until the currently running jobs have completed. This
       * allocation strategy keeps costs lower but can limit scaling. If you are using Spot Fleets with
       * `BEST_FIT` then the Spot Fleet IAM role must be specified.
       * * **BEST_FIT_PROGRESSIVE** - AWS Batch will select additional instance types that are large
       * enough to meet the requirements of the jobs in the queue, with a preference for instance types
       * with a lower cost per unit vCPU. If additional instances of the previously selected instance
       * types aren't available, AWS Batch will select new instance types.
       * * **SPOT_CAPACITY_OPTIMIZED** - AWS Batch will select one or more instance types that are
       * large enough to meet the requirements of the jobs in the queue, with a preference for instance
       * types that are less likely to be interrupted. This allocation strategy is only available for
       * Spot Instance compute resources.
       * * **SPOT_PRICE_CAPACITY_OPTIMIZED** - The price and capacity optimized allocation strategy
       * looks at both price and capacity to select the Spot Instance pools that are the least likely
       * to be interrupted and have the lowest possible price. This allocation strategy is only
       * available for Spot Instance compute resources.
       *
       *
       * We recommend that you use `SPOT_PRICE_CAPACITY_OPTIMIZED` rather than
       * `SPOT_CAPACITY_OPTIMIZED` in most instances.
       *
       *
       * With `BEST_FIT_PROGRESSIVE` , `SPOT_CAPACITY_OPTIMIZED` , and
       * `SPOT_PRICE_CAPACITY_OPTIMIZED` allocation strategies using On-Demand or Spot Instances, and
       * the `BEST_FIT` strategy using Spot Instances, AWS Batch might need to go above `maxvCpus` to
       * meet your capacity requirements. In this event, AWS Batch never exceeds `maxvCpus` by more
       * than a single instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
       */
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      /**
       * The maximum percentage that a Spot Instance price can be when compared with the On-Demand
       * price for that instance type before instances are launched.
       *
       * For example, if your maximum percentage is 20%, the Spot price must be less than 20% of the
       * current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price
       * and never more than your maximum percentage. For most use cases, we recommend leaving this
       * field empty.
       *
       * When updating a compute environment, changing the bid percentage requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
       */
      override fun bidPercentage(): Number? = unwrap(this).getBidPercentage()

      /**
       * The desired number of vCPUS in the compute environment.
       *
       * AWS Batch modifies this value between the minimum and maximum values based on job queue
       * demand.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; AWS Batch doesn't support changing the desired number of vCPUs of an existing
       * compute environment. Don't specify this parameter for compute environments using Amazon EKS
       * clusters. &gt; When you update the `desiredvCpus` setting, the value must be between the
       * `minvCpus` and `maxvCpus` values.
       *
       * Additionally, the updated `desiredvCpus` value must be greater than or equal to the current
       * `desiredvCpus` value. For more information, see [Troubleshooting AWS
       * Batch](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update)
       * in the *AWS Batch User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus)
       */
      override fun desiredvCpus(): Number? = unwrap(this).getDesiredvCpus()

      /**
       * Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances
       * in the compute environment.
       *
       * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* . To remove the Amazon EC2 configuration and any custom AMI ID
       * specified in `imageIdOverride` , set this value to an empty string.
       *
       * One or two values can be provided.
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2configuration)
       */
      override fun ec2Configuration(): Any? = unwrap(this).getEc2Configuration()

      /**
       * The Amazon EC2 key pair that's used for instances launched in the compute environment.
       *
       * You can use this key pair to log in to your instances with SSH. To remove the Amazon EC2
       * key pair, set this value to an empty string.
       *
       * When updating a compute environment, changing the Amazon EC2 key pair requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
       */
      override fun ec2KeyPair(): String? = unwrap(this).getEc2KeyPair()

      /**
       * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
       *
       * This parameter is overridden by the `imageIdOverride` member of the `Ec2Configuration`
       * structure. To remove the custom AMI ID and use the default AMI ID, set this value to an empty
       * string.
       *
       * When updating a compute environment, changing the AMI ID requires an infrastructure update
       * of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; The AMI that you choose for a compute environment must match the architecture
       * of the instance types that you intend to use for that compute environment. For example, if
       * your compute environment uses A1 instance types, the compute resource AMI that you choose must
       * support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized
       * Amazon Linux 2 AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
       */
      override fun imageId(): String? = unwrap(this).getImageId()

      /**
       * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment.
       *
       * Required for Amazon EC2 instances. You can specify the short name or full Amazon Resource
       * Name (ARN) of an instance profile. For example, `*ecsInstanceRole*` or `arn:aws:iam::
       * *&lt;aws_account_id&gt;* :instance-profile/ *ecsInstanceRole*` . For more information, see
       * [Amazon ECS instance
       * role](https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
       */
      override fun instanceRole(): String? = unwrap(this).getInstanceRole()

      /**
       * The instances types that can be launched.
       *
       * You can specify instance families to launch any instance type within those families (for
       * example, `c5` or `p3` ), or you can specify specific sizes within a family (such as
       * `c5.8xlarge` ). You can also choose `optimal` to select instance types (from the C4, M4, and
       * R4 instance families) that match the demand of your job queues.
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; When you create a compute environment, the instance types that you select for
       * the compute environment must share the same architecture. For example, you can't mix x86 and
       * ARM instances in the same compute environment. &gt; Currently, `optimal` uses instance types
       * from the C4, M4, and R4 instance families. In Regions that don't have instance types from
       * those instance families, instance types from the C5, M5, and R5 instance families are used.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
       */
      override fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

      /**
       * The launch template to use for your compute resources.
       *
       * Any other compute resource parameters that you specify in a
       * [CreateComputeEnvironment](https://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html)
       * API operation override the same parameters in the launch template. You must specify either the
       * launch template ID or launch template name in the request, but not both. For more information,
       * see [Launch Template
       * Support](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the ** .
       * Removing the launch template from a compute environment will not remove the AMI specified in
       * the launch template. In order to update the AMI specified in a launch template, the
       * `updateToLatestImageVersion` parameter must be set to `true` .
       *
       * When updating a compute environment, changing the launch template requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the ** .
       *
       *
       * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be
       * specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
       */
      override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

      /**
       * The maximum number of Amazon EC2 vCPUs that an environment can reach.
       *
       *
       * With `BEST_FIT_PROGRESSIVE` , `SPOT_CAPACITY_OPTIMIZED` and `SPOT_PRICE_CAPACITY_OPTIMIZED`
       * (recommended) strategies using On-Demand or Spot Instances, and the `BEST_FIT` strategy using
       * Spot Instances, AWS Batch might need to exceed `maxvCpus` to meet your capacity requirements.
       * In this event, AWS Batch never exceeds `maxvCpus` by more than a single instance.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
       */
      override fun maxvCpus(): Number = unwrap(this).getMaxvCpus()

      /**
       * The minimum number of vCPUs that an environment should maintain (even if the compute
       * environment is `DISABLED` ).
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
       */
      override fun minvCpus(): Number? = unwrap(this).getMinvCpus()

      /**
       * The Amazon EC2 placement group to associate with your compute resources.
       *
       * If you intend to submit multi-node parallel jobs to your compute environment, you should
       * consider creating a cluster placement group and associate it with your compute resources. This
       * keeps your multi-node parallel job on a logical grouping of instances within a single
       * Availability Zone with high network flow potential. For more information, see [Placement
       * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * When updating a compute environment, changing the placement group requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup)
       */
      override fun placementGroup(): String? = unwrap(this).getPlacementGroup()

      /**
       * The Amazon EC2 security groups that are associated with instances launched in the compute
       * environment.
       *
       * This parameter is required for Fargate compute resources, where it can contain up to 5
       * security groups. For Fargate compute resources, providing an empty list is handled as if this
       * parameter wasn't specified and no change is made. For Amazon EC2 compute resources, providing
       * an empty list removes the security groups from the compute resource.
       *
       * When updating a compute environment, changing the Amazon EC2 security groups requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a `SPOT`
       * compute environment.
       *
       * This role is required if the allocation strategy set to `BEST_FIT` or if the allocation
       * strategy isn't specified. For more information, see [Amazon EC2 spot fleet
       * role](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it. &gt; To tag your Spot Instances on creation, the Spot Fleet IAM role specified
       * here must use the newer *AmazonEC2SpotFleetTaggingRole* managed policy. The previously
       * recommended *AmazonEC2SpotFleetRole* managed policy doesn't have the required permissions to
       * tag Spot Instances. For more information, see [Spot instances not tagged on
       * creation](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#spot-instance-no-tag)
       * in the *AWS Batch User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole)
       */
      override fun spotIamFleetRole(): String? = unwrap(this).getSpotIamFleetRole()

      /**
       * The VPC subnets where the compute resources are launched.
       *
       * Fargate compute resources can contain up to 16 subnets. For Fargate compute resources,
       * providing an empty list will be handled as if this parameter wasn't specified and no change is
       * made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from
       * the compute resource. For more information, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * When updating a compute environment, changing the VPC subnets requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * AWS Batch on Amazon EC2 and AWS Batch on Amazon EKS support Local Zones. For more
       * information, see [Local
       * Zones](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones)
       * in the *Amazon EC2 User Guide for Linux Instances* , [Amazon EKS and AWS Local
       * Zones](https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html) in the *Amazon EKS
       * User Guide* and [Amazon ECS clusters in Local Zones, Wavelength Zones, and AWS
       * Outposts](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones)
       * in the *Amazon ECS Developer Guide* .
       *
       * AWS Batch on Fargate doesn't currently support Local Zones.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()

      /**
       * Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute
       * environment.
       *
       * For AWS Batch , these take the form of `"String1": "String2"` , where `String1` is the tag
       * key and `String2` is the tag value-for example, `{ "Name": "Batch Instance - C4OnDemand" }` .
       * This is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags
       * aren't seen when using the AWS Batch `ListTagsForResource` API operation.
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       *
       * This parameter isn't applicable to jobs that are running on Fargate resources. Don't
       * specify it.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
       */
      override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

      /**
       * The type of compute environment: `EC2` , `SPOT` , `FARGATE` , or `FARGATE_SPOT` .
       *
       * For more information, see [Compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in
       * the *AWS Batch User Guide* .
       *
       * If you choose `SPOT` , you must also specify an Amazon EC2 Spot Fleet role with the
       * `spotIamFleetRole` parameter. For more information, see [Amazon EC2 spot fleet
       * role](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html) in the *AWS
       * Batch User Guide* .
       *
       * When updating compute environment, changing the type of a compute environment requires an
       * infrastructure update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       * When updating the type of a compute environment, changing between `EC2` and `SPOT` or
       * between `FARGATE` and `FARGATE_SPOT` will initiate an infrastructure update, but if you switch
       * between `EC2` and `FARGATE` , AWS CloudFormation will create a new compute environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Specifies whether the AMI ID is updated to the latest one that's supported by AWS Batch
       * when the compute environment has an infrastructure update.
       *
       * The default value is `false` .
       *
       *
       * An AMI ID can either be specified in the `imageId` or `imageIdOverride` parameters or be
       * determined by the launch template that's specified in the `launchTemplate` parameter. If an
       * AMI ID is specified any of these ways, this parameter is ignored. For more information about
       * to update AMI IDs during an infrastructure update, see [Updating the AMI
       * ID](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami)
       * in the *AWS Batch User Guide* .
       *
       *
       * When updating a compute environment, changing this setting requires an infrastructure
       * update of the compute environment. For more information, see [Updating compute
       * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
       * in the *AWS Batch User Guide* .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
       */
      override fun updateToLatestImageVersion(): Any? = unwrap(this).getUpdateToLatestImageVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty):
          ComputeResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeResourcesProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty
    }
  }
}
