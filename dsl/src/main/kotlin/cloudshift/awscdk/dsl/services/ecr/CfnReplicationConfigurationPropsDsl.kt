@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps

@CdkDslMarker
public class CfnReplicationConfigurationPropsDsl {
  private val cdkBuilder: CfnReplicationConfigurationProps.Builder =
      CfnReplicationConfigurationProps.builder()

  public fun replicationConfiguration(replicationConfiguration: IResolvable) {
    cdkBuilder.replicationConfiguration(replicationConfiguration)
  }

  public
      fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty) {
    cdkBuilder.replicationConfiguration(replicationConfiguration)
  }

  public fun build(): CfnReplicationConfigurationProps = cdkBuilder.build()
}
