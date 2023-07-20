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
import kotlin.String

@CdkDslMarker
public class CfnAnalysisColumnConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ColumnConfigurationProperty.Builder =
        CfnAnalysis.ColumnConfigurationProperty.builder()

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun formatConfiguration(formatConfiguration: IResolvable) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun formatConfiguration(formatConfiguration: CfnAnalysis.FormatConfigurationProperty) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun build(): CfnAnalysis.ColumnConfigurationProperty = cdkBuilder.build()
}
