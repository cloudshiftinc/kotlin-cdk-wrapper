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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ArtifactsConfig
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * The type returned from `IArtifacts#bind`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * ArtifactsConfig artifactsConfig = ArtifactsConfig.builder()
 * .artifactsProperty(ArtifactsProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .artifactIdentifier("artifactIdentifier")
 * .encryptionDisabled(false)
 * .location("location")
 * .name("name")
 * .namespaceType("namespaceType")
 * .overrideArtifactName(false)
 * .packaging("packaging")
 * .path("path")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ArtifactsConfigDsl {
    private val cdkBuilder: ArtifactsConfig.Builder = ArtifactsConfig.builder()

    /** @param artifactsProperty The low-level CloudFormation artifacts property. */
    public fun artifactsProperty(
        artifactsProperty: CfnProjectArtifactsPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnProjectArtifactsPropertyDsl()
        builder.apply(artifactsProperty)
        cdkBuilder.artifactsProperty(builder.build())
    }

    /** @param artifactsProperty The low-level CloudFormation artifacts property. */
    public fun artifactsProperty(artifactsProperty: CfnProject.ArtifactsProperty) {
        cdkBuilder.artifactsProperty(artifactsProperty)
    }

    public fun build(): ArtifactsConfig = cdkBuilder.build()
}
