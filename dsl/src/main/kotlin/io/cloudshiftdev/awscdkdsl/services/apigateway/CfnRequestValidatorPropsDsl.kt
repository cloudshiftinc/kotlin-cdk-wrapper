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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps

/**
 * Properties for defining a `CfnRequestValidator`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnRequestValidatorProps cfnRequestValidatorProps = CfnRequestValidatorProps.builder()
 * .restApiId("restApiId")
 * // the properties below are optional
 * .name("name")
 * .validateRequestBody(false)
 * .validateRequestParameters(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html)
 */
@CdkDslMarker
public class CfnRequestValidatorPropsDsl {
    private val cdkBuilder: CfnRequestValidatorProps.Builder = CfnRequestValidatorProps.builder()

    /** @param name The name of this RequestValidator. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param restApiId The string identifier of the associated RestApi. */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     *   according to the configured Model schema.
     */
    public fun validateRequestBody(validateRequestBody: Boolean) {
        cdkBuilder.validateRequestBody(validateRequestBody)
    }

    /**
     * @param validateRequestBody A Boolean flag to indicate whether to validate a request body
     *   according to the configured Model schema.
     */
    public fun validateRequestBody(validateRequestBody: IResolvable) {
        cdkBuilder.validateRequestBody(validateRequestBody)
    }

    /**
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     *   parameters ( `true` ) or not ( `false` ).
     */
    public fun validateRequestParameters(validateRequestParameters: Boolean) {
        cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    /**
     * @param validateRequestParameters A Boolean flag to indicate whether to validate request
     *   parameters ( `true` ) or not ( `false` ).
     */
    public fun validateRequestParameters(validateRequestParameters: IResolvable) {
        cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): CfnRequestValidatorProps = cdkBuilder.build()
}
