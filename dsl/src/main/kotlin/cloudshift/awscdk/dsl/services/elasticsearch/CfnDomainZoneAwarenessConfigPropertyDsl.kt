@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticsearch.CfnDomain

/**
 * Specifies zone awareness configuration options. Only use if `ZoneAwarenessEnabled` is `true` .
 *
 *
 * The `AWS::Elasticsearch::Domain` resource is being replaced by the
 * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
 * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
 * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
 * supports both OpenSearch and Elasticsearch. For more information about the service rename, see [New
 * resource
 * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticsearch.*;
 * ZoneAwarenessConfigProperty zoneAwarenessConfigProperty = ZoneAwarenessConfigProperty.builder()
 * .availabilityZoneCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html)
 */
@CdkDslMarker
public class CfnDomainZoneAwarenessConfigPropertyDsl {
  private val cdkBuilder: CfnDomain.ZoneAwarenessConfigProperty.Builder =
      CfnDomain.ZoneAwarenessConfigProperty.builder()

  /**
   * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number of
   * AZs that you want the domain to use.
   * Valid values are `2` and `3` . Default is 2.
   */
  public fun availabilityZoneCount(availabilityZoneCount: Number) {
    cdkBuilder.availabilityZoneCount(availabilityZoneCount)
  }

  public fun build(): CfnDomain.ZoneAwarenessConfigProperty = cdkBuilder.build()
}
