@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableCellImageSizingConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableCellImageSizingConfigurationProperty.Builder =
      CfnAnalysis.TableCellImageSizingConfigurationProperty.builder()

  /**
   * @param tableCellImageScalingConfiguration The cell scaling configuration of the sizing options
   * for the table image configuration.
   */
  public fun tableCellImageScalingConfiguration(tableCellImageScalingConfiguration: String) {
    cdkBuilder.tableCellImageScalingConfiguration(tableCellImageScalingConfiguration)
  }

  public fun build(): CfnAnalysis.TableCellImageSizingConfigurationProperty = cdkBuilder.build()
}
