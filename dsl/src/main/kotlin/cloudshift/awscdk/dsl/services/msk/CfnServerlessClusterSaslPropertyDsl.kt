@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster

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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-serverlesscluster-sasl.html)
 */
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
