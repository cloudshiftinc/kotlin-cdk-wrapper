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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnApiKey
import software.constructs.Construct

/**
 * The `AWS::AppSync::ApiKey` resource creates a unique key that you can distribute to clients who
 * are executing GraphQL operations with AWS AppSync that require an API key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnApiKey cfnApiKey = CfnApiKey.Builder.create(this, "MyCfnApiKey")
 * .apiId("apiId")
 * // the properties below are optional
 * .description("description")
 * .expires(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html)
 */
@CdkDslMarker
public class CfnApiKeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApiKey.Builder = CfnApiKey.Builder.create(scope, id)

    /**
     * Unique AWS AppSync GraphQL API ID for this API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
     *
     * @param apiId Unique AWS AppSync GraphQL API ID for this API key.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * Unique description of your API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
     *
     * @param description Unique description of your API key.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The time after which the API key expires.
     *
     * The date is represented as seconds since the epoch, rounded down to the nearest hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
     *
     * @param expires The time after which the API key expires.
     */
    public fun expires(expires: Number) {
        cdkBuilder.expires(expires)
    }

    public fun build(): CfnApiKey = cdkBuilder.build()
}
