package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRealtimeLogConfigProps {
  /**
   * Contains information about the Amazon Kinesis data stream where you are sending real-time log
   * data for this real-time log configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-endpoints)
   */
  public fun endPoints(): Any

  /**
   * A list of fields that are included in each real-time log record.
   *
   * In an API response, the fields are provided in the same order in which they are sent to the
   * Amazon Kinesis data stream.
   *
   * For more information about fields, see [Real-time log configuration
   * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-fields)
   */
  public fun fields(): List<String>

  /**
   * The unique name of this real-time log configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-name)
   */
  public fun name(): String

  /**
   * The sampling rate for this real-time log configuration.
   *
   * The sampling rate determines the percentage of viewer requests that are represented in the
   * real-time log data. The sampling rate is an integer between 1 and 100, inclusive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-samplingrate)
   */
  public fun samplingRate(): Number

  /**
   * A builder for [CfnRealtimeLogConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(endPoints: IResolvable)

    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(endPoints: List<Any>)

    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(vararg endPoints: Any)

    /**
     * @param fields A list of fields that are included in each real-time log record. 
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun fields(fields: List<String>)

    /**
     * @param fields A list of fields that are included in each real-time log record. 
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun fields(vararg fields: String)

    /**
     * @param name The unique name of this real-time log configuration. 
     */
    public fun name(name: String)

    /**
     * @param samplingRate The sampling rate for this real-time log configuration. 
     * The sampling rate determines the percentage of viewer requests that are represented in the
     * real-time log data. The sampling rate is an integer between 1 and 100, inclusive.
     */
    public fun samplingRate(samplingRate: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps.builder()

    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(endPoints: IResolvable) {
      cdkBuilder.endPoints(endPoints.let(IResolvable::unwrap))
    }

    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(endPoints: List<Any>) {
      cdkBuilder.endPoints(endPoints)
    }

    /**
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(vararg endPoints: Any): Unit = endPoints(endPoints.toList())

    /**
     * @param fields A list of fields that are included in each real-time log record. 
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     */
    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    /**
     * @param fields A list of fields that are included in each real-time log record. 
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     */
    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    /**
     * @param name The unique name of this real-time log configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param samplingRate The sampling rate for this real-time log configuration. 
     * The sampling rate determines the percentage of viewer requests that are represented in the
     * real-time log data. The sampling rate is an integer between 1 and 100, inclusive.
     */
    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps,
  ) : CdkObject(cdkObject), CfnRealtimeLogConfigProps {
    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-endpoints)
     */
    override fun endPoints(): Any = unwrap(this).getEndPoints()

    /**
     * A list of fields that are included in each real-time log record.
     *
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-fields)
     */
    override fun fields(): List<String> = unwrap(this).getFields()

    /**
     * The unique name of this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The sampling rate for this real-time log configuration.
     *
     * The sampling rate determines the percentage of viewer requests that are represented in the
     * real-time log data. The sampling rate is an integer between 1 and 100, inclusive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-samplingrate)
     */
    override fun samplingRate(): Number = unwrap(this).getSamplingRate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRealtimeLogConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps):
        CfnRealtimeLogConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRealtimeLogConfigProps):
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps
  }
}
