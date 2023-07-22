@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The reference that specifies where the axis label is applied to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AxisLabelReferenceOptionsProperty axisLabelReferenceOptionsProperty =
 * AxisLabelReferenceOptionsProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-axislabelreferenceoptions.html)
 */
@CdkDslMarker
public class CfnTemplateAxisLabelReferenceOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisLabelReferenceOptionsProperty.Builder =
      CfnTemplate.AxisLabelReferenceOptionsProperty.builder()

  /**
   * @param column The column that the axis label is targeted to. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the axis label is targeted to. 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param fieldId The field that the axis label is targeted to. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnTemplate.AxisLabelReferenceOptionsProperty = cdkBuilder.build()
}
