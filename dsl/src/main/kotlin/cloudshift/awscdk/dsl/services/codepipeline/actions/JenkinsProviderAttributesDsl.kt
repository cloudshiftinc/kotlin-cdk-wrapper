@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes

@CdkDslMarker
public class JenkinsProviderAttributesDsl {
  private val cdkBuilder: JenkinsProviderAttributes.Builder = JenkinsProviderAttributes.builder()

  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  public fun serverUrl(serverUrl: String) {
    cdkBuilder.serverUrl(serverUrl)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): JenkinsProviderAttributes = cdkBuilder.build()
}
