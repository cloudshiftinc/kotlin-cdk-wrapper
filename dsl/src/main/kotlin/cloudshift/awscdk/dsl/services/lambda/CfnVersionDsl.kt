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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVersion.Builder = CfnVersion.Builder.create(scope, id)

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

    public fun build(): CfnVersion = cdkBuilder.build()
}
