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
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder
import software.constructs.Construct

@CdkDslMarker
public class CfnAppBlockBuilderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAppBlockBuilder.Builder = CfnAppBlockBuilder.Builder.create(scope, id)

  private val _accessEndpoints: MutableList<Any> = mutableListOf()

  private val _appBlockArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The access endpoints of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
   * @param accessEndpoints The access endpoints of the app block builder. 
   */
  public fun accessEndpoints(vararg accessEndpoints: Any) {
    _accessEndpoints.addAll(listOf(*accessEndpoints))
  }

  /**
   * The access endpoints of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
   * @param accessEndpoints The access endpoints of the app block builder. 
   */
  public fun accessEndpoints(accessEndpoints: Collection<Any>) {
    _accessEndpoints.addAll(accessEndpoints)
  }

  /**
   * The access endpoints of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
   * @param accessEndpoints The access endpoints of the app block builder. 
   */
  public fun accessEndpoints(accessEndpoints: IResolvable) {
    cdkBuilder.accessEndpoints(accessEndpoints)
  }

  /**
   * The ARN of the app block.
   *
   * *Maximum* : `1`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-appblockarns)
   * @param appBlockArns The ARN of the app block. 
   */
  public fun appBlockArns(vararg appBlockArns: String) {
    _appBlockArns.addAll(listOf(*appBlockArns))
  }

  /**
   * The ARN of the app block.
   *
   * *Maximum* : `1`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-appblockarns)
   * @param appBlockArns The ARN of the app block. 
   */
  public fun appBlockArns(appBlockArns: Collection<String>) {
    _appBlockArns.addAll(appBlockArns)
  }

  /**
   * The description of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-description)
   * @param description The description of the app block builder. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The display name of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-displayname)
   * @param displayName The display name of the app block builder. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * Indicates whether default internet access is enabled for the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-enabledefaultinternetaccess)
   * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for the
   * app block builder. 
   */
  public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
    cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
  }

  /**
   * Indicates whether default internet access is enabled for the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-enabledefaultinternetaccess)
   * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for the
   * app block builder. 
   */
  public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
    cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
  }

  /**
   * The ARN of the IAM role that is applied to the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-iamrolearn)
   * @param iamRoleArn The ARN of the IAM role that is applied to the app block builder. 
   */
  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  /**
   * The instance type of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-instancetype)
   * @param instanceType The instance type of the app block builder. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * The name of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-name)
   * @param name The name of the app block builder. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The platform of the app block builder.
   *
   * *Allowed values* : `WINDOWS_SERVER_2019`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-platform)
   * @param platform The platform of the app block builder. 
   */
  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  /**
   * The tags of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-tags)
   * @param tags The tags of the app block builder. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-tags)
   * @param tags The tags of the app block builder. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The VPC configuration for the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
   * @param vpcConfig The VPC configuration for the app block builder. 
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * The VPC configuration for the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
   * @param vpcConfig The VPC configuration for the app block builder. 
   */
  public fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnAppBlockBuilder {
    if(_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
    if(_appBlockArns.isNotEmpty()) cdkBuilder.appBlockArns(_appBlockArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
