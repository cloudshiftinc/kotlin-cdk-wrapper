@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.S3SourceAction
import software.amazon.awscdk.services.codepipeline.actions.S3Trigger
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class S3SourceActionDsl {
  private val cdkBuilder: S3SourceAction.Builder = S3SourceAction.Builder.create()

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  public fun bucketKey(bucketKey: String) {
    cdkBuilder.bucketKey(bucketKey)
  }

  public fun output(output: Artifact) {
    cdkBuilder.output(output)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  public fun trigger(trigger: S3Trigger) {
    cdkBuilder.trigger(trigger)
  }

  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): S3SourceAction = cdkBuilder.build()
}
