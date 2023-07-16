@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps

@CdkDslMarker
public class CfnUserPoolUICustomizationAttachmentPropsDsl {
  private val cdkBuilder: CfnUserPoolUICustomizationAttachmentProps.Builder =
      CfnUserPoolUICustomizationAttachmentProps.builder()

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun css(css: String) {
    cdkBuilder.css(css)
  }

  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolUICustomizationAttachmentProps = cdkBuilder.build()
}
