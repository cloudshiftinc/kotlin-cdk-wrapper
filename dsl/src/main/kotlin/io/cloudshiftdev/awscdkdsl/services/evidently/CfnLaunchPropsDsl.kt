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

package io.cloudshiftdev.awscdkdsl.services.evidently

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnLaunch
import software.amazon.awscdk.services.evidently.CfnLaunchProps

/**
 * Properties for defining a `CfnLaunch`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * CfnLaunchProps cfnLaunchProps = CfnLaunchProps.builder()
 * .groups(List.of(LaunchGroupObjectProperty.builder()
 * .feature("feature")
 * .groupName("groupName")
 * .variation("variation")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .name("name")
 * .project("project")
 * .scheduledSplitsConfig(List.of(StepConfigProperty.builder()
 * .groupWeights(List.of(GroupToWeightProperty.builder()
 * .groupName("groupName")
 * .splitWeight(123)
 * .build()))
 * .startTime("startTime")
 * // the properties below are optional
 * .segmentOverrides(List.of(SegmentOverrideProperty.builder()
 * .evaluationOrder(123)
 * .segment("segment")
 * .weights(List.of(GroupToWeightProperty.builder()
 * .groupName("groupName")
 * .splitWeight(123)
 * .build()))
 * .build()))
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .executionStatus(ExecutionStatusObjectProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .desiredState("desiredState")
 * .reason("reason")
 * .build())
 * .metricMonitors(List.of(MetricDefinitionObjectProperty.builder()
 * .entityIdKey("entityIdKey")
 * .metricName("metricName")
 * .valueKey("valueKey")
 * // the properties below are optional
 * .eventPattern("eventPattern")
 * .unitLabel("unitLabel")
 * .build()))
 * .randomizationSalt("randomizationSalt")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html)
 */
@CdkDslMarker
public class CfnLaunchPropsDsl {
    private val cdkBuilder: CfnLaunchProps.Builder = CfnLaunchProps.builder()

    private val _groups: MutableList<Any> = mutableListOf()

    private val _metricMonitors: MutableList<Any> = mutableListOf()

    private val _scheduledSplitsConfig: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description An optional description for the launch. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param executionStatus A structure that you can use to start and stop the launch. */
    public fun executionStatus(executionStatus: IResolvable) {
        cdkBuilder.executionStatus(executionStatus)
    }

    /** @param executionStatus A structure that you can use to start and stop the launch. */
    public fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty) {
        cdkBuilder.executionStatus(executionStatus)
    }

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     *   used for the launch. You can up to five launch groups in a launch.
     */
    public fun groups(vararg groups: Any) {
        _groups.addAll(listOf(*groups))
    }

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     *   used for the launch. You can up to five launch groups in a launch.
     */
    public fun groups(groups: Collection<Any>) {
        _groups.addAll(groups)
    }

    /**
     * @param groups An array of structures that contains the feature and variations that are to be
     *   used for the launch. You can up to five launch groups in a launch.
     */
    public fun groups(groups: IResolvable) {
        cdkBuilder.groups(groups)
    }

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     *   monitor the launch performance. You can have up to three metric monitors in the array.
     */
    public fun metricMonitors(vararg metricMonitors: Any) {
        _metricMonitors.addAll(listOf(*metricMonitors))
    }

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     *   monitor the launch performance. You can have up to three metric monitors in the array.
     */
    public fun metricMonitors(metricMonitors: Collection<Any>) {
        _metricMonitors.addAll(metricMonitors)
    }

    /**
     * @param metricMonitors An array of structures that define the metrics that will be used to
     *   monitor the launch performance. You can have up to three metric monitors in the array.
     */
    public fun metricMonitors(metricMonitors: IResolvable) {
        cdkBuilder.metricMonitors(metricMonitors)
    }

    /** @param name The name for the launch. It can include up to 127 characters. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param project The name or ARN of the project that you want to create the launch in. */
    public fun project(project: String) {
        cdkBuilder.project(project)
    }

    /**
     * @param randomizationSalt When Evidently assigns a particular user session to a launch, it
     *   must use a randomization ID to determine which variation the user session is served. This
     *   randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     *   `randomizationSalt` , Evidently uses the launch name as the `randomizationsSalt` .
     */
    public fun randomizationSalt(randomizationSalt: String) {
        cdkBuilder.randomizationSalt(randomizationSalt)
    }

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     *   percentages among the feature variations during each step of the launch.
     */
    public fun scheduledSplitsConfig(vararg scheduledSplitsConfig: Any) {
        _scheduledSplitsConfig.addAll(listOf(*scheduledSplitsConfig))
    }

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     *   percentages among the feature variations during each step of the launch.
     */
    public fun scheduledSplitsConfig(scheduledSplitsConfig: Collection<Any>) {
        _scheduledSplitsConfig.addAll(scheduledSplitsConfig)
    }

    /**
     * @param scheduledSplitsConfig An array of structures that define the traffic allocation
     *   percentages among the feature variations during each step of the launch.
     */
    public fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable) {
        cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig)
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the launch. Tags can help you
     *   organize and categorize your resources. You can also use them to scope user permissions by
     *   granting a user permission to access or change only resources with certain tag values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a launch.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the launch. Tags can help you
     *   organize and categorize your resources. You can also use them to scope user permissions by
     *   granting a user permission to access or change only resources with certain tag values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a launch.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLaunchProps {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_metricMonitors.isNotEmpty()) cdkBuilder.metricMonitors(_metricMonitors)
        if (_scheduledSplitsConfig.isNotEmpty())
            cdkBuilder.scheduledSplitsConfig(_scheduledSplitsConfig)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
