@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps

@CdkDslMarker
public class JenkinsProviderPropsDsl {
  private val cdkBuilder: JenkinsProviderProps.Builder = JenkinsProviderProps.builder()

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

  public fun build(): JenkinsProviderProps = cdkBuilder.build()
}
