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
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionUlimitPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.UlimitProperty.Builder =
        CfnJobDefinition.UlimitProperty.builder()

    public fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
    }

    public fun build(): CfnJobDefinition.UlimitProperty = cdkBuilder.build()
}
