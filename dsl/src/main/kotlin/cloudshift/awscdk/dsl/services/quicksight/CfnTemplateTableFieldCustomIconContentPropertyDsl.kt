@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The custom icon content for the table link content configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableFieldCustomIconContentProperty tableFieldCustomIconContentProperty =
 * TableFieldCustomIconContentProperty.builder()
 * .icon("icon")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tablefieldcustomiconcontent.html)
 */
@CdkDslMarker
public class CfnTemplateTableFieldCustomIconContentPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableFieldCustomIconContentProperty.Builder =
        CfnTemplate.TableFieldCustomIconContentProperty.builder()

    /**
     * @param icon The icon set type (link) of the custom icon content for table URL link content.
     */
    public fun icon(icon: String) {
        cdkBuilder.icon(icon)
    }

    public fun build(): CfnTemplate.TableFieldCustomIconContentProperty = cdkBuilder.build()
}
