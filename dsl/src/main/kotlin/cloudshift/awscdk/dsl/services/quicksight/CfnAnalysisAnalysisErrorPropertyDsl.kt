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
 * Analysis error.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AnalysisErrorProperty analysisErrorProperty = AnalysisErrorProperty.builder()
 * .message("message")
 * .type("type")
 * .violatedEntities(List.of(EntityProperty.builder()
 * .path("path")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-analysiserror.html)
 */
@CdkDslMarker
public class CfnAnalysisAnalysisErrorPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AnalysisErrorProperty.Builder =
        CfnAnalysis.AnalysisErrorProperty.builder()

    private val _violatedEntities: MutableList<Any> = mutableListOf()

    /** @param message The message associated with the analysis error. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    /** @param type The type of the analysis error. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param violatedEntities Lists the violated entities that caused the analysis error. */
    public fun violatedEntities(vararg violatedEntities: Any) {
        _violatedEntities.addAll(listOf(*violatedEntities))
    }

    /** @param violatedEntities Lists the violated entities that caused the analysis error. */
    public fun violatedEntities(violatedEntities: Collection<Any>) {
        _violatedEntities.addAll(violatedEntities)
    }

    /** @param violatedEntities Lists the violated entities that caused the analysis error. */
    public fun violatedEntities(violatedEntities: IResolvable) {
        cdkBuilder.violatedEntities(violatedEntities)
    }

    public fun build(): CfnAnalysis.AnalysisErrorProperty {
        if (_violatedEntities.isNotEmpty()) cdkBuilder.violatedEntities(_violatedEntities)
        return cdkBuilder.build()
    }
}
