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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

/**
 * The `LogConfig` property type specifies the logging configuration when writing GraphQL operations
 * and tracing to Amazon CloudWatch for an AWS AppSync GraphQL API.
 *
 * `LogConfig` is a property of the
 * [AWS::AppSync::GraphQLApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * LogConfigProperty logConfigProperty = LogConfigProperty.builder()
 * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
 * .excludeVerboseContent(false)
 * .fieldLogLevel("fieldLogLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html)
 */
@CdkDslMarker
public class CfnGraphQLApiLogConfigPropertyDsl {
    private val cdkBuilder: CfnGraphQLApi.LogConfigProperty.Builder =
        CfnGraphQLApi.LogConfigProperty.builder()

    /**
     * @param cloudWatchLogsRoleArn The service role that AWS AppSync will assume to publish to
     *   Amazon CloudWatch Logs in your account.
     */
    public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
        cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
    }

    /**
     * @param excludeVerboseContent Set to TRUE to exclude sections that contain information such as
     *   headers, context, and evaluated mapping templates, regardless of logging level.
     */
    public fun excludeVerboseContent(excludeVerboseContent: Boolean) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    /**
     * @param excludeVerboseContent Set to TRUE to exclude sections that contain information such as
     *   headers, context, and evaluated mapping templates, regardless of logging level.
     */
    public fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    /**
     * @param fieldLogLevel The field logging level. Values can be NONE, ERROR, or ALL.
     * * *NONE* : No field-level logs are captured.
     * * *ERROR* : Logs the following information only for the fields that are in error:
     * * The error section in the server response.
     * * Field-level errors.
     * * The generated request/response functions that got resolved for error fields.
     * * *ALL* : The following information is logged for all fields in the query:
     * * Field-level tracing information.
     * * The generated request/response functions that got resolved for each field.
     */
    public fun fieldLogLevel(fieldLogLevel: String) {
        cdkBuilder.fieldLogLevel(fieldLogLevel)
    }

    public fun build(): CfnGraphQLApi.LogConfigProperty = cdkBuilder.build()
}
