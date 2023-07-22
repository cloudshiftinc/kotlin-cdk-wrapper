@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet

@CdkDslMarker
public class CfnReplicationSetReplicationRegionPropertyDsl {
  private val cdkBuilder: CfnReplicationSet.ReplicationRegionProperty.Builder =
      CfnReplicationSet.ReplicationRegionProperty.builder()

  /**
   * @param regionConfiguration Specifies the Region configuration.
   */
  public fun regionConfiguration(regionConfiguration: IResolvable) {
    cdkBuilder.regionConfiguration(regionConfiguration)
  }

  /**
   * @param regionConfiguration Specifies the Region configuration.
   */
  public
      fun regionConfiguration(regionConfiguration: CfnReplicationSet.RegionConfigurationProperty) {
    cdkBuilder.regionConfiguration(regionConfiguration)
  }

  /**
   * @param regionName Specifies the region name to add to the replication set.
   */
  public fun regionName(regionName: String) {
    cdkBuilder.regionName(regionName)
  }

  public fun build(): CfnReplicationSet.ReplicationRegionProperty = cdkBuilder.build()
}
