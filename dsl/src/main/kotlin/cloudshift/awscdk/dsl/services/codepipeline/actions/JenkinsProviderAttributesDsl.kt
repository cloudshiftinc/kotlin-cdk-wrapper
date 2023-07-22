@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes

@CdkDslMarker
public class JenkinsProviderAttributesDsl {
  private val cdkBuilder: JenkinsProviderAttributes.Builder = JenkinsProviderAttributes.builder()

  /**
   * @param providerName The name of the Jenkins provider that you set in the AWS CodePipeline
   * plugin configuration of your Jenkins project. 
   */
  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  /**
   * @param serverUrl The base URL of your Jenkins server. 
   */
  public fun serverUrl(serverUrl: String) {
    cdkBuilder.serverUrl(serverUrl)
  }

  /**
   * @param version The version of your provider.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): JenkinsProviderAttributes = cdkBuilder.build()
}
