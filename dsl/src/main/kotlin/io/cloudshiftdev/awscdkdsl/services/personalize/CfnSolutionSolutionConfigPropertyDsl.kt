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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution

/**
 * Describes the configuration properties for the solution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * Object autoMlConfig;
 * Object hpoConfig;
 * SolutionConfigProperty solutionConfigProperty = SolutionConfigProperty.builder()
 * .algorithmHyperParameters(Map.of(
 * "algorithmHyperParametersKey", "algorithmHyperParameters"))
 * .autoMlConfig(autoMlConfig)
 * .eventValueThreshold("eventValueThreshold")
 * .featureTransformationParameters(Map.of(
 * "featureTransformationParametersKey", "featureTransformationParameters"))
 * .hpoConfig(hpoConfig)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html)
 */
@CdkDslMarker
public class CfnSolutionSolutionConfigPropertyDsl {
    private val cdkBuilder: CfnSolution.SolutionConfigProperty.Builder =
        CfnSolution.SolutionConfigProperty.builder()

    /** @param algorithmHyperParameters Lists the hyperparameter names and ranges. */
    public fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>) {
        cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
    }

    /** @param algorithmHyperParameters Lists the hyperparameter names and ranges. */
    public fun algorithmHyperParameters(algorithmHyperParameters: IResolvable) {
        cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
    }

    /**
     * @param autoMlConfig The
     *   [AutoMLConfig](https://docs.aws.amazon.com/personalize/latest/dg/API_AutoMLConfig.html)
     *   object containing a list of recipes to search when AutoML is performed.
     */
    public fun autoMlConfig(autoMlConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(autoMlConfig)
        cdkBuilder.autoMlConfig(builder.map)
    }

    /**
     * @param autoMlConfig The
     *   [AutoMLConfig](https://docs.aws.amazon.com/personalize/latest/dg/API_AutoMLConfig.html)
     *   object containing a list of recipes to search when AutoML is performed.
     */
    public fun autoMlConfig(autoMlConfig: Any) {
        cdkBuilder.autoMlConfig(autoMlConfig)
    }

    /**
     * @param eventValueThreshold Only events with a value greater than or equal to this threshold
     *   are used for training a model.
     */
    public fun eventValueThreshold(eventValueThreshold: String) {
        cdkBuilder.eventValueThreshold(eventValueThreshold)
    }

    /** @param featureTransformationParameters Lists the feature transformation parameters. */
    public fun featureTransformationParameters(
        featureTransformationParameters: Map<String, String>
    ) {
        cdkBuilder.featureTransformationParameters(featureTransformationParameters)
    }

    /** @param featureTransformationParameters Lists the feature transformation parameters. */
    public fun featureTransformationParameters(featureTransformationParameters: IResolvable) {
        cdkBuilder.featureTransformationParameters(featureTransformationParameters)
    }

    /** @param hpoConfig Describes the properties for hyperparameter optimization (HPO). */
    public fun hpoConfig(hpoConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(hpoConfig)
        cdkBuilder.hpoConfig(builder.map)
    }

    /** @param hpoConfig Describes the properties for hyperparameter optimization (HPO). */
    public fun hpoConfig(hpoConfig: Any) {
        cdkBuilder.hpoConfig(hpoConfig)
    }

    public fun build(): CfnSolution.SolutionConfigProperty = cdkBuilder.build()
}
