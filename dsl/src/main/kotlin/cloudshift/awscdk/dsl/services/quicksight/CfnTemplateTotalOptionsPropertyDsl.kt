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
public class CfnTemplateTotalOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TotalOptionsProperty.Builder =
        CfnTemplate.TotalOptionsProperty.builder()

    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun placement(placement: String) {
        cdkBuilder.placement(placement)
    }

    public fun scrollStatus(scrollStatus: String) {
        cdkBuilder.scrollStatus(scrollStatus)
    }

    public fun totalCellStyle(totalCellStyle: IResolvable) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    public fun totalCellStyle(totalCellStyle: CfnTemplate.TableCellStyleProperty) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    public fun totalsVisibility(totalsVisibility: String) {
        cdkBuilder.totalsVisibility(totalsVisibility)
    }

    public fun build(): CfnTemplate.TotalOptionsProperty = cdkBuilder.build()
}
