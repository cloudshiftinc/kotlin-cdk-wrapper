@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.RedirectProtocol
import software.amazon.awscdk.services.s3.ReplaceKey
import software.amazon.awscdk.services.s3.RoutingRule
import software.amazon.awscdk.services.s3.RoutingRuleCondition

@CdkDslMarker
public class RoutingRuleDsl {
  private val cdkBuilder: RoutingRule.Builder = RoutingRule.builder()

  public fun condition(block: RoutingRuleConditionDsl.() -> Unit = {}) {
    val builder = RoutingRuleConditionDsl()
    builder.apply(block)
    cdkBuilder.condition(builder.build())
  }

  public fun condition(condition: RoutingRuleCondition) {
    cdkBuilder.condition(condition)
  }

  public fun hostName(hostName: String) {
    cdkBuilder.hostName(hostName)
  }

  public fun httpRedirectCode(httpRedirectCode: String) {
    cdkBuilder.httpRedirectCode(httpRedirectCode)
  }

  public fun protocol(protocol: RedirectProtocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun replaceKey(replaceKey: ReplaceKey) {
    cdkBuilder.replaceKey(replaceKey)
  }

  public fun build(): RoutingRule = cdkBuilder.build()
}
