@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection
import software.constructs.Construct

@CdkDslMarker
public class CfnConnectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConnection.Builder = CfnConnection.Builder.create(scope, id)

  /**
   * A `CreateConnectionAuthRequestParameters` object that contains the authorization parameters to
   * use to authorize with the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
   * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
   * authorization parameters to use to authorize with the endpoint. 
   */
  public fun authParameters(authParameters: IResolvable) {
    cdkBuilder.authParameters(authParameters)
  }

  /**
   * A `CreateConnectionAuthRequestParameters` object that contains the authorization parameters to
   * use to authorize with the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
   * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
   * authorization parameters to use to authorize with the endpoint. 
   */
  public fun authParameters(authParameters: CfnConnection.AuthParametersProperty) {
    cdkBuilder.authParameters(authParameters)
  }

  /**
   * The type of authorization to use for the connection.
   *
   *
   * OAUTH tokens are refreshed when a 401 or 407 response is returned.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authorizationtype)
   * @param authorizationType The type of authorization to use for the connection. 
   */
  public fun authorizationType(authorizationType: String) {
    cdkBuilder.authorizationType(authorizationType)
  }

  /**
   * A description for the connection to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-description)
   * @param description A description for the connection to create. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name for the connection to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-name)
   * @param name The name for the connection to create. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnConnection = cdkBuilder.build()
}
