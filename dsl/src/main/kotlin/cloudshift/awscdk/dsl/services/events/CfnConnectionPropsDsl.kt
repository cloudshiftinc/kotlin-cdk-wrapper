@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection
import software.amazon.awscdk.services.events.CfnConnectionProps

@CdkDslMarker
public class CfnConnectionPropsDsl {
  private val cdkBuilder: CfnConnectionProps.Builder = CfnConnectionProps.builder()

  /**
   * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
   * authorization parameters to use to authorize with the endpoint. 
   */
  public fun authParameters(authParameters: IResolvable) {
    cdkBuilder.authParameters(authParameters)
  }

  /**
   * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
   * authorization parameters to use to authorize with the endpoint. 
   */
  public fun authParameters(authParameters: CfnConnection.AuthParametersProperty) {
    cdkBuilder.authParameters(authParameters)
  }

  /**
   * @param authorizationType The type of authorization to use for the connection. 
   *
   * OAUTH tokens are refreshed when a 401 or 407 response is returned.
   */
  public fun authorizationType(authorizationType: String) {
    cdkBuilder.authorizationType(authorizationType)
  }

  /**
   * @param description A description for the connection to create.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name for the connection to create.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnConnectionProps = cdkBuilder.build()
}
