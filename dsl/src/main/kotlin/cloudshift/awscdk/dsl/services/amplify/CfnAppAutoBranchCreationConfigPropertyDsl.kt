@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnApp

/**
 * Use the AutoBranchCreationConfig property type to automatically create branches that match a
 * certain pattern.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * AutoBranchCreationConfigProperty autoBranchCreationConfigProperty =
 * AutoBranchCreationConfigProperty.builder()
 * .autoBranchCreationPatterns(List.of("autoBranchCreationPatterns"))
 * .basicAuthConfig(BasicAuthConfigProperty.builder()
 * .enableBasicAuth(false)
 * .password("password")
 * .username("username")
 * .build())
 * .buildSpec("buildSpec")
 * .enableAutoBranchCreation(false)
 * .enableAutoBuild(false)
 * .enablePerformanceMode(false)
 * .enablePullRequestPreview(false)
 * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .framework("framework")
 * .pullRequestEnvironmentName("pullRequestEnvironmentName")
 * .stage("stage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html)
 */
@CdkDslMarker
public class CfnAppAutoBranchCreationConfigPropertyDsl {
  private val cdkBuilder: CfnApp.AutoBranchCreationConfigProperty.Builder =
      CfnApp.AutoBranchCreationConfigProperty.builder()

  private val _autoBranchCreationPatterns: MutableList<String> = mutableListOf()

  private val _environmentVariables: MutableList<Any> = mutableListOf()

  /**
   * @param autoBranchCreationPatterns Automated branch creation glob patterns for the Amplify app.
   */
  public fun autoBranchCreationPatterns(vararg autoBranchCreationPatterns: String) {
    _autoBranchCreationPatterns.addAll(listOf(*autoBranchCreationPatterns))
  }

  /**
   * @param autoBranchCreationPatterns Automated branch creation glob patterns for the Amplify app.
   */
  public fun autoBranchCreationPatterns(autoBranchCreationPatterns: Collection<String>) {
    _autoBranchCreationPatterns.addAll(autoBranchCreationPatterns)
  }

  /**
   * @param basicAuthConfig Sets password protection for your auto created branch.
   */
  public fun basicAuthConfig(basicAuthConfig: IResolvable) {
    cdkBuilder.basicAuthConfig(basicAuthConfig)
  }

