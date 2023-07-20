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
public class CfnTemplateDestinationParameterValueConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.DestinationParameterValueConfigurationProperty.Builder =
        CfnTemplate.DestinationParameterValueConfigurationProperty.builder()

    public fun customValuesConfiguration(customValuesConfiguration: IResolvable) {
        cdkBuilder.customValuesConfiguration(customValuesConfiguration)
    }

    public fun customValuesConfiguration(customValuesConfiguration: CfnTemplate.CustomValuesConfigurationProperty) {
        cdkBuilder.customValuesConfiguration(customValuesConfiguration)
    }

    public fun selectAllValueOptions(selectAllValueOptions: String) {
        cdkBuilder.selectAllValueOptions(selectAllValueOptions)
    }

    public fun sourceColumn(sourceColumn: IResolvable) {
        cdkBuilder.sourceColumn(sourceColumn)
    }

    public fun sourceColumn(sourceColumn: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.sourceColumn(sourceColumn)
    }

    public fun sourceField(sourceField: String) {
        cdkBuilder.sourceField(sourceField)
    }

    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    public fun build(): CfnTemplate.DestinationParameterValueConfigurationProperty =
        cdkBuilder.build()
}
