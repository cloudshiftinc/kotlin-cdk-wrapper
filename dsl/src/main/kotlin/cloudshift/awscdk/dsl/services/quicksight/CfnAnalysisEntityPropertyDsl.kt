@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * An object, structure, or sub-structure of an analysis, template, or dashboard.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * EntityProperty entityProperty = EntityProperty.builder()
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-entity.html)
 */
@CdkDslMarker
public class CfnAnalysisEntityPropertyDsl {
    private val cdkBuilder: CfnAnalysis.EntityProperty.Builder = CfnAnalysis.EntityProperty.builder()

    /**
     * @param path The hierarchical path of the entity within the analysis, template, or dashboard
     * definition tree.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnAnalysis.EntityProperty = cdkBuilder.build()
}
