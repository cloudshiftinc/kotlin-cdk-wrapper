@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.pipelines.GitHubSourceOptions
import software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger

@CdkDslMarker
public class GitHubSourceOptionsDsl {
  private val cdkBuilder: GitHubSourceOptions.Builder = GitHubSourceOptions.builder()

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun authentication(authentication: SecretValue) {
    cdkBuilder.authentication(authentication)
  }

  public fun trigger(trigger: GitHubTrigger) {
    cdkBuilder.trigger(trigger)
  }

  public fun build(): GitHubSourceOptions = cdkBuilder.build()
}
