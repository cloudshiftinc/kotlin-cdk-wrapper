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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.Tag

/**
 * Metadata Entry spec for stack tag.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * Tag tag = Tag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
@CdkDslMarker
public class TagDsl {
    private val cdkBuilder: Tag.Builder = Tag.builder()

    /**
     * @param key Tag key. (In the actual file on disk this will be cased as "Key", and the
     *   structure is patched to match this structure upon loading:
     *   https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param value Tag value. (In the actual file on disk this will be cased as "Value", and the
     *   structure is patched to match this structure upon loading:
     *   https://github.com/aws/aws-cdk/blob/4aadaa779b48f35838cccd4e25107b2338f05547/packages/%40aws-cdk/cloud-assembly-schema/lib/manifest.ts#L137)
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): Tag = cdkBuilder.build()
}
