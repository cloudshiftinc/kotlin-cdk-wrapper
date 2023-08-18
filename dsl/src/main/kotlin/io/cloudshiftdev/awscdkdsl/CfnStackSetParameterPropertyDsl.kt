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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnStackSet

/**
 * The Parameter data type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * ParameterProperty parameterProperty = ParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-parameter.html)
 */
@CdkDslMarker
public class CfnStackSetParameterPropertyDsl {
    private val cdkBuilder: CfnStackSet.ParameterProperty.Builder =
        CfnStackSet.ParameterProperty.builder()

    /**
     * @param parameterKey The key associated with the parameter. If you don't specify a key and
     *   value for a particular parameter, AWS CloudFormation uses the default value that's
     *   specified in your template.
     */
    public fun parameterKey(parameterKey: String) {
        cdkBuilder.parameterKey(parameterKey)
    }

    /** @param parameterValue The input value associated with the parameter. */
    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnStackSet.ParameterProperty = cdkBuilder.build()
}
