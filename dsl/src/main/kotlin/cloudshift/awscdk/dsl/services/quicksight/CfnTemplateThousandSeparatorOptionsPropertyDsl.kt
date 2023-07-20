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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateThousandSeparatorOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ThousandSeparatorOptionsProperty.Builder =
        CfnTemplate.ThousandSeparatorOptionsProperty.builder()

    public fun symbol(symbol: String) {
        cdkBuilder.symbol(symbol)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.ThousandSeparatorOptionsProperty = cdkBuilder.build()
}
