@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationFleetAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationFleetAssociation.Builder =
      CfnApplicationFleetAssociation.Builder.create(scope, id)

  public fun applicationArn(applicationArn: String) {
    cdkBuilder.applicationArn(applicationArn)
  }

  public fun fleetName(fleetName: String) {
    cdkBuilder.fleetName(fleetName)
  }

  public fun build(): CfnApplicationFleetAssociation = cdkBuilder.build()
}
