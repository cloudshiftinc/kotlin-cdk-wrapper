@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupAllowPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.AllowProperty.Builder = CfnRuleGroup.AllowProperty.builder()

  /**
   * @param customRequestHandling Custom request handling.
   */
  public fun customRequestHandling(customRequestHandling: IResolvable) {
    cdkBuilder.customRequestHandling(customRequestHandling)
  }

  /**
   * @param customRequestHandling Custom request handling.
   */
  public
      fun customRequestHandling(customRequestHandling: CfnRuleGroup.CustomRequestHandlingProperty) {
    cdkBuilder.customRequestHandling(customRequestHandling)
  }

  public fun build(): CfnRuleGroup.AllowProperty = cdkBuilder.build()
}
