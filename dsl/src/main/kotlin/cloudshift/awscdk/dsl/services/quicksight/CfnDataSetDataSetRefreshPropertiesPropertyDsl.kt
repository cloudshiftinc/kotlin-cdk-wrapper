@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetDataSetRefreshPropertiesPropertyDsl {
  private val cdkBuilder: CfnDataSet.DataSetRefreshPropertiesProperty.Builder =
      CfnDataSet.DataSetRefreshPropertiesProperty.builder()

  public fun refreshConfiguration(refreshConfiguration: IResolvable) {
    cdkBuilder.refreshConfiguration(refreshConfiguration)
  }

  public fun refreshConfiguration(refreshConfiguration: CfnDataSet.RefreshConfigurationProperty) {
    cdkBuilder.refreshConfiguration(refreshConfiguration)
  }

  public fun build(): CfnDataSet.DataSetRefreshPropertiesProperty = cdkBuilder.build()
}
