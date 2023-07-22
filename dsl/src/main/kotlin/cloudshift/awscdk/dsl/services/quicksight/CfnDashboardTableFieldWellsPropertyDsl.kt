@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableFieldWellsProperty.Builder =
      CfnDashboard.TableFieldWellsProperty.builder()

  /**
   * @param tableAggregatedFieldWells The aggregated field well for the table.
   */
  public fun tableAggregatedFieldWells(tableAggregatedFieldWells: IResolvable) {
    cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
  }

  /**
   * @param tableAggregatedFieldWells The aggregated field well for the table.
   */
  public
      fun tableAggregatedFieldWells(tableAggregatedFieldWells: CfnDashboard.TableAggregatedFieldWellsProperty) {
    cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
  }

  /**
   * @param tableUnaggregatedFieldWells The unaggregated field well for the table.
   */
  public fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: IResolvable) {
    cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
  }

  /**
   * @param tableUnaggregatedFieldWells The unaggregated field well for the table.
   */
  public
      fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: CfnDashboard.TableUnaggregatedFieldWellsProperty) {
    cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
  }

  public fun build(): CfnDashboard.TableFieldWellsProperty = cdkBuilder.build()
}
