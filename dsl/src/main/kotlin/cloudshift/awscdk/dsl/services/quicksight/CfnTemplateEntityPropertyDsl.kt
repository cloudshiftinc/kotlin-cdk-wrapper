@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateEntityPropertyDsl {
  private val cdkBuilder: CfnTemplate.EntityProperty.Builder = CfnTemplate.EntityProperty.builder()

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnTemplate.EntityProperty = cdkBuilder.build()
}
