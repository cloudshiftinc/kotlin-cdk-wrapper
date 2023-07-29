@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps

/**
 * Properties for defining a `CfnReplicationConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * CfnReplicationConfigurationProps cfnReplicationConfigurationProps =
 * CfnReplicationConfigurationProps.builder()
 * .replicationConfiguration(ReplicationConfigurationProperty.builder()
 * .rules(List.of(ReplicationRuleProperty.builder()
 * .destinations(List.of(ReplicationDestinationProperty.builder()
 * .region("region")
 * .registryId("registryId")
 * .build()))
 * // the properties below are optional
 * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
 * .filter("filter")
 * .filterType("filterType")
 * .build()))
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html)
 */
@CdkDslMarker
public class CfnReplicationConfigurationPropsDsl {
    private val cdkBuilder: CfnReplicationConfigurationProps.Builder =
        CfnReplicationConfigurationProps.builder()

    /** @param replicationConfiguration The replication configuration for a registry. */
    public fun replicationConfiguration(replicationConfiguration: IResolvable) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    /** @param replicationConfiguration The replication configuration for a registry. */
    public fun replicationConfiguration(
        replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty
    ) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    public fun build(): CfnReplicationConfigurationProps = cdkBuilder.build()
}
