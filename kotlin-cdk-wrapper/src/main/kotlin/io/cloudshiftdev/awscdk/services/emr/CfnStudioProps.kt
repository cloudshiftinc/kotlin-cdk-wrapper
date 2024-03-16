@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

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
 * Properties for defining a `CfnStudio`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * CfnStudioProps cfnStudioProps = CfnStudioProps.builder()
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
public interface CfnStudioProps {
  /**
   * Specifies whether the Studio authenticates users using IAM Identity Center or IAM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-authmode)
   */
  public fun authMode(): String

  /**
   * The Amazon S3 location to back up EMR Studio Workspaces and notebook files.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-defaults3location)
   */
  public fun defaultS3Location(): String

  /**
   * A detailed description of the Amazon EMR Studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio workspace and notebook files
   * when backed up to Amazon S3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-encryptionkeyarn)
   */
  public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  /**
   * The ID of the Amazon EMR Studio Engine security group.
   *
   * The Engine security group allows inbound network traffic from the Workspace security group, and
   * it must be in the same VPC specified by `VpcId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-enginesecuritygroupid)
   */
  public fun engineSecurityGroupId(): String

  /**
   * The ARN of the IAM Identity Center instance the Studio application belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idcinstancearn)
   */
  public fun idcInstanceArn(): String? = unwrap(this).getIdcInstanceArn()

  /**
   * Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM Identity Center user assignment.
   *
   * If the value is set to `REQUIRED` , users must be explicitly assigned to the Studio application
   * to access the Studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idcuserassignment)
   */
  public fun idcUserAssignment(): String? = unwrap(this).getIdcUserAssignment()

  /**
   * Your identity provider's authentication endpoint.
   *
   * Amazon EMR Studio redirects federated users to this endpoint for authentication when logging in
   * to a Studio with the Studio URL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idpauthurl)
   */
  public fun idpAuthUrl(): String? = unwrap(this).getIdpAuthUrl()

  /**
   * The name of your identity provider's `RelayState` parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idprelaystateparametername)
   */
  public fun idpRelayStateParameterName(): String? = unwrap(this).getIdpRelayStateParameterName()

  /**
   * A descriptive name for the Amazon EMR Studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role that will be assumed by the Amazon EMR Studio.
   *
   * The service role provides a way for Amazon EMR Studio to interoperate with other AWS services.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-servicerole)
   */
  public fun serviceRole(): String

  /**
   * A list of subnet IDs to associate with the Amazon EMR Studio.
   *
   * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
   * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Indicates whether the Studio has Trusted identity propagation enabled.
   *
   * The default value is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-trustedidentitypropagationenabled)
   */
  public fun trustedIdentityPropagationEnabled(): Any? =
      unwrap(this).getTrustedIdentityPropagationEnabled()

  /**
   * The Amazon Resource Name (ARN) of the IAM user role that will be assumed by users and groups
   * logged in to a Studio.
   *
   * The permissions attached to this IAM role can be scoped down for each user or group using
   * session policies. You only need to specify `UserRole` when you set `AuthMode` to `SSO` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-userrole)
   */
  public fun userRole(): String? = unwrap(this).getUserRole()

  /**
   * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-vpcid)
   */
  public fun vpcId(): String

  /**
   * The ID of the Workspace security group associated with the Amazon EMR Studio.
   *
   * The Workspace security group allows outbound network traffic to resources in the Engine
   * security group and to the internet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-workspacesecuritygroupid)
   */
  public fun workspaceSecurityGroupId(): String

  /**
   * A builder for [CfnStudioProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authMode Specifies whether the Studio authenticates users using IAM Identity Center or
     * IAM. 
     */
    public fun authMode(authMode: String)

    /**
     * @param defaultS3Location The Amazon S3 location to back up EMR Studio Workspaces and notebook
     * files. 
     */
    public fun defaultS3Location(defaultS3Location: String)

    /**
     * @param description A detailed description of the Amazon EMR Studio.
     */
    public fun description(description: String)

    /**
     * @param encryptionKeyArn The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio
     * workspace and notebook files when backed up to Amazon S3.
     */
    public fun encryptionKeyArn(encryptionKeyArn: String)

    /**
     * @param engineSecurityGroupId The ID of the Amazon EMR Studio Engine security group. 
     * The Engine security group allows inbound network traffic from the Workspace security group,
     * and it must be in the same VPC specified by `VpcId` .
     */
    public fun engineSecurityGroupId(engineSecurityGroupId: String)

    /**
     * @param idcInstanceArn The ARN of the IAM Identity Center instance the Studio application
     * belongs to.
     */
    public fun idcInstanceArn(idcInstanceArn: String)

