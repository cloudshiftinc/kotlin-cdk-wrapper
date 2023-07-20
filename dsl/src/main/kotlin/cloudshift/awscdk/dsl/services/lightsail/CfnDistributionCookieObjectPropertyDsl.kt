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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lightsail.CfnDistribution
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionCookieObjectPropertyDsl {
    private val cdkBuilder: CfnDistribution.CookieObjectProperty.Builder =
        CfnDistribution.CookieObjectProperty.builder()

    private val _cookiesAllowList: MutableList<String> = mutableListOf()

    public fun cookiesAllowList(vararg cookiesAllowList: String) {
        _cookiesAllowList.addAll(listOf(*cookiesAllowList))
    }

    public fun cookiesAllowList(cookiesAllowList: Collection<String>) {
        _cookiesAllowList.addAll(cookiesAllowList)
    }

    public fun option(option: String) {
        cdkBuilder.option(option)
    }

    public fun build(): CfnDistribution.CookieObjectProperty {
        if (_cookiesAllowList.isNotEmpty()) cdkBuilder.cookiesAllowList(_cookiesAllowList)
        return cdkBuilder.build()
    }
}
