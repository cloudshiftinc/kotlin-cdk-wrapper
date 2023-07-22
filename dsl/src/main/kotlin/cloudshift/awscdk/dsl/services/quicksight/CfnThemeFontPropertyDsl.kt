@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeFontPropertyDsl {
  private val cdkBuilder: CfnTheme.FontProperty.Builder = CfnTheme.FontProperty.builder()

  /**
   * @param fontFamily the value to be set.
   */
  public fun fontFamily(fontFamily: String) {
    cdkBuilder.fontFamily(fontFamily)
  }

  public fun build(): CfnTheme.FontProperty = cdkBuilder.build()
}
