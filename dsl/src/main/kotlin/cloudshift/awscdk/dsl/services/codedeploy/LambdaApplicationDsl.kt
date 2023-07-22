@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.constructs.Construct

/**
 * A CodeDeploy Application that deploys to an AWS Lambda function.
 *
 * Example:
 *
 * ```
 * LambdaApplication application = LambdaApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LambdaApplication.Builder = LambdaApplication.Builder.create(scope, id)

  /**
   * The physical, human-readable name of the CodeDeploy Application.
   *
   * Default: an auto-generated name will be used
   *
   * @param applicationName The physical, human-readable name of the CodeDeploy Application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun build(): LambdaApplication = cdkBuilder.build()
}
