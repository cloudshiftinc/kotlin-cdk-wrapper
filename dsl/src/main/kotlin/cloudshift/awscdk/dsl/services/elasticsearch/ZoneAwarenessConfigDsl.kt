@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig

/**
 * (deprecated) Specifies zone awareness configuration options.
 *
 * Example:
 *
 * ```
 * Domain prodDomain = Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_1)
 * .capacity(CapacityConfig.builder()
 * .masterNodes(5)
 * .dataNodes(20)
 * .build())
 * .ebs(EbsOptions.builder()
 * .volumeSize(20)
 * .build())
 * .zoneAwareness(ZoneAwarenessConfig.builder()
 * .availabilityZoneCount(3)
 * .build())
 * .logging(LoggingOptions.builder()
 * .slowSearchLogEnabled(true)
 * .appLogEnabled(true)
 * .slowIndexLogEnabled(true)
 * .build())
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class ZoneAwarenessConfigDsl {
  private val cdkBuilder: ZoneAwarenessConfig.Builder = ZoneAwarenessConfig.builder()

  /**
   * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number of
   * AZs that you want the domain to use.
   * Valid values are 2 and 3.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun availabilityZoneCount(availabilityZoneCount: Number) {
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
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): ZoneAwarenessConfig = cdkBuilder.build()
}
