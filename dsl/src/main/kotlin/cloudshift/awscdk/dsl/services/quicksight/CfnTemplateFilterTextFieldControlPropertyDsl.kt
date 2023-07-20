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
public class CfnTemplateFilterTextFieldControlPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilterTextFieldControlProperty.Builder =
        CfnTemplate.FilterTextFieldControlProperty.builder()

    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun displayOptions(displayOptions: CfnTemplate.TextFieldControlDisplayOptionsProperty) {
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

    public fun build(): CfnTemplate.FilterTextFieldControlProperty = cdkBuilder.build()
}
