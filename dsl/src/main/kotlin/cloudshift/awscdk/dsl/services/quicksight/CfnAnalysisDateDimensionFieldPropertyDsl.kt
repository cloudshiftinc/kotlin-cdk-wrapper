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

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
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
      fun formatConfiguration(formatConfiguration: CfnAnalysis.DateTimeFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public fun hierarchyId(hierarchyId: String) {
    cdkBuilder.hierarchyId(hierarchyId)
  }

  public fun build(): CfnAnalysis.DateDimensionFieldProperty = cdkBuilder.build()
}
