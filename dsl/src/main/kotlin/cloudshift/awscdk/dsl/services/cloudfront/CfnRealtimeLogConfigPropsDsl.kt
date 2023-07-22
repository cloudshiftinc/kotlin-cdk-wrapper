@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps

@CdkDslMarker
public class CfnRealtimeLogConfigPropsDsl {
  private val cdkBuilder: CfnRealtimeLogConfigProps.Builder = CfnRealtimeLogConfigProps.builder()

  private val _endPoints: MutableList<Any> = mutableListOf()

  private val _fields: MutableList<String> = mutableListOf()

  /**
   * @param endPoints Contains information about the Amazon Kinesis data stream where you are
   * sending real-time log data for this real-time log configuration. 
   */
  public fun endPoints(vararg endPoints: Any) {
    _endPoints.addAll(listOf(*endPoints))
  }

  /**
   * @param endPoints Contains information about the Amazon Kinesis data stream where you are
   * sending real-time log data for this real-time log configuration. 
   */
  public fun endPoints(endPoints: Collection<Any>) {
    _endPoints.addAll(endPoints)
  }

  /**
   * @param endPoints Contains information about the Amazon Kinesis data stream where you are
   * sending real-time log data for this real-time log configuration. 
   */
  public fun endPoints(endPoints: IResolvable) {
    cdkBuilder.endPoints(endPoints)
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
  public fun fields(vararg fields: String) {
    _fields.addAll(listOf(*fields))
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
  public fun fields(fields: Collection<String>) {
    _fields.addAll(fields)
  }

  /**
   * @param name The unique name of this real-time log configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param samplingRate The sampling rate for this real-time log configuration. 
   * The sampling rate determines the percentage of viewer requests that are represented in the
   * real-time log data. The sampling rate is an integer between 1 and 100, inclusive.
   */
  public fun samplingRate(samplingRate: Number) {
    cdkBuilder.samplingRate(samplingRate)
  }

  public fun build(): CfnRealtimeLogConfigProps {
    if(_endPoints.isNotEmpty()) cdkBuilder.endPoints(_endPoints)
    if(_fields.isNotEmpty()) cdkBuilder.fields(_fields)
    return cdkBuilder.build()
  }
}
