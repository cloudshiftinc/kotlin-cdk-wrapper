@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class FilterGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.FilterGroup,
) : CdkObject(cdkObject) {
  public open fun andActorAccountIs(pattern: String): FilterGroup =
      unwrap(this).andActorAccountIs(pattern).let(FilterGroup::wrap)

  public open fun andActorAccountIsNot(pattern: String): FilterGroup =
      unwrap(this).andActorAccountIsNot(pattern).let(FilterGroup::wrap)

  public open fun andBaseBranchIs(branchName: String): FilterGroup =
      unwrap(this).andBaseBranchIs(branchName).let(FilterGroup::wrap)

  public open fun andBaseBranchIsNot(branchName: String): FilterGroup =
      unwrap(this).andBaseBranchIsNot(branchName).let(FilterGroup::wrap)

  public open fun andBaseRefIs(pattern: String): FilterGroup =
      unwrap(this).andBaseRefIs(pattern).let(FilterGroup::wrap)

  public open fun andBaseRefIsNot(pattern: String): FilterGroup =
      unwrap(this).andBaseRefIsNot(pattern).let(FilterGroup::wrap)

  public open fun andBranchIs(branchName: String): FilterGroup =
      unwrap(this).andBranchIs(branchName).let(FilterGroup::wrap)

  public open fun andBranchIsNot(branchName: String): FilterGroup =
      unwrap(this).andBranchIsNot(branchName).let(FilterGroup::wrap)

  public open fun andCommitMessageIs(commitMessage: String): FilterGroup =
      unwrap(this).andCommitMessageIs(commitMessage).let(FilterGroup::wrap)

  public open fun andCommitMessageIsNot(commitMessage: String): FilterGroup =
      unwrap(this).andCommitMessageIsNot(commitMessage).let(FilterGroup::wrap)

  public open fun andFilePathIs(pattern: String): FilterGroup =
      unwrap(this).andFilePathIs(pattern).let(FilterGroup::wrap)

  public open fun andFilePathIsNot(pattern: String): FilterGroup =
      unwrap(this).andFilePathIsNot(pattern).let(FilterGroup::wrap)

  public open fun andHeadRefIs(pattern: String): FilterGroup =
      unwrap(this).andHeadRefIs(pattern).let(FilterGroup::wrap)

  public open fun andHeadRefIsNot(pattern: String): FilterGroup =
      unwrap(this).andHeadRefIsNot(pattern).let(FilterGroup::wrap)

  public open fun andTagIs(tagName: String): FilterGroup =
      unwrap(this).andTagIs(tagName).let(FilterGroup::wrap)

  public open fun andTagIsNot(tagName: String): FilterGroup =
      unwrap(this).andTagIsNot(tagName).let(FilterGroup::wrap)

  public companion object {
    public fun inEventOf(actions: EventAction): FilterGroup =
        software.amazon.awscdk.services.codebuild.FilterGroup.inEventOf(actions.let(EventAction::unwrap)).let(FilterGroup::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.FilterGroup): FilterGroup
        = FilterGroup(cdkObject)

    internal fun unwrap(wrapped: FilterGroup): software.amazon.awscdk.services.codebuild.FilterGroup
        = wrapped.cdkObject
  }
}
