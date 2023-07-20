@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.RoutingRuleCondition

@CdkDslMarker
public class RoutingRuleConditionDsl {
  private val cdkBuilder: RoutingRuleCondition.Builder = RoutingRuleCondition.builder()

  public fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
    cdkBuilder.httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals)
  }

  public fun keyPrefixEquals(keyPrefixEquals: String) {
    cdkBuilder.keyPrefixEquals(keyPrefixEquals)
  }

  public fun build(): RoutingRuleCondition = cdkBuilder.build()
}
