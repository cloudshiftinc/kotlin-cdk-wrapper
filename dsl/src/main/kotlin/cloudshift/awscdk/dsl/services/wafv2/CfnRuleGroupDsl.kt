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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRuleGroup.Builder = CfnRuleGroup.Builder.create(scope, id)

    private val _availableLabels: MutableList<Any> = mutableListOf()

    private val _consumedLabels: MutableList<Any> = mutableListOf()

    private val _rules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun availableLabels(vararg availableLabels: Any) {
        _availableLabels.addAll(listOf(*availableLabels))
    }

    public fun availableLabels(availableLabels: Collection<Any>) {
        _availableLabels.addAll(availableLabels)
    }

    public fun availableLabels(availableLabels: IResolvable) {
        cdkBuilder.availableLabels(availableLabels)
    }

    public fun capacity(capacity: Number) {
        cdkBuilder.capacity(capacity)
    }

    public fun consumedLabels(vararg consumedLabels: Any) {
        _consumedLabels.addAll(listOf(*consumedLabels))
    }

    public fun consumedLabels(consumedLabels: Collection<Any>) {
        _consumedLabels.addAll(consumedLabels)
    }

    public fun consumedLabels(consumedLabels: IResolvable) {
        cdkBuilder.consumedLabels(consumedLabels)
    }

    public fun customResponseBodies(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.customResponseBodies(builder.map)
    }

    public fun customResponseBodies(customResponseBodies: Map<String, Any>) {
        cdkBuilder.customResponseBodies(customResponseBodies)
    }

    public fun customResponseBodies(customResponseBodies: IResolvable) {
        cdkBuilder.customResponseBodies(customResponseBodies)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    public fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    public fun build(): CfnRuleGroup {
        if (_availableLabels.isNotEmpty()) cdkBuilder.availableLabels(_availableLabels)
        if (_consumedLabels.isNotEmpty()) cdkBuilder.consumedLabels(_consumedLabels)
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
