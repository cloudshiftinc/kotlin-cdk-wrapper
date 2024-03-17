@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnExperiment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.evidently.*;
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
public interface CfnExperimentProps {
  /**
   * An optional description of the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An array of structures that defines the metrics used for the experiment, and whether a higher
   * or lower value for each metric is the goal.
   *
   * You can use up to three metrics in an experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
   */
  public fun metricGoals(): Any

  /**
   * A name for the new experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-name)
   */
  public fun name(): String

  /**
   * A structure that contains the configuration of which variation to use as the "control" version.
   *
   * The "control" version is used for comparison with other variations. This structure also
   * specifies how much experiment traffic is allocated to each variation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
   */
  public fun onlineAbConfig(): Any

  /**
   * The name or the ARN of the project where this experiment is to be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-project)
   */
  public fun project(): String

  /**
   * When Evidently assigns a particular user session to an experiment, it must use a randomization
   * ID to determine which variation the user session is served.
   *
   * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
   * `randomizationSalt` , Evidently uses the experiment name as the `randomizationSalt` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-randomizationsalt)
   */
  public fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

  /**
   * Set this to `true` to remove the segment that is associated with this experiment.
   *
   * You can't use this parameter if the experiment is currently running.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-removesegment)
   */
  public fun removeSegment(): Any? = unwrap(this).getRemoveSegment()

  /**
   * A structure that you can use to start and stop the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
   */
  public fun runningStatus(): Any? = unwrap(this).getRunningStatus()

  /**
   * The portion of the available audience that you want to allocate to this experiment, in
   * thousandths of a percent.
   *
   * The available audience is the total audience minus the audience that you have allocated to
   * overrides or current launches of this feature.
   *
   * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of
   * the available audience.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-samplingrate)
   */
  public fun samplingRate(): Number? = unwrap(this).getSamplingRate()

  /**
   * Specifies an audience *segment* to use in the experiment.
   *
   * When a segment is used in an experiment, only user sessions that match the segment pattern are
   * used in the experiment.
   *
   * For more information, see [Segment rule pattern
   * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-segment)
   */
  public fun segment(): String? = unwrap(this).getSegment()

  /**
   * Assigns one or more tags (key-value pairs) to the experiment.
   *
   * Tags can help you organize and categorize your resources. You can also use them to scope user
   * permissions by granting a user permission to access or change only resources with certain tag
   * values.
   *
   * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
   * characters.
   *
   * You can associate as many as 50 tags with an experiment.
   *
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of structures that describe the configuration of each feature variation used in the
   * experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
   */
  public fun treatments(): Any

  /**
   * A builder for [CfnExperimentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description An optional description of the experiment.
     */
    public fun description(description: String)

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     * You can use up to three metrics in an experiment.
     */
    public fun metricGoals(metricGoals: IResolvable)

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     * You can use up to three metrics in an experiment.
     */
    public fun metricGoals(metricGoals: List<Any>)

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     * You can use up to three metrics in an experiment.
     */
    public fun metricGoals(vararg metricGoals: Any)

    /**
     * @param name A name for the new experiment. 
     */
    public fun name(name: String)

    /**
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     */
    public fun onlineAbConfig(onlineAbConfig: IResolvable)

