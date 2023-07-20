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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.FileSystemConfig
import kotlin.Unit

@CdkDslMarker
public class FileSystemConfigDsl {
    private val cdkBuilder: FileSystemConfig.Builder = FileSystemConfig.builder()

    public fun location(block: CfnProjectProjectFileSystemLocationPropertyDsl.() -> Unit = {}) {
        val builder = CfnProjectProjectFileSystemLocationPropertyDsl()
        builder.apply(block)
        cdkBuilder.location(builder.build())
    }

    public fun location(location: CfnProject.ProjectFileSystemLocationProperty) {
        cdkBuilder.location(location)
    }

    public fun build(): FileSystemConfig = cdkBuilder.build()
}
