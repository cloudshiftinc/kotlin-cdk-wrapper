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

  /**
   * @param credentials Your secret ARN, which you can create in [AWS Secrets
   * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
   * The credentials are optional. You use a secret if web proxy credentials are required to connect
   * to a website host. Amazon Kendra currently support basic authentication to connect to a web proxy
   * server. The secret stores your credentials.
   */
  public fun credentials(credentials: String) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * @param host The name of the website host you want to connect to via a web proxy server. 
   * For example, the host name of https://a.example.com/page1.html is "a.example.com".
   */
  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  /**
   * @param port The port number of the website host you want to connect to via a web proxy server. 
   * For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDataSource.ProxyConfigurationProperty = cdkBuilder.build()
}
