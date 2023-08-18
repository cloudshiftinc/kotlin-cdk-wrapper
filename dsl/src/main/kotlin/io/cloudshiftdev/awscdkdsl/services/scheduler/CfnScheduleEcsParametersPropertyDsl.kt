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

package io.cloudshiftdev.awscdkdsl.services.scheduler

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * The templated target type for the Amazon ECS
 * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
 * operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * Object tags;
 * EcsParametersProperty ecsParametersProperty = EcsParametersProperty.builder()
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
 * .tags(tags)
 * .taskCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html)
 */
@CdkDslMarker
public class CfnScheduleEcsParametersPropertyDsl {
    private val cdkBuilder: CfnSchedule.EcsParametersProperty.Builder =
        CfnSchedule.EcsParametersProperty.builder()

    private val _capacityProviderStrategy: MutableList<Any> = mutableListOf()

    private val _placementConstraints: MutableList<Any> = mutableListOf()

    private val _placementStrategy: MutableList<Any> = mutableListOf()

    /** @param capacityProviderStrategy The capacity provider strategy to use for the task. */
    public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any) {
        _capacityProviderStrategy.addAll(listOf(*capacityProviderStrategy))
    }

    /** @param capacityProviderStrategy The capacity provider strategy to use for the task. */
    public fun capacityProviderStrategy(capacityProviderStrategy: Collection<Any>) {
        _capacityProviderStrategy.addAll(capacityProviderStrategy)
    }

    /** @param capacityProviderStrategy The capacity provider strategy to use for the task. */
    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
     *   For more information, see
     *   [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *   in the *Amazon ECS Developer Guide* .
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
     *   For more information, see
     *   [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *   in the *Amazon ECS Developer Guide* .
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
     *   task. The `FARGATE` value is supported only in the Regions where Fargate with Amazon ECS is
     *   supported. For more information, see
     *   [AWS Fargate on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS_Fargate.html)
     *   in the *Amazon ECS Developer Guide* .
     */
    public fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
    }

    /**
     * @param networkConfiguration This structure specifies the network configuration for an ECS
     *   task.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * @param networkConfiguration This structure specifies the network configuration for an ECS
     *   task.
     */
    public fun networkConfiguration(
        networkConfiguration: CfnSchedule.NetworkConfigurationProperty
    ) {
        cdkBuilder.networkConfiguration(networkConfiguration)
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

    /** @param placementStrategy The task placement strategy for a task or service. */
    public fun placementStrategy(vararg placementStrategy: Any) {
        _placementStrategy.addAll(listOf(*placementStrategy))
    }

    /** @param placementStrategy The task placement strategy for a task or service. */
    public fun placementStrategy(placementStrategy: Collection<Any>) {
        _placementStrategy.addAll(placementStrategy)
    }

    /** @param placementStrategy The task placement strategy for a task or service. */
    public fun placementStrategy(placementStrategy: IResolvable) {
        cdkBuilder.placementStrategy(placementStrategy)
    }

    /**
     * @param platformVersion Specifies the platform version for the task. Specify only the numeric
     *   portion of the platform version, such as `1.1.0` .
     */
    public fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     *   task. If no value is specified, the tags are not propagated. Tags can only be propagated to
     *   the task during task creation. To add tags to a task after task creation, use the Amazon
     *   ECS
     *   [`TagResource`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
     *   API action.
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
     *   Each tag consists of a key and an optional value, both of which you define. For more
     *   information, see
     *   [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) in
     *   the *Amazon ECS API Reference* .
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags The metadata that you apply to the task to help you categorize and organize them.
     *   Each tag consists of a key and an optional value, both of which you define. For more
     *   information, see
     *   [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) in
     *   the *Amazon ECS API Reference* .
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param taskCount The number of tasks to create based on `TaskDefinition` . The default is `1`
     *   .
     */
    public fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
    }

    /**
     * @param taskDefinitionArn The Amazon Resource Name (ARN) of the task definition to use if the
     *   event target is an Amazon ECS task.
     */
    public fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    public fun build(): CfnSchedule.EcsParametersProperty {
        if (_capacityProviderStrategy.isNotEmpty())
            cdkBuilder.capacityProviderStrategy(_capacityProviderStrategy)
        if (_placementConstraints.isNotEmpty())
            cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategy.isNotEmpty()) cdkBuilder.placementStrategy(_placementStrategy)
        return cdkBuilder.build()
    }
}
