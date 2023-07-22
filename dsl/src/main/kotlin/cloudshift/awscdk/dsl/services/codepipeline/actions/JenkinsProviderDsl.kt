@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider
import software.constructs.Construct

/**
 * A class representing Jenkins providers.
 *
 * Example:
 *
 * ```
 * JenkinsProvider jenkinsProvider = JenkinsProvider.Builder.create(this, "JenkinsProvider")
 * .providerName("MyJenkinsProvider")
 * .serverUrl("http://my-jenkins.com:8080")
 * .version("2")
 * .build();
 * ```
 *
 * [Documentation]( #import)
 */
@CdkDslMarker
public class JenkinsProviderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: JenkinsProvider.Builder = JenkinsProvider.Builder.create(scope, id)

  /**
   * Whether to immediately register a Jenkins Provider for the build category.
   *
   * The Provider will always be registered if you create a `JenkinsAction`.
   *
   * Default: false
   *
   * @param forBuild Whether to immediately register a Jenkins Provider for the build category. 
   */
  public fun forBuild(forBuild: Boolean) {
    cdkBuilder.forBuild(forBuild)
  }

  /**
   * Whether to immediately register a Jenkins Provider for the test category.
   *
   * The Provider will always be registered if you create a `JenkinsTestAction`.
   *
   * Default: false
   *
   * @param forTest Whether to immediately register a Jenkins Provider for the test category. 
   */
  public fun forTest(forTest: Boolean) {
    cdkBuilder.forTest(forTest)
  }

  /**
   * The name of the Jenkins provider that you set in the AWS CodePipeline plugin configuration of
   * your Jenkins project.
   *
   * Example:
   *
   * ```
   * "MyJenkinsProvider";
   * ```
   *
   * @param providerName The name of the Jenkins provider that you set in the AWS CodePipeline
   * plugin configuration of your Jenkins project. 
   */
  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  /**
   * The base URL of your Jenkins server.
   *
   * Example:
   *
   * ```
   * "http://myjenkins.com:8080";
   * ```
   *
   * @param serverUrl The base URL of your Jenkins server. 
   */
  public fun serverUrl(serverUrl: String) {
    cdkBuilder.serverUrl(serverUrl)
  }

  /**
   * The version of your provider.
   *
   * Default: '1'
   *
   * @param version The version of your provider. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): JenkinsProvider = cdkBuilder.build()
}
