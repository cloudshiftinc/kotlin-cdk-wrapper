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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import kotlin.String

@CdkDslMarker
public class CfnReplicationConfigurationRepositoryFilterPropertyDsl {
    private val cdkBuilder: CfnReplicationConfiguration.RepositoryFilterProperty.Builder =
        CfnReplicationConfiguration.RepositoryFilterProperty.builder()

    public fun filter(filter: String) {
        cdkBuilder.filter(filter)
    }

    public fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
    }

    public fun build(): CfnReplicationConfiguration.RepositoryFilterProperty = cdkBuilder.build()
}
