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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

/**
 * The component type error.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * ErrorProperty errorProperty = ErrorProperty.builder()
 * .code("code")
 * .message("message")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-error.html)
 */
@CdkDslMarker
public class CfnComponentTypeErrorPropertyDsl {
    private val cdkBuilder: CfnComponentType.ErrorProperty.Builder =
        CfnComponentType.ErrorProperty.builder()

    /** @param code The component type error code. */
    public fun code(code: String) {
        cdkBuilder.code(code)
    }

    /** @param message The component type error message. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun build(): CfnComponentType.ErrorProperty = cdkBuilder.build()
}
