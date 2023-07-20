@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider
import software.constructs.Construct

@CdkDslMarker
public class JenkinsProviderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: JenkinsProvider.Builder = JenkinsProvider.Builder.create(scope, id)

  public fun forBuild(forBuild: Boolean) {
    cdkBuilder.forBuild(forBuild)
  }

  public fun forTest(forTest: Boolean) {
    cdkBuilder.forTest(forTest)
  }

  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  public fun serverUrl(serverUrl: String) {
    cdkBuilder.serverUrl(serverUrl)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): JenkinsProvider = cdkBuilder.build()
}
