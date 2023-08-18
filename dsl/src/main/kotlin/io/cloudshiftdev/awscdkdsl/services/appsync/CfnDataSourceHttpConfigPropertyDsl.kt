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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource

/**
 * Use the `HttpConfig` property type to specify `HttpConfig` for an AWS AppSync data source.
 *
 * `HttpConfig` is a property of the
 * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * HttpConfigProperty httpConfigProperty = HttpConfigProperty.builder()
 * .endpoint("endpoint")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfigProperty.builder()
 * .authorizationType("authorizationType")
 * // the properties below are optional
 * .awsIamConfig(AwsIamConfigProperty.builder()
 * .signingRegion("signingRegion")
 * .signingServiceName("signingServiceName")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html)
 */
@CdkDslMarker
public class CfnDataSourceHttpConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.HttpConfigProperty.Builder =
        CfnDataSource.HttpConfigProperty.builder()

    /** @param authorizationConfig The authorization configuration. */
    public fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    /** @param authorizationConfig The authorization configuration. */
    public fun authorizationConfig(authorizationConfig: CfnDataSource.AuthorizationConfigProperty) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    /** @param endpoint The endpoint. */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun build(): CfnDataSource.HttpConfigProperty = cdkBuilder.build()
}
