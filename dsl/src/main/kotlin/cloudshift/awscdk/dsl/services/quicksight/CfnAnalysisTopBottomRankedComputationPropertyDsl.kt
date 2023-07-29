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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The top ranked and bottom ranked computation configuration.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-topbottomrankedcomputation.html)
 */
@CdkDslMarker
public class CfnAnalysisTopBottomRankedComputationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TopBottomRankedComputationProperty.Builder =
        CfnAnalysis.TopBottomRankedComputationProperty.builder()

    /** @param category The category field that is used in a computation. */
    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    /** @param category The category field that is used in a computation. */
    public fun category(category: CfnAnalysis.DimensionFieldProperty) {
        cdkBuilder.category(category)
    }

    /** @param computationId The ID for a computation. */
    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    /** @param name The name of a computation. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param resultSize The result size of a top and bottom ranked computation. */
    public fun resultSize(resultSize: Number) {
        cdkBuilder.resultSize(resultSize)
    }

    /**
     * @param type The computation type. Choose one of the following options:.
     * * TOP: A top ranked computation.
     * * BOTTOM: A bottom ranked computation.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The value field that is used in a computation. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The value field that is used in a computation. */
    public fun `value`(`value`: CfnAnalysis.MeasureFieldProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAnalysis.TopBottomRankedComputationProperty = cdkBuilder.build()
}
