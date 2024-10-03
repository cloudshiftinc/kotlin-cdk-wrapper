@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * An object that represents a group of filter conditions for a webhook.
 *
 * Every condition in a given FilterGroup must be true in order for the whole group to be true.
 * You construct instances of it by calling the `#inEventOf` static factory method,
 * and then calling various `andXyz` instance methods to create modified instances of it
 * (this class is immutable).
 *
 * You pass instances of this class to the `webhookFilters` property when constructing a source.
 *
 * Example:
 *
 * ```
 * ISource gitHubSource = Source.gitHub(GitHubSourceProps.builder()
 * .owner("awslabs")
 * .repo("aws-cdk")
 * .webhook(true) // optional, default: true if `webhookFilters` were provided, false otherwise
 * .webhookTriggersBatchBuild(true) // optional, default is false
 * .webhookFilters(List.of(FilterGroup.inEventOf(EventAction.PUSH).andBranchIs("main").andCommitMessageIs("the
 * commit message"), FilterGroup.inEventOf(EventAction.RELEASED).andBranchIs("main")))
 * .build());
 * ```
 */
public open class FilterGroup(
  cdkObject: software.amazon.awscdk.services.codebuild.FilterGroup,
) : CdkObject(cdkObject) {
  /**
   * Create a new FilterGroup with an added condition: the account ID of the actor initiating the
   * event must match the given pattern.
   *
   * @param pattern a regular expression. 
   */
  public open fun andActorAccountIs(pattern: String): FilterGroup =
      unwrap(this).andActorAccountIs(pattern).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the account ID of the actor initiating the
   * event must not match the given pattern.
   *
   * @param pattern a regular expression. 
   */
  public open fun andActorAccountIsNot(pattern: String): FilterGroup =
      unwrap(this).andActorAccountIsNot(pattern).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the Pull Request that is the source of the
   * event must target the given base branch.
   *
   * Note that you cannot use this method if this Group contains the `PUSH` event action.
   *
   * @param branchName the name of the branch (can be a regular expression). 
   */
  public open fun andBaseBranchIs(branchName: String): FilterGroup =
      unwrap(this).andBaseBranchIs(branchName).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the Pull Request that is the source of the
   * event must not target the given base branch.
   *
   * Note that you cannot use this method if this Group contains the `PUSH` event action.
   *
   * @param branchName the name of the branch (can be a regular expression). 
   */
  public open fun andBaseBranchIsNot(branchName: String): FilterGroup =
      unwrap(this).andBaseBranchIsNot(branchName).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the Pull Request that is the source of the
   * event must target the given Git reference.
   *
   * Note that you cannot use this method if this Group contains the `PUSH` event action.
   *
   * @param pattern a regular expression. 
   */
  public open fun andBaseRefIs(pattern: String): FilterGroup =
      unwrap(this).andBaseRefIs(pattern).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the Pull Request that is the source of the
   * event must not target the given Git reference.
   *
   * Note that you cannot use this method if this Group contains the `PUSH` event action.
   *
   * @param pattern a regular expression. 
   */
  public open fun andBaseRefIsNot(pattern: String): FilterGroup =
      unwrap(this).andBaseRefIsNot(pattern).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the event must affect the given branch.
   *
   * @param branchName the name of the branch (can be a regular expression). 
   */
  public open fun andBranchIs(branchName: String): FilterGroup =
      unwrap(this).andBranchIs(branchName).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the event must not affect the given branch.
   *
   * @param branchName the name of the branch (can be a regular expression). 
   */
  public open fun andBranchIsNot(branchName: String): FilterGroup =
      unwrap(this).andBranchIsNot(branchName).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the event must affect a head commit with the
   * given message.
   *
   * @param commitMessage the commit message (can be a regular expression). 
   */
  public open fun andCommitMessageIs(commitMessage: String): FilterGroup =
      unwrap(this).andCommitMessageIs(commitMessage).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the event must not affect a head commit with
   * the given message.
   *
   * @param commitMessage the commit message (can be a regular expression). 
   */
  public open fun andCommitMessageIsNot(commitMessage: String): FilterGroup =
      unwrap(this).andCommitMessageIsNot(commitMessage).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the push that is the source of the event must
   * affect a file that matches the given pattern.
   *
   * Note that you can only use this method if this Group contains only the `PUSH` event action,
   * and only for GitHub, Bitbucket and GitHubEnterprise sources.
   *
   * @param pattern a regular expression. 
   */
  public open fun andFilePathIs(pattern: String): FilterGroup =
      unwrap(this).andFilePathIs(pattern).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the push that is the source of the event must
   * not affect a file that matches the given pattern.
   *
   * Note that you can only use this method if this Group contains only the `PUSH` event action,
   * and only for GitHub, Bitbucket and GitHubEnterprise sources.
   *
   * @param pattern a regular expression. 
   */
  public open fun andFilePathIsNot(pattern: String): FilterGroup =
      unwrap(this).andFilePathIsNot(pattern).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the event must affect a Git reference (ie., a
   * branch or a tag) that matches the given pattern.
   *
   * @param pattern a regular expression. 
   */
  public open fun andHeadRefIs(pattern: String): FilterGroup =
      unwrap(this).andHeadRefIs(pattern).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the event must not affect a Git reference
   * (ie., a branch or a tag) that matches the given pattern.
   *
   * @param pattern a regular expression. 
   */
  public open fun andHeadRefIsNot(pattern: String): FilterGroup =
      unwrap(this).andHeadRefIsNot(pattern).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the event must affect the given tag.
   *
   * @param tagName the name of the tag (can be a regular expression). 
   */
  public open fun andTagIs(tagName: String): FilterGroup =
      unwrap(this).andTagIs(tagName).let(FilterGroup::wrap)

  /**
   * Create a new FilterGroup with an added condition: the event must not affect the given tag.
   *
   * @param tagName the name of the tag (can be a regular expression). 
   */
  public open fun andTagIsNot(tagName: String): FilterGroup =
      unwrap(this).andTagIsNot(tagName).let(FilterGroup::wrap)

  public companion object {
    public fun inEventOf(actions: EventAction): FilterGroup =
        software.amazon.awscdk.services.codebuild.FilterGroup.inEventOf(actions.let(EventAction.Companion::unwrap)).let(FilterGroup::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.FilterGroup): FilterGroup
        = FilterGroup(cdkObject)

    internal fun unwrap(wrapped: FilterGroup): software.amazon.awscdk.services.codebuild.FilterGroup
        = wrapped.cdkObject as software.amazon.awscdk.services.codebuild.FilterGroup
  }
}
