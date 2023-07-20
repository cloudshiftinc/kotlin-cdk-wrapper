@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnStackFleetAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStackFleetAssociation.Builder =
      CfnStackFleetAssociation.Builder.create(scope, id)

  public fun fleetName(fleetName: String) {
    cdkBuilder.fleetName(fleetName)
  }

  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  public fun build(): CfnStackFleetAssociation = cdkBuilder.build()
}
