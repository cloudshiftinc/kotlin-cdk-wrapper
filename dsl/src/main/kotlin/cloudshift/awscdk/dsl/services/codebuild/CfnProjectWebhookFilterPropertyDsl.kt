@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * `WebhookFilter` is a structure of the `FilterGroups` property on the [AWS CodeBuild Project
 * ProjectTriggers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html)
 * property type that specifies which webhooks trigger an AWS CodeBuild build.
 *
 *
 * The Webhook feature isn't available in AWS CloudFormation for GitHub Enterprise projects. Use the
 * AWS CLI or AWS CodeBuild console to create the webhook.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * WebhookFilterProperty webhookFilterProperty = WebhookFilterProperty.builder()
 * .pattern("pattern")
 * .type("type")
 * // the properties below are optional
 * .excludeMatchedPattern(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-webhookfilter.html)
 */
@CdkDslMarker
public class CfnProjectWebhookFilterPropertyDsl {
  private val cdkBuilder: CfnProject.WebhookFilterProperty.Builder =
      CfnProject.WebhookFilterProperty.builder()

  /**
   * @param excludeMatchedPattern Used to indicate that the `pattern` determines which webhook
   * events do not trigger a build.
   * If true, then a webhook event that does not match the `pattern` triggers a build. If false,
   * then a webhook event that matches the `pattern` triggers a build.
   */
  public fun excludeMatchedPattern(excludeMatchedPattern: Boolean) {
    cdkBuilder.excludeMatchedPattern(excludeMatchedPattern)
  }

  /**
   * @param excludeMatchedPattern Used to indicate that the `pattern` determines which webhook
   * events do not trigger a build.
   * If true, then a webhook event that does not match the `pattern` triggers a build. If false,
   * then a webhook event that matches the `pattern` triggers a build.
   */
  public fun excludeMatchedPattern(excludeMatchedPattern: IResolvable) {
    cdkBuilder.excludeMatchedPattern(excludeMatchedPattern)
  }

  /**
   * @param pattern For a `WebHookFilter` that uses `EVENT` type, a comma-separated string that
   * specifies one or more events. 
   * For example, the webhook filter `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED` allows all
   * push, pull request created, and pull request updated events to trigger a build.
   *
   * For a `WebHookFilter` that uses any of the other filter types, a regular expression pattern.
   * For example, a `WebHookFilter` that uses `HEAD_REF` for its `type` and the pattern `^refs/heads/`
   * triggers a build when the head reference is a branch with a reference name
   * `refs/heads/branch-name` .
   */
  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  /**
   * @param type The type of webhook filter. 
   * There are six webhook filter types: `EVENT` , `ACTOR_ACCOUNT_ID` , `HEAD_REF` , `BASE_REF` ,
   * `FILE_PATH` , and `COMMIT_MESSAGE` .
   *
   * * **EVENT** - A webhook event triggers a build when the provided `pattern` matches one of five
   * event types: `PUSH` , `PULL_REQUEST_CREATED` , `PULL_REQUEST_UPDATED` , `PULL_REQUEST_REOPENED` ,
   * and `PULL_REQUEST_MERGED` . The `EVENT` patterns are specified as a comma-separated string. For
   * example, `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED` filters all push, pull request
   * created, and pull request updated events.
   *
   *
   * The `PULL_REQUEST_REOPENED` works with GitHub and GitHub Enterprise only.
   *
   *
   * * **ACTOR_ACCOUNT_ID** - A webhook event triggers a build when a GitHub, GitHub Enterprise, or
   * Bitbucket account ID matches the regular expression `pattern` .
   * * **HEAD_REF** - A webhook event triggers a build when the head reference matches the regular
   * expression `pattern` . For example, `refs/heads/branch-name` and `refs/tags/tag-name` .
   *
   * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request,
   * Bitbucket push, and Bitbucket pull request events.
   *
   * * **BASE_REF** - A webhook event triggers a build when the base reference matches the regular
   * expression `pattern` . For example, `refs/heads/branch-name` .
   *
   *
   * Works with pull request events only.
   *
   *
   * * **FILE_PATH** - A webhook triggers a build when the path of a changed file matches the
   * regular expression `pattern` .
   *
   *
   * Works with GitHub and Bitbucket events push and pull requests events. Also works with GitHub
   * Enterprise push events, but does not work with GitHub Enterprise pull request events.
   *
   *
   * * **COMMIT_MESSAGE** - A webhook triggers a build when the head commit message matches the
   * regular expression `pattern` .
   *
   *
   * Works with GitHub and Bitbucket events push and pull requests events. Also works with GitHub
   * Enterprise push events, but does not work with GitHub Enterprise pull request events.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnProject.WebhookFilterProperty = cdkBuilder.build()
}
