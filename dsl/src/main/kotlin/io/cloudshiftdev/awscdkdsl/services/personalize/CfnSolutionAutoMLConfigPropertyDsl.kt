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

package io.cloudshiftdev.awscdkdsl.services.personalize

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.personalize.CfnSolution

/**
 * When the solution performs AutoML ( `performAutoML` is true in
 * [CreateSolution](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html) ),
 * Amazon Personalize determines which recipe, from the specified list, optimizes the given metric.
 * Amazon Personalize then uses that recipe for the solution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * AutoMLConfigProperty autoMLConfigProperty = AutoMLConfigProperty.builder()
 * .metricName("metricName")
 * .recipeList(List.of("recipeList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-automlconfig.html)
 */
@CdkDslMarker
public class CfnSolutionAutoMLConfigPropertyDsl {
    private val cdkBuilder: CfnSolution.AutoMLConfigProperty.Builder =
        CfnSolution.AutoMLConfigProperty.builder()

    private val _recipeList: MutableList<String> = mutableListOf()

    /** @param metricName The metric to optimize. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param recipeList The list of candidate recipes. */
    public fun recipeList(vararg recipeList: String) {
        _recipeList.addAll(listOf(*recipeList))
    }

    /** @param recipeList The list of candidate recipes. */
    public fun recipeList(recipeList: Collection<String>) {
        _recipeList.addAll(recipeList)
    }

    public fun build(): CfnSolution.AutoMLConfigProperty {
        if (_recipeList.isNotEmpty()) cdkBuilder.recipeList(_recipeList)
        return cdkBuilder.build()
    }
}
