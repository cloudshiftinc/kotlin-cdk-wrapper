@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
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
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * Object abortConfig;
 * Object jobExecutionsRolloutConfig;
 * Object presignedUrlConfig;
 * Object timeoutConfig;
 * CfnJobTemplateProps cfnJobTemplateProps = CfnJobTemplateProps.builder()
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
public interface CfnJobTemplateProps {
  /**
   * The criteria that determine when and how a job abort takes place.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-abortconfig)
   */
  public fun abortConfig(): Any? = unwrap(this).getAbortConfig()

  /**
   * A description of the job template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-description)
   */
  public fun description(): String

  /**
   * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
   * named shadow ( `$package` ) when the job successfully completes.
   *
   * *Note:* Up to 25 package version ARNS are allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-destinationpackageversions)
   */
  public fun destinationPackageVersions(): List<String> =
      unwrap(this).getDestinationPackageVersions() ?: emptyList()

  /**
   * The job document.
   *
   * Required if you don't specify a value for `documentSource` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-document)
   */
  public fun document(): String? = unwrap(this).getDocument()

  /**
   * An S3 link, or S3 object URL, to the job document.
   *
   * The link is an Amazon S3 object URL and is required if you don't specify a value for `document`
   * .
   *
   * For example, `--document-source https://s3. *region-code*
   * .amazonaws.com/example-firmware/device-firmware.1.0`
   *
   * For more information, see [Methods for accessing a
   * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-documentsource)
   */
  public fun documentSource(): String? = unwrap(this).getDocumentSource()

  /**
   * The ARN of the job to use as the basis for the job template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobarn)
   */
  public fun jobArn(): String? = unwrap(this).getJobArn()

  /**
   * Allows you to create the criteria to retry a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
   */
  public fun jobExecutionsRetryConfig(): Any? = unwrap(this).getJobExecutionsRetryConfig()

  /**
   * Allows you to create a staged rollout of a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig)
   */
  public fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

  /**
   * A unique identifier for the job template.
   *
   * We recommend using a UUID. Alpha-numeric characters, "-", and "_" are valid for use here.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobtemplateid)
   */
  public fun jobTemplateId(): String

  /**
   * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
   */
  public fun maintenanceWindows(): Any? = unwrap(this).getMaintenanceWindows()

  /**
   * Configuration for pre-signed S3 URLs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-presignedurlconfig)
   */
  public fun presignedUrlConfig(): Any? = unwrap(this).getPresignedUrlConfig()

  /**
   * Metadata that can be used to manage the job template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the amount of time each device has to finish its execution of the job.
   *
   * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job execution
   * status is not set to another terminal state before the timer expires, it will be automatically set
   * to `TIMED_OUT` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-timeoutconfig)
   */
  public fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()

  /**
   * A builder for [CfnJobTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param abortConfig The criteria that determine when and how a job abort takes place.
     */
    public fun abortConfig(abortConfig: Any)

    /**
     * @param description A description of the job template. 
     */
    public fun description(description: String)

    /**
     * @param destinationPackageVersions The package version Amazon Resource Names (ARNs) that are
     * installed on the device’s reserved named shadow ( `$package` ) when the job successfully
     * completes.
     * *Note:* Up to 25 package version ARNS are allowed.
     */
    public fun destinationPackageVersions(destinationPackageVersions: List<String>)

    /**
     * @param destinationPackageVersions The package version Amazon Resource Names (ARNs) that are
     * installed on the device’s reserved named shadow ( `$package` ) when the job successfully
     * completes.
     * *Note:* Up to 25 package version ARNS are allowed.
     */
    public fun destinationPackageVersions(vararg destinationPackageVersions: String)

    /**
     * @param document The job document.
     * Required if you don't specify a value for `documentSource` .
     */
    public fun document(document: String)

    /**
     * @param documentSource An S3 link, or S3 object URL, to the job document.
     * The link is an Amazon S3 object URL and is required if you don't specify a value for
     * `document` .
     *
     * For example, `--document-source https://s3. *region-code*
     * .amazonaws.com/example-firmware/device-firmware.1.0`
     *
     * For more information, see [Methods for accessing a
     * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html) .
     */
    public fun documentSource(documentSource: String)

