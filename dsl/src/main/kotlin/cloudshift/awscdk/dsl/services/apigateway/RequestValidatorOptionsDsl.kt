@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class RequestValidatorOptionsDsl {
    private val cdkBuilder: RequestValidatorOptions.Builder = RequestValidatorOptions.builder()

    public fun requestValidatorName(requestValidatorName: String) {
        cdkBuilder.requestValidatorName(requestValidatorName)
    }

    public fun validateRequestBody(validateRequestBody: Boolean) {
        cdkBuilder.validateRequestBody(validateRequestBody)
    }

    public fun validateRequestParameters(validateRequestParameters: Boolean) {
        cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): RequestValidatorOptions = cdkBuilder.build()
}
