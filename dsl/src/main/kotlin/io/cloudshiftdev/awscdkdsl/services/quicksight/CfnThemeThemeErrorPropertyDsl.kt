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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * Theme error.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ThemeErrorProperty themeErrorProperty = ThemeErrorProperty.builder()
 * .message("message")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeerror.html)
 */
@CdkDslMarker
public class CfnThemeThemeErrorPropertyDsl {
    private val cdkBuilder: CfnTheme.ThemeErrorProperty.Builder =
        CfnTheme.ThemeErrorProperty.builder()

    /** @param message The error message. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    /** @param type The type of error. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTheme.ThemeErrorProperty = cdkBuilder.build()
}
