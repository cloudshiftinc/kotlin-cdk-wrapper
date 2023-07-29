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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.RequestValidatorProps

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * RestApi restApi;
 * RequestValidatorProps requestValidatorProps = RequestValidatorProps.builder()
 * .restApi(restApi)
 * // the properties below are optional
 * .requestValidatorName("requestValidatorName")
 * .validateRequestBody(false)
 * .validateRequestParameters(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class RequestValidatorPropsDsl {
    private val cdkBuilder: RequestValidatorProps.Builder = RequestValidatorProps.builder()

    /** @param requestValidatorName The name of this request validator. */
    public fun requestValidatorName(requestValidatorName: String) {
        cdkBuilder.requestValidatorName(requestValidatorName)
    }

    /**
     * @param restApi The rest API that this model is part of. The reason we need the RestApi object
     *   itself and not just the ID is because the model is being tracked by the top-level RestApi
     *   object for the purpose of calculating it's hash to determine the ID of the deployment. This
     *   allows us to automatically update the deployment when the model of the REST API changes.
     */
    public fun restApi(restApi: IRestApi) {
        cdkBuilder.restApi(restApi)
    }

    /**
     * @param validateRequestBody Indicates whether to validate the request body according to the
     *   configured schema for the targeted API and method.
     */
    public fun validateRequestBody(validateRequestBody: Boolean) {
        cdkBuilder.validateRequestBody(validateRequestBody)
    }

    /** @param validateRequestParameters Indicates whether to validate request parameters. */
    public fun validateRequestParameters(validateRequestParameters: Boolean) {
        cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): RequestValidatorProps = cdkBuilder.build()
}
