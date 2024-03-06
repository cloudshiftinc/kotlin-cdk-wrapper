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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSecurityGroupProps

/**
 * Properties for defining a `CfnSecurityGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSecurityGroupProps cfnSecurityGroupProps = CfnSecurityGroupProps.builder()
 * .groupDescription("groupDescription")
 * // the properties below are optional
 * .groupName("groupName")
 * .securityGroupEgress(List.of(EgressProperty.builder()
 * .ipProtocol("ipProtocol")
 * // the properties below are optional
 * .cidrIp("cidrIp")
 * .cidrIpv6("cidrIpv6")
 * .description("description")
 * .destinationPrefixListId("destinationPrefixListId")
 * .destinationSecurityGroupId("destinationSecurityGroupId")
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .securityGroupIngress(List.of(IngressProperty.builder()
 * .ipProtocol("ipProtocol")
 * // the properties below are optional
 * .cidrIp("cidrIp")
 * .cidrIpv6("cidrIpv6")
 * .description("description")
 * .fromPort(123)
 * .sourcePrefixListId("sourcePrefixListId")
 * .sourceSecurityGroupId("sourceSecurityGroupId")
 * .sourceSecurityGroupName("sourceSecurityGroupName")
 * .sourceSecurityGroupOwnerId("sourceSecurityGroupOwnerId")
 * .toPort(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html)
 */
@CdkDslMarker
public class CfnSecurityGroupPropsDsl {
    private val cdkBuilder: CfnSecurityGroupProps.Builder = CfnSecurityGroupProps.builder()

    private val _securityGroupEgress: MutableList<Any> = mutableListOf()

    private val _securityGroupIngress: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param groupDescription A description for the security group. Constraints: Up to 255
     *   characters in length
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     */
    public fun groupDescription(groupDescription: String) {
        cdkBuilder.groupDescription(groupDescription)
    }

    /**
     * @param groupName The name of the security group. Constraints: Up to 255 characters in length.
     *   Cannot start with `sg-` .
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * @param securityGroupEgress The outbound rules associated with the security group. There is a
     *   short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupEgress(vararg securityGroupEgress: Any) {
        _securityGroupEgress.addAll(listOf(*securityGroupEgress))
    }

    /**
     * @param securityGroupEgress The outbound rules associated with the security group. There is a
     *   short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupEgress(securityGroupEgress: Collection<Any>) {
        _securityGroupEgress.addAll(securityGroupEgress)
    }

    /**
     * @param securityGroupEgress The outbound rules associated with the security group. There is a
     *   short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupEgress(securityGroupEgress: IResolvable) {
        cdkBuilder.securityGroupEgress(securityGroupEgress)
    }

    /**
     * @param securityGroupIngress The inbound rules associated with the security group. There is a
     *   short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupIngress(vararg securityGroupIngress: Any) {
        _securityGroupIngress.addAll(listOf(*securityGroupIngress))
    }

    /**
     * @param securityGroupIngress The inbound rules associated with the security group. There is a
     *   short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupIngress(securityGroupIngress: Collection<Any>) {
        _securityGroupIngress.addAll(securityGroupIngress)
    }

    /**
     * @param securityGroupIngress The inbound rules associated with the security group. There is a
     *   short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupIngress(securityGroupIngress: IResolvable) {
        cdkBuilder.securityGroupIngress(securityGroupIngress)
    }

    /** @param tags Any tags assigned to the security group. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Any tags assigned to the security group. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcId The ID of the VPC for the security group. If you do not specify a VPC, the
     *   default is to use the default VPC for the Region. If there's no specified VPC and no
     *   default VPC, security group creation fails.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnSecurityGroupProps {
        if (_securityGroupEgress.isNotEmpty()) cdkBuilder.securityGroupEgress(_securityGroupEgress)
        if (_securityGroupIngress.isNotEmpty())
            cdkBuilder.securityGroupIngress(_securityGroupIngress)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
