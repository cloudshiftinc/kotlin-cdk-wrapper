@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.signer.CfnProfilePermission
import software.constructs.Construct

@CdkDslMarker
public class CfnProfilePermissionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProfilePermission.Builder = CfnProfilePermission.Builder.create(scope,
      id)

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun profileName(profileName: String) {
    cdkBuilder.profileName(profileName)
  }

  public fun profileVersion(profileVersion: String) {
    cdkBuilder.profileVersion(profileVersion)
  }

  public fun statementId(statementId: String) {
    cdkBuilder.statementId(statementId)
  }

  public fun build(): CfnProfilePermission = cdkBuilder.build()
}
