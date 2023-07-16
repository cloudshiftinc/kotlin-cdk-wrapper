@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.CodeBuildProject
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class CodeBuildProjectDsl(
  arg0: IProject,
) {
  private val cdkBuilder: CodeBuildProject.Builder = CodeBuildProject.Builder.create(arg0)

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  public fun eventRole(eventRole: IRole) {
    cdkBuilder.eventRole(eventRole)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): CodeBuildProject = cdkBuilder.build()
}
