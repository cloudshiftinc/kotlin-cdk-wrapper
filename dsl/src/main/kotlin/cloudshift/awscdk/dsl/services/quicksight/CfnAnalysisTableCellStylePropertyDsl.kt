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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAnalysisTableCellStylePropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableCellStyleProperty.Builder =
        CfnAnalysis.TableCellStyleProperty.builder()

    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun border(border: IResolvable) {
        cdkBuilder.border(border)
    }

    public fun border(border: CfnAnalysis.GlobalTableBorderOptionsProperty) {
        cdkBuilder.border(border)
    }

    public fun fontConfiguration(fontConfiguration: IResolvable) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    public fun horizontalTextAlignment(horizontalTextAlignment: String) {
        cdkBuilder.horizontalTextAlignment(horizontalTextAlignment)
    }

    public fun textWrap(textWrap: String) {
        cdkBuilder.textWrap(textWrap)
    }

    public fun verticalTextAlignment(verticalTextAlignment: String) {
        cdkBuilder.verticalTextAlignment(verticalTextAlignment)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.TableCellStyleProperty = cdkBuilder.build()
}
