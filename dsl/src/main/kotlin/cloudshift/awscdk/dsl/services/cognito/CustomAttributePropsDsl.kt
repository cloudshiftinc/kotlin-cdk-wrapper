@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.CustomAttributeProps

@CdkDslMarker
public class CustomAttributePropsDsl {
  private val cdkBuilder: CustomAttributeProps.Builder = CustomAttributeProps.builder()

  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): CustomAttributeProps = cdkBuilder.build()
}
