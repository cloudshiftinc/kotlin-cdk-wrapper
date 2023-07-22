@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Details for SASL/IAM client authentication for VpcConnectivity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * VpcConnectivityIamProperty vpcConnectivityIamProperty = VpcConnectivityIamProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityiam.html)
 */
@CdkDslMarker
public class CfnClusterVpcConnectivityIamPropertyDsl {
  private val cdkBuilder: CfnCluster.VpcConnectivityIamProperty.Builder =
      CfnCluster.VpcConnectivityIamProperty.builder()

  /**
   * @param enabled SASL/IAM authentication is enabled or not. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled SASL/IAM authentication is enabled or not. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnCluster.VpcConnectivityIamProperty = cdkBuilder.build()
}
