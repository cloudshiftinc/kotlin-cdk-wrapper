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
 * The custom text content (value, font configuration) for the table link content configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableFieldCustomTextContentProperty tableFieldCustomTextContentProperty =
 * TableFieldCustomTextContentProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-tablefieldcustomtextcontent.html)
 */
@CdkDslMarker
public class CfnDashboardTableFieldCustomTextContentPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableFieldCustomTextContentProperty.Builder =
        CfnDashboard.TableFieldCustomTextContentProperty.builder()

    /**
     * @param fontConfiguration The font configuration of the custom text content for the table URL
     *   link content.
     */
    public fun fontConfiguration(fontConfiguration: IResolvable) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /**
     * @param fontConfiguration The font configuration of the custom text content for the table URL
     *   link content.
     */
    public fun fontConfiguration(fontConfiguration: CfnDashboard.FontConfigurationProperty) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /** @param value The string value of the custom text content for the table URL link content. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDashboard.TableFieldCustomTextContentProperty = cdkBuilder.build()
}
