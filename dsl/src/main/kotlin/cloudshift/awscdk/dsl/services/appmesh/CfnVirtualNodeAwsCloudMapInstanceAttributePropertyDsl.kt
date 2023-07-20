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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import kotlin.String

@CdkDslMarker
public class CfnVirtualNodeAwsCloudMapInstanceAttributePropertyDsl {
    private val cdkBuilder: CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.Builder =
        CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnVirtualNode.AwsCloudMapInstanceAttributeProperty = cdkBuilder.build()
}
