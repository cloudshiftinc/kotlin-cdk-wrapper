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

package io.cloudshiftdev.awscdkdsl.services.ecr.assets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.assets.TarballImageAsset
import software.constructs.Construct

/**
 * An asset that represents a Docker image.
 *
 * The image will loaded from an existing tarball and uploaded to an ECR repository.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ecr.assets.TarballImageAsset;
 * TarballImageAsset asset = TarballImageAsset.Builder.create(this, "MyBuildImage")
 * .tarballFile("local-image.tar")
 * .build();
 * ```
 */
@CdkDslMarker
public class TarballImageAssetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TarballImageAsset.Builder = TarballImageAsset.Builder.create(scope, id)

    /**
     * Absolute path to the tarball.
     *
     * It is recommended to to use the script running directory (e.g. `__dirname` in Node.js
     * projects or dirname of `__file__` in Python) if your tarball is located as a resource inside
     * your project.
     *
     * @param tarballFile Absolute path to the tarball.
     */
    public fun tarballFile(tarballFile: String) {
        cdkBuilder.tarballFile(tarballFile)
    }

    public fun build(): TarballImageAsset = cdkBuilder.build()
}
