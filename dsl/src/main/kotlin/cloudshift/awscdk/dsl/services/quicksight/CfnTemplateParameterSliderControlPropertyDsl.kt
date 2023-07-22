@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateParameterSliderControlPropertyDsl {
  private val cdkBuilder: CfnTemplate.ParameterSliderControlProperty.Builder =
      CfnTemplate.ParameterSliderControlProperty.builder()

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: CfnTemplate.SliderControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param maximumValue The smaller value that is displayed at the left of the slider. 
   */
  public fun maximumValue(maximumValue: Number) {
    cdkBuilder.maximumValue(maximumValue)
  }

  /**
   * @param minimumValue The larger value that is displayed at the right of the slider. 
   */
  public fun minimumValue(minimumValue: Number) {
    cdkBuilder.minimumValue(minimumValue)
  }

  /**
   * @param parameterControlId The ID of the `ParameterSliderControl` . 
   */
  public fun parameterControlId(parameterControlId: String) {
    cdkBuilder.parameterControlId(parameterControlId)
  }

  /**
   * @param sourceParameterName The source parameter name of the `ParameterSliderControl` . 
   */
  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  /**
   * @param stepSize The number of increments that the slider bar is divided into. 
   */
  public fun stepSize(stepSize: Number) {
    cdkBuilder.stepSize(stepSize)
  }

  /**
   * @param title The title of the `ParameterSliderControl` . 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnTemplate.ParameterSliderControlProperty = cdkBuilder.build()
}
