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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

/**
 * Specifies the behavior of buttons that appear in an in-app message template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * ButtonConfigProperty buttonConfigProperty = ButtonConfigProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html)
 */
@CdkDslMarker
public class CfnInAppTemplateButtonConfigPropertyDsl {
    private val cdkBuilder: CfnInAppTemplate.ButtonConfigProperty.Builder =
        CfnInAppTemplate.ButtonConfigProperty.builder()

    /**
     * @param android Optional button configuration to use for in-app messages sent to Android
     *   devices. This button configuration overrides the default button configuration.
     */
    public fun android(android: IResolvable) {
        cdkBuilder.android(android)
    }

    /**
     * @param android Optional button configuration to use for in-app messages sent to Android
     *   devices. This button configuration overrides the default button configuration.
     */
    public fun android(android: CfnInAppTemplate.OverrideButtonConfigurationProperty) {
        cdkBuilder.android(android)
    }

    /**
     * @param defaultConfig Specifies the default behavior of a button that appears in an in-app
     *   message. You can optionally add button configurations that specifically apply to iOS,
     *   Android, or web browser users.
     */
    public fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    /**
     * @param defaultConfig Specifies the default behavior of a button that appears in an in-app
     *   message. You can optionally add button configurations that specifically apply to iOS,
     *   Android, or web browser users.
     */
    public fun defaultConfig(defaultConfig: CfnInAppTemplate.DefaultButtonConfigurationProperty) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    /**
     * @param ios Optional button configuration to use for in-app messages sent to iOS devices. This
     *   button configuration overrides the default button configuration.
     */
    public fun ios(ios: IResolvable) {
        cdkBuilder.ios(ios)
    }

    /**
     * @param ios Optional button configuration to use for in-app messages sent to iOS devices. This
     *   button configuration overrides the default button configuration.
     */
    public fun ios(ios: CfnInAppTemplate.OverrideButtonConfigurationProperty) {
        cdkBuilder.ios(ios)
    }

    /**
     * @param web Optional button configuration to use for in-app messages sent to web applications.
     *   This button configuration overrides the default button configuration.
     */
    public fun web(web: IResolvable) {
        cdkBuilder.web(web)
    }

    /**
     * @param web Optional button configuration to use for in-app messages sent to web applications.
     *   This button configuration overrides the default button configuration.
     */
    public fun web(web: CfnInAppTemplate.OverrideButtonConfigurationProperty) {
        cdkBuilder.web(web)
    }

    public fun build(): CfnInAppTemplate.ButtonConfigProperty = cdkBuilder.build()
}
