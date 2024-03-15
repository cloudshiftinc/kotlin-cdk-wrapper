@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a RealtimeLogConfig resource.
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
public interface RealtimeLogConfigProps {
  /**
   * Contains information about the Amazon Kinesis data stream where you are sending real-time log
   * data for this real-time log configuration.
   */
  public fun endPoints(): List<Endpoint>

  /**
   * A list of fields that are included in each real-time log record.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
   */
  public fun fields(): List<String>

  /**
   * The unique name of this real-time log configuration.
   *
   * Default: - the unique construct ID
   */
  public fun realtimeLogConfigName(): String? = unwrap(this).getRealtimeLogConfigName()

  /**
   * The sampling rate for this real-time log configuration.
   */
  public fun samplingRate(): Number

  /**
   * A builder for [RealtimeLogConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(endPoints: List<Endpoint>)

    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(vararg endPoints: Endpoint)

    /**
     * @param fields A list of fields that are included in each real-time log record. 
     */
    public fun fields(fields: List<String>)

    /**
     * @param fields A list of fields that are included in each real-time log record. 
     */
    public fun fields(vararg fields: String)

    /**
     * @param realtimeLogConfigName The unique name of this real-time log configuration.
     */
    public fun realtimeLogConfigName(realtimeLogConfigName: String)

    /**
     * @param samplingRate The sampling rate for this real-time log configuration. 
     */
    public fun samplingRate(samplingRate: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps.Builder =
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps.builder()

    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(endPoints: List<Endpoint>) {
      cdkBuilder.endPoints(endPoints.map(Endpoint::unwrap))
    }

    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(vararg endPoints: Endpoint): Unit = endPoints(endPoints.toList())

    /**
     * @param fields A list of fields that are included in each real-time log record. 
     */
    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    /**
     * @param fields A list of fields that are included in each real-time log record. 
     */
    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    /**
     * @param realtimeLogConfigName The unique name of this real-time log configuration.
     */
    override fun realtimeLogConfigName(realtimeLogConfigName: String) {
      cdkBuilder.realtimeLogConfigName(realtimeLogConfigName)
    }

    /**
     * @param samplingRate The sampling rate for this real-time log configuration. 
     */
    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps,
  ) : CdkObject(cdkObject), RealtimeLogConfigProps {
    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     */
    override fun endPoints(): List<Endpoint> = unwrap(this).getEndPoints().map(Endpoint::wrap)

    /**
     * A list of fields that are included in each real-time log record.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     */
    override fun fields(): List<String> = unwrap(this).getFields()

    /**
     * The unique name of this real-time log configuration.
     *
     * Default: - the unique construct ID
     */
    override fun realtimeLogConfigName(): String? = unwrap(this).getRealtimeLogConfigName()

    /**
     * The sampling rate for this real-time log configuration.
     */
    override fun samplingRate(): Number = unwrap(this).getSamplingRate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RealtimeLogConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps):
        RealtimeLogConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RealtimeLogConfigProps):
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps
  }
}
