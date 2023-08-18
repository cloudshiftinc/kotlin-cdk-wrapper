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
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `FormStyleConfig` property specifies the configuration settings for the form's style
 * properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormStyleConfigProperty formStyleConfigProperty = FormStyleConfigProperty.builder()
 * .tokenReference("tokenReference")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyleconfig.html)
 */
@CdkDslMarker
public class CfnFormFormStyleConfigPropertyDsl {
    private val cdkBuilder: CfnForm.FormStyleConfigProperty.Builder =
        CfnForm.FormStyleConfigProperty.builder()

    /**
     * @param tokenReference A reference to a design token to use to bind the form's style
     *   properties to an existing theme.
     */
    public fun tokenReference(tokenReference: String) {
        cdkBuilder.tokenReference(tokenReference)
    }

    /** @param value The value of the style setting. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnForm.FormStyleConfigProperty = cdkBuilder.build()
}
