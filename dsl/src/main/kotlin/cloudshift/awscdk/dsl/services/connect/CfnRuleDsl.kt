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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRule.Builder = CfnRule.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    public fun actions(actions: CfnRule.ActionsProperty) {
        cdkBuilder.actions(actions)
    }

    public fun function(function: String) {
        cdkBuilder.function(function)
    }

    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun publishStatus(publishStatus: String) {
        cdkBuilder.publishStatus(publishStatus)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun triggerEventSource(triggerEventSource: IResolvable) {
        cdkBuilder.triggerEventSource(triggerEventSource)
    }

    public fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty) {
        cdkBuilder.triggerEventSource(triggerEventSource)
    }

    public fun build(): CfnRule {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
