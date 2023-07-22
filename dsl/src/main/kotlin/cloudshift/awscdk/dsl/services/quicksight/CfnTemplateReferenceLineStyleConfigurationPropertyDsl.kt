@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateReferenceLineStyleConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ReferenceLineStyleConfigurationProperty.Builder =
      CfnTemplate.ReferenceLineStyleConfigurationProperty.builder()

  /**
   * @param color The hex color of the reference line.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param pattern The pattern type of the line style. Choose one of the following options:.
   * * `SOLID`
   * * `DASHED`
   * * `DOTTED`
   */
  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun build(): CfnTemplate.ReferenceLineStyleConfigurationProperty = cdkBuilder.build()
}
