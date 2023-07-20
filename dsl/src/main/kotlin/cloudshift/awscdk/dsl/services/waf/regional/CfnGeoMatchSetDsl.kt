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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGeoMatchSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGeoMatchSet.Builder = CfnGeoMatchSet.Builder.create(scope, id)

    private val _geoMatchConstraints: MutableList<Any> = mutableListOf()

    public fun geoMatchConstraints(vararg geoMatchConstraints: Any) {
        _geoMatchConstraints.addAll(listOf(*geoMatchConstraints))
    }

    public fun geoMatchConstraints(geoMatchConstraints: Collection<Any>) {
        _geoMatchConstraints.addAll(geoMatchConstraints)
    }

    public fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
        cdkBuilder.geoMatchConstraints(geoMatchConstraints)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnGeoMatchSet {
        if (_geoMatchConstraints.isNotEmpty()) cdkBuilder.geoMatchConstraints(_geoMatchConstraints)
        return cdkBuilder.build()
    }
}
