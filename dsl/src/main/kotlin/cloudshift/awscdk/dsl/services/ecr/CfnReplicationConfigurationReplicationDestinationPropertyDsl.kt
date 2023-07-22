@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

/**
 * An array of objects representing the destination for a replication rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * ReplicationDestinationProperty replicationDestinationProperty =
 * ReplicationDestinationProperty.builder()
 * .region("region")
 * .registryId("registryId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationdestination.html)
 */
@CdkDslMarker
public class CfnReplicationConfigurationReplicationDestinationPropertyDsl {
  private val cdkBuilder: CfnReplicationConfiguration.ReplicationDestinationProperty.Builder =
      CfnReplicationConfiguration.ReplicationDestinationProperty.builder()

  /**
   * @param region The Region to replicate to. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param registryId The AWS account ID of the Amazon ECR private registry to replicate to. 
   * When configuring cross-Region replication within your own registry, specify your own account
   * ID.
   */
  public fun registryId(registryId: String) {
    cdkBuilder.registryId(registryId)
  }

  public fun build(): CfnReplicationConfiguration.ReplicationDestinationProperty =
      cdkBuilder.build()
}
