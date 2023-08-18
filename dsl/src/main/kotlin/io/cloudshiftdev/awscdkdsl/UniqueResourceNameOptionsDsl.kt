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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.UniqueResourceNameOptions

/**
 * Options for creating a unique resource name.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * UniqueResourceNameOptions uniqueResourceNameOptions = UniqueResourceNameOptions.builder()
 * .allowedSpecialCharacters("allowedSpecialCharacters")
 * .maxLength(123)
 * .separator("separator")
 * .build();
 * ```
 */
@CdkDslMarker
public class UniqueResourceNameOptionsDsl {
    private val cdkBuilder: UniqueResourceNameOptions.Builder = UniqueResourceNameOptions.builder()

    /**
     * @param allowedSpecialCharacters Non-alphanumeric characters allowed in the unique resource
     *   name.
     */
    public fun allowedSpecialCharacters(allowedSpecialCharacters: String) {
        cdkBuilder.allowedSpecialCharacters(allowedSpecialCharacters)
    }

    /** @param maxLength The maximum length of the unique resource name. */
    public fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
    }

    /** @param separator The separator used between the path components. */
    public fun separator(separator: String) {
        cdkBuilder.separator(separator)
    }

    public fun build(): UniqueResourceNameOptions = cdkBuilder.build()
}
