@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The operation that is defined by the custom action.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VisualCustomActionOperationProperty visualCustomActionOperationProperty =
 * VisualCustomActionOperationProperty.builder()
 * .filterOperation(CustomActionFilterOperationProperty.builder()
 * .selectedFieldsConfiguration(FilterOperationSelectedFieldsConfigurationProperty.builder()
 * .selectedColumns(List.of(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build()))
 * .selectedFieldOptions("selectedFieldOptions")
 * .selectedFields(List.of("selectedFields"))
 * .build())
 * .targetVisualsConfiguration(FilterOperationTargetVisualsConfigurationProperty.builder()
 * .sameSheetTargetVisualConfiguration(SameSheetTargetVisualConfigurationProperty.builder()
 * .targetVisualOptions("targetVisualOptions")
 * .targetVisuals(List.of("targetVisuals"))
 * .build())
 * .build())
 * .build())
 * .navigationOperation(CustomActionNavigationOperationProperty.builder()
 * .localNavigationConfiguration(LocalNavigationConfigurationProperty.builder()
 * .targetSheetId("targetSheetId")
 * .build())
 * .build())
 * .setParametersOperation(CustomActionSetParametersOperationProperty.builder()
 * .parameterValueConfigurations(List.of(SetParameterValueConfigurationProperty.builder()
 * .destinationParameterName("destinationParameterName")
 * .value(DestinationParameterValueConfigurationProperty.builder()
 * .customValuesConfiguration(CustomValuesConfigurationProperty.builder()
 * .customValues(CustomParameterValuesProperty.builder()
 * .dateTimeValues(List.of("dateTimeValues"))
 * .decimalValues(List.of(123))
 * .integerValues(List.of(123))
 * .stringValues(List.of("stringValues"))
 * .build())
 * // the properties below are optional
 * .includeNullValue(false)
 * .build())
 * .selectAllValueOptions("selectAllValueOptions")
 * .sourceColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sourceField("sourceField")
 * .sourceParameterName("sourceParameterName")
 * .build())
 * .build()))
 * .build())
 * .urlOperation(CustomActionURLOperationProperty.builder()
 * .urlTarget("urlTarget")
 * .urlTemplate("urlTemplate")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-visualcustomactionoperation.html)
 */
@CdkDslMarker
public class CfnTemplateVisualCustomActionOperationPropertyDsl {
    private val cdkBuilder: CfnTemplate.VisualCustomActionOperationProperty.Builder =
        CfnTemplate.VisualCustomActionOperationProperty.builder()

    /**
     * @param filterOperation The filter operation that filters data included in a visual or in an
     * entire sheet.
     */
    public fun filterOperation(filterOperation: IResolvable) {
        cdkBuilder.filterOperation(filterOperation)
    }

    /**
     * @param filterOperation The filter operation that filters data included in a visual or in an
     * entire sheet.
     */
    public fun filterOperation(filterOperation: CfnTemplate.CustomActionFilterOperationProperty) {
        cdkBuilder.filterOperation(filterOperation)
    }

    /**
     * @param navigationOperation The navigation operation that navigates between different sheets in
     * the same analysis.
     */
    public fun navigationOperation(navigationOperation: IResolvable) {
        cdkBuilder.navigationOperation(navigationOperation)
    }

    /**
     * @param navigationOperation The navigation operation that navigates between different sheets in
     * the same analysis.
     */
    public fun navigationOperation(navigationOperation: CfnTemplate.CustomActionNavigationOperationProperty) {
        cdkBuilder.navigationOperation(navigationOperation)
    }

    /**
     * @param setParametersOperation The set parameter operation that sets parameters in custom
     * action.
     */
    public fun setParametersOperation(setParametersOperation: IResolvable) {
        cdkBuilder.setParametersOperation(setParametersOperation)
    }

    /**
     * @param setParametersOperation The set parameter operation that sets parameters in custom
     * action.
     */
    public fun setParametersOperation(setParametersOperation: CfnTemplate.CustomActionSetParametersOperationProperty) {
        cdkBuilder.setParametersOperation(setParametersOperation)
    }

    /**
     * @param urlOperation The URL operation that opens a link to another webpage.
     */
    public fun urlOperation(urlOperation: IResolvable) {
        cdkBuilder.urlOperation(urlOperation)
    }

    /**
     * @param urlOperation The URL operation that opens a link to another webpage.
     */
    public fun urlOperation(urlOperation: CfnTemplate.CustomActionURLOperationProperty) {
        cdkBuilder.urlOperation(urlOperation)
    }

    public fun build(): CfnTemplate.VisualCustomActionOperationProperty = cdkBuilder.build()
}
