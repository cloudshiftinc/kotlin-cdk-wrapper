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
public class CfnTemplateScrollBarOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ScrollBarOptionsProperty.Builder =
        CfnTemplate.ScrollBarOptionsProperty.builder()

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun visibleRange(visibleRange: IResolvable) {
        cdkBuilder.visibleRange(visibleRange)
    }

    public fun visibleRange(visibleRange: CfnTemplate.VisibleRangeOptionsProperty) {
        cdkBuilder.visibleRange(visibleRange)
    }

    public fun build(): CfnTemplate.ScrollBarOptionsProperty = cdkBuilder.build()
}
