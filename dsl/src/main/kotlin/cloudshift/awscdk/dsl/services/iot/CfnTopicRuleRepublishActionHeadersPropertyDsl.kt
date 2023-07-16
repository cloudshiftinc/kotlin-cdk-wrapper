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

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun correlationData(correlationData: String) {
    cdkBuilder.correlationData(correlationData)
  }

  public fun messageExpiry(messageExpiry: String) {
    cdkBuilder.messageExpiry(messageExpiry)
  }

  public fun payloadFormatIndicator(payloadFormatIndicator: String) {
    cdkBuilder.payloadFormatIndicator(payloadFormatIndicator)
  }

  public fun responseTopic(responseTopic: String) {
    cdkBuilder.responseTopic(responseTopic)
  }

  public fun userProperties(vararg userProperties: Any) {
    _userProperties.addAll(listOf(*userProperties))
  }

  public fun userProperties(userProperties: Collection<Any>) {
    _userProperties.addAll(userProperties)
  }

  public fun userProperties(userProperties: IResolvable) {
    cdkBuilder.userProperties(userProperties)
  }

  public fun build(): CfnTopicRule.RepublishActionHeadersProperty {
    if(_userProperties.isNotEmpty()) cdkBuilder.userProperties(_userProperties)
    return cdkBuilder.build()
  }
}
