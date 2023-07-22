@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLSingleHeaderPropertyDsl {
  private val cdkBuilder: CfnWebACL.SingleHeaderProperty.Builder =
      CfnWebACL.SingleHeaderProperty.builder()

  /**
   * @param name The name of the query header to inspect. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnWebACL.SingleHeaderProperty = cdkBuilder.build()
}
