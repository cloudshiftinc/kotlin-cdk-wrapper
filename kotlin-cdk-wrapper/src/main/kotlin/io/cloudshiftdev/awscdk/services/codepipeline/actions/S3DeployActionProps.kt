@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.BucketAccessControl
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface S3DeployActionProps : CommonAwsActionProps {
  public fun accessControl(): BucketAccessControl? =
      unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

  public fun bucket(): IBucket

  public fun cacheControl(): List<CacheControl> =
      unwrap(this).getCacheControl()?.map(CacheControl::wrap) ?: emptyList()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun extract(): Boolean? = unwrap(this).getExtract()

  public fun input(): Artifact

  public fun objectKey(): String? = unwrap(this).getObjectKey()

  @CdkDslMarker
  public interface Builder {
    public fun accessControl(accessControl: BucketAccessControl)

    public fun actionName(actionName: String)

    public fun bucket(bucket: IBucket)

    public fun cacheControl(cacheControl: List<CacheControl>)

    public fun cacheControl(vararg cacheControl: CacheControl)

    public fun encryptionKey(encryptionKey: IKey)

    public fun extract(extract: Boolean)

    public fun input(input: Artifact)

    public fun objectKey(objectKey: String)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps.builder()

    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun cacheControl(cacheControl: List<CacheControl>) {
      cdkBuilder.cacheControl(cacheControl.map(CacheControl::unwrap))
    }

    override fun cacheControl(vararg cacheControl: CacheControl): Unit =
        cacheControl(cacheControl.toList())

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun extract(extract: Boolean) {
      cdkBuilder.extract(extract)
    }

    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps,
  ) : CdkObject(cdkObject), S3DeployActionProps {
    override fun accessControl(): BucketAccessControl? =
        unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

    override fun actionName(): String = unwrap(this).getActionName()

    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun cacheControl(): List<CacheControl> =
        unwrap(this).getCacheControl()?.map(CacheControl::wrap) ?: emptyList()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun extract(): Boolean? = unwrap(this).getExtract()

    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    override fun objectKey(): String? = unwrap(this).getObjectKey()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3DeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps):
        S3DeployActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3DeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps
  }
}
