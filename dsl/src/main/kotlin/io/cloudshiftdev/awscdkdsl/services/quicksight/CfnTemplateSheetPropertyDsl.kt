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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A *sheet* , which is an object that contains a set of visuals that are viewed together on one
 * page in Amazon QuickSight.
 *
 * Every analysis and dashboard contains at least one sheet. Each sheet contains at least one
 * visualization widget, for example a chart, pivot table, or narrative insight. Sheets can be
 * associated with other components, such as controls, filters, and so on.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetProperty sheetProperty = SheetProperty.builder()
 * .name("name")
 * .sheetId("sheetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-sheet.html)
 */
@CdkDslMarker
public class CfnTemplateSheetPropertyDsl {
    private val cdkBuilder: CfnTemplate.SheetProperty.Builder = CfnTemplate.SheetProperty.builder()

    /**
     * @param name The name of a sheet. This name is displayed on the sheet's tab in the Amazon
     *   QuickSight console.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param sheetId The unique identifier associated with a sheet. */
    public fun sheetId(sheetId: String) {
        cdkBuilder.sheetId(sheetId)
    }

    public fun build(): CfnTemplate.SheetProperty = cdkBuilder.build()
}
