@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.AddHeaderActionConfig

@CdkDslMarker
public class AddHeaderActionConfigDsl {
  private val cdkBuilder: AddHeaderActionConfig.Builder = AddHeaderActionConfig.builder()

  /**
   * @param headerName The name of the header that you want to add to the incoming message. 
   */
  public fun headerName(headerName: String) {
    cdkBuilder.headerName(headerName)
  }

  /**
   * @param headerValue The content that you want to include in the header. 
   */
  public fun headerValue(headerValue: String) {
    cdkBuilder.headerValue(headerValue)
  }

  public fun build(): AddHeaderActionConfig = cdkBuilder.build()
}
