@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Details for client authentication using SASL.
 *
 * To turn on SASL, you must also turn on `EncryptionInTransit` by setting `inCluster` to true. You
 * must set `clientBroker` to either `TLS` or `TLS_PLAINTEXT` . If you choose `TLS_PLAINTEXT` , then
 * you must also set `unauthenticated` to true.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * SaslProperty saslProperty = SaslProperty.builder()
 * .iam(IamProperty.builder()
 * .enabled(false)
 * .build())
 * .scram(ScramProperty.builder()
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-sasl.html)
 */
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
