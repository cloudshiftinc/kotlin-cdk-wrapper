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
 * The `AuthorizationConfig` property type specifies the authorization type and configuration for an
 * AWS AppSync http data source.
 *
 * `AuthorizationConfig` is a property of the
 * [AWS AppSync DataSource HttpConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * AuthorizationConfigProperty authorizationConfigProperty = AuthorizationConfigProperty.builder()
 * .authorizationType("authorizationType")
 * // the properties below are optional
 * .awsIamConfig(AwsIamConfigProperty.builder()
 * .signingRegion("signingRegion")
 * .signingServiceName("signingServiceName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html)
 */
@CdkDslMarker
public class CfnDataSourceAuthorizationConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.AuthorizationConfigProperty.Builder =
        CfnDataSource.AuthorizationConfigProperty.builder()

    /**
     * @param authorizationType The authorization type that the HTTP endpoint requires.
     * * *AWS_IAM* : The authorization type is Signature Version 4 (SigV4).
     */
    public fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
    }

    /** @param awsIamConfig The AWS Identity and Access Management settings. */
    public fun awsIamConfig(awsIamConfig: IResolvable) {
        cdkBuilder.awsIamConfig(awsIamConfig)
    }

    /** @param awsIamConfig The AWS Identity and Access Management settings. */
    public fun awsIamConfig(awsIamConfig: CfnDataSource.AwsIamConfigProperty) {
        cdkBuilder.awsIamConfig(awsIamConfig)
    }

    public fun build(): CfnDataSource.AuthorizationConfigProperty = cdkBuilder.build()
}
