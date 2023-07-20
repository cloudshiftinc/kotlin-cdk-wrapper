@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCustomActionURLOperationPropertyDsl {
  private val cdkBuilder: CfnTemplate.CustomActionURLOperationProperty.Builder =
      CfnTemplate.CustomActionURLOperationProperty.builder()

  public fun urlTarget(urlTarget: String) {
    cdkBuilder.urlTarget(urlTarget)
  }

  public fun urlTemplate(urlTemplate: String) {
    cdkBuilder.urlTemplate(urlTemplate)
  }

  public fun build(): CfnTemplate.CustomActionURLOperationProperty = cdkBuilder.build()
}
