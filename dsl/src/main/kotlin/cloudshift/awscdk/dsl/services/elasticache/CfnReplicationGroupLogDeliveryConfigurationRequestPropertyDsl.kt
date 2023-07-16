@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@CdkDslMarker
public class CfnReplicationGroupLogDeliveryConfigurationRequestPropertyDsl {
  private val cdkBuilder: CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.Builder =
      CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.builder()

  public fun destinationDetails(destinationDetails: IResolvable) {
    cdkBuilder.destinationDetails(destinationDetails)
  }

  public
      fun destinationDetails(destinationDetails: CfnReplicationGroup.DestinationDetailsProperty) {
    cdkBuilder.destinationDetails(destinationDetails)
  }

  public fun destinationType(destinationType: String) {
    cdkBuilder.destinationType(destinationType)
  }

  public fun logFormat(logFormat: String) {
    cdkBuilder.logFormat(logFormat)
  }

  public fun logType(logType: String) {
    cdkBuilder.logType(logType)
  }

  public fun build(): CfnReplicationGroup.LogDeliveryConfigurationRequestProperty =
      cdkBuilder.build()
}
