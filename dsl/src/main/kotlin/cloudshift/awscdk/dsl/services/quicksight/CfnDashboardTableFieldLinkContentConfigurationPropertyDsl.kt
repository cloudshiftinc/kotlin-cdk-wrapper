@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldLinkContentConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableFieldLinkContentConfigurationProperty.Builder =
        CfnDashboard.TableFieldLinkContentConfigurationProperty.builder()

    public fun customIconContent(customIconContent: IResolvable) {
        cdkBuilder.customIconContent(customIconContent)
    }

    public fun customIconContent(customIconContent: CfnDashboard.TableFieldCustomIconContentProperty) {
        cdkBuilder.customIconContent(customIconContent)
    }

    public fun customTextContent(customTextContent: IResolvable) {
        cdkBuilder.customTextContent(customTextContent)
    }

    public fun customTextContent(customTextContent: CfnDashboard.TableFieldCustomTextContentProperty) {
        cdkBuilder.customTextContent(customTextContent)
    }

    public fun build(): CfnDashboard.TableFieldLinkContentConfigurationProperty = cdkBuilder.build()
}
