@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCategoricalMeasureFieldPropertyDsl {
  private val cdkBuilder: CfnTemplate.CategoricalMeasureFieldProperty.Builder =
      CfnTemplate.CategoricalMeasureFieldProperty.builder()

  public fun aggregationFunction(aggregationFunction: String) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public
      fun formatConfiguration(formatConfiguration: CfnTemplate.StringFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public fun build(): CfnTemplate.CategoricalMeasureFieldProperty = cdkBuilder.build()
}
