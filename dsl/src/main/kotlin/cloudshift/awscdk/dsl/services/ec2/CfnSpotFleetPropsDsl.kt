@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import software.amazon.awscdk.services.ec2.CfnSpotFleetProps

@CdkDslMarker
public class CfnSpotFleetPropsDsl {
  private val cdkBuilder: CfnSpotFleetProps.Builder = CfnSpotFleetProps.builder()

  public fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable) {
    cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData)
  }

  public
      fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty) {
    cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData)
  }

  public fun build(): CfnSpotFleetProps = cdkBuilder.build()
}
