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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration for default new sheet settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DefaultNewSheetConfigurationProperty defaultNewSheetConfigurationProperty =
 * DefaultNewSheetConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-defaultnewsheetconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateDefaultNewSheetConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.DefaultNewSheetConfigurationProperty.Builder =
        CfnTemplate.DefaultNewSheetConfigurationProperty.builder()

    /**
     * @param interactiveLayoutConfiguration The options that determine the default settings for
     *   interactive layout configuration.
     */
    public fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: IResolvable) {
        cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
    }

    /**
     * @param interactiveLayoutConfiguration The options that determine the default settings for
     *   interactive layout configuration.
     */
    public fun interactiveLayoutConfiguration(
        interactiveLayoutConfiguration: CfnTemplate.DefaultInteractiveLayoutConfigurationProperty
    ) {
        cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
    }

    /**
     * @param paginatedLayoutConfiguration The options that determine the default settings for a
     *   paginated layout configuration.
     */
    public fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: IResolvable) {
        cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
    }

    /**
     * @param paginatedLayoutConfiguration The options that determine the default settings for a
     *   paginated layout configuration.
     */
    public fun paginatedLayoutConfiguration(
        paginatedLayoutConfiguration: CfnTemplate.DefaultPaginatedLayoutConfigurationProperty
    ) {
        cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
    }

    /** @param sheetContentType The option that determines the sheet content type. */
    public fun sheetContentType(sheetContentType: String) {
        cdkBuilder.sheetContentType(sheetContentType)
    }

    public fun build(): CfnTemplate.DefaultNewSheetConfigurationProperty = cdkBuilder.build()
}
