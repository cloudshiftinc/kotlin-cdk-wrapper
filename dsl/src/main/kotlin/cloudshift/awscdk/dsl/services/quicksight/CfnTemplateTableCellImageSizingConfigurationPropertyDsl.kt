@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableCellImageSizingConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableCellImageSizingConfigurationProperty.Builder =
      CfnTemplate.TableCellImageSizingConfigurationProperty.builder()

  /**
   * @param tableCellImageScalingConfiguration The cell scaling configuration of the sizing options
   * for the table image configuration.
   */
  public fun tableCellImageScalingConfiguration(tableCellImageScalingConfiguration: String) {
    cdkBuilder.tableCellImageScalingConfiguration(tableCellImageScalingConfiguration)
  }

  public fun build(): CfnTemplate.TableCellImageSizingConfigurationProperty = cdkBuilder.build()
}
