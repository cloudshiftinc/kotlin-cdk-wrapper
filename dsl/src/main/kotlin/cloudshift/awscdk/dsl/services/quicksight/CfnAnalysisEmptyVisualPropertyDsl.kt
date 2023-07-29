@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * An empty visual.
 *
 * Empty visuals are used in layouts but have not been configured to show any data. A new visual
 * created in the Amazon QuickSight console is considered an `EmptyVisual` until a visual type is
 * selected.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * EmptyVisualProperty emptyVisualProperty = EmptyVisualProperty.builder()
 * .dataSetIdentifier("dataSetIdentifier")
 * .visualId("visualId")
 * // the properties below are optional
 * .actions(List.of(VisualCustomActionProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-emptyvisual.html)
 */
@CdkDslMarker
public class CfnAnalysisEmptyVisualPropertyDsl {
    private val cdkBuilder: CfnAnalysis.EmptyVisualProperty.Builder =
        CfnAnalysis.EmptyVisualProperty.builder()

    private val _actions: MutableList<Any> = mutableListOf()

    /** @param actions The list of custom actions that are configured for a visual. */
    public fun actions(vararg actions: Any) {
        _actions.addAll(listOf(*actions))
    }

    /** @param actions The list of custom actions that are configured for a visual. */
    public fun actions(actions: Collection<Any>) {
        _actions.addAll(actions)
    }

    /** @param actions The list of custom actions that are configured for a visual. */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /**
     * @param dataSetIdentifier The data set that is used in the empty visual. Every visual requires
     *   a dataset to render.
     */
    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    /**
     * @param visualId The unique identifier of a visual. This identifier must be unique within the
     *   context of a dashboard, template, or analysis. Two dashboards, analyses, or templates can
     *   have visuals with the same identifiers.
     */
    public fun visualId(visualId: String) {
        cdkBuilder.visualId(visualId)
    }

    public fun build(): CfnAnalysis.EmptyVisualProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
