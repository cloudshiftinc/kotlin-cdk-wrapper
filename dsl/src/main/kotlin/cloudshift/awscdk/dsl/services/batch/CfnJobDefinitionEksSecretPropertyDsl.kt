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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionEksSecretPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EksSecretProperty.Builder =
        CfnJobDefinition.EksSecretProperty.builder()

    public fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
    }

    public fun optional(optional: IResolvable) {
        cdkBuilder.optional(optional)
    }

    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): CfnJobDefinition.EksSecretProperty = cdkBuilder.build()
}
