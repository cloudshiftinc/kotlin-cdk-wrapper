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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * The cluster configuration for the OpenSearch Service domain.
 *
 * You can specify options such as the instance type and the number of instances. For more
 * information, see
 * [Creating and managing Amazon OpenSearch Service domains](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
 * .dedicatedMasterCount(123)
 * .dedicatedMasterEnabled(false)
 * .dedicatedMasterType("dedicatedMasterType")
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .multiAzWithStandbyEnabled(false)
 * .warmCount(123)
 * .warmEnabled(false)
 * .warmType("warmType")
 * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
 * .availabilityZoneCount(123)
 * .build())
 * .zoneAwarenessEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
 */
@CdkDslMarker
public class CfnDomainClusterConfigPropertyDsl {
    private val cdkBuilder: CfnDomain.ClusterConfigProperty.Builder =
        CfnDomain.ClusterConfigProperty.builder()

    /**
     * @param dedicatedMasterCount The number of instances to use for the master node. If you
     *   specify this property, you must specify `true` for the `DedicatedMasterEnabled` property.
     */
    public fun dedicatedMasterCount(dedicatedMasterCount: Number) {
        cdkBuilder.dedicatedMasterCount(dedicatedMasterCount)
    }

    /**
     * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
     *   OpenSearch Service domain. A dedicated master node is a cluster node that performs cluster
     *   management tasks, but doesn't hold data or respond to data upload requests. Dedicated
     *   master nodes offload cluster management tasks to increase the stability of your search
     *   clusters. See
     *   [Dedicated master nodes in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
     *   .
     */
    public fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled)
    }

    /**
     * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
     *   OpenSearch Service domain. A dedicated master node is a cluster node that performs cluster
     *   management tasks, but doesn't hold data or respond to data upload requests. Dedicated
     *   master nodes offload cluster management tasks to increase the stability of your search
     *   clusters. See
     *   [Dedicated master nodes in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
     *   .
     */
    public fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled)
    }

    /**
     * @param dedicatedMasterType The hardware configuration of the computer that hosts the
     *   dedicated master node, such as `m3.medium.search` . If you specify this property, you must
     *   specify `true` for the `DedicatedMasterEnabled` property. For valid values, see
     *   [Supported instance types in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     *   .
     */
    public fun dedicatedMasterType(dedicatedMasterType: String) {
        cdkBuilder.dedicatedMasterType(dedicatedMasterType)
    }

    /**
     * @param instanceCount The number of data nodes (instances) to use in the OpenSearch Service
     *   domain.
     */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceType The instance type for your data nodes, such as `m3.medium.search` . For
     *   valid values, see
     *   [Supported instance types in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     *   .
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option is
     *   enabled. For more information, see
     *   [Multi-AZ with Standby](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
     *   .
     */
    public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
    }

    /**
     * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option is
     *   enabled. For more information, see
     *   [Multi-AZ with Standby](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
     *   .
     */
    public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: IResolvable) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
    }

    /** @param warmCount The number of warm nodes in the cluster. */
    public fun warmCount(warmCount: Number) {
        cdkBuilder.warmCount(warmCount)
    }

    /**
     * @param warmEnabled Whether to enable UltraWarm storage for the cluster. See
     *   [UltraWarm storage for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ultrawarm.html)
     *   .
     */
    public fun warmEnabled(warmEnabled: Boolean) {
        cdkBuilder.warmEnabled(warmEnabled)
    }

    /**
     * @param warmEnabled Whether to enable UltraWarm storage for the cluster. See
     *   [UltraWarm storage for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ultrawarm.html)
     *   .
     */
    public fun warmEnabled(warmEnabled: IResolvable) {
        cdkBuilder.warmEnabled(warmEnabled)
    }

    /** @param warmType The instance type for the cluster's warm nodes. */
    public fun warmType(warmType: String) {
        cdkBuilder.warmType(warmType)
    }

    /**
     * @param zoneAwarenessConfig Specifies zone awareness configuration options. Only use if
     *   `ZoneAwarenessEnabled` is `true` .
     */
    public fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig)
    }

    /**
     * @param zoneAwarenessConfig Specifies zone awareness configuration options. Only use if
     *   `ZoneAwarenessEnabled` is `true` .
     */
    public fun zoneAwarenessConfig(zoneAwarenessConfig: CfnDomain.ZoneAwarenessConfigProperty) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig)
    }

    /**
     * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
     *   Service domain. When you enable zone awareness, OpenSearch Service allocates the nodes and
     *   replica index shards that belong to a cluster across two Availability Zones (AZs) in the
     *   same region to prevent data loss and minimize downtime in the event of node or data center
     *   failure. Don't enable zone awareness if your cluster has no replica index shards or is a
     *   single-node cluster. For more information, see
     *   [Configuring a multi-AZ domain in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
     *   .
     */
    public fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled)
    }

    /**
     * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
     *   Service domain. When you enable zone awareness, OpenSearch Service allocates the nodes and
     *   replica index shards that belong to a cluster across two Availability Zones (AZs) in the
     *   same region to prevent data loss and minimize downtime in the event of node or data center
     *   failure. Don't enable zone awareness if your cluster has no replica index shards or is a
     *   single-node cluster. For more information, see
     *   [Configuring a multi-AZ domain in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
     *   .
     */
    public fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled)
    }

    public fun build(): CfnDomain.ClusterConfigProperty = cdkBuilder.build()
}
