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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.FileCopyOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode

/**
 * Options applied when copying directories into the staging location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * FileCopyOptions fileCopyOptions = FileCopyOptions.builder()
 * .exclude(List.of("exclude"))
 * .followSymlinks(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .build();
 * ```
 */
@CdkDslMarker
public class FileCopyOptionsDsl {
    private val cdkBuilder: FileCopyOptions.Builder = FileCopyOptions.builder()

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

    /** @param followSymlinks A strategy for how to handle symlinks. */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    /** @param ignoreMode The ignore behavior to use for `exclude` patterns. */
    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    public fun build(): FileCopyOptions {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        return cdkBuilder.build()
    }
}
