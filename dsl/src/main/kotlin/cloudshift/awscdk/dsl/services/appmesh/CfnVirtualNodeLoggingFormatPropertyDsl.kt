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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVirtualNodeLoggingFormatPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.LoggingFormatProperty.Builder =
        CfnVirtualNode.LoggingFormatProperty.builder()

    private val _json: MutableList<Any> = mutableListOf()

    public fun json(vararg json: Any) {
        _json.addAll(listOf(*json))
    }

    public fun json(json: Collection<Any>) {
        _json.addAll(json)
    }

    public fun json(json: IResolvable) {
        cdkBuilder.json(json)
    }

    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun build(): CfnVirtualNode.LoggingFormatProperty {
        if (_json.isNotEmpty()) cdkBuilder.json(_json)
        return cdkBuilder.build()
    }
}
