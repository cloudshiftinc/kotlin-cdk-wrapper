@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@CdkDslMarker
public class CfnListenerRuleQueryStringKeyValuePropertyDsl {
  private val cdkBuilder: CfnListenerRule.QueryStringKeyValueProperty.Builder =
      CfnListenerRule.QueryStringKeyValueProperty.builder()

  /**
   * @param key The key.
   * You can omit the key.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnListenerRule.QueryStringKeyValueProperty = cdkBuilder.build()
}
