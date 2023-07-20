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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnApiAuthPropertyDsl {
    private val cdkBuilder: CfnApi.AuthProperty.Builder = CfnApi.AuthProperty.builder()

    public fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: Boolean) {
        cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight)
    }

    public fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: IResolvable) {
        cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight)
    }

    public fun authorizers(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.authorizers(builder.map)
    }

    public fun authorizers(authorizers: Any) {
        cdkBuilder.authorizers(authorizers)
    }

    public fun defaultAuthorizer(defaultAuthorizer: String) {
        cdkBuilder.defaultAuthorizer(defaultAuthorizer)
    }

    public fun build(): CfnApi.AuthProperty = cdkBuilder.build()
}
