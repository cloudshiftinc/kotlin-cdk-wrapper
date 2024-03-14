package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

public interface ZoneAwarenessConfig {
  /**
   * (deprecated) If you enabled multiple Availability Zones (AZs), the number of AZs that you want
   * the domain to use.
   *
   * Valid values are 2 and 3.
   *
   * Default: - 2 if zone awareness is enabled.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

  /**
   * (deprecated) Indicates whether to enable zone awareness for the Amazon ES domain.
   *
   * When you enable zone awareness, Amazon ES allocates the nodes and replica
   * index shards that belong to a cluster across two Availability Zones (AZs)
   * in the same region to prevent data loss and minimize downtime in the event
   * of node or data center failure. Don't enable zone awareness if your cluster
   * has no replica index shards or is a single-node cluster. For more information,
   * see [Configuring a Multi-AZ Domain]
   * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-managedomains-multiaz)
   * in the Amazon Elasticsearch Service Developer Guide.
   *
   * Default: - false
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * A builder for [ZoneAwarenessConfig]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number of
     * AZs that you want the domain to use.
     * Valid values are 2 and 3.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun availabilityZoneCount(availabilityZoneCount: Number)

    /**
     * @param enabled Indicates whether to enable zone awareness for the Amazon ES domain.
     * When you enable zone awareness, Amazon ES allocates the nodes and replica
     * index shards that belong to a cluster across two Availability Zones (AZs)
     * in the same region to prevent data loss and minimize downtime in the event
     * of node or data center failure. Don't enable zone awareness if your cluster
     * has no replica index shards or is a single-node cluster. For more information,
     * see [Configuring a Multi-AZ Domain]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-managedomains-multiaz)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun enabled(enabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig.Builder =
        software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig.builder()

    /**
     * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number of
     * AZs that you want the domain to use.
     * Valid values are 2 and 3.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun availabilityZoneCount(availabilityZoneCount: Number) {
      cdkBuilder.availabilityZoneCount(availabilityZoneCount)
    }

    /**
     * @param enabled Indicates whether to enable zone awareness for the Amazon ES domain.
     * When you enable zone awareness, Amazon ES allocates the nodes and replica
     * index shards that belong to a cluster across two Availability Zones (AZs)
     * in the same region to prevent data loss and minimize downtime in the event
     * of node or data center failure. Don't enable zone awareness if your cluster
     * has no replica index shards or is a single-node cluster. For more information,
     * see [Configuring a Multi-AZ Domain]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-managedomains-multiaz)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig,
  ) : ZoneAwarenessConfig {
    /**
     * (deprecated) If you enabled multiple Availability Zones (AZs), the number of AZs that you
     * want the domain to use.
     *
     * Valid values are 2 and 3.
     *
     * Default: - 2 if zone awareness is enabled.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

    /**
     * (deprecated) Indicates whether to enable zone awareness for the Amazon ES domain.
     *
     * When you enable zone awareness, Amazon ES allocates the nodes and replica
     * index shards that belong to a cluster across two Availability Zones (AZs)
     * in the same region to prevent data loss and minimize downtime in the event
     * of node or data center failure. Don't enable zone awareness if your cluster
     * has no replica index shards or is a single-node cluster. For more information,
     * see [Configuring a Multi-AZ Domain]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-managedomains-multiaz)
     * in the Amazon Elasticsearch Service Developer Guide.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enabled(): Boolean? = unwrap(this).getEnabled()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig):
        ZoneAwarenessConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ZoneAwarenessConfig):
        software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig = (wrapped as
        Wrapper).cdkObject
  }
}
