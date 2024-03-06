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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps

/**
 * Properties for defining a `CfnConfiguredTableAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * CfnConfiguredTableAssociationProps cfnConfiguredTableAssociationProps =
 * CfnConfiguredTableAssociationProps.builder()
 * .configuredTableIdentifier("configuredTableIdentifier")
 * .membershipIdentifier("membershipIdentifier")
 * .name("name")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html)
 */
@CdkDslMarker
public class CfnConfiguredTableAssociationPropsDsl {
    private val cdkBuilder: CfnConfiguredTableAssociationProps.Builder =
        CfnConfiguredTableAssociationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     *   associated to. Currently accepts a configured table ID.
     */
    public fun configuredTableIdentifier(configuredTableIdentifier: String) {
        cdkBuilder.configuredTableIdentifier(configuredTableIdentifier)
    }

    /** @param description A description of the configured table association. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param membershipIdentifier The unique ID for the membership this configured table
     *   association belongs to.
     */
    public fun membershipIdentifier(membershipIdentifier: String) {
        cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * @param name The name of the configured table association, in lowercase. The table is
     *   identified by this name when running protected queries against the underlying data.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param roleArn The service will assume this role to access catalog metadata and query the
     *   table.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it. Each tag
     *   consists of a key and an optional value, both of which you define. When you use tagging,
     *   you can also use tag-based access control in IAM policies to control access to this
     *   resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it. Each tag
     *   consists of a key and an optional value, both of which you define. When you use tagging,
     *   you can also use tag-based access control in IAM policies to control access to this
     *   resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConfiguredTableAssociationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
