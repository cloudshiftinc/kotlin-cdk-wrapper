@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDateDimensionFieldPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DateDimensionFieldProperty.Builder =
      CfnAnalysis.DateDimensionFieldProperty.builder()

  /**
   * @param column The column that is used in the `DateDimensionField` . 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that is used in the `DateDimensionField` . 
   */
  public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param dateGranularity The date granularity of the `DateDimensionField` . Choose one of the
   * following options:.
   * * `YEAR`
   * * `QUARTER`
   * * `MONTH`
   * * `WEEK`
   * * `DAY`
   * * `HOUR`
   * * `MINUTE`
   * * `SECOND`
   * * `MILLISECOND`
   */
  public fun dateGranularity(dateGranularity: String) {
    cdkBuilder.dateGranularity(dateGranularity)
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
      fun formatConfiguration(formatConfiguration: CfnAnalysis.DateTimeFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param hierarchyId The custom hierarchy ID.
   */
  public fun hierarchyId(hierarchyId: String) {
    cdkBuilder.hierarchyId(hierarchyId)
  }

  public fun build(): CfnAnalysis.DateDimensionFieldProperty = cdkBuilder.build()
}