    /**
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     */
    public fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty)

    /**
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("015a13849e9bfcbfc1dd35610162c7fdcc377de451a0e0ed70b2e7cd1b6f3877")
    public
        fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty.Builder.() -> Unit)

    /**
     * @param project The name or the ARN of the project where this experiment is to be created. 
     */
    public fun project(project: String)

    /**
     * @param randomizationSalt When Evidently assigns a particular user session to an experiment,
     * it must use a randomization ID to determine which variation the user session is served.
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the experiment name as the `randomizationSalt` .
     */
    public fun randomizationSalt(randomizationSalt: String)

    /**
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     * experiment.
     * You can't use this parameter if the experiment is currently running.
     */
    public fun removeSegment(removeSegment: Boolean)

    /**
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     * experiment.
     * You can't use this parameter if the experiment is currently running.
     */
    public fun removeSegment(removeSegment: IResolvable)

    /**
     * @param runningStatus A structure that you can use to start and stop the experiment.
     */
    public fun runningStatus(runningStatus: IResolvable)

    /**
     * @param runningStatus A structure that you can use to start and stop the experiment.
     */
    public fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty)

    /**
     * @param runningStatus A structure that you can use to start and stop the experiment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4013e92ad46a88640dfd1a6d963a00423de70ce9869df03f2e4309e2171161fa")
    public
        fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty.Builder.() -> Unit)

    /**
     * @param samplingRate The portion of the available audience that you want to allocate to this
     * experiment, in thousandths of a percent.
     * The available audience is the total audience minus the audience that you have allocated to
     * overrides or current launches of this feature.
     *
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10%
     * of the available audience.
     */
    public fun samplingRate(samplingRate: Number)

    /**
     * @param segment Specifies an audience *segment* to use in the experiment.
     * When a segment is used in an experiment, only user sessions that match the segment pattern
     * are used in the experiment.
     *
     * For more information, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     */
    public fun segment(segment: String)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the experiment.
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the experiment.
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    public fun treatments(treatments: IResolvable)

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    public fun treatments(treatments: List<Any>)

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    public fun treatments(vararg treatments: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnExperimentProps.Builder =
        software.amazon.awscdk.services.evidently.CfnExperimentProps.builder()

    /**
     * @param description An optional description of the experiment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     * You can use up to three metrics in an experiment.
     */
    override fun metricGoals(metricGoals: IResolvable) {
      cdkBuilder.metricGoals(metricGoals.let(IResolvable::unwrap))
    }

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     * You can use up to three metrics in an experiment.
     */
    override fun metricGoals(metricGoals: List<Any>) {
      cdkBuilder.metricGoals(metricGoals)
    }

    /**
     * @param metricGoals An array of structures that defines the metrics used for the experiment,
     * and whether a higher or lower value for each metric is the goal. 
     * You can use up to three metrics in an experiment.
     */
    override fun metricGoals(vararg metricGoals: Any): Unit = metricGoals(metricGoals.toList())

    /**
     * @param name A name for the new experiment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     */
    override fun onlineAbConfig(onlineAbConfig: IResolvable) {
      cdkBuilder.onlineAbConfig(onlineAbConfig.let(IResolvable::unwrap))
    }

    /**
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     */
    override fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty) {
      cdkBuilder.onlineAbConfig(onlineAbConfig.let(CfnExperiment.OnlineAbConfigObjectProperty::unwrap))
    }

    /**
     * @param onlineAbConfig A structure that contains the configuration of which variation to use
     * as the "control" version. 
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("015a13849e9bfcbfc1dd35610162c7fdcc377de451a0e0ed70b2e7cd1b6f3877")
    override
        fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty.Builder.() -> Unit):
        Unit = onlineAbConfig(CfnExperiment.OnlineAbConfigObjectProperty(onlineAbConfig))

    /**
     * @param project The name or the ARN of the project where this experiment is to be created. 
     */
    override fun project(project: String) {
      cdkBuilder.project(project)
    }

    /**
     * @param randomizationSalt When Evidently assigns a particular user session to an experiment,
     * it must use a randomization ID to determine which variation the user session is served.
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the experiment name as the `randomizationSalt` .
     */
    override fun randomizationSalt(randomizationSalt: String) {
      cdkBuilder.randomizationSalt(randomizationSalt)
    }

    /**
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     * experiment.
     * You can't use this parameter if the experiment is currently running.
     */
    override fun removeSegment(removeSegment: Boolean) {
      cdkBuilder.removeSegment(removeSegment)
    }

    /**
     * @param removeSegment Set this to `true` to remove the segment that is associated with this
     * experiment.
     * You can't use this parameter if the experiment is currently running.
     */
    override fun removeSegment(removeSegment: IResolvable) {
      cdkBuilder.removeSegment(removeSegment.let(IResolvable::unwrap))
    }

    /**
     * @param runningStatus A structure that you can use to start and stop the experiment.
     */
    override fun runningStatus(runningStatus: IResolvable) {
      cdkBuilder.runningStatus(runningStatus.let(IResolvable::unwrap))
    }

    /**
     * @param runningStatus A structure that you can use to start and stop the experiment.
     */
    override fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty) {
      cdkBuilder.runningStatus(runningStatus.let(CfnExperiment.RunningStatusObjectProperty::unwrap))
    }

    /**
     * @param runningStatus A structure that you can use to start and stop the experiment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4013e92ad46a88640dfd1a6d963a00423de70ce9869df03f2e4309e2171161fa")
    override
        fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty.Builder.() -> Unit):
        Unit = runningStatus(CfnExperiment.RunningStatusObjectProperty(runningStatus))

    /**
     * @param samplingRate The portion of the available audience that you want to allocate to this
     * experiment, in thousandths of a percent.
     * The available audience is the total audience minus the audience that you have allocated to
     * overrides or current launches of this feature.
     *
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10%
     * of the available audience.
     */
    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    /**
     * @param segment Specifies an audience *segment* to use in the experiment.
     * When a segment is used in an experiment, only user sessions that match the segment pattern
     * are used in the experiment.
     *
     * For more information, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     */
    override fun segment(segment: String) {
      cdkBuilder.segment(segment)
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the experiment.
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the experiment.
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    override fun treatments(treatments: IResolvable) {
      cdkBuilder.treatments(treatments.let(IResolvable::unwrap))
    }

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    override fun treatments(treatments: List<Any>) {
      cdkBuilder.treatments(treatments)
    }

    /**
     * @param treatments An array of structures that describe the configuration of each feature
     * variation used in the experiment. 
     */
    override fun treatments(vararg treatments: Any): Unit = treatments(treatments.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnExperimentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.evidently.CfnExperimentProps,
  ) : CdkObject(cdkObject), CfnExperimentProps {
    /**
     * An optional description of the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An array of structures that defines the metrics used for the experiment, and whether a higher
     * or lower value for each metric is the goal.
     *
     * You can use up to three metrics in an experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
     */
    override fun metricGoals(): Any = unwrap(this).getMetricGoals()

    /**
     * A name for the new experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A structure that contains the configuration of which variation to use as the "control"
     * version.
     *
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
     */
    override fun onlineAbConfig(): Any = unwrap(this).getOnlineAbConfig()

    /**
     * The name or the ARN of the project where this experiment is to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-project)
     */
    override fun project(): String = unwrap(this).getProject()

    /**
     * When Evidently assigns a particular user session to an experiment, it must use a
     * randomization ID to determine which variation the user session is served.
     *
     * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
     * `randomizationSalt` , Evidently uses the experiment name as the `randomizationSalt` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-randomizationsalt)
     */
    override fun randomizationSalt(): String? = unwrap(this).getRandomizationSalt()

    /**
     * Set this to `true` to remove the segment that is associated with this experiment.
     *
     * You can't use this parameter if the experiment is currently running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-removesegment)
     */
    override fun removeSegment(): Any? = unwrap(this).getRemoveSegment()

    /**
     * A structure that you can use to start and stop the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
     */
    override fun runningStatus(): Any? = unwrap(this).getRunningStatus()

    /**
     * The portion of the available audience that you want to allocate to this experiment, in
     * thousandths of a percent.
     *
     * The available audience is the total audience minus the audience that you have allocated to
     * overrides or current launches of this feature.
     *
     * This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10%
     * of the available audience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-samplingrate)
     */
    override fun samplingRate(): Number? = unwrap(this).getSamplingRate()

    /**
     * Specifies an audience *segment* to use in the experiment.
     *
     * When a segment is used in an experiment, only user sessions that match the segment pattern
     * are used in the experiment.
     *
     * For more information, see [Segment rule pattern
     * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-segment)
     */
    override fun segment(): String? = unwrap(this).getSegment()

    /**
     * Assigns one or more tags (key-value pairs) to the experiment.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an experiment.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An array of structures that describe the configuration of each feature variation used in the
     * experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
     */
    override fun treatments(): Any = unwrap(this).getTreatments()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExperimentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnExperimentProps):
        CfnExperimentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnExperimentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExperimentProps):
        software.amazon.awscdk.services.evidently.CfnExperimentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.evidently.CfnExperimentProps
  }
}
