@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleTagPropertyDsl {
  private val cdkBuilder: CfnRule.TagProperty.Builder = CfnRule.TagProperty.builder()

  /**
   * @param key A string you can use to assign a value.
   * The combination of tag keys and values can help you organize and categorize your resources.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value for the specified tag key.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRule.TagProperty = cdkBuilder.build()
}
