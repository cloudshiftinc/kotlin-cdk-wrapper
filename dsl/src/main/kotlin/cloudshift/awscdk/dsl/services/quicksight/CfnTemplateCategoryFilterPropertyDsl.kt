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
public class CfnTemplateCategoryFilterPropertyDsl {
    private val cdkBuilder: CfnTemplate.CategoryFilterProperty.Builder =
        CfnTemplate.CategoryFilterProperty.builder()

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    public fun configuration(configuration: CfnTemplate.CategoryFilterConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    public fun filterId(filterId: String) {
        cdkBuilder.filterId(filterId)
    }

    public fun build(): CfnTemplate.CategoryFilterProperty = cdkBuilder.build()
}
