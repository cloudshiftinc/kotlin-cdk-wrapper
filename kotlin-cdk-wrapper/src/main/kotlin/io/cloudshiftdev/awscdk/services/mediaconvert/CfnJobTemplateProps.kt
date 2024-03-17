@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnJobTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconvert.*;
 * Object settingsJson;
 * Object tags;
 * CfnJobTemplateProps cfnJobTemplateProps = CfnJobTemplateProps.builder()
 * .settingsJson(settingsJson)
 * // the properties below are optional
 * .accelerationSettings(AccelerationSettingsProperty.builder()
 * .mode("mode")
 * .build())
 * .category("category")
 * .description("description")
 * .hopDestinations(List.of(HopDestinationProperty.builder()
 * .priority(123)
 * .queue("queue")
 * .waitMinutes(123)
 * .build()))
 * .name("name")
 * .priority(123)
 * .queue("queue")
 * .statusUpdateInterval("statusUpdateInterval")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html)
 */
public interface CfnJobTemplateProps {
  /**
   * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
   *
   * Outputs that use this feature incur pro-tier pricing. For information about feature
   * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
   * Elemental MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-accelerationsettings)
   */
  public fun accelerationSettings(): Any? = unwrap(this).getAccelerationSettings()

  /**
   * Optional.
   *
   * A category for the job template you are creating
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-category)
   */
  public fun category(): String? = unwrap(this).getCategory()

  /**
   * Optional.
   *
   * A description of the job template you are creating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Optional.
   *
   * Configuration for a destination queue to which the job can hop once a customer-defined minimum
   * wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
   * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
   */
  public fun hopDestinations(): Any? = unwrap(this).getHopDestinations()

