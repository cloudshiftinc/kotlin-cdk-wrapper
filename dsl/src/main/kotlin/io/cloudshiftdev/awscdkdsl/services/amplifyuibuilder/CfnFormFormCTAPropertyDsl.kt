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

package io.cloudshiftdev.awscdkdsl.services.amplifyuibuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `FormCTA` property specifies the call to action button configuration for the form.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormCTAProperty formCTAProperty = FormCTAProperty.builder()
 * .cancel(FormButtonProperty.builder()
 * .children("children")
 * .excluded(false)
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .build())
 * .clear(FormButtonProperty.builder()
 * .children("children")
 * .excluded(false)
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .build())
 * .position("position")
 * .submit(FormButtonProperty.builder()
 * .children("children")
 * .excluded(false)
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html)
 */
@CdkDslMarker
public class CfnFormFormCTAPropertyDsl {
    private val cdkBuilder: CfnForm.FormCTAProperty.Builder = CfnForm.FormCTAProperty.builder()

    /** @param cancel Displays a cancel button. */
    public fun cancel(cancel: IResolvable) {
        cdkBuilder.cancel(cancel)
    }

    /** @param cancel Displays a cancel button. */
    public fun cancel(cancel: CfnForm.FormButtonProperty) {
        cdkBuilder.cancel(cancel)
    }

    /** @param clear Displays a clear button. */
    public fun clear(clear: IResolvable) {
        cdkBuilder.clear(clear)
    }

    /** @param clear Displays a clear button. */
    public fun clear(clear: CfnForm.FormButtonProperty) {
        cdkBuilder.clear(clear)
    }

    /** @param position The position of the button. */
    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    /** @param submit Displays a submit button. */
    public fun submit(submit: IResolvable) {
        cdkBuilder.submit(submit)
    }

    /** @param submit Displays a submit button. */
    public fun submit(submit: CfnForm.FormButtonProperty) {
        cdkBuilder.submit(submit)
    }

    public fun build(): CfnForm.FormCTAProperty = cdkBuilder.build()
}
