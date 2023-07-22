@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition

/**
 * Properties for the key/value pair of the query string.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * QueryStringCondition queryStringCondition = QueryStringCondition.builder()
 * .value("value")
 * // the properties below are optional
 * .key("key")
 * .build();
 * ```
 */
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