    /**
     * @param jobArn The ARN of the job to use as the basis for the job template.
     */
    public fun jobArn(jobArn: String)

    /**
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job.
     */
    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable)

    /**
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job.
     */
    public
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty)

    /**
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67d9816317c8b001f7f1d1bb48362a76195f2d13cc3a5ab6fc68e9b1ff5bff3d")
    public
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder.() -> Unit)

    /**
     * @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job.
     */
    public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any)

    /**
     * @param jobTemplateId A unique identifier for the job template. 
     * We recommend using a UUID. Alpha-numeric characters, "-", and "_" are valid for use here.
     */
    public fun jobTemplateId(jobTemplateId: String)

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job.
     */
    public fun maintenanceWindows(maintenanceWindows: IResolvable)

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job.
     */
    public fun maintenanceWindows(maintenanceWindows: List<Any>)

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job.
     */
    public fun maintenanceWindows(vararg maintenanceWindows: Any)

    /**
     * @param presignedUrlConfig Configuration for pre-signed S3 URLs.
     */
    public fun presignedUrlConfig(presignedUrlConfig: Any)

    /**
     * @param tags Metadata that can be used to manage the job template.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the job template.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeoutConfig Specifies the amount of time each device has to finish its execution of
     * the job.
     * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job
     * execution status is not set to another terminal state before the timer expires, it will be
     * automatically set to `TIMED_OUT` .
     */
    public fun timeoutConfig(timeoutConfig: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnJobTemplateProps.Builder =
        software.amazon.awscdk.services.iot.CfnJobTemplateProps.builder()

    /**
     * @param abortConfig The criteria that determine when and how a job abort takes place.
     */
    override fun abortConfig(abortConfig: Any) {
      cdkBuilder.abortConfig(abortConfig)
    }

    /**
     * @param description A description of the job template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param destinationPackageVersions The package version Amazon Resource Names (ARNs) that are
     * installed on the device’s reserved named shadow ( `$package` ) when the job successfully
     * completes.
     * *Note:* Up to 25 package version ARNS are allowed.
     */
    override fun destinationPackageVersions(destinationPackageVersions: List<String>) {
      cdkBuilder.destinationPackageVersions(destinationPackageVersions)
    }

    /**
     * @param destinationPackageVersions The package version Amazon Resource Names (ARNs) that are
     * installed on the device’s reserved named shadow ( `$package` ) when the job successfully
     * completes.
     * *Note:* Up to 25 package version ARNS are allowed.
     */
    override fun destinationPackageVersions(vararg destinationPackageVersions: String): Unit =
        destinationPackageVersions(destinationPackageVersions.toList())

    /**
     * @param document The job document.
     * Required if you don't specify a value for `documentSource` .
     */
    override fun document(document: String) {
      cdkBuilder.document(document)
    }

    /**
     * @param documentSource An S3 link, or S3 object URL, to the job document.
     * The link is an Amazon S3 object URL and is required if you don't specify a value for
     * `document` .
     *
     * For example, `--document-source https://s3. *region-code*
     * .amazonaws.com/example-firmware/device-firmware.1.0`
     *
     * For more information, see [Methods for accessing a
     * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html) .
     */
    override fun documentSource(documentSource: String) {
      cdkBuilder.documentSource(documentSource)
    }

    /**
     * @param jobArn The ARN of the job to use as the basis for the job template.
     */
    override fun jobArn(jobArn: String) {
      cdkBuilder.jobArn(jobArn)
    }

    /**
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job.
     */
    override fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable) {
      cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig.let(IResolvable::unwrap))
    }

    /**
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job.
     */
    override
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty) {
      cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig.let(CfnJobTemplate.JobExecutionsRetryConfigProperty::unwrap))
    }

    /**
     * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67d9816317c8b001f7f1d1bb48362a76195f2d13cc3a5ab6fc68e9b1ff5bff3d")
    override
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder.() -> Unit):
        Unit =
        jobExecutionsRetryConfig(CfnJobTemplate.JobExecutionsRetryConfigProperty(jobExecutionsRetryConfig))

    /**
     * @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job.
     */
    override fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any) {
      cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
    }

    /**
     * @param jobTemplateId A unique identifier for the job template. 
     * We recommend using a UUID. Alpha-numeric characters, "-", and "_" are valid for use here.
     */
    override fun jobTemplateId(jobTemplateId: String) {
      cdkBuilder.jobTemplateId(jobTemplateId)
    }

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job.
     */
    override fun maintenanceWindows(maintenanceWindows: IResolvable) {
      cdkBuilder.maintenanceWindows(maintenanceWindows.let(IResolvable::unwrap))
    }

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job.
     */
    override fun maintenanceWindows(maintenanceWindows: List<Any>) {
      cdkBuilder.maintenanceWindows(maintenanceWindows)
    }

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     * recurring maintenance window with a predetermined start time and duration for the rollout of a
     * job document to all devices in a target group for a job.
     */
    override fun maintenanceWindows(vararg maintenanceWindows: Any): Unit =
        maintenanceWindows(maintenanceWindows.toList())

    /**
     * @param presignedUrlConfig Configuration for pre-signed S3 URLs.
     */
    override fun presignedUrlConfig(presignedUrlConfig: Any) {
      cdkBuilder.presignedUrlConfig(presignedUrlConfig)
    }

    /**
     * @param tags Metadata that can be used to manage the job template.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the job template.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeoutConfig Specifies the amount of time each device has to finish its execution of
     * the job.
     * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job
     * execution status is not set to another terminal state before the timer expires, it will be
     * automatically set to `TIMED_OUT` .
     */
    override fun timeoutConfig(timeoutConfig: Any) {
      cdkBuilder.timeoutConfig(timeoutConfig)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplateProps,
  ) : CdkObject(cdkObject), CfnJobTemplateProps {
    /**
     * The criteria that determine when and how a job abort takes place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-abortconfig)
     */
    override fun abortConfig(): Any? = unwrap(this).getAbortConfig()

    /**
     * A description of the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The package version Amazon Resource Names (ARNs) that are installed on the device’s reserved
     * named shadow ( `$package` ) when the job successfully completes.
     *
     * *Note:* Up to 25 package version ARNS are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-destinationpackageversions)
     */
    override fun destinationPackageVersions(): List<String> =
        unwrap(this).getDestinationPackageVersions() ?: emptyList()

    /**
     * The job document.
     *
     * Required if you don't specify a value for `documentSource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-document)
     */
    override fun document(): String? = unwrap(this).getDocument()

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
     */
    override fun documentSource(): String? = unwrap(this).getDocumentSource()

    /**
     * The ARN of the job to use as the basis for the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobarn)
     */
    override fun jobArn(): String? = unwrap(this).getJobArn()

    /**
     * Allows you to create the criteria to retry a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
     */
    override fun jobExecutionsRetryConfig(): Any? = unwrap(this).getJobExecutionsRetryConfig()

    /**
     * Allows you to create a staged rollout of a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig)
     */
    override fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

    /**
     * A unique identifier for the job template.
     *
     * We recommend using a UUID. Alpha-numeric characters, "-", and "_" are valid for use here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobtemplateid)
     */
    override fun jobTemplateId(): String = unwrap(this).getJobTemplateId()

    /**
     * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
     * with a predetermined start time and duration for the rollout of a job document to all devices in
     * a target group for a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
     */
    override fun maintenanceWindows(): Any? = unwrap(this).getMaintenanceWindows()

    /**
     * Configuration for pre-signed S3 URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-presignedurlconfig)
     */
    override fun presignedUrlConfig(): Any? = unwrap(this).getPresignedUrlConfig()

    /**
     * Metadata that can be used to manage the job template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies the amount of time each device has to finish its execution of the job.
     *
     * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job
     * execution status is not set to another terminal state before the timer expires, it will be
     * automatically set to `TIMED_OUT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-timeoutconfig)
     */
    override fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplateProps):
        CfnJobTemplateProps = CdkObjectWrappers.wrap(cdkObject) as CfnJobTemplateProps

    internal fun unwrap(wrapped: CfnJobTemplateProps):
        software.amazon.awscdk.services.iot.CfnJobTemplateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnJobTemplateProps
  }
}
