@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Details for client authentication using SASL for VpcConnectivity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * VpcConnectivitySaslProperty vpcConnectivitySaslProperty = VpcConnectivitySaslProperty.builder()
 * .iam(VpcConnectivityIamProperty.builder()
 * .enabled(false)
 * .build())
 * .scram(VpcConnectivityScramProperty.builder()
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitysasl.html)
 */
@CdkDslMarker
public class CfnClusterVpcConnectivitySaslPropertyDsl {
  private val cdkBuilder: CfnCluster.VpcConnectivitySaslProperty.Builder =
      CfnCluster.VpcConnectivitySaslProperty.builder()

  /**
   * @param iam Details for ClientAuthentication using IAM for VpcConnectivity.
   */
  public fun iam(iam: IResolvable) {
    cdkBuilder.iam(iam)
  }

  /**
   * @param iam Details for ClientAuthentication using IAM for VpcConnectivity.
   */
  public fun iam(iam: CfnCluster.VpcConnectivityIamProperty) {
    cdkBuilder.iam(iam)
  }

  /**
   * @param scram Details for SASL/SCRAM client authentication for VpcConnectivity.
   */
  public fun scram(scram: IResolvable) {
    cdkBuilder.scram(scram)
  }

  /**
   * @param scram Details for SASL/SCRAM client authentication for VpcConnectivity.
   */
  public fun scram(scram: CfnCluster.VpcConnectivityScramProperty) {
    cdkBuilder.scram(scram)
  }

  public fun build(): CfnCluster.VpcConnectivitySaslProperty = cdkBuilder.build()
}
