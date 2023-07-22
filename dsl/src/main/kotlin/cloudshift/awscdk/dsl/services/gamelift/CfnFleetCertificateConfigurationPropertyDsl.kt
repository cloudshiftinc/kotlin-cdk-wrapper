@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * Determines whether a TLS/SSL certificate is generated for a fleet.
 *
 * This feature must be enabled when creating the fleet. All instances in a fleet share the same
 * certificate. The certificate can be retrieved by calling the [GameLift Server
 * SDK](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html) operation
 * `GetInstanceCertificate` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CertificateConfigurationProperty certificateConfigurationProperty =
 * CertificateConfigurationProperty.builder()
 * .certificateType("certificateType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html)
 */
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
