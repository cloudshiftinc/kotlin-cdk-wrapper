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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnMitigationAction
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMitigationActionAddThingsToThingGroupParamsPropertyDsl {
    private val cdkBuilder: CfnMitigationAction.AddThingsToThingGroupParamsProperty.Builder =
        CfnMitigationAction.AddThingsToThingGroupParamsProperty.builder()

    private val _thingGroupNames: MutableList<String> = mutableListOf()

    public fun overrideDynamicGroups(overrideDynamicGroups: Boolean) {
        cdkBuilder.overrideDynamicGroups(overrideDynamicGroups)
    }

    public fun overrideDynamicGroups(overrideDynamicGroups: IResolvable) {
        cdkBuilder.overrideDynamicGroups(overrideDynamicGroups)
    }

    public fun thingGroupNames(vararg thingGroupNames: String) {
        _thingGroupNames.addAll(listOf(*thingGroupNames))
    }

    public fun thingGroupNames(thingGroupNames: Collection<String>) {
        _thingGroupNames.addAll(thingGroupNames)
    }

    public fun build(): CfnMitigationAction.AddThingsToThingGroupParamsProperty {
        if (_thingGroupNames.isNotEmpty()) cdkBuilder.thingGroupNames(_thingGroupNames)
        return cdkBuilder.build()
    }
}
