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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnReplicationConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReplicationConfiguration.Builder =
        CfnReplicationConfiguration.Builder.create(scope, id)

    public fun replicationConfiguration(replicationConfiguration: IResolvable) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    public fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    public fun build(): CfnReplicationConfiguration = cdkBuilder.build()
}
