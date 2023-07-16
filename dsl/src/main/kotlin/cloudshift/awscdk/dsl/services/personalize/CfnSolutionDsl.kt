@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution
import software.constructs.Construct

@CdkDslMarker
public class CfnSolutionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSolution.Builder = CfnSolution.Builder.create(scope, id)

  public fun datasetGroupArn(datasetGroupArn: String) {
    cdkBuilder.datasetGroupArn(datasetGroupArn)
  }

  public fun eventType(eventType: String) {
    cdkBuilder.eventType(eventType)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun performAutoMl(performAutoMl: Boolean) {
    cdkBuilder.performAutoMl(performAutoMl)
  }

  public fun performAutoMl(performAutoMl: IResolvable) {
    cdkBuilder.performAutoMl(performAutoMl)
  }

  public fun performHpo(performHpo: Boolean) {
    cdkBuilder.performHpo(performHpo)
  }

  public fun performHpo(performHpo: IResolvable) {
    cdkBuilder.performHpo(performHpo)
  }

  public fun recipeArn(recipeArn: String) {
    cdkBuilder.recipeArn(recipeArn)
  }

  public fun solutionConfig(solutionConfig: IResolvable) {
    cdkBuilder.solutionConfig(solutionConfig)
  }

  public fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty) {
    cdkBuilder.solutionConfig(solutionConfig)
  }

  public fun build(): CfnSolution = cdkBuilder.build()
}
