@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnDomainConfiguration

/**
 * An object that specifies the TLS configuration for a domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * TlsConfigProperty tlsConfigProperty = TlsConfigProperty.builder()
 * .securityPolicy("securityPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-tlsconfig.html)
 */
@CdkDslMarker
public class CfnDomainConfigurationTlsConfigPropertyDsl {
  private val cdkBuilder: CfnDomainConfiguration.TlsConfigProperty.Builder =
      CfnDomainConfiguration.TlsConfigProperty.builder()

  /**
   * @param securityPolicy The security policy for a domain configuration.
   * For more information, see [Security
   * policies](https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table)
   * in the *AWS IoT Core developer guide* .
   */
  public fun securityPolicy(securityPolicy: String) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  public fun build(): CfnDomainConfiguration.TlsConfigProperty = cdkBuilder.build()
}
