@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLDefaultActionPropertyDsl {
  private val cdkBuilder: CfnWebACL.DefaultActionProperty.Builder =
      CfnWebACL.DefaultActionProperty.builder()

  /**
   * @param allow Specifies that AWS WAF should allow requests by default.
   */
  public fun allow(allow: IResolvable) {
    cdkBuilder.allow(allow)
  }

  /**
   * @param allow Specifies that AWS WAF should allow requests by default.
   */
  public fun allow(allow: CfnWebACL.AllowActionProperty) {
    cdkBuilder.allow(allow)
  }

  /**
   * @param block Specifies that AWS WAF should block requests by default.
   */
  public fun block(block: IResolvable) {
    cdkBuilder.block(block)
  }

  /**
   * @param block Specifies that AWS WAF should block requests by default.
   */
  public fun block(block: CfnWebACL.BlockActionProperty) {
    cdkBuilder.block(block)
  }

  public fun build(): CfnWebACL.DefaultActionProperty = cdkBuilder.build()
}
