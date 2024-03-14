package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import kotlin.String
import kotlin.collections.List

public abstract class StackInstances internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StackInstances,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackInstances,
  ) : StackInstances(cdkObject)

  public companion object {
    public fun fromArtifactPath(artifactPath: ArtifactPath, regions: List<String>): StackInstances =
        software.amazon.awscdk.services.codepipeline.actions.StackInstances.fromArtifactPath(artifactPath.let(ArtifactPath::unwrap),
        regions).let(StackInstances::wrap)

    public fun inAccounts(accounts: List<String>, regions: List<String>): StackInstances =
        software.amazon.awscdk.services.codepipeline.actions.StackInstances.inAccounts(accounts,
        regions).let(StackInstances::wrap)

    public fun inOrganizationalUnits(ous: List<String>, regions: List<String>): StackInstances =
        software.amazon.awscdk.services.codepipeline.actions.StackInstances.inOrganizationalUnits(ous,
        regions).let(StackInstances::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackInstances):
        StackInstances = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackInstances):
        software.amazon.awscdk.services.codepipeline.actions.StackInstances = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.actions.StackInstances
  }
}
