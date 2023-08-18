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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration for default analysis settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AnalysisDefaultsProperty analysisDefaultsProperty = AnalysisDefaultsProperty.builder()
 * .defaultNewSheetConfiguration(DefaultNewSheetConfigurationProperty.builder()
 * .interactiveLayoutConfiguration(DefaultInteractiveLayoutConfigurationProperty.builder()
 * .freeForm(DefaultFreeFormLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(FreeFormLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build())
 * .grid(DefaultGridLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(GridLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build())
 * .build())
 * .paginatedLayoutConfiguration(DefaultPaginatedLayoutConfigurationProperty.builder()
 * .sectionBased(DefaultSectionBasedLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(SectionBasedLayoutCanvasSizeOptionsProperty.builder()
 * .paperCanvasSizeOptions(SectionBasedLayoutPaperCanvasSizeOptionsProperty.builder()
 * .paperMargin(SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build())
 * .paperOrientation("paperOrientation")
 * .paperSize("paperSize")
 * .build())
 * .build())
 * .build())
 * .build())
 * .sheetContentType("sheetContentType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-analysisdefaults.html)
 */
@CdkDslMarker
public class CfnTemplateAnalysisDefaultsPropertyDsl {
    private val cdkBuilder: CfnTemplate.AnalysisDefaultsProperty.Builder =
        CfnTemplate.AnalysisDefaultsProperty.builder()

    /** @param defaultNewSheetConfiguration The configuration for default new sheet settings. */
    public fun defaultNewSheetConfiguration(defaultNewSheetConfiguration: IResolvable) {
        cdkBuilder.defaultNewSheetConfiguration(defaultNewSheetConfiguration)
    }

    /** @param defaultNewSheetConfiguration The configuration for default new sheet settings. */
    public fun defaultNewSheetConfiguration(
        defaultNewSheetConfiguration: CfnTemplate.DefaultNewSheetConfigurationProperty
    ) {
        cdkBuilder.defaultNewSheetConfiguration(defaultNewSheetConfiguration)
    }

    public fun build(): CfnTemplate.AnalysisDefaultsProperty = cdkBuilder.build()
}
