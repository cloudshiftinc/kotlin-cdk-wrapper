@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ConnectionSourceOptions {
  public fun actionName(): String? = unwrap(this).getActionName()

  public fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

  public fun connectionArn(): String

  public fun triggerOnPush(): Boolean? = unwrap(this).getTriggerOnPush()

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    public fun connectionArn(connectionArn: String)

    public fun triggerOnPush(triggerOnPush: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ConnectionSourceOptions.Builder =
        software.amazon.awscdk.pipelines.ConnectionSourceOptions.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
      cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun triggerOnPush(triggerOnPush: Boolean) {
      cdkBuilder.triggerOnPush(triggerOnPush)
    }

    public fun build(): software.amazon.awscdk.pipelines.ConnectionSourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ConnectionSourceOptions,
  ) : CdkObject(cdkObject), ConnectionSourceOptions {
    override fun actionName(): String? = unwrap(this).getActionName()

    override fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    override fun triggerOnPush(): Boolean? = unwrap(this).getTriggerOnPush()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ConnectionSourceOptions):
        ConnectionSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionSourceOptions):
        software.amazon.awscdk.pipelines.ConnectionSourceOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.pipelines.ConnectionSourceOptions
  }
}
