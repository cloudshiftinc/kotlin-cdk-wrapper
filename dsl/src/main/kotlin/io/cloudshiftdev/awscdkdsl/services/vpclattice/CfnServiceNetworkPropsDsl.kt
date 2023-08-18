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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps

/**
 * Properties for defining a `CfnServiceNetwork`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnServiceNetworkProps cfnServiceNetworkProps = CfnServiceNetworkProps.builder()
 * .authType("authType")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html)
 */
@CdkDslMarker
public class CfnServiceNetworkPropsDsl {
    private val cdkBuilder: CfnServiceNetworkProps.Builder = CfnServiceNetworkProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param authType The type of IAM policy.
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     *   auth policy is required.
     */
    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    /**
     * @param name The name of the service network. The name must be unique to the account. The
     *   valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last
     *   character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The tags for the service network. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the service network. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceNetworkProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
