@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisLabelReferenceOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisLabelReferenceOptionsProperty.Builder =
      CfnTemplate.AxisLabelReferenceOptionsProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnTemplate.AxisLabelReferenceOptionsProperty = cdkBuilder.build()
}
