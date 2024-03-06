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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps

/**
 * Properties for defining a `CfnUserHierarchyGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnUserHierarchyGroupProps cfnUserHierarchyGroupProps = CfnUserHierarchyGroupProps.builder()
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .parentGroupArn("parentGroupArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html)
 */
@CdkDslMarker
public class CfnUserHierarchyGroupPropsDsl {
    private val cdkBuilder: CfnUserHierarchyGroupProps.Builder =
        CfnUserHierarchyGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param instanceArn The Amazon Resource Name (ARN) of the user hierarchy group. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the user hierarchy group. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param parentGroupArn The Amazon Resource Name (ARN) of the parent group. */
    public fun parentGroupArn(parentGroupArn: String) {
        cdkBuilder.parentGroupArn(parentGroupArn)
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnUserHierarchyGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
