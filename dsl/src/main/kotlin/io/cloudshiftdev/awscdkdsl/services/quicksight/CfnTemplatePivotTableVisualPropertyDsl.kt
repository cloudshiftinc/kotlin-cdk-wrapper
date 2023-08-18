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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A pivot table.
 *
 * For more information, see
 * [Using pivot tables](https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html) in the
 * *Amazon QuickSight User Guide* .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-pivottablevisual.html)
 */
@CdkDslMarker
public class CfnTemplatePivotTableVisualPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableVisualProperty.Builder =
        CfnTemplate.PivotTableVisualProperty.builder()

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

    /** @param chartConfiguration The configuration settings of the visual. */
    public fun chartConfiguration(chartConfiguration: IResolvable) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    /** @param chartConfiguration The configuration settings of the visual. */
    public fun chartConfiguration(chartConfiguration: CfnTemplate.PivotTableConfigurationProperty) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    /** @param conditionalFormatting The conditional formatting for a `PivotTableVisual` . */
    public fun conditionalFormatting(conditionalFormatting: IResolvable) {
        cdkBuilder.conditionalFormatting(conditionalFormatting)
    }

    /** @param conditionalFormatting The conditional formatting for a `PivotTableVisual` . */
    public fun conditionalFormatting(
        conditionalFormatting: CfnTemplate.PivotTableConditionalFormattingProperty
    ) {
        cdkBuilder.conditionalFormatting(conditionalFormatting)
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
     *   have visuals with the same identifiers..
     */
    public fun visualId(visualId: String) {
        cdkBuilder.visualId(visualId)
    }

    public fun build(): CfnTemplate.PivotTableVisualProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
