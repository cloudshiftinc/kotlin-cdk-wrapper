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

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

/**
 * The replication configuration for a registry.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * ReplicationConfigurationProperty replicationConfigurationProperty =
 * ReplicationConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationconfiguration.html)
 */
@CdkDslMarker
public class CfnReplicationConfigurationReplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder =
        CfnReplicationConfiguration.ReplicationConfigurationProperty.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    /**
     * @param rules An array of objects representing the replication destinations and repository
     *   filters for a replication configuration.
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * @param rules An array of objects representing the replication destinations and repository
     *   filters for a replication configuration.
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * @param rules An array of objects representing the replication destinations and repository
     *   filters for a replication configuration.
     */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnReplicationConfiguration.ReplicationConfigurationProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
