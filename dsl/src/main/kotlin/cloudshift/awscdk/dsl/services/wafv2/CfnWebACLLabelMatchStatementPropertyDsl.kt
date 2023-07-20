@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLLabelMatchStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.LabelMatchStatementProperty.Builder =
      CfnWebACL.LabelMatchStatementProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun build(): CfnWebACL.LabelMatchStatementProperty = cdkBuilder.build()
}
