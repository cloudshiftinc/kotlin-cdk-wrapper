@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetRefreshConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSet.RefreshConfigurationProperty.Builder =
      CfnDataSet.RefreshConfigurationProperty.builder()

  /**
   * @param incrementalRefresh Incremental Refresh</p>.
   */
  public fun incrementalRefresh(incrementalRefresh: IResolvable) {
    cdkBuilder.incrementalRefresh(incrementalRefresh)
  }

  /**
   * @param incrementalRefresh Incremental Refresh</p>.
   */
  public fun incrementalRefresh(incrementalRefresh: CfnDataSet.IncrementalRefreshProperty) {
    cdkBuilder.incrementalRefresh(incrementalRefresh)
  }

  public fun build(): CfnDataSet.RefreshConfigurationProperty = cdkBuilder.build()
}
