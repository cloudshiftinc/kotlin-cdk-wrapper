@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition

@CdkDslMarker
public class QueryStringConditionDsl {
  private val cdkBuilder: QueryStringCondition.Builder = QueryStringCondition.builder()

  /**
   * @param key The query string key for the condition.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The query string value for the condition. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): QueryStringCondition = cdkBuilder.build()
}
