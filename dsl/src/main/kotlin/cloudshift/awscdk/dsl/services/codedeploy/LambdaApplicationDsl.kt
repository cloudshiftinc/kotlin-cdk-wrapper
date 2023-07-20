@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.constructs.Construct

@CdkDslMarker
public class LambdaApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LambdaApplication.Builder = LambdaApplication.Builder.create(scope, id)

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun build(): LambdaApplication = cdkBuilder.build()
}
