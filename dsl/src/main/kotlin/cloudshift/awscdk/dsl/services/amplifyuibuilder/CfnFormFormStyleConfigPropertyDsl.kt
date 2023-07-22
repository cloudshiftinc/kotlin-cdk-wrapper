@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFormStyleConfigPropertyDsl {
  private val cdkBuilder: CfnForm.FormStyleConfigProperty.Builder =
      CfnForm.FormStyleConfigProperty.builder()

  /**
   * @param tokenReference A reference to a design token to use to bind the form's style properties
   * to an existing theme.
   */
  public fun tokenReference(tokenReference: String) {
    cdkBuilder.tokenReference(tokenReference)
  }

  /**
   * @param value The value of the style setting.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnForm.FormStyleConfigProperty = cdkBuilder.build()
}
