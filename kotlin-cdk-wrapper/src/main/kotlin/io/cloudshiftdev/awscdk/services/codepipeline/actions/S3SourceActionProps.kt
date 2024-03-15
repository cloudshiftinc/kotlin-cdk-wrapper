@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface S3SourceActionProps : CommonAwsActionProps {
  public fun bucket(): IBucket

  public fun bucketKey(): String

  public fun output(): Artifact

  public fun trigger(): S3Trigger? = unwrap(this).getTrigger()?.let(S3Trigger::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun bucket(bucket: IBucket)

    public fun bucketKey(bucketKey: String)

    public fun output(output: Artifact)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun trigger(trigger: S3Trigger)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun bucketKey(bucketKey: String) {
      cdkBuilder.bucketKey(bucketKey)
    }

    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun trigger(trigger: S3Trigger) {
      cdkBuilder.trigger(trigger.let(S3Trigger::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps,
  ) : CdkObject(cdkObject), S3SourceActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun bucketKey(): String = unwrap(this).getBucketKey()

    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun trigger(): S3Trigger? = unwrap(this).getTrigger()?.let(S3Trigger::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps):
        S3SourceActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3SourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps
  }
}
