@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLongFormatTextPropertyDsl {
  private val cdkBuilder: CfnDashboard.LongFormatTextProperty.Builder =
      CfnDashboard.LongFormatTextProperty.builder()

  /**
   * @param plainText Plain text format.
   */
  public fun plainText(plainText: String) {
    cdkBuilder.plainText(plainText)
  }

  /**
   * @param richText Rich text.
   * Examples of rich text include bold, underline, and italics.
   */
  public fun richText(richText: String) {
    cdkBuilder.richText(richText)
  }

  public fun build(): CfnDashboard.LongFormatTextProperty = cdkBuilder.build()
}
