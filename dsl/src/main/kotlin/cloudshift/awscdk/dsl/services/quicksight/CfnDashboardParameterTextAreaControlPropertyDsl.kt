@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardParameterTextAreaControlPropertyDsl {
  private val cdkBuilder: CfnDashboard.ParameterTextAreaControlProperty.Builder =
      CfnDashboard.ParameterTextAreaControlProperty.builder()

  /**
   * @param delimiter The delimiter that is used to separate the lines in text.
   */
  public fun delimiter(delimiter: String) {
    cdkBuilder.delimiter(delimiter)
  }

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: CfnDashboard.TextAreaControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param parameterControlId The ID of the `ParameterTextAreaControl` . 
   */
  public fun parameterControlId(parameterControlId: String) {
    cdkBuilder.parameterControlId(parameterControlId)
  }

  /**
   * @param sourceParameterName The source parameter name of the `ParameterTextAreaControl` . 
   */
  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  /**
   * @param title The title of the `ParameterTextAreaControl` . 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnDashboard.ParameterTextAreaControlProperty = cdkBuilder.build()
}
