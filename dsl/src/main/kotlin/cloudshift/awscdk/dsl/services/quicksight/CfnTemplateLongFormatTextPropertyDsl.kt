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
public class CfnTemplateLongFormatTextPropertyDsl {
    private val cdkBuilder: CfnTemplate.LongFormatTextProperty.Builder =
        CfnTemplate.LongFormatTextProperty.builder()

    public fun plainText(plainText: String) {
        cdkBuilder.plainText(plainText)
    }

    public fun richText(richText: String) {
        cdkBuilder.richText(richText)
    }

    public fun build(): CfnTemplate.LongFormatTextProperty = cdkBuilder.build()
}
