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
public class CfnTopicRuleHttpActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.HttpActionProperty.Builder =
      CfnTopicRule.HttpActionProperty.builder()

  private val _headers: MutableList<Any> = mutableListOf()

  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  public fun auth(auth: CfnTopicRule.HttpAuthorizationProperty) {
    cdkBuilder.auth(auth)
  }

  public fun confirmationUrl(confirmationUrl: String) {
    cdkBuilder.confirmationUrl(confirmationUrl)
  }

  public fun headers(vararg headers: Any) {
    _headers.addAll(listOf(*headers))
  }

  public fun headers(headers: Collection<Any>) {
    _headers.addAll(headers)
  }

  public fun headers(headers: IResolvable) {
    cdkBuilder.headers(headers)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnTopicRule.HttpActionProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    return cdkBuilder.build()
  }
}
