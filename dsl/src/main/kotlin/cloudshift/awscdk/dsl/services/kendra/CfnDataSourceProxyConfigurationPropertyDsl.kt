@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceProxyConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ProxyConfigurationProperty.Builder =
      CfnDataSource.ProxyConfigurationProperty.builder()

  public fun credentials(credentials: String) {
    cdkBuilder.credentials(credentials)
  }

  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDataSource.ProxyConfigurationProperty = cdkBuilder.build()
}
