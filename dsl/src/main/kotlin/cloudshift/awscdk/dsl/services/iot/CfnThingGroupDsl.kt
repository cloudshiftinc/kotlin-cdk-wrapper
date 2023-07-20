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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThingGroup
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnThingGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnThingGroup.Builder = CfnThingGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun parentGroupName(parentGroupName: String) {
        cdkBuilder.parentGroupName(parentGroupName)
    }

    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun thingGroupName(thingGroupName: String) {
        cdkBuilder.thingGroupName(thingGroupName)
    }

    public fun thingGroupProperties(thingGroupProperties: IResolvable) {
        cdkBuilder.thingGroupProperties(thingGroupProperties)
    }

    public fun thingGroupProperties(thingGroupProperties: CfnThingGroup.ThingGroupPropertiesProperty) {
        cdkBuilder.thingGroupProperties(thingGroupProperties)
    }

    public fun build(): CfnThingGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
