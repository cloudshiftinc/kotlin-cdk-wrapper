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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The settings for the pinned columns of a table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TablePinnedFieldOptionsProperty tablePinnedFieldOptionsProperty =
 * TablePinnedFieldOptionsProperty.builder()
 * .pinnedLeftFields(List.of("pinnedLeftFields"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablepinnedfieldoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisTablePinnedFieldOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TablePinnedFieldOptionsProperty.Builder =
        CfnAnalysis.TablePinnedFieldOptionsProperty.builder()

    private val _pinnedLeftFields: MutableList<String> = mutableListOf()

    /** @param pinnedLeftFields A list of columns to be pinned to the left of a table visual. */
    public fun pinnedLeftFields(vararg pinnedLeftFields: String) {
        _pinnedLeftFields.addAll(listOf(*pinnedLeftFields))
    }

    /** @param pinnedLeftFields A list of columns to be pinned to the left of a table visual. */
    public fun pinnedLeftFields(pinnedLeftFields: Collection<String>) {
        _pinnedLeftFields.addAll(pinnedLeftFields)
    }

    public fun build(): CfnAnalysis.TablePinnedFieldOptionsProperty {
        if (_pinnedLeftFields.isNotEmpty()) cdkBuilder.pinnedLeftFields(_pinnedLeftFields)
        return cdkBuilder.build()
    }
}
