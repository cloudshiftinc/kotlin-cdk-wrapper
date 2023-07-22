@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps

@CdkDslMarker
public class CfnUserPoolUserToGroupAttachmentPropsDsl {
  private val cdkBuilder: CfnUserPoolUserToGroupAttachmentProps.Builder =
      CfnUserPoolUserToGroupAttachmentProps.builder()

  /**
   * @param groupName The group name. 
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * @param userPoolId The user pool ID for the user pool. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  /**
   * @param username The username for the user. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnUserPoolUserToGroupAttachmentProps = cdkBuilder.build()
}
