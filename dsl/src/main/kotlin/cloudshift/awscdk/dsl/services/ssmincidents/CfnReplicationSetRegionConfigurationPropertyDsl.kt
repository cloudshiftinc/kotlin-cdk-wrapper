@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet

/**
 * The `RegionConfiguration` property specifies the Region and KMS key to add to the replication
 * set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * RegionConfigurationProperty regionConfigurationProperty = RegionConfigurationProperty.builder()
 * .sseKmsKeyId("sseKmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-regionconfiguration.html)
 */
@CdkDslMarker
public class CfnReplicationSetRegionConfigurationPropertyDsl {
  private val cdkBuilder: CfnReplicationSet.RegionConfigurationProperty.Builder =
      CfnReplicationSet.RegionConfigurationProperty.builder()

  /**
   * @param sseKmsKeyId The KMS key ID to use to encrypt your replication set. 
   */
  public fun sseKmsKeyId(sseKmsKeyId: String) {
    cdkBuilder.sseKmsKeyId(sseKmsKeyId)
  }

  public fun build(): CfnReplicationSet.RegionConfigurationProperty = cdkBuilder.build()
}
