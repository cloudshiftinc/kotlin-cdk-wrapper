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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup

/**
 * A key group configuration.
 *
 * A key group contains a list of public keys that you can use with
 * [CloudFront signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * KeyGroupConfigProperty keyGroupConfigProperty = KeyGroupConfigProperty.builder()
 * .items(List.of("items"))
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keygroup-keygroupconfig.html)
 */
@CdkDslMarker
public class CfnKeyGroupKeyGroupConfigPropertyDsl {
    private val cdkBuilder: CfnKeyGroup.KeyGroupConfigProperty.Builder =
        CfnKeyGroup.KeyGroupConfigProperty.builder()

    private val _items: MutableList<String> = mutableListOf()

    /**
     * @param comment A comment to describe the key group. The comment cannot be longer than 128
     *   characters.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param items A list of the identifiers of the public keys in the key group. */
    public fun items(vararg items: String) {
        _items.addAll(listOf(*items))
    }

    /** @param items A list of the identifiers of the public keys in the key group. */
    public fun items(items: Collection<String>) {
        _items.addAll(items)
    }

    /** @param name A name to identify the key group. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnKeyGroup.KeyGroupConfigProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
