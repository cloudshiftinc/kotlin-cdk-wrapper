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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnExperiment
import software.amazon.awscdk.services.evidently.CfnExperimentProps

/**
 * Properties for defining a `CfnExperiment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * CfnExperimentProps cfnExperimentProps = CfnExperimentProps.builder()
 * .metricGoals(List.of(MetricGoalObjectProperty.builder()
 * .desiredChange("desiredChange")
 * .entityIdKey("entityIdKey")
 * .metricName("metricName")
 * .valueKey("valueKey")
 * // the properties below are optional
 * .eventPattern("eventPattern")
 * .unitLabel("unitLabel")
 * .build()))
 * .name("name")
 * .onlineAbConfig(OnlineAbConfigObjectProperty.builder()
 * .controlTreatmentName("controlTreatmentName")
 * .treatmentWeights(List.of(TreatmentToWeightProperty.builder()
 * .splitWeight(123)
 * .treatment("treatment")
 * .build()))
 * .build())
 * .project("project")
 * .treatments(List.of(TreatmentObjectProperty.builder()
 * .feature("feature")
 * .treatmentName("treatmentName")
 * .variation("variation")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .randomizationSalt("randomizationSalt")
 * .removeSegment(false)
 * .runningStatus(RunningStatusObjectProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .analysisCompleteTime("analysisCompleteTime")
 * .desiredState("desiredState")
 * .reason("reason")
 * .build())
 * .samplingRate(123)
 * .segment("segment")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html)
 */
@CdkDslMarker
public class CfnExperimentPropsDsl {
    private val cdkBuilder: CfnExperimentProps.Builder = CfnExperimentProps.builder()

    private val _metricGoals: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _treatments: MutableList<Any> = mutableListOf()

    /** @param description An optional description of the experiment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     *   and whether a higher or lower value for each metric is the goal. You can use up to three
     *   metrics in an experiment.
     */
    public fun metricGoals(vararg metricGoals: Any) {
        _metricGoals.addAll(listOf(*metricGoals))
    }

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     *   and whether a higher or lower value for each metric is the goal. You can use up to three
     *   metrics in an experiment.
     */
    public fun metricGoals(metricGoals: Collection<Any>) {
        _metricGoals.addAll(metricGoals)
    }

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     *   and whether a higher or lower value for each metric is the goal. You can use up to three
     *   metrics in an experiment.
     */
    public fun metricGoals(metricGoals: IResolvable) {
        cdkBuilder.metricGoals(metricGoals)
    }

    /** @param name A name for the new experiment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     *   as the "control" version. The "control" version is used for comparison with other
     *   variations. This structure also specifies how much experiment traffic is allocated to each
     *   variation.
     */
    public fun onlineAbConfig(onlineAbConfig: IResolvable) {
        cdkBuilder.onlineAbConfig(onlineAbConfig)
    }

    /**
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     *   as the "control" version. The "control" version is used for comparison with other
     *   variations. This structure also specifies how much experiment traffic is allocated to each
     *   variation.
     */
    public fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty) {
        cdkBuilder.onlineAbConfig(onlineAbConfig)
    }

    /** @param project The name or the ARN of the project where this experiment is to be created. */
    public fun project(project: String) {
        cdkBuilder.project(project)
    }

    /**
     * @param randomizationSalt When Evidently assigns a particular user session to an experiment,
     *   it must use a randomization ID to determine which variation the user session is served.
     *   This randomization ID is a combination of the entity ID and `randomizationSalt` . If you
     *   omit `randomizationSalt` , Evidently uses the experiment name as the `randomizationSalt` .
     */
    public fun randomizationSalt(randomizationSalt: String) {
        cdkBuilder.randomizationSalt(randomizationSalt)
    }

    /**
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     *   experiment. You can't use this parameter if the experiment is currently running.
     */
    public fun removeSegment(removeSegment: Boolean) {
        cdkBuilder.removeSegment(removeSegment)
    }

    /**
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     *   experiment. You can't use this parameter if the experiment is currently running.
     */
    public fun removeSegment(removeSegment: IResolvable) {
        cdkBuilder.removeSegment(removeSegment)
    }

    /** @param runningStatus A structure that you can use to start and stop the experiment. */
    public fun runningStatus(runningStatus: IResolvable) {
        cdkBuilder.runningStatus(runningStatus)
    }

    /** @param runningStatus A structure that you can use to start and stop the experiment. */
    public fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty) {
        cdkBuilder.runningStatus(runningStatus)
    }

    /**
     * @param samplingRate The portion of the available audience that you want to allocate to this
     *   experiment, in thousandths of a percent. The available audience is the total audience minus
     *   the audience that you have allocated to overrides or current launches of this feature.
     *
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10%
     * of the available audience.
     */
    public fun samplingRate(samplingRate: Number) {
        cdkBuilder.samplingRate(samplingRate)
    }

    /**
     * @param segment Specifies an audience *segment* to use in the experiment. When a segment is
     *   used in an experiment, only user sessions that match the segment pattern are used in the
     *   experiment.
     *
     * For more information, see
     * [Segment rule pattern syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     */
    public fun segment(segment: String) {
        cdkBuilder.segment(segment)
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the experiment. Tags can help you
     *   organize and categorize your resources. You can also use them to scope user permissions by
     *   granting a user permission to access or change only resources with certain tag values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the experiment. Tags can help you
     *   organize and categorize your resources. You can also use them to scope user permissions by
     *   granting a user permission to access or change only resources with certain tag values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     *   variation used in the experiment.
     */
    public fun treatments(vararg treatments: Any) {
        _treatments.addAll(listOf(*treatments))
    }

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     *   variation used in the experiment.
     */
    public fun treatments(treatments: Collection<Any>) {
        _treatments.addAll(treatments)
    }

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     *   variation used in the experiment.
     */
    public fun treatments(treatments: IResolvable) {
        cdkBuilder.treatments(treatments)
    }

    public fun build(): CfnExperimentProps {
        if (_metricGoals.isNotEmpty()) cdkBuilder.metricGoals(_metricGoals)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_treatments.isNotEmpty()) cdkBuilder.treatments(_treatments)
        return cdkBuilder.build()
    }
}
