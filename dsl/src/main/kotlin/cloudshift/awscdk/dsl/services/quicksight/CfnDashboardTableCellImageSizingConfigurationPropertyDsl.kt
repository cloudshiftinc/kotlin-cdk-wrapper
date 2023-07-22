@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableCellImageSizingConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableCellImageSizingConfigurationProperty.Builder =
      CfnDashboard.TableCellImageSizingConfigurationProperty.builder()

  /**
   * @param tableCellImageScalingConfiguration The cell scaling configuration of the sizing options
   * for the table image configuration.
   */
  public fun tableCellImageScalingConfiguration(tableCellImageScalingConfiguration: String) {
    cdkBuilder.tableCellImageScalingConfiguration(tableCellImageScalingConfiguration)
  }

  public fun build(): CfnDashboard.TableCellImageSizingConfigurationProperty = cdkBuilder.build()
}
