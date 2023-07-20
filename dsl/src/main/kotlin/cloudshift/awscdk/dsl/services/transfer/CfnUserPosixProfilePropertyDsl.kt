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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnUser
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserPosixProfilePropertyDsl {
    private val cdkBuilder: CfnUser.PosixProfileProperty.Builder =
        CfnUser.PosixProfileProperty.builder()

    private val _secondaryGids: MutableList<Number> = mutableListOf()

    public fun gid(gid: Number) {
        cdkBuilder.gid(gid)
    }

    public fun secondaryGids(vararg secondaryGids: Number) {
        _secondaryGids.addAll(listOf(*secondaryGids))
    }

    public fun secondaryGids(secondaryGids: Collection<Number>) {
        _secondaryGids.addAll(secondaryGids)
    }

    public fun secondaryGids(secondaryGids: IResolvable) {
        cdkBuilder.secondaryGids(secondaryGids)
    }

    public fun uid(uid: Number) {
        cdkBuilder.uid(uid)
    }

    public fun build(): CfnUser.PosixProfileProperty {
        if (_secondaryGids.isNotEmpty()) cdkBuilder.secondaryGids(_secondaryGids)
        return cdkBuilder.build()
    }
}
