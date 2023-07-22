@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense

@CdkDslMarker
public class CfnLicenseBorrowConfigurationPropertyDsl {
  private val cdkBuilder: CfnLicense.BorrowConfigurationProperty.Builder =
      CfnLicense.BorrowConfigurationProperty.builder()

  /**
   * @param allowEarlyCheckIn Indicates whether early check-ins are allowed. 
   */
  public fun allowEarlyCheckIn(allowEarlyCheckIn: Boolean) {
    cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn)
  }

  /**
   * @param allowEarlyCheckIn Indicates whether early check-ins are allowed. 
   */
  public fun allowEarlyCheckIn(allowEarlyCheckIn: IResolvable) {
    cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn)
  }

  /**
   * @param maxTimeToLiveInMinutes Maximum time for the borrow configuration, in minutes. 
   */
  public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
    cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
  }

  public fun build(): CfnLicense.BorrowConfigurationProperty = cdkBuilder.build()
}
