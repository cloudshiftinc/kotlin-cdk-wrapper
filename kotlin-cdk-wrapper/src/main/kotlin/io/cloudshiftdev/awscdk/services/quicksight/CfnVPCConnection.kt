@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new VPC connection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnVPCConnection cfnVPCConnection = CfnVPCConnection.Builder.create(this, "MyCfnVPCConnection")
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
public open class CfnVPCConnection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the VPC connection.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time that the VPC connection was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The time that the VPC connection was last updated.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * A list of network interfaces.
   */
  public open fun attrNetworkInterfaces(): IResolvable =
      unwrap(this).getAttrNetworkInterfaces().let(IResolvable::wrap)

  /**
   * The HTTP status of the request.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon EC2 VPC ID associated with the VPC connection.
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * The availability status of the VPC connection.
   */
  public open fun availabilityStatus(): String? = unwrap(this).getAvailabilityStatus()

  /**
   * The availability status of the VPC connection.
   */
  public open fun availabilityStatus(`value`: String) {
    unwrap(this).setAvailabilityStatus(`value`)
  }

  /**
   * The AWS account ID of the account where you want to create a new VPC connection.
   */
  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The AWS account ID of the account where you want to create a new VPC connection.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * A list of IP addresses of DNS resolver endpoints for the VPC connection.
   */
  public open fun dnsResolvers(): List<String> = unwrap(this).getDnsResolvers() ?: emptyList()

  /**
   * A list of IP addresses of DNS resolver endpoints for the VPC connection.
   */
  public open fun dnsResolvers(`value`: List<String>) {
    unwrap(this).setDnsResolvers(`value`)
  }

  /**
   * A list of IP addresses of DNS resolver endpoints for the VPC connection.
   */
  public open fun dnsResolvers(vararg `value`: String): Unit = dnsResolvers(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The display name for the VPC connection.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The display name for the VPC connection.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of the IAM role associated with the VPC connection.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The ARN of the IAM role associated with the VPC connection.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The Amazon EC2 security group IDs associated with the VPC connection.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The Amazon EC2 security group IDs associated with the VPC connection.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The Amazon EC2 security group IDs associated with the VPC connection.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * A list of subnet IDs for the VPC connection.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * A list of subnet IDs for the VPC connection.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * A list of subnet IDs for the VPC connection.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the VPC connection that you're creating.
   */
  public open fun vpcConnectionId(): String? = unwrap(this).getVpcConnectionId()

  /**
   * The ID of the VPC connection that you're creating.
   */
  public open fun vpcConnectionId(`value`: String) {
    unwrap(this).setVpcConnectionId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.quicksight.CfnVPCConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The availability status of the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-availabilitystatus)
     * @param availabilityStatus The availability status of the VPC connection. 
     */
    public fun availabilityStatus(availabilityStatus: String)

    /**
     * The AWS account ID of the account where you want to create a new VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-awsaccountid)
     * @param awsAccountId The AWS account ID of the account where you want to create a new VPC
     * connection. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-dnsresolvers)
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection. 
     */
    public fun dnsResolvers(dnsResolvers: List<String>)

    /**
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-dnsresolvers)
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection. 
     */
    public fun dnsResolvers(vararg dnsResolvers: String)

    /**
     * The display name for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-name)
     * @param name The display name for the VPC connection. 
     */
    public fun name(name: String)

    /**
     * The ARN of the IAM role associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-rolearn)
     * @param roleArn The ARN of the IAM role associated with the VPC connection. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The Amazon EC2 security group IDs associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-securitygroupids)
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     * 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The Amazon EC2 security group IDs associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-securitygroupids)
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     * 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * A list of subnet IDs for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-subnetids)
     * @param subnetIds A list of subnet IDs for the VPC connection. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * A list of subnet IDs for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-subnetids)
     * @param subnetIds A list of subnet IDs for the VPC connection. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the VPC connection that you're creating.
     *
     * This ID is a unique identifier for each AWS Region in an AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-vpcconnectionid)
     * @param vpcConnectionId The ID of the VPC connection that you're creating. 
     */
    public fun vpcConnectionId(vpcConnectionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnVPCConnection.Builder =
        software.amazon.awscdk.services.quicksight.CfnVPCConnection.Builder.create(scope, id)

    /**
     * The availability status of the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-availabilitystatus)
     * @param availabilityStatus The availability status of the VPC connection. 
     */
    override fun availabilityStatus(availabilityStatus: String) {
      cdkBuilder.availabilityStatus(availabilityStatus)
    }

    /**
     * The AWS account ID of the account where you want to create a new VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-awsaccountid)
     * @param awsAccountId The AWS account ID of the account where you want to create a new VPC
     * connection. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-dnsresolvers)
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection. 
     */
    override fun dnsResolvers(dnsResolvers: List<String>) {
      cdkBuilder.dnsResolvers(dnsResolvers)
    }

    /**
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-dnsresolvers)
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection. 
     */
    override fun dnsResolvers(vararg dnsResolvers: String): Unit =
        dnsResolvers(dnsResolvers.toList())

    /**
     * The display name for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-name)
     * @param name The display name for the VPC connection. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of the IAM role associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-rolearn)
     * @param roleArn The ARN of the IAM role associated with the VPC connection. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The Amazon EC2 security group IDs associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-securitygroupids)
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     * 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The Amazon EC2 security group IDs associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-securitygroupids)
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     * 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * A list of subnet IDs for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-subnetids)
     * @param subnetIds A list of subnet IDs for the VPC connection. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * A list of subnet IDs for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-subnetids)
     * @param subnetIds A list of subnet IDs for the VPC connection. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the VPC connection that you're creating.
     *
     * This ID is a unique identifier for each AWS Region in an AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-vpcconnectionid)
     * @param vpcConnectionId The ID of the VPC connection that you're creating. 
     */
    override fun vpcConnectionId(vpcConnectionId: String) {
      cdkBuilder.vpcConnectionId(vpcConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnVPCConnection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnVPCConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnection):
        CfnVPCConnection = CfnVPCConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVPCConnection):
        software.amazon.awscdk.services.quicksight.CfnVPCConnection = wrapped.cdkObject
  }

  /**
   * The structure that contains information about a network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .errorMessage("errorMessage")
   * .networkInterfaceId("networkInterfaceId")
   * .status("status")
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html)
   */
  public interface NetworkInterfaceProperty {
    /**
     * The availability zone that the network interface resides in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * An error message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-errormessage)
     */
    public fun errorMessage(): String? = unwrap(this).getErrorMessage()

    /**
     * The network interface ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-networkinterfaceid)
     */
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The status of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The subnet ID associated with the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [NetworkInterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The availability zone that the network interface resides in.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param errorMessage An error message.
       */
      public fun errorMessage(errorMessage: String)

      /**
       * @param networkInterfaceId The network interface ID.
       */
      public fun networkInterfaceId(networkInterfaceId: String)

      /**
       * @param status The status of the network interface.
       */
      public fun status(status: String)

      /**
       * @param subnetId The subnet ID associated with the network interface.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty.builder()

      /**
       * @param availabilityZone The availability zone that the network interface resides in.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param errorMessage An error message.
       */
      override fun errorMessage(errorMessage: String) {
        cdkBuilder.errorMessage(errorMessage)
      }

      /**
       * @param networkInterfaceId The network interface ID.
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      /**
       * @param status The status of the network interface.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param subnetId The subnet ID associated with the network interface.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceProperty {
      /**
       * The availability zone that the network interface resides in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * An error message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-errormessage)
       */
      override fun errorMessage(): String? = unwrap(this).getErrorMessage()

      /**
       * The network interface ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-networkinterfaceid)
       */
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      /**
       * The status of the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The subnet ID associated with the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-vpcconnection-networkinterface.html#cfn-quicksight-vpcconnection-networkinterface-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty):
          NetworkInterfaceProperty = CdkObjectWrappers.wrap(cdkObject) as? NetworkInterfaceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnVPCConnection.NetworkInterfaceProperty
    }
  }
}
