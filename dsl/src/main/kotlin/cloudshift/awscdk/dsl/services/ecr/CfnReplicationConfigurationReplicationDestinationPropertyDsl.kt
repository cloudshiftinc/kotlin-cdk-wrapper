@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@CdkDslMarker
public class CfnReplicationConfigurationReplicationDestinationPropertyDsl {
  private val cdkBuilder: CfnReplicationConfiguration.ReplicationDestinationProperty.Builder =
      CfnReplicationConfiguration.ReplicationDestinationProperty.builder()

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun registryId(registryId: String) {
    cdkBuilder.registryId(registryId)
  }

  public fun build(): CfnReplicationConfiguration.ReplicationDestinationProperty =
      cdkBuilder.build()
}
