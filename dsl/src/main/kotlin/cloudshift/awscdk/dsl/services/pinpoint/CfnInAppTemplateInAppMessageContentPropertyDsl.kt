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
import kotlin.String

@CdkDslMarker
public class CfnInAppTemplateInAppMessageContentPropertyDsl {
    private val cdkBuilder: CfnInAppTemplate.InAppMessageContentProperty.Builder =
        CfnInAppTemplate.InAppMessageContentProperty.builder()

    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun bodyConfig(bodyConfig: IResolvable) {
        cdkBuilder.bodyConfig(bodyConfig)
    }

    public fun bodyConfig(bodyConfig: CfnInAppTemplate.BodyConfigProperty) {
        cdkBuilder.bodyConfig(bodyConfig)
    }

    public fun headerConfig(headerConfig: IResolvable) {
        cdkBuilder.headerConfig(headerConfig)
    }

    public fun headerConfig(headerConfig: CfnInAppTemplate.HeaderConfigProperty) {
        cdkBuilder.headerConfig(headerConfig)
    }

    public fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
    }

    public fun primaryBtn(primaryBtn: IResolvable) {
        cdkBuilder.primaryBtn(primaryBtn)
    }

    public fun primaryBtn(primaryBtn: CfnInAppTemplate.ButtonConfigProperty) {
        cdkBuilder.primaryBtn(primaryBtn)
    }

    public fun secondaryBtn(secondaryBtn: IResolvable) {
        cdkBuilder.secondaryBtn(secondaryBtn)
    }

    public fun secondaryBtn(secondaryBtn: CfnInAppTemplate.ButtonConfigProperty) {
        cdkBuilder.secondaryBtn(secondaryBtn)
    }

    public fun build(): CfnInAppTemplate.InAppMessageContentProperty = cdkBuilder.build()
}
