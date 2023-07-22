@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFormButtonPropertyDsl {
  private val cdkBuilder: CfnForm.FormButtonProperty.Builder = CfnForm.FormButtonProperty.builder()

  /**
   * @param children Describes the button's properties.
   */
  public fun children(children: String) {
    cdkBuilder.children(children)
  }

  /**
   * @param excluded Specifies whether the button is visible on the form.
   */
  public fun excluded(excluded: Boolean) {
    cdkBuilder.excluded(excluded)
  }

  /**
   * @param excluded Specifies whether the button is visible on the form.
   */
  public fun excluded(excluded: IResolvable) {
    cdkBuilder.excluded(excluded)
  }

  /**
   * @param position The position of the button.
   */
  public fun position(position: IResolvable) {
    cdkBuilder.position(position)
  }

  /**
   * @param position The position of the button.
   */
  public fun position(position: CfnForm.FieldPositionProperty) {
    cdkBuilder.position(position)
  }

  public fun build(): CfnForm.FormButtonProperty = cdkBuilder.build()
}
