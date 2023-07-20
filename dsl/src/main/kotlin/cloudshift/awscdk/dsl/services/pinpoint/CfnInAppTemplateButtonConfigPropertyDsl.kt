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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

@CdkDslMarker
public class CfnInAppTemplateButtonConfigPropertyDsl {
    private val cdkBuilder: CfnInAppTemplate.ButtonConfigProperty.Builder =
        CfnInAppTemplate.ButtonConfigProperty.builder()

    public fun android(android: IResolvable) {
        cdkBuilder.android(android)
    }

    public fun android(android: CfnInAppTemplate.OverrideButtonConfigurationProperty) {
        cdkBuilder.android(android)
    }

    public fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    public fun defaultConfig(defaultConfig: CfnInAppTemplate.DefaultButtonConfigurationProperty) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    public fun ios(ios: IResolvable) {
        cdkBuilder.ios(ios)
    }

    public fun ios(ios: CfnInAppTemplate.OverrideButtonConfigurationProperty) {
        cdkBuilder.ios(ios)
    }

    public fun web(web: IResolvable) {
        cdkBuilder.web(web)
    }

    public fun web(web: CfnInAppTemplate.OverrideButtonConfigurationProperty) {
        cdkBuilder.web(web)
    }

    public fun build(): CfnInAppTemplate.ButtonConfigProperty = cdkBuilder.build()
}
