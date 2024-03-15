@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Artifacts internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.Artifacts,
) : CdkObject(cdkObject), IArtifacts {
  public override fun bind(_scope: Construct, _project: IProject): ArtifactsConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      _project.let(IProject::unwrap)).let(ArtifactsConfig::wrap)

  public override fun identifier(): String? = unwrap(this).getIdentifier()

  public override fun type(): String = unwrap(this).getType()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.Artifacts,
  ) : Artifacts(cdkObject)

  public companion object {
    public fun s3(props: S3ArtifactsProps): IArtifacts =
        software.amazon.awscdk.services.codebuild.Artifacts.s3(props.let(S3ArtifactsProps::unwrap)).let(IArtifacts::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63d027642e646b44f6750fe1ce755acaee0627a88e8371711800562702f65de")
    public fun s3(props: S3ArtifactsProps.Builder.() -> Unit): IArtifacts =
        s3(S3ArtifactsProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.Artifacts): Artifacts =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Artifacts): software.amazon.awscdk.services.codebuild.Artifacts =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.Artifacts
  }
}
