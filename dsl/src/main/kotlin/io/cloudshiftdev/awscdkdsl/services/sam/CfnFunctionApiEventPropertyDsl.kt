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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object customStatements;
 * ApiEventProperty apiEventProperty = ApiEventProperty.builder()
 * .method("method")
 * .path("path")
 * // the properties below are optional
 * .auth(AuthProperty.builder()
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizer("authorizer")
 * .resourcePolicy(AuthResourcePolicyProperty.builder()
 * .awsAccountBlacklist(List.of("awsAccountBlacklist"))
 * .awsAccountWhitelist(List.of("awsAccountWhitelist"))
 * .customStatements(List.of(customStatements))
 * .intrinsicVpcBlacklist(List.of("intrinsicVpcBlacklist"))
 * .intrinsicVpceBlacklist(List.of("intrinsicVpceBlacklist"))
 * .intrinsicVpceWhitelist(List.of("intrinsicVpceWhitelist"))
 * .intrinsicVpcWhitelist(List.of("intrinsicVpcWhitelist"))
 * .ipRangeBlacklist(List.of("ipRangeBlacklist"))
 * .ipRangeWhitelist(List.of("ipRangeWhitelist"))
 * .sourceVpcBlacklist(List.of("sourceVpcBlacklist"))
 * .sourceVpcWhitelist(List.of("sourceVpcWhitelist"))
 * .build())
 * .build())
 * .requestModel(RequestModelProperty.builder()
 * .model("model")
 * // the properties below are optional
 * .required(false)
 * .validateBody(false)
 * .validateParameters(false)
 * .build())
 * .requestParameters(List.of("requestParameters"))
 * .restApiId("restApiId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-apievent.html)
 */
@CdkDslMarker
public class CfnFunctionApiEventPropertyDsl {
    private val cdkBuilder: CfnFunction.ApiEventProperty.Builder =
        CfnFunction.ApiEventProperty.builder()

    private val _requestParameters: MutableList<Any> = mutableListOf()

    /** @param auth the value to be set. */
    public fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth)
    }

    /** @param auth the value to be set. */
    public fun auth(auth: CfnFunction.AuthProperty) {
        cdkBuilder.auth(auth)
    }

    /** @param method the value to be set. */
    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    /** @param path the value to be set. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param requestModel the value to be set. */
    public fun requestModel(requestModel: IResolvable) {
        cdkBuilder.requestModel(requestModel)
    }

    /** @param requestModel the value to be set. */
    public fun requestModel(requestModel: CfnFunction.RequestModelProperty) {
        cdkBuilder.requestModel(requestModel)
    }

    /** @param requestParameters the value to be set. */
    public fun requestParameters(vararg requestParameters: Any) {
        _requestParameters.addAll(listOf(*requestParameters))
    }

    /** @param requestParameters the value to be set. */
    public fun requestParameters(requestParameters: Collection<Any>) {
        _requestParameters.addAll(requestParameters)
    }

    /** @param requestParameters the value to be set. */
    public fun requestParameters(requestParameters: IResolvable) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /** @param restApiId the value to be set. */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun build(): CfnFunction.ApiEventProperty {
        if (_requestParameters.isNotEmpty()) cdkBuilder.requestParameters(_requestParameters)
        return cdkBuilder.build()
    }
}
