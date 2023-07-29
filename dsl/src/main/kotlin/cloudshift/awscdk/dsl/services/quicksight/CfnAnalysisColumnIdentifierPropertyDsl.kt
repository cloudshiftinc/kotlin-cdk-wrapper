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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A column of a data set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnIdentifierProperty columnIdentifierProperty = ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-columnidentifier.html)
 */
@CdkDslMarker
public class CfnAnalysisColumnIdentifierPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ColumnIdentifierProperty.Builder =
        CfnAnalysis.ColumnIdentifierProperty.builder()

    /** @param columnName The name of the column. */
    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    /** @param dataSetIdentifier The data set that the column belongs to. */
    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    public fun build(): CfnAnalysis.ColumnIdentifierProperty = cdkBuilder.build()
}
