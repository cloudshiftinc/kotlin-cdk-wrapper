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

@CdkDslMarker
public class CfnTemplateTableInlineVisualizationPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableInlineVisualizationProperty.Builder =
        CfnTemplate.TableInlineVisualizationProperty.builder()

    public fun dataBars(dataBars: IResolvable) {
        cdkBuilder.dataBars(dataBars)
    }

    public fun dataBars(dataBars: CfnTemplate.DataBarsOptionsProperty) {
        cdkBuilder.dataBars(dataBars)
    }

    public fun build(): CfnTemplate.TableInlineVisualizationProperty = cdkBuilder.build()
}
