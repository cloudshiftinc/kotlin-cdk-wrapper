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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRuleGroup.Builder = CfnRuleGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun capacity(capacity: Number) {
        cdkBuilder.capacity(capacity)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun ruleGroup(ruleGroup: IResolvable) {
        cdkBuilder.ruleGroup(ruleGroup)
    }

    public fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty) {
        cdkBuilder.ruleGroup(ruleGroup)
    }

    public fun ruleGroupName(ruleGroupName: String) {
        cdkBuilder.ruleGroupName(ruleGroupName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnRuleGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
