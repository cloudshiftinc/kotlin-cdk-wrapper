@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnUserPoolUICustomizationAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUserPoolUICustomizationAttachment.Builder =
      CfnUserPoolUICustomizationAttachment.Builder.create(scope, id)

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun css(css: String) {
    cdkBuilder.css(css)
  }

  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolUICustomizationAttachment = cdkBuilder.build()
}
