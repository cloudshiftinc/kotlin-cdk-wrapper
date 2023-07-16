@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.pipelines.S3SourceOptions
import software.amazon.awscdk.services.codepipeline.actions.S3Trigger
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class S3SourceOptionsDsl {
  private val cdkBuilder: S3SourceOptions.Builder = S3SourceOptions.builder()

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun trigger(trigger: S3Trigger) {
    cdkBuilder.trigger(trigger)
  }

  public fun build(): S3SourceOptions = cdkBuilder.build()
}
