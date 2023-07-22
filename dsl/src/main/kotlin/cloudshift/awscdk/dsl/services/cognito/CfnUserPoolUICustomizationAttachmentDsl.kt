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

  /**
   * The client ID for the client app.
   *
   * You can specify the UI customization settings for a single client (with a specific clientId) or
   * for all clients (by setting the clientId to `ALL` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-clientid)
   * @param clientId The client ID for the client app. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * The CSS values in the UI customization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-css)
   * @param css The CSS values in the UI customization. 
   */
  public fun css(css: String) {
    cdkBuilder.css(css)
  }

  /**
   * The user pool ID for the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-userpoolid)
   * @param userPoolId The user pool ID for the user pool. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolUICustomizationAttachment = cdkBuilder.build()
}
