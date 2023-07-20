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
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeader
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ResponseCustomHeadersBehaviorDsl {
    private val cdkBuilder: ResponseCustomHeadersBehavior.Builder =
        ResponseCustomHeadersBehavior.builder()

    private val _customHeaders: MutableList<ResponseCustomHeader> = mutableListOf()

    public fun customHeaders(customHeaders: ResponseCustomHeaderDsl.() -> Unit) {
        _customHeaders.add(ResponseCustomHeaderDsl().apply(customHeaders).build())
    }

    public fun customHeaders(customHeaders: Collection<ResponseCustomHeader>) {
        _customHeaders.addAll(customHeaders)
    }

    public fun build(): ResponseCustomHeadersBehavior {
        if (_customHeaders.isNotEmpty()) cdkBuilder.customHeaders(_customHeaders)
        return cdkBuilder.build()
    }
}
