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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A grid layout to define the placement of sheet control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetControlLayoutProperty sheetControlLayoutProperty = SheetControlLayoutProperty.builder()
 * .configuration(SheetControlLayoutConfigurationProperty.builder()
 * .gridLayout(GridLayoutConfigurationProperty.builder()
 * .elements(List.of(GridLayoutElementProperty.builder()
 * .columnSpan(123)
 * .elementId("elementId")
 * .elementType("elementType")
 * .rowSpan(123)
 * // the properties below are optional
 * .columnIndex(123)
 * .rowIndex(123)
 * .build()))
 * // the properties below are optional
 * .canvasSizeOptions(GridLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sheetcontrollayout.html)
 */
@CdkDslMarker
public class CfnAnalysisSheetControlLayoutPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SheetControlLayoutProperty.Builder =
        CfnAnalysis.SheetControlLayoutProperty.builder()

    /**
     * @param configuration The configuration that determines the elements and canvas size options
     *   of sheet control.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param configuration The configuration that determines the elements and canvas size options
     *   of sheet control.
     */
    public fun configuration(configuration: CfnAnalysis.SheetControlLayoutConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    public fun build(): CfnAnalysis.SheetControlLayoutProperty = cdkBuilder.build()
}
