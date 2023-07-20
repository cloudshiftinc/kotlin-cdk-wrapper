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
import software.amazon.awscdk.services.cloudfront.IOrigin
import software.amazon.awscdk.services.cloudfront.OriginFailoverConfig
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class OriginFailoverConfigDsl {
    private val cdkBuilder: OriginFailoverConfig.Builder = OriginFailoverConfig.builder()

    private val _statusCodes: MutableList<Number> = mutableListOf()

    public fun failoverOrigin(failoverOrigin: IOrigin) {
        cdkBuilder.failoverOrigin(failoverOrigin)
    }

    public fun statusCodes(vararg statusCodes: Number) {
        _statusCodes.addAll(listOf(*statusCodes))
    }

    public fun statusCodes(statusCodes: Collection<Number>) {
        _statusCodes.addAll(statusCodes)
    }

    public fun build(): OriginFailoverConfig {
        if (_statusCodes.isNotEmpty()) cdkBuilder.statusCodes(_statusCodes)
        return cdkBuilder.build()
    }
}
