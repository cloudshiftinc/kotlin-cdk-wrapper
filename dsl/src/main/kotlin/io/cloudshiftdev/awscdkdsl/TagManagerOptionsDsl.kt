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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.TagManagerOptions

/**
 * Options to configure TagManager behavior.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * TagManagerOptions tagManagerOptions = TagManagerOptions.builder()
 * .tagPropertyName("tagPropertyName")
 * .build();
 * ```
 */
@CdkDslMarker
public class TagManagerOptionsDsl {
    private val cdkBuilder: TagManagerOptions.Builder = TagManagerOptions.builder()

    /**
     * @param tagPropertyName The name of the property in CloudFormation for these tags. Normally
     *   this is `tags`, but Cognito UserPool uses UserPoolTags
     */
    public fun tagPropertyName(tagPropertyName: String) {
        cdkBuilder.tagPropertyName(tagPropertyName)
    }

    public fun build(): TagManagerOptions = cdkBuilder.build()
}
