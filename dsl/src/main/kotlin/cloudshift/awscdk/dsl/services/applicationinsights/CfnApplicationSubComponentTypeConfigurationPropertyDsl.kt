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

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationSubComponentTypeConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.SubComponentTypeConfigurationProperty.Builder =
        CfnApplication.SubComponentTypeConfigurationProperty.builder()

    public fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails)
    }

    public fun subComponentConfigurationDetails(subComponentConfigurationDetails: CfnApplication.SubComponentConfigurationDetailsProperty) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails)
    }

    public fun subComponentType(subComponentType: String) {
        cdkBuilder.subComponentType(subComponentType)
    }

    public fun build(): CfnApplication.SubComponentTypeConfigurationProperty = cdkBuilder.build()
}
