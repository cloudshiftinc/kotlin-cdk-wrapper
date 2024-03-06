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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerCacheOption
import software.amazon.awscdk.services.ecr.assets.DockerImageAsset
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps
import software.amazon.awscdk.services.ecr.assets.TarballImageAsset
import software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps
import software.constructs.Construct

public object assets {
    /**
     * Options for configuring the Docker cache backend.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecr.assets.DockerImageAsset;
     * import software.amazon.awscdk.services.ecr.assets.Platform;
     * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
     * .directory(join(__dirname, "my-image"))
     * .cacheFrom(List.of(DockerCacheOption.builder().type("registry").params(Map.of("ref",
     * "ghcr.io/myorg/myimage:cache")).build()))
     * .cacheTo(DockerCacheOption.builder().type("registry").params(Map.of("ref",
     * "ghcr.io/myorg/myimage:cache", "mode", "max", "compression", "zstd")).build())
     * .build();
     * ```
     */
    public inline fun dockerCacheOption(
        block: DockerCacheOptionDsl.() -> Unit = {}
    ): DockerCacheOption {
        val builder = DockerCacheOptionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An asset that represents a Docker image.
     *
     * The image will be created in build time and uploaded to an ECR repository.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecr.assets.DockerImageAsset;
     * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
     * .directory(join(__dirname, "my-image"))
     * .buildArgs(Map.of(
     * "HTTP_PROXY", "http://10.20.30.2:1234"))
     * .invalidation(DockerImageAssetInvalidationOptions.builder()
     * .buildArgs(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun dockerImageAsset(
        scope: Construct,
        id: String,
        block: DockerImageAssetDsl.() -> Unit = {},
    ): DockerImageAsset {
        val builder = DockerImageAssetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to control invalidation of `DockerImageAsset` asset hashes.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecr.assets.DockerImageAsset;
     * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
     * .directory(join(__dirname, "my-image"))
     * .buildArgs(Map.of(
     * "HTTP_PROXY", "http://10.20.30.2:1234"))
     * .invalidation(DockerImageAssetInvalidationOptions.builder()
     * .buildArgs(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun dockerImageAssetInvalidationOptions(
        block: DockerImageAssetInvalidationOptionsDsl.() -> Unit = {}
    ): DockerImageAssetInvalidationOptions {
        val builder = DockerImageAssetInvalidationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for DockerImageAsset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecr.assets.*;
     * NetworkMode networkMode;
     * Platform platform;
     * DockerImageAssetOptions dockerImageAssetOptions = DockerImageAssetOptions.builder()
     * .assetName("assetName")
     * .buildArgs(Map.of(
     * "buildArgsKey", "buildArgs"))
     * .buildSecrets(Map.of(
     * "buildSecretsKey", "buildSecrets"))
     * .buildSsh("buildSsh")
     * .cacheDisabled(false)
     * .cacheFrom(List.of(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build()))
     * .cacheTo(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build())
     * .exclude(List.of("exclude"))
     * .extraHash("extraHash")
     * .file("file")
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .ignoreMode(IgnoreMode.GLOB)
     * .invalidation(DockerImageAssetInvalidationOptions.builder()
     * .buildArgs(false)
     * .buildSecrets(false)
     * .buildSsh(false)
     * .extraHash(false)
     * .file(false)
     * .networkMode(false)
     * .outputs(false)
     * .platform(false)
     * .repositoryName(false)
     * .target(false)
     * .build())
     * .networkMode(networkMode)
     * .outputs(List.of("outputs"))
     * .platform(platform)
     * .target("target")
     * .build();
     * ```
     */
    public inline fun dockerImageAssetOptions(
        block: DockerImageAssetOptionsDsl.() -> Unit = {}
    ): DockerImageAssetOptions {
        val builder = DockerImageAssetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for DockerImageAssets.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecr.assets.DockerImageAsset;
     * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
     * .directory(join(__dirname, "my-image"))
     * .buildArgs(Map.of(
     * "HTTP_PROXY", "http://10.20.30.2:1234"))
     * .invalidation(DockerImageAssetInvalidationOptions.builder()
     * .buildArgs(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun dockerImageAssetProps(
        block: DockerImageAssetPropsDsl.() -> Unit = {}
    ): DockerImageAssetProps {
        val builder = DockerImageAssetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun tarballImageAsset(
        scope: Construct,
        id: String,
        block: TarballImageAssetDsl.() -> Unit = {},
    ): TarballImageAsset {
        val builder = TarballImageAssetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for TarballImageAsset.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ecr.assets.TarballImageAsset;
     * TarballImageAsset asset = TarballImageAsset.Builder.create(this, "MyBuildImage")
     * .tarballFile("local-image.tar")
     * .build();
     * ```
     */
    public inline fun tarballImageAssetProps(
        block: TarballImageAssetPropsDsl.() -> Unit = {}
    ): TarballImageAssetProps {
        val builder = TarballImageAssetPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
