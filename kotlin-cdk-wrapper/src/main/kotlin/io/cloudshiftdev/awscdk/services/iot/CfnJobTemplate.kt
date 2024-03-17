@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
 * Represents a job template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * Object abortConfig;
 * Object jobExecutionsRolloutConfig;
 * Object presignedUrlConfig;
 * Object timeoutConfig;
 * CfnJobTemplate cfnJobTemplate = CfnJobTemplate.Builder.create(this, "MyCfnJobTemplate")
 * .description("description")
 * .jobTemplateId("jobTemplateId")
 * // the properties below are optional
 * .abortConfig(abortConfig)
 * .destinationPackageVersions(List.of("destinationPackageVersions"))
 * .document("document")
 * .documentSource("documentSource")
 * .jobArn("jobArn")
 * .jobExecutionsRetryConfig(JobExecutionsRetryConfigProperty.builder()
 * .retryCriteriaList(List.of(RetryCriteriaProperty.builder()
 * .failureType("failureType")
 * .numberOfRetries(123)
 * .build()))
 * .build())
 * .jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
 * .maintenanceWindows(List.of(MaintenanceWindowProperty.builder()
 * .durationInMinutes(123)
 * .startTime("startTime")
 * .build()))
 * .presignedUrlConfig(presignedUrlConfig)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeoutConfig(timeoutConfig)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html)
 */
