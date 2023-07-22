@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

@CdkDslMarker
public class CfnReceiptRuleAddHeaderActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.AddHeaderActionProperty.Builder =
      CfnReceiptRule.AddHeaderActionProperty.builder()

  /**
   * @param headerName The name of the header to add to the incoming message. 
   * The name must contain at least one character, and can contain up to 50 characters. It consists
   * of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
   */
  public fun headerName(headerName: String) {
    cdkBuilder.headerName(headerName)
  }

  /**
   * @param headerValue The content to include in the header. 
   * This value can contain up to 2048 characters. It can't contain newline ( `\n` ) or carriage
   * return ( `\r` ) characters.
   */
  public fun headerValue(headerValue: String) {
    cdkBuilder.headerValue(headerValue)
  }

  public fun build(): CfnReceiptRule.AddHeaderActionProperty = cdkBuilder.build()
}
