@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableInlineVisualizationPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableInlineVisualizationProperty.Builder =
      CfnDashboard.TableInlineVisualizationProperty.builder()

  public fun dataBars(dataBars: IResolvable) {
    cdkBuilder.dataBars(dataBars)
  }

  public fun dataBars(dataBars: CfnDashboard.DataBarsOptionsProperty) {
    cdkBuilder.dataBars(dataBars)
  }

  public fun build(): CfnDashboard.TableInlineVisualizationProperty = cdkBuilder.build()
}
