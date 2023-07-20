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
public class CfnTemplateSheetPropertyDsl {
    private val cdkBuilder: CfnTemplate.SheetProperty.Builder = CfnTemplate.SheetProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sheetId(sheetId: String) {
        cdkBuilder.sheetId(sheetId)
    }

    public fun build(): CfnTemplate.SheetProperty = cdkBuilder.build()
}
