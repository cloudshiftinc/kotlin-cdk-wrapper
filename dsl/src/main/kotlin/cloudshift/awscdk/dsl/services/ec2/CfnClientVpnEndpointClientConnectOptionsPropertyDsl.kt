@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@CdkDslMarker
public class CfnClientVpnEndpointClientConnectOptionsPropertyDsl {
  private val cdkBuilder: CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder =
      CfnClientVpnEndpoint.ClientConnectOptionsProperty.builder()

  /**
   * @param enabled Indicates whether client connect options are enabled. 
   * The default is `false` (not enabled).
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether client connect options are enabled. 
   * The default is `false` (not enabled).
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param lambdaFunctionArn The Amazon Resource Name (ARN) of the AWS Lambda function used for
   * connection authorization.
   */
  public fun lambdaFunctionArn(lambdaFunctionArn: String) {
    cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
  }

  public fun build(): CfnClientVpnEndpoint.ClientConnectOptionsProperty = cdkBuilder.build()
}
