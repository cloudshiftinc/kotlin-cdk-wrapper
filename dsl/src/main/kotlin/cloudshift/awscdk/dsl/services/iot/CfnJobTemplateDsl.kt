@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate
import software.constructs.Construct

/**
 * Represents a job template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * Object abortConfig;
 * Object jobExecutionsRolloutConfig;
 * Object presignedUrlConfig;
 * Object timeoutConfig;
 * CfnJobTemplate cfnJobTemplate = CfnJobTemplate.Builder.create(this, "MyCfnJobTemplate")
 * .description("description")
 * .jobTemplateId("jobTemplateId")
 * // the properties below are optional
 * .abortConfig(abortConfig)
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
@CdkDslMarker
public class CfnJobTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnJobTemplate.Builder = CfnJobTemplate.Builder.create(scope, id)

  private val _maintenanceWindows: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The criteria that determine when and how a job abort takes place.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-abortconfig)
   * @param abortConfig The criteria that determine when and how a job abort takes place. 
   */
  public fun abortConfig(abortConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(abortConfig)
    cdkBuilder.abortConfig(builder.map)
  }

  /**
   * The criteria that determine when and how a job abort takes place.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-abortconfig)
   * @param abortConfig The criteria that determine when and how a job abort takes place. 
   */
  public fun abortConfig(abortConfig: Any) {
    cdkBuilder.abortConfig(abortConfig)
  }

  /**
   * A description of the job template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-description)
   * @param description A description of the job template. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The job document.
   *
   * Required if you don't specify a value for `documentSource` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-document)
   * @param document The job document. 
   */
  public fun document(document: String) {
    cdkBuilder.document(document)
  }

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
   * @param documentSource An S3 link, or S3 object URL, to the job document. 
   */
  public fun documentSource(documentSource: String) {
    cdkBuilder.documentSource(documentSource)
  }

  /**
   * The ARN of the job to use as the basis for the job template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobarn)
   * @param jobArn The ARN of the job to use as the basis for the job template. 
   */
  public fun jobArn(jobArn: String) {
    cdkBuilder.jobArn(jobArn)
  }

  /**
   * Allows you to create the criteria to retry a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
   * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. 
   */
  public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable) {
    cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig)
  }

  /**
   * Allows you to create the criteria to retry a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsretryconfig)
   * @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. 
   */
  public
      fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty) {
    cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig)
  }

  /**
   * Allows you to create a staged rollout of a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig)
   * @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job. 
   */
  public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(jobExecutionsRolloutConfig)
    cdkBuilder.jobExecutionsRolloutConfig(builder.map)
  }

  /**
   * Allows you to create a staged rollout of a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-jobexecutionsrolloutconfig)
   * @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job. 
   */
  public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any) {
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
  public fun jobTemplateId(jobTemplateId: String) {
    cdkBuilder.jobTemplateId(jobTemplateId)
  }

  /**
   * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
   * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
   * recurring maintenance window with a predetermined start time and duration for the rollout of a job
   * document to all devices in a target group for a job. 
   */
  public fun maintenanceWindows(vararg maintenanceWindows: Any) {
    _maintenanceWindows.addAll(listOf(*maintenanceWindows))
  }

  /**
   * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
   * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
   * recurring maintenance window with a predetermined start time and duration for the rollout of a job
   * document to all devices in a target group for a job. 
   */
  public fun maintenanceWindows(maintenanceWindows: Collection<Any>) {
    _maintenanceWindows.addAll(maintenanceWindows)
  }

  /**
   * An optional configuration within the SchedulingConfig to setup a recurring maintenance window
   * with a predetermined start time and duration for the rollout of a job document to all devices in a
   * target group for a job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-maintenancewindows)
   * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
   * recurring maintenance window with a predetermined start time and duration for the rollout of a job
   * document to all devices in a target group for a job. 
   */
  public fun maintenanceWindows(maintenanceWindows: IResolvable) {
    cdkBuilder.maintenanceWindows(maintenanceWindows)
  }

  /**
   * Configuration for pre-signed S3 URLs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-presignedurlconfig)
   * @param presignedUrlConfig Configuration for pre-signed S3 URLs. 
   */
  public fun presignedUrlConfig(presignedUrlConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(presignedUrlConfig)
    cdkBuilder.presignedUrlConfig(builder.map)
  }

  /**
   * Configuration for pre-signed S3 URLs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-presignedurlconfig)
   * @param presignedUrlConfig Configuration for pre-signed S3 URLs. 
   */
  public fun presignedUrlConfig(presignedUrlConfig: Any) {
    cdkBuilder.presignedUrlConfig(presignedUrlConfig)
  }

  /**
   * Metadata that can be used to manage the job template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-tags)
   * @param tags Metadata that can be used to manage the job template. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata that can be used to manage the job template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-tags)
   * @param tags Metadata that can be used to manage the job template. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Specifies the amount of time each device has to finish its execution of the job.
   *
   * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job execution
   * status is not set to another terminal state before the timer expires, it will be automatically set
   * to `TIMED_OUT` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-timeoutconfig)
   * @param timeoutConfig Specifies the amount of time each device has to finish its execution of
   * the job. 
   */
  public fun timeoutConfig(timeoutConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(timeoutConfig)
    cdkBuilder.timeoutConfig(builder.map)
  }

  /**
   * Specifies the amount of time each device has to finish its execution of the job.
   *
   * A timer is started when the job execution status is set to `IN_PROGRESS` . If the job execution
   * status is not set to another terminal state before the timer expires, it will be automatically set
   * to `TIMED_OUT` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-jobtemplate.html#cfn-iot-jobtemplate-timeoutconfig)
   * @param timeoutConfig Specifies the amount of time each device has to finish its execution of
   * the job. 
   */
  public fun timeoutConfig(timeoutConfig: Any) {
    cdkBuilder.timeoutConfig(timeoutConfig)
  }

  public fun build(): CfnJobTemplate {
    if(_maintenanceWindows.isNotEmpty()) cdkBuilder.maintenanceWindows(_maintenanceWindows)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
