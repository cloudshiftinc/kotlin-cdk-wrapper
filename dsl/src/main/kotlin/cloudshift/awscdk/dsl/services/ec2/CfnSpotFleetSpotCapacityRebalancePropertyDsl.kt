@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetSpotCapacityRebalancePropertyDsl {
  private val cdkBuilder: CfnSpotFleet.SpotCapacityRebalanceProperty.Builder =
      CfnSpotFleet.SpotCapacityRebalanceProperty.builder()

  public fun replacementStrategy(replacementStrategy: String) {
    cdkBuilder.replacementStrategy(replacementStrategy)
  }

  public fun terminationDelay(terminationDelay: Number) {
    cdkBuilder.terminationDelay(terminationDelay)
  }

  public fun build(): CfnSpotFleet.SpotCapacityRebalanceProperty = cdkBuilder.build()
}
