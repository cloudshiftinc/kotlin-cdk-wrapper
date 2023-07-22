@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Contains information about provisioned throughput for EBS storage volumes attached to kafka
 * broker nodes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * ProvisionedThroughputProperty provisionedThroughputProperty =
 * ProvisionedThroughputProperty.builder()
 * .enabled(false)
 * .volumeThroughput(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-provisionedthroughput.html)
 */
@CdkDslMarker
public class CfnClusterProvisionedThroughputPropertyDsl {
  private val cdkBuilder: CfnCluster.ProvisionedThroughputProperty.Builder =
      CfnCluster.ProvisionedThroughputProperty.builder()

  /**
   * @param enabled Provisioned throughput is enabled or not.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Provisioned throughput is enabled or not.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param volumeThroughput Throughput value of the EBS volumes for the data drive on each kafka
   * broker node in MiB per second.
   */
  public fun volumeThroughput(volumeThroughput: Number) {
    cdkBuilder.volumeThroughput(volumeThroughput)
  }

  public fun build(): CfnCluster.ProvisionedThroughputProperty = cdkBuilder.build()
}
