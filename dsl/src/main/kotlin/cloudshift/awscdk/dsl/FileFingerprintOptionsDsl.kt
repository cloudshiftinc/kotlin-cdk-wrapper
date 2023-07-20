@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.FileFingerprintOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class FileFingerprintOptionsDsl {
    private val cdkBuilder: FileFingerprintOptions.Builder = FileFingerprintOptions.builder()

    private val _exclude: MutableList<String> = mutableListOf()

    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    public fun extraHash(extraHash: String) {
        cdkBuilder.extraHash(extraHash)
    }

    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    public fun build(): FileFingerprintOptions {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        return cdkBuilder.build()
    }
}
