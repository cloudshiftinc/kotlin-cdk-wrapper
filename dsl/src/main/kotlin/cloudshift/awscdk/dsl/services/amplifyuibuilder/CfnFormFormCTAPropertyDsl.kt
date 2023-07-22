@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFormCTAPropertyDsl {
  private val cdkBuilder: CfnForm.FormCTAProperty.Builder = CfnForm.FormCTAProperty.builder()

  /**
   * @param cancel Displays a cancel button.
   */
  public fun cancel(cancel: IResolvable) {
    cdkBuilder.cancel(cancel)
  }

  /**
   * @param cancel Displays a cancel button.
   */
  public fun cancel(cancel: CfnForm.FormButtonProperty) {
    cdkBuilder.cancel(cancel)
  }

  /**
   * @param clear Displays a clear button.
   */
  public fun clear(clear: IResolvable) {
    cdkBuilder.clear(clear)
  }

  /**
   * @param clear Displays a clear button.
   */
  public fun clear(clear: CfnForm.FormButtonProperty) {
    cdkBuilder.clear(clear)
  }

  /**
   * @param position The position of the button.
   */
  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  /**
   * @param submit Displays a submit button.
   */
  public fun submit(submit: IResolvable) {
    cdkBuilder.submit(submit)
  }

  /**
   * @param submit Displays a submit button.
   */
  public fun submit(submit: CfnForm.FormButtonProperty) {
    cdkBuilder.submit(submit)
  }

  public fun build(): CfnForm.FormCTAProperty = cdkBuilder.build()
}
