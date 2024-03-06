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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnVersion

/**
 * Runtime Management Config of a function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * RuntimePolicyProperty runtimePolicyProperty = RuntimePolicyProperty.builder()
 * .updateRuntimeOn("updateRuntimeOn")
 * // the properties below are optional
 * .runtimeVersionArn("runtimeVersionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-runtimepolicy.html)
 */
@CdkDslMarker
public class CfnVersionRuntimePolicyPropertyDsl {
    private val cdkBuilder: CfnVersion.RuntimePolicyProperty.Builder =
        CfnVersion.RuntimePolicyProperty.builder()

    /**
     * @param runtimeVersionArn The ARN of the runtime the function is configured to use. If the
     *   runtime update mode is manual, the ARN is returned, otherwise null is returned.
     */
    public fun runtimeVersionArn(runtimeVersionArn: String) {
        cdkBuilder.runtimeVersionArn(runtimeVersionArn)
    }

    /** @param updateRuntimeOn The runtime update mode. */
    public fun updateRuntimeOn(updateRuntimeOn: String) {
        cdkBuilder.updateRuntimeOn(updateRuntimeOn)
    }

    public fun build(): CfnVersion.RuntimePolicyProperty = cdkBuilder.build()
}
