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
import software.amazon.awscdk.services.appstream.CfnImageBuilderProps

/**
 * Properties for defining a `CfnImageBuilder`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
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
@CdkDslMarker
public class CfnImageBuilderPropsDsl {
  private val cdkBuilder: CfnImageBuilderProps.Builder = CfnImageBuilderProps.builder()

  private val _accessEndpoints: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
   * Administrators can connect to the image builder only through the specified endpoints.
   */
  public fun accessEndpoints(vararg accessEndpoints: Any) {
    _accessEndpoints.addAll(listOf(*accessEndpoints))
  }

  /**
   * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
   * Administrators can connect to the image builder only through the specified endpoints.
   */
  public fun accessEndpoints(accessEndpoints: Collection<Any>) {
    _accessEndpoints.addAll(accessEndpoints)
  }

  /**
   * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects.
   * Administrators can connect to the image builder only through the specified endpoints.
   */
  public fun accessEndpoints(accessEndpoints: IResolvable) {
    cdkBuilder.accessEndpoints(accessEndpoints)
  }

  /**
   * @param appstreamAgentVersion The version of the AppStream 2.0 agent to use for this image
   * builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST].
   */
  public fun appstreamAgentVersion(appstreamAgentVersion: String) {
    cdkBuilder.appstreamAgentVersion(appstreamAgentVersion)
  }

  /**
   * @param description The description to display.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param displayName The image builder name to display.
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join the
   * image builder to a Microsoft Active Directory domain.
   */
  public fun domainJoinInfo(domainJoinInfo: IResolvable) {
    cdkBuilder.domainJoinInfo(domainJoinInfo)
  }

  /**
   * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join the
   * image builder to a Microsoft Active Directory domain.
   */
  public fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty) {
    cdkBuilder.domainJoinInfo(domainJoinInfo)
  }

  /**
   * @param enableDefaultInternetAccess Enables or disables default internet access for the image
   * builder.
   */
  public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
    cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
  }

  /**
   * @param enableDefaultInternetAccess Enables or disables default internet access for the image
   * builder.
   */
  public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
    cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
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
  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  /**
   * @param imageArn The ARN of the public, private, or shared image to use.
   */
  public fun imageArn(imageArn: String) {
    cdkBuilder.imageArn(imageArn)
  }

  /**
   * @param imageName The name of the image used to create the image builder.
   */
  public fun imageName(imageName: String) {
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
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param name A unique name for the image builder. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags An array of key-value pairs.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpcConfig The VPC configuration for the image builder.
   * You can specify only one subnet.
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * @param vpcConfig The VPC configuration for the image builder.
   * You can specify only one subnet.
   */
  public fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnImageBuilderProps {
    if(_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
