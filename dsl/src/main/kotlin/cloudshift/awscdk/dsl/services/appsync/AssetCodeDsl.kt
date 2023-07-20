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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.BundlingOptionsDsl
import software.amazon.awscdk.AssetHashType
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.amazon.awscdk.services.appsync.AssetCode
import software.amazon.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AssetCodeDsl(
    path: String,
) {
    private val cdkBuilder: AssetCode.Builder = AssetCode.Builder.create(path)

    private val _exclude: MutableList<String> = mutableListOf()

    private val _readers: MutableList<IGrantable> = mutableListOf()

    public fun assetHash(assetHash: String) {
        cdkBuilder.assetHash(assetHash)
    }

    public fun assetHashType(assetHashType: AssetHashType) {
        cdkBuilder.assetHashType(assetHashType)
    }

    public fun bundling(block: BundlingOptionsDsl.() -> Unit = {}) {
        val builder = BundlingOptionsDsl()
        builder.apply(block)
        cdkBuilder.bundling(builder.build())
    }

    public fun bundling(bundling: BundlingOptions) {
        cdkBuilder.bundling(bundling)
    }

    public fun deployTime(deployTime: Boolean) {
        cdkBuilder.deployTime(deployTime)
    }

    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    public fun readers(vararg readers: IGrantable) {
        _readers.addAll(listOf(*readers))
    }

    public fun readers(readers: Collection<IGrantable>) {
        _readers.addAll(readers)
    }

    public fun build(): AssetCode {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_readers.isNotEmpty()) cdkBuilder.readers(_readers)
        return cdkBuilder.build()
    }
}
