@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicDefaultFormattingPropertyDsl {
  private val cdkBuilder: CfnTopic.DefaultFormattingProperty.Builder =
      CfnTopic.DefaultFormattingProperty.builder()

  /**
   * @param displayFormat The display format.
   * Valid values for this structure are `AUTO` , `PERCENT` , `CURRENCY` , `NUMBER` , `DATE` , and
   * `STRING` .
   */
  public fun displayFormat(displayFormat: String) {
    cdkBuilder.displayFormat(displayFormat)
  }

  /**
   * @param displayFormatOptions The additional options for display formatting.
   */
  public fun displayFormatOptions(displayFormatOptions: IResolvable) {
    cdkBuilder.displayFormatOptions(displayFormatOptions)
  }

  /**
   * @param displayFormatOptions The additional options for display formatting.
   */
  public fun displayFormatOptions(displayFormatOptions: CfnTopic.DisplayFormatOptionsProperty) {
    cdkBuilder.displayFormatOptions(displayFormatOptions)
  }

  public fun build(): CfnTopic.DefaultFormattingProperty = cdkBuilder.build()
}
