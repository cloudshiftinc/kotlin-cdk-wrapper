@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import kotlin.String

@CdkDslMarker
public class CfnReplicationSetReplicationRegionPropertyDsl {
    private val cdkBuilder: CfnReplicationSet.ReplicationRegionProperty.Builder =
        CfnReplicationSet.ReplicationRegionProperty.builder()

    public fun regionConfiguration(regionConfiguration: IResolvable) {
        cdkBuilder.regionConfiguration(regionConfiguration)
    }

    public fun regionConfiguration(regionConfiguration: CfnReplicationSet.RegionConfigurationProperty) {
        cdkBuilder.regionConfiguration(regionConfiguration)
    }

    public fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
    }

    public fun build(): CfnReplicationSet.ReplicationRegionProperty = cdkBuilder.build()
}
