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
import kotlin.Number
import software.amazon.awscdk.services.lambda.CfnVersion

/**
 * A
 * [provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
 * configuration for a function's version.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * ProvisionedConcurrencyConfigurationProperty provisionedConcurrencyConfigurationProperty =
 * ProvisionedConcurrencyConfigurationProperty.builder()
 * .provisionedConcurrentExecutions(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html)
 */
@CdkDslMarker
public class CfnVersionProvisionedConcurrencyConfigurationPropertyDsl {
    private val cdkBuilder: CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder =
        CfnVersion.ProvisionedConcurrencyConfigurationProperty.builder()

    /**
     * @param provisionedConcurrentExecutions The amount of provisioned concurrency to allocate for
     *   the version.
     */
    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    public fun build(): CfnVersion.ProvisionedConcurrencyConfigurationProperty = cdkBuilder.build()
}
