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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLRuleActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.RuleActionProperty.Builder =
        CfnWebACL.RuleActionProperty.builder()

    public fun allow(allow: IResolvable) {
        cdkBuilder.allow(allow)
    }

    public fun allow(allow: CfnWebACL.AllowActionProperty) {
        cdkBuilder.allow(allow)
    }

    public fun block(block: IResolvable) {
        cdkBuilder.block(block)
    }

    public fun block(block: CfnWebACL.BlockActionProperty) {
        cdkBuilder.block(block)
    }

    public fun captcha(captcha: IResolvable) {
        cdkBuilder.captcha(captcha)
    }

    public fun captcha(captcha: CfnWebACL.CaptchaActionProperty) {
        cdkBuilder.captcha(captcha)
    }

    public fun challenge(challenge: IResolvable) {
        cdkBuilder.challenge(challenge)
    }

    public fun challenge(challenge: CfnWebACL.ChallengeActionProperty) {
        cdkBuilder.challenge(challenge)
    }

    public fun count(count: IResolvable) {
        cdkBuilder.count(count)
    }

    public fun count(count: CfnWebACL.CountActionProperty) {
        cdkBuilder.count(count)
    }

    public fun build(): CfnWebACL.RuleActionProperty = cdkBuilder.build()
}
