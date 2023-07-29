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
 * The URL configuration for a table field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableFieldURLConfigurationProperty tableFieldURLConfigurationProperty =
 * TableFieldURLConfigurationProperty.builder()
 * .imageConfiguration(TableFieldImageConfigurationProperty.builder()
 * .sizingOptions(TableCellImageSizingConfigurationProperty.builder()
 * .tableCellImageScalingConfiguration("tableCellImageScalingConfiguration")
 * .build())
 * .build())
 * .linkConfiguration(TableFieldLinkConfigurationProperty.builder()
 * .content(TableFieldLinkContentConfigurationProperty.builder()
 * .customIconContent(TableFieldCustomIconContentProperty.builder()
 * .icon("icon")
 * .build())
 * .customTextContent(TableFieldCustomTextContentProperty.builder()
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build())
 * .target("target")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablefieldurlconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisTableFieldURLConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableFieldURLConfigurationProperty.Builder =
        CfnAnalysis.TableFieldURLConfigurationProperty.builder()

    /** @param imageConfiguration The image configuration of a table field URL. */
    public fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    /** @param imageConfiguration The image configuration of a table field URL. */
    public fun imageConfiguration(
        imageConfiguration: CfnAnalysis.TableFieldImageConfigurationProperty
    ) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    /** @param linkConfiguration The link configuration of a table field URL. */
    public fun linkConfiguration(linkConfiguration: IResolvable) {
        cdkBuilder.linkConfiguration(linkConfiguration)
    }

    /** @param linkConfiguration The link configuration of a table field URL. */
    public fun linkConfiguration(
        linkConfiguration: CfnAnalysis.TableFieldLinkConfigurationProperty
    ) {
        cdkBuilder.linkConfiguration(linkConfiguration)
    }

    public fun build(): CfnAnalysis.TableFieldURLConfigurationProperty = cdkBuilder.build()
}
