@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of the placeholder options in a text control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TextControlPlaceholderOptionsProperty textControlPlaceholderOptionsProperty =
 * TextControlPlaceholderOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-textcontrolplaceholderoptions.html)
 */
@CdkDslMarker
public class CfnTemplateTextControlPlaceholderOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TextControlPlaceholderOptionsProperty.Builder =
      CfnTemplate.TextControlPlaceholderOptionsProperty.builder()

  /**
   * @param visibility The visibility configuration of the placeholder options in a text control.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.TextControlPlaceholderOptionsProperty = cdkBuilder.build()
}
