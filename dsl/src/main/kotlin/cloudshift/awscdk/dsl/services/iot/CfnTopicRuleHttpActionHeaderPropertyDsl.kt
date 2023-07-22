@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleHttpActionHeaderPropertyDsl {
  private val cdkBuilder: CfnTopicRule.HttpActionHeaderProperty.Builder =
      CfnTopicRule.HttpActionHeaderProperty.builder()

  /**
   * @param key The HTTP header key. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The HTTP header value. 
   * Substitution templates are supported.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTopicRule.HttpActionHeaderProperty = cdkBuilder.build()
}
