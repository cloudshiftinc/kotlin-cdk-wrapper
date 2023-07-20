@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnUserPoolUserToGroupAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUserPoolUserToGroupAttachment.Builder =
      CfnUserPoolUserToGroupAttachment.Builder.create(scope, id)

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnUserPoolUserToGroupAttachment = cdkBuilder.build()
}
