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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.Endpoint
import software.amazon.awscdk.services.cloudfront.RealtimeLogConfig
import software.constructs.Construct

/**
 * A Realtime Log Config configuration.
 *
 * Example:
 * ```
 * // Adding realtime logs config to a Cloudfront Distribution on default behavior.
 * import software.amazon.awscdk.services.kinesis.*;
 * Stream stream;
 * RealtimeLogConfig realTimeConfig = RealtimeLogConfig.Builder.create(this, "realtimeLog")
 * .endPoints(List.of(Endpoint.fromKinesisStream(stream)))
 * .fields(List.of("timestamp", "c-ip", "time-to-first-byte", "sc-status"))
 * .realtimeLogConfigName("my-delivery-stream")
 * .samplingRate(100)
 * .build();
 * Distribution.Builder.create(this, "myCdn")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new HttpOrigin("www.example.com"))
 * .realtimeLogConfig(realTimeConfig)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class RealtimeLogConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: RealtimeLogConfig.Builder = RealtimeLogConfig.Builder.create(scope, id)

    private val _endPoints: MutableList<Endpoint> = mutableListOf()

    private val _fields: MutableList<String> = mutableListOf()

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     *   sending real-time log data for this real-time log configuration.
     */
    public fun endPoints(vararg endPoints: Endpoint) {
        _endPoints.addAll(listOf(*endPoints))
    }

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     *   sending real-time log data for this real-time log configuration.
     */
    public fun endPoints(endPoints: Collection<Endpoint>) {
        _endPoints.addAll(endPoints)
    }

    /**
     * A list of fields that are included in each real-time log record.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     *
     * @param fields A list of fields that are included in each real-time log record.
     */
    public fun fields(vararg fields: String) {
        _fields.addAll(listOf(*fields))
    }

    /**
     * A list of fields that are included in each real-time log record.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     *
     * @param fields A list of fields that are included in each real-time log record.
     */
    public fun fields(fields: Collection<String>) {
        _fields.addAll(fields)
    }

    /**
     * The unique name of this real-time log configuration.
     *
     * Default: - the unique construct ID
     *
     * @param realtimeLogConfigName The unique name of this real-time log configuration.
     */
    public fun realtimeLogConfigName(realtimeLogConfigName: String) {
        cdkBuilder.realtimeLogConfigName(realtimeLogConfigName)
    }

    /**
     * The sampling rate for this real-time log configuration.
     *
     * @param samplingRate The sampling rate for this real-time log configuration.
     */
    public fun samplingRate(samplingRate: Number) {
        cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): RealtimeLogConfig {
        if (_endPoints.isNotEmpty()) cdkBuilder.endPoints(_endPoints)
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        return cdkBuilder.build()
    }
}
