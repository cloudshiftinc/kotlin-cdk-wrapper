@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFormStylePropertyDsl {
  private val cdkBuilder: CfnForm.FormStyleProperty.Builder = CfnForm.FormStyleProperty.builder()

  /**
   * @param horizontalGap The spacing for the horizontal gap.
   */
  public fun horizontalGap(horizontalGap: IResolvable) {
    cdkBuilder.horizontalGap(horizontalGap)
  }

  /**
   * @param horizontalGap The spacing for the horizontal gap.
   */
  public fun horizontalGap(horizontalGap: CfnForm.FormStyleConfigProperty) {
    cdkBuilder.horizontalGap(horizontalGap)
  }

  /**
   * @param outerPadding The size of the outer padding for the form.
   */
  public fun outerPadding(outerPadding: IResolvable) {
    cdkBuilder.outerPadding(outerPadding)
  }

  /**
   * @param outerPadding The size of the outer padding for the form.
   */
  public fun outerPadding(outerPadding: CfnForm.FormStyleConfigProperty) {
    cdkBuilder.outerPadding(outerPadding)
  }

  /**
   * @param verticalGap The spacing for the vertical gap.
   */
  public fun verticalGap(verticalGap: IResolvable) {
    cdkBuilder.verticalGap(verticalGap)
  }

  /**
   * @param verticalGap The spacing for the vertical gap.
   */
  public fun verticalGap(verticalGap: CfnForm.FormStyleConfigProperty) {
    cdkBuilder.verticalGap(verticalGap)
  }

  public fun build(): CfnForm.FormStyleProperty = cdkBuilder.build()
}
