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
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnLoggingConfigurationFieldToMatchPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.FieldToMatchProperty.Builder =
        CfnLoggingConfiguration.FieldToMatchProperty.builder()

    public fun jsonBody(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.jsonBody(builder.map)
    }

    public fun jsonBody(jsonBody: Any) {
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

    public fun uriPath(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.uriPath(builder.map)
    }

    public fun uriPath(uriPath: Any) {
        cdkBuilder.uriPath(uriPath)
    }

    public fun build(): CfnLoggingConfiguration.FieldToMatchProperty = cdkBuilder.build()
}
