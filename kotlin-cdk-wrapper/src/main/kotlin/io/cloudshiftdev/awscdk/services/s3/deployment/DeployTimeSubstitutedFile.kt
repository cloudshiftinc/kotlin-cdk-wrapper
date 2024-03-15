@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DeployTimeSubstitutedFile internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile,
) : BucketDeployment(cdkObject) {
  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  public open fun objectKey(): String = unwrap(this).getObjectKey()

  @CdkDslMarker
  public interface Builder {
    public fun destinationBucket(destinationBucket: IBucket)

    public fun destinationKey(destinationKey: String)

    public fun role(role: IRole)

    public fun source(source: String)

    public fun substitutions(substitutions: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile.Builder =
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DeployTimeSubstitutedFile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DeployTimeSubstitutedFile(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile):
        DeployTimeSubstitutedFile = DeployTimeSubstitutedFile(cdkObject)

    internal fun unwrap(wrapped: DeployTimeSubstitutedFile):
        software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile = wrapped.cdkObject
  }
}
