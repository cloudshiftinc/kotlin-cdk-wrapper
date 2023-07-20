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

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fms.CfnPolicy
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPolicyIEMapPropertyDsl {
    private val cdkBuilder: CfnPolicy.IEMapProperty.Builder = CfnPolicy.IEMapProperty.builder()

    private val _account: MutableList<String> = mutableListOf()

    private val _orgunit: MutableList<String> = mutableListOf()

    public fun account(vararg account: String) {
        _account.addAll(listOf(*account))
    }

    public fun account(account: Collection<String>) {
        _account.addAll(account)
    }

    public fun orgunit(vararg orgunit: String) {
        _orgunit.addAll(listOf(*orgunit))
    }

    public fun orgunit(orgunit: Collection<String>) {
        _orgunit.addAll(orgunit)
    }

    public fun build(): CfnPolicy.IEMapProperty {
        if (_account.isNotEmpty()) cdkBuilder.account(_account)
        if (_orgunit.isNotEmpty()) cdkBuilder.orgunit(_orgunit)
        return cdkBuilder.build()
    }
}
