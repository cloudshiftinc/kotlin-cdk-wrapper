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

package cloudshift.awscdk.dsl.services.ecr.assets

import software.amazon.awscdk.services.ecr.assets.DockerCacheOption
import software.amazon.awscdk.services.ecr.assets.DockerImageAsset
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps
import software.amazon.awscdk.services.ecr.assets.TarballImageAsset
import software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object assets {
    public inline fun dockerCacheOption(block: DockerCacheOptionDsl.() -> Unit = {}): DockerCacheOption {
        val builder = DockerCacheOptionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dockerImageAsset(
        scope: Construct,
        id: String,
        block: DockerImageAssetDsl.() -> Unit = {},
    ): DockerImageAsset {
        val builder = DockerImageAssetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun dockerImageAssetInvalidationOptions(
        block: DockerImageAssetInvalidationOptionsDsl.() -> Unit =
            {},
    ): DockerImageAssetInvalidationOptions {
        val builder = DockerImageAssetInvalidationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dockerImageAssetOptions(block: DockerImageAssetOptionsDsl.() -> Unit = {}): DockerImageAssetOptions {
        val builder = DockerImageAssetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dockerImageAssetProps(block: DockerImageAssetPropsDsl.() -> Unit = {}): DockerImageAssetProps {
        val builder = DockerImageAssetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tarballImageAsset(
        scope: Construct,
        id: String,
        block: TarballImageAssetDsl.() -> Unit = {},
    ): TarballImageAsset {
        val builder = TarballImageAssetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun tarballImageAssetProps(block: TarballImageAssetPropsDsl.() -> Unit = {}): TarballImageAssetProps {
        val builder = TarballImageAssetPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
