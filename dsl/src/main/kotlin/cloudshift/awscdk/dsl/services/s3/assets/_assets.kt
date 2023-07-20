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

package cloudshift.awscdk.dsl.services.s3.assets

import software.amazon.awscdk.services.s3.assets.Asset
import software.amazon.awscdk.services.s3.assets.AssetOptions
import software.amazon.awscdk.services.s3.assets.AssetProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object assets {
    public inline fun asset(
        scope: Construct,
        id: String,
        block: AssetDsl.() -> Unit = {},
    ): Asset {
        val builder = AssetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun assetOptions(block: AssetOptionsDsl.() -> Unit = {}): AssetOptions {
        val builder = AssetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun assetProps(block: AssetPropsDsl.() -> Unit = {}): AssetProps {
        val builder = AssetPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
