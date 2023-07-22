@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

@CdkDslMarker
public class CfnFleetCertificateConfigurationPropertyDsl {
  private val cdkBuilder: CfnFleet.CertificateConfigurationProperty.Builder =
      CfnFleet.CertificateConfigurationProperty.builder()

  /**
   * @param certificateType Indicates whether a TLS/SSL certificate is generated for a fleet. 
   * Valid values include:
   *
   * * *GENERATED* - Generate a TLS/SSL certificate for this fleet.
   * * *DISABLED* - (default) Do not generate a TLS/SSL certificate for this fleet.
   */
  public fun certificateType(certificateType: String) {
    cdkBuilder.certificateType(certificateType)
  }

  public fun build(): CfnFleet.CertificateConfigurationProperty = cdkBuilder.build()
}
