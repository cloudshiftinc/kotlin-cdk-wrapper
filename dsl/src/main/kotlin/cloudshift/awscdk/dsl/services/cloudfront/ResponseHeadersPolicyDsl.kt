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
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior
import software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ResponseHeadersPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ResponseHeadersPolicy.Builder =
        ResponseHeadersPolicy.Builder.create(scope, id)

    private val _removeHeaders: MutableList<String> = mutableListOf()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun corsBehavior(block: ResponseHeadersCorsBehaviorDsl.() -> Unit = {}) {
        val builder = ResponseHeadersCorsBehaviorDsl()
        builder.apply(block)
        cdkBuilder.corsBehavior(builder.build())
    }

    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior) {
        cdkBuilder.corsBehavior(corsBehavior)
    }

    public fun customHeadersBehavior(block: ResponseCustomHeadersBehaviorDsl.() -> Unit = {}) {
        val builder = ResponseCustomHeadersBehaviorDsl()
        builder.apply(block)
        cdkBuilder.customHeadersBehavior(builder.build())
    }

    public fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior) {
        cdkBuilder.customHeadersBehavior(customHeadersBehavior)
    }

    public fun removeHeaders(vararg removeHeaders: String) {
        _removeHeaders.addAll(listOf(*removeHeaders))
    }

    public fun removeHeaders(removeHeaders: Collection<String>) {
        _removeHeaders.addAll(removeHeaders)
    }

    public fun responseHeadersPolicyName(responseHeadersPolicyName: String) {
        cdkBuilder.responseHeadersPolicyName(responseHeadersPolicyName)
    }

    public fun securityHeadersBehavior(block: ResponseSecurityHeadersBehaviorDsl.() -> Unit = {}) {
        val builder = ResponseSecurityHeadersBehaviorDsl()
        builder.apply(block)
        cdkBuilder.securityHeadersBehavior(builder.build())
    }

    public fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior) {
        cdkBuilder.securityHeadersBehavior(securityHeadersBehavior)
    }

    public fun serverTimingSamplingRate(serverTimingSamplingRate: Number) {
        cdkBuilder.serverTimingSamplingRate(serverTimingSamplingRate)
    }

    public fun build(): ResponseHeadersPolicy {
        if (_removeHeaders.isNotEmpty()) cdkBuilder.removeHeaders(_removeHeaders)
        return cdkBuilder.build()
    }
}
