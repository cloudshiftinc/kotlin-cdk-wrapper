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

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ssm.CommonStringParameterAttributes

/**
 * Common attributes for string parameters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * CommonStringParameterAttributes commonStringParameterAttributes =
 * CommonStringParameterAttributes.builder()
 * .parameterName("parameterName")
 * // the properties below are optional
 * .simpleName(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class CommonStringParameterAttributesDsl {
    private val cdkBuilder: CommonStringParameterAttributes.Builder =
        CommonStringParameterAttributes.builder()

    /**
     * @param parameterName The name of the parameter store value. This value can be a token or a
     *   concrete string. If it is a concrete string and includes "/" it must also be prefixed with
     *   a "/" (fully-qualified).
     */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param simpleName Indicates of the parameter name is a simple name (i.e. does not include "/"
     *   separators). This is only required only if `parameterName` is a token, which means we are
     *   unable to detect if the name is simple or "path-like" for the purpose of rendering SSM
     *   parameter ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or undefined) since the
     * name generated by AWS CloudFormation is always a simple name.
     */
    public fun simpleName(simpleName: Boolean) {
        cdkBuilder.simpleName(simpleName)
    }

    public fun build(): CommonStringParameterAttributes = cdkBuilder.build()
}