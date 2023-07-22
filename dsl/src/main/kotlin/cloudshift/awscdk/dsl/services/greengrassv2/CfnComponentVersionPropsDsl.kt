@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps

@CdkDslMarker
public class CfnComponentVersionPropsDsl {
  private val cdkBuilder: CfnComponentVersionProps.Builder = CfnComponentVersionProps.builder()

  /**
   * @param inlineRecipe The recipe to use to create the component.
   * The recipe defines the component's metadata, parameters, dependencies, lifecycle, artifacts,
   * and platform compatibility.
   *
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   */
  public fun inlineRecipe(inlineRecipe: String) {
    cdkBuilder.inlineRecipe(inlineRecipe)
  }

  /**
   * @param lambdaFunction The parameters to create a component from a Lambda function.
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   */
  public fun lambdaFunction(lambdaFunction: IResolvable) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  /**
   * @param lambdaFunction The parameters to create a component from a Lambda function.
   * You must specify either `InlineRecipe` or `LambdaFunction` .
   */
  public
      fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  /**
   * @param tags Application-specific metadata to attach to the component version.
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
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnComponentVersionProps = cdkBuilder.build()
}
