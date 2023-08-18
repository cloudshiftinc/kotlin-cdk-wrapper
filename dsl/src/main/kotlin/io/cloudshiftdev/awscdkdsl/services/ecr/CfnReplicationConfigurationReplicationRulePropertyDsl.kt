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
 * An array of objects representing the replication destinations and repository filters for a
 * replication configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * ReplicationRuleProperty replicationRuleProperty = ReplicationRuleProperty.builder()
 * .destinations(List.of(ReplicationDestinationProperty.builder()
 * .region("region")
 * .registryId("registryId")
 * .build()))
 * // the properties below are optional
 * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
 * .filter("filter")
 * .filterType("filterType")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationrule.html)
 */
@CdkDslMarker
public class CfnReplicationConfigurationReplicationRulePropertyDsl {
    private val cdkBuilder: CfnReplicationConfiguration.ReplicationRuleProperty.Builder =
        CfnReplicationConfiguration.ReplicationRuleProperty.builder()

    private val _destinations: MutableList<Any> = mutableListOf()

    private val _repositoryFilters: MutableList<Any> = mutableListOf()

    /**
     * @param destinations An array of objects representing the destination for a replication rule.
     */
    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    /**
     * @param destinations An array of objects representing the destination for a replication rule.
     */
    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    /**
     * @param destinations An array of objects representing the destination for a replication rule.
     */
    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    /**
     * @param repositoryFilters An array of objects representing the filters for a replication rule.
     *   Specifying a repository filter for a replication rule provides a method for controlling
     *   which repositories in a private registry are replicated.
     */
    public fun repositoryFilters(vararg repositoryFilters: Any) {
        _repositoryFilters.addAll(listOf(*repositoryFilters))
    }

    /**
     * @param repositoryFilters An array of objects representing the filters for a replication rule.
     *   Specifying a repository filter for a replication rule provides a method for controlling
     *   which repositories in a private registry are replicated.
     */
    public fun repositoryFilters(repositoryFilters: Collection<Any>) {
        _repositoryFilters.addAll(repositoryFilters)
    }

    /**
     * @param repositoryFilters An array of objects representing the filters for a replication rule.
     *   Specifying a repository filter for a replication rule provides a method for controlling
     *   which repositories in a private registry are replicated.
     */
    public fun repositoryFilters(repositoryFilters: IResolvable) {
        cdkBuilder.repositoryFilters(repositoryFilters)
    }

    public fun build(): CfnReplicationConfiguration.ReplicationRuleProperty {
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        if (_repositoryFilters.isNotEmpty()) cdkBuilder.repositoryFilters(_repositoryFilters)
        return cdkBuilder.build()
    }
}
