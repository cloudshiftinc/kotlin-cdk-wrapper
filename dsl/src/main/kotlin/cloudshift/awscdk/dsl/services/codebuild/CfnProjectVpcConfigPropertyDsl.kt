@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * `VpcConfig` is a property of the
 * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 * resource that enable AWS CodeBuild to access resources in an Amazon VPC. For more information, see
 * [Use AWS CodeBuild with Amazon Virtual Private
 * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
 * CodeBuild User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html)
 */
@CdkDslMarker
public class CfnProjectVpcConfigPropertyDsl {
  private val cdkBuilder: CfnProject.VpcConfigProperty.Builder =
      CfnProject.VpcConfigProperty.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  /**
   * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
   * The maximum count is 5.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
   * The maximum count is 5.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnets A list of one or more subnet IDs in your Amazon VPC.
   * The maximum count is 16.
   */
  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  /**
   * @param subnets A list of one or more subnet IDs in your Amazon VPC.
   * The maximum count is 16.
   */
  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  /**
   * @param vpcId The ID of the Amazon VPC.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnProject.VpcConfigProperty {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
