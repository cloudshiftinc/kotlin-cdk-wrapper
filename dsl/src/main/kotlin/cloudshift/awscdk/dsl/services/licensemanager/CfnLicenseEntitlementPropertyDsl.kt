@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * Describes a resource entitled for use with a license.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * EntitlementProperty entitlementProperty = EntitlementProperty.builder()
 * .name("name")
 * .unit("unit")
 * // the properties below are optional
 * .allowCheckIn(false)
 * .maxCount(123)
 * .overage(false)
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html)
 */
@CdkDslMarker
public class CfnLicenseEntitlementPropertyDsl {
    private val cdkBuilder: CfnLicense.EntitlementProperty.Builder =
        CfnLicense.EntitlementProperty.builder()

    /**
     * @param allowCheckIn Indicates whether check-ins are allowed.
     */
    public fun allowCheckIn(allowCheckIn: Boolean) {
        cdkBuilder.allowCheckIn(allowCheckIn)
    }

    /**
     * @param allowCheckIn Indicates whether check-ins are allowed.
     */
    public fun allowCheckIn(allowCheckIn: IResolvable) {
        cdkBuilder.allowCheckIn(allowCheckIn)
    }

    /**
     * @param maxCount Maximum entitlement count.
     * Use if the unit is not None.
     */
    public fun maxCount(maxCount: Number) {
        cdkBuilder.maxCount(maxCount)
    }

    /**
     * @param name Entitlement name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param overage Indicates whether overages are allowed.
     */
    public fun overage(overage: Boolean) {
        cdkBuilder.overage(overage)
    }

    /**
     * @param overage Indicates whether overages are allowed.
     */
    public fun overage(overage: IResolvable) {
        cdkBuilder.overage(overage)
    }

    /**
     * @param unit Entitlement unit.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    /**
     * @param value Entitlement resource.
     * Use only if the unit is None.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnLicense.EntitlementProperty = cdkBuilder.build()
}
