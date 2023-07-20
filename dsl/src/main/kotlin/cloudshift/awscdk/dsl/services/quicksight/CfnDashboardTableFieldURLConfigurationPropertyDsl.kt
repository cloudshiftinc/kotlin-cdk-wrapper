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
public class CfnDashboardTableFieldURLConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableFieldURLConfigurationProperty.Builder =
        CfnDashboard.TableFieldURLConfigurationProperty.builder()

    public fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    public fun imageConfiguration(imageConfiguration: CfnDashboard.TableFieldImageConfigurationProperty) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    public fun linkConfiguration(linkConfiguration: IResolvable) {
        cdkBuilder.linkConfiguration(linkConfiguration)
    }

    public fun linkConfiguration(linkConfiguration: CfnDashboard.TableFieldLinkConfigurationProperty) {
        cdkBuilder.linkConfiguration(linkConfiguration)
    }

    public fun build(): CfnDashboard.TableFieldURLConfigurationProperty = cdkBuilder.build()
}
