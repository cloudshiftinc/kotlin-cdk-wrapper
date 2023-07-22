@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Send data to an HTTPS endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * HttpActionProperty httpActionProperty = HttpActionProperty.builder()
 * .url("url")
 * // the properties below are optional
 * .auth(HttpAuthorizationProperty.builder()
 * .sigv4(SigV4AuthorizationProperty.builder()
 * .roleArn("roleArn")
 * .serviceName("serviceName")
 * .signingRegion("signingRegion")
 * .build())
 * .build())
 * .confirmationUrl("confirmationUrl")
 * .headers(List.of(HttpActionHeaderProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleHttpActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.HttpActionProperty.Builder =
      CfnTopicRule.HttpActionProperty.builder()

  private val _headers: MutableList<Any> = mutableListOf()

  /**
   * @param auth The authentication method to use when sending data to an HTTPS endpoint.
   */
  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  /**
   * @param auth The authentication method to use when sending data to an HTTPS endpoint.
   */
  public fun auth(auth: CfnTopicRule.HttpAuthorizationProperty) {
    cdkBuilder.auth(auth)
  }

  /**
   * @param confirmationUrl The URL to which AWS IoT sends a confirmation message.
   * The value of the confirmation URL must be a prefix of the endpoint URL. If you do not specify a
   * confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If you use substitution
   * templates in the confirmationUrl, you must create and enable topic rule destinations that match
   * each possible value of the substitution template before traffic is allowed to your endpoint URL.
   */
  public fun confirmationUrl(confirmationUrl: String) {
    cdkBuilder.confirmationUrl(confirmationUrl)
  }

  /**
   * @param headers The HTTP headers to send with the message data.
   */
  public fun headers(vararg headers: Any) {
    _headers.addAll(listOf(*headers))
  }

  /**
   * @param headers The HTTP headers to send with the message data.
   */
  public fun headers(headers: Collection<Any>) {
    _headers.addAll(headers)
  }

  /**
   * @param headers The HTTP headers to send with the message data.
   */
  public fun headers(headers: IResolvable) {
    cdkBuilder.headers(headers)
  }

  /**
   * @param url The endpoint URL. 
   * If substitution templates are used in the URL, you must also specify a `confirmationUrl` . If
   * this is a new destination, a new `TopicRuleDestination` is created if possible.
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnTopicRule.HttpActionProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    return cdkBuilder.build()
  }
}
