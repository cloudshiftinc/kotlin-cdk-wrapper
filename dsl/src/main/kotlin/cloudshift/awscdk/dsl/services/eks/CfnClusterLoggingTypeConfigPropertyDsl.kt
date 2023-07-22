@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnCluster

/**
 * The enabled logging type.
 *
 * For a list of the valid logging types, see the [`types` property of
 * `LogSetup`](https://docs.aws.amazon.com/eks/latest/APIReference/API_LogSetup.html#AmazonEKS-Type-LogSetup-types)
 * in the *Amazon EKS API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * LoggingTypeConfigProperty loggingTypeConfigProperty = LoggingTypeConfigProperty.builder()
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-loggingtypeconfig.html)
 */
@CdkDslMarker
public class CfnClusterLoggingTypeConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.LoggingTypeConfigProperty.Builder =
      CfnCluster.LoggingTypeConfigProperty.builder()

  /**
   * @param type The name of the log type.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCluster.LoggingTypeConfigProperty = cdkBuilder.build()
}
