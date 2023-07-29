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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.opensearchservice.CapacityConfig

/**
 * Configures the capacity of the cluster such as the instance type and the number of instances.
 *
 * Example:
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .capacity(CapacityConfig.builder()
 * .masterNodes(2)
 * .warmNodes(2)
 * .warmInstanceType("ultrawarm1.medium.search")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CapacityConfigDsl {
    private val cdkBuilder: CapacityConfig.Builder = CapacityConfig.builder()

    /**
     * @param dataNodeInstanceType The instance type for your data nodes, such as
     *   `m3.medium.search`. For valid values, see
     *   [Supported Instance Types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     *   in the Amazon OpenSearch Service Developer Guide.
     */
    public fun dataNodeInstanceType(dataNodeInstanceType: String) {
        cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
    }

    /**
     * @param dataNodes The number of data nodes (instances) to use in the Amazon OpenSearch Service
     *   domain.
     */
    public fun dataNodes(dataNodes: Number) {
        cdkBuilder.dataNodes(dataNodes)
    }

    /**
     * @param masterNodeInstanceType The hardware configuration of the computer that hosts the
     *   dedicated master node, such as `m3.medium.search`. For valid values, see
     *   [Supported Instance Types]
     *   (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     *   in the Amazon OpenSearch Service Developer Guide.
     */
    public fun masterNodeInstanceType(masterNodeInstanceType: String) {
        cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
    }

    /** @param masterNodes The number of instances to use for the master node. */
    public fun masterNodes(masterNodes: Number) {
        cdkBuilder.masterNodes(masterNodes)
    }

    /**
     * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option is
     *   enabled. For more information, see [Multi-AZ with Standby]
     *   (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
     */
    public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
    }

    /**
     * @param warmInstanceType The instance type for your UltraWarm node, such as
     *   `ultrawarm1.medium.search`. For valid values, see [UltraWarm Storage Limits]
     *   (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#limits-ultrawarm)
     *   in the Amazon OpenSearch Service Developer Guide.
     */
    public fun warmInstanceType(warmInstanceType: String) {
        cdkBuilder.warmInstanceType(warmInstanceType)
    }

    /**
     * @param warmNodes The number of UltraWarm nodes (instances) to use in the Amazon OpenSearch
     *   Service domain.
     */
    public fun warmNodes(warmNodes: Number) {
        cdkBuilder.warmNodes(warmNodes)
    }

    public fun build(): CapacityConfig = cdkBuilder.build()
}
