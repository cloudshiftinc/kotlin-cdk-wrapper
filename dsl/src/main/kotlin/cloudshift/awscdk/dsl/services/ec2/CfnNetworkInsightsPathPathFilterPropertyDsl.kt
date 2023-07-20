@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath

@CdkDslMarker
public class CfnNetworkInsightsPathPathFilterPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsPath.PathFilterProperty.Builder =
      CfnNetworkInsightsPath.PathFilterProperty.builder()

  public fun destinationAddress(destinationAddress: String) {
    cdkBuilder.destinationAddress(destinationAddress)
  }

  public fun destinationPortRange(destinationPortRange: IResolvable) {
    cdkBuilder.destinationPortRange(destinationPortRange)
  }

  public
      fun destinationPortRange(destinationPortRange: CfnNetworkInsightsPath.FilterPortRangeProperty) {
    cdkBuilder.destinationPortRange(destinationPortRange)
  }

  public fun sourceAddress(sourceAddress: String) {
    cdkBuilder.sourceAddress(sourceAddress)
  }

  public fun sourcePortRange(sourcePortRange: IResolvable) {
    cdkBuilder.sourcePortRange(sourcePortRange)
  }

  public fun sourcePortRange(sourcePortRange: CfnNetworkInsightsPath.FilterPortRangeProperty) {
    cdkBuilder.sourcePortRange(sourcePortRange)
  }

  public fun build(): CfnNetworkInsightsPath.PathFilterProperty = cdkBuilder.build()
}
