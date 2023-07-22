@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
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
import software.constructs.Construct

@CdkDslMarker
public class CfnExperimentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnExperiment.Builder = CfnExperiment.Builder.create(scope, id)

  private val _metricGoals: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _treatments: MutableList<Any> = mutableListOf()

  /**
   * An optional description of the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-description)
   * @param description An optional description of the experiment. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * An array of structures that defines the metrics used for the experiment, and whether a higher
   * or lower value for each metric is the goal.
   *
   * You can use up to three metrics in an experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
   * @param metricGoals An array of structures that defines the metrics used for the experiment, and
   * whether a higher or lower value for each metric is the goal. 
   */
  public fun metricGoals(vararg metricGoals: Any) {
    _metricGoals.addAll(listOf(*metricGoals))
  }

  /**
   * An array of structures that defines the metrics used for the experiment, and whether a higher
   * or lower value for each metric is the goal.
   *
   * You can use up to three metrics in an experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
   * @param metricGoals An array of structures that defines the metrics used for the experiment, and
   * whether a higher or lower value for each metric is the goal. 
   */
  public fun metricGoals(metricGoals: Collection<Any>) {
    _metricGoals.addAll(metricGoals)
  }

  /**
   * An array of structures that defines the metrics used for the experiment, and whether a higher
   * or lower value for each metric is the goal.
   *
   * You can use up to three metrics in an experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-metricgoals)
   * @param metricGoals An array of structures that defines the metrics used for the experiment, and
   * whether a higher or lower value for each metric is the goal. 
   */
  public fun metricGoals(metricGoals: IResolvable) {
    cdkBuilder.metricGoals(metricGoals)
  }

  /**
   * A name for the new experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-name)
   * @param name A name for the new experiment. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A structure that contains the configuration of which variation to use as the "control" version.
   *
   * The "control" version is used for comparison with other variations. This structure also
   * specifies how much experiment traffic is allocated to each variation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
   * @param onlineAbConfig A structure that contains the configuration of which variation to use as
   * the "control" version. 
   */
  public fun onlineAbConfig(onlineAbConfig: IResolvable) {
    cdkBuilder.onlineAbConfig(onlineAbConfig)
  }

  /**
   * A structure that contains the configuration of which variation to use as the "control" version.
   *
   * The "control" version is used for comparison with other variations. This structure also
   * specifies how much experiment traffic is allocated to each variation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-onlineabconfig)
   * @param onlineAbConfig A structure that contains the configuration of which variation to use as
   * the "control" version. 
   */
  public fun onlineAbConfig(onlineAbConfig: CfnExperiment.OnlineAbConfigObjectProperty) {
    cdkBuilder.onlineAbConfig(onlineAbConfig)
  }

  /**
   * The name or the ARN of the project where this experiment is to be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-project)
   * @param project The name or the ARN of the project where this experiment is to be created. 
   */
  public fun project(project: String) {
    cdkBuilder.project(project)
  }

  /**
   * When Evidently assigns a particular user session to an experiment, it must use a randomization
   * ID to determine which variation the user session is served.
   *
   * This randomization ID is a combination of the entity ID and `randomizationSalt` . If you omit
   * `randomizationSalt` , Evidently uses the experiment name as the `randomizationSalt` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-randomizationsalt)
   * @param randomizationSalt When Evidently assigns a particular user session to an experiment, it
   * must use a randomization ID to determine which variation the user session is served. 
   */
  public fun randomizationSalt(randomizationSalt: String) {
    cdkBuilder.randomizationSalt(randomizationSalt)
  }

  /**
   * Set this to `true` to remove the segment that is associated with this experiment.
   *
   * You can't use this parameter if the experiment is currently running.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-removesegment)
   * @param removeSegment Set this to `true` to remove the segment that is associated with this
   * experiment. 
   */
  public fun removeSegment(removeSegment: Boolean) {
    cdkBuilder.removeSegment(removeSegment)
  }

  /**
   * Set this to `true` to remove the segment that is associated with this experiment.
   *
   * You can't use this parameter if the experiment is currently running.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-removesegment)
   * @param removeSegment Set this to `true` to remove the segment that is associated with this
   * experiment. 
   */
  public fun removeSegment(removeSegment: IResolvable) {
    cdkBuilder.removeSegment(removeSegment)
  }

  /**
   * A structure that you can use to start and stop the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
   * @param runningStatus A structure that you can use to start and stop the experiment. 
   */
  public fun runningStatus(runningStatus: IResolvable) {
    cdkBuilder.runningStatus(runningStatus)
  }

  /**
   * A structure that you can use to start and stop the experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-runningstatus)
   * @param runningStatus A structure that you can use to start and stop the experiment. 
   */
  public fun runningStatus(runningStatus: CfnExperiment.RunningStatusObjectProperty) {
    cdkBuilder.runningStatus(runningStatus)
  }

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
   * @param samplingRate The portion of the available audience that you want to allocate to this
   * experiment, in thousandths of a percent. 
   */
  public fun samplingRate(samplingRate: Number) {
    cdkBuilder.samplingRate(samplingRate)
  }

  /**
   * Specifies an audience *segment* to use in the experiment.
   *
   * When a segment is used in an experiment, only user sessions that match the segment pattern are
   * used in the experiment.
   *
   * For more information, see [Segment rule pattern
   * syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments-syntax.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-segment)
   * @param segment Specifies an audience *segment* to use in the experiment. 
   */
  public fun segment(segment: String) {
    cdkBuilder.segment(segment)
  }

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
   * @param tags Assigns one or more tags (key-value pairs) to the experiment. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

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
   * @param tags Assigns one or more tags (key-value pairs) to the experiment. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * An array of structures that describe the configuration of each feature variation used in the
   * experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
   * @param treatments An array of structures that describe the configuration of each feature
   * variation used in the experiment. 
   */
  public fun treatments(vararg treatments: Any) {
    _treatments.addAll(listOf(*treatments))
  }

  /**
   * An array of structures that describe the configuration of each feature variation used in the
   * experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
   * @param treatments An array of structures that describe the configuration of each feature
   * variation used in the experiment. 
   */
  public fun treatments(treatments: Collection<Any>) {
    _treatments.addAll(treatments)
  }

  /**
   * An array of structures that describe the configuration of each feature variation used in the
   * experiment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html#cfn-evidently-experiment-treatments)
   * @param treatments An array of structures that describe the configuration of each feature
   * variation used in the experiment. 
   */
  public fun treatments(treatments: IResolvable) {
    cdkBuilder.treatments(treatments)
  }

  public fun build(): CfnExperiment {
    if(_metricGoals.isNotEmpty()) cdkBuilder.metricGoals(_metricGoals)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_treatments.isNotEmpty()) cdkBuilder.treatments(_treatments)
    return cdkBuilder.build()
  }
}
