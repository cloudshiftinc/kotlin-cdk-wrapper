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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The URL content (text, icon) for the table link configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableFieldLinkContentConfigurationProperty tableFieldLinkContentConfigurationProperty =
 * TableFieldLinkContentConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-tablefieldlinkcontentconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardTableFieldLinkContentConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableFieldLinkContentConfigurationProperty.Builder =
        CfnDashboard.TableFieldLinkContentConfigurationProperty.builder()

    /**
     * @param customIconContent The custom icon content for the table link content configuration.
     */
    public fun customIconContent(customIconContent: IResolvable) {
        cdkBuilder.customIconContent(customIconContent)
    }

    /**
     * @param customIconContent The custom icon content for the table link content configuration.
     */
    public fun customIconContent(
        customIconContent: CfnDashboard.TableFieldCustomIconContentProperty
    ) {
        cdkBuilder.customIconContent(customIconContent)
    }

    /**
     * @param customTextContent The custom text content (value, font configuration) for the table
     *   link content configuration.
     */
    public fun customTextContent(customTextContent: IResolvable) {
        cdkBuilder.customTextContent(customTextContent)
    }

    /**
     * @param customTextContent The custom text content (value, font configuration) for the table
     *   link content configuration.
     */
    public fun customTextContent(
        customTextContent: CfnDashboard.TableFieldCustomTextContentProperty
    ) {
        cdkBuilder.customTextContent(customTextContent)
    }

    public fun build(): CfnDashboard.TableFieldLinkContentConfigurationProperty = cdkBuilder.build()
}
