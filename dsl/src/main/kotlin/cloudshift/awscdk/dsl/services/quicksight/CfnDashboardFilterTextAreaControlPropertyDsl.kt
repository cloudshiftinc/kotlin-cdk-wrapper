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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardFilterTextAreaControlPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilterTextAreaControlProperty.Builder =
        CfnDashboard.FilterTextAreaControlProperty.builder()

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun displayOptions(displayOptions: CfnDashboard.TextAreaControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun filterControlId(filterControlId: String) {
        cdkBuilder.filterControlId(filterControlId)
    }

    public fun sourceFilterId(sourceFilterId: String) {
        cdkBuilder.sourceFilterId(sourceFilterId)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnDashboard.FilterTextAreaControlProperty = cdkBuilder.build()
}
