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
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import kotlin.String

@CdkDslMarker
public class CfnReplicationSetRegionConfigurationPropertyDsl {
    private val cdkBuilder: CfnReplicationSet.RegionConfigurationProperty.Builder =
        CfnReplicationSet.RegionConfigurationProperty.builder()

    public fun sseKmsKeyId(sseKmsKeyId: String) {
        cdkBuilder.sseKmsKeyId(sseKmsKeyId)
    }

    public fun build(): CfnReplicationSet.RegionConfigurationProperty = cdkBuilder.build()
}
