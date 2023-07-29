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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

/**
 * The `OpenSearchServiceConfig` property type specifies the `AwsRegion` and `Endpoints` for an
 * Amazon OpenSearch Service domain in your account for an AWS AppSync data source.
 *
 * `OpenSearchServiceConfig` is a property of the
 * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * OpenSearchServiceConfigProperty openSearchServiceConfigProperty =
 * OpenSearchServiceConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .endpoint("endpoint")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-opensearchserviceconfig.html)
 */
@CdkDslMarker
public class CfnDataSourceOpenSearchServiceConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.OpenSearchServiceConfigProperty.Builder =
        CfnDataSource.OpenSearchServiceConfigProperty.builder()

    /** @param awsRegion The AWS Region. */
    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    /** @param endpoint The endpoint. */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun build(): CfnDataSource.OpenSearchServiceConfigProperty = cdkBuilder.build()
}
