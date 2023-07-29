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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A visual that contains custom content.
 *
 * For more information, see
 * [Using custom visual content](https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html)
 * in the *Amazon QuickSight User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomContentVisualProperty customContentVisualProperty = CustomContentVisualProperty.builder()
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
 * .chartConfiguration(CustomContentConfigurationProperty.builder()
 * .contentType("contentType")
 * .contentUrl("contentUrl")
 * .imageScaling("imageScaling")
 * .build())
 * .subtitle(VisualSubtitleLabelOptionsProperty.builder()
 * .formatText(LongFormatTextProperty.builder()
 * .plainText("plainText")
 * .richText("richText")
 * .build())
 * .visibility("visibility")
 * .build())
 * .title(VisualTitleLabelOptionsProperty.builder()
 * .formatText(ShortFormatTextProperty.builder()
 * .plainText("plainText")
 * .richText("richText")
 * .build())
 * .visibility("visibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-customcontentvisual.html)
 */
@CdkDslMarker
public class CfnTemplateCustomContentVisualPropertyDsl {
    private val cdkBuilder: CfnTemplate.CustomContentVisualProperty.Builder =
        CfnTemplate.CustomContentVisualProperty.builder()

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

    /** @param chartConfiguration The configuration of a `CustomContentVisual` . */
    public fun chartConfiguration(chartConfiguration: IResolvable) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    /** @param chartConfiguration The configuration of a `CustomContentVisual` . */
    public fun chartConfiguration(
        chartConfiguration: CfnTemplate.CustomContentConfigurationProperty
    ) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    /**
     * @param dataSetIdentifier The dataset that is used to create the custom content visual. You
     *   can't create a visual without a dataset.
     */
    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    /** @param subtitle The subtitle that is displayed on the visual. */
    public fun subtitle(subtitle: IResolvable) {
        cdkBuilder.subtitle(subtitle)
    }

    /** @param subtitle The subtitle that is displayed on the visual. */
    public fun subtitle(subtitle: CfnTemplate.VisualSubtitleLabelOptionsProperty) {
        cdkBuilder.subtitle(subtitle)
    }

    /** @param title The title that is displayed on the visual. */
    public fun title(title: IResolvable) {
        cdkBuilder.title(title)
    }

    /** @param title The title that is displayed on the visual. */
    public fun title(title: CfnTemplate.VisualTitleLabelOptionsProperty) {
        cdkBuilder.title(title)
    }

    /**
     * @param visualId The unique identifier of a visual. This identifier must be unique within the
     *   context of a dashboard, template, or analysis. Two dashboards, analyses, or templates can
     *   have visuals with the same identifiers.
     */
    public fun visualId(visualId: String) {
        cdkBuilder.visualId(visualId)
    }

    public fun build(): CfnTemplate.CustomContentVisualProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
