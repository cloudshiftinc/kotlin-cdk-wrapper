@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface TriggerOptions {
  public fun executeAfter(): List<Construct> = unwrap(this).getExecuteAfter()?.map(Construct::wrap)
      ?: emptyList()

  public fun executeBefore(): List<Construct> =
      unwrap(this).getExecuteBefore()?.map(Construct::wrap) ?: emptyList()

  public fun executeOnHandlerChange(): Boolean? = unwrap(this).getExecuteOnHandlerChange()

  @CdkDslMarker
  public interface Builder {
    public fun executeAfter(executeAfter: List<Construct>)

    public fun executeAfter(vararg executeAfter: Construct)

    public fun executeBefore(executeBefore: List<Construct>)

    public fun executeBefore(vararg executeBefore: Construct)

    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.triggers.TriggerOptions.Builder =
        software.amazon.awscdk.triggers.TriggerOptions.builder()

    override fun executeAfter(executeAfter: List<Construct>) {
      cdkBuilder.executeAfter(executeAfter.map(Construct::unwrap))
    }

    override fun executeAfter(vararg executeAfter: Construct): Unit =
        executeAfter(executeAfter.toList())

    override fun executeBefore(executeBefore: List<Construct>) {
      cdkBuilder.executeBefore(executeBefore.map(Construct::unwrap))
    }

    override fun executeBefore(vararg executeBefore: Construct): Unit =
        executeBefore(executeBefore.toList())

    override fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
      cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    public fun build(): software.amazon.awscdk.triggers.TriggerOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.triggers.TriggerOptions,
  ) : CdkObject(cdkObject), TriggerOptions {
    override fun executeAfter(): List<Construct> =
        unwrap(this).getExecuteAfter()?.map(Construct::wrap) ?: emptyList()

    override fun executeBefore(): List<Construct> =
        unwrap(this).getExecuteBefore()?.map(Construct::wrap) ?: emptyList()

    override fun executeOnHandlerChange(): Boolean? = unwrap(this).getExecuteOnHandlerChange()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TriggerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.TriggerOptions): TriggerOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TriggerOptions): software.amazon.awscdk.triggers.TriggerOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.triggers.TriggerOptions
  }
}
