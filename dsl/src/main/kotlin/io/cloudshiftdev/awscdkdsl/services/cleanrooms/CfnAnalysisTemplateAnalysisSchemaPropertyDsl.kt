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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate

/**
 * A relation within an analysis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * AnalysisSchemaProperty analysisSchemaProperty = AnalysisSchemaProperty.builder()
 * .referencedTables(List.of("referencedTables"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisschema.html)
 */
@CdkDslMarker
public class CfnAnalysisTemplateAnalysisSchemaPropertyDsl {
    private val cdkBuilder: CfnAnalysisTemplate.AnalysisSchemaProperty.Builder =
        CfnAnalysisTemplate.AnalysisSchemaProperty.builder()

    private val _referencedTables: MutableList<String> = mutableListOf()

    /** @param referencedTables The tables referenced in the analysis schema. */
    public fun referencedTables(vararg referencedTables: String) {
        _referencedTables.addAll(listOf(*referencedTables))
    }

    /** @param referencedTables The tables referenced in the analysis schema. */
    public fun referencedTables(referencedTables: Collection<String>) {
        _referencedTables.addAll(referencedTables)
    }

    public fun build(): CfnAnalysisTemplate.AnalysisSchemaProperty {
        if (_referencedTables.isNotEmpty()) cdkBuilder.referencedTables(_referencedTables)
        return cdkBuilder.build()
    }
}
