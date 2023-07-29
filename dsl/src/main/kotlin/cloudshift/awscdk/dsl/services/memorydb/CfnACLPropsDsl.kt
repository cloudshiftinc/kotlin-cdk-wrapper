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

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.memorydb.CfnACLProps

/**
 * Properties for defining a `CfnACL`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.memorydb.*;
 * CfnACLProps cfnACLProps = CfnACLProps.builder()
 * .aclName("aclName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userNames(List.of("userNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html)
 */
@CdkDslMarker
public class CfnACLPropsDsl {
    private val cdkBuilder: CfnACLProps.Builder = CfnACLProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userNames: MutableList<String> = mutableListOf()

    /** @param aclName The name of the Access Control List. */
    public fun aclName(aclName: String) {
        cdkBuilder.aclName(aclName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param userNames The list of users that belong to the Access Control List. */
    public fun userNames(vararg userNames: String) {
        _userNames.addAll(listOf(*userNames))
    }

    /** @param userNames The list of users that belong to the Access Control List. */
    public fun userNames(userNames: Collection<String>) {
        _userNames.addAll(userNames)
    }

    public fun build(): CfnACLProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userNames.isNotEmpty()) cdkBuilder.userNames(_userNames)
        return cdkBuilder.build()
    }
}
