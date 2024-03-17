@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Configures the capacity of the cluster such as the instance type and the number of instances.
 *
 * Example:
 *
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
public interface CapacityConfig {
  /**
   * The instance type for your data nodes, such as `m3.medium.search`. For valid values, see
   * [Supported Instance
   * Types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
   * in the Amazon OpenSearch Service Developer Guide.
   *
   * Default: - r5.large.search
   */
  public fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

  /**
   * The number of data nodes (instances) to use in the Amazon OpenSearch Service domain.
   *
   * Default: - 1
   */
  public fun dataNodes(): Number? = unwrap(this).getDataNodes()

  /**
   * The hardware configuration of the computer that hosts the dedicated master node, such as
   * `m3.medium.search`. For valid values, see [Supported Instance Types]
   * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
   * in the Amazon OpenSearch Service Developer Guide.
   *
   * Default: - r5.large.search
   */
  public fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

  /**
   * The number of instances to use for the master node.
   *
   * Default: - no dedicated master nodes
   */
  public fun masterNodes(): Number? = unwrap(this).getMasterNodes()

  /**
   * Indicates whether Multi-AZ with Standby deployment option is enabled.
   *
   * For more information, see [Multi-AZ with Standby]
   * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
   *
   * Default: - no multi-az with standby
   */
  public fun multiAzWithStandbyEnabled(): Boolean? = unwrap(this).getMultiAzWithStandbyEnabled()

  /**
   * The instance type for your UltraWarm node, such as `ultrawarm1.medium.search`. For valid
   * values, see [UltraWarm Storage Limits]
   * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#limits-ultrawarm)
   * in the Amazon OpenSearch Service Developer Guide.
   *
   * Default: - ultrawarm1.medium.search
   */
  public fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

  /**
   * The number of UltraWarm nodes (instances) to use in the Amazon OpenSearch Service domain.
   *
   * Default: - no UltraWarm nodes
   */
  public fun warmNodes(): Number? = unwrap(this).getWarmNodes()

  /**
   * A builder for [CapacityConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataNodeInstanceType The instance type for your data nodes, such as
     * `m3.medium.search`. For valid values, see [Supported Instance
     * Types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    public fun dataNodeInstanceType(dataNodeInstanceType: String)

    /**
     * @param dataNodes The number of data nodes (instances) to use in the Amazon OpenSearch Service
     * domain.
     */
    public fun dataNodes(dataNodes: Number)

    /**
     * @param masterNodeInstanceType The hardware configuration of the computer that hosts the
     * dedicated master node, such as `m3.medium.search`. For valid values, see [Supported Instance
     * Types]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    public fun masterNodeInstanceType(masterNodeInstanceType: String)

    /**
     * @param masterNodes The number of instances to use for the master node.
     */
    public fun masterNodes(masterNodes: Number)

    /**
     * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option is
     * enabled.
     * For more information, see [Multi-AZ with Standby]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
     */
    public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean)

    /**
     * @param warmInstanceType The instance type for your UltraWarm node, such as
     * `ultrawarm1.medium.search`. For valid values, see [UltraWarm Storage Limits]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#limits-ultrawarm)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    public fun warmInstanceType(warmInstanceType: String)

    /**
     * @param warmNodes The number of UltraWarm nodes (instances) to use in the Amazon OpenSearch
     * Service domain.
     */
    public fun warmNodes(warmNodes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CapacityConfig.Builder
        = software.amazon.awscdk.services.opensearchservice.CapacityConfig.builder()

    /**
     * @param dataNodeInstanceType The instance type for your data nodes, such as
     * `m3.medium.search`. For valid values, see [Supported Instance
     * Types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    override fun dataNodeInstanceType(dataNodeInstanceType: String) {
      cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
    }

    /**
     * @param dataNodes The number of data nodes (instances) to use in the Amazon OpenSearch Service
     * domain.
     */
    override fun dataNodes(dataNodes: Number) {
      cdkBuilder.dataNodes(dataNodes)
    }

    /**
     * @param masterNodeInstanceType The hardware configuration of the computer that hosts the
     * dedicated master node, such as `m3.medium.search`. For valid values, see [Supported Instance
     * Types]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    override fun masterNodeInstanceType(masterNodeInstanceType: String) {
      cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
    }

    /**
     * @param masterNodes The number of instances to use for the master node.
     */
    override fun masterNodes(masterNodes: Number) {
      cdkBuilder.masterNodes(masterNodes)
    }

    /**
     * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option is
     * enabled.
     * For more information, see [Multi-AZ with Standby]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
     */
    override fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
      cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
    }

    /**
     * @param warmInstanceType The instance type for your UltraWarm node, such as
     * `ultrawarm1.medium.search`. For valid values, see [UltraWarm Storage Limits]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#limits-ultrawarm)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    override fun warmInstanceType(warmInstanceType: String) {
      cdkBuilder.warmInstanceType(warmInstanceType)
    }

    /**
     * @param warmNodes The number of UltraWarm nodes (instances) to use in the Amazon OpenSearch
     * Service domain.
     */
    override fun warmNodes(warmNodes: Number) {
      cdkBuilder.warmNodes(warmNodes)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.CapacityConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.CapacityConfig,
  ) : CdkObject(cdkObject), CapacityConfig {
    /**
     * The instance type for your data nodes, such as `m3.medium.search`. For valid values, see
     * [Supported Instance
     * Types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * in the Amazon OpenSearch Service Developer Guide.
     *
     * Default: - r5.large.search
     */
    override fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

    /**
     * The number of data nodes (instances) to use in the Amazon OpenSearch Service domain.
     *
     * Default: - 1
     */
    override fun dataNodes(): Number? = unwrap(this).getDataNodes()

    /**
     * The hardware configuration of the computer that hosts the dedicated master node, such as
     * `m3.medium.search`. For valid values, see [Supported Instance Types]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * in the Amazon OpenSearch Service Developer Guide.
     *
     * Default: - r5.large.search
     */
    override fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

    /**
     * The number of instances to use for the master node.
     *
     * Default: - no dedicated master nodes
     */
    override fun masterNodes(): Number? = unwrap(this).getMasterNodes()

    /**
     * Indicates whether Multi-AZ with Standby deployment option is enabled.
     *
     * For more information, see [Multi-AZ with Standby]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
     *
     * Default: - no multi-az with standby
     */
    override fun multiAzWithStandbyEnabled(): Boolean? = unwrap(this).getMultiAzWithStandbyEnabled()

    /**
     * The instance type for your UltraWarm node, such as `ultrawarm1.medium.search`. For valid
     * values, see [UltraWarm Storage Limits]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#limits-ultrawarm)
     * in the Amazon OpenSearch Service Developer Guide.
     *
     * Default: - ultrawarm1.medium.search
     */
    override fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

    /**
     * The number of UltraWarm nodes (instances) to use in the Amazon OpenSearch Service domain.
     *
     * Default: - no UltraWarm nodes
     */
    override fun warmNodes(): Number? = unwrap(this).getWarmNodes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CapacityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CapacityConfig):
        CapacityConfig = CdkObjectWrappers.wrap(cdkObject) as? CapacityConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CapacityConfig):
        software.amazon.awscdk.services.opensearchservice.CapacityConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.CapacityConfig
  }
}
