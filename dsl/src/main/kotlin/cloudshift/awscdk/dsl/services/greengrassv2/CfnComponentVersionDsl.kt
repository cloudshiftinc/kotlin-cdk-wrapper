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

  public fun inlineRecipe(inlineRecipe: String) {
    cdkBuilder.inlineRecipe(inlineRecipe)
  }

  public fun lambdaFunction(lambdaFunction: IResolvable) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  public
      fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnComponentVersion = cdkBuilder.build()
}
