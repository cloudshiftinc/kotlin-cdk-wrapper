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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule
import software.constructs.Construct
import kotlin.Number
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

    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    public fun action(action: CfnRule.ActionProperty) {
        cdkBuilder.action(action)
    }

    public fun listenerIdentifier(listenerIdentifier: String) {
        cdkBuilder.listenerIdentifier(listenerIdentifier)
    }

    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    public fun match(match: CfnRule.MatchProperty) {
        cdkBuilder.match(match)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun serviceIdentifier(serviceIdentifier: String) {
        cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRule {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
