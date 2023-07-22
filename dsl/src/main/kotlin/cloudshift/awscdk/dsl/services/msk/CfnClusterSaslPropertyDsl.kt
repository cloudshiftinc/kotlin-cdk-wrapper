@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterSaslPropertyDsl {
  private val cdkBuilder: CfnCluster.SaslProperty.Builder = CfnCluster.SaslProperty.builder()

  /**
   * @param iam Details for ClientAuthentication using IAM.
   */
  public fun iam(iam: IResolvable) {
    cdkBuilder.iam(iam)
  }

  /**
   * @param iam Details for ClientAuthentication using IAM.
   */
  public fun iam(iam: CfnCluster.IamProperty) {
    cdkBuilder.iam(iam)
  }

  /**
   * @param scram Details for SASL/SCRAM client authentication.
   */
  public fun scram(scram: IResolvable) {
    cdkBuilder.scram(scram)
  }

  /**
   * @param scram Details for SASL/SCRAM client authentication.
   */
  public fun scram(scram: CfnCluster.ScramProperty) {
    cdkBuilder.scram(scram)
  }

  public fun build(): CfnCluster.SaslProperty = cdkBuilder.build()
}
