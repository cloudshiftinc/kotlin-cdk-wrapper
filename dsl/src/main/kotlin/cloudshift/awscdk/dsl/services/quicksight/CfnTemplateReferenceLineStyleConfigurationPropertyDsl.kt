@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateReferenceLineStyleConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ReferenceLineStyleConfigurationProperty.Builder =
      CfnTemplate.ReferenceLineStyleConfigurationProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun build(): CfnTemplate.ReferenceLineStyleConfigurationProperty = cdkBuilder.build()
}
