@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateArcOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.ArcOptionsProperty.Builder =
      CfnTemplate.ArcOptionsProperty.builder()

  public fun arcThickness(arcThickness: String) {
    cdkBuilder.arcThickness(arcThickness)
  }

  public fun build(): CfnTemplate.ArcOptionsProperty = cdkBuilder.build()
}
