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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps
import software.amazon.awscdk.services.batch.CfnJobQueue
import software.amazon.awscdk.services.batch.CfnJobQueueProps
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps
import software.amazon.awscdk.services.batch.ComputeEnvironmentProps
import software.amazon.awscdk.services.batch.CustomReason
import software.amazon.awscdk.services.batch.Device
import software.amazon.awscdk.services.batch.EcsContainerDefinitionProps
import software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition
import software.amazon.awscdk.services.batch.EcsEc2ContainerDefinitionProps
import software.amazon.awscdk.services.batch.EcsFargateContainerDefinition
import software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps
import software.amazon.awscdk.services.batch.EcsJobDefinition
import software.amazon.awscdk.services.batch.EcsJobDefinitionProps
import software.amazon.awscdk.services.batch.EcsMachineImage
import software.amazon.awscdk.services.batch.EcsVolumeOptions
import software.amazon.awscdk.services.batch.EfsVolume
import software.amazon.awscdk.services.batch.EfsVolumeOptions
import software.amazon.awscdk.services.batch.EksContainerDefinition
import software.amazon.awscdk.services.batch.EksContainerDefinitionProps
import software.amazon.awscdk.services.batch.EksJobDefinition
import software.amazon.awscdk.services.batch.EksJobDefinitionProps
import software.amazon.awscdk.services.batch.EksMachineImage
import software.amazon.awscdk.services.batch.EksVolumeOptions
import software.amazon.awscdk.services.batch.EmptyDirVolume
import software.amazon.awscdk.services.batch.EmptyDirVolumeOptions
import software.amazon.awscdk.services.batch.FairshareSchedulingPolicy
import software.amazon.awscdk.services.batch.FairshareSchedulingPolicyProps
import software.amazon.awscdk.services.batch.FargateComputeEnvironment
import software.amazon.awscdk.services.batch.FargateComputeEnvironmentProps
import software.amazon.awscdk.services.batch.HostPathVolume
import software.amazon.awscdk.services.batch.HostPathVolumeOptions
import software.amazon.awscdk.services.batch.HostVolume
import software.amazon.awscdk.services.batch.HostVolumeOptions
import software.amazon.awscdk.services.batch.JobDefinitionProps
import software.amazon.awscdk.services.batch.JobQueue
import software.amazon.awscdk.services.batch.JobQueueProps
import software.amazon.awscdk.services.batch.LinuxParameters
import software.amazon.awscdk.services.batch.LinuxParametersProps
import software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps
import software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment
import software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps
import software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironment
import software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironmentProps
import software.amazon.awscdk.services.batch.MultiNodeContainer
import software.amazon.awscdk.services.batch.MultiNodeJobDefinition
import software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps
import software.amazon.awscdk.services.batch.OrderedComputeEnvironment
import software.amazon.awscdk.services.batch.SecretPathVolume
import software.amazon.awscdk.services.batch.SecretPathVolumeOptions
import software.amazon.awscdk.services.batch.SecretVersionInfo
import software.amazon.awscdk.services.batch.Share
import software.amazon.awscdk.services.batch.Tmpfs
import software.amazon.awscdk.services.batch.Ulimit
import software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment
import software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct

