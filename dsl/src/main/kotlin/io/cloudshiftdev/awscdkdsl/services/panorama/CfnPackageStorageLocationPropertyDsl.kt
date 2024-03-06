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

package io.cloudshiftdev.awscdkdsl.services.panorama

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.panorama.CfnPackage

/**
 * A storage location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * StorageLocationProperty storageLocationProperty = StorageLocationProperty.builder()
 * .binaryPrefixLocation("binaryPrefixLocation")
 * .bucket("bucket")
 * .generatedPrefixLocation("generatedPrefixLocation")
 * .manifestPrefixLocation("manifestPrefixLocation")
 * .repoPrefixLocation("repoPrefixLocation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html)
 */
@CdkDslMarker
public class CfnPackageStorageLocationPropertyDsl {
    private val cdkBuilder: CfnPackage.StorageLocationProperty.Builder =
        CfnPackage.StorageLocationProperty.builder()

    /** @param binaryPrefixLocation The location's binary prefix. */
    public fun binaryPrefixLocation(binaryPrefixLocation: String) {
        cdkBuilder.binaryPrefixLocation(binaryPrefixLocation)
    }

    /** @param bucket The location's bucket. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param generatedPrefixLocation The location's generated prefix. */
    public fun generatedPrefixLocation(generatedPrefixLocation: String) {
        cdkBuilder.generatedPrefixLocation(generatedPrefixLocation)
    }

    /** @param manifestPrefixLocation The location's manifest prefix. */
    public fun manifestPrefixLocation(manifestPrefixLocation: String) {
        cdkBuilder.manifestPrefixLocation(manifestPrefixLocation)
    }

    /** @param repoPrefixLocation The location's repo prefix. */
    public fun repoPrefixLocation(repoPrefixLocation: String) {
        cdkBuilder.repoPrefixLocation(repoPrefixLocation)
    }

    public fun build(): CfnPackage.StorageLocationProperty = cdkBuilder.build()
}
