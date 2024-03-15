@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnImageBuilder`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnImageBuilderProps cfnImageBuilderProps = CfnImageBuilderProps.builder()
 * .instanceType("instanceType")
 * .name("name")
 * // the properties below are optional
 * .accessEndpoints(List.of(AccessEndpointProperty.builder()
 * .endpointType("endpointType")
 * .vpceId("vpceId")
 * .build()))
 * .appstreamAgentVersion("appstreamAgentVersion")
 * .description("description")
 * .displayName("displayName")
 * .domainJoinInfo(DomainJoinInfoProperty.builder()
 * .directoryName("directoryName")
 * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
 * .build())
 * .enableDefaultInternetAccess(false)
 * .iamRoleArn("iamRoleArn")
 * .imageArn("imageArn")
 * .imageName("imageName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html)
 */
public interface CfnImageBuilderProps {
  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   *
   * Administrators can connect to the image builder only through the specified endpoints.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
   */
  public fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  /**
   * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version
   * of the AppStream 2.0 agent, specify [LATEST].
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion)
   */
  public fun appstreamAgentVersion(): String? = unwrap(this).getAppstreamAgentVersion()

  /**
   * The description to display.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The image builder name to display.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The name of the directory and organizational unit (OU) to use to join the image builder to a
   * Microsoft Active Directory domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
   */
  public fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

  /**
   * Enables or disables default internet access for the image builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess)
   */
  public fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

  /**
   * The ARN of the IAM role that is applied to the image builder.
   *
   * To assume a role, the image builder calls the AWS Security Token Service `AssumeRole` API
   * operation and passes the ARN of the role to use. The operation creates a new session with
   * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
   * *appstream_machine_role* credential profile on the instance.
   *
   * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
   * Running on AppStream 2.0 Streaming
   * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
   * in the *Amazon AppStream 2.0 Administration Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-iamrolearn)
   */
  public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  /**
   * The ARN of the public, private, or shared image to use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn)
   */
  public fun imageArn(): String? = unwrap(this).getImageArn()

  /**
   * The name of the image used to create the image builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename)
   */
  public fun imageName(): String? = unwrap(this).getImageName()

  /**
   * The instance type to use when launching the image builder. The following instance types are
   * available:.
   *
   * * stream.standard.small
   * * stream.standard.medium
   * * stream.standard.large
   * * stream.compute.large
   * * stream.compute.xlarge
   * * stream.compute.2xlarge
   * * stream.compute.4xlarge
   * * stream.compute.8xlarge
   * * stream.memory.large
   * * stream.memory.xlarge
   * * stream.memory.2xlarge
   * * stream.memory.4xlarge
   * * stream.memory.8xlarge
   * * stream.memory.z1d.large
   * * stream.memory.z1d.xlarge
   * * stream.memory.z1d.2xlarge
   * * stream.memory.z1d.3xlarge
   * * stream.memory.z1d.6xlarge
   * * stream.memory.z1d.12xlarge
   * * stream.graphics-design.large
   * * stream.graphics-design.xlarge
   * * stream.graphics-design.2xlarge
   * * stream.graphics-design.4xlarge
   * * stream.graphics-desktop.2xlarge
   * * stream.graphics.g4dn.xlarge
   * * stream.graphics.g4dn.2xlarge
   * * stream.graphics.g4dn.4xlarge
   * * stream.graphics.g4dn.8xlarge
   * * stream.graphics.g4dn.12xlarge
   * * stream.graphics.g4dn.16xlarge
   * * stream.graphics-pro.4xlarge
   * * stream.graphics-pro.8xlarge
   * * stream.graphics-pro.16xlarge
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-instancetype)
   */
  public fun instanceType(): String

  /**
   * A unique name for the image builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The VPC configuration for the image builder.
   *
   * You can specify only one subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnImageBuilderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Administrators can connect to the image builder only through the specified endpoints.
     */
    public fun accessEndpoints(accessEndpoints: IResolvable)

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Administrators can connect to the image builder only through the specified endpoints.
     */
    public fun accessEndpoints(accessEndpoints: List<Any>)

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Administrators can connect to the image builder only through the specified endpoints.
     */
    public fun accessEndpoints(vararg accessEndpoints: Any)

    /**
     * @param appstreamAgentVersion The version of the AppStream 2.0 agent to use for this image
     * builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST].
     */
    public fun appstreamAgentVersion(appstreamAgentVersion: String)

    /**
     * @param description The description to display.
     */
    public fun description(description: String)

    /**
     * @param displayName The image builder name to display.
     */
    public fun displayName(displayName: String)

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain.
     */
    public fun domainJoinInfo(domainJoinInfo: IResolvable)

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain.
     */
    public fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty)

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25d189c58a3040ea7993349962820ce225fa99380d3de909a549d6c5dcbfc6ab")
    public
        fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty.Builder.() -> Unit)

    /**
     * @param enableDefaultInternetAccess Enables or disables default internet access for the image
     * builder.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    /**
     * @param enableDefaultInternetAccess Enables or disables default internet access for the image
     * builder.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    /**
     * @param iamRoleArn The ARN of the IAM role that is applied to the image builder.
     * To assume a role, the image builder calls the AWS Security Token Service `AssumeRole` API
     * operation and passes the ARN of the role to use. The operation creates a new session with
     * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
     * *appstream_machine_role* credential profile on the instance.
     *
     * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
     * Running on AppStream 2.0 Streaming
     * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
     * in the *Amazon AppStream 2.0 Administration Guide* .
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * @param imageArn The ARN of the public, private, or shared image to use.
     */
    public fun imageArn(imageArn: String)

    /**
     * @param imageName The name of the image used to create the image builder.
     */
    public fun imageName(imageName: String)

    /**
     * @param instanceType The instance type to use when launching the image builder. The following
     * instance types are available:. 
     * * stream.standard.small
     * * stream.standard.medium
     * * stream.standard.large
     * * stream.compute.large
     * * stream.compute.xlarge
     * * stream.compute.2xlarge
     * * stream.compute.4xlarge
     * * stream.compute.8xlarge
     * * stream.memory.large
     * * stream.memory.xlarge
     * * stream.memory.2xlarge
     * * stream.memory.4xlarge
     * * stream.memory.8xlarge
     * * stream.memory.z1d.large
     * * stream.memory.z1d.xlarge
     * * stream.memory.z1d.2xlarge
     * * stream.memory.z1d.3xlarge
     * * stream.memory.z1d.6xlarge
     * * stream.memory.z1d.12xlarge
     * * stream.graphics-design.large
     * * stream.graphics-design.xlarge
     * * stream.graphics-design.2xlarge
     * * stream.graphics-design.4xlarge
     * * stream.graphics-desktop.2xlarge
     * * stream.graphics.g4dn.xlarge
     * * stream.graphics.g4dn.2xlarge
     * * stream.graphics.g4dn.4xlarge
     * * stream.graphics.g4dn.8xlarge
     * * stream.graphics.g4dn.12xlarge
     * * stream.graphics.g4dn.16xlarge
     * * stream.graphics-pro.4xlarge
     * * stream.graphics-pro.8xlarge
     * * stream.graphics-pro.16xlarge
     */
    public fun instanceType(instanceType: String)

    /**
     * @param name A unique name for the image builder. 
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConfig The VPC configuration for the image builder.
     * You can specify only one subnet.
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig The VPC configuration for the image builder.
     * You can specify only one subnet.
     */
    public fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty)

    /**
     * @param vpcConfig The VPC configuration for the image builder.
     * You can specify only one subnet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ac911a63b382e511ea01922fcba40e9aaef610cbb8bcedd3a27b9d43c88197e")
    public fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder =
        software.amazon.awscdk.services.appstream.CfnImageBuilderProps.builder()

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Administrators can connect to the image builder only through the specified endpoints.
     */
    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Administrators can connect to the image builder only through the specified endpoints.
     */
    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    /**
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
     * Administrators can connect to the image builder only through the specified endpoints.
     */
    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    /**
     * @param appstreamAgentVersion The version of the AppStream 2.0 agent to use for this image
     * builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST].
     */
    override fun appstreamAgentVersion(appstreamAgentVersion: String) {
      cdkBuilder.appstreamAgentVersion(appstreamAgentVersion)
    }

    /**
     * @param description The description to display.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The image builder name to display.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain.
     */
    override fun domainJoinInfo(domainJoinInfo: IResolvable) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(IResolvable::unwrap))
    }

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain.
     */
    override fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(CfnImageBuilder.DomainJoinInfoProperty::unwrap))
    }

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25d189c58a3040ea7993349962820ce225fa99380d3de909a549d6c5dcbfc6ab")
    override
        fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty.Builder.() -> Unit):
        Unit = domainJoinInfo(CfnImageBuilder.DomainJoinInfoProperty(domainJoinInfo))

    /**
     * @param enableDefaultInternetAccess Enables or disables default internet access for the image
     * builder.
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * @param enableDefaultInternetAccess Enables or disables default internet access for the image
     * builder.
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

    /**
     * @param iamRoleArn The ARN of the IAM role that is applied to the image builder.
     * To assume a role, the image builder calls the AWS Security Token Service `AssumeRole` API
     * operation and passes the ARN of the role to use. The operation creates a new session with
     * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
     * *appstream_machine_role* credential profile on the instance.
     *
     * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
     * Running on AppStream 2.0 Streaming
     * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
     * in the *Amazon AppStream 2.0 Administration Guide* .
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param imageArn The ARN of the public, private, or shared image to use.
     */
    override fun imageArn(imageArn: String) {
      cdkBuilder.imageArn(imageArn)
    }

    /**
     * @param imageName The name of the image used to create the image builder.
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    /**
     * @param instanceType The instance type to use when launching the image builder. The following
     * instance types are available:. 
     * * stream.standard.small
     * * stream.standard.medium
     * * stream.standard.large
     * * stream.compute.large
     * * stream.compute.xlarge
     * * stream.compute.2xlarge
     * * stream.compute.4xlarge
     * * stream.compute.8xlarge
     * * stream.memory.large
     * * stream.memory.xlarge
     * * stream.memory.2xlarge
     * * stream.memory.4xlarge
     * * stream.memory.8xlarge
     * * stream.memory.z1d.large
     * * stream.memory.z1d.xlarge
     * * stream.memory.z1d.2xlarge
     * * stream.memory.z1d.3xlarge
     * * stream.memory.z1d.6xlarge
     * * stream.memory.z1d.12xlarge
     * * stream.graphics-design.large
     * * stream.graphics-design.xlarge
     * * stream.graphics-design.2xlarge
     * * stream.graphics-design.4xlarge
     * * stream.graphics-desktop.2xlarge
     * * stream.graphics.g4dn.xlarge
     * * stream.graphics.g4dn.2xlarge
     * * stream.graphics.g4dn.4xlarge
     * * stream.graphics.g4dn.8xlarge
     * * stream.graphics.g4dn.12xlarge
     * * stream.graphics.g4dn.16xlarge
     * * stream.graphics-pro.4xlarge
     * * stream.graphics-pro.8xlarge
     * * stream.graphics-pro.16xlarge
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param name A unique name for the image builder. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConfig The VPC configuration for the image builder.
     * You can specify only one subnet.
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConfig The VPC configuration for the image builder.
     * You can specify only one subnet.
     */
    override fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnImageBuilder.VpcConfigProperty::unwrap))
    }

    /**
     * @param vpcConfig The VPC configuration for the image builder.
     * You can specify only one subnet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ac911a63b382e511ea01922fcba40e9aaef610cbb8bcedd3a27b9d43c88197e")
    override fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnImageBuilder.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnImageBuilderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilderProps,
  ) : CdkObject(cdkObject), CfnImageBuilderProps {
    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Administrators can connect to the image builder only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
     */
    override fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

    /**
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest
     * version of the AppStream 2.0 agent, specify [LATEST].
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion)
     */
    override fun appstreamAgentVersion(): String? = unwrap(this).getAppstreamAgentVersion()

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The image builder name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The name of the directory and organizational unit (OU) to use to join the image builder to a
     * Microsoft Active Directory domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
     */
    override fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

    /**
     * Enables or disables default internet access for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess)
     */
    override fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

    /**
     * The ARN of the IAM role that is applied to the image builder.
     *
     * To assume a role, the image builder calls the AWS Security Token Service `AssumeRole` API
     * operation and passes the ARN of the role to use. The operation creates a new session with
     * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
     * *appstream_machine_role* credential profile on the instance.
     *
     * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
     * Running on AppStream 2.0 Streaming
     * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
     * in the *Amazon AppStream 2.0 Administration Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-iamrolearn)
     */
    override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    /**
     * The ARN of the public, private, or shared image to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn)
     */
    override fun imageArn(): String? = unwrap(this).getImageArn()

    /**
     * The name of the image used to create the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename)
     */
    override fun imageName(): String? = unwrap(this).getImageName()

    /**
     * The instance type to use when launching the image builder. The following instance types are
     * available:.
     *
     * * stream.standard.small
     * * stream.standard.medium
     * * stream.standard.large
     * * stream.compute.large
     * * stream.compute.xlarge
     * * stream.compute.2xlarge
     * * stream.compute.4xlarge
     * * stream.compute.8xlarge
     * * stream.memory.large
     * * stream.memory.xlarge
     * * stream.memory.2xlarge
     * * stream.memory.4xlarge
     * * stream.memory.8xlarge
     * * stream.memory.z1d.large
     * * stream.memory.z1d.xlarge
     * * stream.memory.z1d.2xlarge
     * * stream.memory.z1d.3xlarge
     * * stream.memory.z1d.6xlarge
     * * stream.memory.z1d.12xlarge
     * * stream.graphics-design.large
     * * stream.graphics-design.xlarge
     * * stream.graphics-design.2xlarge
     * * stream.graphics-design.4xlarge
     * * stream.graphics-desktop.2xlarge
     * * stream.graphics.g4dn.xlarge
     * * stream.graphics.g4dn.2xlarge
     * * stream.graphics.g4dn.4xlarge
     * * stream.graphics.g4dn.8xlarge
     * * stream.graphics.g4dn.12xlarge
     * * stream.graphics.g4dn.16xlarge
     * * stream.graphics-pro.4xlarge
     * * stream.graphics-pro.8xlarge
     * * stream.graphics-pro.16xlarge
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * A unique name for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The VPC configuration for the image builder.
     *
     * You can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageBuilderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilderProps):
        CfnImageBuilderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageBuilderProps):
        software.amazon.awscdk.services.appstream.CfnImageBuilderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnImageBuilderProps
  }
}
