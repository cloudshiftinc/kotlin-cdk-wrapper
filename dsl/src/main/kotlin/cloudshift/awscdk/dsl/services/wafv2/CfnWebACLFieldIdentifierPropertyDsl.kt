@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLFieldIdentifierPropertyDsl {
  private val cdkBuilder: CfnWebACL.FieldIdentifierProperty.Builder =
      CfnWebACL.FieldIdentifierProperty.builder()

  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun build(): CfnWebACL.FieldIdentifierProperty = cdkBuilder.build()
}
