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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnApiKeyProps

/**
 * Properties for defining a `CfnApiKey`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnApiKeyProps cfnApiKeyProps = CfnApiKeyProps.builder()
 * .apiId("apiId")
 * // the properties below are optional
 * .apiKeyId("apiKeyId")
 * .description("description")
 * .expires(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html)
 */
@CdkDslMarker
public class CfnApiKeyPropsDsl {
    private val cdkBuilder: CfnApiKeyProps.Builder = CfnApiKeyProps.builder()

    /** @param apiId Unique AWS AppSync GraphQL API ID for this API key. */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /** @param apiKeyId The API key ID. */
    public fun apiKeyId(apiKeyId: String) {
        cdkBuilder.apiKeyId(apiKeyId)
    }

    /** @param description Unique description of your API key. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param expires The time after which the API key expires. The date is represented as seconds
     *   since the epoch, rounded down to the nearest hour.
     */
    public fun expires(expires: Number) {
        cdkBuilder.expires(expires)
    }

    public fun build(): CfnApiKeyProps = cdkBuilder.build()
}
