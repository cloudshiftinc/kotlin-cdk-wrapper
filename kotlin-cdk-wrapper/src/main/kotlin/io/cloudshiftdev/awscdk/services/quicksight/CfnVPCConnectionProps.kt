@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVPCConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnVPCConnectionProps cfnVPCConnectionProps = CfnVPCConnectionProps.builder()
 * .availabilityStatus("availabilityStatus")
 * .awsAccountId("awsAccountId")
 * .dnsResolvers(List.of("dnsResolvers"))
 * .name("name")
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConnectionId("vpcConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html)
 */
public interface CfnVPCConnectionProps {
  /**
   * The availability status of the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-availabilitystatus)
   */
  public fun availabilityStatus(): String? = unwrap(this).getAvailabilityStatus()

  /**
   * The AWS account ID of the account where you want to create a new VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-awsaccountid)
   */
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * A list of IP addresses of DNS resolver endpoints for the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-dnsresolvers)
   */
  public fun dnsResolvers(): List<String> = unwrap(this).getDnsResolvers() ?: emptyList()

  /**
   * The display name for the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The ARN of the IAM role associated with the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon EC2 security group IDs associated with the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * A list of subnet IDs for the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the VPC connection that you're creating.
   *
   * This ID is a unique identifier for each AWS Region in an AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-vpcconnectionid)
   */
  public fun vpcConnectionId(): String? = unwrap(this).getVpcConnectionId()

  /**
   * A builder for [CfnVPCConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityStatus The availability status of the VPC connection.
     */
    public fun availabilityStatus(availabilityStatus: String)

    /**
     * @param awsAccountId The AWS account ID of the account where you want to create a new VPC
     * connection.
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
     */
    public fun dnsResolvers(dnsResolvers: List<String>)

    /**
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
     */
    public fun dnsResolvers(vararg dnsResolvers: String)

    /**
     * @param name The display name for the VPC connection.
     */
    public fun name(name: String)

    /**
     * @param roleArn The ARN of the IAM role associated with the VPC connection.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetIds A list of subnet IDs for the VPC connection.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds A list of subnet IDs for the VPC connection.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConnectionId The ID of the VPC connection that you're creating.
     * This ID is a unique identifier for each AWS Region in an AWS account.
     */
    public fun vpcConnectionId(vpcConnectionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps.Builder
        = software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps.builder()

    /**
     * @param availabilityStatus The availability status of the VPC connection.
     */
    override fun availabilityStatus(availabilityStatus: String) {
      cdkBuilder.availabilityStatus(availabilityStatus)
    }

    /**
     * @param awsAccountId The AWS account ID of the account where you want to create a new VPC
     * connection.
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
     */
    override fun dnsResolvers(dnsResolvers: List<String>) {
      cdkBuilder.dnsResolvers(dnsResolvers)
    }

    /**
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
     */
    override fun dnsResolvers(vararg dnsResolvers: String): Unit =
        dnsResolvers(dnsResolvers.toList())

    /**
     * @param name The display name for the VPC connection.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The ARN of the IAM role associated with the VPC connection.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetIds A list of subnet IDs for the VPC connection.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds A list of subnet IDs for the VPC connection.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConnectionId The ID of the VPC connection that you're creating.
     * This ID is a unique identifier for each AWS Region in an AWS account.
     */
    override fun vpcConnectionId(vpcConnectionId: String) {
      cdkBuilder.vpcConnectionId(vpcConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps,
  ) : CdkObject(cdkObject), CfnVPCConnectionProps {
    /**
     * The availability status of the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-availabilitystatus)
     */
    override fun availabilityStatus(): String? = unwrap(this).getAvailabilityStatus()

    /**
     * The AWS account ID of the account where you want to create a new VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-awsaccountid)
     */
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    /**
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-dnsresolvers)
     */
    override fun dnsResolvers(): List<String> = unwrap(this).getDnsResolvers() ?: emptyList()

    /**
     * The display name for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The ARN of the IAM role associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The Amazon EC2 security group IDs associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * A list of subnet IDs for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the VPC connection that you're creating.
     *
     * This ID is a unique identifier for each AWS Region in an AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-vpcconnectionid)
     */
    override fun vpcConnectionId(): String? = unwrap(this).getVpcConnectionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps):
        CfnVPCConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCConnectionProps):
        software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps
  }
}
