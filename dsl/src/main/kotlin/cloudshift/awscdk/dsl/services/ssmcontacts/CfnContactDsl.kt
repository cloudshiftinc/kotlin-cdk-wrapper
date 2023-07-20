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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContactDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnContact.Builder = CfnContact.Builder.create(scope, id)

    private val _plan: MutableList<Any> = mutableListOf()

    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun plan(vararg plan: Any) {
        _plan.addAll(listOf(*plan))
    }

    public fun plan(plan: Collection<Any>) {
        _plan.addAll(plan)
    }

    public fun plan(plan: IResolvable) {
        cdkBuilder.plan(plan)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnContact {
        if (_plan.isNotEmpty()) cdkBuilder.plan(_plan)
        return cdkBuilder.build()
    }
}
