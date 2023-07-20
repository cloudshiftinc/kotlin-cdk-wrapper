@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.constructs.Construct

@CdkDslMarker
public class EcsApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EcsApplication.Builder = EcsApplication.Builder.create(scope, id)

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun build(): EcsApplication = cdkBuilder.build()
}
