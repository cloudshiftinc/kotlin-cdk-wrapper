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

package io.cloudshiftdev.awscdkdsl.services.fms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.fms.CfnResourceSetProps

/**
 * Properties for defining a `CfnResourceSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fms.*;
 * CfnResourceSetProps cfnResourceSetProps = CfnResourceSetProps.builder()
 * .name("name")
 * .resourceTypeList(List.of("resourceTypeList"))
 * // the properties below are optional
 * .description("description")
 * .resources(List.of("resources"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html)
 */
@CdkDslMarker
public class CfnResourceSetPropsDsl {
    private val cdkBuilder: CfnResourceSetProps.Builder = CfnResourceSetProps.builder()

    private val _resourceTypeList: MutableList<String> = mutableListOf()

    private val _resources: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the resource set. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The descriptive name of the resource set. You can't change the name of a resource
     *   set after you create it.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param resourceTypeList Determines the resources that can be associated to the resource set.
     *   Depending on your setting for max results and the number of resource sets, a single call
     *   might not return the full list.
     */
    public fun resourceTypeList(vararg resourceTypeList: String) {
        _resourceTypeList.addAll(listOf(*resourceTypeList))
    }

    /**
     * @param resourceTypeList Determines the resources that can be associated to the resource set.
     *   Depending on your setting for max results and the number of resource sets, a single call
     *   might not return the full list.
     */
    public fun resourceTypeList(resourceTypeList: Collection<String>) {
        _resourceTypeList.addAll(resourceTypeList)
    }

    /** @param resources The resources included in the resource set. */
    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    /** @param resources The resources included in the resource set. */
    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    /**
     * @param tags A collection of key:value pairs associated with a resource set. The key:value
     *   pair can be anything you define. Typically, the tag key represents a category (such as
     *   "environment") and the tag value represents a specific value within that category (such as
     *   "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A collection of key:value pairs associated with a resource set. The key:value
     *   pair can be anything you define. Typically, the tag key represents a category (such as
     *   "environment") and the tag value represents a specific value within that category (such as
     *   "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResourceSetProps {
        if (_resourceTypeList.isNotEmpty()) cdkBuilder.resourceTypeList(_resourceTypeList)
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
