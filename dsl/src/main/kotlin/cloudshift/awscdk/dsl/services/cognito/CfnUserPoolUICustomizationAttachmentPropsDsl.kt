@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps

@CdkDslMarker
public class CfnUserPoolUICustomizationAttachmentPropsDsl {
  private val cdkBuilder: CfnUserPoolUICustomizationAttachmentProps.Builder =
      CfnUserPoolUICustomizationAttachmentProps.builder()

  /**
   * @param clientId The client ID for the client app. 
   * You can specify the UI customization settings for a single client (with a specific clientId) or
   * for all clients (by setting the clientId to `ALL` ).
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param css The CSS values in the UI customization.
   */
  public fun css(css: String) {
    cdkBuilder.css(css)
  }

  /**
   * @param userPoolId The user pool ID for the user pool. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolUICustomizationAttachmentProps = cdkBuilder.build()
}
