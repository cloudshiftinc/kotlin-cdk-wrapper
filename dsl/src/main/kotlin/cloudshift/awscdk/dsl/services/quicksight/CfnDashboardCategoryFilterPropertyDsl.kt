@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCategoryFilterPropertyDsl {
  private val cdkBuilder: CfnDashboard.CategoryFilterProperty.Builder =
      CfnDashboard.CategoryFilterProperty.builder()

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param configuration The configuration for a `CategoryFilter` . 
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration The configuration for a `CategoryFilter` . 
   */
  public fun configuration(configuration: CfnDashboard.CategoryFilterConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param filterId An identifier that uniquely identifies a filter within a dashboard, analysis,
   * or template. 
   */
  public fun filterId(filterId: String) {
    cdkBuilder.filterId(filterId)
  }

  public fun build(): CfnDashboard.CategoryFilterProperty = cdkBuilder.build()
}
