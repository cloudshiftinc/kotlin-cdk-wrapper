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
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.RequestValidatorProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class RequestValidatorPropsDsl {
    private val cdkBuilder: RequestValidatorProps.Builder = RequestValidatorProps.builder()

    public fun requestValidatorName(requestValidatorName: String) {
        cdkBuilder.requestValidatorName(requestValidatorName)
    }

    public fun restApi(restApi: IRestApi) {
        cdkBuilder.restApi(restApi)
    }

    public fun validateRequestBody(validateRequestBody: Boolean) {
        cdkBuilder.validateRequestBody(validateRequestBody)
    }

    public fun validateRequestParameters(validateRequestParameters: Boolean) {
        cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): RequestValidatorProps = cdkBuilder.build()
}