public object batch {
    /**
     * The `AWS::Batch::ComputeEnvironment` resource defines your AWS Batch compute environment.
     *
     * You can define `MANAGED` or `UNMANAGED` compute environments. `MANAGED` compute environments
     * can use Amazon EC2 or AWS Fargate resources. `UNMANAGED` compute environments can only use
     * EC2 resources. For more information, see
     * [Compute Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html)
     * in the ** .
     *
     * In a managed compute environment, AWS Batch manages the capacity and instance types of the
     * compute resources within the environment. This is based on the compute resource specification
     * that you define or the
     * [launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html)
     * that you specify when you create the compute environment. You can choose either to use EC2
     * On-Demand Instances and EC2 Spot Instances, or to use Fargate and Fargate Spot capacity in
     * your managed compute environment. You can optionally set a maximum price so that Spot
     * Instances only launch when the Spot Instance price is below a specified percentage of the
     * On-Demand price.
     *
     * Multi-node parallel jobs are not supported on Spot Instances.
     *
     * In an unmanaged compute environment, you can manage your own EC2 compute resources and have a
     * lot of flexibility with how you configure your compute resources. For example, you can use
     * custom AMI. However, you need to verify that your AMI meets the Amazon ECS container instance
     * AMI specification. For more information, see
     * [container instance AMIs](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html)
     * in the *Amazon Elastic Container Service Developer Guide* . After you have created your
     * unmanaged compute environment, you can use the
     * [DescribeComputeEnvironments](https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeComputeEnvironments.html)
     * operation to find the Amazon ECS cluster that is associated with it. Then, manually launch
     * your container instances into that Amazon ECS cluster. For more information, see
     * [Launching an Amazon ECS container instance](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * To create a compute environment that uses EKS resources, the caller must have permissions to
     * call `eks:DescribeCluster` . &gt; AWS Batch doesn't upgrade the AMIs in a compute environment
     * after it's created except under specific conditions. For example, it doesn't automatically
     * update the AMIs when a newer version of the Amazon ECS optimized AMI is available. Therefore,
     * you're responsible for the management of the guest operating system (including updates and
     * security patches) and any additional application software or utilities that you install on
     * the compute resources. There are two ways to use a new AMI for your AWS Batch jobs. The
     * original method is to complete these steps:
     * * Create a new compute environment with the new AMI.
     * * Add the compute environment to an existing job queue.
     * * Remove the earlier compute environment from your job queue.
     * * Delete the earlier compute environment.
     *
     * In April 2022, AWS Batch added enhanced support for updating compute environments. For
     * example, the `UpdateComputeEnvironent` API lets you use the `ReplaceComputeEnvironment`
     * property to dynamically update compute environment parameters such as the launch template or
     * instance type without replacement. For more information, see
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
     * Set the `ReplaceComputeEnvironment` property to `true` if the compute environment uses the
     * `BEST_FIT` allocation strategy. &gt; If the `ReplaceComputeEnvironment` property is set to
     * `false` , you might receive an error message when you update the CFN template for a compute
     * environment. This issue occurs if the updated `desiredvcpus` value is less than the current
     * `desiredvcpus` value. As a workaround, delete the `desiredvcpus` value from the updated
     * template or use the `minvcpus` property to manage the number of vCPUs. For information, see
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
     *   property. In that case AWS Batch will select the latest Amazon ECS optimized AMI supported
     *   by AWS Batch at the time the infrastructure update is initiated. Alternatively you can
     *   specify the AMI ID in the `ImageId` or `ImageIdOverride` properties, or the launch template
     *   identified by the `LaunchTemplate` properties. Changing any of these properties will
     *   trigger an infrastructure update.
     *
     * If these rules are followed, any update that triggers an infrastructure update will cause the
     * AMI ID to be re-selected. If the
     * [Version](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html#cfn-batch-computeenvironment-launchtemplatespecification-version)
     * property of the
     * [LaunchTemplateSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html)
     * is set to `$Latest` or `$Default` , the latest or default version of the launch template will
     * be evaluated up at the time of the infrastructure update, even if the
     * `LaunchTemplateSpecification` was not updated.
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
    public inline fun cfnComputeEnvironment(
        scope: Construct,
        id: String,
        block: CfnComputeEnvironmentDsl.() -> Unit = {},
    ): CfnComputeEnvironment {
        val builder = CfnComputeEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about the compute resources managed by the compute environment.
     *
     * This parameter is required for managed compute environments. For more information, see
     * [Compute Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html)
     * in the *AWS Batch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
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
    public inline fun cfnComputeEnvironmentComputeResourcesProperty(
        block: CfnComputeEnvironmentComputeResourcesPropertyDsl.() -> Unit = {}
    ): CfnComputeEnvironment.ComputeResourcesProperty {
        val builder = CfnComputeEnvironmentComputeResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information used to select Amazon Machine Images (AMIs) for instances in the compute
     * environment.
     *
     * If `Ec2Configuration` isn't specified, the default is `ECS_AL2` (
     * [Amazon Linux 2](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami)
     * ).
     *
     * This object isn't applicable to jobs that are running on Fargate resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
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
    public inline fun cfnComputeEnvironmentEc2ConfigurationObjectProperty(
        block: CfnComputeEnvironmentEc2ConfigurationObjectPropertyDsl.() -> Unit = {}
    ): CfnComputeEnvironment.Ec2ConfigurationObjectProperty {
        val builder = CfnComputeEnvironmentEc2ConfigurationObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for the Amazon EKS cluster that supports the AWS Batch compute environment.
     *
     * The cluster must exist before the compute environment can be created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EksConfigurationProperty eksConfigurationProperty = EksConfigurationProperty.builder()
     * .eksClusterArn("eksClusterArn")
     * .kubernetesNamespace("kubernetesNamespace")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-eksconfiguration.html)
     */
    public inline fun cfnComputeEnvironmentEksConfigurationProperty(
        block: CfnComputeEnvironmentEksConfigurationPropertyDsl.() -> Unit = {}
    ): CfnComputeEnvironment.EksConfigurationProperty {
        val builder = CfnComputeEnvironmentEksConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents a launch template that's associated with a compute resource.
     *
     * You must specify either the launch template ID or launch template name in the request, but
     * not both.
     *
     * If security groups are specified using both the `securityGroupIds` parameter of
     * `CreateComputeEnvironment` and the launch template, the values in the `securityGroupIds`
     * parameter of `CreateComputeEnvironment` will be used.
     *
     * This object isn't applicable to jobs that are running on Fargate resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
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
    public inline fun cfnComputeEnvironmentLaunchTemplateSpecificationProperty(
        block: CfnComputeEnvironmentLaunchTemplateSpecificationPropertyDsl.() -> Unit = {}
    ): CfnComputeEnvironment.LaunchTemplateSpecificationProperty {
        val builder = CfnComputeEnvironmentLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnComputeEnvironment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * CfnComputeEnvironmentProps cfnComputeEnvironmentProps = CfnComputeEnvironmentProps.builder()
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
    public inline fun cfnComputeEnvironmentProps(
        block: CfnComputeEnvironmentPropsDsl.() -> Unit = {}
    ): CfnComputeEnvironmentProps {
        val builder = CfnComputeEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the infrastructure update policy for the compute environment.
     *
     * For more information about infrastructure updates, see
     * [Updating compute environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     * in the *AWS Batch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * UpdatePolicyProperty updatePolicyProperty = UpdatePolicyProperty.builder()
     * .jobExecutionTimeoutMinutes(123)
     * .terminateJobsOnUpdate(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-updatepolicy.html)
     */
    public inline fun cfnComputeEnvironmentUpdatePolicyProperty(
        block: CfnComputeEnvironmentUpdatePolicyPropertyDsl.() -> Unit = {}
    ): CfnComputeEnvironment.UpdatePolicyProperty {
        val builder = CfnComputeEnvironmentUpdatePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Batch::JobDefinition` resource specifies the parameters for an AWS Batch job
     * definition.
     *
     * For more information, see
     * [Job Definitions](https://docs.aws.amazon.com/batch/latest/userguide/job_definitions.html) in
     * the ** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object labels;
     * Object limits;
     * Object options;
     * Object parameters;
     * Object requests;
     * Object tags;
     * CfnJobDefinition cfnJobDefinition = CfnJobDefinition.Builder.create(this, "MyCfnJobDefinition")
     * .type("type")
     * // the properties below are optional
     * .containerProperties(ContainerPropertiesProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(List.of(EnvironmentProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
     * .platformVersion("platformVersion")
     * .build())
     * .instanceType("instanceType")
     * .jobRoleArn("jobRoleArn")
     * .linuxParameters(LinuxParametersProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(options)
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .mountPoints(List.of(MountPointsProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .build())
     * .privileged(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .vcpus(123)
     * .volumes(List.of(VolumesProperty.builder()
     * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build())
     * .eksProperties(EksPropertiesProperty.builder()
     * .podProperties(PodPropertiesProperty.builder()
     * .containers(List.of(EksContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .args(List.of("args"))
     * .command(List.of("command"))
     * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .imagePullPolicy("imagePullPolicy")
     * .name("name")
     * .resources(ResourcesProperty.builder()
     * .limits(limits)
     * .requests(requests)
     * .build())
     * .securityContext(SecurityContextProperty.builder()
     * .privileged(false)
     * .readOnlyRootFilesystem(false)
     * .runAsGroup(123)
     * .runAsNonRoot(false)
     * .runAsUser(123)
     * .build())
     * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
     * .mountPath("mountPath")
     * .name("name")
     * .readOnly(false)
     * .build()))
     * .build()))
     * .dnsPolicy("dnsPolicy")
     * .hostNetwork(false)
     * .metadata(MetadataProperty.builder()
     * .labels(labels)
     * .build())
     * .serviceAccountName("serviceAccountName")
     * .volumes(List.of(EksVolumeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .emptyDir(EmptyDirProperty.builder()
     * .medium("medium")
     * .sizeLimit("sizeLimit")
     * .build())
     * .hostPath(HostPathProperty.builder()
     * .path("path")
     * .build())
     * .secret(EksSecretProperty.builder()
     * .secretName("secretName")
     * // the properties below are optional
     * .optional(false)
     * .build())
     * .build()))
     * .build())
     * .build())
     * .jobDefinitionName("jobDefinitionName")
     * .nodeProperties(NodePropertiesProperty.builder()
     * .mainNode(123)
     * .nodeRangeProperties(List.of(NodeRangePropertyProperty.builder()
     * .targetNodes("targetNodes")
     * // the properties below are optional
     * .container(ContainerPropertiesProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(List.of(EnvironmentProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
     * .platformVersion("platformVersion")
     * .build())
     * .instanceType("instanceType")
     * .jobRoleArn("jobRoleArn")
     * .linuxParameters(LinuxParametersProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(options)
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .mountPoints(List.of(MountPointsProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .build())
     * .privileged(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .vcpus(123)
     * .volumes(List.of(VolumesProperty.builder()
     * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build())
     * .build()))
     * .numNodes(123)
     * .build())
     * .parameters(parameters)
     * .platformCapabilities(List.of("platformCapabilities"))
     * .propagateTags(false)
     * .retryStrategy(RetryStrategyProperty.builder()
     * .attempts(123)
     * .evaluateOnExit(List.of(EvaluateOnExitProperty.builder()
     * .action("action")
     * // the properties below are optional
     * .onExitCode("onExitCode")
     * .onReason("onReason")
     * .onStatusReason("onStatusReason")
     * .build()))
     * .build())
     * .schedulingPriority(123)
     * .tags(tags)
     * .timeout(TimeoutProperty.builder()
     * .attemptDurationSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html)
     */
    public inline fun cfnJobDefinition(
        scope: Construct,
        id: String,
        block: CfnJobDefinitionDsl.() -> Unit = {},
    ): CfnJobDefinition {
        val builder = CfnJobDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The authorization configuration details for the Amazon EFS file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * AuthorizationConfigProperty authorizationConfigProperty = AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-authorizationconfig.html)
     */
    public inline fun cfnJobDefinitionAuthorizationConfigProperty(
        block: CfnJobDefinitionAuthorizationConfigPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.AuthorizationConfigProperty {
        val builder = CfnJobDefinitionAuthorizationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container properties are used for Amazon ECS based job definitions.
     *
     * These properties to describe the container that's launched as part of a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object options;
     * ContainerPropertiesProperty containerPropertiesProperty = ContainerPropertiesProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(List.of(EnvironmentProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
     * .platformVersion("platformVersion")
     * .build())
     * .instanceType("instanceType")
     * .jobRoleArn("jobRoleArn")
     * .linuxParameters(LinuxParametersProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(options)
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .mountPoints(List.of(MountPointsProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .build())
     * .privileged(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .vcpus(123)
     * .volumes(List.of(VolumesProperty.builder()
     * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html)
     */
    public inline fun cfnJobDefinitionContainerPropertiesProperty(
        block: CfnJobDefinitionContainerPropertiesPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.ContainerPropertiesProperty {
        val builder = CfnJobDefinitionContainerPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents a container instance host device.
     *
     * This object isn't applicable to jobs that are running on Fargate resources and shouldn't be
     * provided.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * DeviceProperty deviceProperty = DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html)
     */
    public inline fun cfnJobDefinitionDeviceProperty(
        block: CfnJobDefinitionDevicePropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.DeviceProperty {
        val builder = CfnJobDefinitionDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is used when you're using an Amazon Elastic File System file system for job storage.
     *
     * For more information, see
     * [Amazon EFS Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in
     * the *AWS Batch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EfsVolumeConfigurationProperty efsVolumeConfigurationProperty =
     * EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html)
     */
    public inline fun cfnJobDefinitionEfsVolumeConfigurationProperty(
        block: CfnJobDefinitionEfsVolumeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EfsVolumeConfigurationProperty {
        val builder = CfnJobDefinitionEfsVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An environment variable.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EksContainerEnvironmentVariableProperty eksContainerEnvironmentVariableProperty =
     * EksContainerEnvironmentVariableProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainerenvironmentvariable.html)
     */
    public inline fun cfnJobDefinitionEksContainerEnvironmentVariableProperty(
        block: CfnJobDefinitionEksContainerEnvironmentVariablePropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EksContainerEnvironmentVariableProperty {
        val builder = CfnJobDefinitionEksContainerEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * EKS container properties are used in job definitions for Amazon EKS based job definitions to
     * describe the properties for a container node in the pod that's launched as part of a job.
     *
     * This can't be specified for Amazon ECS based job definitions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object limits;
     * Object requests;
     * EksContainerProperty eksContainerProperty = EksContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .args(List.of("args"))
     * .command(List.of("command"))
     * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .imagePullPolicy("imagePullPolicy")
     * .name("name")
     * .resources(ResourcesProperty.builder()
     * .limits(limits)
     * .requests(requests)
     * .build())
     * .securityContext(SecurityContextProperty.builder()
     * .privileged(false)
     * .readOnlyRootFilesystem(false)
     * .runAsGroup(123)
     * .runAsNonRoot(false)
     * .runAsUser(123)
     * .build())
     * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
     * .mountPath("mountPath")
     * .name("name")
     * .readOnly(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html)
     */
    public inline fun cfnJobDefinitionEksContainerProperty(
        block: CfnJobDefinitionEksContainerPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EksContainerProperty {
        val builder = CfnJobDefinitionEksContainerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The volume mounts for a container for an Amazon EKS job.
     *
     * For more information about volumes and volume mounts in Kubernetes, see
     * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/)
     * in the *Kubernetes documentation* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EksContainerVolumeMountProperty eksContainerVolumeMountProperty =
     * EksContainerVolumeMountProperty.builder()
     * .mountPath("mountPath")
     * .name("name")
     * .readOnly(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html)
     */
    public inline fun cfnJobDefinitionEksContainerVolumeMountProperty(
        block: CfnJobDefinitionEksContainerVolumeMountPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EksContainerVolumeMountProperty {
        val builder = CfnJobDefinitionEksContainerVolumeMountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains the properties for the Kubernetes resources of a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object labels;
     * Object limits;
     * Object requests;
     * EksPropertiesProperty eksPropertiesProperty = EksPropertiesProperty.builder()
     * .podProperties(PodPropertiesProperty.builder()
     * .containers(List.of(EksContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .args(List.of("args"))
     * .command(List.of("command"))
     * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .imagePullPolicy("imagePullPolicy")
     * .name("name")
     * .resources(ResourcesProperty.builder()
     * .limits(limits)
     * .requests(requests)
     * .build())
     * .securityContext(SecurityContextProperty.builder()
     * .privileged(false)
     * .readOnlyRootFilesystem(false)
     * .runAsGroup(123)
     * .runAsNonRoot(false)
     * .runAsUser(123)
     * .build())
     * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
     * .mountPath("mountPath")
     * .name("name")
     * .readOnly(false)
     * .build()))
     * .build()))
     * .dnsPolicy("dnsPolicy")
     * .hostNetwork(false)
     * .metadata(MetadataProperty.builder()
     * .labels(labels)
     * .build())
     * .serviceAccountName("serviceAccountName")
     * .volumes(List.of(EksVolumeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .emptyDir(EmptyDirProperty.builder()
     * .medium("medium")
     * .sizeLimit("sizeLimit")
     * .build())
     * .hostPath(HostPathProperty.builder()
     * .path("path")
     * .build())
     * .secret(EksSecretProperty.builder()
     * .secretName("secretName")
     * // the properties below are optional
     * .optional(false)
     * .build())
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksproperties.html)
     */
    public inline fun cfnJobDefinitionEksPropertiesProperty(
        block: CfnJobDefinitionEksPropertiesPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EksPropertiesProperty {
        val builder = CfnJobDefinitionEksPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of a Kubernetes `secret` volume.
     *
     * For more information, see
     * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
     * in the *Kubernetes documentation* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EksSecretProperty eksSecretProperty = EksSecretProperty.builder()
     * .secretName("secretName")
     * // the properties below are optional
     * .optional(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekssecret.html)
     */
    public inline fun cfnJobDefinitionEksSecretProperty(
        block: CfnJobDefinitionEksSecretPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EksSecretProperty {
        val builder = CfnJobDefinitionEksSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon EKS volume for a job definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EksVolumeProperty eksVolumeProperty = EksVolumeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .emptyDir(EmptyDirProperty.builder()
     * .medium("medium")
     * .sizeLimit("sizeLimit")
     * .build())
     * .hostPath(HostPathProperty.builder()
     * .path("path")
     * .build())
     * .secret(EksSecretProperty.builder()
     * .secretName("secretName")
     * // the properties below are optional
     * .optional(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksvolume.html)
     */
    public inline fun cfnJobDefinitionEksVolumeProperty(
        block: CfnJobDefinitionEksVolumePropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EksVolumeProperty {
        val builder = CfnJobDefinitionEksVolumePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EmptyDirProperty emptyDirProperty = EmptyDirProperty.builder()
     * .medium("medium")
     * .sizeLimit("sizeLimit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-emptydir.html)
     */
    public inline fun cfnJobDefinitionEmptyDirProperty(
        block: CfnJobDefinitionEmptyDirPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EmptyDirProperty {
        val builder = CfnJobDefinitionEmptyDirPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Environment property type specifies environment variables to use in a job definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html)
     */
    public inline fun cfnJobDefinitionEnvironmentProperty(
        block: CfnJobDefinitionEnvironmentPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EnvironmentProperty {
        val builder = CfnJobDefinitionEnvironmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The amount of ephemeral storage to allocate for the task.
     *
     * This parameter is used to expand the total amount of ephemeral storage available, beyond the
     * default amount, for tasks hosted on AWS Fargate .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ephemeralstorage.html)
     */
    public inline fun cfnJobDefinitionEphemeralStorageProperty(
        block: CfnJobDefinitionEphemeralStoragePropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EphemeralStorageProperty {
        val builder = CfnJobDefinitionEphemeralStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an array of up to 5 conditions to be met, and an action to take ( `RETRY` or `EXIT`
     * ) if all conditions are met.
     *
     * If none of the `EvaluateOnExit` conditions in a `RetryStrategy` match, then the job is
     * retried.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EvaluateOnExitProperty evaluateOnExitProperty = EvaluateOnExitProperty.builder()
     * .action("action")
     * // the properties below are optional
     * .onExitCode("onExitCode")
     * .onReason("onReason")
     * .onStatusReason("onStatusReason")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html)
     */
    public inline fun cfnJobDefinitionEvaluateOnExitProperty(
        block: CfnJobDefinitionEvaluateOnExitPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.EvaluateOnExitProperty {
        val builder = CfnJobDefinitionEvaluateOnExitPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The platform configuration for jobs that are running on Fargate resources.
     *
     * Jobs that run on EC2 resources must not specify this parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * FargatePlatformConfigurationProperty fargatePlatformConfigurationProperty =
     * FargatePlatformConfigurationProperty.builder()
     * .platformVersion("platformVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-fargateplatformconfiguration.html)
     */
    public inline fun cfnJobDefinitionFargatePlatformConfigurationProperty(
        block: CfnJobDefinitionFargatePlatformConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.FargatePlatformConfigurationProperty {
        val builder = CfnJobDefinitionFargatePlatformConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * HostPathProperty hostPathProperty = HostPathProperty.builder()
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-hostpath.html)
     */
    public inline fun cfnJobDefinitionHostPathProperty(
        block: CfnJobDefinitionHostPathPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.HostPathProperty {
        val builder = CfnJobDefinitionHostPathPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Linux-specific modifications that are applied to the container, such as details for device
     * mappings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * LinuxParametersProperty linuxParametersProperty = LinuxParametersProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html)
     */
    public inline fun cfnJobDefinitionLinuxParametersProperty(
        block: CfnJobDefinitionLinuxParametersPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.LinuxParametersProperty {
        val builder = CfnJobDefinitionLinuxParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Log configuration options to send to a custom log driver for the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object options;
     * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(options)
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-logconfiguration.html)
     */
    public inline fun cfnJobDefinitionLogConfigurationProperty(
        block: CfnJobDefinitionLogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.LogConfigurationProperty {
        val builder = CfnJobDefinitionLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata about the Kubernetes pod.
     *
     * For more information, see
     * [Understanding Kubernetes Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
     * in the *Kubernetes documentation* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object labels;
     * MetadataProperty metadataProperty = MetadataProperty.builder()
     * .labels(labels)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-metadata.html)
     */
    public inline fun cfnJobDefinitionMetadataProperty(
        block: CfnJobDefinitionMetadataPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.MetadataProperty {
        val builder = CfnJobDefinitionMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for a Docker volume mount point that's used in a job's container properties.
     *
     * This parameter maps to `Volumes` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.43/#tag/Container/operation/ContainerCreate)
     * section of the *Docker Remote API* and the `--volume` option to docker run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * MountPointsProperty mountPointsProperty = MountPointsProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html)
     */
    public inline fun cfnJobDefinitionMountPointsProperty(
        block: CfnJobDefinitionMountPointsPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.MountPointsProperty {
        val builder = CfnJobDefinitionMountPointsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The network configuration for jobs that are running on Fargate resources.
     *
     * Jobs that are running on EC2 resources must not specify this parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-networkconfiguration.html)
     */
    public inline fun cfnJobDefinitionNetworkConfigurationProperty(
        block: CfnJobDefinitionNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.NetworkConfigurationProperty {
        val builder = CfnJobDefinitionNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents the node properties of a multi-node parallel job.
     *
     * Node properties can't be specified for Amazon EKS based job definitions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object options;
     * NodePropertiesProperty nodePropertiesProperty = NodePropertiesProperty.builder()
     * .mainNode(123)
     * .nodeRangeProperties(List.of(NodeRangePropertyProperty.builder()
     * .targetNodes("targetNodes")
     * // the properties below are optional
     * .container(ContainerPropertiesProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(List.of(EnvironmentProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
     * .platformVersion("platformVersion")
     * .build())
     * .instanceType("instanceType")
     * .jobRoleArn("jobRoleArn")
     * .linuxParameters(LinuxParametersProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(options)
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .mountPoints(List.of(MountPointsProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .build())
     * .privileged(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .vcpus(123)
     * .volumes(List.of(VolumesProperty.builder()
     * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build())
     * .build()))
     * .numNodes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html)
     */
    public inline fun cfnJobDefinitionNodePropertiesProperty(
        block: CfnJobDefinitionNodePropertiesPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.NodePropertiesProperty {
        val builder = CfnJobDefinitionNodePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents the properties of the node range for a multi-node parallel job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object options;
     * NodeRangePropertyProperty nodeRangePropertyProperty = NodeRangePropertyProperty.builder()
     * .targetNodes("targetNodes")
     * // the properties below are optional
     * .container(ContainerPropertiesProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(List.of(EnvironmentProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
     * .platformVersion("platformVersion")
     * .build())
     * .instanceType("instanceType")
     * .jobRoleArn("jobRoleArn")
     * .linuxParameters(LinuxParametersProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(options)
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .mountPoints(List.of(MountPointsProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .build())
     * .privileged(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .vcpus(123)
     * .volumes(List.of(VolumesProperty.builder()
     * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html)
     */
    public inline fun cfnJobDefinitionNodeRangePropertyProperty(
        block: CfnJobDefinitionNodeRangePropertyPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.NodeRangePropertyProperty {
        val builder = CfnJobDefinitionNodeRangePropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the pod.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object labels;
     * Object limits;
     * Object requests;
     * PodPropertiesProperty podPropertiesProperty = PodPropertiesProperty.builder()
     * .containers(List.of(EksContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .args(List.of("args"))
     * .command(List.of("command"))
     * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .imagePullPolicy("imagePullPolicy")
     * .name("name")
     * .resources(ResourcesProperty.builder()
     * .limits(limits)
     * .requests(requests)
     * .build())
     * .securityContext(SecurityContextProperty.builder()
     * .privileged(false)
     * .readOnlyRootFilesystem(false)
     * .runAsGroup(123)
     * .runAsNonRoot(false)
     * .runAsUser(123)
     * .build())
     * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
     * .mountPath("mountPath")
     * .name("name")
     * .readOnly(false)
     * .build()))
     * .build()))
     * .dnsPolicy("dnsPolicy")
     * .hostNetwork(false)
     * .metadata(MetadataProperty.builder()
     * .labels(labels)
     * .build())
     * .serviceAccountName("serviceAccountName")
     * .volumes(List.of(EksVolumeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .emptyDir(EmptyDirProperty.builder()
     * .medium("medium")
     * .sizeLimit("sizeLimit")
     * .build())
     * .hostPath(HostPathProperty.builder()
     * .path("path")
     * .build())
     * .secret(EksSecretProperty.builder()
     * .secretName("secretName")
     * // the properties below are optional
     * .optional(false)
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html)
     */
    public inline fun cfnJobDefinitionPodPropertiesProperty(
        block: CfnJobDefinitionPodPropertiesPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.PodPropertiesProperty {
        val builder = CfnJobDefinitionPodPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnJobDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object labels;
     * Object limits;
     * Object options;
     * Object parameters;
     * Object requests;
     * Object tags;
     * CfnJobDefinitionProps cfnJobDefinitionProps = CfnJobDefinitionProps.builder()
     * .type("type")
     * // the properties below are optional
     * .containerProperties(ContainerPropertiesProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(List.of(EnvironmentProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
     * .platformVersion("platformVersion")
     * .build())
     * .instanceType("instanceType")
     * .jobRoleArn("jobRoleArn")
     * .linuxParameters(LinuxParametersProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(options)
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .mountPoints(List.of(MountPointsProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .build())
     * .privileged(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .vcpus(123)
     * .volumes(List.of(VolumesProperty.builder()
     * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build())
     * .eksProperties(EksPropertiesProperty.builder()
     * .podProperties(PodPropertiesProperty.builder()
     * .containers(List.of(EksContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .args(List.of("args"))
     * .command(List.of("command"))
     * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .imagePullPolicy("imagePullPolicy")
     * .name("name")
     * .resources(ResourcesProperty.builder()
     * .limits(limits)
     * .requests(requests)
     * .build())
     * .securityContext(SecurityContextProperty.builder()
     * .privileged(false)
     * .readOnlyRootFilesystem(false)
     * .runAsGroup(123)
     * .runAsNonRoot(false)
     * .runAsUser(123)
     * .build())
     * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
     * .mountPath("mountPath")
     * .name("name")
     * .readOnly(false)
     * .build()))
     * .build()))
     * .dnsPolicy("dnsPolicy")
     * .hostNetwork(false)
     * .metadata(MetadataProperty.builder()
     * .labels(labels)
     * .build())
     * .serviceAccountName("serviceAccountName")
     * .volumes(List.of(EksVolumeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .emptyDir(EmptyDirProperty.builder()
     * .medium("medium")
     * .sizeLimit("sizeLimit")
     * .build())
     * .hostPath(HostPathProperty.builder()
     * .path("path")
     * .build())
     * .secret(EksSecretProperty.builder()
     * .secretName("secretName")
     * // the properties below are optional
     * .optional(false)
     * .build())
     * .build()))
     * .build())
     * .build())
     * .jobDefinitionName("jobDefinitionName")
     * .nodeProperties(NodePropertiesProperty.builder()
     * .mainNode(123)
     * .nodeRangeProperties(List.of(NodeRangePropertyProperty.builder()
     * .targetNodes("targetNodes")
     * // the properties below are optional
     * .container(ContainerPropertiesProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(List.of(EnvironmentProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
     * .platformVersion("platformVersion")
     * .build())
     * .instanceType("instanceType")
     * .jobRoleArn("jobRoleArn")
     * .linuxParameters(LinuxParametersProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(options)
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .mountPoints(List.of(MountPointsProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .build())
     * .privileged(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .vcpus(123)
     * .volumes(List.of(VolumesProperty.builder()
     * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build())
     * .build()))
     * .numNodes(123)
     * .build())
     * .parameters(parameters)
     * .platformCapabilities(List.of("platformCapabilities"))
     * .propagateTags(false)
     * .retryStrategy(RetryStrategyProperty.builder()
     * .attempts(123)
     * .evaluateOnExit(List.of(EvaluateOnExitProperty.builder()
     * .action("action")
     * // the properties below are optional
     * .onExitCode("onExitCode")
     * .onReason("onReason")
     * .onStatusReason("onStatusReason")
     * .build()))
     * .build())
     * .schedulingPriority(123)
     * .tags(tags)
     * .timeout(TimeoutProperty.builder()
     * .attemptDurationSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html)
     */
    public inline fun cfnJobDefinitionProps(
        block: CfnJobDefinitionPropsDsl.() -> Unit = {}
    ): CfnJobDefinitionProps {
        val builder = CfnJobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The repository credentials for private registry authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * RepositoryCredentialsProperty repositoryCredentialsProperty =
     * RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-repositorycredentials.html)
     */
    public inline fun cfnJobDefinitionRepositoryCredentialsProperty(
        block: CfnJobDefinitionRepositoryCredentialsPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.RepositoryCredentialsProperty {
        val builder = CfnJobDefinitionRepositoryCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type and amount of a resource to assign to a container.
     *
     * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * ResourceRequirementProperty resourceRequirementProperty = ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resourcerequirement.html)
     */
    public inline fun cfnJobDefinitionResourceRequirementProperty(
        block: CfnJobDefinitionResourceRequirementPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.ResourceRequirementProperty {
        val builder = CfnJobDefinitionResourceRequirementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Object limits;
     * Object requests;
     * ResourcesProperty resourcesProperty = ResourcesProperty.builder()
     * .limits(limits)
     * .requests(requests)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-resources.html)
     */
    public inline fun cfnJobDefinitionResourcesProperty(
        block: CfnJobDefinitionResourcesPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.ResourcesProperty {
        val builder = CfnJobDefinitionResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The retry strategy that's associated with a job.
     *
     * For more information, see
     * [Automated job retries](https://docs.aws.amazon.com/batch/latest/userguide/job_retries.html)
     * in the *AWS Batch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * RetryStrategyProperty retryStrategyProperty = RetryStrategyProperty.builder()
     * .attempts(123)
     * .evaluateOnExit(List.of(EvaluateOnExitProperty.builder()
     * .action("action")
     * // the properties below are optional
     * .onExitCode("onExitCode")
     * .onReason("onReason")
     * .onStatusReason("onStatusReason")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html)
     */
    public inline fun cfnJobDefinitionRetryStrategyProperty(
        block: CfnJobDefinitionRetryStrategyPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.RetryStrategyProperty {
        val builder = CfnJobDefinitionRetryStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents the compute environment architecture for AWS Batch jobs on Fargate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * RuntimePlatformProperty runtimePlatformProperty = RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-runtimeplatform.html)
     */
    public inline fun cfnJobDefinitionRuntimePlatformProperty(
        block: CfnJobDefinitionRuntimePlatformPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.RuntimePlatformProperty {
        val builder = CfnJobDefinitionRuntimePlatformPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents the secret to expose to your container.
     *
     * Secrets can be exposed to a container in the following ways:
     * * To inject sensitive data into your containers as environment variables, use the `secrets`
     *   container definition parameter.
     * * To reference sensitive information in the log configuration of a container, use the
     *   `secretOptions` container definition parameter.
     *
     * For more information, see
     * [Specifying sensitive data](https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html)
     * in the *AWS Batch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * SecretProperty secretProperty = SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-secret.html)
     */
    public inline fun cfnJobDefinitionSecretProperty(
        block: CfnJobDefinitionSecretPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.SecretProperty {
        val builder = CfnJobDefinitionSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * SecurityContextProperty securityContextProperty = SecurityContextProperty.builder()
     * .privileged(false)
     * .readOnlyRootFilesystem(false)
     * .runAsGroup(123)
     * .runAsNonRoot(false)
     * .runAsUser(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html)
     */
    public inline fun cfnJobDefinitionSecurityContextProperty(
        block: CfnJobDefinitionSecurityContextPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.SecurityContextProperty {
        val builder = CfnJobDefinitionSecurityContextPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents a job timeout configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * TimeoutProperty timeoutProperty = TimeoutProperty.builder()
     * .attemptDurationSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html)
     */
    public inline fun cfnJobDefinitionTimeoutProperty(
        block: CfnJobDefinitionTimeoutPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.TimeoutProperty {
        val builder = CfnJobDefinitionTimeoutPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The container path, mount options, and size of the `tmpfs` mount.
     *
     * This object isn't applicable to jobs that are running on Fargate resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * TmpfsProperty tmpfsProperty = TmpfsProperty.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of("mountOptions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-tmpfs.html)
     */
    public inline fun cfnJobDefinitionTmpfsProperty(
        block: CfnJobDefinitionTmpfsPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.TmpfsProperty {
        val builder = CfnJobDefinitionTmpfsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ulimit` settings to pass to the container. For more information, see
     * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) .
     *
     * This object isn't applicable to jobs that are running on Fargate resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * UlimitProperty ulimitProperty = UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html)
     */
    public inline fun cfnJobDefinitionUlimitProperty(
        block: CfnJobDefinitionUlimitPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.UlimitProperty {
        val builder = CfnJobDefinitionUlimitPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determine whether your data volume persists on the host container instance and where it's
     * stored.
     *
     * If this parameter is empty, then the Docker daemon assigns a host path for your data volume.
     * However, the data isn't guaranteed to persist after the containers that are associated with
     * it stop running.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * VolumesHostProperty volumesHostProperty = VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html)
     */
    public inline fun cfnJobDefinitionVolumesHostProperty(
        block: CfnJobDefinitionVolumesHostPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.VolumesHostProperty {
        val builder = CfnJobDefinitionVolumesHostPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of volumes that are associated with the job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * VolumesProperty volumesProperty = VolumesProperty.builder()
     * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(VolumesHostProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html)
     */
    public inline fun cfnJobDefinitionVolumesProperty(
        block: CfnJobDefinitionVolumesPropertyDsl.() -> Unit = {}
    ): CfnJobDefinition.VolumesProperty {
        val builder = CfnJobDefinitionVolumesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Batch::JobQueue` resource specifies the parameters for an AWS Batch job queue
     * definition.
     *
     * For more information, see
     * [Job Queues](https://docs.aws.amazon.com/batch/latest/userguide/job_queues.html) in the ** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * CfnJobQueue cfnJobQueue = CfnJobQueue.Builder.create(this, "MyCfnJobQueue")
     * .computeEnvironmentOrder(List.of(ComputeEnvironmentOrderProperty.builder()
     * .computeEnvironment("computeEnvironment")
     * .order(123)
     * .build()))
     * .priority(123)
     * // the properties below are optional
     * .jobQueueName("jobQueueName")
     * .schedulingPolicyArn("schedulingPolicyArn")
     * .state("state")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html)
     */
    public inline fun cfnJobQueue(
        scope: Construct,
        id: String,
        block: CfnJobQueueDsl.() -> Unit = {},
    ): CfnJobQueue {
        val builder = CfnJobQueueDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The order that compute environments are tried in for job placement within a queue.
     *
     * Compute environments are tried in ascending order. For example, if two compute environments
     * are associated with a job queue, the compute environment with a lower order integer value is
     * tried for job placement first. Compute environments must be in the `VALID` state before you
     * can associate them with a job queue. All of the compute environments must be either EC2 (
     * `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate compute
     * environments can't be mixed.
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * ComputeEnvironmentOrderProperty computeEnvironmentOrderProperty =
     * ComputeEnvironmentOrderProperty.builder()
     * .computeEnvironment("computeEnvironment")
     * .order(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html)
     */
    public inline fun cfnJobQueueComputeEnvironmentOrderProperty(
        block: CfnJobQueueComputeEnvironmentOrderPropertyDsl.() -> Unit = {}
    ): CfnJobQueue.ComputeEnvironmentOrderProperty {
        val builder = CfnJobQueueComputeEnvironmentOrderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnJobQueue`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * CfnJobQueueProps cfnJobQueueProps = CfnJobQueueProps.builder()
     * .computeEnvironmentOrder(List.of(ComputeEnvironmentOrderProperty.builder()
     * .computeEnvironment("computeEnvironment")
     * .order(123)
     * .build()))
     * .priority(123)
     * // the properties below are optional
     * .jobQueueName("jobQueueName")
     * .schedulingPolicyArn("schedulingPolicyArn")
     * .state("state")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html)
     */
    public inline fun cfnJobQueueProps(
        block: CfnJobQueuePropsDsl.() -> Unit = {}
    ): CfnJobQueueProps {
        val builder = CfnJobQueuePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Batch::SchedulingPolicy` resource specifies the parameters for an AWS Batch
     * scheduling policy.
     *
     * For more information, see
     * [Scheduling Policies](https://docs.aws.amazon.com/batch/latest/userguide/scheduling_policies.html)
     * in the ** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * CfnSchedulingPolicy cfnSchedulingPolicy = CfnSchedulingPolicy.Builder.create(this,
     * "MyCfnSchedulingPolicy")
     * .fairsharePolicy(FairsharePolicyProperty.builder()
     * .computeReservation(123)
     * .shareDecaySeconds(123)
     * .shareDistribution(List.of(ShareAttributesProperty.builder()
     * .shareIdentifier("shareIdentifier")
     * .weightFactor(123)
     * .build()))
     * .build())
     * .name("name")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html)
     */
    public inline fun cfnSchedulingPolicy(
        scope: Construct,
        id: String,
        block: CfnSchedulingPolicyDsl.() -> Unit = {},
    ): CfnSchedulingPolicy {
        val builder = CfnSchedulingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The fair share policy for a scheduling policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * FairsharePolicyProperty fairsharePolicyProperty = FairsharePolicyProperty.builder()
     * .computeReservation(123)
     * .shareDecaySeconds(123)
     * .shareDistribution(List.of(ShareAttributesProperty.builder()
     * .shareIdentifier("shareIdentifier")
     * .weightFactor(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-fairsharepolicy.html)
     */
    public inline fun cfnSchedulingPolicyFairsharePolicyProperty(
        block: CfnSchedulingPolicyFairsharePolicyPropertyDsl.() -> Unit = {}
    ): CfnSchedulingPolicy.FairsharePolicyProperty {
        val builder = CfnSchedulingPolicyFairsharePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSchedulingPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * CfnSchedulingPolicyProps cfnSchedulingPolicyProps = CfnSchedulingPolicyProps.builder()
     * .fairsharePolicy(FairsharePolicyProperty.builder()
     * .computeReservation(123)
     * .shareDecaySeconds(123)
     * .shareDistribution(List.of(ShareAttributesProperty.builder()
     * .shareIdentifier("shareIdentifier")
     * .weightFactor(123)
     * .build()))
     * .build())
     * .name("name")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-schedulingpolicy.html)
     */
    public inline fun cfnSchedulingPolicyProps(
        block: CfnSchedulingPolicyPropsDsl.() -> Unit = {}
    ): CfnSchedulingPolicyProps {
        val builder = CfnSchedulingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the weights for the fair share identifiers for the fair share policy.
     *
     * Fair share identifiers that aren't included have a default weight of `1.0` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * ShareAttributesProperty shareAttributesProperty = ShareAttributesProperty.builder()
     * .shareIdentifier("shareIdentifier")
     * .weightFactor(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-schedulingpolicy-shareattributes.html)
     */
    public inline fun cfnSchedulingPolicyShareAttributesProperty(
        block: CfnSchedulingPolicyShareAttributesPropertyDsl.() -> Unit = {}
    ): CfnSchedulingPolicy.ShareAttributesProperty {
        val builder = CfnSchedulingPolicyShareAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props common to all ComputeEnvironments.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * ComputeEnvironmentProps computeEnvironmentProps = ComputeEnvironmentProps.builder()
     * .computeEnvironmentName("computeEnvironmentName")
     * .enabled(false)
     * .serviceRole(role)
     * .build();
     * ```
     */
    public inline fun computeEnvironmentProps(
        block: ComputeEnvironmentPropsDsl.() -> Unit = {}
    ): ComputeEnvironmentProps {
        val builder = ComputeEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The corresponding Action will only be taken if *all* of the conditions specified here are
     * met.
     *
     * Example:
     * ```
     * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .build())
     * .retryAttempts(5)
     * .retryStrategies(List.of(RetryStrategy.of(Action.EXIT, Reason.CANNOT_PULL_CONTAINER)))
     * .build();
     * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.SPOT_INSTANCE_RECLAIMED));
     * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.CANNOT_PULL_CONTAINER));
     * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.custom(CustomReason.builder()
     * .onExitCode("40*")
     * .onReason("some reason")
     * .build())));
     * ```
     */
    public inline fun customReason(block: CustomReasonDsl.() -> Unit = {}): CustomReason {
        val builder = CustomReasonDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container instance host device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Device device = Device.builder()
     * .hostPath("hostPath")
     * // the properties below are optional
     * .containerPath("containerPath")
     * .permissions(List.of(DevicePermission.READ))
     * .build();
     * ```
     */
    public inline fun device(block: DeviceDsl.() -> Unit = {}): Device {
        val builder = DeviceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to configure an EcsContainerDefinition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * ContainerImage containerImage;
     * EcsVolume ecsVolume;
     * LinuxParameters linuxParameters;
     * LogDriver logDriver;
     * Role role;
     * Secret secret;
     * Size size;
     * EcsContainerDefinitionProps ecsContainerDefinitionProps = EcsContainerDefinitionProps.builder()
     * .cpu(123)
     * .image(containerImage)
     * .memory(size)
     * // the properties below are optional
     * .command(List.of("command"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .executionRole(role)
     * .jobRole(role)
     * .linuxParameters(linuxParameters)
     * .logging(logDriver)
     * .readonlyRootFilesystem(false)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .user("user")
     * .volumes(List.of(ecsVolume))
     * .build();
     * ```
     */
    public inline fun ecsContainerDefinitionProps(
        block: EcsContainerDefinitionPropsDsl.() -> Unit = {}
    ): EcsContainerDefinitionProps {
        val builder = EcsContainerDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container orchestrated by ECS that uses EC2 resources.
     *
     * Example:
     * ```
     * IVpc vpc;
     * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .build())
     * .build();
     * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
     * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
     * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
     * .vpc(vpc)
     * .build())
     * .order(1)
     * .build()))
     * .priority(10)
     * .build();
     * User user = new User(this, "MyUser");
     * ecsJob.grantSubmitJob(user, queue);
     * ```
     */
    public inline fun ecsEc2ContainerDefinition(
        scope: Construct,
        id: String,
        block: EcsEc2ContainerDefinitionDsl.() -> Unit = {},
    ): EcsEc2ContainerDefinition {
        val builder = EcsEc2ContainerDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to configure an EcsEc2ContainerDefinition.
     *
     * Example:
     * ```
     * IVpc vpc;
     * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .build())
     * .build();
     * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
     * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
     * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
     * .vpc(vpc)
     * .build())
     * .order(1)
     * .build()))
     * .priority(10)
     * .build();
     * User user = new User(this, "MyUser");
     * ecsJob.grantSubmitJob(user, queue);
     * ```
     */
    public inline fun ecsEc2ContainerDefinitionProps(
        block: EcsEc2ContainerDefinitionPropsDsl.() -> Unit = {}
    ): EcsEc2ContainerDefinitionProps {
        val builder = EcsEc2ContainerDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container orchestrated by ECS that uses Fargate resources.
     *
     * Example:
     * ```
     * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsFargateContainerDefinition.Builder.create(this, "myFargateContainer")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .ephemeralStorageSize(Size.gibibytes(100))
     * .fargateCpuArchitecture(CpuArchitecture.ARM64)
     * .fargateOperatingSystemFamily(OperatingSystemFamily.LINUX)
     * .build())
     * .build();
     * ```
     */
    public inline fun ecsFargateContainerDefinition(
        scope: Construct,
        id: String,
        block: EcsFargateContainerDefinitionDsl.() -> Unit = {},
    ): EcsFargateContainerDefinition {
        val builder = EcsFargateContainerDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to configure an EcsFargateContainerDefinition.
     *
     * Example:
     * ```
     * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsFargateContainerDefinition.Builder.create(this, "myFargateContainer")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .ephemeralStorageSize(Size.gibibytes(100))
     * .fargateCpuArchitecture(CpuArchitecture.ARM64)
     * .fargateOperatingSystemFamily(OperatingSystemFamily.LINUX)
     * .build())
     * .build();
     * ```
     */
    public inline fun ecsFargateContainerDefinitionProps(
        block: EcsFargateContainerDefinitionPropsDsl.() -> Unit = {}
    ): EcsFargateContainerDefinitionProps {
        val builder = EcsFargateContainerDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A JobDefinition that uses ECS orchestration.
     *
     * Example:
     * ```
     * IVpc vpc;
     * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .build())
     * .build();
     * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
     * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
     * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
     * .vpc(vpc)
     * .build())
     * .order(1)
     * .build()))
     * .priority(10)
     * .build();
     * User user = new User(this, "MyUser");
     * ecsJob.grantSubmitJob(user, queue);
     * ```
     */
    public inline fun ecsJobDefinition(
        scope: Construct,
        id: String,
        block: EcsJobDefinitionDsl.() -> Unit = {},
    ): EcsJobDefinition {
        val builder = EcsJobDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for EcsJobDefinition.
     *
     * Example:
     * ```
     * IVpc vpc;
     * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .build())
     * .build();
     * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
     * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
     * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
     * .vpc(vpc)
     * .build())
     * .order(1)
     * .build()))
     * .priority(10)
     * .build();
     * User user = new User(this, "MyUser");
     * ecsJob.grantSubmitJob(user, queue);
     * ```
     */
    public inline fun ecsJobDefinitionProps(
        block: EcsJobDefinitionPropsDsl.() -> Unit = {}
    ): EcsJobDefinitionProps {
        val builder = EcsJobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Batch MachineImage that is compatible with ECS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.ec2.*;
     * IMachineImage machineImage;
     * EcsMachineImage ecsMachineImage = EcsMachineImage.builder()
     * .image(machineImage)
     * .imageType(EcsMachineImageType.ECS_AL2)
     * .build();
     * ```
     */
    public inline fun ecsMachineImage(block: EcsMachineImageDsl.() -> Unit = {}): EcsMachineImage {
        val builder = EcsMachineImageDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to configure an EcsVolume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EcsVolumeOptions ecsVolumeOptions = EcsVolumeOptions.builder()
     * .containerPath("containerPath")
     * .name("name")
     * // the properties below are optional
     * .readonly(false)
     * .build();
     * ```
     */
    public inline fun ecsVolumeOptions(
        block: EcsVolumeOptionsDsl.() -> Unit = {}
    ): EcsVolumeOptions {
        val builder = EcsVolumeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Volume that uses an AWS Elastic File System (EFS);
     *
     * this volume can grow and shrink as needed
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.efs.*;
     * FileSystem fileSystem;
     * EfsVolume efsVolume = EfsVolume.Builder.create()
     * .containerPath("containerPath")
     * .fileSystem(fileSystem)
     * .name("name")
     * // the properties below are optional
     * .accessPointId("accessPointId")
     * .enableTransitEncryption(false)
     * .readonly(false)
     * .rootDirectory("rootDirectory")
     * .transitEncryptionPort(123)
     * .useJobRole(false)
     * .build();
     * ```
     */
    public inline fun efsVolume(block: EfsVolumeDsl.() -> Unit = {}): EfsVolume {
        val builder = EfsVolumeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring an EfsVolume.
     *
     * Example:
     * ```
     * IFileSystem myFileSystem;
     * Role myJobRole;
     * myFileSystem.grantRead(myJobRole);
     * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .volumes(List.of(EcsVolume.efs(EfsVolumeOptions.builder()
     * .name("myVolume")
     * .fileSystem(myFileSystem)
     * .containerPath("/Volumes/myVolume")
     * .useJobRole(true)
     * .build())))
     * .jobRole(myJobRole)
     * .build())
     * .build();
     * ```
     */
    public inline fun efsVolumeOptions(
        block: EfsVolumeOptionsDsl.() -> Unit = {}
    ): EfsVolumeOptions {
        val builder = EfsVolumeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container that can be run with EKS orchestration on EC2 resources.
     *
     * Example:
     * ```
     * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
     * .container(EksContainerDefinition.Builder.create(this, "container")
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
     * .name("myEmptyDirVolume")
     * .mountPath("/mount/path")
     * .medium(EmptyDirMediumType.MEMORY)
     * .readonly(true)
     * .sizeLimit(Size.mebibytes(2048))
     * .build())))
     * .build())
     * .build();
     * ```
     */
    public inline fun eksContainerDefinition(
        scope: Construct,
        id: String,
        block: EksContainerDefinitionDsl.() -> Unit = {},
    ): EksContainerDefinition {
        val builder = EksContainerDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to configure an EksContainerDefinition.
     *
     * Example:
     * ```
     * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
     * .container(EksContainerDefinition.Builder.create(this, "container")
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
     * .name("myEmptyDirVolume")
     * .mountPath("/mount/path")
     * .medium(EmptyDirMediumType.MEMORY)
     * .readonly(true)
     * .sizeLimit(Size.mebibytes(2048))
     * .build())))
     * .build())
     * .build();
     * ```
     */
    public inline fun eksContainerDefinitionProps(
        block: EksContainerDefinitionPropsDsl.() -> Unit = {}
    ): EksContainerDefinitionProps {
        val builder = EksContainerDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A JobDefinition that uses Eks orchestration.
     *
     * Example:
     * ```
     * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
     * .container(EksContainerDefinition.Builder.create(this, "container")
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
     * .name("myEmptyDirVolume")
     * .mountPath("/mount/path")
     * .medium(EmptyDirMediumType.MEMORY)
     * .readonly(true)
     * .sizeLimit(Size.mebibytes(2048))
     * .build())))
     * .build())
     * .build();
     * ```
     */
    public inline fun eksJobDefinition(
        scope: Construct,
        id: String,
        block: EksJobDefinitionDsl.() -> Unit = {},
    ): EksJobDefinition {
        val builder = EksJobDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for EksJobDefinition.
     *
     * Example:
     * ```
     * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
     * .container(EksContainerDefinition.Builder.create(this, "container")
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
     * .name("myEmptyDirVolume")
     * .mountPath("/mount/path")
     * .medium(EmptyDirMediumType.MEMORY)
     * .readonly(true)
     * .sizeLimit(Size.mebibytes(2048))
     * .build())))
     * .build())
     * .build();
     * ```
     */
    public inline fun eksJobDefinitionProps(
        block: EksJobDefinitionPropsDsl.() -> Unit = {}
    ): EksJobDefinitionProps {
        val builder = EksJobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Batch MachineImage that is compatible with EKS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.ec2.*;
     * IMachineImage machineImage;
     * EksMachineImage eksMachineImage = EksMachineImage.builder()
     * .image(machineImage)
     * .imageType(EksMachineImageType.EKS_AL2)
     * .build();
     * ```
     */
    public inline fun eksMachineImage(block: EksMachineImageDsl.() -> Unit = {}): EksMachineImage {
        val builder = EksMachineImageDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to configure an EksVolume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * EksVolumeOptions eksVolumeOptions = EksVolumeOptions.builder()
     * .name("name")
     * // the properties below are optional
     * .mountPath("mountPath")
     * .readonly(false)
     * .build();
     * ```
     */
    public inline fun eksVolumeOptions(
        block: EksVolumeOptionsDsl.() -> Unit = {}
    ): EksVolumeOptions {
        val builder = EksVolumeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Kubernetes EmptyDir volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * Size size;
     * EmptyDirVolume emptyDirVolume = EmptyDirVolume.Builder.create()
     * .name("name")
     * // the properties below are optional
     * .medium(EmptyDirMediumType.DISK)
     * .mountPath("mountPath")
     * .readonly(false)
     * .sizeLimit(size)
     * .build();
     * ```
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
     */
    public inline fun emptyDirVolume(block: EmptyDirVolumeDsl.() -> Unit = {}): EmptyDirVolume {
        val builder = EmptyDirVolumeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a Kubernetes EmptyDir volume.
     *
     * Example:
     * ```
     * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
     * .container(EksContainerDefinition.Builder.create(this, "container")
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
     * .name("myEmptyDirVolume")
     * .mountPath("/mount/path")
     * .medium(EmptyDirMediumType.MEMORY)
     * .readonly(true)
     * .sizeLimit(Size.mebibytes(2048))
     * .build())))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
     */
    public inline fun emptyDirVolumeOptions(
        block: EmptyDirVolumeOptionsDsl.() -> Unit = {}
    ): EmptyDirVolumeOptions {
        val builder = EmptyDirVolumeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a Fairshare Scheduling Policy. Instructs the scheduler to allocate
     * ComputeEnvironment vCPUs based on Job shareIdentifiers.
     *
     * The Faireshare Scheduling Policy ensures that each share gets a certain amount of vCPUs. The
     * scheduler does this by deciding how many Jobs of each share to schedule *relative to how many
     * jobs of each share are currently being executed by the ComputeEnvironment*. The weight
     * factors associated with each share determine the ratio of vCPUs allocated; see the readme for
     * a more in-depth discussion of fairshare policies.
     *
     * Example:
     * ```
     * FairshareSchedulingPolicy fairsharePolicy = new FairshareSchedulingPolicy(this,
     * "myFairsharePolicy");
     * fairsharePolicy.addShare(Share.builder()
     * .shareIdentifier("A")
     * .weightFactor(1)
     * .build());
     * fairsharePolicy.addShare(Share.builder()
     * .shareIdentifier("B")
     * .weightFactor(1)
     * .build());
     * JobQueue.Builder.create(this, "JobQueue")
     * .schedulingPolicy(fairsharePolicy)
     * .build();
     * ```
     */
    public inline fun fairshareSchedulingPolicy(
        scope: Construct,
        id: String,
        block: FairshareSchedulingPolicyDsl.() -> Unit = {},
    ): FairshareSchedulingPolicy {
        val builder = FairshareSchedulingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Fairshare SchedulingPolicy configuration.
     *
     * Example:
     * ```
     * FairshareSchedulingPolicy fairsharePolicy = FairshareSchedulingPolicy.Builder.create(this,
     * "myFairsharePolicy")
     * .shareDecay(Duration.minutes(5))
     * .build();
     * ```
     */
    public inline fun fairshareSchedulingPolicyProps(
        block: FairshareSchedulingPolicyPropsDsl.() -> Unit = {}
    ): FairshareSchedulingPolicyProps {
        val builder = FairshareSchedulingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A ManagedComputeEnvironment that uses ECS orchestration on Fargate instances.
     *
     * Example:
     * ```
     * IVpc vpc;
     * FargateComputeEnvironment sharedComputeEnv = FargateComputeEnvironment.Builder.create(this,
     * "spotEnv")
     * .vpc(vpc)
     * .spot(true)
     * .build();
     * JobQueue lowPriorityQueue = JobQueue.Builder.create(this, "JobQueue")
     * .priority(1)
     * .build();
     * JobQueue highPriorityQueue = JobQueue.Builder.create(this, "JobQueue")
     * .priority(10)
     * .build();
     * lowPriorityQueue.addComputeEnvironment(sharedComputeEnv, 1);
     * highPriorityQueue.addComputeEnvironment(sharedComputeEnv, 1);
     * ```
     */
    public inline fun fargateComputeEnvironment(
        scope: Construct,
        id: String,
        block: FargateComputeEnvironmentDsl.() -> Unit = {},
    ): FargateComputeEnvironment {
        val builder = FargateComputeEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for a FargateComputeEnvironment.
     *
     * Example:
     * ```
     * IVpc vpc;
     * FargateComputeEnvironment sharedComputeEnv = FargateComputeEnvironment.Builder.create(this,
     * "spotEnv")
     * .vpc(vpc)
     * .spot(true)
     * .build();
     * JobQueue lowPriorityQueue = JobQueue.Builder.create(this, "JobQueue")
     * .priority(1)
     * .build();
     * JobQueue highPriorityQueue = JobQueue.Builder.create(this, "JobQueue")
     * .priority(10)
     * .build();
     * lowPriorityQueue.addComputeEnvironment(sharedComputeEnv, 1);
     * highPriorityQueue.addComputeEnvironment(sharedComputeEnv, 1);
     * ```
     */
    public inline fun fargateComputeEnvironmentProps(
        block: FargateComputeEnvironmentPropsDsl.() -> Unit = {}
    ): FargateComputeEnvironmentProps {
        val builder = FargateComputeEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Kubernetes HostPath volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * HostPathVolume hostPathVolume = HostPathVolume.Builder.create()
     * .hostPath("hostPath")
     * .name("name")
     * // the properties below are optional
     * .mountPath("mountPath")
     * .readonly(false)
     * .build();
     * ```
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
     */
    public inline fun hostPathVolume(block: HostPathVolumeDsl.() -> Unit = {}): HostPathVolume {
        val builder = HostPathVolumeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a kubernetes HostPath volume.
     *
     * Example:
     * ```
     * EksJobDefinition jobDefn;
     * jobDefn.container.addVolume(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
     * .name("emptyDir")
     * .mountPath("/Volumes/emptyDir")
     * .build()));
     * jobDefn.container.addVolume(EksVolume.hostPath(HostPathVolumeOptions.builder()
     * .name("hostPath")
     * .hostPath("/sys")
     * .mountPath("/Volumes/hostPath")
     * .build()));
     * jobDefn.container.addVolume(EksVolume.secret(SecretPathVolumeOptions.builder()
     * .name("secret")
     * .optional(true)
     * .mountPath("/Volumes/secret")
     * .secretName("mySecret")
     * .build()));
     * ```
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
     */
    public inline fun hostPathVolumeOptions(
        block: HostPathVolumeOptionsDsl.() -> Unit = {}
    ): HostPathVolumeOptions {
        val builder = HostPathVolumeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a Host volume.
     *
     * This volume will persist on the host at the specified `hostPath`. If the `hostPath` is not
     * specified, Docker will choose the host path. In this case, the data may not persist after the
     * containers that use it stop running.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * HostVolume hostVolume = HostVolume.Builder.create()
     * .containerPath("containerPath")
     * .name("name")
     * // the properties below are optional
     * .hostPath("hostPath")
     * .readonly(false)
     * .build();
     * ```
     */
    public inline fun hostVolume(block: HostVolumeDsl.() -> Unit = {}): HostVolume {
        val builder = HostVolumeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring an ECS HostVolume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * HostVolumeOptions hostVolumeOptions = HostVolumeOptions.builder()
     * .containerPath("containerPath")
     * .name("name")
     * // the properties below are optional
     * .hostPath("hostPath")
     * .readonly(false)
     * .build();
     * ```
     */
    public inline fun hostVolumeOptions(
        block: HostVolumeOptionsDsl.() -> Unit = {}
    ): HostVolumeOptions {
        val builder = HostVolumeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props common to all JobDefinitions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * Object parameters;
     * RetryStrategy retryStrategy;
     * JobDefinitionProps jobDefinitionProps = JobDefinitionProps.builder()
     * .jobDefinitionName("jobDefinitionName")
     * .parameters(Map.of(
     * "parametersKey", parameters))
     * .retryAttempts(123)
     * .retryStrategies(List.of(retryStrategy))
     * .schedulingPriority(123)
     * .timeout(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun jobDefinitionProps(
        block: JobDefinitionPropsDsl.() -> Unit = {}
    ): JobDefinitionProps {
        val builder = JobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * JobQueues can receive Jobs, which are removed from the queue when sent to the linked
     * ComputeEnvironment(s) to be executed.
     *
     * Jobs exit the queue in FIFO order unless a `SchedulingPolicy` is linked.
     *
     * Example:
     * ```
     * IVpc vpc;
     * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .build())
     * .build();
     * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
     * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
     * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
     * .vpc(vpc)
     * .build())
     * .order(1)
     * .build()))
     * .priority(10)
     * .build();
     * User user = new User(this, "MyUser");
     * ecsJob.grantSubmitJob(user, queue);
     * ```
     */
    public inline fun jobQueue(
        scope: Construct,
        id: String,
        block: JobQueueDsl.() -> Unit = {},
    ): JobQueue {
        val builder = JobQueueDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to configure a JobQueue.
     *
     * Example:
     * ```
     * IVpc vpc;
     * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
     * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
     * .memory(Size.mebibytes(2048))
     * .cpu(256)
     * .build())
     * .build();
     * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
     * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
     * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
     * .vpc(vpc)
     * .build())
     * .order(1)
     * .build()))
     * .priority(10)
     * .build();
     * User user = new User(this, "MyUser");
     * ecsJob.grantSubmitJob(user, queue);
     * ```
     */
    public inline fun jobQueueProps(block: JobQueuePropsDsl.() -> Unit = {}): JobQueueProps {
        val builder = JobQueuePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Linux-specific options that are applied to the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * Size size;
     * LinuxParameters linuxParameters = LinuxParameters.Builder.create(this, "MyLinuxParameters")
     * .initProcessEnabled(false)
     * .maxSwap(size)
     * .sharedMemorySize(size)
     * .swappiness(123)
     * .build();
     * ```
     */
    public inline fun linuxParameters(
        scope: Construct,
        id: String,
        block: LinuxParametersDsl.() -> Unit = {},
    ): LinuxParameters {
        val builder = LinuxParametersDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for defining Linux-specific options that are applied to the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * Size size;
     * LinuxParametersProps linuxParametersProps = LinuxParametersProps.builder()
     * .initProcessEnabled(false)
     * .maxSwap(size)
     * .sharedMemorySize(size)
     * .swappiness(123)
     * .build();
     * ```
     */
    public inline fun linuxParametersProps(
        block: LinuxParametersPropsDsl.() -> Unit = {}
    ): LinuxParametersProps {
        val builder = LinuxParametersPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for a ManagedComputeEnvironment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * ManagedComputeEnvironmentProps managedComputeEnvironmentProps =
     * ManagedComputeEnvironmentProps.builder()
     * .vpc(vpc)
     * // the properties below are optional
     * .computeEnvironmentName("computeEnvironmentName")
     * .enabled(false)
     * .maxvCpus(123)
     * .replaceComputeEnvironment(false)
     * .securityGroups(List.of(securityGroup))
     * .serviceRole(role)
     * .spot(false)
     * .terminateOnUpdate(false)
     * .updateTimeout(Duration.minutes(30))
     * .updateToLatestImageVersion(false)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun managedComputeEnvironmentProps(
        block: ManagedComputeEnvironmentPropsDsl.() -> Unit = {}
    ): ManagedComputeEnvironmentProps {
        val builder = ManagedComputeEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A ManagedComputeEnvironment that uses ECS orchestration on EC2 instances.
     *
     * Example:
     * ```
     * IManagedEc2EcsComputeEnvironment computeEnv;
     * Vpc vpc = new Vpc(this, "VPC");
     * computeEnv.addInstanceClass(InstanceClass.M5AD);
     * // Or, specify it on the constructor:
     * // Or, specify it on the constructor:
     * ManagedEc2EcsComputeEnvironment.Builder.create(this, "myEc2ComputeEnv")
     * .vpc(vpc)
     * .instanceClasses(List.of(InstanceClass.R4))
     * .build();
     * ```
     */
    public inline fun managedEc2EcsComputeEnvironment(
        scope: Construct,
        id: String,
        block: ManagedEc2EcsComputeEnvironmentDsl.() -> Unit = {},
    ): ManagedEc2EcsComputeEnvironment {
        val builder = ManagedEc2EcsComputeEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for a ManagedEc2EcsComputeEnvironment.
     *
     * Example:
     * ```
     * IManagedEc2EcsComputeEnvironment computeEnv;
     * Vpc vpc = new Vpc(this, "VPC");
     * computeEnv.addInstanceClass(InstanceClass.M5AD);
     * // Or, specify it on the constructor:
     * // Or, specify it on the constructor:
     * ManagedEc2EcsComputeEnvironment.Builder.create(this, "myEc2ComputeEnv")
     * .vpc(vpc)
     * .instanceClasses(List.of(InstanceClass.R4))
     * .build();
     * ```
     */
    public inline fun managedEc2EcsComputeEnvironmentProps(
        block: ManagedEc2EcsComputeEnvironmentPropsDsl.() -> Unit = {}
    ): ManagedEc2EcsComputeEnvironmentProps {
        val builder = ManagedEc2EcsComputeEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A ManagedComputeEnvironment that uses ECS orchestration on EC2 instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.eks.*;
     * import software.amazon.awscdk.services.iam.*;
     * Cluster cluster;
     * InstanceType instanceType;
     * LaunchTemplate launchTemplate;
     * IMachineImage machineImage;
     * PlacementGroup placementGroup;
     * Role role;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * ManagedEc2EksComputeEnvironment managedEc2EksComputeEnvironment =
     * ManagedEc2EksComputeEnvironment.Builder.create(this, "MyManagedEc2EksComputeEnvironment")
     * .eksCluster(cluster)
     * .kubernetesNamespace("kubernetesNamespace")
     * .vpc(vpc)
     * // the properties below are optional
     * .allocationStrategy(AllocationStrategy.BEST_FIT)
     * .computeEnvironmentName("computeEnvironmentName")
     * .enabled(false)
     * .images(List.of(EksMachineImage.builder()
     * .image(machineImage)
     * .imageType(EksMachineImageType.EKS_AL2)
     * .build()))
     * .instanceClasses(List.of(InstanceClass.STANDARD3))
     * .instanceRole(role)
     * .instanceTypes(List.of(instanceType))
     * .launchTemplate(launchTemplate)
     * .maxvCpus(123)
     * .minvCpus(123)
     * .placementGroup(placementGroup)
     * .replaceComputeEnvironment(false)
     * .securityGroups(List.of(securityGroup))
     * .serviceRole(role)
     * .spot(false)
     * .spotBidPercentage(123)
     * .terminateOnUpdate(false)
     * .updateTimeout(Duration.minutes(30))
     * .updateToLatestImageVersion(false)
     * .useOptimalInstanceClasses(false)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun managedEc2EksComputeEnvironment(
        scope: Construct,
        id: String,
        block: ManagedEc2EksComputeEnvironmentDsl.() -> Unit = {},
    ): ManagedEc2EksComputeEnvironment {
        val builder = ManagedEc2EksComputeEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for a ManagedEc2EksComputeEnvironment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.eks.*;
     * import software.amazon.awscdk.services.iam.*;
     * Cluster cluster;
     * InstanceType instanceType;
     * LaunchTemplate launchTemplate;
     * IMachineImage machineImage;
     * PlacementGroup placementGroup;
     * Role role;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * ManagedEc2EksComputeEnvironmentProps managedEc2EksComputeEnvironmentProps =
     * ManagedEc2EksComputeEnvironmentProps.builder()
     * .eksCluster(cluster)
     * .kubernetesNamespace("kubernetesNamespace")
     * .vpc(vpc)
     * // the properties below are optional
     * .allocationStrategy(AllocationStrategy.BEST_FIT)
     * .computeEnvironmentName("computeEnvironmentName")
     * .enabled(false)
     * .images(List.of(EksMachineImage.builder()
     * .image(machineImage)
     * .imageType(EksMachineImageType.EKS_AL2)
     * .build()))
     * .instanceClasses(List.of(InstanceClass.STANDARD3))
     * .instanceRole(role)
     * .instanceTypes(List.of(instanceType))
     * .launchTemplate(launchTemplate)
     * .maxvCpus(123)
     * .minvCpus(123)
     * .placementGroup(placementGroup)
     * .replaceComputeEnvironment(false)
     * .securityGroups(List.of(securityGroup))
     * .serviceRole(role)
     * .spot(false)
     * .spotBidPercentage(123)
     * .terminateOnUpdate(false)
     * .updateTimeout(Duration.minutes(30))
     * .updateToLatestImageVersion(false)
     * .useOptimalInstanceClasses(false)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun managedEc2EksComputeEnvironmentProps(
        block: ManagedEc2EksComputeEnvironmentPropsDsl.() -> Unit = {}
    ): ManagedEc2EksComputeEnvironmentProps {
        val builder = ManagedEc2EksComputeEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Runs the container on nodes [startNode, endNode].
     *
     * Example:
     * ```
     * MultiNodeJobDefinition multiNodeJob = MultiNodeJobDefinition.Builder.create(this,
     * "JobDefinition")
     * .instanceType(InstanceType.of(InstanceClass.R4, InstanceSize.LARGE)) // optional, omit to let
     * Batch choose the type for you
     * .containers(List.of(MultiNodeContainer.builder()
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "mainMPIContainer")
     * .image(ContainerImage.fromRegistry("yourregsitry.com/yourMPIImage:latest"))
     * .cpu(256)
     * .memory(Size.mebibytes(2048))
     * .build())
     * .startNode(0)
     * .endNode(5)
     * .build()))
     * .build();
     * // convenience method
     * multiNodeJob.addContainer(MultiNodeContainer.builder()
     * .startNode(6)
     * .endNode(10)
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "multiContainer")
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .cpu(256)
     * .memory(Size.mebibytes(2048))
     * .build())
     * .build());
     * ```
     */
    public inline fun multiNodeContainer(
        block: MultiNodeContainerDsl.() -> Unit = {}
    ): MultiNodeContainer {
        val builder = MultiNodeContainerDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A JobDefinition that uses Ecs orchestration to run multiple containers.
     *
     * Example:
     * ```
     * MultiNodeJobDefinition multiNodeJob = MultiNodeJobDefinition.Builder.create(this,
     * "JobDefinition")
     * .instanceType(InstanceType.of(InstanceClass.R4, InstanceSize.LARGE)) // optional, omit to let
     * Batch choose the type for you
     * .containers(List.of(MultiNodeContainer.builder()
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "mainMPIContainer")
     * .image(ContainerImage.fromRegistry("yourregsitry.com/yourMPIImage:latest"))
     * .cpu(256)
     * .memory(Size.mebibytes(2048))
     * .build())
     * .startNode(0)
     * .endNode(5)
     * .build()))
     * .build();
     * // convenience method
     * multiNodeJob.addContainer(MultiNodeContainer.builder()
     * .startNode(6)
     * .endNode(10)
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "multiContainer")
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .cpu(256)
     * .memory(Size.mebibytes(2048))
     * .build())
     * .build());
     * ```
     */
    public inline fun multiNodeJobDefinition(
        scope: Construct,
        id: String,
        block: MultiNodeJobDefinitionDsl.() -> Unit = {},
    ): MultiNodeJobDefinition {
        val builder = MultiNodeJobDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to configure a MultiNodeJobDefinition.
     *
     * Example:
     * ```
     * MultiNodeJobDefinition multiNodeJob = MultiNodeJobDefinition.Builder.create(this,
     * "JobDefinition")
     * .instanceType(InstanceType.of(InstanceClass.R4, InstanceSize.LARGE)) // optional, omit to let
     * Batch choose the type for you
     * .containers(List.of(MultiNodeContainer.builder()
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "mainMPIContainer")
     * .image(ContainerImage.fromRegistry("yourregsitry.com/yourMPIImage:latest"))
     * .cpu(256)
     * .memory(Size.mebibytes(2048))
     * .build())
     * .startNode(0)
     * .endNode(5)
     * .build()))
     * .build();
     * // convenience method
     * multiNodeJob.addContainer(MultiNodeContainer.builder()
     * .startNode(6)
     * .endNode(10)
     * .container(EcsEc2ContainerDefinition.Builder.create(this, "multiContainer")
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .cpu(256)
     * .memory(Size.mebibytes(2048))
     * .build())
     * .build());
     * ```
     */
    public inline fun multiNodeJobDefinitionProps(
        block: MultiNodeJobDefinitionPropsDsl.() -> Unit = {}
    ): MultiNodeJobDefinitionProps {
        val builder = MultiNodeJobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Assigns an order to a ComputeEnvironment.
     *
     * The JobQueue will prioritize the lowest-order ComputeEnvironment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * IComputeEnvironment computeEnvironment;
     * OrderedComputeEnvironment orderedComputeEnvironment = OrderedComputeEnvironment.builder()
     * .computeEnvironment(computeEnvironment)
     * .order(123)
     * .build();
     * ```
     */
    public inline fun orderedComputeEnvironment(
        block: OrderedComputeEnvironmentDsl.() -> Unit = {}
    ): OrderedComputeEnvironment {
        val builder = OrderedComputeEnvironmentDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of a Kubernetes secret volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * SecretPathVolume secretPathVolume = SecretPathVolume.Builder.create()
     * .name("name")
     * .secretName("secretName")
     * // the properties below are optional
     * .mountPath("mountPath")
     * .optional(false)
     * .readonly(false)
     * .build();
     * ```
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#secret)
     */
    public inline fun secretPathVolume(
        block: SecretPathVolumeDsl.() -> Unit = {}
    ): SecretPathVolume {
        val builder = SecretPathVolumeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a Kubernetes SecretPath Volume.
     *
     * Example:
     * ```
     * EksJobDefinition jobDefn;
     * jobDefn.container.addVolume(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
     * .name("emptyDir")
     * .mountPath("/Volumes/emptyDir")
     * .build()));
     * jobDefn.container.addVolume(EksVolume.hostPath(HostPathVolumeOptions.builder()
     * .name("hostPath")
     * .hostPath("/sys")
     * .mountPath("/Volumes/hostPath")
     * .build()));
     * jobDefn.container.addVolume(EksVolume.secret(SecretPathVolumeOptions.builder()
     * .name("secret")
     * .optional(true)
     * .mountPath("/Volumes/secret")
     * .secretName("mySecret")
     * .build()));
     * ```
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#secret)
     */
    public inline fun secretPathVolumeOptions(
        block: SecretPathVolumeOptionsDsl.() -> Unit = {}
    ): SecretPathVolumeOptions {
        val builder = SecretPathVolumeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify the secret's version id or version stage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * SecretVersionInfo secretVersionInfo = SecretVersionInfo.builder()
     * .versionId("versionId")
     * .versionStage("versionStage")
     * .build();
     * ```
     */
    public inline fun secretVersionInfo(
        block: SecretVersionInfoDsl.() -> Unit = {}
    ): SecretVersionInfo {
        val builder = SecretVersionInfoDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a group of Job Definitions.
     *
     * All Job Definitions that declare a share identifier will be considered members of the Share
     * defined by that share identifier.
     *
     * The Scheduler divides the maximum available vCPUs of the ComputeEnvironment among Jobs in the
     * Queue based on their shareIdentifier and the weightFactor associated with that
     * shareIdentifier.
     *
     * Example:
     * ```
     * FairshareSchedulingPolicy fairsharePolicy = new FairshareSchedulingPolicy(this,
     * "myFairsharePolicy");
     * fairsharePolicy.addShare(Share.builder()
     * .shareIdentifier("A")
     * .weightFactor(1)
     * .build());
     * fairsharePolicy.addShare(Share.builder()
     * .shareIdentifier("B")
     * .weightFactor(1)
     * .build());
     * JobQueue.Builder.create(this, "JobQueue")
     * .schedulingPolicy(fairsharePolicy)
     * .build();
     * ```
     */
    public inline fun share(block: ShareDsl.() -> Unit = {}): Share {
        val builder = ShareDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a tmpfs mount for a container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.batch.*;
     * Size size;
     * Tmpfs tmpfs = Tmpfs.builder()
     * .containerPath("containerPath")
     * .size(size)
     * // the properties below are optional
     * .mountOptions(List.of(TmpfsMountOption.DEFAULTS))
     * .build();
     * ```
     */
    public inline fun tmpfs(block: TmpfsDsl.() -> Unit = {}): Tmpfs {
        val builder = TmpfsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets limits for a resource with `ulimit` on linux systems.
     *
     * Used by the Docker daemon.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * Ulimit ulimit = Ulimit.builder()
     * .hardLimit(123)
     * .name(UlimitName.CORE)
     * .softLimit(123)
     * .build();
     * ```
     */
    public inline fun ulimit(block: UlimitDsl.() -> Unit = {}): Ulimit {
        val builder = UlimitDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Unmanaged ComputeEnvironments do not provision or manage EC2 instances on your behalf.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * UnmanagedComputeEnvironment unmanagedComputeEnvironment =
     * UnmanagedComputeEnvironment.Builder.create(this, "MyUnmanagedComputeEnvironment")
     * .computeEnvironmentName("computeEnvironmentName")
     * .enabled(false)
     * .serviceRole(role)
     * .unmanagedvCpus(123)
     * .build();
     * ```
     */
    public inline fun unmanagedComputeEnvironment(
        scope: Construct,
        id: String,
        block: UnmanagedComputeEnvironmentDsl.() -> Unit = {},
    ): UnmanagedComputeEnvironment {
        val builder = UnmanagedComputeEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an UnmanagedComputeEnvironment.
     *
     * Batch will not provision instances on your behalf in this ComputeEvironment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.batch.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * UnmanagedComputeEnvironmentProps unmanagedComputeEnvironmentProps =
     * UnmanagedComputeEnvironmentProps.builder()
     * .computeEnvironmentName("computeEnvironmentName")
     * .enabled(false)
     * .serviceRole(role)
     * .unmanagedvCpus(123)
     * .build();
     * ```
     */
    public inline fun unmanagedComputeEnvironmentProps(
        block: UnmanagedComputeEnvironmentPropsDsl.() -> Unit = {}
    ): UnmanagedComputeEnvironmentProps {
        val builder = UnmanagedComputeEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public object EcsVolume {
        public fun efs(block: EfsVolumeOptionsDsl.() -> Unit = {}): EfsVolume {
            val builder = EfsVolumeOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.batch.EcsVolume.efs(builder.build())
        }

        public fun host(block: HostVolumeOptionsDsl.() -> Unit = {}): HostVolume {
            val builder = HostVolumeOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.batch.EcsVolume.host(builder.build())
        }
    }

    public object EksVolume {
        public fun emptyDir(block: EmptyDirVolumeOptionsDsl.() -> Unit = {}): EmptyDirVolume {
            val builder = EmptyDirVolumeOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.batch.EksVolume.emptyDir(builder.build())
        }

        public fun hostPath(block: HostPathVolumeOptionsDsl.() -> Unit = {}): HostPathVolume {
            val builder = HostPathVolumeOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.batch.EksVolume.hostPath(builder.build())
        }

        public fun secret(block: SecretPathVolumeOptionsDsl.() -> Unit = {}): SecretPathVolume {
            val builder = SecretPathVolumeOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.batch.EksVolume.secret(builder.build())
        }
    }

    public object Reason {
        public fun custom(
            block: CustomReasonDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.batch.Reason {
            val builder = CustomReasonDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.batch.Reason.custom(builder.build())
        }
    }

    public object Secret {
        public fun fromSecretsManagerVersion(
            secret: ISecret,
            block: SecretVersionInfoDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.batch.Secret {
            val builder = SecretVersionInfoDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.batch.Secret.fromSecretsManagerVersion(
                secret,
                builder.build()
            )
        }
    }
}
