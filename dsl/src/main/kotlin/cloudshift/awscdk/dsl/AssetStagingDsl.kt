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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.AssetHashType
import software.amazon.awscdk.AssetStaging
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AssetStagingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AssetStaging.Builder = AssetStaging.Builder.create(scope, id)

    private val _exclude: MutableList<String> = mutableListOf()

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

    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    public fun extraHash(extraHash: String) {
        cdkBuilder.extraHash(extraHash)
    }

    public fun follow(follow: SymlinkFollowMode) {
        cdkBuilder.follow(follow)
    }

    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): AssetStaging {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        return cdkBuilder.build()
    }
}
