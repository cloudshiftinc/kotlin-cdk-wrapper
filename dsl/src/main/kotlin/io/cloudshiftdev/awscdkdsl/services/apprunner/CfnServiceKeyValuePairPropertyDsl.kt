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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes a key-value pair, which is a string-to-string mapping.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * KeyValuePairProperty keyValuePairProperty = KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-keyvaluepair.html)
 */
@CdkDslMarker
public class CfnServiceKeyValuePairPropertyDsl {
    private val cdkBuilder: CfnService.KeyValuePairProperty.Builder =
        CfnService.KeyValuePairProperty.builder()

    /** @param name The key name string to map to a value. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value string to which the key name is mapped. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnService.KeyValuePairProperty = cdkBuilder.build()
}
