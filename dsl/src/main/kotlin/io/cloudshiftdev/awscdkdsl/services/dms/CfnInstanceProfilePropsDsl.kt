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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnInstanceProfileProps

/**
 * Properties for defining a `CfnInstanceProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * CfnInstanceProfileProps cfnInstanceProfileProps = CfnInstanceProfileProps.builder()
 * .availabilityZone("availabilityZone")
 * .description("description")
 * .instanceProfileIdentifier("instanceProfileIdentifier")
 * .instanceProfileName("instanceProfileName")
 * .kmsKeyArn("kmsKeyArn")
 * .networkType("networkType")
 * .publiclyAccessible(false)
 * .subnetGroupIdentifier("subnetGroupIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcSecurityGroups(List.of("vpcSecurityGroups"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html)
 */
@CdkDslMarker
public class CfnInstanceProfilePropsDsl {
    private val cdkBuilder: CfnInstanceProfileProps.Builder = CfnInstanceProfileProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpcSecurityGroups: MutableList<String> = mutableListOf()

    /** @param availabilityZone The Availability Zone where the instance profile runs. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param description A description of the instance profile. Descriptions can have up to 31
     *   characters. A description can contain only ASCII letters, digits, and hyphens ('-'). Also,
     *   it can't end with a hyphen or contain two consecutive hyphens, and can only begin with a
     *   letter.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param instanceProfileIdentifier The identifier of the instance profile. Identifiers must
     *   begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't
     *   end with a hyphen, or contain two consecutive hyphens.
     */
    public fun instanceProfileIdentifier(instanceProfileIdentifier: String) {
        cdkBuilder.instanceProfileIdentifier(instanceProfileIdentifier)
    }

    /** @param instanceProfileName The user-friendly name for the instance profile. */
    public fun instanceProfileName(instanceProfileName: String) {
        cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt
     *   the connection parameters for the instance profile. If you don't specify a value for the
     *   `KmsKeyArn` parameter, then AWS DMS uses your default encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param networkType Specifies the network type for the instance profile. A value of `IPV4`
     *   represents an instance profile with IPv4 network type and only supports IPv4 addressing. A
     *   value of `IPV6` represents an instance profile with IPv6 network type and only supports
     *   IPv6 addressing. A value of `DUAL` represents an instance profile with dual network type
     *   that supports IPv4 and IPv6 addressing.
     */
    public fun networkType(networkType: String) {
        cdkBuilder.networkType(networkType)
    }

    /**
     * @param publiclyAccessible Specifies the accessibility options for the instance profile. A
     *   value of `true` represents an instance profile with a public IP address. A value of `false`
     *   represents an instance profile with a private IP address. The default value is `true` .
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Specifies the accessibility options for the instance profile. A
     *   value of `true` represents an instance profile with a public IP address. A value of `false`
     *   represents an instance profile with a private IP address. The default value is `true` .
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param subnetGroupIdentifier The identifier of the subnet group that is associated with the
     *   instance profile.
     */
    public fun subnetGroupIdentifier(subnetGroupIdentifier: String) {
        cdkBuilder.subnetGroupIdentifier(subnetGroupIdentifier)
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcSecurityGroups The VPC security groups that are used with the instance profile. The
     *   VPC security group must work with the VPC containing the instance profile.
     */
    public fun vpcSecurityGroups(vararg vpcSecurityGroups: String) {
        _vpcSecurityGroups.addAll(listOf(*vpcSecurityGroups))
    }

    /**
     * @param vpcSecurityGroups The VPC security groups that are used with the instance profile. The
     *   VPC security group must work with the VPC containing the instance profile.
     */
    public fun vpcSecurityGroups(vpcSecurityGroups: Collection<String>) {
        _vpcSecurityGroups.addAll(vpcSecurityGroups)
    }

    public fun build(): CfnInstanceProfileProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSecurityGroups.isNotEmpty()) cdkBuilder.vpcSecurityGroups(_vpcSecurityGroups)
        return cdkBuilder.build()
    }
}
