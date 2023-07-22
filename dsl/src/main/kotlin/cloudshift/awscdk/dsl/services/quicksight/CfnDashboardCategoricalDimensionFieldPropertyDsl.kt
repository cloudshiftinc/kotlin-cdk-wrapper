@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCategoricalDimensionFieldPropertyDsl {
  private val cdkBuilder: CfnDashboard.CategoricalDimensionFieldProperty.Builder =
      CfnDashboard.CategoricalDimensionFieldProperty.builder()

  /**
   * @param column The column that is used in the `CategoricalDimensionField` . 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that is used in the `CategoricalDimensionField` . 
   */
  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param fieldId The custom field ID. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param formatConfiguration The format configuration of the field.
   */
  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param formatConfiguration The format configuration of the field.
   */
  public
      fun formatConfiguration(formatConfiguration: CfnDashboard.StringFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param hierarchyId The custom hierarchy ID.
   */
  public fun hierarchyId(hierarchyId: String) {
    cdkBuilder.hierarchyId(hierarchyId)
  }

  public fun build(): CfnDashboard.CategoricalDimensionFieldProperty = cdkBuilder.build()
}
