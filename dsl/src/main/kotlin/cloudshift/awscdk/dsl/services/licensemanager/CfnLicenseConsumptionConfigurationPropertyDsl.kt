@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense

@CdkDslMarker
public class CfnLicenseConsumptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnLicense.ConsumptionConfigurationProperty.Builder =
      CfnLicense.ConsumptionConfigurationProperty.builder()

  public fun borrowConfiguration(borrowConfiguration: IResolvable) {
    cdkBuilder.borrowConfiguration(borrowConfiguration)
  }

  public fun borrowConfiguration(borrowConfiguration: CfnLicense.BorrowConfigurationProperty) {
    cdkBuilder.borrowConfiguration(borrowConfiguration)
  }

  public fun provisionalConfiguration(provisionalConfiguration: IResolvable) {
    cdkBuilder.provisionalConfiguration(provisionalConfiguration)
  }

  public
      fun provisionalConfiguration(provisionalConfiguration: CfnLicense.ProvisionalConfigurationProperty) {
    cdkBuilder.provisionalConfiguration(provisionalConfiguration)
  }

  public fun renewType(renewType: String) {
    cdkBuilder.renewType(renewType)
  }

  public fun build(): CfnLicense.ConsumptionConfigurationProperty = cdkBuilder.build()
}
