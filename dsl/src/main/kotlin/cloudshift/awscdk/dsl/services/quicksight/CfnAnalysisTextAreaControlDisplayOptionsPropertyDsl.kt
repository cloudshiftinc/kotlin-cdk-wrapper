@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTextAreaControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TextAreaControlDisplayOptionsProperty.Builder =
      CfnAnalysis.TextAreaControlDisplayOptionsProperty.builder()

  /**
   * @param placeholderOptions The configuration of the placeholder options in a text area control.
   */
  public fun placeholderOptions(placeholderOptions: IResolvable) {
    cdkBuilder.placeholderOptions(placeholderOptions)
  }

  /**
   * @param placeholderOptions The configuration of the placeholder options in a text area control.
   */
  public
      fun placeholderOptions(placeholderOptions: CfnAnalysis.TextControlPlaceholderOptionsProperty) {
    cdkBuilder.placeholderOptions(placeholderOptions)
  }

  /**
   * @param titleOptions The options to configure the title visibility, name, and font size.
   */
  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  /**
   * @param titleOptions The options to configure the title visibility, name, and font size.
   */
  public fun titleOptions(titleOptions: CfnAnalysis.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnAnalysis.TextAreaControlDisplayOptionsProperty = cdkBuilder.build()
}
