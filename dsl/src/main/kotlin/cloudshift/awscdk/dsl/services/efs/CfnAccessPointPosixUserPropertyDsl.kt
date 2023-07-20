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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.efs.CfnAccessPoint
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAccessPointPosixUserPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.PosixUserProperty.Builder =
        CfnAccessPoint.PosixUserProperty.builder()

    private val _secondaryGids: MutableList<String> = mutableListOf()

    public fun gid(gid: String) {
        cdkBuilder.gid(gid)
    }

    public fun secondaryGids(vararg secondaryGids: String) {
        _secondaryGids.addAll(listOf(*secondaryGids))
    }

    public fun secondaryGids(secondaryGids: Collection<String>) {
        _secondaryGids.addAll(secondaryGids)
    }

    public fun uid(uid: String) {
        cdkBuilder.uid(uid)
    }

    public fun build(): CfnAccessPoint.PosixUserProperty {
        if (_secondaryGids.isNotEmpty()) cdkBuilder.secondaryGids(_secondaryGids)
        return cdkBuilder.build()
    }
}