  /**
   * Name of the output group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specify the relative priority for this job.
   *
   * In any given queue, the service begins processing the job with the highest value first. When
   * more than one job has the same priority, the service begins processing the job that you submitted
   * first. If you don't specify a priority, the service uses the default value 0. Minimum: -50
   * Maximum: 50
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-priority)
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * Optional.
   *
   * The queue that jobs created from this template are assigned to. Specify the Amazon Resource
   * Name (ARN) of the queue. For example, arn:aws:mediaconvert:us-west-2:505474453218:queues/Default.
   * If you don't specify this, jobs will go to the default queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-queue)
   */
  public fun queue(): String? = unwrap(this).getQueue()

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
   */
  public fun settingsJson(): Any

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
   */
  public fun statusUpdateInterval(): String? = unwrap(this).getStatusUpdateInterval()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnJobTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content.
     * Outputs that use this feature incur pro-tier pricing. For information about feature
     * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
     * Elemental
     * MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html) in the
     * *AWS Elemental MediaConvert User Guide* .
     */
    public fun accelerationSettings(accelerationSettings: IResolvable)

    /**
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content.
     * Outputs that use this feature incur pro-tier pricing. For information about feature
     * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
     * Elemental
     * MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html) in the
     * *AWS Elemental MediaConvert User Guide* .
     */
    public
        fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty)

    /**
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content.
     * Outputs that use this feature incur pro-tier pricing. For information about feature
     * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
     * Elemental
     * MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html) in the
     * *AWS Elemental MediaConvert User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c81f50cb740f06aac97b14b5fd72439bffb9b230d195ea991791ad6883ac3618")
    public
        fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty.Builder.() -> Unit)

    /**
     * @param category Optional.
     * A category for the job template you are creating
     */
    public fun category(category: String)

    /**
     * @param description Optional.
     * A description of the job template you are creating.
     */
    public fun description(description: String)

    /**
     * @param hopDestinations Optional.
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     */
    public fun hopDestinations(hopDestinations: IResolvable)

    /**
     * @param hopDestinations Optional.
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     */
    public fun hopDestinations(hopDestinations: List<Any>)

    /**
     * @param hopDestinations Optional.
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     */
    public fun hopDestinations(vararg hopDestinations: Any)

    /**
     * @param name Name of the output group.
     */
    public fun name(name: String)

    /**
     * @param priority Specify the relative priority for this job.
     * In any given queue, the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     * Minimum: -50 Maximum: 50
     */
    public fun priority(priority: Number)

    /**
     * @param queue Optional.
     * The queue that jobs created from this template are assigned to. Specify the Amazon Resource
     * Name (ARN) of the queue. For example,
     * arn:aws:mediaconvert:us-west-2:505474453218:queues/Default. If you don't specify this, jobs will
     * go to the default queue.
     */
    public fun queue(queue: String)

    /**
     * @param statusUpdateInterval Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events.
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
     */
    public fun statusUpdateInterval(statusUpdateInterval: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Any)

    /**
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this job
     * template. 
     * This specification must conform to the AWS Elemental MediaConvert job validation. For
     * information about forming this specification, see the Remarks section later in this topic.
     *
     * For more information about MediaConvert job templates, see [Working with AWS Elemental
     * MediaConvert Job
     * Templates](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-job-templates.html)
     * in the ** .
     */
    public fun tingsJson(settingsJson: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps.Builder
        = software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps.builder()

    /**
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content.
     * Outputs that use this feature incur pro-tier pricing. For information about feature
     * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
     * Elemental
     * MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html) in the
     * *AWS Elemental MediaConvert User Guide* .
     */
    override fun accelerationSettings(accelerationSettings: IResolvable) {
      cdkBuilder.accelerationSettings(accelerationSettings.let(IResolvable::unwrap))
    }

    /**
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content.
     * Outputs that use this feature incur pro-tier pricing. For information about feature
     * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
     * Elemental
     * MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html) in the
     * *AWS Elemental MediaConvert User Guide* .
     */
    override
        fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty) {
      cdkBuilder.accelerationSettings(accelerationSettings.let(CfnJobTemplate.AccelerationSettingsProperty::unwrap))
    }

    /**
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content.
     * Outputs that use this feature incur pro-tier pricing. For information about feature
     * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
     * Elemental
     * MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html) in the
     * *AWS Elemental MediaConvert User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c81f50cb740f06aac97b14b5fd72439bffb9b230d195ea991791ad6883ac3618")
    override
        fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty.Builder.() -> Unit):
        Unit =
        accelerationSettings(CfnJobTemplate.AccelerationSettingsProperty(accelerationSettings))

    /**
     * @param category Optional.
     * A category for the job template you are creating
     */
    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    /**
     * @param description Optional.
     * A description of the job template you are creating.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param hopDestinations Optional.
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     */
    override fun hopDestinations(hopDestinations: IResolvable) {
      cdkBuilder.hopDestinations(hopDestinations.let(IResolvable::unwrap))
    }

    /**
     * @param hopDestinations Optional.
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     */
    override fun hopDestinations(hopDestinations: List<Any>) {
      cdkBuilder.hopDestinations(hopDestinations)
    }

    /**
     * @param hopDestinations Optional.
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     */
    override fun hopDestinations(vararg hopDestinations: Any): Unit =
        hopDestinations(hopDestinations.toList())

    /**
     * @param name Name of the output group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param priority Specify the relative priority for this job.
     * In any given queue, the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     * Minimum: -50 Maximum: 50
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param queue Optional.
     * The queue that jobs created from this template are assigned to. Specify the Amazon Resource
     * Name (ARN) of the queue. For example,
     * arn:aws:mediaconvert:us-west-2:505474453218:queues/Default. If you don't specify this, jobs will
     * go to the default queue.
     */
    override fun queue(queue: String) {
      cdkBuilder.queue(queue)
    }

    /**
     * @param statusUpdateInterval Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events.
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
     */
    override fun statusUpdateInterval(statusUpdateInterval: String) {
      cdkBuilder.statusUpdateInterval(statusUpdateInterval)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this job
     * template. 
     * This specification must conform to the AWS Elemental MediaConvert job validation. For
     * information about forming this specification, see the Remarks section later in this topic.
     *
     * For more information about MediaConvert job templates, see [Working with AWS Elemental
     * MediaConvert Job
     * Templates](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-job-templates.html)
     * in the ** .
     */
    override fun tingsJson(settingsJson: Any) {
      cdkBuilder.settingsJson(settingsJson)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps,
  ) : CdkObject(cdkObject), CfnJobTemplateProps {
    /**
     * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
     *
     * Outputs that use this feature incur pro-tier pricing. For information about feature
     * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
     * Elemental
     * MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html) in the
     * *AWS Elemental MediaConvert User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-accelerationsettings)
     */
    override fun accelerationSettings(): Any? = unwrap(this).getAccelerationSettings()

    /**
     * Optional.
     *
     * A category for the job template you are creating
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-category)
     */
    override fun category(): String? = unwrap(this).getCategory()

    /**
     * Optional.
     *
     * A description of the job template you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Optional.
     *
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
     */
    override fun hopDestinations(): Any? = unwrap(this).getHopDestinations()

    /**
     * Name of the output group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specify the relative priority for this job.
     *
     * In any given queue, the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     * Minimum: -50 Maximum: 50
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-priority)
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * Optional.
     *
     * The queue that jobs created from this template are assigned to. Specify the Amazon Resource
     * Name (ARN) of the queue. For example,
     * arn:aws:mediaconvert:us-west-2:505474453218:queues/Default. If you don't specify this, jobs will
     * go to the default queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-queue)
     */
    override fun queue(): String? = unwrap(this).getQueue()

    /**
     * Specify, in JSON format, the transcoding job settings for this job template.
     *
     * This specification must conform to the AWS Elemental MediaConvert job validation. For
     * information about forming this specification, see the Remarks section later in this topic.
     *
     * For more information about MediaConvert job templates, see [Working with AWS Elemental
     * MediaConvert Job
     * Templates](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-job-templates.html)
     * in the ** .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-settingsjson)
     */
    override fun settingsJson(): Any = unwrap(this).getSettingsJson()

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
     */
    override fun statusUpdateInterval(): String? = unwrap(this).getStatusUpdateInterval()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps):
        CfnJobTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnJobTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobTemplateProps):
        software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps
  }
}
