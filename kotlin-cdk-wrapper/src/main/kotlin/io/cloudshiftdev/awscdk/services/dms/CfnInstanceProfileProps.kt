@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnInstanceProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
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
public interface CfnInstanceProfileProps {
  /**
   * The Availability Zone where the instance profile runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * A description of the instance profile.
   *
   * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
   * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
   * and can only begin with a letter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the instance profile.
   *
   * Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens.
   * They can't end with a hyphen, or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-instanceprofileidentifier)
   */
  public fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

  /**
   * The user-friendly name for the instance profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-instanceprofilename)
   */
  public fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  /**
   * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the connection
   * parameters for the instance profile.
   *
   * If you don't specify a value for the `KmsKeyArn` parameter, then AWS DMS uses your default
   * encryption key.
   *
   * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
   * different default encryption key for each AWS Region .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * Specifies the network type for the instance profile.
   *
   * A value of `IPV4` represents an instance profile with IPv4 network type and only supports IPv4
   * addressing. A value of `IPV6` represents an instance profile with IPv6 network type and only
   * supports IPv6 addressing. A value of `DUAL` represents an instance profile with dual network type
   * that supports IPv4 and IPv6 addressing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-networktype)
   */
  public fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * Specifies the accessibility options for the instance profile.
   *
   * A value of `true` represents an instance profile with a public IP address. A value of `false`
   * represents an instance profile with a private IP address. The default value is `true` .
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * The identifier of the subnet group that is associated with the instance profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-subnetgroupidentifier)
   */
  public fun subnetGroupIdentifier(): String? = unwrap(this).getSubnetGroupIdentifier()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The VPC security groups that are used with the instance profile.
   *
   * The VPC security group must work with the VPC containing the instance profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-vpcsecuritygroups)
   */
  public fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?: emptyList()

  /**
   * A builder for [CfnInstanceProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The Availability Zone where the instance profile runs.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param description A description of the instance profile.
     * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
     * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     */
    public fun description(description: String)

    /**
     * @param instanceProfileIdentifier The identifier of the instance profile.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */
    public fun instanceProfileIdentifier(instanceProfileIdentifier: String)

    /**
     * @param instanceProfileName The user-friendly name for the instance profile.
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt
     * the connection parameters for the instance profile.
     * If you don't specify a value for the `KmsKeyArn` parameter, then AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param networkType Specifies the network type for the instance profile.
     * A value of `IPV4` represents an instance profile with IPv4 network type and only supports
     * IPv4 addressing. A value of `IPV6` represents an instance profile with IPv6 network type and
     * only supports IPv6 addressing. A value of `DUAL` represents an instance profile with dual
     * network type that supports IPv4 and IPv6 addressing.
     */
    public fun networkType(networkType: String)

    /**
     * @param publiclyAccessible Specifies the accessibility options for the instance profile.
     * A value of `true` represents an instance profile with a public IP address. A value of `false`
     * represents an instance profile with a private IP address. The default value is `true` .
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible Specifies the accessibility options for the instance profile.
     * A value of `true` represents an instance profile with a public IP address. A value of `false`
     * represents an instance profile with a private IP address. The default value is `true` .
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param subnetGroupIdentifier The identifier of the subnet group that is associated with the
     * instance profile.
     */
    public fun subnetGroupIdentifier(subnetGroupIdentifier: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcSecurityGroups The VPC security groups that are used with the instance profile.
     * The VPC security group must work with the VPC containing the instance profile.
     */
    public fun vpcSecurityGroups(vpcSecurityGroups: List<String>)

    /**
     * @param vpcSecurityGroups The VPC security groups that are used with the instance profile.
     * The VPC security group must work with the VPC containing the instance profile.
     */
    public fun vpcSecurityGroups(vararg vpcSecurityGroups: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnInstanceProfileProps.Builder =
        software.amazon.awscdk.services.dms.CfnInstanceProfileProps.builder()

    /**
     * @param availabilityZone The Availability Zone where the instance profile runs.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param description A description of the instance profile.
     * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
     * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceProfileIdentifier The identifier of the instance profile.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */
    override fun instanceProfileIdentifier(instanceProfileIdentifier: String) {
      cdkBuilder.instanceProfileIdentifier(instanceProfileIdentifier)
    }

    /**
     * @param instanceProfileName The user-friendly name for the instance profile.
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt
     * the connection parameters for the instance profile.
     * If you don't specify a value for the `KmsKeyArn` parameter, then AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param networkType Specifies the network type for the instance profile.
     * A value of `IPV4` represents an instance profile with IPv4 network type and only supports
     * IPv4 addressing. A value of `IPV6` represents an instance profile with IPv6 network type and
     * only supports IPv6 addressing. A value of `DUAL` represents an instance profile with dual
     * network type that supports IPv4 and IPv6 addressing.
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * @param publiclyAccessible Specifies the accessibility options for the instance profile.
     * A value of `true` represents an instance profile with a public IP address. A value of `false`
     * represents an instance profile with a private IP address. The default value is `true` .
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Specifies the accessibility options for the instance profile.
     * A value of `true` represents an instance profile with a public IP address. A value of `false`
     * represents an instance profile with a private IP address. The default value is `true` .
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * @param subnetGroupIdentifier The identifier of the subnet group that is associated with the
     * instance profile.
     */
    override fun subnetGroupIdentifier(subnetGroupIdentifier: String) {
      cdkBuilder.subnetGroupIdentifier(subnetGroupIdentifier)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcSecurityGroups The VPC security groups that are used with the instance profile.
     * The VPC security group must work with the VPC containing the instance profile.
     */
    override fun vpcSecurityGroups(vpcSecurityGroups: List<String>) {
      cdkBuilder.vpcSecurityGroups(vpcSecurityGroups)
    }

    /**
     * @param vpcSecurityGroups The VPC security groups that are used with the instance profile.
     * The VPC security group must work with the VPC containing the instance profile.
     */
    override fun vpcSecurityGroups(vararg vpcSecurityGroups: String): Unit =
        vpcSecurityGroups(vpcSecurityGroups.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnInstanceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dms.CfnInstanceProfileProps,
  ) : CdkObject(cdkObject), CfnInstanceProfileProps {
    /**
     * The Availability Zone where the instance profile runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * A description of the instance profile.
     *
     * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
     * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the instance profile.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-instanceprofileidentifier)
     */
    override fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

    /**
     * The user-friendly name for the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-instanceprofilename)
     */
    override fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the connection
     * parameters for the instance profile.
     *
     * If you don't specify a value for the `KmsKeyArn` parameter, then AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
     * different default encryption key for each AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * Specifies the network type for the instance profile.
     *
     * A value of `IPV4` represents an instance profile with IPv4 network type and only supports
     * IPv4 addressing. A value of `IPV6` represents an instance profile with IPv6 network type and
     * only supports IPv6 addressing. A value of `DUAL` represents an instance profile with dual
     * network type that supports IPv4 and IPv6 addressing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-networktype)
     */
    override fun networkType(): String? = unwrap(this).getNetworkType()

    /**
     * Specifies the accessibility options for the instance profile.
     *
     * A value of `true` represents an instance profile with a public IP address. A value of `false`
     * represents an instance profile with a private IP address. The default value is `true` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * The identifier of the subnet group that is associated with the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-subnetgroupidentifier)
     */
    override fun subnetGroupIdentifier(): String? = unwrap(this).getSubnetGroupIdentifier()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The VPC security groups that are used with the instance profile.
     *
     * The VPC security group must work with the VPC containing the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-vpcsecuritygroups)
     */
    override fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnInstanceProfileProps):
        CfnInstanceProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInstanceProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfileProps):
        software.amazon.awscdk.services.dms.CfnInstanceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnInstanceProfileProps
  }
}
