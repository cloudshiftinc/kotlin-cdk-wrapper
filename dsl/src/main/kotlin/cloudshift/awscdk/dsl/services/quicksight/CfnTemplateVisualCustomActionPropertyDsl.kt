@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A custom action defined on a visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VisualCustomActionProperty visualCustomActionProperty = VisualCustomActionProperty.builder()
 * .actionOperations(List.of(VisualCustomActionOperationProperty.builder()
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
 * .build()))
 * .customActionId("customActionId")
 * .name("name")
 * .trigger("trigger")
 * // the properties below are optional
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-visualcustomaction.html)
 */
@CdkDslMarker
public class CfnTemplateVisualCustomActionPropertyDsl {
    private val cdkBuilder: CfnTemplate.VisualCustomActionProperty.Builder =
        CfnTemplate.VisualCustomActionProperty.builder()

    private val _actionOperations: MutableList<Any> = mutableListOf()

    /**
     * @param actionOperations A list of `VisualCustomActionOperations` .
     * This is a union type structure. For this structure to be valid, only one of the attributes can
     * be defined.
     */
    public fun actionOperations(vararg actionOperations: Any) {
        _actionOperations.addAll(listOf(*actionOperations))
    }

    /**
     * @param actionOperations A list of `VisualCustomActionOperations` .
     * This is a union type structure. For this structure to be valid, only one of the attributes can
     * be defined.
     */
    public fun actionOperations(actionOperations: Collection<Any>) {
        _actionOperations.addAll(actionOperations)
    }

    /**
     * @param actionOperations A list of `VisualCustomActionOperations` .
     * This is a union type structure. For this structure to be valid, only one of the attributes can
     * be defined.
     */
    public fun actionOperations(actionOperations: IResolvable) {
        cdkBuilder.actionOperations(actionOperations)
    }

    /**
     * @param customActionId The ID of the `VisualCustomAction` .
     */
    public fun customActionId(customActionId: String) {
        cdkBuilder.customActionId(customActionId)
    }

    /**
     * @param name The name of the `VisualCustomAction` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param status The status of the `VisualCustomAction` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param trigger The trigger of the `VisualCustomAction` .
     * Valid values are defined as follows:
     *
     * * `DATA_POINT_CLICK` : Initiates a custom action by a left pointer click on a data point.
     * * `DATA_POINT_MENU` : Initiates a custom action by right pointer click from the menu.
     */
    public fun trigger(trigger: String) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): CfnTemplate.VisualCustomActionProperty {
        if (_actionOperations.isNotEmpty()) cdkBuilder.actionOperations(_actionOperations)
        return cdkBuilder.build()
    }
}
