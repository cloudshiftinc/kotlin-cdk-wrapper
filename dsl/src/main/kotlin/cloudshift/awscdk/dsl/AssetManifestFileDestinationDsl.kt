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
import software.amazon.awscdk.AssetManifestFileDestination
import software.amazon.awscdk.RoleOptions
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class AssetManifestFileDestinationDsl {
    private val cdkBuilder: AssetManifestFileDestination.Builder =
        AssetManifestFileDestination.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun role(block: RoleOptionsDsl.() -> Unit = {}) {
        val builder = RoleOptionsDsl()
        builder.apply(block)
        cdkBuilder.role(builder.build())
    }

    public fun role(role: RoleOptions) {
        cdkBuilder.role(role)
    }

    public fun build(): AssetManifestFileDestination = cdkBuilder.build()
}
