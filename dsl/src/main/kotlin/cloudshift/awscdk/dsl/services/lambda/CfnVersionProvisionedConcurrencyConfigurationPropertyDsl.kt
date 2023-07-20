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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnVersion
import kotlin.Number

@CdkDslMarker
public class CfnVersionProvisionedConcurrencyConfigurationPropertyDsl {
    private val cdkBuilder: CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder =
        CfnVersion.ProvisionedConcurrencyConfigurationProperty.builder()

    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    public fun build(): CfnVersion.ProvisionedConcurrencyConfigurationProperty = cdkBuilder.build()
}
