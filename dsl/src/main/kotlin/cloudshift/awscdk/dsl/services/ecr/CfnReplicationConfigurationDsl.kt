@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnReplicationConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReplicationConfiguration.Builder =
      CfnReplicationConfiguration.Builder.create(scope, id)

  /**
   * The replication configuration for a registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
   * @param replicationConfiguration The replication configuration for a registry. 
   */
  public fun replicationConfiguration(replicationConfiguration: IResolvable) {
    cdkBuilder.replicationConfiguration(replicationConfiguration)
  }

  /**
   * The replication configuration for a registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
   * @param replicationConfiguration The replication configuration for a registry. 
   */
  public
      fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty) {
    cdkBuilder.replicationConfiguration(replicationConfiguration)
  }

  public fun build(): CfnReplicationConfiguration = cdkBuilder.build()
}
