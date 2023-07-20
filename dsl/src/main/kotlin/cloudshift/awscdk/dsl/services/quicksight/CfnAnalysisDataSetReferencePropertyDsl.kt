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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisDataSetReferencePropertyDsl {
    private val cdkBuilder: CfnAnalysis.DataSetReferenceProperty.Builder =
        CfnAnalysis.DataSetReferenceProperty.builder()

    public fun dataSetArn(dataSetArn: String) {
        cdkBuilder.dataSetArn(dataSetArn)
    }

    public fun dataSetPlaceholder(dataSetPlaceholder: String) {
        cdkBuilder.dataSetPlaceholder(dataSetPlaceholder)
    }

    public fun build(): CfnAnalysis.DataSetReferenceProperty = cdkBuilder.build()
}
