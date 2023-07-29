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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.PrefixListOptions

/**
 * Options to add a prefix list.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PrefixListOptions prefixListOptions = PrefixListOptions.builder()
 * .maxEntries(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class PrefixListOptionsDsl {
    private val cdkBuilder: PrefixListOptions.Builder = PrefixListOptions.builder()

    /** @param maxEntries The maximum number of entries for the prefix list. */
    public fun maxEntries(maxEntries: Number) {
        cdkBuilder.maxEntries(maxEntries)
    }

    public fun build(): PrefixListOptions = cdkBuilder.build()
}
