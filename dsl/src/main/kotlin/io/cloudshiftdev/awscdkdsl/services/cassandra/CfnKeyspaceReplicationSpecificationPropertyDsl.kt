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

package io.cloudshiftdev.awscdkdsl.services.cassandra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cassandra.CfnKeyspace

/**
 * You can use `ReplicationSpecification` to configure the `ReplicationStrategy` of a keyspace in
 * Amazon Keyspaces.
 *
 * The `ReplicationSpecification` property is `CreateOnly` and cannot be changed after the keyspace
 * has been created. This property applies automatically to all tables in the keyspace.
 *
 * For more information, see
 * [Multi-Region Replication](https://docs.aws.amazon.com/keyspaces/latest/devguide/multiRegion-replication.html)
 * in the *Amazon Keyspaces Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * ReplicationSpecificationProperty replicationSpecificationProperty =
 * ReplicationSpecificationProperty.builder()
 * .regionList(List.of("regionList"))
 * .replicationStrategy("replicationStrategy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-keyspace-replicationspecification.html)
 */
@CdkDslMarker
public class CfnKeyspaceReplicationSpecificationPropertyDsl {
    private val cdkBuilder: CfnKeyspace.ReplicationSpecificationProperty.Builder =
        CfnKeyspace.ReplicationSpecificationProperty.builder()

    private val _regionList: MutableList<String> = mutableListOf()

    /**
     * @param regionList Specifies the AWS Regions that the keyspace is replicated in. You must
     *   specify at least two and up to six Regions, including the Region that the keyspace is being
     *   created in.
     */
    public fun regionList(vararg regionList: String) {
        _regionList.addAll(listOf(*regionList))
    }

    /**
     * @param regionList Specifies the AWS Regions that the keyspace is replicated in. You must
     *   specify at least two and up to six Regions, including the Region that the keyspace is being
     *   created in.
     */
    public fun regionList(regionList: Collection<String>) {
        _regionList.addAll(regionList)
    }

    /**
     * @param replicationStrategy The options are:.
     * * `SINGLE_REGION` (optional)
     * * `MULTI_REGION`
     *
     * If no value is specified, the default is `SINGLE_REGION` . If `MULTI_REGION` is specified,
     * `RegionList` is required.
     */
    public fun replicationStrategy(replicationStrategy: String) {
        cdkBuilder.replicationStrategy(replicationStrategy)
    }

    public fun build(): CfnKeyspace.ReplicationSpecificationProperty {
        if (_regionList.isNotEmpty()) cdkBuilder.regionList(_regionList)
        return cdkBuilder.build()
    }
}
