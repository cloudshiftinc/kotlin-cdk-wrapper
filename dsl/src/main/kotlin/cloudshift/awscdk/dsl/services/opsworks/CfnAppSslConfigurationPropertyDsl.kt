@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnApp

@CdkDslMarker
public class CfnAppSslConfigurationPropertyDsl {
  private val cdkBuilder: CfnApp.SslConfigurationProperty.Builder =
      CfnApp.SslConfigurationProperty.builder()

  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  public fun chain(chain: String) {
    cdkBuilder.chain(chain)
  }

  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  public fun build(): CfnApp.SslConfigurationProperty = cdkBuilder.build()
}
