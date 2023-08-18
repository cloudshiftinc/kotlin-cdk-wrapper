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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.AddApiKeyOptions

/**
 * Options to the UsagePlan.addApiKey() method.
 *
 * Example:
 * ```
 * UsagePlan usageplan;
 * ApiKey apiKey;
 * usageplan.addApiKey(apiKey, AddApiKeyOptions.builder()
 * .overrideLogicalId("...")
 * .build());
 * ```
 */
@CdkDslMarker
public class AddApiKeyOptionsDsl {
    private val cdkBuilder: AddApiKeyOptions.Builder = AddApiKeyOptions.builder()

    /**
     * @param overrideLogicalId Override the CloudFormation logical id of the
     *   AWS::ApiGateway::UsagePlanKey resource.
     */
    public fun overrideLogicalId(overrideLogicalId: String) {
        cdkBuilder.overrideLogicalId(overrideLogicalId)
    }

    public fun build(): AddApiKeyOptions = cdkBuilder.build()
}
