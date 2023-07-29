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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.cognito.StringAttributeConstraints

/**
 * Constraints that can be applied to a custom attribute of string type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * StringAttributeConstraints stringAttributeConstraints = StringAttributeConstraints.builder()
 * .maxLen(123)
 * .minLen(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class StringAttributeConstraintsDsl {
    private val cdkBuilder: StringAttributeConstraints.Builder =
        StringAttributeConstraints.builder()

    /** @param maxLen Maximum length of this attribute. */
    public fun maxLen(maxLen: Number) {
        cdkBuilder.maxLen(maxLen)
    }

    /** @param minLen Minimum length of this attribute. */
    public fun minLen(minLen: Number) {
        cdkBuilder.minLen(minLen)
    }

    public fun build(): StringAttributeConstraints = cdkBuilder.build()
}
