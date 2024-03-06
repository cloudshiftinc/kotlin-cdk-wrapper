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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * FunctionUrlConfigProperty functionUrlConfigProperty = FunctionUrlConfigProperty.builder()
 * .authType("authType")
 * // the properties below are optional
 * .cors("cors")
 * .invokeMode("invokeMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-functionurlconfig.html)
 */
@CdkDslMarker
public class CfnFunctionFunctionUrlConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.FunctionUrlConfigProperty.Builder =
        CfnFunction.FunctionUrlConfigProperty.builder()

    /** @param authType the value to be set. */
    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    /** @param cors the value to be set. */
    public fun cors(cors: String) {
        cdkBuilder.cors(cors)
    }

    /** @param cors the value to be set. */
    public fun cors(cors: IResolvable) {
        cdkBuilder.cors(cors)
    }

    /** @param cors the value to be set. */
    public fun cors(cors: CfnFunction.CorsConfigurationProperty) {
        cdkBuilder.cors(cors)
    }

    /** @param invokeMode the value to be set. */
    public fun invokeMode(invokeMode: String) {
        cdkBuilder.invokeMode(invokeMode)
    }

    public fun build(): CfnFunction.FunctionUrlConfigProperty = cdkBuilder.build()
}
