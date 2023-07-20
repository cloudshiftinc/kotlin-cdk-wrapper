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
import kotlin.String

@CdkDslMarker
public class CfnVirtualNodeFileAccessLogPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.FileAccessLogProperty.Builder =
        CfnVirtualNode.FileAccessLogProperty.builder()

    public fun format(format: IResolvable) {
        cdkBuilder.format(format)
    }

    public fun format(format: CfnVirtualNode.LoggingFormatProperty) {
        cdkBuilder.format(format)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnVirtualNode.FileAccessLogProperty = cdkBuilder.build()
}
