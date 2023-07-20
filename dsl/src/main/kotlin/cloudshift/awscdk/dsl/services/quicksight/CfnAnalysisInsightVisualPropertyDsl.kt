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
public class CfnAnalysisInsightVisualPropertyDsl {
    private val cdkBuilder: CfnAnalysis.InsightVisualProperty.Builder =
        CfnAnalysis.InsightVisualProperty.builder()

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

    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    public fun insightConfiguration(insightConfiguration: IResolvable) {
        cdkBuilder.insightConfiguration(insightConfiguration)
    }

    public fun insightConfiguration(insightConfiguration: CfnAnalysis.InsightConfigurationProperty) {
        cdkBuilder.insightConfiguration(insightConfiguration)
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

    public fun build(): CfnAnalysis.InsightVisualProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
