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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticsearch.CfnDomain

/**
 * The `AWS::Elasticsearch::Domain` resource is being replaced by the
 * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
 * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
 * modifying your existing Cloudformation templates to use the new OpenSearch Service resource,
 * which supports both OpenSearch and Elasticsearch. For more information about the service rename,
 * see
 * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 * *DEPRECATED* . For domains running Elasticsearch 5.3 and later, OpenSearch Service takes hourly
 * automated snapshots, making this setting irrelevant. For domains running earlier versions of
 * Elasticsearch, OpenSearch Service takes daily automated snapshots.
 *
 * The automated snapshot configuration for the OpenSearch Service domain indices.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticsearch.*;
 * SnapshotOptionsProperty snapshotOptionsProperty = SnapshotOptionsProperty.builder()
 * .automatedSnapshotStartHour(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html)
 */
@CdkDslMarker
public class CfnDomainSnapshotOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.SnapshotOptionsProperty.Builder =
        CfnDomain.SnapshotOptionsProperty.builder()

    /**
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     *   daily snapshot of the indices in the OpenSearch Service domain. For example, if you specify
     *   0, OpenSearch Service takes an automated snapshot everyday between midnight and 1 am. You
     *   can specify a value between 0 and 23.
     */
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    public fun build(): CfnDomain.SnapshotOptionsProperty = cdkBuilder.build()
}
