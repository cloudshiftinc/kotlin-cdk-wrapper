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
public class CfnAnalysisDataSetIdentifierDeclarationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DataSetIdentifierDeclarationProperty.Builder =
        CfnAnalysis.DataSetIdentifierDeclarationProperty.builder()

    public fun dataSetArn(dataSetArn: String) {
        cdkBuilder.dataSetArn(dataSetArn)
    }

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun build(): CfnAnalysis.DataSetIdentifierDeclarationProperty = cdkBuilder.build()
}
