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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.pipelines.FileSet
import software.amazon.awscdk.pipelines.FileSetLocation

/**
 * Location of a FileSet consumed or produced by a ShellStep.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.pipelines.*;
 * FileSet fileSet;
 * FileSetLocation fileSetLocation = FileSetLocation.builder()
 * .directory("directory")
 * .fileSet(fileSet)
 * .build();
 * ```
 */
@CdkDslMarker
public class FileSetLocationDsl {
    private val cdkBuilder: FileSetLocation.Builder = FileSetLocation.builder()

    /** @param directory The (relative) directory where the FileSet is found. */
    public fun directory(directory: String) {
        cdkBuilder.directory(directory)
    }

    /** @param fileSet The FileSet object. */
    public fun fileSet(fileSet: FileSet) {
        cdkBuilder.fileSet(fileSet)
    }

    public fun build(): FileSetLocation = cdkBuilder.build()
}
