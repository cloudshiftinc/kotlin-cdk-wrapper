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
import kotlin.String

@CdkDslMarker
public class CfnProjectProjectFileSystemLocationPropertyDsl {
    private val cdkBuilder: CfnProject.ProjectFileSystemLocationProperty.Builder =
        CfnProject.ProjectFileSystemLocationProperty.builder()

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    public fun mountOptions(mountOptions: String) {
        cdkBuilder.mountOptions(mountOptions)
    }

    public fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.ProjectFileSystemLocationProperty = cdkBuilder.build()
}
