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
import kotlin.Number

@CdkDslMarker
public class CfnTemplateBinCountOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.BinCountOptionsProperty.Builder =
        CfnTemplate.BinCountOptionsProperty.builder()

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.BinCountOptionsProperty = cdkBuilder.build()
}
