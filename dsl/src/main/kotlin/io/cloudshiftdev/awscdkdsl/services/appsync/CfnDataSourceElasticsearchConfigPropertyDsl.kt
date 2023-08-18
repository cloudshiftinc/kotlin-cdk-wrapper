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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

/**
 * The `ElasticsearchConfig` property type specifies the `AwsRegion` and `Endpoints` for an Amazon
 * OpenSearch Service domain in your account for an AWS AppSync data source.
 *
 * ElasticsearchConfig is a property of the
 * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
 * property type.
 *
 * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This property
 * is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an OpenSearch
 * Service data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * ElasticsearchConfigProperty elasticsearchConfigProperty = ElasticsearchConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .endpoint("endpoint")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html)
 */
@CdkDslMarker
public class CfnDataSourceElasticsearchConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.ElasticsearchConfigProperty.Builder =
        CfnDataSource.ElasticsearchConfigProperty.builder()

    /** @param awsRegion The AWS Region. */
    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    /** @param endpoint The endpoint. */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun build(): CfnDataSource.ElasticsearchConfigProperty = cdkBuilder.build()
}
