@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps

@CdkDslMarker
public class CfnApplicationFleetAssociationPropsDsl {
  private val cdkBuilder: CfnApplicationFleetAssociationProps.Builder =
      CfnApplicationFleetAssociationProps.builder()

  public fun applicationArn(applicationArn: String) {
    cdkBuilder.applicationArn(applicationArn)
  }

  public fun fleetName(fleetName: String) {
    cdkBuilder.fleetName(fleetName)
  }

  public fun build(): CfnApplicationFleetAssociationProps = cdkBuilder.build()
}
