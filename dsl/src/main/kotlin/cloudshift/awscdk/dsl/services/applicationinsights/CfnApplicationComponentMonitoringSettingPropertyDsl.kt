@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationComponentMonitoringSettingPropertyDsl {
  private val cdkBuilder: CfnApplication.ComponentMonitoringSettingProperty.Builder =
      CfnApplication.ComponentMonitoringSettingProperty.builder()

  public fun componentArn(componentArn: String) {
    cdkBuilder.componentArn(componentArn)
  }

  public fun componentConfigurationMode(componentConfigurationMode: String) {
    cdkBuilder.componentConfigurationMode(componentConfigurationMode)
  }

  public fun componentName(componentName: String) {
    cdkBuilder.componentName(componentName)
  }

  public fun customComponentConfiguration(customComponentConfiguration: IResolvable) {
    cdkBuilder.customComponentConfiguration(customComponentConfiguration)
  }

  public
      fun customComponentConfiguration(customComponentConfiguration: CfnApplication.ComponentConfigurationProperty) {
    cdkBuilder.customComponentConfiguration(customComponentConfiguration)
  }

  public
      fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: IResolvable) {
    cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration)
  }

  public
      fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: CfnApplication.ComponentConfigurationProperty) {
    cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration)
  }

  public fun tier(tier: String) {
    cdkBuilder.tier(tier)
  }

  public fun build(): CfnApplication.ComponentMonitoringSettingProperty = cdkBuilder.build()
}
