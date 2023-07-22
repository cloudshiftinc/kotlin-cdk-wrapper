@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig

@CdkDslMarker
public class ZoneAwarenessConfigDsl {
  private val cdkBuilder: ZoneAwarenessConfig.Builder = ZoneAwarenessConfig.builder()

  /**
   * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number of
   * AZs that you want the domain to use.
   * Valid values are 2 and 3.
   */
  public fun availabilityZoneCount(availabilityZoneCount: Number) {
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
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): ZoneAwarenessConfig = cdkBuilder.build()
}
