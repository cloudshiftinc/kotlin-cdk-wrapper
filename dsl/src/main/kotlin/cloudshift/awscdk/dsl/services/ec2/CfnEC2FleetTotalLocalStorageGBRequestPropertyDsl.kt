@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetTotalLocalStorageGBRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.TotalLocalStorageGBRequestProperty.Builder =
      CfnEC2Fleet.TotalLocalStorageGBRequestProperty.builder()

  /**
   * @param max The maximum amount of total local storage, in GB.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum amount of total local storage, in GB.
   * To specify no minimum limit, omit this parameter.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnEC2Fleet.TotalLocalStorageGBRequestProperty = cdkBuilder.build()
}
