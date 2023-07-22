@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.RoutingRuleCondition

@CdkDslMarker
public class RoutingRuleConditionDsl {
  private val cdkBuilder: RoutingRuleCondition.Builder = RoutingRuleCondition.builder()

  /**
   * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
   * In the event of an error, if the error code equals this value, then the specified redirect is
   * applied.
   *
   * If both condition properties are specified, both must be true for the redirect to be applied.
   */
  public fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
    cdkBuilder.httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals)
  }

  /**
   * @param keyPrefixEquals The object key name prefix when the redirect is applied.
   * If both condition properties are specified, both must be true for the redirect to be applied.
   */
  public fun keyPrefixEquals(keyPrefixEquals: String) {
    cdkBuilder.keyPrefixEquals(keyPrefixEquals)
  }

  public fun build(): RoutingRuleCondition = cdkBuilder.build()
}
