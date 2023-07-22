@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetLateDataRuleConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataset.LateDataRuleConfigurationProperty.Builder =
      CfnDataset.LateDataRuleConfigurationProperty.builder()

  /**
   * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
   * session window.
   */
  public fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: IResolvable) {
    cdkBuilder.deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration)
  }

  /**
   * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
   * session window.
   */
  public
      fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: CfnDataset.DeltaTimeSessionWindowConfigurationProperty) {
    cdkBuilder.deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration)
  }

  public fun build(): CfnDataset.LateDataRuleConfigurationProperty = cdkBuilder.build()
}
