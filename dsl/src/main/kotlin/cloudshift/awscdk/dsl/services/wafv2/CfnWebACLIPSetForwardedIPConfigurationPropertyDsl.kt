@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLIPSetForwardedIPConfigurationPropertyDsl {
  private val cdkBuilder: CfnWebACL.IPSetForwardedIPConfigurationProperty.Builder =
      CfnWebACL.IPSetForwardedIPConfigurationProperty.builder()

  public fun fallbackBehavior(fallbackBehavior: String) {
    cdkBuilder.fallbackBehavior(fallbackBehavior)
  }

  public fun headerName(headerName: String) {
    cdkBuilder.headerName(headerName)
  }

  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  public fun build(): CfnWebACL.IPSetForwardedIPConfigurationProperty = cdkBuilder.build()
}
