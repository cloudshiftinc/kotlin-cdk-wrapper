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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The link configuration of a table field URL.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableFieldLinkConfigurationProperty tableFieldLinkConfigurationProperty =
 * TableFieldLinkConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-tablefieldlinkconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardTableFieldLinkConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableFieldLinkConfigurationProperty.Builder =
        CfnDashboard.TableFieldLinkConfigurationProperty.builder()

    /** @param content The URL content (text, icon) for the table link configuration. */
    public fun content(content: IResolvable) {
        cdkBuilder.content(content)
    }

    /** @param content The URL content (text, icon) for the table link configuration. */
    public fun content(content: CfnDashboard.TableFieldLinkContentConfigurationProperty) {
        cdkBuilder.content(content)
    }

    /**
     * @param target The URL target (new tab, new window, same tab) for the table link
     *   configuration.
     */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnDashboard.TableFieldLinkConfigurationProperty = cdkBuilder.build()
}
