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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.FileSystemConfig

/**
 * The type returned from `IFileSystemLocation#bind`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * FileSystemConfig fileSystemConfig = FileSystemConfig.builder()
 * .location(ProjectFileSystemLocationProperty.builder()
 * .identifier("identifier")
 * .location("location")
 * .mountPoint("mountPoint")
 * .type("type")
 * // the properties below are optional
 * .mountOptions("mountOptions")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class FileSystemConfigDsl {
    private val cdkBuilder: FileSystemConfig.Builder = FileSystemConfig.builder()

    /** @param location File system location wrapper property. */
    public fun location(location: CfnProjectProjectFileSystemLocationPropertyDsl.() -> Unit = {}) {
        val builder = CfnProjectProjectFileSystemLocationPropertyDsl()
        builder.apply(location)
        cdkBuilder.location(builder.build())
    }

    /** @param location File system location wrapper property. */
    public fun location(location: CfnProject.ProjectFileSystemLocationProperty) {
        cdkBuilder.location(location)
    }

    public fun build(): FileSystemConfig = cdkBuilder.build()
}
