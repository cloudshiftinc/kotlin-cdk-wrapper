@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::EMR::Studio` resource specifies an Amazon EMR Studio.
 *
 * An EMR Studio is a web-based, integrated development environment for fully managed Jupyter
 * notebooks that run on Amazon EMR clusters. For more information, see the [*Amazon EMR Management
 * Guide*](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * CfnStudio cfnStudio = CfnStudio.Builder.create(this, "MyCfnStudio")
 * .authMode("authMode")
 * .defaultS3Location("defaultS3Location")
 * .engineSecurityGroupId("engineSecurityGroupId")
 * .name("name")
 * .serviceRole("serviceRole")
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .workspaceSecurityGroupId("workspaceSecurityGroupId")
 * // the properties below are optional
 * .description("description")
 * .encryptionKeyArn("encryptionKeyArn")
 * .idcInstanceArn("idcInstanceArn")
 * .idcUserAssignment("idcUserAssignment")
 * .idpAuthUrl("idpAuthUrl")
 * .idpRelayStateParameterName("idpRelayStateParameterName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trustedIdentityPropagationEnabled(false)
 * .userRole("userRole")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html)
 */
public open class CfnStudio(
  cdkObject: software.amazon.awscdk.services.emr.CfnStudio,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStudioProps,
  ) :
      this(software.amazon.awscdk.services.emr.CfnStudio(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStudioProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStudioProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStudioProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the Amazon EMR Studio.
   *
   * For example:
   * `arn:aws:elasticmapreduce:us-east-1:653XXXXXXXXX:studio/es-EXAMPLE12345678XXXXXXXXXXX` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the Amazon EMR Studio.
   *
   * For example: `es-EXAMPLE12345678XXXXXXXXXXX` .
   */
  public open fun attrStudioId(): String = unwrap(this).getAttrStudioId()

  /**
   * The unique access URL of the Amazon EMR Studio.
   *
   * For example: `https://es-EXAMPLE12345678XXXXXXXXXXX.emrstudio-prod.us-east-1.amazonaws.com` .
   */
  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  /**
   * Specifies whether the Studio authenticates users using IAM Identity Center or IAM.
   */
  public open fun authMode(): String = unwrap(this).getAuthMode()

  /**
   * Specifies whether the Studio authenticates users using IAM Identity Center or IAM.
   */
  public open fun authMode(`value`: String) {
    unwrap(this).setAuthMode(`value`)
  }

  /**
   * The Amazon S3 location to back up EMR Studio Workspaces and notebook files.
   */
  public open fun defaultS3Location(): String = unwrap(this).getDefaultS3Location()

  /**
   * The Amazon S3 location to back up EMR Studio Workspaces and notebook files.
   */
  public open fun defaultS3Location(`value`: String) {
    unwrap(this).setDefaultS3Location(`value`)
  }

  /**
   * A detailed description of the Amazon EMR Studio.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A detailed description of the Amazon EMR Studio.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio workspace and notebook files
   * when backed up to Amazon S3.
   */
  public open fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  /**
   * The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio workspace and notebook files
   * when backed up to Amazon S3.
   */
  public open fun encryptionKeyArn(`value`: String) {
    unwrap(this).setEncryptionKeyArn(`value`)
  }

  /**
   * The ID of the Amazon EMR Studio Engine security group.
   */
  public open fun engineSecurityGroupId(): String = unwrap(this).getEngineSecurityGroupId()

  /**
   * The ID of the Amazon EMR Studio Engine security group.
   */
  public open fun engineSecurityGroupId(`value`: String) {
    unwrap(this).setEngineSecurityGroupId(`value`)
  }

  /**
   * The ARN of the IAM Identity Center instance the Studio application belongs to.
   */
  public open fun idcInstanceArn(): String? = unwrap(this).getIdcInstanceArn()

  /**
   * The ARN of the IAM Identity Center instance the Studio application belongs to.
   */
  public open fun idcInstanceArn(`value`: String) {
    unwrap(this).setIdcInstanceArn(`value`)
  }

  /**
   * Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM Identity Center user assignment.
   */
  public open fun idcUserAssignment(): String? = unwrap(this).getIdcUserAssignment()

  /**
   * Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM Identity Center user assignment.
   */
  public open fun idcUserAssignment(`value`: String) {
    unwrap(this).setIdcUserAssignment(`value`)
  }

  /**
   * Your identity provider's authentication endpoint.
   */
  public open fun idpAuthUrl(): String? = unwrap(this).getIdpAuthUrl()

  /**
   * Your identity provider's authentication endpoint.
   */
  public open fun idpAuthUrl(`value`: String) {
    unwrap(this).setIdpAuthUrl(`value`)
  }

  /**
   * The name of your identity provider's `RelayState` parameter.
   */
  public open fun idpRelayStateParameterName(): String? =
      unwrap(this).getIdpRelayStateParameterName()

  /**
   * The name of your identity provider's `RelayState` parameter.
   */
  public open fun idpRelayStateParameterName(`value`: String) {
    unwrap(this).setIdpRelayStateParameterName(`value`)
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
   * A descriptive name for the Amazon EMR Studio.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A descriptive name for the Amazon EMR Studio.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role that will be assumed by the Amazon EMR Studio.
   */
  public open fun serviceRole(): String = unwrap(this).getServiceRole()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that will be assumed by the Amazon EMR Studio.
   */
  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  /**
   * A list of subnet IDs to associate with the Amazon EMR Studio.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * A list of subnet IDs to associate with the Amazon EMR Studio.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * A list of subnet IDs to associate with the Amazon EMR Studio.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Indicates whether the Studio has Trusted identity propagation enabled.
   */
  public open fun trustedIdentityPropagationEnabled(): Any? =
      unwrap(this).getTrustedIdentityPropagationEnabled()

  /**
   * Indicates whether the Studio has Trusted identity propagation enabled.
   */
  public open fun trustedIdentityPropagationEnabled(`value`: Boolean) {
    unwrap(this).setTrustedIdentityPropagationEnabled(`value`)
  }

  /**
   * Indicates whether the Studio has Trusted identity propagation enabled.
   */
  public open fun trustedIdentityPropagationEnabled(`value`: IResolvable) {
    unwrap(this).setTrustedIdentityPropagationEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM user role that will be assumed by users and groups
   * logged in to a Studio.
   */
  public open fun userRole(): String? = unwrap(this).getUserRole()

  /**
   * The Amazon Resource Name (ARN) of the IAM user role that will be assumed by users and groups
   * logged in to a Studio.
   */
  public open fun userRole(`value`: String) {
    unwrap(this).setUserRole(`value`)
  }

  /**
   * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * The ID of the Workspace security group associated with the Amazon EMR Studio.
   */
  public open fun workspaceSecurityGroupId(): String = unwrap(this).getWorkspaceSecurityGroupId()

  /**
   * The ID of the Workspace security group associated with the Amazon EMR Studio.
   */
  public open fun workspaceSecurityGroupId(`value`: String) {
    unwrap(this).setWorkspaceSecurityGroupId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emr.CfnStudio].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether the Studio authenticates users using IAM Identity Center or IAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-authmode)
     * @param authMode Specifies whether the Studio authenticates users using IAM Identity Center or
     * IAM. 
     */
    public fun authMode(authMode: String)

    /**
     * The Amazon S3 location to back up EMR Studio Workspaces and notebook files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-defaults3location)
     * @param defaultS3Location The Amazon S3 location to back up EMR Studio Workspaces and notebook
     * files. 
     */
    public fun defaultS3Location(defaultS3Location: String)

    /**
     * A detailed description of the Amazon EMR Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-description)
     * @param description A detailed description of the Amazon EMR Studio. 
     */
    public fun description(description: String)

    /**
     * The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio workspace and notebook
     * files when backed up to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-encryptionkeyarn)
     * @param encryptionKeyArn The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio
     * workspace and notebook files when backed up to Amazon S3. 
     */
    public fun encryptionKeyArn(encryptionKeyArn: String)

    /**
     * The ID of the Amazon EMR Studio Engine security group.
     *
     * The Engine security group allows inbound network traffic from the Workspace security group,
     * and it must be in the same VPC specified by `VpcId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-enginesecuritygroupid)
     * @param engineSecurityGroupId The ID of the Amazon EMR Studio Engine security group. 
     */
    public fun engineSecurityGroupId(engineSecurityGroupId: String)

    /**
     * The ARN of the IAM Identity Center instance the Studio application belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idcinstancearn)
     * @param idcInstanceArn The ARN of the IAM Identity Center instance the Studio application
     * belongs to. 
     */
    public fun idcInstanceArn(idcInstanceArn: String)

    /**
     * Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM Identity Center user
     * assignment.
     *
     * If the value is set to `REQUIRED` , users must be explicitly assigned to the Studio
     * application to access the Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idcuserassignment)
     * @param idcUserAssignment Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM
     * Identity Center user assignment. 
     */
    public fun idcUserAssignment(idcUserAssignment: String)

    /**
     * Your identity provider's authentication endpoint.
     *
     * Amazon EMR Studio redirects federated users to this endpoint for authentication when logging
     * in to a Studio with the Studio URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idpauthurl)
     * @param idpAuthUrl Your identity provider's authentication endpoint. 
     */
    public fun idpAuthUrl(idpAuthUrl: String)

    /**
     * The name of your identity provider's `RelayState` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idprelaystateparametername)
     * @param idpRelayStateParameterName The name of your identity provider's `RelayState`
     * parameter. 
     */
    public fun idpRelayStateParameterName(idpRelayStateParameterName: String)

    /**
     * A descriptive name for the Amazon EMR Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-name)
     * @param name A descriptive name for the Amazon EMR Studio. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that will be assumed by the Amazon EMR Studio.
     *
     * The service role provides a way for Amazon EMR Studio to interoperate with other AWS
     * services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-servicerole)
     * @param serviceRole The Amazon Resource Name (ARN) of the IAM role that will be assumed by the
     * Amazon EMR Studio. 
     */
    public fun serviceRole(serviceRole: String)

    /**
     * A list of subnet IDs to associate with the Amazon EMR Studio.
     *
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-subnetids)
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * A list of subnet IDs to associate with the Amazon EMR Studio.
     *
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-subnetids)
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Indicates whether the Studio has Trusted identity propagation enabled.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-trustedidentitypropagationenabled)
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     * propagation enabled. 
     */
    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: Boolean)

    /**
     * Indicates whether the Studio has Trusted identity propagation enabled.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-trustedidentitypropagationenabled)
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     * propagation enabled. 
     */
    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the IAM user role that will be assumed by users and groups
     * logged in to a Studio.
     *
     * The permissions attached to this IAM role can be scoped down for each user or group using
     * session policies. You only need to specify `UserRole` when you set `AuthMode` to `SSO` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-userrole)
     * @param userRole The Amazon Resource Name (ARN) of the IAM user role that will be assumed by
     * users and groups logged in to a Studio. 
     */
    public fun userRole(userRole: String)

    /**
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-vpcid)
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the
     * Studio. 
     */
    public fun vpcId(vpcId: String)

    /**
     * The ID of the Workspace security group associated with the Amazon EMR Studio.
     *
     * The Workspace security group allows outbound network traffic to resources in the Engine
     * security group and to the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-workspacesecuritygroupid)
     * @param workspaceSecurityGroupId The ID of the Workspace security group associated with the
     * Amazon EMR Studio. 
     */
    public fun workspaceSecurityGroupId(workspaceSecurityGroupId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStudio.Builder =
        software.amazon.awscdk.services.emr.CfnStudio.Builder.create(scope, id)

    /**
     * Specifies whether the Studio authenticates users using IAM Identity Center or IAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-authmode)
     * @param authMode Specifies whether the Studio authenticates users using IAM Identity Center or
     * IAM. 
     */
    override fun authMode(authMode: String) {
      cdkBuilder.authMode(authMode)
    }

    /**
     * The Amazon S3 location to back up EMR Studio Workspaces and notebook files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-defaults3location)
     * @param defaultS3Location The Amazon S3 location to back up EMR Studio Workspaces and notebook
     * files. 
     */
    override fun defaultS3Location(defaultS3Location: String) {
      cdkBuilder.defaultS3Location(defaultS3Location)
    }

    /**
     * A detailed description of the Amazon EMR Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-description)
     * @param description A detailed description of the Amazon EMR Studio. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio workspace and notebook
     * files when backed up to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-encryptionkeyarn)
     * @param encryptionKeyArn The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio
     * workspace and notebook files when backed up to Amazon S3. 
     */
    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * The ID of the Amazon EMR Studio Engine security group.
     *
     * The Engine security group allows inbound network traffic from the Workspace security group,
     * and it must be in the same VPC specified by `VpcId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-enginesecuritygroupid)
     * @param engineSecurityGroupId The ID of the Amazon EMR Studio Engine security group. 
     */
    override fun engineSecurityGroupId(engineSecurityGroupId: String) {
      cdkBuilder.engineSecurityGroupId(engineSecurityGroupId)
    }

    /**
     * The ARN of the IAM Identity Center instance the Studio application belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idcinstancearn)
     * @param idcInstanceArn The ARN of the IAM Identity Center instance the Studio application
     * belongs to. 
     */
    override fun idcInstanceArn(idcInstanceArn: String) {
      cdkBuilder.idcInstanceArn(idcInstanceArn)
    }

    /**
     * Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM Identity Center user
     * assignment.
     *
     * If the value is set to `REQUIRED` , users must be explicitly assigned to the Studio
     * application to access the Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idcuserassignment)
     * @param idcUserAssignment Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM
     * Identity Center user assignment. 
     */
    override fun idcUserAssignment(idcUserAssignment: String) {
      cdkBuilder.idcUserAssignment(idcUserAssignment)
    }

    /**
     * Your identity provider's authentication endpoint.
     *
     * Amazon EMR Studio redirects federated users to this endpoint for authentication when logging
     * in to a Studio with the Studio URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idpauthurl)
     * @param idpAuthUrl Your identity provider's authentication endpoint. 
     */
    override fun idpAuthUrl(idpAuthUrl: String) {
      cdkBuilder.idpAuthUrl(idpAuthUrl)
    }

    /**
     * The name of your identity provider's `RelayState` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idprelaystateparametername)
     * @param idpRelayStateParameterName The name of your identity provider's `RelayState`
     * parameter. 
     */
    override fun idpRelayStateParameterName(idpRelayStateParameterName: String) {
      cdkBuilder.idpRelayStateParameterName(idpRelayStateParameterName)
    }

    /**
     * A descriptive name for the Amazon EMR Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-name)
     * @param name A descriptive name for the Amazon EMR Studio. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that will be assumed by the Amazon EMR Studio.
     *
     * The service role provides a way for Amazon EMR Studio to interoperate with other AWS
     * services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-servicerole)
     * @param serviceRole The Amazon Resource Name (ARN) of the IAM role that will be assumed by the
     * Amazon EMR Studio. 
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * A list of subnet IDs to associate with the Amazon EMR Studio.
     *
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-subnetids)
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * A list of subnet IDs to associate with the Amazon EMR Studio.
     *
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-subnetids)
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Indicates whether the Studio has Trusted identity propagation enabled.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-trustedidentitypropagationenabled)
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     * propagation enabled. 
     */
    override fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: Boolean) {
      cdkBuilder.trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled)
    }

    /**
     * Indicates whether the Studio has Trusted identity propagation enabled.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-trustedidentitypropagationenabled)
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     * propagation enabled. 
     */
    override fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: IResolvable) {
      cdkBuilder.trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM user role that will be assumed by users and groups
     * logged in to a Studio.
     *
     * The permissions attached to this IAM role can be scoped down for each user or group using
     * session policies. You only need to specify `UserRole` when you set `AuthMode` to `SSO` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-userrole)
     * @param userRole The Amazon Resource Name (ARN) of the IAM user role that will be assumed by
     * users and groups logged in to a Studio. 
     */
    override fun userRole(userRole: String) {
      cdkBuilder.userRole(userRole)
    }

    /**
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-vpcid)
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the
     * Studio. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    /**
     * The ID of the Workspace security group associated with the Amazon EMR Studio.
     *
     * The Workspace security group allows outbound network traffic to resources in the Engine
     * security group and to the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-workspacesecuritygroupid)
     * @param workspaceSecurityGroupId The ID of the Workspace security group associated with the
     * Amazon EMR Studio. 
     */
    override fun workspaceSecurityGroupId(workspaceSecurityGroupId: String) {
      cdkBuilder.workspaceSecurityGroupId(workspaceSecurityGroupId)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStudio = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emr.CfnStudio.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStudio {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStudio(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStudio): CfnStudio =
        CfnStudio(cdkObject)

    internal fun unwrap(wrapped: CfnStudio): software.amazon.awscdk.services.emr.CfnStudio =
        wrapped.cdkObject as software.amazon.awscdk.services.emr.CfnStudio
  }
}
