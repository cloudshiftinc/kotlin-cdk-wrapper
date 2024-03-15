@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.actions.S3Trigger
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface S3SourceOptions {
  public fun actionName(): String? = unwrap(this).getActionName()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun trigger(): S3Trigger? = unwrap(this).getTrigger()?.let(S3Trigger::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun role(role: IRole)

    public fun trigger(trigger: S3Trigger)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.S3SourceOptions.Builder =
        software.amazon.awscdk.pipelines.S3SourceOptions.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun trigger(trigger: S3Trigger) {
      cdkBuilder.trigger(trigger.let(S3Trigger::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.S3SourceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.S3SourceOptions,
  ) : CdkObject(cdkObject), S3SourceOptions {
    override fun actionName(): String? = unwrap(this).getActionName()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun trigger(): S3Trigger? = unwrap(this).getTrigger()?.let(S3Trigger::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.S3SourceOptions): S3SourceOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3SourceOptions): software.amazon.awscdk.pipelines.S3SourceOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.S3SourceOptions
  }
}
