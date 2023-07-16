@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLBodyPropertyDsl {
  private val cdkBuilder: CfnWebACL.BodyProperty.Builder = CfnWebACL.BodyProperty.builder()

  public fun oversizeHandling(oversizeHandling: String) {
    cdkBuilder.oversizeHandling(oversizeHandling)
  }

  public fun build(): CfnWebACL.BodyProperty = cdkBuilder.build()
}
