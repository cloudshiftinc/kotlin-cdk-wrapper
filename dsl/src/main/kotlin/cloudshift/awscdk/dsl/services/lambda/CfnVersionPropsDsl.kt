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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.CfnVersionProps
import kotlin.String

@CdkDslMarker
public class CfnVersionPropsDsl {
    private val cdkBuilder: CfnVersionProps.Builder = CfnVersionProps.builder()

    public fun codeSha256(codeSha256: String) {
        cdkBuilder.codeSha256(codeSha256)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    public fun build(): CfnVersionProps = cdkBuilder.build()
}
