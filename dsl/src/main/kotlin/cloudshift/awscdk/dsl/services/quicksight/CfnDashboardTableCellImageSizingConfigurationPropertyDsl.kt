@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The sizing options for the table image configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableCellImageSizingConfigurationProperty tableCellImageSizingConfigurationProperty =
 * TableCellImageSizingConfigurationProperty.builder()
 * .tableCellImageScalingConfiguration("tableCellImageScalingConfiguration")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-tablecellimagesizingconfiguration.html)
 */
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
