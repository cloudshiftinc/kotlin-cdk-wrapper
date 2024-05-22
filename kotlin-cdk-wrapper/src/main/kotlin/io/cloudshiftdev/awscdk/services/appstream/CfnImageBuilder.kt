@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

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
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppStream::ImageBuilder` resource creates an image builder for Amazon AppStream 2.0. An
 * image builder is a virtual machine that is used to create an image.
 *
 * The initial state of the image builder is `PENDING` . When it is ready, the state is `RUNNING` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnImageBuilder cfnImageBuilder = CfnImageBuilder.Builder.create(this, "MyCfnImageBuilder")
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
public open class CfnImageBuilder(
  cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnImageBuilderProps,
  ) :
      this(software.amazon.awscdk.services.appstream.CfnImageBuilder(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnImageBuilderProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnImageBuilderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnImageBuilderProps(props)
  )

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   */
  public open fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   */
  public open fun accessEndpoints(`value`: IResolvable) {
    unwrap(this).setAccessEndpoints(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   */
  public open fun accessEndpoints(`value`: List<Any>) {
    unwrap(this).setAccessEndpoints(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   */
  public open fun accessEndpoints(vararg `value`: Any): Unit = accessEndpoints(`value`.toList())

  /**
   * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version
   * of the AppStream 2.0 agent, specify [LATEST].
   */
  public open fun appstreamAgentVersion(): String? = unwrap(this).getAppstreamAgentVersion()

  /**
   * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version
   * of the AppStream 2.0 agent, specify [LATEST].
   */
  public open fun appstreamAgentVersion(`value`: String) {
    unwrap(this).setAppstreamAgentVersion(`value`)
  }

  /**
   * The URL to start an image builder streaming session, returned as a string.
   */
  public open fun attrStreamingUrl(): String = unwrap(this).getAttrStreamingUrl()

  /**
   * The description to display.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description to display.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The image builder name to display.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The image builder name to display.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the image builder to a
   * Microsoft Active Directory domain.
   */
  public open fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

  /**
   * The name of the directory and organizational unit (OU) to use to join the image builder to a
   * Microsoft Active Directory domain.
   */
  public open fun domainJoinInfo(`value`: IResolvable) {
    unwrap(this).setDomainJoinInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the image builder to a
   * Microsoft Active Directory domain.
   */
  public open fun domainJoinInfo(`value`: DomainJoinInfoProperty) {
    unwrap(this).setDomainJoinInfo(`value`.let(DomainJoinInfoProperty.Companion::unwrap))
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the image builder to a
   * Microsoft Active Directory domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1761aebbd503c31d87dc05b49cd9a315a2affd8f8f2ca4d0038f8cb66ff6d1e")
  public open fun domainJoinInfo(`value`: DomainJoinInfoProperty.Builder.() -> Unit): Unit =
      domainJoinInfo(DomainJoinInfoProperty(`value`))

  /**
   * Enables or disables default internet access for the image builder.
   */
  public open fun enableDefaultInternetAccess(): Any? =
      unwrap(this).getEnableDefaultInternetAccess()

  /**
   * Enables or disables default internet access for the image builder.
   */
  public open fun enableDefaultInternetAccess(`value`: Boolean) {
    unwrap(this).setEnableDefaultInternetAccess(`value`)
  }

  /**
   * Enables or disables default internet access for the image builder.
   */
  public open fun enableDefaultInternetAccess(`value`: IResolvable) {
    unwrap(this).setEnableDefaultInternetAccess(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ARN of the IAM role that is applied to the image builder.
   */
  public open fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  /**
   * The ARN of the IAM role that is applied to the image builder.
   */
  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  /**
   * The ARN of the public, private, or shared image to use.
   */
  public open fun imageArn(): String? = unwrap(this).getImageArn()

  /**
   * The ARN of the public, private, or shared image to use.
   */
  public open fun imageArn(`value`: String) {
    unwrap(this).setImageArn(`value`)
  }

  /**
   * The name of the image used to create the image builder.
   */
  public open fun imageName(): String? = unwrap(this).getImageName()

  /**
   * The name of the image used to create the image builder.
   */
  public open fun imageName(`value`: String) {
    unwrap(this).setImageName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The instance type to use when launching the image builder.
   *
   * The following instance types are available:.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The instance type to use when launching the image builder.
   *
   * The following instance types are available:.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * A unique name for the image builder.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A unique name for the image builder.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The VPC configuration for the image builder.
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * The VPC configuration for the image builder.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The VPC configuration for the image builder.
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty.Companion::unwrap))
  }

  /**
   * The VPC configuration for the image builder.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f759e25573b6eac7914e20e5e521ef864be481f1d6f689fd7246298ef1cc760c")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnImageBuilder].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Administrators can connect to the image builder only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    public fun accessEndpoints(accessEndpoints: IResolvable)

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Administrators can connect to the image builder only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    public fun accessEndpoints(accessEndpoints: List<Any>)

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Administrators can connect to the image builder only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    public fun accessEndpoints(vararg accessEndpoints: Any)

    /**
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest
     * version of the AppStream 2.0 agent, specify [LATEST].
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion)
     * @param appstreamAgentVersion The version of the AppStream 2.0 agent to use for this image
     * builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
     */
    public fun appstreamAgentVersion(appstreamAgentVersion: String)

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description)
     * @param description The description to display. 
     */
    public fun description(description: String)

    /**
     * The image builder name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname)
     * @param displayName The image builder name to display. 
     */
    public fun displayName(displayName: String)

    /**
     * The name of the directory and organizational unit (OU) to use to join the image builder to a
     * Microsoft Active Directory domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain. 
     */
    public fun domainJoinInfo(domainJoinInfo: IResolvable)

    /**
     * The name of the directory and organizational unit (OU) to use to join the image builder to a
     * Microsoft Active Directory domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain. 
     */
    public fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty)

    /**
     * The name of the directory and organizational unit (OU) to use to join the image builder to a
     * Microsoft Active Directory domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("892d21893f8c8149e1f2dca8b0912cf523bbfd26d9a9398ea22035f82b3dfb53")
    public fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty.Builder.() -> Unit)

    /**
     * Enables or disables default internet access for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Enables or disables default internet access for the image
     * builder. 
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    /**
     * Enables or disables default internet access for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Enables or disables default internet access for the image
     * builder. 
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

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
     * @param iamRoleArn The ARN of the IAM role that is applied to the image builder. 
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * The ARN of the public, private, or shared image to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn)
     * @param imageArn The ARN of the public, private, or shared image to use. 
     */
    public fun imageArn(imageArn: String)

    /**
     * The name of the image used to create the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename)
     * @param imageName The name of the image used to create the image builder. 
     */
    public fun imageName(imageName: String)

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
     * @param instanceType The instance type to use when launching the image builder. The following
     * instance types are available:. 
     */
    public fun instanceType(instanceType: String)

    /**
     * A unique name for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name)
     * @param name A unique name for the image builder. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The VPC configuration for the image builder.
     *
     * You can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the image builder. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * The VPC configuration for the image builder.
     *
     * You can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the image builder. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * The VPC configuration for the image builder.
     *
     * You can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the image builder. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eaa48dba7fd3c1831dd408ef33113cddb0e123a7059af0a186c78dd5bc1531a")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnImageBuilder.Builder =
        software.amazon.awscdk.services.appstream.CfnImageBuilder.Builder.create(scope, id)

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Administrators can connect to the image builder only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable.Companion::unwrap))
    }

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Administrators can connect to the image builder only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Administrators can connect to the image builder only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    /**
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest
     * version of the AppStream 2.0 agent, specify [LATEST].
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion)
     * @param appstreamAgentVersion The version of the AppStream 2.0 agent to use for this image
     * builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
     */
    override fun appstreamAgentVersion(appstreamAgentVersion: String) {
      cdkBuilder.appstreamAgentVersion(appstreamAgentVersion)
    }

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description)
     * @param description The description to display. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The image builder name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname)
     * @param displayName The image builder name to display. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the image builder to a
     * Microsoft Active Directory domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain. 
     */
    override fun domainJoinInfo(domainJoinInfo: IResolvable) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the image builder to a
     * Microsoft Active Directory domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain. 
     */
    override fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(DomainJoinInfoProperty.Companion::unwrap))
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the image builder to a
     * Microsoft Active Directory domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the image builder to a Microsoft Active Directory domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("892d21893f8c8149e1f2dca8b0912cf523bbfd26d9a9398ea22035f82b3dfb53")
    override fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty.Builder.() -> Unit): Unit =
        domainJoinInfo(DomainJoinInfoProperty(domainJoinInfo))

    /**
     * Enables or disables default internet access for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Enables or disables default internet access for the image
     * builder. 
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * Enables or disables default internet access for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Enables or disables default internet access for the image
     * builder. 
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable.Companion::unwrap))
    }

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
     * @param iamRoleArn The ARN of the IAM role that is applied to the image builder. 
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * The ARN of the public, private, or shared image to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn)
     * @param imageArn The ARN of the public, private, or shared image to use. 
     */
    override fun imageArn(imageArn: String) {
      cdkBuilder.imageArn(imageArn)
    }

    /**
     * The name of the image used to create the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename)
     * @param imageName The name of the image used to create the image builder. 
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

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
     * @param instanceType The instance type to use when launching the image builder. The following
     * instance types are available:. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * A unique name for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name)
     * @param name A unique name for the image builder. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The VPC configuration for the image builder.
     *
     * You can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the image builder. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The VPC configuration for the image builder.
     *
     * You can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the image builder. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty.Companion::unwrap))
    }

    /**
     * The VPC configuration for the image builder.
     *
     * You can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the image builder. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eaa48dba7fd3c1831dd408ef33113cddb0e123a7059af0a186c78dd5bc1531a")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnImageBuilder =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnImageBuilder.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImageBuilder {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImageBuilder(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder):
        CfnImageBuilder = CfnImageBuilder(cdkObject)

    internal fun unwrap(wrapped: CfnImageBuilder):
        software.amazon.awscdk.services.appstream.CfnImageBuilder = wrapped.cdkObject as
        software.amazon.awscdk.services.appstream.CfnImageBuilder
  }

  /**
   * Describes an interface VPC endpoint (interface endpoint) that lets you create a private
   * connection between the virtual private cloud (VPC) that you specify and AppStream 2.0. When you
   * specify an interface endpoint for a stack, users of the stack can connect to AppStream 2.0 only
   * through that endpoint. When you specify an interface endpoint for an image builder, administrators
   * can connect to the image builder only through that endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * AccessEndpointProperty accessEndpointProperty = AccessEndpointProperty.builder()
   * .endpointType("endpointType")
   * .vpceId("vpceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-accessendpoint.html)
   */
  public interface AccessEndpointProperty {
    /**
     * The type of interface endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-accessendpoint.html#cfn-appstream-imagebuilder-accessendpoint-endpointtype)
     */
    public fun endpointType(): String

    /**
     * The identifier (ID) of the VPC in which the interface endpoint is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-accessendpoint.html#cfn-appstream-imagebuilder-accessendpoint-vpceid)
     */
    public fun vpceId(): String

    /**
     * A builder for [AccessEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointType The type of interface endpoint. 
       */
      public fun endpointType(endpointType: String)

      /**
       * @param vpceId The identifier (ID) of the VPC in which the interface endpoint is used. 
       */
      public fun vpceId(vpceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty.builder()

      /**
       * @param endpointType The type of interface endpoint. 
       */
      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      /**
       * @param vpceId The identifier (ID) of the VPC in which the interface endpoint is used. 
       */
      override fun vpceId(vpceId: String) {
        cdkBuilder.vpceId(vpceId)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty,
    ) : CdkObject(cdkObject), AccessEndpointProperty {
      /**
       * The type of interface endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-accessendpoint.html#cfn-appstream-imagebuilder-accessendpoint-endpointtype)
       */
      override fun endpointType(): String = unwrap(this).getEndpointType()

      /**
       * The identifier (ID) of the VPC in which the interface endpoint is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-accessendpoint.html#cfn-appstream-imagebuilder-accessendpoint-vpceid)
       */
      override fun vpceId(): String = unwrap(this).getVpceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty):
          AccessEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessEndpointProperty):
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty
    }
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the image builder to a
   * Microsoft Active Directory domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * DomainJoinInfoProperty domainJoinInfoProperty = DomainJoinInfoProperty.builder()
   * .directoryName("directoryName")
   * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html)
   */
  public interface DomainJoinInfoProperty {
    /**
     * The fully qualified name of the directory (for example, corp.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html#cfn-appstream-imagebuilder-domainjoininfo-directoryname)
     */
    public fun directoryName(): String? = unwrap(this).getDirectoryName()

    /**
     * The distinguished name of the organizational unit for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html#cfn-appstream-imagebuilder-domainjoininfo-organizationalunitdistinguishedname)
     */
    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    /**
     * A builder for [DomainJoinInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param directoryName The fully qualified name of the directory (for example,
       * corp.example.com).
       */
      public fun directoryName(directoryName: String)

      /**
       * @param organizationalUnitDistinguishedName The distinguished name of the organizational
       * unit for computer accounts.
       */
      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.builder()

      /**
       * @param directoryName The fully qualified name of the directory (for example,
       * corp.example.com).
       */
      override fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
      }

      /**
       * @param organizationalUnitDistinguishedName The distinguished name of the organizational
       * unit for computer accounts.
       */
      override
          fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty,
    ) : CdkObject(cdkObject), DomainJoinInfoProperty {
      /**
       * The fully qualified name of the directory (for example, corp.example.com).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html#cfn-appstream-imagebuilder-domainjoininfo-directoryname)
       */
      override fun directoryName(): String? = unwrap(this).getDirectoryName()

      /**
       * The distinguished name of the organizational unit for computer accounts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html#cfn-appstream-imagebuilder-domainjoininfo-organizationalunitdistinguishedname)
       */
      override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainJoinInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty):
          DomainJoinInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? DomainJoinInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainJoinInfoProperty):
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty
    }
  }

  /**
   * The VPC configuration for the image builder.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * The identifiers of the security groups for the image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html#cfn-appstream-imagebuilder-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The identifier of the subnet to which a network interface is attached from the image builder
     * instance.
     *
     * An image builder instance can use one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html#cfn-appstream-imagebuilder-vpcconfig-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The identifiers of the security groups for the image builder.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The identifiers of the security groups for the image builder.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The identifier of the subnet to which a network interface is attached from
       * the image builder instance.
       * An image builder instance can use one subnet.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The identifier of the subnet to which a network interface is attached from
       * the image builder instance.
       * An image builder instance can use one subnet.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The identifiers of the security groups for the image builder.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The identifiers of the security groups for the image builder.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The identifier of the subnet to which a network interface is attached from
       * the image builder instance.
       * An image builder instance can use one subnet.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The identifier of the subnet to which a network interface is attached from
       * the image builder instance.
       * An image builder instance can use one subnet.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * The identifiers of the security groups for the image builder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html#cfn-appstream-imagebuilder-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The identifier of the subnet to which a network interface is attached from the image
       * builder instance.
       *
       * An image builder instance can use one subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html#cfn-appstream-imagebuilder-vpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty
    }
  }
}
