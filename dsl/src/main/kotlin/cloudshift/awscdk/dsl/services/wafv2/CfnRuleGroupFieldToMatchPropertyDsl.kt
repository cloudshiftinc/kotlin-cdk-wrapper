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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnRuleGroupFieldToMatchPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.FieldToMatchProperty.Builder =
        CfnRuleGroup.FieldToMatchProperty.builder()

    public fun allQueryArguments(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.allQueryArguments(builder.map)
    }

    public fun allQueryArguments(allQueryArguments: Any) {
        cdkBuilder.allQueryArguments(allQueryArguments)
    }

    public fun body(body: IResolvable) {
        cdkBuilder.body(body)
    }

    public fun body(body: CfnRuleGroup.BodyProperty) {
        cdkBuilder.body(body)
    }

    public fun cookies(cookies: IResolvable) {
        cdkBuilder.cookies(cookies)
    }

    public fun cookies(cookies: CfnRuleGroup.CookiesProperty) {
        cdkBuilder.cookies(cookies)
    }

    public fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers)
    }

    public fun headers(headers: CfnRuleGroup.HeadersProperty) {
        cdkBuilder.headers(headers)
    }

    public fun jsonBody(jsonBody: IResolvable) {
        cdkBuilder.jsonBody(jsonBody)
    }

    public fun jsonBody(jsonBody: CfnRuleGroup.JsonBodyProperty) {
        cdkBuilder.jsonBody(jsonBody)
    }

    public fun method(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.method(builder.map)
    }

    public fun method(method: Any) {
        cdkBuilder.method(method)
    }

    public fun queryString(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.queryString(builder.map)
    }

    public fun queryString(queryString: Any) {
        cdkBuilder.queryString(queryString)
    }

    public fun singleHeader(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.singleHeader(builder.map)
    }

    public fun singleHeader(singleHeader: Any) {
        cdkBuilder.singleHeader(singleHeader)
    }

    public fun singleQueryArgument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.singleQueryArgument(builder.map)
    }

    public fun singleQueryArgument(singleQueryArgument: Any) {
        cdkBuilder.singleQueryArgument(singleQueryArgument)
    }

    public fun uriPath(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.uriPath(builder.map)
    }

    public fun uriPath(uriPath: Any) {
        cdkBuilder.uriPath(uriPath)
    }

    public fun build(): CfnRuleGroup.FieldToMatchProperty = cdkBuilder.build()
}
