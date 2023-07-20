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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnAutomationRuleNoteUpdatePropertyDsl {
    private val cdkBuilder: CfnAutomationRule.NoteUpdateProperty.Builder =
        CfnAutomationRule.NoteUpdateProperty.builder()

    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun updatedBy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.updatedBy(builder.map)
    }

    public fun updatedBy(updatedBy: Any) {
        cdkBuilder.updatedBy(updatedBy)
    }

    public fun build(): CfnAutomationRule.NoteUpdateProperty = cdkBuilder.build()
}
