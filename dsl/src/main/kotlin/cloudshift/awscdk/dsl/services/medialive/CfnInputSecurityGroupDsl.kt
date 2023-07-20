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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInputSecurityGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInputSecurityGroup.Builder =
        CfnInputSecurityGroup.Builder.create(scope, id)

    private val _whitelistRules: MutableList<Any> = mutableListOf()

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun whitelistRules(vararg whitelistRules: Any) {
        _whitelistRules.addAll(listOf(*whitelistRules))
    }

    public fun whitelistRules(whitelistRules: Collection<Any>) {
        _whitelistRules.addAll(whitelistRules)
    }

    public fun whitelistRules(whitelistRules: IResolvable) {
        cdkBuilder.whitelistRules(whitelistRules)
    }

    public fun build(): CfnInputSecurityGroup {
        if (_whitelistRules.isNotEmpty()) cdkBuilder.whitelistRules(_whitelistRules)
        return cdkBuilder.build()
    }
}
