@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents the key value pairs for the JSON.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * JsonFormatRefProperty jsonFormatRefProperty = JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-jsonformatref.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayJsonFormatRefPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.JsonFormatRefProperty.Builder =
        CfnVirtualGateway.JsonFormatRefProperty.builder()

    /** @param key The specified key for the JSON. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The specified value for the JSON. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnVirtualGateway.JsonFormatRefProperty = cdkBuilder.build()
}
