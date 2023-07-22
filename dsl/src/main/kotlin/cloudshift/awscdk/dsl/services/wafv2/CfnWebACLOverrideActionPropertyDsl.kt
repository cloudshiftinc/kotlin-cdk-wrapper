@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLOverrideActionPropertyDsl {
  private val cdkBuilder: CfnWebACL.OverrideActionProperty.Builder =
      CfnWebACL.OverrideActionProperty.builder()

  /**
   * @param count Override the rule group evaluation result to count only.
   *
   * This option is usually set to none. It does not affect how the rules in the rule group are
   * evaluated. If you want the rules in the rule group to only count matches, do not use this and
   * instead use the rule action override option, with `Count` action, in your rule group reference
   * statement settings.
   */
  public fun count(count: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(count)
    cdkBuilder.count(builder.map)
  }

  /**
   * @param count Override the rule group evaluation result to count only.
   *
   * This option is usually set to none. It does not affect how the rules in the rule group are
   * evaluated. If you want the rules in the rule group to only count matches, do not use this and
   * instead use the rule action override option, with `Count` action, in your rule group reference
   * statement settings.
   */
  public fun count(count: Any) {
    cdkBuilder.count(count)
  }

  /**
   * @param none Don't override the rule group evaluation result.
   * This is the most common setting.
   */
  public fun none(none: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(none)
    cdkBuilder.none(builder.map)
  }

  /**
   * @param none Don't override the rule group evaluation result.
   * This is the most common setting.
   */
  public fun none(none: Any) {
    cdkBuilder.none(none)
  }

  public fun build(): CfnWebACL.OverrideActionProperty = cdkBuilder.build()
}
