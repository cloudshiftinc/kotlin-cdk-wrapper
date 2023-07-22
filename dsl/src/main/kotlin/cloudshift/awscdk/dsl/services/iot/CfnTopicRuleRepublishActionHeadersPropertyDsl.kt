@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleRepublishActionHeadersPropertyDsl {
  private val cdkBuilder: CfnTopicRule.RepublishActionHeadersProperty.Builder =
      CfnTopicRule.RepublishActionHeadersProperty.builder()

  private val _userProperties: MutableList<Any> = mutableListOf()

  /**
   * @param contentType A UTF-8 encoded string that describes the content of the publishing message.
   * For more information, see [Content
   * Type](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118)
   * in the MQTT Version 5.0 specification.
   *
   * Supports [substitution
   * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
   * .
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param correlationData The base64-encoded binary data used by the sender of the request message
   * to identify which request the response message is for.
   * For more information, see [Correlation
   * Data](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115)
   * in the MQTT Version 5.0 specification.
   *
   * Supports [substitution
   * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
   * .
   *
   *
   * This binary data must be base64-encoded.
   */
  public fun correlationData(correlationData: String) {
    cdkBuilder.correlationData(correlationData)
  }

  /**
   * @param messageExpiry A user-defined integer value that represents the message expiry interval
   * at the broker.
   * If the messages haven't been sent to the subscribers within that interval, the message expires
   * and is removed. The value of `messageExpiry` represents the number of seconds before it expires.
   * For more information about the limits of `messageExpiry` , see [Message broker and protocol limits
   * and quotas](https://docs.aws.amazon.com//general/latest/gr/iot-core.html#limits_iot) in the IoT
   * Core Reference Guide.
   *
   * Supports [substitution
   * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
   * .
   */
  public fun messageExpiry(messageExpiry: String) {
    cdkBuilder.messageExpiry(messageExpiry)
  }

  /**
   * @param payloadFormatIndicator An `Enum` string value that indicates whether the payload is
   * formatted as UTF-8.
   * Valid values are `UNSPECIFIED_BYTES` and `UTF8_DATA` .
   *
   * For more information, see [Payload Format
   * Indicator](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111)
   * from the MQTT Version 5.0 specification.
   *
   * Supports [substitution
   * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
   * .
   */
  public fun payloadFormatIndicator(payloadFormatIndicator: String) {
    cdkBuilder.payloadFormatIndicator(payloadFormatIndicator)
  }

  /**
   * @param responseTopic A UTF-8 encoded string that's used as the topic name for a response
   * message.
   * The response topic is used to describe the topic to which the receiver should publish as part
   * of the request-response flow. The topic must not contain wildcard characters.
   *
   * For more information, see [Response
   * Topic](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114)
   * in the MQTT Version 5.0 specification.
   *
   * Supports [substitution
   * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
   * .
   */
  public fun responseTopic(responseTopic: String) {
    cdkBuilder.responseTopic(responseTopic)
  }

  /**
   * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
   */
  public fun userProperties(vararg userProperties: Any) {
    _userProperties.addAll(listOf(*userProperties))
  }

  /**
   * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
   */
  public fun userProperties(userProperties: Collection<Any>) {
    _userProperties.addAll(userProperties)
  }

  /**
   * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
   */
  public fun userProperties(userProperties: IResolvable) {
    cdkBuilder.userProperties(userProperties)
  }

  public fun build(): CfnTopicRule.RepublishActionHeadersProperty {
    if(_userProperties.isNotEmpty()) cdkBuilder.userProperties(_userProperties)
    return cdkBuilder.build()
  }
}
