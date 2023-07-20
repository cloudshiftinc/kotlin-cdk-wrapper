@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentFormBindingElementPropertyDsl {
  private val cdkBuilder: CfnComponent.FormBindingElementProperty.Builder =
      CfnComponent.FormBindingElementProperty.builder()

  public fun element(element: String) {
    cdkBuilder.element(element)
  }

  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  public fun build(): CfnComponent.FormBindingElementProperty = cdkBuilder.build()
}