  /**
   * @param basicAuthConfig Sets password protection for your auto created branch.
   */
  public fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty) {
    cdkBuilder.basicAuthConfig(basicAuthConfig)
  }

  /**
   * @param buildSpec The build specification (build spec) for the autocreated branch.
   * *Length Constraints:* Minimum length of 1. Maximum length of 25000.
   */
  public fun buildSpec(buildSpec: String) {
    cdkBuilder.buildSpec(buildSpec)
  }

  /**
   * @param enableAutoBranchCreation Enables automated branch creation for the Amplify app.
   */
  public fun enableAutoBranchCreation(enableAutoBranchCreation: Boolean) {
    cdkBuilder.enableAutoBranchCreation(enableAutoBranchCreation)
  }

  /**
   * @param enableAutoBranchCreation Enables automated branch creation for the Amplify app.
   */
  public fun enableAutoBranchCreation(enableAutoBranchCreation: IResolvable) {
    cdkBuilder.enableAutoBranchCreation(enableAutoBranchCreation)
  }

  /**
   * @param enableAutoBuild Enables auto building for the auto created branch.
   */
  public fun enableAutoBuild(enableAutoBuild: Boolean) {
    cdkBuilder.enableAutoBuild(enableAutoBuild)
  }

  /**
   * @param enableAutoBuild Enables auto building for the auto created branch.
   */
  public fun enableAutoBuild(enableAutoBuild: IResolvable) {
    cdkBuilder.enableAutoBuild(enableAutoBuild)
  }

  /**
   * @param enablePerformanceMode Enables performance mode for the branch.
   * Performance mode optimizes for faster hosting performance by keeping content cached at the edge
   * for a longer interval. When performance mode is enabled, hosting configuration or code changes can
   * take up to 10 minutes to roll out.
   */
  public fun enablePerformanceMode(enablePerformanceMode: Boolean) {
    cdkBuilder.enablePerformanceMode(enablePerformanceMode)
  }

  /**
   * @param enablePerformanceMode Enables performance mode for the branch.
   * Performance mode optimizes for faster hosting performance by keeping content cached at the edge
   * for a longer interval. When performance mode is enabled, hosting configuration or code changes can
   * take up to 10 minutes to roll out.
   */
  public fun enablePerformanceMode(enablePerformanceMode: IResolvable) {
    cdkBuilder.enablePerformanceMode(enablePerformanceMode)
  }

  /**
   * @param enablePullRequestPreview Sets whether pull request previews are enabled for each branch
   * that Amplify Hosting automatically creates for your app.
   * Amplify creates previews by deploying your app to a unique URL whenever a pull request is
   * opened for the branch. Development and QA teams can use this preview to test the pull request
   * before it's merged into a production or integration branch.
   *
   * To provide backend support for your preview, Amplify Hosting automatically provisions a
   * temporary backend environment that it deletes when the pull request is closed. If you want to
   * specify a dedicated backend environment for your previews, use the `PullRequestEnvironmentName`
   * property.
   *
   * For more information, see [Web
   * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
   * Amplify Hosting User Guide* .
   */
  public fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
    cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
  }

  /**
   * @param enablePullRequestPreview Sets whether pull request previews are enabled for each branch
   * that Amplify Hosting automatically creates for your app.
   * Amplify creates previews by deploying your app to a unique URL whenever a pull request is
   * opened for the branch. Development and QA teams can use this preview to test the pull request
   * before it's merged into a production or integration branch.
   *
   * To provide backend support for your preview, Amplify Hosting automatically provisions a
   * temporary backend environment that it deletes when the pull request is closed. If you want to
   * specify a dedicated backend environment for your previews, use the `PullRequestEnvironmentName`
   * property.
   *
   * For more information, see [Web
   * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
   * Amplify Hosting User Guide* .
   */
  public fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
    cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
  }

  /**
   * @param environmentVariables Environment variables for the auto created branch.
   */
  public fun environmentVariables(vararg environmentVariables: Any) {
    _environmentVariables.addAll(listOf(*environmentVariables))
  }

  /**
   * @param environmentVariables Environment variables for the auto created branch.
   */
  public fun environmentVariables(environmentVariables: Collection<Any>) {
    _environmentVariables.addAll(environmentVariables)
  }

  /**
   * @param environmentVariables Environment variables for the auto created branch.
   */
  public fun environmentVariables(environmentVariables: IResolvable) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  /**
   * @param framework The framework for the autocreated branch.
   */
  public fun framework(framework: String) {
    cdkBuilder.framework(framework)
  }

  /**
   * @param pullRequestEnvironmentName If pull request previews are enabled, you can use this
   * property to specify a dedicated backend environment for your previews.
   * For example, you could specify an environment named `prod` , `test` , or `dev` that you
   * initialized with the Amplify CLI.
   *
   * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
   *
   * If you don't specify an environment, Amplify Hosting provides backend support for each preview
   * by automatically provisioning a temporary backend environment. Amplify deletes this environment
   * when the pull request is closed.
   *
   * For more information about creating backend environments, see [Feature Branch Deployments and
   * Team Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
   * the *AWS Amplify Hosting User Guide* .
   *
   * *Length Constraints:* Maximum length of 20.
   *
   * *Pattern:* (?s).*
   */
  public fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
    cdkBuilder.pullRequestEnvironmentName(pullRequestEnvironmentName)
  }

  /**
   * @param stage Stage for the auto created branch.
   */
  public fun stage(stage: String) {
    cdkBuilder.stage(stage)
  }

  public fun build(): CfnApp.AutoBranchCreationConfigProperty {
    if(_autoBranchCreationPatterns.isNotEmpty())
        cdkBuilder.autoBranchCreationPatterns(_autoBranchCreationPatterns)
    if(_environmentVariables.isNotEmpty()) cdkBuilder.environmentVariables(_environmentVariables)
    return cdkBuilder.build()
  }
}
