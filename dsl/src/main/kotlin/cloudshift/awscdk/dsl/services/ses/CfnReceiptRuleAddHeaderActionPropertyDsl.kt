@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

@CdkDslMarker
public class CfnReceiptRuleAddHeaderActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.AddHeaderActionProperty.Builder =
      CfnReceiptRule.AddHeaderActionProperty.builder()

  public fun headerName(headerName: String) {
    cdkBuilder.headerName(headerName)
  }

  public fun headerValue(headerValue: String) {
    cdkBuilder.headerValue(headerValue)
  }

  public fun build(): CfnReceiptRule.AddHeaderActionProperty = cdkBuilder.build()
}
