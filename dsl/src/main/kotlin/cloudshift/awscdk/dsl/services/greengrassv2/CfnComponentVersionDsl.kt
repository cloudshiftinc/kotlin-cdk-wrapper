@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnComponentVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnComponentVersion.Builder = CfnComponentVersion.Builder.create(scope,
      id)

  /**
   * The recipe to use to create the component.
   *
   * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
   * and platform compatibility.
   *
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-inlinerecipe)
   * @param inlineRecipe The recipe to use to create the component. 
   */
  public fun inlineRecipe(inlineRecipe: String) {
    cdkBuilder.inlineRecipe(inlineRecipe)
  }

  /**
   * The parameters to create a component from a Lambda function.
   *
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
   * @param lambdaFunction The parameters to create a component from a Lambda function. 
   */
  public fun lambdaFunction(lambdaFunction: IResolvable) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  /**
   * The parameters to create a component from a Lambda function.
   *
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-lambdafunction)
   * @param lambdaFunction The parameters to create a component from a Lambda function. 
   */
  public
      fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  /**
   * Application-specific metadata to attach to the component version.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tag your AWS IoT Greengrass
   * Version 2 resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-componentversion.html#cfn-greengrassv2-componentversion-tags)
   * @param tags Application-specific metadata to attach to the component version. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnComponentVersion = cdkBuilder.build()
}
