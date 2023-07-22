@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateInstanceMarketOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.InstanceMarketOptionsProperty.Builder =
      CfnLaunchTemplate.InstanceMarketOptionsProperty.builder()

  /**
   * @param marketType The market type.
   */
  public fun marketType(marketType: String) {
    cdkBuilder.marketType(marketType)
  }

  /**
   * @param spotOptions The options for Spot Instances.
   */
  public fun spotOptions(spotOptions: IResolvable) {
    cdkBuilder.spotOptions(spotOptions)
  }

  /**
   * @param spotOptions The options for Spot Instances.
   */
  public fun spotOptions(spotOptions: CfnLaunchTemplate.SpotOptionsProperty) {
    cdkBuilder.spotOptions(spotOptions)
  }

  public fun build(): CfnLaunchTemplate.InstanceMarketOptionsProperty = cdkBuilder.build()
}
