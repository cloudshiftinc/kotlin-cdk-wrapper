@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDateDimensionFieldPropertyDsl {
  private val cdkBuilder: CfnDashboard.DateDimensionFieldProperty.Builder =
      CfnDashboard.DateDimensionFieldProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun dateGranularity(dateGranularity: String) {
    cdkBuilder.dateGranularity(dateGranularity)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public
      fun formatConfiguration(formatConfiguration: CfnDashboard.DateTimeFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public fun hierarchyId(hierarchyId: String) {
    cdkBuilder.hierarchyId(hierarchyId)
  }

  public fun build(): CfnDashboard.DateDimensionFieldProperty = cdkBuilder.build()
}
