@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Realtime Log Config configuration.
 *
 * Example:
 *
 * ```
 * // Adding realtime logs config to a Cloudfront Distribution on default behavior.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
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
public open class RealtimeLogConfig(
  cdkObject: software.amazon.awscdk.services.cloudfront.RealtimeLogConfig,
) : Resource(cdkObject),
    IRealtimeLogConfig {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: RealtimeLogConfigProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.RealtimeLogConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(RealtimeLogConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: RealtimeLogConfigProps.Builder.() -> Unit,
  ) : this(scope, id, RealtimeLogConfigProps(props)
  )

  /**
   * The arn of the realtime log config.
   */
  public override fun realtimeLogConfigArn(): String = unwrap(this).getRealtimeLogConfigArn()

  /**
   * The name of the realtime log config.
   */
  public override fun realtimeLogConfigName(): String = unwrap(this).getRealtimeLogConfigName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.RealtimeLogConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(endPoints: List<Endpoint>)

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(vararg endPoints: Endpoint)

    /**
     * A list of fields that are included in each real-time log record.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * @param fields A list of fields that are included in each real-time log record. 
     */
    public fun fields(fields: List<String>)

    /**
     * A list of fields that are included in each real-time log record.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * @param fields A list of fields that are included in each real-time log record. 
     */
    public fun fields(vararg fields: String)

    /**
     * The unique name of this real-time log configuration.
     *
     * Default: - the unique construct ID
     *
     * @param realtimeLogConfigName The unique name of this real-time log configuration. 
     */
    public fun realtimeLogConfigName(realtimeLogConfigName: String)

    /**
     * The sampling rate for this real-time log configuration.
     *
     * @param samplingRate The sampling rate for this real-time log configuration. 
     */
    public fun samplingRate(samplingRate: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.RealtimeLogConfig.Builder =
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfig.Builder.create(scope, id)

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(endPoints: List<Endpoint>) {
      cdkBuilder.endPoints(endPoints.map(Endpoint.Companion::unwrap))
    }

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(vararg endPoints: Endpoint): Unit = endPoints(endPoints.toList())

    /**
     * A list of fields that are included in each real-time log record.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * @param fields A list of fields that are included in each real-time log record. 
     */
    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    /**
     * A list of fields that are included in each real-time log record.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * @param fields A list of fields that are included in each real-time log record. 
     */
    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    /**
     * The unique name of this real-time log configuration.
     *
     * Default: - the unique construct ID
     *
     * @param realtimeLogConfigName The unique name of this real-time log configuration. 
     */
    override fun realtimeLogConfigName(realtimeLogConfigName: String) {
      cdkBuilder.realtimeLogConfigName(realtimeLogConfigName)
    }

    /**
     * The sampling rate for this real-time log configuration.
     *
     * @param samplingRate The sampling rate for this real-time log configuration. 
     */
    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.RealtimeLogConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfig.PROPERTY_INJECTION_ID

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): RealtimeLogConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return RealtimeLogConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.RealtimeLogConfig):
        RealtimeLogConfig = RealtimeLogConfig(cdkObject)

    internal fun unwrap(wrapped: RealtimeLogConfig):
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfig
  }
}
