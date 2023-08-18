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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.constructs.Construct

/**
 * The `AWS::Batch::ComputeEnvironment` resource defines your AWS Batch compute environment.
 *
 * You can define `MANAGED` or `UNMANAGED` compute environments. `MANAGED` compute environments can
 * use Amazon EC2 or AWS Fargate resources. `UNMANAGED` compute environments can only use EC2
 * resources. For more information, see
 * [Compute Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html)
 * in the ** .
 *
 * In a managed compute environment, AWS Batch manages the capacity and instance types of the
 * compute resources within the environment. This is based on the compute resource specification
 * that you define or the
 * [launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html)
 * that you specify when you create the compute environment. You can choose either to use EC2
 * On-Demand Instances and EC2 Spot Instances, or to use Fargate and Fargate Spot capacity in your
 * managed compute environment. You can optionally set a maximum price so that Spot Instances only
 * launch when the Spot Instance price is below a specified percentage of the On-Demand price.
 *
 * Multi-node parallel jobs are not supported on Spot Instances.
 *
 * In an unmanaged compute environment, you can manage your own EC2 compute resources and have a lot
 * of flexibility with how you configure your compute resources. For example, you can use custom
 * AMI. However, you need to verify that your AMI meets the Amazon ECS container instance AMI
 * specification. For more information, see
 * [container instance AMIs](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html)
 * in the *Amazon Elastic Container Service Developer Guide* . After you have created your unmanaged
 * compute environment, you can use the
 * [DescribeComputeEnvironments](https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeComputeEnvironments.html)
 * operation to find the Amazon ECS cluster that is associated with it. Then, manually launch your
 * container instances into that Amazon ECS cluster. For more information, see
 * [Launching an Amazon ECS container instance](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * To create a compute environment that uses EKS resources, the caller must have permissions to call
 * `eks:DescribeCluster` . &gt; AWS Batch doesn't upgrade the AMIs in a compute environment after
 * it's created except under specific conditions. For example, it doesn't automatically update the
 * AMIs when a newer version of the Amazon ECS optimized AMI is available. Therefore, you're
 * responsible for the management of the guest operating system (including updates and security
 * patches) and any additional application software or utilities that you install on the compute
 * resources. There are two ways to use a new AMI for your AWS Batch jobs. The original method is to
 * complete these steps:
 * * Create a new compute environment with the new AMI.
 * * Add the compute environment to an existing job queue.
 * * Remove the earlier compute environment from your job queue.
 * * Delete the earlier compute environment.
 *
 * In April 2022, AWS Batch added enhanced support for updating compute environments. For example,
 * the `UpdateComputeEnvironent` API lets you use the `ReplaceComputeEnvironment` property to
 * dynamically update compute environment parameters such as the launch template or instance type
 * without replacement. For more information, see
 * [Updating compute environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
 * in the *AWS Batch User Guide* .
 *
 * To use the enhanced updating of compute environments to update AMIs, follow these rules:
 * * Either do not set the
 *   [ServiceRole](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole)
 *   property or set it to the *AWSServiceRoleForBatch* service-linked role.
 * * Set the
 *   [AllocationStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
 *   property to `BEST_FIT_PROGRESSIVE` or `SPOT_CAPACITY_OPTIMIZED` .
 * * Set the
 *   [ReplaceComputeEnvironment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-replacecomputeenvironment)
 *   property to `false` .
 *
 * Set the `ReplaceComputeEnvironment` property to `false` if the compute environment uses the
 * `BEST_FIT` allocation strategy. &gt; If the `ReplaceComputeEnvironment` property is set to
 * `false` , you might receive an error message when you update the CFN template for a compute
 * environment. This issue occurs if the updated `desiredvcpus` value is less than the current
 * `desiredvcpus` value. As a workaround, delete the `desiredvcpus` value from the updated template
 * or use the `minvcpus` property to manage the number of vCPUs. For information, see
 * [Error message when you update the `DesiredvCpus` setting](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update)
 * .
 * * Set the
 *   [UpdateToLatestImageVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
 *   property to `true` . This property is used when you update a compute environment. The
 *   [UpdateToLatestImageVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
 *   property is ignored when you create a compute environment.
 * * Either do not specify an image ID in
 *   [ImageId](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
 *   or
 *   [ImageIdOverride](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-ec2configurationobject.html#cfn-batch-computeenvironment-ec2configurationobject-imageidoverride)
 *   properties, or in the launch template identified by the
 *   [Launch Template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
 *   property. In that case AWS Batch will select the latest Amazon ECS optimized AMI supported by
 *   AWS Batch at the time the infrastructure update is initiated. Alternatively you can specify the
 *   AMI ID in the `ImageId` or `ImageIdOverride` properties, or the launch template identified by
 *   the `LaunchTemplate` properties. Changing any of these properties will trigger an
 *   infrastructure update.
 *
 * If these rules are followed, any update that triggers an infrastructure update will cause the AMI
 * ID to be re-selected. If the
 * [Version](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-version)
 * property of the
 * [LaunchTemplateSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html)
 * is set to `$Latest` or `$Default` , the latest or default version of the launch template will be
 * evaluated up at the time of the infrastructure update, even if the `LaunchTemplateSpecification`
 * was not updated.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
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
@CdkDslMarker
public class CfnComputeEnvironmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnComputeEnvironment.Builder =
        CfnComputeEnvironment.Builder.create(scope, id)

    /**
     * The name for your compute environment.
     *
     * It can be up to 128 characters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname)
     *
     * @param computeEnvironmentName The name for your compute environment.
     */
    public fun computeEnvironmentName(computeEnvironmentName: String) {
        cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * The ComputeResources property type specifies details of the compute resources managed by the
     * compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html)
     * in the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
     *
     * @param computeResources The ComputeResources property type specifies details of the compute
     *   resources managed by the compute environment.
     */
    public fun computeResources(computeResources: IResolvable) {
        cdkBuilder.computeResources(computeResources)
    }

    /**
     * The ComputeResources property type specifies details of the compute resources managed by the
     * compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html)
     * in the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
     *
     * @param computeResources The ComputeResources property type specifies details of the compute
     *   resources managed by the compute environment.
     */
    public fun computeResources(computeResources: CfnComputeEnvironment.ComputeResourcesProperty) {
        cdkBuilder.computeResources(computeResources)
    }

    /**
     * The details for the Amazon EKS cluster that supports the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-eksconfiguration)
     *
     * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
     *   environment.
     */
    public fun eksConfiguration(eksConfiguration: IResolvable) {
        cdkBuilder.eksConfiguration(eksConfiguration)
    }

    /**
     * The details for the Amazon EKS cluster that supports the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-eksconfiguration)
     *
     * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
     *   environment.
     */
    public fun eksConfiguration(eksConfiguration: CfnComputeEnvironment.EksConfigurationProperty) {
        cdkBuilder.eksConfiguration(eksConfiguration)
    }

    /**
     * Specifies whether the compute environment is replaced if an update is made that requires
     * replacing the instances in the compute environment.
     *
     * The default value is `true` . To enable more properties to be updated, set this property to
     * `false` . When changing the value of this property to `false` , do not change any other
     * properties at the same time. If other properties are changed at the same time, and the change
     * needs to be rolled back but it can't, it's possible for the stack to go into the
     * `UPDATE_ROLLBACK_FAILED` state. You can't update a stack that is in the
     * `UPDATE_ROLLBACK_FAILED` state. However, if you can continue to roll it back, you can return
     * the stack to its original settings and then try to update it again. For more information, see
     * [Continue rolling back an update](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
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
     *
     * @param replaceComputeEnvironment Specifies whether the compute environment is replaced if an
     *   update is made that requires replacing the instances in the compute environment.
     */
    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
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
     * `UPDATE_ROLLBACK_FAILED` state. You can't update a stack that is in the
     * `UPDATE_ROLLBACK_FAILED` state. However, if you can continue to roll it back, you can return
     * the stack to its original settings and then try to update it again. For more information, see
     * [Continue rolling back an update](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
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
     *
     * @param replaceComputeEnvironment Specifies whether the compute environment is replaced if an
     *   update is made that requires replacing the instances in the compute environment.
     */
    public fun replaceComputeEnvironment(replaceComputeEnvironment: IResolvable) {
        cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to
     * other AWS services on your behalf.
     *
     * For more information, see
     * [AWS Batch service IAM role](https://docs.aws.amazon.com/batch/latest/userguide/service_IAM_role.html)
     * in the *AWS Batch User Guide* .
     *
     * If your account already created the AWS Batch service-linked role, that role is used by
     * default for your compute environment unless you specify a different role here. If the AWS
     * Batch service-linked role doesn't exist in your account, and no role is specified here, the
     * service attempts to create the AWS Batch service-linked role in your account.
     *
     * If your specified role has a path other than `/` , then you must specify either the full role
     * ARN (recommended) or prefix the role name with the path. For example, if a role with the name
     * `bar` has a path of `/foo/` , specify `/foo/bar` as the role name. For more information, see
     * [Friendly names and paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
     * in the *IAM User Guide* .
     *
     * Depending on how you created your AWS Batch service role, its ARN might contain the
     * `service-role` path prefix. When you only specify the name of the service role, AWS Batch
     * assumes that your ARN doesn't use the `service-role` path prefix. Because of this, we
     * recommend that you specify the full ARN of your service role when you create compute
     * environments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole)
     *
     * @param serviceRole The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch
     *   to make calls to other AWS services on your behalf.
     */
    public fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * The state of the compute environment.
     *
     * If the state is `ENABLED` , then the compute environment accepts jobs from a queue and can
     * scale out automatically based on queues.
     *
     * If the state is `ENABLED` , then the AWS Batch scheduler can attempt to place jobs from an
     * associated job queue on the compute resources within the environment. If the compute
     * environment is managed, then it can scale its instances out or in automatically, based on the
     * job queue demand.
     *
     * If the state is `DISABLED` , then the AWS Batch scheduler doesn't attempt to place jobs
     * within the environment. Jobs in a `STARTING` or `RUNNING` state continue to progress
     * normally. Managed compute environments in the `DISABLED` state don't scale out.
     *
     * Compute environments in a `DISABLED` state may continue to incur billing charges. To prevent
     * additional charges, turn off and then delete the compute environment. For more information,
     * see
     * [State](https://docs.aws.amazon.com/batch/latest/userguide/compute_environment_parameters.html#compute_environment_state)
     * in the *AWS Batch User Guide* .
     *
     * When an instance is idle, the instance scales down to the `minvCpus` value. However, the
     * instance size doesn't change. For example, consider a `c5.8xlarge` instance with a `minvCpus`
     * value of `4` and a `desiredvCpus` value of `36` . This instance doesn't scale down to a
     * `c5.large` instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state)
     *
     * @param state The state of the compute environment.
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /**
     * The tags applied to the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-tags)
     *
     * @param tags The tags applied to the compute environment.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The type of the compute environment: `MANAGED` or `UNMANAGED` .
     *
     * For more information, see
     * [Compute Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type)
     *
     * @param type The type of the compute environment: `MANAGED` or `UNMANAGED` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * The maximum number of vCPUs for an unmanaged compute environment.
     *
     * This parameter is only used for fair share scheduling to reserve vCPU capacity for new share
     * identifiers. If this parameter isn't provided for a fair share job queue, no vCPU capacity is
     * reserved.
     *
     * This parameter is only supported when the `type` parameter is set to `UNMANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-unmanagedvcpus)
     *
     * @param unmanagedvCpus The maximum number of vCPUs for an unmanaged compute environment.
     */
    public fun unmanagedvCpus(unmanagedvCpus: Number) {
        cdkBuilder.unmanagedvCpus(unmanagedvCpus)
    }

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see
     * [Updating compute environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-updatepolicy)
     *
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment.
     */
    public fun updatePolicy(updatePolicy: IResolvable) {
        cdkBuilder.updatePolicy(updatePolicy)
    }

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see
     * [Updating compute environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-updatepolicy)
     *
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment.
     */
    public fun updatePolicy(updatePolicy: CfnComputeEnvironment.UpdatePolicyProperty) {
        cdkBuilder.updatePolicy(updatePolicy)
    }

    public fun build(): CfnComputeEnvironment = cdkBuilder.build()
}
