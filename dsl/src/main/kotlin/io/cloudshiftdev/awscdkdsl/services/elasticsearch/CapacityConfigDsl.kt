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

package io.cloudshiftdev.awscdkdsl.services.elasticsearch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.CapacityConfig

/**
 * (deprecated) Configures the capacity of the cluster such as the instance type and the number of
 * instances.
 *
 * Example:
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_10)
 * .capacity(CapacityConfig.builder()
 * .masterNodes(2)
 * .warmNodes(2)
 * .warmInstanceType("ultrawarm1.medium.elasticsearch")
 * .build())
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CapacityConfigDsl {
    private val cdkBuilder: CapacityConfig.Builder = CapacityConfig.builder()

    /**
     * @param dataNodeInstanceType The instance type for your data nodes, such as
     *   `m3.medium.elasticsearch`. For valid values, see
     *   [Supported Instance Types](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
     *   in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataNodeInstanceType(dataNodeInstanceType: String) {
        cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
    }

    /**
     * @param dataNodes The number of data nodes (instances) to use in the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataNodes(dataNodes: Number) {
        cdkBuilder.dataNodes(dataNodes)
    }

    /**
     * @param masterNodeInstanceType The hardware configuration of the computer that hosts the
     *   dedicated master node, such as `m3.medium.elasticsearch`. For valid values, see
     *   [Supported Instance Types]
     *   (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
     *   in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterNodeInstanceType(masterNodeInstanceType: String) {
        cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
    }

    /**
     * @param masterNodes The number of instances to use for the master node.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterNodes(masterNodes: Number) {
        cdkBuilder.masterNodes(masterNodes)
    }

    /**
     * @param warmInstanceType The instance type for your UltraWarm node, such as
     *   `ultrawarm1.medium.elasticsearch`. For valid values, see [UltraWarm Storage Limits]
     *   (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-limits.html#limits-ultrawarm)
     *   in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun warmInstanceType(warmInstanceType: String) {
        cdkBuilder.warmInstanceType(warmInstanceType)
    }

    /**
     * @param warmNodes The number of UltraWarm nodes (instances) to use in the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun warmNodes(warmNodes: Number) {
        cdkBuilder.warmNodes(warmNodes)
    }

    public fun build(): CapacityConfig = cdkBuilder.build()
}
