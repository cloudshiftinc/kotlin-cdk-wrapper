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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines an OpenSearch endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For more information about the available
 * settings, see
 * [Extra connection attributes when using OpenSearch as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Elasticsearch.html#CHAP_Target.Elasticsearch.Configuration)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * ElasticsearchSettingsProperty elasticsearchSettingsProperty =
 * ElasticsearchSettingsProperty.builder()
 * .endpointUri("endpointUri")
 * .errorRetryDuration(123)
 * .fullLoadErrorPercentage(123)
 * .serviceAccessRoleArn("serviceAccessRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-elasticsearchsettings.html)
 */
@CdkDslMarker
public class CfnEndpointElasticsearchSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.ElasticsearchSettingsProperty.Builder =
        CfnEndpoint.ElasticsearchSettingsProperty.builder()

    /**
     * @param endpointUri The endpoint for the OpenSearch cluster. AWS DMS uses HTTPS if a transport
     *   protocol (either HTTP or HTTPS) isn't specified.
     */
    public fun endpointUri(endpointUri: String) {
        cdkBuilder.endpointUri(endpointUri)
    }

    /**
     * @param errorRetryDuration The maximum number of seconds for which DMS retries failed API
     *   requests to the OpenSearch cluster.
     */
    public fun errorRetryDuration(errorRetryDuration: Number) {
        cdkBuilder.errorRetryDuration(errorRetryDuration)
    }

    /**
     * @param fullLoadErrorPercentage The maximum percentage of records that can fail to be written
     *   before a full load operation stops. To avoid early failure, this counter is only effective
     *   after 1,000 records are transferred. OpenSearch also has the concept of error monitoring
     *   during the last 10 minutes of an Observation Window. If transfer of all records fail in the
     *   last 10 minutes, the full load operation stops.
     */
    public fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number) {
        cdkBuilder.fullLoadErrorPercentage(fullLoadErrorPercentage)
    }

    /**
     * @param serviceAccessRoleArn The Amazon Resource Name (ARN) used by the service to access the
     *   IAM role. The role must allow the `iam:PassRole` action.
     */
    public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
    }

    public fun build(): CfnEndpoint.ElasticsearchSettingsProperty = cdkBuilder.build()
}
