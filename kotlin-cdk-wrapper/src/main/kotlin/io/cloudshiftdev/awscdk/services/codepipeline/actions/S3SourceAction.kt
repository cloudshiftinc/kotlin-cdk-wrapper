@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class S3SourceAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.S3SourceAction,
) : Action(cdkObject) {
  public open fun variables(): S3SourceVariables =
      unwrap(this).getVariables().let(S3SourceVariables::wrap)

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
        software.amazon.awscdk.services.codepipeline.actions.S3SourceAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3SourceAction.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3SourceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceAction {
      val builderImpl = BuilderImpl()
      return S3SourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceAction):
        S3SourceAction = S3SourceAction(cdkObject)

    internal fun unwrap(wrapped: S3SourceAction):
        software.amazon.awscdk.services.codepipeline.actions.S3SourceAction = wrapped.cdkObject
  }
}
