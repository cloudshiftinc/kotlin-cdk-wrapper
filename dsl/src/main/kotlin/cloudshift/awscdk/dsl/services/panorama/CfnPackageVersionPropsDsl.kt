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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnPackageVersionProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnPackageVersionPropsDsl {
    private val cdkBuilder: CfnPackageVersionProps.Builder = CfnPackageVersionProps.builder()

    public fun markLatest(markLatest: Boolean) {
        cdkBuilder.markLatest(markLatest)
    }

    public fun markLatest(markLatest: IResolvable) {
        cdkBuilder.markLatest(markLatest)
    }

    public fun ownerAccount(ownerAccount: String) {
        cdkBuilder.ownerAccount(ownerAccount)
    }

    public fun packageId(packageId: String) {
        cdkBuilder.packageId(packageId)
    }

    public fun packageVersion(packageVersion: String) {
        cdkBuilder.packageVersion(packageVersion)
    }

    public fun patchVersion(patchVersion: String) {
        cdkBuilder.patchVersion(patchVersion)
    }

    public fun updatedLatestPatchVersion(updatedLatestPatchVersion: String) {
        cdkBuilder.updatedLatestPatchVersion(updatedLatestPatchVersion)
    }

    public fun build(): CfnPackageVersionProps = cdkBuilder.build()
}