public open class CfnJobTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The criteria that determine when and how a job abort takes place.
   */
  public open fun abortConfig(): Any? = unwrap(this).getAbortConfig()

  /**
   * The criteria that determine when and how a job abort takes place.
   */
  public open fun abortConfig(`value`: Any) {
    unwrap(this).setAbortConfig(`value`)
  }

  /**
   * The ARN of the job to use as the basis for the job template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A description of the job template.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description of the job template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
   * named shadow ( `$package` ) when the job successfully completes.
   */
  public open fun destinationPackageVersions(): List<String> =
      unwrap(this).getDestinationPackageVersions() ?: emptyList()

  /**
   * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
   * named shadow ( `$package` ) when the job successfully completes.
   */
  public open fun destinationPackageVersions(`value`: List<String>) {
    unwrap(this).setDestinationPackageVersions(`value`)
  }

  /**
   * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
   * named shadow ( `$package` ) when the job successfully completes.
   */
  public open fun destinationPackageVersions(vararg `value`: String): Unit =
      destinationPackageVersions(`value`.toList())

  /**
   * The job document.
   */
  public open fun document(): String? = unwrap(this).getDocument()

  /**
   * The job document.
   */
  public open fun document(`value`: String) {
    unwrap(this).setDocument(`value`)
  }

  /**
   * An S3 link, or S3 object URL, to the job document.
   */
  public open fun documentSource(): String? = unwrap(this).getDocumentSource()

  /**
   * An S3 link, or S3 object URL, to the job document.
   */
  public open fun documentSource(`value`: String) {
    unwrap(this).setDocumentSource(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ARN of the job to use as the basis for the job template.
   */
  public open fun jobArn(): String? = unwrap(this).getJobArn()

  /**
   * The ARN of the job to use as the basis for the job template.
   */
  public open fun jobArn(`value`: String) {
    unwrap(this).setJobArn(`value`)
  }

  /**
   * Allows you to create the criteria to retry a job.
   */
  public open fun jobExecutionsRetryConfig(): Any? = unwrap(this).getJobExecutionsRetryConfig()

  /**
   * Allows you to create the criteria to retry a job.
   */
  public open fun jobExecutionsRetryConfig(`value`: IResolvable) {
    unwrap(this).setJobExecutionsRetryConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Allows you to create the criteria to retry a job.
   */
  public open fun jobExecutionsRetryConfig(`value`: JobExecutionsRetryConfigProperty) {
    unwrap(this).setJobExecutionsRetryConfig(`value`.let(JobExecutionsRetryConfigProperty::unwrap))
  }

  /**
   * Allows you to create the criteria to retry a job.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("587ee1bebb4160b831e3a9c3ad3bf8a0ac25a736f62ecefff71478b4a1173066")
  public open
      fun jobExecutionsRetryConfig(`value`: JobExecutionsRetryConfigProperty.Builder.() -> Unit):
      Unit = jobExecutionsRetryConfig(JobExecutionsRetryConfigProperty(`value`))

  /**
   * Allows you to create a staged rollout of a job.
   */
  public open fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

  /**
   * Allows you to create a staged rollout of a job.
   */
  public open fun jobExecutionsRolloutConfig(`value`: Any) {
    unwrap(this).setJobExecutionsRolloutConfig(`value`)
  }

  /**
   * A unique identifier for the job template.
   */
  public open fun jobTemplateId(): String = unwrap(this).getJobTemplateId()

  /**
   * A unique identifier for the job template.
   */
  public open fun jobTemplateId(`value`: String) {
    unwrap(this).setJobTemplateId(`value`)
  }

  /**
   * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   */
  public open fun maintenanceWindows(): Any? = unwrap(this).getMaintenanceWindows()

  /**
   * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   */
  public open fun maintenanceWindows(`value`: IResolvable) {
    unwrap(this).setMaintenanceWindows(`value`.let(IResolvable::unwrap))
  }

  /**
   * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   */
  public open fun maintenanceWindows(`value`: List<Any>) {
    unwrap(this).setMaintenanceWindows(`value`)
  }

  /**
   * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   */
  public open fun maintenanceWindows(vararg `value`: Any): Unit =
      maintenanceWindows(`value`.toList())

  /**
   * Configuration for pre-signed S3 URLs.
   */
  public open fun presignedUrlConfig(): Any? = unwrap(this).getPresignedUrlConfig()

  /**
   * Configuration for pre-signed S3 URLs.
   */
  public open fun presignedUrlConfig(`value`: Any) {
    unwrap(this).setPresignedUrlConfig(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the job template.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the job template.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that can be used to manage the job template.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies the amount of time each device has to finish its execution of the job.
   */
  public open fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()

  /**
   * Specifies the amount of time each device has to finish its execution of the job.
   */
  public open fun timeoutConfig(`value`: Any) {
    unwrap(this).setTimeoutConfig(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnJobTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The criteria that determine when and how a job abort takes place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-abortconfig)
     * @param abortConfig The criteria that determine when and how a job abort takes place. 
     */
    public fun abortConfig(abortConfig: Any)

    /**
     * A description of the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-description)
     * @param description A description of the job template. 
     */
    public fun description(description: String)

    /**
     * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
     * named shadow ( `$package` ) when the job successfully completes.
     *
     * *Note:* Up to 25 package version ARNS are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-destinationpackageversions)
     * @param destinationPackageVersions The package version Amazon Resource Names (ARNs) that are
     * installed on the device’s reserved named shadow ( `$package` ) when the job successfully
     * completes. 
     */
    public fun destinationPackageVersions(destinationPackageVersions: List<String>)

    /**
     * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
     * named shadow ( `$package` ) when the job successfully completes.
     *
     * *Note:* Up to 25 package version ARNS are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-destinationpackageversions)
     * @param destinationPackageVersions The package version Amazon Resource Names (ARNs) that are
     * installed on the device’s reserved named shadow ( `$package` ) when the job successfully
     * completes. 
     */
    public fun destinationPackageVersions(vararg destinationPackageVersions: String)

    /**
     * The job document.
     *
     * Required if you don't specify a value for `documentSource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-document)
     * @param document The job document. 
     */
    public fun document(document: String)

    /**
     * An S3 link, or S3 object URL, to the job document.
     *
     * The link is an Amazon S3 object URL and is required if you don't specify a value for
     * `document` .
     *
     * For example, `--document-source https://s3. *region-code*
     * .amazonaws.com/example-firmware/device-firmware.1.0`
     *
     * For more information, see [Methods for accessing a
     * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-documentsource)
     * @param documentSource An S3 link, or S3 object URL, to the job document. 
     */
    public fun documentSource(documentSource: String)

    /**
     * The ARN of the job to use as the basis for the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobarn)
     * @param jobArn The ARN of the job to use as the basis for the job template. 
     */
    public fun jobArn(jobArn: String)

    /**
     * Allows you to create the criteria to retry a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. 
     */
    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable)

    /**
     * Allows you to create the criteria to retry a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. 
     */
    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: JobExecutionsRetryConfigProperty)

    /**
     * Allows you to create the criteria to retry a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f07507e82a08fa344ea7db45333affff37b9c3f56a1162931589454f3e071196")
    public
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: JobExecutionsRetryConfigProperty.Builder.() -> Unit)

    /**
     * Allows you to create a staged rollout of a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig)
     * @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job. 
     */
    public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any)

    /**
     * A unique identifier for the job template.
     *
     * We recommend using a UUID. Alpha-numeric characters, "-", and "_" are valid for use here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobtemplateid)
     * @param jobTemplateId A unique identifier for the job template. 
     */
    public fun jobTemplateId(jobTemplateId: String)

    /**
     * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
     * with a predetermined start time and duration for the rollout of a job document to all devices in
     * a target group for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job. 
     */
    public fun maintenanceWindows(maintenanceWindows: IResolvable)

    /**
     * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
     * with a predetermined start time and duration for the rollout of a job document to all devices in
     * a target group for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job. 
     */
    public fun maintenanceWindows(maintenanceWindows: List<Any>)

    /**
     * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
     * with a predetermined start time and duration for the rollout of a job document to all devices in
     * a target group for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job. 
     */
    public fun maintenanceWindows(vararg maintenanceWindows: Any)

    /**
     * Configuration for pre-signed S3 URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-presignedurlconfig)
     * @param presignedUrlConfig Configuration for pre-signed S3 URLs. 
     */
    public fun presignedUrlConfig(presignedUrlConfig: Any)

    /**
     * Metadata that can be used to manage the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-tags)
     * @param tags Metadata that can be used to manage the job template. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-tags)
     * @param tags Metadata that can be used to manage the job template. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies the amount of time each device has to finish its execution of the job.
     *
     * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job
     * execution status is not set to another terminal state before the timer expires, it will be
     * automatically set to `TIMED_OUT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-timeoutconfig)
     * @param timeoutConfig Specifies the amount of time each device has to finish its execution of
     * the job. 
     */
    public fun timeoutConfig(timeoutConfig: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnJobTemplate.Builder =
        software.amazon.awscdk.services.iot.CfnJobTemplate.Builder.create(scope, id)

    /**
     * The criteria that determine when and how a job abort takes place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-abortconfig)
     * @param abortConfig The criteria that determine when and how a job abort takes place. 
     */
    override fun abortConfig(abortConfig: Any) {
      cdkBuilder.abortConfig(abortConfig)
    }

    /**
     * A description of the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-description)
     * @param description A description of the job template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
     * named shadow ( `$package` ) when the job successfully completes.
     *
     * *Note:* Up to 25 package version ARNS are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-destinationpackageversions)
     * @param destinationPackageVersions The package version Amazon Resource Names (ARNs) that are
     * installed on the device’s reserved named shadow ( `$package` ) when the job successfully
     * completes. 
     */
    override fun destinationPackageVersions(destinationPackageVersions: List<String>) {
      cdkBuilder.destinationPackageVersions(destinationPackageVersions)
    }

    /**
     * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
     * named shadow ( `$package` ) when the job successfully completes.
     *
     * *Note:* Up to 25 package version ARNS are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-destinationpackageversions)
     * @param destinationPackageVersions The package version Amazon Resource Names (ARNs) that are
     * installed on the device’s reserved named shadow ( `$package` ) when the job successfully
     * completes. 
     */
    override fun destinationPackageVersions(vararg destinationPackageVersions: String): Unit =
        destinationPackageVersions(destinationPackageVersions.toList())

    /**
     * The job document.
     *
     * Required if you don't specify a value for `documentSource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-document)
     * @param document The job document. 
     */
    override fun document(document: String) {
      cdkBuilder.document(document)
    }

    /**
     * An S3 link, or S3 object URL, to the job document.
     *
     * The link is an Amazon S3 object URL and is required if you don't specify a value for
     * `document` .
     *
     * For example, `--document-source https://s3. *region-code*
     * .amazonaws.com/example-firmware/device-firmware.1.0`
     *
     * For more information, see [Methods for accessing a
     * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-documentsource)
     * @param documentSource An S3 link, or S3 object URL, to the job document. 
     */
    override fun documentSource(documentSource: String) {
      cdkBuilder.documentSource(documentSource)
    }

    /**
     * The ARN of the job to use as the basis for the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobarn)
     * @param jobArn The ARN of the job to use as the basis for the job template. 
     */
    override fun jobArn(jobArn: String) {
      cdkBuilder.jobArn(jobArn)
    }

    /**
     * Allows you to create the criteria to retry a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. 
     */
    override fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable) {
      cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig.let(IResolvable::unwrap))
    }

    /**
     * Allows you to create the criteria to retry a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. 
     */
    override
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: JobExecutionsRetryConfigProperty) {
      cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig.let(JobExecutionsRetryConfigProperty::unwrap))
    }

    /**
     * Allows you to create the criteria to retry a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f07507e82a08fa344ea7db45333affff37b9c3f56a1162931589454f3e071196")
    override
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: JobExecutionsRetryConfigProperty.Builder.() -> Unit):
        Unit = jobExecutionsRetryConfig(JobExecutionsRetryConfigProperty(jobExecutionsRetryConfig))

    /**
     * Allows you to create a staged rollout of a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig)
     * @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job. 
     */
    override fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any) {
      cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
    }

    /**
     * A unique identifier for the job template.
     *
     * We recommend using a UUID. Alpha-numeric characters, "-", and "_" are valid for use here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobtemplateid)
     * @param jobTemplateId A unique identifier for the job template. 
     */
    override fun jobTemplateId(jobTemplateId: String) {
      cdkBuilder.jobTemplateId(jobTemplateId)
    }

    /**
     * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
     * with a predetermined start time and duration for the rollout of a job document to all devices in
     * a target group for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job. 
     */
    override fun maintenanceWindows(maintenanceWindows: IResolvable) {
      cdkBuilder.maintenanceWindows(maintenanceWindows.let(IResolvable::unwrap))
    }

    /**
     * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
     * with a predetermined start time and duration for the rollout of a job document to all devices in
     * a target group for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job. 
     */
    override fun maintenanceWindows(maintenanceWindows: List<Any>) {
      cdkBuilder.maintenanceWindows(maintenanceWindows)
    }

    /**
     * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
     * with a predetermined start time and duration for the rollout of a job document to all devices in
     * a target group for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job. 
     */
    override fun maintenanceWindows(vararg maintenanceWindows: Any): Unit =
        maintenanceWindows(maintenanceWindows.toList())

    /**
     * Configuration for pre-signed S3 URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-presignedurlconfig)
     * @param presignedUrlConfig Configuration for pre-signed S3 URLs. 
     */
    override fun presignedUrlConfig(presignedUrlConfig: Any) {
      cdkBuilder.presignedUrlConfig(presignedUrlConfig)
    }

    /**
     * Metadata that can be used to manage the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-tags)
     * @param tags Metadata that can be used to manage the job template. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that can be used to manage the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-tags)
     * @param tags Metadata that can be used to manage the job template. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies the amount of time each device has to finish its execution of the job.
     *
     * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job
     * execution status is not set to another terminal state before the timer expires, it will be
     * automatically set to `TIMED_OUT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-timeoutconfig)
     * @param timeoutConfig Specifies the amount of time each device has to finish its execution of
     * the job. 
     */
    override fun timeoutConfig(timeoutConfig: Any) {
      cdkBuilder.timeoutConfig(timeoutConfig)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnJobTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJobTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJobTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate): CfnJobTemplate
        = CfnJobTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnJobTemplate): software.amazon.awscdk.services.iot.CfnJobTemplate
        = wrapped.cdkObject
  }

  /**
   * Allows you to create a staged rollout of a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * JobExecutionsRolloutConfigProperty jobExecutionsRolloutConfigProperty =
   * JobExecutionsRolloutConfigProperty.builder()
   * .exponentialRolloutRate(ExponentialRolloutRateProperty.builder()
   * .baseRatePerMinute(123)
   * .incrementFactor(123)
   * .rateIncreaseCriteria(RateIncreaseCriteriaProperty.builder()
   * .numberOfNotifiedThings(123)
   * .numberOfSucceededThings(123)
   * .build())
   * .build())
   * .maximumPerMinute(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsrolloutconfig.html)
   */
  public interface JobExecutionsRolloutConfigProperty {
    /**
     * The rate of increase for a job rollout.
     *
     * This parameter allows you to define an exponential rate for a job rollout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsrolloutconfig.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig-exponentialrolloutrate)
     */
    public fun exponentialRolloutRate(): Any? = unwrap(this).getExponentialRolloutRate()

    /**
     * The maximum number of things that will be notified of a pending job, per minute.
     *
     * This parameter allows you to create a staged rollout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsrolloutconfig.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig-maximumperminute)
     */
    public fun maximumPerMinute(): Number? = unwrap(this).getMaximumPerMinute()

    /**
     * A builder for [JobExecutionsRolloutConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exponentialRolloutRate The rate of increase for a job rollout.
       * This parameter allows you to define an exponential rate for a job rollout.
       */
      public fun exponentialRolloutRate(exponentialRolloutRate: IResolvable)

      /**
       * @param exponentialRolloutRate The rate of increase for a job rollout.
       * This parameter allows you to define an exponential rate for a job rollout.
       */
      public fun exponentialRolloutRate(exponentialRolloutRate: ExponentialRolloutRateProperty)

      /**
       * @param exponentialRolloutRate The rate of increase for a job rollout.
       * This parameter allows you to define an exponential rate for a job rollout.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fee8f5419cc352070c35fa37873e10c1fc11252f5336d82a87ac177eca125449")
      public
          fun exponentialRolloutRate(exponentialRolloutRate: ExponentialRolloutRateProperty.Builder.() -> Unit)

      /**
       * @param maximumPerMinute The maximum number of things that will be notified of a pending
       * job, per minute.
       * This parameter allows you to create a staged rollout.
       */
      public fun maximumPerMinute(maximumPerMinute: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty.builder()

      /**
       * @param exponentialRolloutRate The rate of increase for a job rollout.
       * This parameter allows you to define an exponential rate for a job rollout.
       */
      override fun exponentialRolloutRate(exponentialRolloutRate: IResolvable) {
        cdkBuilder.exponentialRolloutRate(exponentialRolloutRate.let(IResolvable::unwrap))
      }

      /**
       * @param exponentialRolloutRate The rate of increase for a job rollout.
       * This parameter allows you to define an exponential rate for a job rollout.
       */
      override fun exponentialRolloutRate(exponentialRolloutRate: ExponentialRolloutRateProperty) {
        cdkBuilder.exponentialRolloutRate(exponentialRolloutRate.let(ExponentialRolloutRateProperty::unwrap))
      }

      /**
       * @param exponentialRolloutRate The rate of increase for a job rollout.
       * This parameter allows you to define an exponential rate for a job rollout.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fee8f5419cc352070c35fa37873e10c1fc11252f5336d82a87ac177eca125449")
      override
          fun exponentialRolloutRate(exponentialRolloutRate: ExponentialRolloutRateProperty.Builder.() -> Unit):
          Unit = exponentialRolloutRate(ExponentialRolloutRateProperty(exponentialRolloutRate))

      /**
       * @param maximumPerMinute The maximum number of things that will be notified of a pending
       * job, per minute.
       * This parameter allows you to create a staged rollout.
       */
      override fun maximumPerMinute(maximumPerMinute: Number) {
        cdkBuilder.maximumPerMinute(maximumPerMinute)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty,
    ) : CdkObject(cdkObject), JobExecutionsRolloutConfigProperty {
      /**
       * The rate of increase for a job rollout.
       *
       * This parameter allows you to define an exponential rate for a job rollout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsrolloutconfig.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig-exponentialrolloutrate)
       */
      override fun exponentialRolloutRate(): Any? = unwrap(this).getExponentialRolloutRate()

      /**
       * The maximum number of things that will be notified of a pending job, per minute.
       *
       * This parameter allows you to create a staged rollout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsrolloutconfig.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig-maximumperminute)
       */
      override fun maximumPerMinute(): Number? = unwrap(this).getMaximumPerMinute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          JobExecutionsRolloutConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty):
          JobExecutionsRolloutConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JobExecutionsRolloutConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobExecutionsRolloutConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty
    }
  }

  /**
   * The criteria that determine when and how a job abort takes place.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AbortCriteriaProperty abortCriteriaProperty = AbortCriteriaProperty.builder()
   * .action("action")
   * .failureType("failureType")
   * .minNumberOfExecutedThings(123)
   * .thresholdPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html)
   */
  public interface AbortCriteriaProperty {
    /**
     * The type of job action to take to initiate the job abort.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html#cfn-iot-jobtemplate-abortcriteria-action)
     */
    public fun action(): String

    /**
     * The type of job execution failures that can initiate a job abort.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html#cfn-iot-jobtemplate-abortcriteria-failuretype)
     */
    public fun failureType(): String

    /**
     * The minimum number of things which must receive job execution notifications before the job
     * can be aborted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html#cfn-iot-jobtemplate-abortcriteria-minnumberofexecutedthings)
     */
    public fun minNumberOfExecutedThings(): Number

    /**
     * The minimum percentage of job execution failures that must occur to initiate the job abort.
     *
     * AWS IoT Core supports up to two digits after the decimal (for example, 10.9 and 10.99, but
     * not 10.999).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html#cfn-iot-jobtemplate-abortcriteria-thresholdpercentage)
     */
    public fun thresholdPercentage(): Number

    /**
     * A builder for [AbortCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The type of job action to take to initiate the job abort. 
       */
      public fun action(action: String)

      /**
       * @param failureType The type of job execution failures that can initiate a job abort. 
       */
      public fun failureType(failureType: String)

      /**
       * @param minNumberOfExecutedThings The minimum number of things which must receive job
       * execution notifications before the job can be aborted. 
       */
      public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number)

      /**
       * @param thresholdPercentage The minimum percentage of job execution failures that must occur
       * to initiate the job abort. 
       * AWS IoT Core supports up to two digits after the decimal (for example, 10.9 and 10.99, but
       * not 10.999).
       */
      public fun thresholdPercentage(thresholdPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty.builder()

      /**
       * @param action The type of job action to take to initiate the job abort. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param failureType The type of job execution failures that can initiate a job abort. 
       */
      override fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
      }

      /**
       * @param minNumberOfExecutedThings The minimum number of things which must receive job
       * execution notifications before the job can be aborted. 
       */
      override fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
        cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
      }

      /**
       * @param thresholdPercentage The minimum percentage of job execution failures that must occur
       * to initiate the job abort. 
       * AWS IoT Core supports up to two digits after the decimal (for example, 10.9 and 10.99, but
       * not 10.999).
       */
      override fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty,
    ) : CdkObject(cdkObject), AbortCriteriaProperty {
      /**
       * The type of job action to take to initiate the job abort.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html#cfn-iot-jobtemplate-abortcriteria-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The type of job execution failures that can initiate a job abort.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html#cfn-iot-jobtemplate-abortcriteria-failuretype)
       */
      override fun failureType(): String = unwrap(this).getFailureType()

      /**
       * The minimum number of things which must receive job execution notifications before the job
       * can be aborted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html#cfn-iot-jobtemplate-abortcriteria-minnumberofexecutedthings)
       */
      override fun minNumberOfExecutedThings(): Number = unwrap(this).getMinNumberOfExecutedThings()

      /**
       * The minimum percentage of job execution failures that must occur to initiate the job abort.
       *
       * AWS IoT Core supports up to two digits after the decimal (for example, 10.9 and 10.99, but
       * not 10.999).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html#cfn-iot-jobtemplate-abortcriteria-thresholdpercentage)
       */
      override fun thresholdPercentage(): Number = unwrap(this).getThresholdPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AbortCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty):
          AbortCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as? AbortCriteriaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbortCriteriaProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty
    }
  }

  /**
   * Specifies the amount of time each device has to finish its execution of the job.
   *
   * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job execution
   * status is not set to another terminal state before the timer expires, it will be automatically set
   * to `TIMED_OUT` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * TimeoutConfigProperty timeoutConfigProperty = TimeoutConfigProperty.builder()
   * .inProgressTimeoutInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-timeoutconfig.html)
   */
  public interface TimeoutConfigProperty {
    /**
     * Specifies the amount of time, in minutes, this device has to finish execution of this job.
     *
     * The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in
     * progress timer can't be updated and will apply to all job executions for the job. Whenever a job
     * execution remains in the IN_PROGRESS status for longer than this interval, the job execution
     * will fail and switch to the terminal `TIMED_OUT` status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-timeoutconfig.html#cfn-iot-jobtemplate-timeoutconfig-inprogresstimeoutinminutes)
     */
    public fun inProgressTimeoutInMinutes(): Number

    /**
     * A builder for [TimeoutConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inProgressTimeoutInMinutes Specifies the amount of time, in minutes, this device has
       * to finish execution of this job. 
       * The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The
       * in progress timer can't be updated and will apply to all job executions for the job. Whenever
       * a job execution remains in the IN_PROGRESS status for longer than this interval, the job
       * execution will fail and switch to the terminal `TIMED_OUT` status.
       */
      public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty.builder()

      /**
       * @param inProgressTimeoutInMinutes Specifies the amount of time, in minutes, this device has
       * to finish execution of this job. 
       * The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The
       * in progress timer can't be updated and will apply to all job executions for the job. Whenever
       * a job execution remains in the IN_PROGRESS status for longer than this interval, the job
       * execution will fail and switch to the terminal `TIMED_OUT` status.
       */
      override fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
        cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty,
    ) : CdkObject(cdkObject), TimeoutConfigProperty {
      /**
       * Specifies the amount of time, in minutes, this device has to finish execution of this job.
       *
       * The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The
       * in progress timer can't be updated and will apply to all job executions for the job. Whenever
       * a job execution remains in the IN_PROGRESS status for longer than this interval, the job
       * execution will fail and switch to the terminal `TIMED_OUT` status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-timeoutconfig.html#cfn-iot-jobtemplate-timeoutconfig-inprogresstimeoutinminutes)
       */
      override fun inProgressTimeoutInMinutes(): Number =
          unwrap(this).getInProgressTimeoutInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeoutConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty):
          TimeoutConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TimeoutConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeoutConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty
    }
  }

  /**
   * Configuration for pre-signed S3 URLs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * PresignedUrlConfigProperty presignedUrlConfigProperty = PresignedUrlConfigProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .expiresInSec(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-presignedurlconfig.html)
   */
  public interface PresignedUrlConfigProperty {
    /**
     * How long (in seconds) pre-signed URLs are valid.
     *
     * Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are generated
     * when Jobs receives an MQTT request for the job document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-presignedurlconfig.html#cfn-iot-jobtemplate-presignedurlconfig-expiresinsec)
     */
    public fun expiresInSec(): Number? = unwrap(this).getExpiresInSec()

    /**
     * The ARN of an IAM role that grants grants permission to download files from the S3 bucket
     * where the job data/updates are stored.
     *
     * The role must also grant permission for IoT to download the files.
     *
     *
     * For information about addressing the confused deputy problem, see [cross-service confused
     * deputy
     * prevention](https://docs.aws.amazon.com/iot/latest/developerguide/cross-service-confused-deputy-prevention.html)
     * in the *AWS IoT Core developer guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-presignedurlconfig.html#cfn-iot-jobtemplate-presignedurlconfig-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [PresignedUrlConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expiresInSec How long (in seconds) pre-signed URLs are valid.
       * Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are
       * generated when Jobs receives an MQTT request for the job document.
       */
      public fun expiresInSec(expiresInSec: Number)

      /**
       * @param roleArn The ARN of an IAM role that grants grants permission to download files from
       * the S3 bucket where the job data/updates are stored. 
       * The role must also grant permission for IoT to download the files.
       *
       *
       * For information about addressing the confused deputy problem, see [cross-service confused
       * deputy
       * prevention](https://docs.aws.amazon.com/iot/latest/developerguide/cross-service-confused-deputy-prevention.html)
       * in the *AWS IoT Core developer guide* .
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty.builder()

      /**
       * @param expiresInSec How long (in seconds) pre-signed URLs are valid.
       * Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are
       * generated when Jobs receives an MQTT request for the job document.
       */
      override fun expiresInSec(expiresInSec: Number) {
        cdkBuilder.expiresInSec(expiresInSec)
      }

      /**
       * @param roleArn The ARN of an IAM role that grants grants permission to download files from
       * the S3 bucket where the job data/updates are stored. 
       * The role must also grant permission for IoT to download the files.
       *
       *
       * For information about addressing the confused deputy problem, see [cross-service confused
       * deputy
       * prevention](https://docs.aws.amazon.com/iot/latest/developerguide/cross-service-confused-deputy-prevention.html)
       * in the *AWS IoT Core developer guide* .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty,
    ) : CdkObject(cdkObject), PresignedUrlConfigProperty {
      /**
       * How long (in seconds) pre-signed URLs are valid.
       *
       * Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are
       * generated when Jobs receives an MQTT request for the job document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-presignedurlconfig.html#cfn-iot-jobtemplate-presignedurlconfig-expiresinsec)
       */
      override fun expiresInSec(): Number? = unwrap(this).getExpiresInSec()

      /**
       * The ARN of an IAM role that grants grants permission to download files from the S3 bucket
       * where the job data/updates are stored.
       *
       * The role must also grant permission for IoT to download the files.
       *
       *
       * For information about addressing the confused deputy problem, see [cross-service confused
       * deputy
       * prevention](https://docs.aws.amazon.com/iot/latest/developerguide/cross-service-confused-deputy-prevention.html)
       * in the *AWS IoT Core developer guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-presignedurlconfig.html#cfn-iot-jobtemplate-presignedurlconfig-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PresignedUrlConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty):
          PresignedUrlConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PresignedUrlConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PresignedUrlConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty
    }
  }

  /**
   * The configuration that determines how many retries are allowed for each failure type for a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * JobExecutionsRetryConfigProperty jobExecutionsRetryConfigProperty =
   * JobExecutionsRetryConfigProperty.builder()
   * .retryCriteriaList(List.of(RetryCriteriaProperty.builder()
   * .failureType("failureType")
   * .numberOfRetries(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsretryconfig.html)
   */
  public interface JobExecutionsRetryConfigProperty {
    /**
     * The list of criteria that determines how many retries are allowed for each failure type for a
     * job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsretryconfig.html#cfn-iot-jobtemplate-jobexecutionsretryconfig-retrycriterialist)
     */
    public fun retryCriteriaList(): Any? = unwrap(this).getRetryCriteriaList()

    /**
     * A builder for [JobExecutionsRetryConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param retryCriteriaList The list of criteria that determines how many retries are allowed
       * for each failure type for a job.
       */
      public fun retryCriteriaList(retryCriteriaList: IResolvable)

      /**
       * @param retryCriteriaList The list of criteria that determines how many retries are allowed
       * for each failure type for a job.
       */
      public fun retryCriteriaList(retryCriteriaList: List<Any>)

      /**
       * @param retryCriteriaList The list of criteria that determines how many retries are allowed
       * for each failure type for a job.
       */
      public fun retryCriteriaList(vararg retryCriteriaList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty.builder()

      /**
       * @param retryCriteriaList The list of criteria that determines how many retries are allowed
       * for each failure type for a job.
       */
      override fun retryCriteriaList(retryCriteriaList: IResolvable) {
        cdkBuilder.retryCriteriaList(retryCriteriaList.let(IResolvable::unwrap))
      }

      /**
       * @param retryCriteriaList The list of criteria that determines how many retries are allowed
       * for each failure type for a job.
       */
      override fun retryCriteriaList(retryCriteriaList: List<Any>) {
        cdkBuilder.retryCriteriaList(retryCriteriaList)
      }

      /**
       * @param retryCriteriaList The list of criteria that determines how many retries are allowed
       * for each failure type for a job.
       */
      override fun retryCriteriaList(vararg retryCriteriaList: Any): Unit =
          retryCriteriaList(retryCriteriaList.toList())

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty,
    ) : CdkObject(cdkObject), JobExecutionsRetryConfigProperty {
      /**
       * The list of criteria that determines how many retries are allowed for each failure type for
       * a job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsretryconfig.html#cfn-iot-jobtemplate-jobexecutionsretryconfig-retrycriterialist)
       */
      override fun retryCriteriaList(): Any? = unwrap(this).getRetryCriteriaList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobExecutionsRetryConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty):
          JobExecutionsRetryConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JobExecutionsRetryConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobExecutionsRetryConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty
    }
  }

  /**
   * Allows you to define a criteria to initiate the increase in rate of rollout for a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * RateIncreaseCriteriaProperty rateIncreaseCriteriaProperty =
   * RateIncreaseCriteriaProperty.builder()
   * .numberOfNotifiedThings(123)
   * .numberOfSucceededThings(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-rateincreasecriteria.html)
   */
  public interface RateIncreaseCriteriaProperty {
    /**
     * The threshold for number of notified things that will initiate the increase in rate of
     * rollout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-rateincreasecriteria.html#cfn-iot-jobtemplate-rateincreasecriteria-numberofnotifiedthings)
     */
    public fun numberOfNotifiedThings(): Number? = unwrap(this).getNumberOfNotifiedThings()

    /**
     * The threshold for number of succeeded things that will initiate the increase in rate of
     * rollout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-rateincreasecriteria.html#cfn-iot-jobtemplate-rateincreasecriteria-numberofsucceededthings)
     */
    public fun numberOfSucceededThings(): Number? = unwrap(this).getNumberOfSucceededThings()

    /**
     * A builder for [RateIncreaseCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param numberOfNotifiedThings The threshold for number of notified things that will
       * initiate the increase in rate of rollout.
       */
      public fun numberOfNotifiedThings(numberOfNotifiedThings: Number)

      /**
       * @param numberOfSucceededThings The threshold for number of succeeded things that will
       * initiate the increase in rate of rollout.
       */
      public fun numberOfSucceededThings(numberOfSucceededThings: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty.builder()

      /**
       * @param numberOfNotifiedThings The threshold for number of notified things that will
       * initiate the increase in rate of rollout.
       */
      override fun numberOfNotifiedThings(numberOfNotifiedThings: Number) {
        cdkBuilder.numberOfNotifiedThings(numberOfNotifiedThings)
      }

      /**
       * @param numberOfSucceededThings The threshold for number of succeeded things that will
       * initiate the increase in rate of rollout.
       */
      override fun numberOfSucceededThings(numberOfSucceededThings: Number) {
        cdkBuilder.numberOfSucceededThings(numberOfSucceededThings)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty,
    ) : CdkObject(cdkObject), RateIncreaseCriteriaProperty {
      /**
       * The threshold for number of notified things that will initiate the increase in rate of
       * rollout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-rateincreasecriteria.html#cfn-iot-jobtemplate-rateincreasecriteria-numberofnotifiedthings)
       */
      override fun numberOfNotifiedThings(): Number? = unwrap(this).getNumberOfNotifiedThings()

      /**
       * The threshold for number of succeeded things that will initiate the increase in rate of
       * rollout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-rateincreasecriteria.html#cfn-iot-jobtemplate-rateincreasecriteria-numberofsucceededthings)
       */
      override fun numberOfSucceededThings(): Number? = unwrap(this).getNumberOfSucceededThings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateIncreaseCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty):
          RateIncreaseCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RateIncreaseCriteriaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateIncreaseCriteriaProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty
    }
  }

  /**
   * An optional configuration within the `SchedulingConfig` to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
   * .durationInMinutes(123)
   * .startTime("startTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-maintenancewindow.html)
   */
  public interface MaintenanceWindowProperty {
    /**
     * Displays the duration of the next maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-maintenancewindow.html#cfn-iot-jobtemplate-maintenancewindow-durationinminutes)
     */
    public fun durationInMinutes(): Number? = unwrap(this).getDurationInMinutes()

    /**
     * Displays the start time of the next maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-maintenancewindow.html#cfn-iot-jobtemplate-maintenancewindow-starttime)
     */
    public fun startTime(): String? = unwrap(this).getStartTime()

    /**
     * A builder for [MaintenanceWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInMinutes Displays the duration of the next maintenance window.
       */
      public fun durationInMinutes(durationInMinutes: Number)

      /**
       * @param startTime Displays the start time of the next maintenance window.
       */
      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty.builder()

      /**
       * @param durationInMinutes Displays the duration of the next maintenance window.
       */
      override fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
      }

      /**
       * @param startTime Displays the start time of the next maintenance window.
       */
      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty,
    ) : CdkObject(cdkObject), MaintenanceWindowProperty {
      /**
       * Displays the duration of the next maintenance window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-maintenancewindow.html#cfn-iot-jobtemplate-maintenancewindow-durationinminutes)
       */
      override fun durationInMinutes(): Number? = unwrap(this).getDurationInMinutes()

      /**
       * Displays the start time of the next maintenance window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-maintenancewindow.html#cfn-iot-jobtemplate-maintenancewindow-starttime)
       */
      override fun startTime(): String? = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty):
          MaintenanceWindowProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MaintenanceWindowProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty
    }
  }

  /**
   * The criteria that determine when and how a job abort takes place.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AbortConfigProperty abortConfigProperty = AbortConfigProperty.builder()
   * .criteriaList(List.of(AbortCriteriaProperty.builder()
   * .action("action")
   * .failureType("failureType")
   * .minNumberOfExecutedThings(123)
   * .thresholdPercentage(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortconfig.html)
   */
  public interface AbortConfigProperty {
    /**
     * The list of criteria that determine when and how to abort the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortconfig.html#cfn-iot-jobtemplate-abortconfig-criterialist)
     */
    public fun criteriaList(): Any

    /**
     * A builder for [AbortConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param criteriaList The list of criteria that determine when and how to abort the job. 
       */
      public fun criteriaList(criteriaList: IResolvable)

      /**
       * @param criteriaList The list of criteria that determine when and how to abort the job. 
       */
      public fun criteriaList(criteriaList: List<Any>)

      /**
       * @param criteriaList The list of criteria that determine when and how to abort the job. 
       */
      public fun criteriaList(vararg criteriaList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty.builder()

      /**
       * @param criteriaList The list of criteria that determine when and how to abort the job. 
       */
      override fun criteriaList(criteriaList: IResolvable) {
        cdkBuilder.criteriaList(criteriaList.let(IResolvable::unwrap))
      }

      /**
       * @param criteriaList The list of criteria that determine when and how to abort the job. 
       */
      override fun criteriaList(criteriaList: List<Any>) {
        cdkBuilder.criteriaList(criteriaList)
      }

      /**
       * @param criteriaList The list of criteria that determine when and how to abort the job. 
       */
      override fun criteriaList(vararg criteriaList: Any): Unit =
          criteriaList(criteriaList.toList())

      public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty,
    ) : CdkObject(cdkObject), AbortConfigProperty {
      /**
       * The list of criteria that determine when and how to abort the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortconfig.html#cfn-iot-jobtemplate-abortconfig-criterialist)
       */
      override fun criteriaList(): Any = unwrap(this).getCriteriaList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AbortConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty):
          AbortConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? AbortConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbortConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty
    }
  }

  /**
   * Allows you to create an exponential rate of rollout for a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ExponentialRolloutRateProperty exponentialRolloutRateProperty =
   * ExponentialRolloutRateProperty.builder()
   * .baseRatePerMinute(123)
   * .incrementFactor(123)
   * .rateIncreaseCriteria(RateIncreaseCriteriaProperty.builder()
   * .numberOfNotifiedThings(123)
   * .numberOfSucceededThings(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-exponentialrolloutrate.html)
   */
  public interface ExponentialRolloutRateProperty {
    /**
     * The minimum number of things that will be notified of a pending job, per minute at the start
     * of job rollout.
     *
     * This parameter allows you to define the initial rate of rollout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-exponentialrolloutrate.html#cfn-iot-jobtemplate-exponentialrolloutrate-baserateperminute)
     */
    public fun baseRatePerMinute(): Number

    /**
     * The exponential factor to increase the rate of rollout for a job.
     *
     * AWS IoT Core supports up to one digit after the decimal (for example, 1.5, but not 1.55).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-exponentialrolloutrate.html#cfn-iot-jobtemplate-exponentialrolloutrate-incrementfactor)
     */
    public fun incrementFactor(): Number

    /**
     * The criteria to initiate the increase in rate of rollout for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-exponentialrolloutrate.html#cfn-iot-jobtemplate-exponentialrolloutrate-rateincreasecriteria)
     */
    public fun rateIncreaseCriteria(): Any

    /**
     * A builder for [ExponentialRolloutRateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseRatePerMinute The minimum number of things that will be notified of a pending
       * job, per minute at the start of job rollout. 
       * This parameter allows you to define the initial rate of rollout.
       */
      public fun baseRatePerMinute(baseRatePerMinute: Number)

      /**
       * @param incrementFactor The exponential factor to increase the rate of rollout for a job. 
       * AWS IoT Core supports up to one digit after the decimal (for example, 1.5, but not 1.55).
       */
      public fun incrementFactor(incrementFactor: Number)

      /**
       * @param rateIncreaseCriteria The criteria to initiate the increase in rate of rollout for a
       * job. 
       */
      public fun rateIncreaseCriteria(rateIncreaseCriteria: IResolvable)

      /**
       * @param rateIncreaseCriteria The criteria to initiate the increase in rate of rollout for a
       * job. 
       */
      public fun rateIncreaseCriteria(rateIncreaseCriteria: RateIncreaseCriteriaProperty)

      /**
       * @param rateIncreaseCriteria The criteria to initiate the increase in rate of rollout for a
       * job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edd0b24b3eb5a02d63c072c1c5088f14930c44fdb725bef7353a97719ebbf811")
      public
          fun rateIncreaseCriteria(rateIncreaseCriteria: RateIncreaseCriteriaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty.builder()

      /**
       * @param baseRatePerMinute The minimum number of things that will be notified of a pending
       * job, per minute at the start of job rollout. 
       * This parameter allows you to define the initial rate of rollout.
       */
      override fun baseRatePerMinute(baseRatePerMinute: Number) {
        cdkBuilder.baseRatePerMinute(baseRatePerMinute)
      }

      /**
       * @param incrementFactor The exponential factor to increase the rate of rollout for a job. 
       * AWS IoT Core supports up to one digit after the decimal (for example, 1.5, but not 1.55).
       */
      override fun incrementFactor(incrementFactor: Number) {
        cdkBuilder.incrementFactor(incrementFactor)
      }

      /**
       * @param rateIncreaseCriteria The criteria to initiate the increase in rate of rollout for a
       * job. 
       */
      override fun rateIncreaseCriteria(rateIncreaseCriteria: IResolvable) {
        cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria.let(IResolvable::unwrap))
      }

      /**
       * @param rateIncreaseCriteria The criteria to initiate the increase in rate of rollout for a
       * job. 
       */
      override fun rateIncreaseCriteria(rateIncreaseCriteria: RateIncreaseCriteriaProperty) {
        cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria.let(RateIncreaseCriteriaProperty::unwrap))
      }

      /**
       * @param rateIncreaseCriteria The criteria to initiate the increase in rate of rollout for a
       * job. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edd0b24b3eb5a02d63c072c1c5088f14930c44fdb725bef7353a97719ebbf811")
      override
          fun rateIncreaseCriteria(rateIncreaseCriteria: RateIncreaseCriteriaProperty.Builder.() -> Unit):
          Unit = rateIncreaseCriteria(RateIncreaseCriteriaProperty(rateIncreaseCriteria))

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty,
    ) : CdkObject(cdkObject), ExponentialRolloutRateProperty {
      /**
       * The minimum number of things that will be notified of a pending job, per minute at the
       * start of job rollout.
       *
       * This parameter allows you to define the initial rate of rollout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-exponentialrolloutrate.html#cfn-iot-jobtemplate-exponentialrolloutrate-baserateperminute)
       */
      override fun baseRatePerMinute(): Number = unwrap(this).getBaseRatePerMinute()

      /**
       * The exponential factor to increase the rate of rollout for a job.
       *
       * AWS IoT Core supports up to one digit after the decimal (for example, 1.5, but not 1.55).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-exponentialrolloutrate.html#cfn-iot-jobtemplate-exponentialrolloutrate-incrementfactor)
       */
      override fun incrementFactor(): Number = unwrap(this).getIncrementFactor()

      /**
       * The criteria to initiate the increase in rate of rollout for a job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-exponentialrolloutrate.html#cfn-iot-jobtemplate-exponentialrolloutrate-rateincreasecriteria)
       */
      override fun rateIncreaseCriteria(): Any = unwrap(this).getRateIncreaseCriteria()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExponentialRolloutRateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty):
          ExponentialRolloutRateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExponentialRolloutRateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExponentialRolloutRateProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty
    }
  }

  /**
   * The criteria that determines how many retries are allowed for each failure type for a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * RetryCriteriaProperty retryCriteriaProperty = RetryCriteriaProperty.builder()
   * .failureType("failureType")
   * .numberOfRetries(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-retrycriteria.html)
   */
  public interface RetryCriteriaProperty {
    /**
     * The type of job execution failures that can initiate a job retry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-retrycriteria.html#cfn-iot-jobtemplate-retrycriteria-failuretype)
     */
    public fun failureType(): String? = unwrap(this).getFailureType()

    /**
     * The number of retries allowed for a failure type for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-retrycriteria.html#cfn-iot-jobtemplate-retrycriteria-numberofretries)
     */
    public fun numberOfRetries(): Number? = unwrap(this).getNumberOfRetries()

    /**
     * A builder for [RetryCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureType The type of job execution failures that can initiate a job retry.
       */
      public fun failureType(failureType: String)

      /**
       * @param numberOfRetries The number of retries allowed for a failure type for the job.
       */
      public fun numberOfRetries(numberOfRetries: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty.builder()

      /**
       * @param failureType The type of job execution failures that can initiate a job retry.
       */
      override fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
      }

      /**
       * @param numberOfRetries The number of retries allowed for a failure type for the job.
       */
      override fun numberOfRetries(numberOfRetries: Number) {
        cdkBuilder.numberOfRetries(numberOfRetries)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty,
    ) : CdkObject(cdkObject), RetryCriteriaProperty {
      /**
       * The type of job execution failures that can initiate a job retry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-retrycriteria.html#cfn-iot-jobtemplate-retrycriteria-failuretype)
       */
      override fun failureType(): String? = unwrap(this).getFailureType()

      /**
       * The number of retries allowed for a failure type for the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-retrycriteria.html#cfn-iot-jobtemplate-retrycriteria-numberofretries)
       */
      override fun numberOfRetries(): Number? = unwrap(this).getNumberOfRetries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetryCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty):
          RetryCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as? RetryCriteriaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryCriteriaProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty
    }
  }
}
