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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using an Amazon ECS task as a target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetEcsTaskParametersProperty pipeTargetEcsTaskParametersProperty =
 * PipeTargetEcsTaskParametersProperty.builder()
 * .taskDefinitionArn("taskDefinitionArn")
 * // the properties below are optional
 * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .enableEcsManagedTags(false)
 * .enableExecuteCommand(false)
 * .group("group")
 * .launchType("launchType")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build())
 * .overrides(EcsTaskOverrideProperty.builder()
 * .containerOverrides(List.of(EcsContainerOverrideProperty.builder()
 * .command(List.of("command"))
 * .cpu(123)
 * .environment(List.of(EcsEnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .environmentFiles(List.of(EcsEnvironmentFileProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .memory(123)
 * .memoryReservation(123)
 * .name("name")
 * .resourceRequirements(List.of(EcsResourceRequirementProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build()))
 * .cpu("cpu")
 * .ephemeralStorage(EcsEphemeralStorageProperty.builder()
 * .sizeInGiB(123)
 * .build())
 * .executionRoleArn("executionRoleArn")
 * .inferenceAcceleratorOverrides(List.of(EcsInferenceAcceleratorOverrideProperty.builder()
 * .deviceName("deviceName")
 * .deviceType("deviceType")
 * .build()))
 * .memory("memory")
 * .taskRoleArn("taskRoleArn")
 * .build())
 * .placementConstraints(List.of(PlacementConstraintProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .placementStrategy(List.of(PlacementStrategyProperty.builder()
 * .field("field")
 * .type("type")
 * .build()))
 * .platformVersion("platformVersion")
 * .propagateTags("propagateTags")
 * .referenceId("referenceId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetEcsTaskParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetEcsTaskParametersProperty.Builder =
        CfnPipe.PipeTargetEcsTaskParametersProperty.builder()

    private val _capacityProviderStrategy: MutableList<Any> = mutableListOf()

    private val _placementConstraints: MutableList<Any> = mutableListOf()

    private val _placementStrategy: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the task. If a
     *   `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If no
     *   `capacityProviderStrategy` or launchType is specified, the
     *   `defaultCapacityProviderStrategy` for the cluster is used.
     */
    public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any) {
        _capacityProviderStrategy.addAll(listOf(*capacityProviderStrategy))
    }

    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the task. If a
     *   `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If no
     *   `capacityProviderStrategy` or launchType is specified, the
     *   `defaultCapacityProviderStrategy` for the cluster is used.
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: Collection<Any>) {
        _capacityProviderStrategy.addAll(capacityProviderStrategy)
    }

    /**
     * @param capacityProviderStrategy The capacity provider strategy to use for the task. If a
     *   `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If no
     *   `capacityProviderStrategy` or launchType is specified, the
     *   `defaultCapacityProviderStrategy` for the cluster is used.
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
     *   For more information, see
     *   [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *   in the Amazon Elastic Container Service Developer Guide.
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
     *   For more information, see
     *   [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *   in the Amazon Elastic Container Service Developer Guide.
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableExecuteCommand Whether or not to enable the execute command functionality for
     *   the containers in this task. If true, this enables execute command functionality on all
     *   containers in the task.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param enableExecuteCommand Whether or not to enable the execute command functionality for
     *   the containers in this task. If true, this enables execute command functionality on all
     *   containers in the task.
     */
    public fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param group Specifies an Amazon ECS task group for the task. The maximum length is 255
     *   characters.
     */
    public fun group(group: String) {
        cdkBuilder.group(group)
    }

    /**
     * @param launchType Specifies the launch type on which your task is running. The launch type
     *   that you specify here must match one of the launch type (compatibilities) of the target
     *   task. The `FARGATE` value is supported only in the Regions where AWS Fargate with Amazon
     *   ECS is supported. For more information, see
     *   [AWS Fargate on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html)
     *   in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
    }

    /**
     * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
     *   network mode. This structure specifies the VPC subnets and security groups associated with
     *   the task, and whether a public IP address is to be used. This structure is required if
     *   `LaunchType` is `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
     *
     * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
     * network mode, the task fails.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
     *   network mode. This structure specifies the VPC subnets and security groups associated with
     *   the task, and whether a public IP address is to be used. This structure is required if
     *   `LaunchType` is `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
     *
     * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
     * network mode, the task fails.
     */
    public fun networkConfiguration(networkConfiguration: CfnPipe.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /** @param overrides The overrides that are associated with a task. */
    public fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides)
    }

    /** @param overrides The overrides that are associated with a task. */
    public fun overrides(overrides: CfnPipe.EcsTaskOverrideProperty) {
        cdkBuilder.overrides(overrides)
    }

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task. You
     *   can specify up to 10 constraints per task (including constraints in the task definition and
     *   those specified at runtime).
     */
    public fun placementConstraints(vararg placementConstraints: Any) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task. You
     *   can specify up to 10 constraints per task (including constraints in the task definition and
     *   those specified at runtime).
     */
    public fun placementConstraints(placementConstraints: Collection<Any>) {
        _placementConstraints.addAll(placementConstraints)
    }

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task. You
     *   can specify up to 10 constraints per task (including constraints in the task definition and
     *   those specified at runtime).
     */
    public fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints)
    }

    /**
     * @param placementStrategy The placement strategy objects to use for the task. You can specify
     *   a maximum of five strategy rules per task.
     */
    public fun placementStrategy(vararg placementStrategy: Any) {
        _placementStrategy.addAll(listOf(*placementStrategy))
    }

    /**
     * @param placementStrategy The placement strategy objects to use for the task. You can specify
     *   a maximum of five strategy rules per task.
     */
    public fun placementStrategy(placementStrategy: Collection<Any>) {
        _placementStrategy.addAll(placementStrategy)
    }

    /**
     * @param placementStrategy The placement strategy objects to use for the task. You can specify
     *   a maximum of five strategy rules per task.
     */
    public fun placementStrategy(placementStrategy: IResolvable) {
        cdkBuilder.placementStrategy(placementStrategy)
    }

    /**
     * @param platformVersion Specifies the platform version for the task. Specify only the numeric
     *   portion of the platform version, such as `1.1.0` .
     *
     * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
     * platform versions, see
     * [AWS Fargate Platform Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     *   task. If no value is specified, the tags are not propagated. Tags can only be propagated to
     *   the task during task creation. To add tags to a task after task creation, use the
     *   `TagResource` API action.
     */
    public fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /** @param referenceId The reference ID to use for the task. */
    public fun referenceId(referenceId: String) {
        cdkBuilder.referenceId(referenceId)
    }

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     *   Each tag consists of a key and an optional value, both of which you define. To learn more,
     *   see
     *   [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
     *   in the Amazon ECS API Reference.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     *   Each tag consists of a key and an optional value, both of which you define. To learn more,
     *   see
     *   [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
     *   in the Amazon ECS API Reference.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param taskCount The number of tasks to create based on `TaskDefinition` . The default is 1.
     */
    public fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
    }

    /**
     * @param taskDefinitionArn The ARN of the task definition to use if the event target is an
     *   Amazon ECS task.
     */
    public fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    public fun build(): CfnPipe.PipeTargetEcsTaskParametersProperty {
        if (_capacityProviderStrategy.isNotEmpty())
            cdkBuilder.capacityProviderStrategy(_capacityProviderStrategy)
        if (_placementConstraints.isNotEmpty())
            cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategy.isNotEmpty()) cdkBuilder.placementStrategy(_placementStrategy)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
