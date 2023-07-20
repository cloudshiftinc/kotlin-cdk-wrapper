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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnProjectArtifactsPropertyDsl {
    private val cdkBuilder: CfnProject.ArtifactsProperty.Builder =
        CfnProject.ArtifactsProperty.builder()

    public fun artifactIdentifier(artifactIdentifier: String) {
        cdkBuilder.artifactIdentifier(artifactIdentifier)
    }

    public fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
    }

    public fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
    }

    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun namespaceType(namespaceType: String) {
        cdkBuilder.namespaceType(namespaceType)
    }

    public fun overrideArtifactName(overrideArtifactName: Boolean) {
        cdkBuilder.overrideArtifactName(overrideArtifactName)
    }

    public fun overrideArtifactName(overrideArtifactName: IResolvable) {
        cdkBuilder.overrideArtifactName(overrideArtifactName)
    }

    public fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.ArtifactsProperty = cdkBuilder.build()
}
