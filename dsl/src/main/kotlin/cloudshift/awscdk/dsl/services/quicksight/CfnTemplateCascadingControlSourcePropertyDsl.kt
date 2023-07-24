@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The source controls that are used in a `CascadingControlConfiguration` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CascadingControlSourceProperty cascadingControlSourceProperty =
 * CascadingControlSourceProperty.builder()
 * .columnToMatch(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sourceSheetControlId("sourceSheetControlId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-cascadingcontrolsource.html)
 */
@CdkDslMarker
public class CfnTemplateCascadingControlSourcePropertyDsl {
    private val cdkBuilder: CfnTemplate.CascadingControlSourceProperty.Builder =
        CfnTemplate.CascadingControlSourceProperty.builder()

    /**
     * @param columnToMatch The column identifier that determines which column to look up for the
     * source sheet control.
     */
    public fun columnToMatch(columnToMatch: IResolvable) {
        cdkBuilder.columnToMatch(columnToMatch)
    }

    /**
     * @param columnToMatch The column identifier that determines which column to look up for the
     * source sheet control.
     */
    public fun columnToMatch(columnToMatch: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.columnToMatch(columnToMatch)
    }

    /**
     * @param sourceSheetControlId The source sheet control ID of a `CascadingControlSource` .
     */
    public fun sourceSheetControlId(sourceSheetControlId: String) {
        cdkBuilder.sourceSheetControlId(sourceSheetControlId)
    }

    public fun build(): CfnTemplate.CascadingControlSourceProperty = cdkBuilder.build()
}
