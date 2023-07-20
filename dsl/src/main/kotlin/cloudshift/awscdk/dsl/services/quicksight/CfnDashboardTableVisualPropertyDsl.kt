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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardTableVisualPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableVisualProperty.Builder =
        CfnDashboard.TableVisualProperty.builder()

    private val _actions: MutableList<Any> = mutableListOf()

    public fun actions(vararg actions: Any) {
        _actions.addAll(listOf(*actions))
    }

    public fun actions(actions: Collection<Any>) {
        _actions.addAll(actions)
    }

    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    public fun chartConfiguration(chartConfiguration: IResolvable) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    public fun chartConfiguration(chartConfiguration: CfnDashboard.TableConfigurationProperty) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    public fun conditionalFormatting(conditionalFormatting: IResolvable) {
        cdkBuilder.conditionalFormatting(conditionalFormatting)
    }

    public fun conditionalFormatting(conditionalFormatting: CfnDashboard.TableConditionalFormattingProperty) {
        cdkBuilder.conditionalFormatting(conditionalFormatting)
    }

    public fun subtitle(subtitle: IResolvable) {
        cdkBuilder.subtitle(subtitle)
    }

    public fun subtitle(subtitle: CfnDashboard.VisualSubtitleLabelOptionsProperty) {
        cdkBuilder.subtitle(subtitle)
    }

    public fun title(title: IResolvable) {
        cdkBuilder.title(title)
    }

    public fun title(title: CfnDashboard.VisualTitleLabelOptionsProperty) {
        cdkBuilder.title(title)
    }

    public fun visualId(visualId: String) {
        cdkBuilder.visualId(visualId)
    }

    public fun build(): CfnDashboard.TableVisualProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
