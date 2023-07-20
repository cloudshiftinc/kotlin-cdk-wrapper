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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnListener
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnListenerForwardPropertyDsl {
    private val cdkBuilder: CfnListener.ForwardProperty.Builder =
        CfnListener.ForwardProperty.builder()

    private val _targetGroups: MutableList<Any> = mutableListOf()

    public fun targetGroups(vararg targetGroups: Any) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    public fun targetGroups(targetGroups: Collection<Any>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups)
    }

    public fun build(): CfnListener.ForwardProperty {
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
