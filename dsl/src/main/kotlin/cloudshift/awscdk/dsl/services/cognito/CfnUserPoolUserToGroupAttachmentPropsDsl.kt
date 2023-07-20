@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps

@CdkDslMarker
public class CfnUserPoolUserToGroupAttachmentPropsDsl {
  private val cdkBuilder: CfnUserPoolUserToGroupAttachmentProps.Builder =
      CfnUserPoolUserToGroupAttachmentProps.builder()

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnUserPoolUserToGroupAttachmentProps = cdkBuilder.build()
}
