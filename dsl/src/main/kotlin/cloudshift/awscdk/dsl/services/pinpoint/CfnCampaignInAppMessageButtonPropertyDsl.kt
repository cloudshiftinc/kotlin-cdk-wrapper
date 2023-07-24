@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the configuration of a button that appears in an in-app message.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * InAppMessageButtonProperty inAppMessageButtonProperty = InAppMessageButtonProperty.builder()
 * .android(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .defaultConfig(DefaultButtonConfigurationProperty.builder()
 * .backgroundColor("backgroundColor")
 * .borderRadius(123)
 * .buttonAction("buttonAction")
 * .link("link")
 * .text("text")
 * .textColor("textColor")
 * .build())
 * .ios(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .web(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html)
 */
@CdkDslMarker
public class CfnCampaignInAppMessageButtonPropertyDsl {
    private val cdkBuilder: CfnCampaign.InAppMessageButtonProperty.Builder =
        CfnCampaign.InAppMessageButtonProperty.builder()

    /**
     * @param android An object that defines the default behavior for a button in in-app messages sent
     * to Android.
     */
    public fun android(android: IResolvable) {
        cdkBuilder.android(android)
    }

    /**
     * @param android An object that defines the default behavior for a button in in-app messages sent
     * to Android.
     */
    public fun android(android: CfnCampaign.OverrideButtonConfigurationProperty) {
        cdkBuilder.android(android)
    }

    /**
     * @param defaultConfig An object that defines the default behavior for a button in an in-app
     * message.
     */
    public fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    /**
     * @param defaultConfig An object that defines the default behavior for a button in an in-app
     * message.
     */
    public fun defaultConfig(defaultConfig: CfnCampaign.DefaultButtonConfigurationProperty) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    /**
     * @param ios An object that defines the default behavior for a button in in-app messages sent to
     * iOS devices.
     */
    public fun ios(ios: IResolvable) {
        cdkBuilder.ios(ios)
    }

    /**
     * @param ios An object that defines the default behavior for a button in in-app messages sent to
     * iOS devices.
     */
    public fun ios(ios: CfnCampaign.OverrideButtonConfigurationProperty) {
        cdkBuilder.ios(ios)
    }

    /**
     * @param web An object that defines the default behavior for a button in in-app messages for web
     * applications.
     */
    public fun web(web: IResolvable) {
        cdkBuilder.web(web)
    }

    /**
     * @param web An object that defines the default behavior for a button in in-app messages for web
     * applications.
     */
    public fun web(web: CfnCampaign.OverrideButtonConfigurationProperty) {
        cdkBuilder.web(web)
    }

    public fun build(): CfnCampaign.InAppMessageButtonProperty = cdkBuilder.build()
}
