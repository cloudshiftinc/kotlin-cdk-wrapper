@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnApp

@CdkDslMarker
public class CfnAppSslConfigurationPropertyDsl {
  private val cdkBuilder: CfnApp.SslConfigurationProperty.Builder =
      CfnApp.SslConfigurationProperty.builder()

  /**
   * @param certificate The contents of the certificate's domain.crt file.
   */
  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param chain Optional.
   * Can be used to specify an intermediate certificate authority key or client authentication.
   */
  public fun chain(chain: String) {
    cdkBuilder.chain(chain)
  }

  /**
   * @param privateKey The private key;.
   * the contents of the certificate's domain.kex file.
   */
  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  public fun build(): CfnApp.SslConfigurationProperty = cdkBuilder.build()
}
