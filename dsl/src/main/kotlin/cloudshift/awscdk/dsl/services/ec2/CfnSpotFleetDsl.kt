@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import software.constructs.Construct

@CdkDslMarker
public class CfnSpotFleetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSpotFleet.Builder = CfnSpotFleet.Builder.create(scope, id)

  public fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable) {
    cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData)
  }

  public
      fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty) {
    cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData)
  }

  public fun build(): CfnSpotFleet = cdkBuilder.build()
}
