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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnRuleGroupRuleActionPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RuleActionProperty.Builder =
        CfnRuleGroup.RuleActionProperty.builder()

    public fun allow(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.allow(builder.map)
    }

    public fun allow(allow: Any) {
        cdkBuilder.allow(allow)
    }

    public fun block(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.block(builder.map)
    }

    public fun block(block: Any) {
        cdkBuilder.block(block)
    }

    public fun captcha(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.captcha(builder.map)
    }

    public fun captcha(captcha: Any) {
        cdkBuilder.captcha(captcha)
    }

    public fun challenge(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.challenge(builder.map)
    }

    public fun challenge(challenge: Any) {
        cdkBuilder.challenge(challenge)
    }

    public fun count(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.count(builder.map)
    }

    public fun count(count: Any) {
        cdkBuilder.count(count)
    }

    public fun build(): CfnRuleGroup.RuleActionProperty = cdkBuilder.build()
}
