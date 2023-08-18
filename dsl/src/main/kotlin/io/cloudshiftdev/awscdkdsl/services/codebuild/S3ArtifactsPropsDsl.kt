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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codebuild.S3ArtifactsProps
import software.amazon.awscdk.services.s3.IBucket

/**
 * Construction properties for `S3Artifacts`.
 *
 * Example:
 * ```
 * Bucket bucket;
 * Project project = Project.Builder.create(this, "MyProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2")))
 * .artifacts(Artifacts.s3(S3ArtifactsProps.builder()
 * .bucket(bucket)
 * .includeBuildId(false)
 * .packageZip(true)
 * .path("another/path")
 * .identifier("AddArtifact1")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class S3ArtifactsPropsDsl {
    private val cdkBuilder: S3ArtifactsProps.Builder = S3ArtifactsProps.builder()

    /** @param bucket The name of the output bucket. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param encryption If this is false, build output will not be encrypted. This is useful if the
     *   artifact to publish a static website or sharing content with others
     */
    public fun encryption(encryption: Boolean) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * @param identifier The artifact identifier. This property is required on secondary artifacts.
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /**
     * @param includeBuildId Indicates if the build ID should be included in the path. If this is
     *   set to true, then the build artifact will be stored in "<path>/<build-id>/<name>".
     */
    public fun includeBuildId(includeBuildId: Boolean) {
        cdkBuilder.includeBuildId(includeBuildId)
    }

    /**
     * @param name The name of the build output ZIP file or folder inside the bucket. The full S3
     *   object key will be "<path>/<build-id>/<name>" or "<path>/<name>" depending on whether
     *   `includeBuildId` is set to true.
     *
     * If not set, `overrideArtifactName` will be set and the name from the buildspec will be used
     * instead.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param packageZip If this is true, all build output will be packaged into a single .zip file.
     *   Otherwise, all files will be uploaded to <path>/<name>.
     */
    public fun packageZip(packageZip: Boolean) {
        cdkBuilder.packageZip(packageZip)
    }

    /**
     * @param path The path inside of the bucket for the build output .zip file or folder. If a
     *   value is not specified, then build output will be stored at the root of the bucket (or
     *   under the <build-id> directory if `includeBuildId` is set to true).
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): S3ArtifactsProps = cdkBuilder.build()
}
