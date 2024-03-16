@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for `Trigger`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.triggers.*;
 * import software.constructs.*;
 * Construct construct;
 * TriggerOptions triggerOptions = TriggerOptions.builder()
 * .executeAfter(List.of(construct))
 * .executeBefore(List.of(construct))
 * .executeOnHandlerChange(false)
 * .build();
 * ```
 */
public interface TriggerOptions {
  /**
   * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
   * provisioned.
   *
   * You can also use `trigger.executeAfter()` to add additional dependencies.
   *
   * Default: []
   */
  public fun executeAfter(): List<Construct> = unwrap(this).getExecuteAfter()?.map(Construct::wrap)
      ?: emptyList()

  /**
   * Adds this trigger as a dependency on other constructs.
   *
   * This means that this
   * trigger will get executed *before* the given construct(s).
   *
   * You can also use `trigger.executeBefore()` to add additional dependants.
   *
   * Default: []
   */
  public fun executeBefore(): List<Construct> =
      unwrap(this).getExecuteBefore()?.map(Construct::wrap) ?: emptyList()

  /**
   * Re-executes the trigger every time the handler changes.
   *
   * This implies that the trigger is associated with the `currentVersion` of
   * the handler, which gets recreated every time the handler or its
   * configuration is updated.
   *
   * Default: true
   */
  public fun executeOnHandlerChange(): Boolean? = unwrap(this).getExecuteOnHandlerChange()

  /**
   * A builder for [TriggerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    public fun executeAfter(executeAfter: List<Construct>)

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    public fun executeAfter(vararg executeAfter: Construct)

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    public fun executeBefore(executeBefore: List<Construct>)

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    public fun executeBefore(vararg executeBefore: Construct)

    /**
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes.
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     */
    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.triggers.TriggerOptions.Builder =
        software.amazon.awscdk.triggers.TriggerOptions.builder()

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    override fun executeAfter(executeAfter: List<Construct>) {
      cdkBuilder.executeAfter(executeAfter.map(Construct::unwrap))
    }

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    override fun executeAfter(vararg executeAfter: Construct): Unit =
        executeAfter(executeAfter.toList())

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    override fun executeBefore(executeBefore: List<Construct>) {
      cdkBuilder.executeBefore(executeBefore.map(Construct::unwrap))
    }

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    override fun executeBefore(vararg executeBefore: Construct): Unit =
        executeBefore(executeBefore.toList())

    /**
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes.
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     */
    override fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
      cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    public fun build(): software.amazon.awscdk.triggers.TriggerOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.triggers.TriggerOptions,
  ) : CdkObject(cdkObject), TriggerOptions {
    /**
     * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
     * provisioned.
     *
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     *
     * Default: []
     */
    override fun executeAfter(): List<Construct> =
        unwrap(this).getExecuteAfter()?.map(Construct::wrap) ?: emptyList()

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     *
     * Default: []
     */
    override fun executeBefore(): List<Construct> =
        unwrap(this).getExecuteBefore()?.map(Construct::wrap) ?: emptyList()

    /**
     * Re-executes the trigger every time the handler changes.
     *
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     *
     * Default: true
     */
    override fun executeOnHandlerChange(): Boolean? = unwrap(this).getExecuteOnHandlerChange()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TriggerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.TriggerOptions): TriggerOptions =
        CdkObjectWrappers.wrap(cdkObject) as TriggerOptions

    internal fun unwrap(wrapped: TriggerOptions): software.amazon.awscdk.triggers.TriggerOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.triggers.TriggerOptions
  }
}
