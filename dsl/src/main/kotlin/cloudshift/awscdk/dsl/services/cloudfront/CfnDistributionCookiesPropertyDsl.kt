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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionCookiesPropertyDsl {
    private val cdkBuilder: CfnDistribution.CookiesProperty.Builder =
        CfnDistribution.CookiesProperty.builder()

    private val _whitelistedNames: MutableList<String> = mutableListOf()

    public fun forward(forward: String) {
        cdkBuilder.forward(forward)
    }

    public fun whitelistedNames(vararg whitelistedNames: String) {
        _whitelistedNames.addAll(listOf(*whitelistedNames))
    }

    public fun whitelistedNames(whitelistedNames: Collection<String>) {
        _whitelistedNames.addAll(whitelistedNames)
    }

    public fun build(): CfnDistribution.CookiesProperty {
        if (_whitelistedNames.isNotEmpty()) cdkBuilder.whitelistedNames(_whitelistedNames)
        return cdkBuilder.build()
    }
}
