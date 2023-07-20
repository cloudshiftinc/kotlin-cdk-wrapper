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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateSectionStylePropertyDsl {
    private val cdkBuilder: CfnTemplate.SectionStyleProperty.Builder =
        CfnTemplate.SectionStyleProperty.builder()

    public fun height(height: String) {
        cdkBuilder.height(height)
    }

    public fun padding(padding: IResolvable) {
        cdkBuilder.padding(padding)
    }

    public fun padding(padding: CfnTemplate.SpacingProperty) {
        cdkBuilder.padding(padding)
    }

    public fun build(): CfnTemplate.SectionStyleProperty = cdkBuilder.build()
}
