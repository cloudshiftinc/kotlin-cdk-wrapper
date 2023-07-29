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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup
import software.constructs.Construct

/**
 * The AWS::MediaLive::InputSecurityGroup is a MediaLive resource type that creates an input
 * security group.
 *
 * A MediaLive input security group is associated with a MediaLive input. The input security group
 * is an "allow list" of IP addresses that controls whether an external IP address can push content
 * to the associated MediaLive input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Object tags;
 * CfnInputSecurityGroup cfnInputSecurityGroup = CfnInputSecurityGroup.Builder.create(this,
 * "MyCfnInputSecurityGroup")
 * .tags(tags)
 * .whitelistRules(List.of(InputWhitelistRuleCidrProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html)
 */
@CdkDslMarker
public class CfnInputSecurityGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInputSecurityGroup.Builder =
        CfnInputSecurityGroup.Builder.create(scope, id)

    private val _whitelistRules: MutableList<Any> = mutableListOf()

    /**
     * A collection of tags for this input security group.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-tags)
     *
     * @param tags A collection of tags for this input security group.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * A collection of tags for this input security group.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-tags)
     *
     * @param tags A collection of tags for this input security group.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     *
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     *   as "allowed" addresses.
     */
    public fun whitelistRules(vararg whitelistRules: Any) {
        _whitelistRules.addAll(listOf(*whitelistRules))
    }

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     *
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     *   as "allowed" addresses.
     */
    public fun whitelistRules(whitelistRules: Collection<Any>) {
        _whitelistRules.addAll(whitelistRules)
    }

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     *
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     *   as "allowed" addresses.
     */
    public fun whitelistRules(whitelistRules: IResolvable) {
        cdkBuilder.whitelistRules(whitelistRules)
    }

    public fun build(): CfnInputSecurityGroup {
        if (_whitelistRules.isNotEmpty()) cdkBuilder.whitelistRules(_whitelistRules)
        return cdkBuilder.build()
    }
}
