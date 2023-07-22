@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectBuildStatusConfigPropertyDsl {
  private val cdkBuilder: CfnProject.BuildStatusConfigProperty.Builder =
      CfnProject.BuildStatusConfigProperty.builder()

  /**
   * @param context Specifies the context of the build status CodeBuild sends to the source
   * provider.
   * The usage of this parameter depends on the source provider.
   *
   * * **Bitbucket** - This parameter is used for the `name` parameter in the Bitbucket commit
   * status. For more information, see
   * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
   * in the Bitbucket API documentation.
   * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `context` parameter in
   * the GitHub commit status. For more information, see [Create a commit
   * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
   * in the GitHub developer guide.
   */
  public fun context(context: String) {
    cdkBuilder.context(context)
  }

  /**
   * @param targetUrl Specifies the target url of the build status CodeBuild sends to the source
   * provider.
   * The usage of this parameter depends on the source provider.
   *
   * * **Bitbucket** - This parameter is used for the `url` parameter in the Bitbucket commit
   * status. For more information, see
   * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
   * in the Bitbucket API documentation.
   * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `target_url` parameter
   * in the GitHub commit status. For more information, see [Create a commit
   * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
   * in the GitHub developer guide.
   */
  public fun targetUrl(targetUrl: String) {
    cdkBuilder.targetUrl(targetUrl)
  }

  public fun build(): CfnProject.BuildStatusConfigProperty = cdkBuilder.build()
}
