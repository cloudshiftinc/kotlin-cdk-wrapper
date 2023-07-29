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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CopyOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode

/**
 * Options applied when copying directories.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CopyOptions copyOptions = CopyOptions.builder()
 * .exclude(List.of("exclude"))
 * .follow(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .build();
 * ```
 */
@CdkDslMarker
public class CopyOptionsDsl {
    private val cdkBuilder: CopyOptions.Builder = CopyOptions.builder()

    private val _exclude: MutableList<String> = mutableListOf()

    /**
     * @param exclude File paths matching the patterns will be excluded. See `ignoreMode` to set the
     *   matching behavior. Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    /**
     * @param exclude File paths matching the patterns will be excluded. See `ignoreMode` to set the
     *   matching behavior. Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    /** @param follow A strategy for how to handle symlinks. */
    public fun follow(follow: SymlinkFollowMode) {
        cdkBuilder.follow(follow)
    }

    /** @param ignoreMode The ignore behavior to use for `exclude` patterns. */
    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    public fun build(): CopyOptions {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        return cdkBuilder.build()
    }
}
