@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Includes all client authentication information for VpcConnectivity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * VpcConnectivityClientAuthenticationProperty vpcConnectivityClientAuthenticationProperty =
 * VpcConnectivityClientAuthenticationProperty.builder()
 * .sasl(VpcConnectivitySaslProperty.builder()
 * .iam(VpcConnectivityIamProperty.builder()
 * .enabled(false)
 * .build())
 * .scram(VpcConnectivityScramProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .tls(VpcConnectivityTlsProperty.builder()
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityclientauthentication.html)
 */
@CdkDslMarker
public class CfnClusterVpcConnectivityClientAuthenticationPropertyDsl {
  private val cdkBuilder: CfnCluster.VpcConnectivityClientAuthenticationProperty.Builder =
      CfnCluster.VpcConnectivityClientAuthenticationProperty.builder()

  /**
   * @param sasl Details for VpcConnectivity ClientAuthentication using SASL.
   */
  public fun sasl(sasl: IResolvable) {
    cdkBuilder.sasl(sasl)
  }

  /**
   * @param sasl Details for VpcConnectivity ClientAuthentication using SASL.
   */
  public fun sasl(sasl: CfnCluster.VpcConnectivitySaslProperty) {
    cdkBuilder.sasl(sasl)
  }

  /**
   * @param tls Details for VpcConnectivity ClientAuthentication using TLS.
   */
  public fun tls(tls: IResolvable) {
    cdkBuilder.tls(tls)
  }

  /**
   * @param tls Details for VpcConnectivity ClientAuthentication using TLS.
   */
  public fun tls(tls: CfnCluster.VpcConnectivityTlsProperty) {
    cdkBuilder.tls(tls)
  }

  public fun build(): CfnCluster.VpcConnectivityClientAuthenticationProperty = cdkBuilder.build()
}
