@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.licensemanager.CfnLicense

@CdkDslMarker
public class CfnLicenseMetadataPropertyDsl {
  private val cdkBuilder: CfnLicense.MetadataProperty.Builder =
      CfnLicense.MetadataProperty.builder()

  /**
   * @param name The key name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnLicense.MetadataProperty = cdkBuilder.build()
}
