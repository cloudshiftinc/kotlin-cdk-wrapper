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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate
import software.amazon.awscdk.services.iot.CfnJobTemplateProps

/**
 * Properties for defining a `CfnJobTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * Object abortConfig;
 * Object jobExecutionsRolloutConfig;
 * Object presignedUrlConfig;
 * Object timeoutConfig;
 * CfnJobTemplateProps cfnJobTemplateProps = CfnJobTemplateProps.builder()
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
public class CfnJobTemplatePropsDsl {
    private val cdkBuilder: CfnJobTemplateProps.Builder = CfnJobTemplateProps.builder()

    private val _maintenanceWindows: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param abortConfig The criteria that determine when and how a job abort takes place. */
    public fun abortConfig(abortConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(abortConfig)
        cdkBuilder.abortConfig(builder.map)
    }

    /** @param abortConfig The criteria that determine when and how a job abort takes place. */
    public fun abortConfig(abortConfig: Any) {
        cdkBuilder.abortConfig(abortConfig)
    }

    /** @param description A description of the job template. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param document The job document. Required if you don't specify a value for `documentSource`
     *   .
     */
    public fun document(document: String) {
        cdkBuilder.document(document)
    }

    /**
     * @param documentSource An S3 link, or S3 object URL, to the job document. The link is an
     *   Amazon S3 object URL and is required if you don't specify a value for `document` .
     *
     * For example, `--document-source https://s3. *region-code*
     * .amazonaws.com/example-firmware/device-firmware.1.0`
     *
     * For more information, see
     * [Methods for accessing a bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-bucket-intro.html)
     * .
     */
    public fun documentSource(documentSource: String) {
        cdkBuilder.documentSource(documentSource)
    }

    /** @param jobArn The ARN of the job to use as the basis for the job template. */
    public fun jobArn(jobArn: String) {
        cdkBuilder.jobArn(jobArn)
    }

    /** @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. */
    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable) {
        cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig)
    }

    /** @param jobExecutionsRetryConfig Allows you to create the criteria to retry a job. */
    public fun jobExecutionsRetryConfig(
        jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty
    ) {
        cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig)
    }

    /** @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job. */
    public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(jobExecutionsRolloutConfig)
        cdkBuilder.jobExecutionsRolloutConfig(builder.map)
    }

    /** @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job. */
    public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any) {
        cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
    }

    /**
     * @param jobTemplateId A unique identifier for the job template. We recommend using a UUID.
     *   Alpha-numeric characters, "-", and "_" are valid for use here.
     */
    public fun jobTemplateId(jobTemplateId: String) {
        cdkBuilder.jobTemplateId(jobTemplateId)
    }

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     *   recurring maintenance window with a predetermined start time and duration for the rollout
     *   of a job document to all devices in a target group for a job.
     */
    public fun maintenanceWindows(vararg maintenanceWindows: Any) {
        _maintenanceWindows.addAll(listOf(*maintenanceWindows))
    }

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     *   recurring maintenance window with a predetermined start time and duration for the rollout
     *   of a job document to all devices in a target group for a job.
     */
    public fun maintenanceWindows(maintenanceWindows: Collection<Any>) {
        _maintenanceWindows.addAll(maintenanceWindows)
    }

    /**
     * @param maintenanceWindows An optional configuration within the SchedulingConfig to setup a
     *   recurring maintenance window with a predetermined start time and duration for the rollout
     *   of a job document to all devices in a target group for a job.
     */
    public fun maintenanceWindows(maintenanceWindows: IResolvable) {
        cdkBuilder.maintenanceWindows(maintenanceWindows)
    }

    /** @param presignedUrlConfig Configuration for pre-signed S3 URLs. */
    public fun presignedUrlConfig(presignedUrlConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(presignedUrlConfig)
        cdkBuilder.presignedUrlConfig(builder.map)
    }

    /** @param presignedUrlConfig Configuration for pre-signed S3 URLs. */
    public fun presignedUrlConfig(presignedUrlConfig: Any) {
        cdkBuilder.presignedUrlConfig(presignedUrlConfig)
    }

    /** @param tags Metadata that can be used to manage the job template. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Metadata that can be used to manage the job template. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param timeoutConfig Specifies the amount of time each device has to finish its execution of
     *   the job. A timer is started when the job execution status is set to `IN_PROGRESS` . If the
     *   job execution status is not set to another terminal state before the timer expires, it will
     *   be automatically set to `TIMED_OUT` .
     */
    public fun timeoutConfig(timeoutConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(timeoutConfig)
        cdkBuilder.timeoutConfig(builder.map)
    }

    /**
     * @param timeoutConfig Specifies the amount of time each device has to finish its execution of
     *   the job. A timer is started when the job execution status is set to `IN_PROGRESS` . If the
     *   job execution status is not set to another terminal state before the timer expires, it will
     *   be automatically set to `TIMED_OUT` .
     */
    public fun timeoutConfig(timeoutConfig: Any) {
        cdkBuilder.timeoutConfig(timeoutConfig)
    }

    public fun build(): CfnJobTemplateProps {
        if (_maintenanceWindows.isNotEmpty()) cdkBuilder.maintenanceWindows(_maintenanceWindows)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
