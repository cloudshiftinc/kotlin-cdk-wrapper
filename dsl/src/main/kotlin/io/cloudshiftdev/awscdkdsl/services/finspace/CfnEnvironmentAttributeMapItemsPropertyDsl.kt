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

package io.cloudshiftdev.awscdkdsl.services.finspace

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.finspace.CfnEnvironment

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.finspace.*;
 * AttributeMapItemsProperty attributeMapItemsProperty = AttributeMapItemsProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-attributemapitems.html)
 */
@CdkDslMarker
public class CfnEnvironmentAttributeMapItemsPropertyDsl {
    private val cdkBuilder: CfnEnvironment.AttributeMapItemsProperty.Builder =
        CfnEnvironment.AttributeMapItemsProperty.builder()

    /**
     * @param key The key name of the tag. You can specify a value that is 1 to 128 Unicode
     *   characters in length and cannot be prefixed with aws:. You can use any of the following
     *   characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param value The value for the tag. You can specify a value that is 0 to 256 Unicode
     *   characters in length and cannot be prefixed with aws:. You can use any of the following
     *   characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnEnvironment.AttributeMapItemsProperty = cdkBuilder.build()
}
