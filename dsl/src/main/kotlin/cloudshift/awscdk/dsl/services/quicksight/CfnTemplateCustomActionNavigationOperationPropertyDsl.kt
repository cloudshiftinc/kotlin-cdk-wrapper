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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCustomActionNavigationOperationPropertyDsl {
    private val cdkBuilder: CfnTemplate.CustomActionNavigationOperationProperty.Builder =
        CfnTemplate.CustomActionNavigationOperationProperty.builder()

    public fun localNavigationConfiguration(localNavigationConfiguration: IResolvable) {
        cdkBuilder.localNavigationConfiguration(localNavigationConfiguration)
    }

    public fun localNavigationConfiguration(localNavigationConfiguration: CfnTemplate.LocalNavigationConfigurationProperty) {
        cdkBuilder.localNavigationConfiguration(localNavigationConfiguration)
    }

    public fun build(): CfnTemplate.CustomActionNavigationOperationProperty = cdkBuilder.build()
}
