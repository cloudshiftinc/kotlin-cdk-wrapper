@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldImageConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableFieldImageConfigurationProperty.Builder =
      CfnDashboard.TableFieldImageConfigurationProperty.builder()

  public fun sizingOptions(sizingOptions: IResolvable) {
    cdkBuilder.sizingOptions(sizingOptions)
  }

  public fun sizingOptions(sizingOptions: CfnDashboard.TableCellImageSizingConfigurationProperty) {
    cdkBuilder.sizingOptions(sizingOptions)
  }

  public fun build(): CfnDashboard.TableFieldImageConfigurationProperty = cdkBuilder.build()
}
