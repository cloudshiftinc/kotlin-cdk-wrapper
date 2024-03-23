@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Specifies zone awareness configuration options.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_3)
 * .ebs(EbsOptions.builder()
 * .volumeSize(10)
 * .volumeType(EbsDeviceVolumeType.GENERAL_PURPOSE_SSD_GP3)
 * .build())
 * .zoneAwareness(ZoneAwarenessConfig.builder()
 * .enabled(true)
 * .availabilityZoneCount(3)
 * .build())
 * .capacity(CapacityConfig.builder()
 * .multiAzWithStandbyEnabled(true)
 * .masterNodes(3)
 * .dataNodes(3)
 * .build())
 * .build();
 * ```
 */
public interface ZoneAwarenessConfig {
  /**
   * If you enabled multiple Availability Zones (AZs), the number of AZs that you want the domain to
   * use.
   *
   * Valid values are 2 and 3.
   *
   * Default: - 2 if zone awareness is enabled.
   */
  public fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

  /**
   * Indicates whether to enable zone awareness for the Amazon OpenSearch Service domain.
   *
   * When you enable zone awareness, Amazon OpenSearch Service allocates the nodes and replica
   * index shards that belong to a cluster across two Availability Zones (AZs)
   * in the same region to prevent data loss and minimize downtime in the event
   * of node or data center failure. Don't enable zone awareness if your cluster
   * has no replica index shards or is a single-node cluster. For more information,
   * see [Configuring a Multi-AZ Domain]
   * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
   * in the Amazon OpenSearch Service Developer Guide.
   *
   * Default: - false
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * A builder for [ZoneAwarenessConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number of
     * AZs that you want the domain to use.
     * Valid values are 2 and 3.
     */
    public fun availabilityZoneCount(availabilityZoneCount: Number)

    /**
     * @param enabled Indicates whether to enable zone awareness for the Amazon OpenSearch Service
     * domain.
     * When you enable zone awareness, Amazon OpenSearch Service allocates the nodes and replica
     * index shards that belong to a cluster across two Availability Zones (AZs)
     * in the same region to prevent data loss and minimize downtime in the event
     * of node or data center failure. Don't enable zone awareness if your cluster
     * has no replica index shards or is a single-node cluster. For more information,
     * see [Configuring a Multi-AZ Domain]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    public fun enabled(enabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig.Builder =
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig.builder()

    /**
     * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number of
     * AZs that you want the domain to use.
     * Valid values are 2 and 3.
     */
    override fun availabilityZoneCount(availabilityZoneCount: Number) {
      cdkBuilder.availabilityZoneCount(availabilityZoneCount)
    }

    /**
     * @param enabled Indicates whether to enable zone awareness for the Amazon OpenSearch Service
     * domain.
     * When you enable zone awareness, Amazon OpenSearch Service allocates the nodes and replica
     * index shards that belong to a cluster across two Availability Zones (AZs)
     * in the same region to prevent data loss and minimize downtime in the event
     * of node or data center failure. Don't enable zone awareness if your cluster
     * has no replica index shards or is a single-node cluster. For more information,
     * see [Configuring a Multi-AZ Domain]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig,
  ) : CdkObject(cdkObject), ZoneAwarenessConfig {
    /**
     * If you enabled multiple Availability Zones (AZs), the number of AZs that you want the domain
     * to use.
     *
     * Valid values are 2 and 3.
     *
     * Default: - 2 if zone awareness is enabled.
     */
    override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

    /**
     * Indicates whether to enable zone awareness for the Amazon OpenSearch Service domain.
     *
     * When you enable zone awareness, Amazon OpenSearch Service allocates the nodes and replica
     * index shards that belong to a cluster across two Availability Zones (AZs)
     * in the same region to prevent data loss and minimize downtime in the event
     * of node or data center failure. Don't enable zone awareness if your cluster
     * has no replica index shards or is a single-node cluster. For more information,
     * see [Configuring a Multi-AZ Domain]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
     * in the Amazon OpenSearch Service Developer Guide.
     *
     * Default: - false
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig):
        ZoneAwarenessConfig = CdkObjectWrappers.wrap(cdkObject) as? ZoneAwarenessConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ZoneAwarenessConfig):
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig
  }
}
