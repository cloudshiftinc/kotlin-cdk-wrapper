@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.constructs.Construct

@CdkDslMarker
public class CfnImageBuilderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnImageBuilder.Builder = CfnImageBuilder.Builder.create(scope, id)

  private val _accessEndpoints: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   *
   * Administrators can connect to the image builder only through the specified endpoints.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
   * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
   */
  public fun accessEndpoints(vararg accessEndpoints: Any) {
    _accessEndpoints.addAll(listOf(*accessEndpoints))
  }

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   *
   * Administrators can connect to the image builder only through the specified endpoints.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
   * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
   */
  public fun accessEndpoints(accessEndpoints: Collection<Any>) {
    _accessEndpoints.addAll(accessEndpoints)
  }

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   *
   * Administrators can connect to the image builder only through the specified endpoints.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints)
   * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
   */
  public fun accessEndpoints(accessEndpoints: IResolvable) {
    cdkBuilder.accessEndpoints(accessEndpoints)
  }

  /**
   * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version
   * of the AppStream 2.0 agent, specify [LATEST].
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion)
   * @param appstreamAgentVersion The version of the AppStream 2.0 agent to use for this image
   * builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
   */
  public fun appstreamAgentVersion(appstreamAgentVersion: String) {
    cdkBuilder.appstreamAgentVersion(appstreamAgentVersion)
  }

  /**
   * The description to display.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description)
   * @param description The description to display. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The image builder name to display.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname)
   * @param displayName The image builder name to display. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the image builder to a
   * Microsoft Active Directory domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
   * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join the
   * image builder to a Microsoft Active Directory domain. 
   */
  public fun domainJoinInfo(domainJoinInfo: IResolvable) {
    cdkBuilder.domainJoinInfo(domainJoinInfo)
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the image builder to a
   * Microsoft Active Directory domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-domainjoininfo)
   * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join the
   * image builder to a Microsoft Active Directory domain. 
   */
  public fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty) {
    cdkBuilder.domainJoinInfo(domainJoinInfo)
  }

  /**
   * Enables or disables default internet access for the image builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess)
   * @param enableDefaultInternetAccess Enables or disables default internet access for the image
   * builder. 
   */
  public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
    cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
  }

  /**
   * Enables or disables default internet access for the image builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess)
   * @param enableDefaultInternetAccess Enables or disables default internet access for the image
   * builder. 
   */
  public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
    cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
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
  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  /**
   * The ARN of the public, private, or shared image to use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn)
   * @param imageArn The ARN of the public, private, or shared image to use. 
   */
  public fun imageArn(imageArn: String) {
    cdkBuilder.imageArn(imageArn)
  }

  /**
   * The name of the image used to create the image builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename)
   * @param imageName The name of the image used to create the image builder. 
   */
  public fun imageName(imageName: String) {
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
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * A unique name for the image builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name)
   * @param name A unique name for the image builder. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * An array of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags)
   * @param tags An array of key-value pairs. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags)
   * @param tags An array of key-value pairs. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The VPC configuration for the image builder.
   *
   * You can specify only one subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
   * @param vpcConfig The VPC configuration for the image builder. 
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * The VPC configuration for the image builder.
   *
   * You can specify only one subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-vpcconfig)
   * @param vpcConfig The VPC configuration for the image builder. 
   */
  public fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnImageBuilder {
    if(_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
