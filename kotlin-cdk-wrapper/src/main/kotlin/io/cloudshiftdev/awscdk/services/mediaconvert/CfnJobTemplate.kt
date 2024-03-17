@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::MediaConvert::JobTemplate resource is an AWS Elemental MediaConvert resource type that
 * you can use to generate transcoding jobs.
 *
 * When you declare this entity in your AWS CloudFormation template, you pass in your transcoding
 * job settings in JSON or YAML format. This settings specification must be formed in a particular way
 * that conforms to AWS Elemental MediaConvert job validation. For more information about creating a
 * job template model for the `SettingsJson` property, see the Remarks section later in this topic.
 *
 * For information about job templates, see [Working with AWS Elemental MediaConvert Job
 * Templates](https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-job-templates.html) in
 * the ** .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconvert.*;
 * Object settingsJson;
 * Object tags;
 * CfnJobTemplate cfnJobTemplate = CfnJobTemplate.Builder.create(this, "MyCfnJobTemplate")
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
public open class CfnJobTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
   */
  public open fun accelerationSettings(): Any? = unwrap(this).getAccelerationSettings()

  /**
   * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
   */
  public open fun accelerationSettings(`value`: IResolvable) {
    unwrap(this).setAccelerationSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
   */
  public open fun accelerationSettings(`value`: AccelerationSettingsProperty) {
    unwrap(this).setAccelerationSettings(`value`.let(AccelerationSettingsProperty::unwrap))
  }

  /**
   * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e6db2a81fb614b709689ba981dffe6c25712a605c945bdbd3e2e88e2f79c00fb")
  public open fun accelerationSettings(`value`: AccelerationSettingsProperty.Builder.() -> Unit):
      Unit = accelerationSettings(AccelerationSettingsProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the job template, such as
   * `arn:aws:mediaconvert:us-west-2:123456789012` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the job template, such as `Streaming stack DASH` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Optional.
   */
  public open fun category(): String? = unwrap(this).getCategory()

  /**
   * Optional.
   */
  public open fun category(`value`: String) {
    unwrap(this).setCategory(`value`)
  }

  /**
   * Optional.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Optional.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Optional.
   */
  public open fun hopDestinations(): Any? = unwrap(this).getHopDestinations()

  /**
   * Optional.
   */
  public open fun hopDestinations(`value`: IResolvable) {
    unwrap(this).setHopDestinations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Optional.
   */
  public open fun hopDestinations(`value`: List<Any>) {
    unwrap(this).setHopDestinations(`value`)
  }

  /**
   * Optional.
   */
  public open fun hopDestinations(vararg `value`: Any): Unit = hopDestinations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Name of the output group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Name of the output group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specify the relative priority for this job.
   */
  public open fun priority(): Number? = unwrap(this).getPriority()

  /**
   * Specify the relative priority for this job.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * Optional.
   */
  public open fun queue(): String? = unwrap(this).getQueue()

  /**
   * Optional.
   */
  public open fun queue(`value`: String) {
    unwrap(this).setQueue(`value`)
  }

  /**
   * Specify, in JSON format, the transcoding job settings for this job template.
   */
  public open fun settingsJson(): Any = unwrap(this).getSettingsJson()

  /**
   * Specify, in JSON format, the transcoding job settings for this job template.
   */
  public open fun settingsJson(`value`: Any) {
    unwrap(this).setSettingsJson(`value`)
  }

  /**
   * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events.
   */
  public open fun statusUpdateInterval(): String? = unwrap(this).getStatusUpdateInterval()

  /**
   * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events.
   */
  public open fun statusUpdateInterval(`value`: String) {
    unwrap(this).setStatusUpdateInterval(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconvert.CfnJobTemplate].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. 
     */
    public fun accelerationSettings(accelerationSettings: IResolvable)

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
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. 
     */
    public fun accelerationSettings(accelerationSettings: AccelerationSettingsProperty)

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
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71826123168d5fa0ad81f034744e0fd2541d75930c20fcfd4edf9b5fc23a313e")
    public
        fun accelerationSettings(accelerationSettings: AccelerationSettingsProperty.Builder.() -> Unit)

    /**
     * Optional.
     *
     * A category for the job template you are creating
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-category)
     * @param category Optional. 
     */
    public fun category(category: String)

    /**
     * Optional.
     *
     * A description of the job template you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-description)
     * @param description Optional. 
     */
    public fun description(description: String)

    /**
     * Optional.
     *
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
     * @param hopDestinations Optional. 
     */
    public fun hopDestinations(hopDestinations: IResolvable)

    /**
     * Optional.
     *
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
     * @param hopDestinations Optional. 
     */
    public fun hopDestinations(hopDestinations: List<Any>)

    /**
     * Optional.
     *
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
     * @param hopDestinations Optional. 
     */
    public fun hopDestinations(vararg hopDestinations: Any)

    /**
     * Name of the output group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-name)
     * @param name Name of the output group. 
     */
    public fun name(name: String)

    /**
     * Specify the relative priority for this job.
     *
     * In any given queue, the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     * Minimum: -50 Maximum: 50
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-priority)
     * @param priority Specify the relative priority for this job. 
     */
    public fun priority(priority: Number)

    /**
     * Optional.
     *
     * The queue that jobs created from this template are assigned to. Specify the Amazon Resource
     * Name (ARN) of the queue. For example,
     * arn:aws:mediaconvert:us-west-2:505474453218:queues/Default. If you don't specify this, jobs will
     * go to the default queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-queue)
     * @param queue Optional. 
     */
    public fun queue(queue: String)

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
     * @param statusUpdateInterval Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events. 
     */
    public fun statusUpdateInterval(statusUpdateInterval: String)

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
    public fun tags(tags: Any)

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
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this job
     * template. 
     */
    public fun tingsJson(settingsJson: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.Builder =
        software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.Builder.create(scope, id)

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
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. 
     */
    override fun accelerationSettings(accelerationSettings: IResolvable) {
      cdkBuilder.accelerationSettings(accelerationSettings.let(IResolvable::unwrap))
    }

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
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. 
     */
    override fun accelerationSettings(accelerationSettings: AccelerationSettingsProperty) {
      cdkBuilder.accelerationSettings(accelerationSettings.let(AccelerationSettingsProperty::unwrap))
    }

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
     * @param accelerationSettings Accelerated transcoding can significantly speed up jobs with
     * long, visually complex content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71826123168d5fa0ad81f034744e0fd2541d75930c20fcfd4edf9b5fc23a313e")
    override
        fun accelerationSettings(accelerationSettings: AccelerationSettingsProperty.Builder.() -> Unit):
        Unit = accelerationSettings(AccelerationSettingsProperty(accelerationSettings))

    /**
     * Optional.
     *
     * A category for the job template you are creating
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-category)
     * @param category Optional. 
     */
    override fun category(category: String) {
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
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Optional.
     *
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
     * @param hopDestinations Optional. 
     */
    override fun hopDestinations(hopDestinations: IResolvable) {
      cdkBuilder.hopDestinations(hopDestinations.let(IResolvable::unwrap))
    }

    /**
     * Optional.
     *
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
     * @param hopDestinations Optional. 
     */
    override fun hopDestinations(hopDestinations: List<Any>) {
      cdkBuilder.hopDestinations(hopDestinations)
    }

    /**
     * Optional.
     *
     * Configuration for a destination queue to which the job can hop once a customer-defined
     * minimum wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
     * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
     * in the *AWS Elemental MediaConvert User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-hopdestinations)
     * @param hopDestinations Optional. 
     */
    override fun hopDestinations(vararg hopDestinations: Any): Unit =
        hopDestinations(hopDestinations.toList())

    /**
     * Name of the output group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-name)
     * @param name Name of the output group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specify the relative priority for this job.
     *
     * In any given queue, the service begins processing the job with the highest value first. When
     * more than one job has the same priority, the service begins processing the job that you
     * submitted first. If you don't specify a priority, the service uses the default value 0.
     * Minimum: -50 Maximum: 50
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-priority)
     * @param priority Specify the relative priority for this job. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * Optional.
     *
     * The queue that jobs created from this template are assigned to. Specify the Amazon Resource
     * Name (ARN) of the queue. For example,
     * arn:aws:mediaconvert:us-west-2:505474453218:queues/Default. If you don't specify this, jobs will
     * go to the default queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconvert-jobtemplate.html#cfn-mediaconvert-jobtemplate-queue)
     * @param queue Optional. 
     */
    override fun queue(queue: String) {
      cdkBuilder.queue(queue)
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
     * @param statusUpdateInterval Specify how often MediaConvert sends STATUS_UPDATE events to
     * Amazon CloudWatch Events. 
     */
    override fun statusUpdateInterval(statusUpdateInterval: String) {
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
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

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
     * @param settingsJson Specify, in JSON format, the transcoding job settings for this job
     * template. 
     */
    override fun tingsJson(settingsJson: Any) {
      cdkBuilder.settingsJson(settingsJson)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnJobTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJobTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJobTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate):
        CfnJobTemplate = CfnJobTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnJobTemplate):
        software.amazon.awscdk.services.mediaconvert.CfnJobTemplate = wrapped.cdkObject
  }

  /**
   * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
   *
   * Outputs that use this feature incur pro-tier pricing. For information about feature
   * limitations, For more information, see [Job Limitations for Accelerated Transcoding in AWS
   * Elemental MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconvert.*;
   * AccelerationSettingsProperty accelerationSettingsProperty =
   * AccelerationSettingsProperty.builder()
   * .mode("mode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html)
   */
  public interface AccelerationSettingsProperty {
    /**
     * Specify the conditions when the service will run your job with accelerated transcoding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html#cfn-mediaconvert-jobtemplate-accelerationsettings-mode)
     */
    public fun mode(): String

    /**
     * A builder for [AccelerationSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode Specify the conditions when the service will run your job with accelerated
       * transcoding. 
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty.builder()

      /**
       * @param mode Specify the conditions when the service will run your job with accelerated
       * transcoding. 
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty,
    ) : CdkObject(cdkObject), AccelerationSettingsProperty {
      /**
       * Specify the conditions when the service will run your job with accelerated transcoding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html#cfn-mediaconvert-jobtemplate-accelerationsettings-mode)
       */
      override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccelerationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty):
          AccelerationSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccelerationSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccelerationSettingsProperty):
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty
    }
  }

  /**
   * Optional.
   *
   * Configuration for a destination queue to which the job can hop once a customer-defined minimum
   * wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
   * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
   * in the *AWS Elemental MediaConvert User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconvert.*;
   * HopDestinationProperty hopDestinationProperty = HopDestinationProperty.builder()
   * .priority(123)
   * .queue("queue")
   * .waitMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html)
   */
  public interface HopDestinationProperty {
    /**
     * Optional.
     *
     * When you set up a job to use queue hopping, you can specify a different relative priority for
     * the job in the destination queue. If you don't specify, the relative priority will remain the
     * same as in the previous queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html#cfn-mediaconvert-jobtemplate-hopdestination-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * Optional unless the job is submitted on the default queue.
     *
     * When you set up a job to use queue hopping, you can specify a destination queue. This queue
     * cannot be the original queue to which the job is submitted. If the original queue isn't the
     * default queue and you don't specify the destination queue, the job will move to the default
     * queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html#cfn-mediaconvert-jobtemplate-hopdestination-queue)
     */
    public fun queue(): String? = unwrap(this).getQueue()

    /**
     * Required for setting up a job to use queue hopping.
     *
     * Minimum wait time in minutes until the job can hop to the destination queue. Valid range is 1
     * to 4320 minutes, inclusive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html#cfn-mediaconvert-jobtemplate-hopdestination-waitminutes)
     */
    public fun waitMinutes(): Number? = unwrap(this).getWaitMinutes()

    /**
     * A builder for [HopDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param priority Optional.
       * When you set up a job to use queue hopping, you can specify a different relative priority
       * for the job in the destination queue. If you don't specify, the relative priority will remain
       * the same as in the previous queue.
       */
      public fun priority(priority: Number)

      /**
       * @param queue Optional unless the job is submitted on the default queue.
       * When you set up a job to use queue hopping, you can specify a destination queue. This queue
       * cannot be the original queue to which the job is submitted. If the original queue isn't the
       * default queue and you don't specify the destination queue, the job will move to the default
       * queue.
       */
      public fun queue(queue: String)

      /**
       * @param waitMinutes Required for setting up a job to use queue hopping.
       * Minimum wait time in minutes until the job can hop to the destination queue. Valid range is
       * 1 to 4320 minutes, inclusive.
       */
      public fun waitMinutes(waitMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty.Builder
          =
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty.builder()

      /**
       * @param priority Optional.
       * When you set up a job to use queue hopping, you can specify a different relative priority
       * for the job in the destination queue. If you don't specify, the relative priority will remain
       * the same as in the previous queue.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param queue Optional unless the job is submitted on the default queue.
       * When you set up a job to use queue hopping, you can specify a destination queue. This queue
       * cannot be the original queue to which the job is submitted. If the original queue isn't the
       * default queue and you don't specify the destination queue, the job will move to the default
       * queue.
       */
      override fun queue(queue: String) {
        cdkBuilder.queue(queue)
      }

      /**
       * @param waitMinutes Required for setting up a job to use queue hopping.
       * Minimum wait time in minutes until the job can hop to the destination queue. Valid range is
       * 1 to 4320 minutes, inclusive.
       */
      override fun waitMinutes(waitMinutes: Number) {
        cdkBuilder.waitMinutes(waitMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty,
    ) : CdkObject(cdkObject), HopDestinationProperty {
      /**
       * Optional.
       *
       * When you set up a job to use queue hopping, you can specify a different relative priority
       * for the job in the destination queue. If you don't specify, the relative priority will remain
       * the same as in the previous queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html#cfn-mediaconvert-jobtemplate-hopdestination-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()

      /**
       * Optional unless the job is submitted on the default queue.
       *
       * When you set up a job to use queue hopping, you can specify a destination queue. This queue
       * cannot be the original queue to which the job is submitted. If the original queue isn't the
       * default queue and you don't specify the destination queue, the job will move to the default
       * queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html#cfn-mediaconvert-jobtemplate-hopdestination-queue)
       */
      override fun queue(): String? = unwrap(this).getQueue()

      /**
       * Required for setting up a job to use queue hopping.
       *
       * Minimum wait time in minutes until the job can hop to the destination queue. Valid range is
       * 1 to 4320 minutes, inclusive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html#cfn-mediaconvert-jobtemplate-hopdestination-waitminutes)
       */
      override fun waitMinutes(): Number? = unwrap(this).getWaitMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HopDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty):
          HopDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? HopDestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HopDestinationProperty):
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty
    }
  }
}
