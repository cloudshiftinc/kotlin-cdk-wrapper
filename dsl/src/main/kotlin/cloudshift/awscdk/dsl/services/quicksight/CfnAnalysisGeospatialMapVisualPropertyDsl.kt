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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisGeospatialMapVisualPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GeospatialMapVisualProperty.Builder =
        CfnAnalysis.GeospatialMapVisualProperty.builder()

    private val _actions: MutableList<Any> = mutableListOf()

    private val _columnHierarchies: MutableList<Any> = mutableListOf()

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

    public fun chartConfiguration(chartConfiguration: CfnAnalysis.GeospatialMapConfigurationProperty) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    public fun columnHierarchies(vararg columnHierarchies: Any) {
        _columnHierarchies.addAll(listOf(*columnHierarchies))
    }

    public fun columnHierarchies(columnHierarchies: Collection<Any>) {
        _columnHierarchies.addAll(columnHierarchies)
    }

    public fun columnHierarchies(columnHierarchies: IResolvable) {
        cdkBuilder.columnHierarchies(columnHierarchies)
    }

    public fun subtitle(subtitle: IResolvable) {
        cdkBuilder.subtitle(subtitle)
    }

    public fun subtitle(subtitle: CfnAnalysis.VisualSubtitleLabelOptionsProperty) {
        cdkBuilder.subtitle(subtitle)
    }

    public fun title(title: IResolvable) {
        cdkBuilder.title(title)
    }

    public fun title(title: CfnAnalysis.VisualTitleLabelOptionsProperty) {
        cdkBuilder.title(title)
    }

    public fun visualId(visualId: String) {
        cdkBuilder.visualId(visualId)
    }

    public fun build(): CfnAnalysis.GeospatialMapVisualProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_columnHierarchies.isNotEmpty()) cdkBuilder.columnHierarchies(_columnHierarchies)
        return cdkBuilder.build()
    }
}
