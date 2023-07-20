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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.personalize.CfnSolution
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSolutionAutoMLConfigPropertyDsl {
    private val cdkBuilder: CfnSolution.AutoMLConfigProperty.Builder =
        CfnSolution.AutoMLConfigProperty.builder()

    private val _recipeList: MutableList<String> = mutableListOf()

    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    public fun recipeList(vararg recipeList: String) {
        _recipeList.addAll(listOf(*recipeList))
    }

    public fun recipeList(recipeList: Collection<String>) {
        _recipeList.addAll(recipeList)
    }

    public fun build(): CfnSolution.AutoMLConfigProperty {
        if (_recipeList.isNotEmpty()) cdkBuilder.recipeList(_recipeList)
        return cdkBuilder.build()
    }
}
