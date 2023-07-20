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

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.panorama.CfnPackage
import kotlin.String

@CdkDslMarker
public class CfnPackageStorageLocationPropertyDsl {
    private val cdkBuilder: CfnPackage.StorageLocationProperty.Builder =
        CfnPackage.StorageLocationProperty.builder()

    public fun binaryPrefixLocation(binaryPrefixLocation: String) {
        cdkBuilder.binaryPrefixLocation(binaryPrefixLocation)
    }

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun generatedPrefixLocation(generatedPrefixLocation: String) {
        cdkBuilder.generatedPrefixLocation(generatedPrefixLocation)
    }

    public fun manifestPrefixLocation(manifestPrefixLocation: String) {
        cdkBuilder.manifestPrefixLocation(manifestPrefixLocation)
    }

    public fun repoPrefixLocation(repoPrefixLocation: String) {
        cdkBuilder.repoPrefixLocation(repoPrefixLocation)
    }

    public fun build(): CfnPackage.StorageLocationProperty = cdkBuilder.build()
}
