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
public class CfnTemplateTablePaginatedReportOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TablePaginatedReportOptionsProperty.Builder =
        CfnTemplate.TablePaginatedReportOptionsProperty.builder()

    public fun overflowColumnHeaderVisibility(overflowColumnHeaderVisibility: String) {
        cdkBuilder.overflowColumnHeaderVisibility(overflowColumnHeaderVisibility)
    }

    public fun verticalOverflowVisibility(verticalOverflowVisibility: String) {
        cdkBuilder.verticalOverflowVisibility(verticalOverflowVisibility)
    }

    public fun build(): CfnTemplate.TablePaginatedReportOptionsProperty = cdkBuilder.build()
}
