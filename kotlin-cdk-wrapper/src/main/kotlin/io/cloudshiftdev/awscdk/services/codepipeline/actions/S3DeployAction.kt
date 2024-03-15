@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.BucketAccessControl
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class S3DeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.S3DeployAction,
) : Action(cdkObject) {
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
        software.amazon.awscdk.services.codepipeline.actions.S3DeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3DeployAction.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3DeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3DeployAction {
      val builderImpl = BuilderImpl()
      return S3DeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3DeployAction):
        S3DeployAction = S3DeployAction(cdkObject)

    internal fun unwrap(wrapped: S3DeployAction):
        software.amazon.awscdk.services.codepipeline.actions.S3DeployAction = wrapped.cdkObject
  }
}
