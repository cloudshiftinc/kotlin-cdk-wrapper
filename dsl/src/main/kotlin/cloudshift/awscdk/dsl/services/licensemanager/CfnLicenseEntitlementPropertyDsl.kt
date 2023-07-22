@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense

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
