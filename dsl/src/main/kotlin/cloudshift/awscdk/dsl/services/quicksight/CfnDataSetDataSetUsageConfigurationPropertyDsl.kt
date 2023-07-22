@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetDataSetUsageConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSet.DataSetUsageConfigurationProperty.Builder =
      CfnDataSet.DataSetUsageConfigurationProperty.builder()

  /**
   * @param disableUseAsDirectQuerySource An option that controls whether a child dataset of a
   * direct query can use this dataset as a source.
   */
  public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: Boolean) {
    cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource)
  }

  /**
   * @param disableUseAsDirectQuerySource An option that controls whether a child dataset of a
   * direct query can use this dataset as a source.
   */
  public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: IResolvable) {
    cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource)
  }

  /**
   * @param disableUseAsImportedSource An option that controls whether a child dataset that's stored
   * in QuickSight can use this dataset as a source.
   */
  public fun disableUseAsImportedSource(disableUseAsImportedSource: Boolean) {
    cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource)
  }

  /**
   * @param disableUseAsImportedSource An option that controls whether a child dataset that's stored
   * in QuickSight can use this dataset as a source.
   */
  public fun disableUseAsImportedSource(disableUseAsImportedSource: IResolvable) {
    cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource)
  }

  public fun build(): CfnDataSet.DataSetUsageConfigurationProperty = cdkBuilder.build()
}
