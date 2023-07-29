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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * The updated note.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * Object updatedBy;
 * NoteUpdateProperty noteUpdateProperty = NoteUpdateProperty.builder()
 * .text("text")
 * .updatedBy(updatedBy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-noteupdate.html)
 */
@CdkDslMarker
public class CfnAutomationRuleNoteUpdatePropertyDsl {
    private val cdkBuilder: CfnAutomationRule.NoteUpdateProperty.Builder =
        CfnAutomationRule.NoteUpdateProperty.builder()

    /** @param text The updated note text. */
    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    /** @param updatedBy The principal that updated the note. */
    public fun updatedBy(updatedBy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(updatedBy)
        cdkBuilder.updatedBy(builder.map)
    }

    /** @param updatedBy The principal that updated the note. */
    public fun updatedBy(updatedBy: Any) {
        cdkBuilder.updatedBy(updatedBy)
    }

    public fun build(): CfnAutomationRule.NoteUpdateProperty = cdkBuilder.build()
}
