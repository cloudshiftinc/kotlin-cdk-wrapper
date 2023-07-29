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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
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
 * Specifies whether the OpenSearch Service domain publishes the Elasticsearch application, search
 * slow logs, or index slow logs to Amazon CloudWatch. Each option must be an object of name
 * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , or `AUDIT_LOGS` depending on the
 * type of logs you want to publish.
 *
 * If you enable a slow log, you still have to enable the *collection* of slow logs using the
 * Configuration API. To learn more, see
 * [Enabling log publishing ( AWS CLI)](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html#createdomain-configure-slow-logs-cli)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticsearch.*;
 * LogPublishingOptionProperty logPublishingOptionProperty = LogPublishingOptionProperty.builder()
 * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-logpublishingoption.html)
 */
@CdkDslMarker
public class CfnDomainLogPublishingOptionPropertyDsl {
    private val cdkBuilder: CfnDomain.LogPublishingOptionProperty.Builder =
        CfnDomain.LogPublishingOptionProperty.builder()

    /**
     * @param cloudWatchLogsLogGroupArn Specifies the CloudWatch log group to publish to. Required
     *   if you enable log publishing for the domain.
     */
    public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
    }

    /**
     * @param enabled If `true` , enables the publishing of logs to CloudWatch. Default: `false` .
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled If `true` , enables the publishing of logs to CloudWatch. Default: `false` .
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnDomain.LogPublishingOptionProperty = cdkBuilder.build()
}
