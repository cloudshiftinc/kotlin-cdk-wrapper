@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.emr.CfnStudio
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.emr.*;
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
 * .idpAuthUrl("idpAuthUrl")
 * .idpRelayStateParameterName("idpRelayStateParameterName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userRole("userRole")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html)
 */
@CdkDslMarker
public class CfnStudioDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStudio.Builder = CfnStudio.Builder.create(scope, id)

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies whether the Studio authenticates users using IAM Identity Center or IAM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-authmode)
   * @param authMode Specifies whether the Studio authenticates users using IAM Identity Center or
   * IAM. 
   */
  public fun authMode(authMode: String) {
    cdkBuilder.authMode(authMode)
  }

  /**
   * The Amazon S3 location to back up EMR Studio Workspaces and notebook files.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-defaults3location)
   * @param defaultS3Location The Amazon S3 location to back up EMR Studio Workspaces and notebook
   * files. 
   */
  public fun defaultS3Location(defaultS3Location: String) {
    cdkBuilder.defaultS3Location(defaultS3Location)
  }

  /**
   * A detailed description of the Amazon EMR Studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-description)
   * @param description A detailed description of the Amazon EMR Studio. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ID of the Amazon EMR Studio Engine security group.
   *
   * The Engine security group allows inbound network traffic from the Workspace security group, and
   * it must be in the same VPC specified by `VpcId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-enginesecuritygroupid)
   * @param engineSecurityGroupId The ID of the Amazon EMR Studio Engine security group. 
   */
  public fun engineSecurityGroupId(engineSecurityGroupId: String) {
    cdkBuilder.engineSecurityGroupId(engineSecurityGroupId)
  }

  /**
   * Your identity provider's authentication endpoint.
   *
   * Amazon EMR Studio redirects federated users to this endpoint for authentication when logging in
   * to a Studio with the Studio URL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idpauthurl)
   * @param idpAuthUrl Your identity provider's authentication endpoint. 
   */
  public fun idpAuthUrl(idpAuthUrl: String) {
    cdkBuilder.idpAuthUrl(idpAuthUrl)
  }

  /**
   * The name of your identity provider's `RelayState` parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-idprelaystateparametername)
   * @param idpRelayStateParameterName The name of your identity provider's `RelayState` parameter. 
   */
  public fun idpRelayStateParameterName(idpRelayStateParameterName: String) {
    cdkBuilder.idpRelayStateParameterName(idpRelayStateParameterName)
  }

  /**
   * A descriptive name for the Amazon EMR Studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-name)
   * @param name A descriptive name for the Amazon EMR Studio. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role that will be assumed by the Amazon EMR Studio.
   *
   * The service role provides a way for Amazon EMR Studio to interoperate with other AWS services.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-servicerole)
   * @param serviceRole The Amazon Resource Name (ARN) of the IAM role that will be assumed by the
   * Amazon EMR Studio. 
   */
  public fun serviceRole(serviceRole: String) {
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
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
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
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
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
  public fun userRole(userRole: String) {
    cdkBuilder.userRole(userRole)
  }

  /**
   * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html#cfn-emr-studio-vpcid)
   * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the
   * Studio. 
   */
  public fun vpcId(vpcId: String) {
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
  public fun workspaceSecurityGroupId(workspaceSecurityGroupId: String) {
    cdkBuilder.workspaceSecurityGroupId(workspaceSecurityGroupId)
  }

  public fun build(): CfnStudio {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
