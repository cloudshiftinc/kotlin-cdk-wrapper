@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface DeployTimeSubstitutedFileProps {
  public fun destinationBucket(): IBucket

  public fun destinationKey(): String? = unwrap(this).getDestinationKey()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun source(): String

  public fun substitutions(): Map<String, String>

  @CdkDslMarker
  public interface Builder {
    public fun destinationBucket(destinationBucket: IBucket)

    public fun destinationKey(destinationKey: String)

    public fun role(role: IRole)

    public fun source(source: String)

    public fun substitutions(substitutions: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps.Builder =
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps.builder()

    override fun destinationBucket(destinationBucket: IBucket) {
      cdkBuilder.destinationBucket(destinationBucket.let(IBucket::unwrap))
    }

    override fun destinationKey(destinationKey: String) {
      cdkBuilder.destinationKey(destinationKey)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun substitutions(substitutions: Map<String, String>) {
      cdkBuilder.substitutions(substitutions)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps,
  ) : CdkObject(cdkObject), DeployTimeSubstitutedFileProps {
    override fun destinationBucket(): IBucket =
        unwrap(this).getDestinationBucket().let(IBucket::wrap)

    override fun destinationKey(): String? = unwrap(this).getDestinationKey()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun source(): String = unwrap(this).getSource()

    override fun substitutions(): Map<String, String> = unwrap(this).getSubstitutions() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeployTimeSubstitutedFileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps):
        DeployTimeSubstitutedFileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeployTimeSubstitutedFileProps):
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps
  }
}
