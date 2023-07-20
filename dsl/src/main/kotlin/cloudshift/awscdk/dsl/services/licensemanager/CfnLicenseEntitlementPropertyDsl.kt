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

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLicenseEntitlementPropertyDsl {
    private val cdkBuilder: CfnLicense.EntitlementProperty.Builder =
        CfnLicense.EntitlementProperty.builder()

    public fun allowCheckIn(allowCheckIn: Boolean) {
        cdkBuilder.allowCheckIn(allowCheckIn)
    }

    public fun allowCheckIn(allowCheckIn: IResolvable) {
        cdkBuilder.allowCheckIn(allowCheckIn)
    }

    public fun maxCount(maxCount: Number) {
        cdkBuilder.maxCount(maxCount)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun overage(overage: Boolean) {
        cdkBuilder.overage(overage)
    }

    public fun overage(overage: IResolvable) {
        cdkBuilder.overage(overage)
    }

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnLicense.EntitlementProperty = cdkBuilder.build()
}
