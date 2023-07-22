@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster

@CdkDslMarker
public class CfnServerlessClusterSaslPropertyDsl {
  private val cdkBuilder: CfnServerlessCluster.SaslProperty.Builder =
      CfnServerlessCluster.SaslProperty.builder()

  /**
   * @param iam Details for ClientAuthentication using IAM. 
   */
  public fun iam(iam: IResolvable) {
    cdkBuilder.iam(iam)
  }

  /**
   * @param iam Details for ClientAuthentication using IAM. 
   */
  public fun iam(iam: CfnServerlessCluster.IamProperty) {
    cdkBuilder.iam(iam)
  }

  public fun build(): CfnServerlessCluster.SaslProperty = cdkBuilder.build()
}
