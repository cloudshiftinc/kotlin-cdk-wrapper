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

package io.cloudshiftdev.awscdkdsl.services.iottwinmaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

/**
 * The entity error.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-error.html)
 */
@CdkDslMarker
public class CfnEntityErrorPropertyDsl {
    private val cdkBuilder: CfnEntity.ErrorProperty.Builder = CfnEntity.ErrorProperty.builder()

    /** @param code The entity error code. */
    public fun code(code: String) {
        cdkBuilder.code(code)
    }

    /** @param message The entity error message. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun build(): CfnEntity.ErrorProperty = cdkBuilder.build()
}
