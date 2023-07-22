@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisParameterTextFieldControlPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ParameterTextFieldControlProperty.Builder =
      CfnAnalysis.ParameterTextFieldControlProperty.builder()

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: CfnAnalysis.TextFieldControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param parameterControlId The ID of the `ParameterTextFieldControl` . 
   */
  public fun parameterControlId(parameterControlId: String) {
    cdkBuilder.parameterControlId(parameterControlId)
  }

  /**
   * @param sourceParameterName The source parameter name of the `ParameterTextFieldControl` . 
   */
  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  /**
   * @param title The title of the `ParameterTextFieldControl` . 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnAnalysis.ParameterTextFieldControlProperty = cdkBuilder.build()
}