    /**
     * @param idcUserAssignment Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM
     * Identity Center user assignment.
     * If the value is set to `REQUIRED` , users must be explicitly assigned to the Studio
     * application to access the Studio.
     */
    public fun idcUserAssignment(idcUserAssignment: String)

    /**
     * @param idpAuthUrl Your identity provider's authentication endpoint.
     * Amazon EMR Studio redirects federated users to this endpoint for authentication when logging
     * in to a Studio with the Studio URL.
     */
    public fun idpAuthUrl(idpAuthUrl: String)

    /**
     * @param idpRelayStateParameterName The name of your identity provider's `RelayState`
     * parameter.
     */
    public fun idpRelayStateParameterName(idpRelayStateParameterName: String)

    /**
     * @param name A descriptive name for the Amazon EMR Studio. 
     */
    public fun name(name: String)

    /**
     * @param serviceRole The Amazon Resource Name (ARN) of the IAM role that will be assumed by the
     * Amazon EMR Studio. 
     * The service role provides a way for Amazon EMR Studio to interoperate with other AWS
     * services.
     */
    public fun serviceRole(serviceRole: String)

    /**
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. 
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. 
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     * propagation enabled.
     * The default value is `false` .
     */
    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: Boolean)

    /**
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     * propagation enabled.
     * The default value is `false` .
     */
    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: IResolvable)

    /**
     * @param userRole The Amazon Resource Name (ARN) of the IAM user role that will be assumed by
     * users and groups logged in to a Studio.
     * The permissions attached to this IAM role can be scoped down for each user or group using
     * session policies. You only need to specify `UserRole` when you set `AuthMode` to `SSO` .
     */
    public fun userRole(userRole: String)

    /**
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the
     * Studio. 
     */
    public fun vpcId(vpcId: String)

    /**
     * @param workspaceSecurityGroupId The ID of the Workspace security group associated with the
     * Amazon EMR Studio. 
     * The Workspace security group allows outbound network traffic to resources in the Engine
     * security group and to the internet.
     */
    public fun workspaceSecurityGroupId(workspaceSecurityGroupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStudioProps.Builder =
        software.amazon.awscdk.services.emr.CfnStudioProps.builder()

    /**
     * @param authMode Specifies whether the Studio authenticates users using IAM Identity Center or
     * IAM. 
     */
    override fun authMode(authMode: String) {
      cdkBuilder.authMode(authMode)
    }

    /**
     * @param defaultS3Location The Amazon S3 location to back up EMR Studio Workspaces and notebook
     * files. 
     */
    override fun defaultS3Location(defaultS3Location: String) {
      cdkBuilder.defaultS3Location(defaultS3Location)
    }

    /**
     * @param description A detailed description of the Amazon EMR Studio.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param encryptionKeyArn The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio
     * workspace and notebook files when backed up to Amazon S3.
     */
    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * @param engineSecurityGroupId The ID of the Amazon EMR Studio Engine security group. 
     * The Engine security group allows inbound network traffic from the Workspace security group,
     * and it must be in the same VPC specified by `VpcId` .
     */
    override fun engineSecurityGroupId(engineSecurityGroupId: String) {
      cdkBuilder.engineSecurityGroupId(engineSecurityGroupId)
    }

    /**
     * @param idcInstanceArn The ARN of the IAM Identity Center instance the Studio application
     * belongs to.
     */
    override fun idcInstanceArn(idcInstanceArn: String) {
      cdkBuilder.idcInstanceArn(idcInstanceArn)
    }

    /**
     * @param idcUserAssignment Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM
     * Identity Center user assignment.
     * If the value is set to `REQUIRED` , users must be explicitly assigned to the Studio
     * application to access the Studio.
     */
    override fun idcUserAssignment(idcUserAssignment: String) {
      cdkBuilder.idcUserAssignment(idcUserAssignment)
    }

    /**
     * @param idpAuthUrl Your identity provider's authentication endpoint.
     * Amazon EMR Studio redirects federated users to this endpoint for authentication when logging
     * in to a Studio with the Studio URL.
     */
    override fun idpAuthUrl(idpAuthUrl: String) {
      cdkBuilder.idpAuthUrl(idpAuthUrl)
    }

    /**
     * @param idpRelayStateParameterName The name of your identity provider's `RelayState`
     * parameter.
     */
    override fun idpRelayStateParameterName(idpRelayStateParameterName: String) {
      cdkBuilder.idpRelayStateParameterName(idpRelayStateParameterName)
    }

    /**
     * @param name A descriptive name for the Amazon EMR Studio. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serviceRole The Amazon Resource Name (ARN) of the IAM role that will be assumed by the
     * Amazon EMR Studio. 
     * The service role provides a way for Amazon EMR Studio to interoperate with other AWS
     * services.
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. 
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. 
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     * propagation enabled.
     * The default value is `false` .
     */
    override fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: Boolean) {
      cdkBuilder.trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled)
    }

    /**
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     * propagation enabled.
     * The default value is `false` .
     */
    override fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: IResolvable) {
      cdkBuilder.trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param userRole The Amazon Resource Name (ARN) of the IAM user role that will be assumed by
     * users and groups logged in to a Studio.
     * The permissions attached to this IAM role can be scoped down for each user or group using
     * session policies. You only need to specify `UserRole` when you set `AuthMode` to `SSO` .
     */
    override fun userRole(userRole: String) {
      cdkBuilder.userRole(userRole)
    }

    /**
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the
     * Studio. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param workspaceSecurityGroupId The ID of the Workspace security group associated with the
     * Amazon EMR Studio. 
     * The Workspace security group allows outbound network traffic to resources in the Engine
     * security group and to the internet.
     */
    override fun workspaceSecurityGroupId(workspaceSecurityGroupId: String) {
      cdkBuilder.workspaceSecurityGroupId(workspaceSecurityGroupId)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStudioProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnStudioProps,
  ) : CdkObject(cdkObject), CfnStudioProps {
    /**
     * Specifies whether the Studio authenticates users using IAM Identity Center or IAM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-authmode)
     */
    override fun authMode(): String = unwrap(this).getAuthMode()

    /**
     * The Amazon S3 location to back up EMR Studio Workspaces and notebook files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-defaults3location)
     */
    override fun defaultS3Location(): String = unwrap(this).getDefaultS3Location()

    /**
     * A detailed description of the Amazon EMR Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio workspace and notebook
     * files when backed up to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-encryptionkeyarn)
     */
    override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    /**
     * The ID of the Amazon EMR Studio Engine security group.
     *
     * The Engine security group allows inbound network traffic from the Workspace security group,
     * and it must be in the same VPC specified by `VpcId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-enginesecuritygroupid)
     */
    override fun engineSecurityGroupId(): String = unwrap(this).getEngineSecurityGroupId()

    /**
     * The ARN of the IAM Identity Center instance the Studio application belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idcinstancearn)
     */
    override fun idcInstanceArn(): String? = unwrap(this).getIdcInstanceArn()

    /**
     * Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM Identity Center user
     * assignment.
     *
     * If the value is set to `REQUIRED` , users must be explicitly assigned to the Studio
     * application to access the Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idcuserassignment)
     */
    override fun idcUserAssignment(): String? = unwrap(this).getIdcUserAssignment()

    /**
     * Your identity provider's authentication endpoint.
     *
     * Amazon EMR Studio redirects federated users to this endpoint for authentication when logging
     * in to a Studio with the Studio URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idpauthurl)
     */
    override fun idpAuthUrl(): String? = unwrap(this).getIdpAuthUrl()

    /**
     * The name of your identity provider's `RelayState` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idprelaystateparametername)
     */
    override fun idpRelayStateParameterName(): String? =
        unwrap(this).getIdpRelayStateParameterName()

    /**
     * A descriptive name for the Amazon EMR Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that will be assumed by the Amazon EMR Studio.
     *
     * The service role provides a way for Amazon EMR Studio to interoperate with other AWS
     * services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-servicerole)
     */
    override fun serviceRole(): String = unwrap(this).getServiceRole()

    /**
     * A list of subnet IDs to associate with the Amazon EMR Studio.
     *
     * A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by
     * `VpcId` . Studio users can create a Workspace in any of the specified subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Indicates whether the Studio has Trusted identity propagation enabled.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-trustedidentitypropagationenabled)
     */
    override fun trustedIdentityPropagationEnabled(): Any? =
        unwrap(this).getTrustedIdentityPropagationEnabled()

    /**
     * The Amazon Resource Name (ARN) of the IAM user role that will be assumed by users and groups
     * logged in to a Studio.
     *
     * The permissions attached to this IAM role can be scoped down for each user or group using
     * session policies. You only need to specify `UserRole` when you set `AuthMode` to `SSO` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-userrole)
     */
    override fun userRole(): String? = unwrap(this).getUserRole()

    /**
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()

    /**
     * The ID of the Workspace security group associated with the Amazon EMR Studio.
     *
     * The Workspace security group allows outbound network traffic to resources in the Engine
     * security group and to the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-workspacesecuritygroupid)
     */
    override fun workspaceSecurityGroupId(): String = unwrap(this).getWorkspaceSecurityGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStudioProps): CfnStudioProps
        = CdkObjectWrappers.wrap(cdkObject) as CfnStudioProps

    internal fun unwrap(wrapped: CfnStudioProps): software.amazon.awscdk.services.emr.CfnStudioProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnStudioProps
  }
}
