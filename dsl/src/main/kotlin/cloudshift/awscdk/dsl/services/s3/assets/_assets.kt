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

package cloudshift.awscdk.dsl.services.s3.assets

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.assets.Asset
import software.amazon.awscdk.services.s3.assets.AssetOptions
import software.amazon.awscdk.services.s3.assets.AssetProps
import software.constructs.Construct

public object assets {
    /**
     * An asset represents a local file or directory, which is automatically uploaded to S3 and then
     * can be referenced within a CDK application.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * Asset asset = Asset.Builder.create(this, "BundledAsset")
     * .path("/path/to/asset")
     * .bundling(BundlingOptions.builder()
     * .image(DockerImage.fromRegistry("alpine"))
     * .command(List.of("command-that-produces-an-archive.sh"))
     * .outputType(BundlingOutput.NOT_ARCHIVED)
     * .build())
     * .build();
     * ```
     */
    public inline fun asset(
        scope: Construct,
        id: String,
        block: AssetDsl.() -> Unit = {},
    ): Asset {
        val builder = AssetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Function.Builder.create(this, "Function")
     * .code(Code.fromAsset(join(__dirname, "my-python-handler"), AssetOptions.builder()
     * .bundling(BundlingOptions.builder()
     * .image(Runtime.PYTHON_3_9.getBundlingImage())
     * .command(List.of("bash", "-c", "pip install -r requirements.txt -t /asset-output &amp;&amp;
     * cp -au . /asset-output"))
     * .build())
     * .build()))
     * .runtime(Runtime.PYTHON_3_9)
     * .handler("index.handler")
     * .build();
     * ```
     */
    public inline fun assetOptions(block: AssetOptionsDsl.() -> Unit = {}): AssetOptions {
        val builder = AssetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * Asset asset = Asset.Builder.create(this, "BundledAsset")
     * .path("/path/to/asset")
     * .bundling(BundlingOptions.builder()
     * .image(DockerImage.fromRegistry("alpine"))
     * .command(List.of("command-that-produces-an-archive.sh"))
     * .outputType(BundlingOutput.NOT_ARCHIVED)
     * .build())
     * .build();
     * ```
     */
    public inline fun assetProps(block: AssetPropsDsl.() -> Unit = {}): AssetProps {
        val builder = AssetPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
