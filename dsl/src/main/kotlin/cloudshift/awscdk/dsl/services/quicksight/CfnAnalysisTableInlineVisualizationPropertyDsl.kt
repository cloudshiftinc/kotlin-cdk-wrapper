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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableInlineVisualizationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableInlineVisualizationProperty.Builder =
        CfnAnalysis.TableInlineVisualizationProperty.builder()

    public fun dataBars(dataBars: IResolvable) {
        cdkBuilder.dataBars(dataBars)
    }

    public fun dataBars(dataBars: CfnAnalysis.DataBarsOptionsProperty) {
        cdkBuilder.dataBars(dataBars)
    }

    public fun build(): CfnAnalysis.TableInlineVisualizationProperty = cdkBuilder.build()
}
