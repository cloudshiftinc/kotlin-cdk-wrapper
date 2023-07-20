@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.CfnWebACL

@CdkDslMarker
public class CfnWebACLWafActionPropertyDsl {
  private val cdkBuilder: CfnWebACL.WafActionProperty.Builder =
      CfnWebACL.WafActionProperty.builder()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnWebACL.WafActionProperty = cdkBuilder.build()
}
