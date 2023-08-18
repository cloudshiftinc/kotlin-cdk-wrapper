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
import kotlin.String
import software.amazon.awscdk.EncodingOptions

/**
 * Properties to string encodings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * EncodingOptions encodingOptions = EncodingOptions.builder()
 * .displayHint("displayHint")
 * .build();
 * ```
 */
@CdkDslMarker
public class EncodingOptionsDsl {
    private val cdkBuilder: EncodingOptions.Builder = EncodingOptions.builder()

    /** @param displayHint A hint for the Token's purpose when stringifying it. */
    public fun displayHint(displayHint: String) {
        cdkBuilder.displayHint(displayHint)
    }

    public fun build(): EncodingOptions = cdkBuilder.build()
}
