@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLDefaultActionPropertyDsl {
  private val cdkBuilder: CfnWebACL.DefaultActionProperty.Builder =
      CfnWebACL.DefaultActionProperty.builder()

  public fun allow(allow: IResolvable) {
    cdkBuilder.allow(allow)
  }

  public fun allow(allow: CfnWebACL.AllowActionProperty) {
    cdkBuilder.allow(allow)
  }

  public fun block(block: IResolvable) {
    cdkBuilder.block(block)
  }

  public fun block(block: CfnWebACL.BlockActionProperty) {
    cdkBuilder.block(block)
  }

  public fun build(): CfnWebACL.DefaultActionProperty = cdkBuilder.build()
}
