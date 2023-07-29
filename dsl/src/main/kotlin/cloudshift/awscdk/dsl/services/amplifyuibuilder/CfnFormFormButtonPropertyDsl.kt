@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `FormButton` property specifies the configuration for a button UI element that is a part of a
 * form.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormButtonProperty formButtonProperty = FormButtonProperty.builder()
 * .children("children")
 * .excluded(false)
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formbutton.html)
 */
@CdkDslMarker
public class CfnFormFormButtonPropertyDsl {
    private val cdkBuilder: CfnForm.FormButtonProperty.Builder =
        CfnForm.FormButtonProperty.builder()

    /** @param children Describes the button's properties. */
    public fun children(children: String) {
        cdkBuilder.children(children)
    }

    /** @param excluded Specifies whether the button is visible on the form. */
    public fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
    }

    /** @param excluded Specifies whether the button is visible on the form. */
    public fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded)
    }

    /** @param position The position of the button. */
    public fun position(position: IResolvable) {
        cdkBuilder.position(position)
    }

    /** @param position The position of the button. */
    public fun position(position: CfnForm.FieldPositionProperty) {
        cdkBuilder.position(position)
    }

    public fun build(): CfnForm.FormButtonProperty = cdkBuilder.build()
}
