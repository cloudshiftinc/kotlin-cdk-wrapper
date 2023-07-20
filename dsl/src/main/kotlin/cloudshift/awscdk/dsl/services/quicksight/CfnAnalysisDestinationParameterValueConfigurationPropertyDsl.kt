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
public class CfnAnalysisDestinationParameterValueConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DestinationParameterValueConfigurationProperty.Builder =
        CfnAnalysis.DestinationParameterValueConfigurationProperty.builder()

    public fun customValuesConfiguration(customValuesConfiguration: IResolvable) {
        cdkBuilder.customValuesConfiguration(customValuesConfiguration)
    }

    public fun customValuesConfiguration(customValuesConfiguration: CfnAnalysis.CustomValuesConfigurationProperty) {
        cdkBuilder.customValuesConfiguration(customValuesConfiguration)
    }

    public fun selectAllValueOptions(selectAllValueOptions: String) {
        cdkBuilder.selectAllValueOptions(selectAllValueOptions)
    }

    public fun sourceColumn(sourceColumn: IResolvable) {
        cdkBuilder.sourceColumn(sourceColumn)
    }

    public fun sourceColumn(sourceColumn: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.sourceColumn(sourceColumn)
    }

    public fun sourceField(sourceField: String) {
        cdkBuilder.sourceField(sourceField)
    }

    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    public fun build(): CfnAnalysis.DestinationParameterValueConfigurationProperty =
        cdkBuilder.build()
}
