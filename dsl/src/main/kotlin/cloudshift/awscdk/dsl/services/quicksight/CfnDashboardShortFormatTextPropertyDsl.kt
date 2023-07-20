@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardShortFormatTextPropertyDsl {
  private val cdkBuilder: CfnDashboard.ShortFormatTextProperty.Builder =
      CfnDashboard.ShortFormatTextProperty.builder()

  public fun plainText(plainText: String) {
    cdkBuilder.plainText(plainText)
  }

  public fun richText(richText: String) {
    cdkBuilder.richText(richText)
  }

  public fun build(): CfnDashboard.ShortFormatTextProperty = cdkBuilder.build()
}
