@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnJobTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnJobTemplate.Builder = CfnJobTemplate.Builder.create(scope, id)

  private val _hopDestinations: MutableList<Any> = mutableListOf()

  /**
   * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
   *
   * Outputs that use this feature incur pro-tier pricing. For information about feature
   * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
   * Elemental MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-accelerationsettings)
   * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with long,
   * visually complex content. 
   */
  public fun accelerationSettings(accelerationSettings: IResolvable) {
    cdkBuilder.accelerationSettings(accelerationSettings)
  }

  /**
   * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
   *
   * Outputs that use this feature incur pro-tier pricing. For information about feature
   * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
   * Elemental MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-accelerationsettings)
   * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with long,
   * visually complex content. 
   */
  public
      fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty) {
    cdkBuilder.accelerationSettings(accelerationSettings)
  }

  /**
   * Optional.
   *
   * A category for the job template you are creating
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-category)
   * @param category Optional. 
   */
  public fun category(category: String) {
    cdkBuilder.category(category)
  }

  /**
   * Optional.
   *
   * A description of the job template you are creating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-description)
   * @param description Optional. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Optional.
   *
   * Configuration for a destination queue to which the job can hop once a customer-defined minimum
   * wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
   * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
   * @param hopDestinations Optional. 
   */
  public fun hopDestinations(vararg hopDestinations: Any) {
    _hopDestinations.addAll(listOf(*hopDestinations))
  }

  /**
   * Optional.
   *
   * Configuration for a destination queue to which the job can hop once a customer-defined minimum
   * wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
   * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
   * @param hopDestinations Optional. 
   */
  public fun hopDestinations(hopDestinations: Collection<Any>) {
    _hopDestinations.addAll(hopDestinations)
  }

  /**
   * Optional.
   *
   * Configuration for a destination queue to which the job can hop once a customer-defined minimum
   * wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
   * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
   * @param hopDestinations Optional. 
   */
  public fun hopDestinations(hopDestinations: IResolvable) {
    cdkBuilder.hopDestinations(hopDestinations)
  }

  /**
   * The name of the job template you are creating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-name)
   * @param name The name of the job template you are creating. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specify the relative priority for this job.
   *
   * In any given queue, the service begins processing the job with the highest value first. When
   * more than one job has the same priority, the service begins processing the job that you submitted
   * first. If you don't specify a priority, the service uses the default value 0. Minimum: -50
   * Maximum: 50
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-priority)
   * @param priority Specify the relative priority for this job. 
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * Optional.
   *
   * The queue that jobs created from this template are assigned to. Specify the Amazon Resource
   * Name (ARN) of the queue. For example, arn:aws:mediaconvert:us-west-2:505474453218:queues/Default.
   * If you don't specify this, jobs will go to the default queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-queue)
   * @param queue Optional. 
   */
  public fun queue(queue: String) {
    cdkBuilder.queue(queue)
  }

  /**
   * Specify, in JSON format, the transcoding job settings for this job template.
   *
   * This specification must conform to the AWS Elemental MediaConvert job validation. For
   * information about forming this specification, see the Remarks section later in this topic.
   *
   * For more information about MediaConvert job templates, see [Working with AWS Elemental
   * MediaConvert Job
   * Templates](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-job-templates.html) in
   * the ** .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-settingsjson)
   * @param settingsJson Specify, in JSON format, the transcoding job settings for this job
   * template. 
   */
  public fun settingsJson(settingsJson: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(settingsJson)
    cdkBuilder.settingsJson(builder.map)
  }

  /**
   * Specify, in JSON format, the transcoding job settings for this job template.
   *
   * This specification must conform to the AWS Elemental MediaConvert job validation. For
   * information about forming this specification, see the Remarks section later in this topic.
   *
   * For more information about MediaConvert job templates, see [Working with AWS Elemental
   * MediaConvert Job
   * Templates](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-job-templates.html) in
   * the ** .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-settingsjson)
   * @param settingsJson Specify, in JSON format, the transcoding job settings for this job
   * template. 
   */
  public fun settingsJson(settingsJson: Any) {
    cdkBuilder.settingsJson(settingsJson)
  }

  /**
   * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events.
   *
   * Set the interval, in seconds, between status updates. MediaConvert sends an update at this
   * interval from the time the service begins processing your job to the time it completes the
   * transcode or encounters an error.
   *
   * Specify one of the following enums:
   *
   * SECONDS_10
   *
   * SECONDS_12
   *
   * SECONDS_15
   *
   * SECONDS_20
   *
   * SECONDS_30
   *
   * SECONDS_60
   *
   * SECONDS_120
   *
   * SECONDS_180
   *
   * SECONDS_240
   *
   * SECONDS_300
   *
   * SECONDS_360
   *
   * SECONDS_420
   *
   * SECONDS_480
   *
   * SECONDS_540
   *
   * SECONDS_600
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-statusupdateinterval)
   * @param statusUpdateInterval Specify how often MediaConvert sends STATUS_UPDATE events to Amazon
   * CloudWatch Events. 
   */
  public fun statusUpdateInterval(statusUpdateInterval: String) {
    cdkBuilder.statusUpdateInterval(statusUpdateInterval)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnJobTemplate {
    if(_hopDestinations.isNotEmpty()) cdkBuilder.hopDestinations(_hopDestinations)
    return cdkBuilder.build()
  }
}
