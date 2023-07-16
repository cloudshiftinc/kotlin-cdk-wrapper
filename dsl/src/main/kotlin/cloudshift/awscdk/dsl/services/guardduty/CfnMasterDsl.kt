@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.guardduty.CfnMaster
import software.constructs.Construct

@CdkDslMarker
public class CfnMasterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMaster.Builder = CfnMaster.Builder.create(scope, id)

  public fun detectorId(detectorId: String) {
    cdkBuilder.detectorId(detectorId)
  }

  public fun invitationId(invitationId: String) {
    cdkBuilder.invitationId(invitationId)
  }

  public fun masterId(masterId: String) {
    cdkBuilder.masterId(masterId)
  }

  public fun build(): CfnMaster = cdkBuilder.build()
}
