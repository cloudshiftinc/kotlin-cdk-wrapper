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
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * ProvisionedConcurrencyConfigProperty provisionedConcurrencyConfigProperty =
 * ProvisionedConcurrencyConfigProperty.builder()
 * .provisionedConcurrentExecutions("provisionedConcurrentExecutions")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-provisionedconcurrencyconfig.html)
 */
@CdkDslMarker
public class CfnFunctionProvisionedConcurrencyConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.ProvisionedConcurrencyConfigProperty.Builder =
        CfnFunction.ProvisionedConcurrencyConfigProperty.builder()

    /** @param provisionedConcurrentExecutions the value to be set. */
    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: String) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    public fun build(): CfnFunction.ProvisionedConcurrencyConfigProperty = cdkBuilder.build()
}
