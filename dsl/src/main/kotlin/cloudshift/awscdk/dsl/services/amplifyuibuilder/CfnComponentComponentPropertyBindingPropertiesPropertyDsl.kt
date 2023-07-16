@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentPropertyBindingPropertiesPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentPropertyBindingPropertiesProperty.Builder =
      CfnComponent.ComponentPropertyBindingPropertiesProperty.builder()

  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  public fun build(): CfnComponent.ComponentPropertyBindingPropertiesProperty = cdkBuilder.build()
}
