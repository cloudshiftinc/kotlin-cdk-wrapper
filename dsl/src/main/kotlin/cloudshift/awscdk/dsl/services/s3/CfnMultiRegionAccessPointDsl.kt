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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMultiRegionAccessPointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMultiRegionAccessPoint.Builder =
        CfnMultiRegionAccessPoint.Builder.create(scope, id)

    private val _regions: MutableList<Any> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    public fun regions(vararg regions: Any) {
        _regions.addAll(listOf(*regions))
    }

    public fun regions(regions: Collection<Any>) {
        _regions.addAll(regions)
    }

    public fun regions(regions: IResolvable) {
        cdkBuilder.regions(regions)
    }

    public fun build(): CfnMultiRegionAccessPoint {
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        return cdkBuilder.build()
    }
}
