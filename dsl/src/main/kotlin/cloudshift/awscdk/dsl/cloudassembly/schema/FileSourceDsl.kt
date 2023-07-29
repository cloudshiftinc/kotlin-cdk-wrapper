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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.FileAssetPackaging
import software.amazon.awscdk.cloudassembly.schema.FileSource

/**
 * Describe the source of a file asset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * FileSource fileSource = FileSource.builder()
 * .executable(List.of("executable"))
 * .packaging(FileAssetPackaging.FILE)
 * .path("path")
 * .build();
 * ```
 */
@CdkDslMarker
public class FileSourceDsl {
    private val cdkBuilder: FileSource.Builder = FileSource.builder()

    private val _executable: MutableList<String> = mutableListOf()

    /** @param executable External command which will produce the file asset to upload. */
    public fun executable(vararg executable: String) {
        _executable.addAll(listOf(*executable))
    }

    /** @param executable External command which will produce the file asset to upload. */
    public fun executable(executable: Collection<String>) {
        _executable.addAll(executable)
    }

    /** @param packaging Packaging method. Only allowed when `path` is specified. */
    public fun packaging(packaging: FileAssetPackaging) {
        cdkBuilder.packaging(packaging)
    }

    /**
     * @param path The filesystem object to upload. This path is relative to the asset manifest
     *   location.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): FileSource {
        if (_executable.isNotEmpty()) cdkBuilder.executable(_executable)
        return cdkBuilder.build()
    }
}
