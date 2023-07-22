@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLSingleQueryArgumentPropertyDsl {
  private val cdkBuilder: CfnWebACL.SingleQueryArgumentProperty.Builder =
      CfnWebACL.SingleQueryArgumentProperty.builder()

  /**
   * @param name The name of the query argument to inspect. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnWebACL.SingleQueryArgumentProperty = cdkBuilder.build()
}
