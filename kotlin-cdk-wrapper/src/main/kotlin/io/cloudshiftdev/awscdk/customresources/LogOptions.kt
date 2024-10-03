@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.stepfunctions.LogLevel
import kotlin.Boolean
import kotlin.Unit

/**
 * Log Options for the state machine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.customresources.*;
 * LogGroup logGroup;
 * LogOptions logOptions = LogOptions.builder()
 * .destination(logGroup)
 * .includeExecutionData(false)
 * .level(LogLevel.OFF)
 * .build();
 * ```
 */
public interface LogOptions {
  /**
   * The log group where the execution history events will be logged.
   *
   * Default: - a new log group will be created
   */
  public fun destination(): ILogGroup? = unwrap(this).getDestination()?.let(ILogGroup::wrap)

  /**
   * Determines whether execution data is included in your log.
   *
   * Default: - false
   */
  public fun includeExecutionData(): Boolean? = unwrap(this).getIncludeExecutionData()

  /**
   * Defines which category of execution history events are logged.
   *
   * Default: - ERROR
   */
  public fun level(): LogLevel? = unwrap(this).getLevel()?.let(LogLevel::wrap)

  /**
   * A builder for [LogOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination The log group where the execution history events will be logged.
     */
    public fun destination(destination: ILogGroup)

    /**
     * @param includeExecutionData Determines whether execution data is included in your log.
     */
    public fun includeExecutionData(includeExecutionData: Boolean)

    /**
     * @param level Defines which category of execution history events are logged.
     */
    public fun level(level: LogLevel)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.LogOptions.Builder =
        software.amazon.awscdk.customresources.LogOptions.builder()

    /**
     * @param destination The log group where the execution history events will be logged.
     */
    override fun destination(destination: ILogGroup) {
      cdkBuilder.destination(destination.let(ILogGroup.Companion::unwrap))
    }

    /**
     * @param includeExecutionData Determines whether execution data is included in your log.
     */
    override fun includeExecutionData(includeExecutionData: Boolean) {
      cdkBuilder.includeExecutionData(includeExecutionData)
    }

    /**
     * @param level Defines which category of execution history events are logged.
     */
    override fun level(level: LogLevel) {
      cdkBuilder.level(level.let(LogLevel.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.customresources.LogOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.customresources.LogOptions,
  ) : CdkObject(cdkObject),
      LogOptions {
    /**
     * The log group where the execution history events will be logged.
     *
     * Default: - a new log group will be created
     */
    override fun destination(): ILogGroup? = unwrap(this).getDestination()?.let(ILogGroup::wrap)

    /**
     * Determines whether execution data is included in your log.
     *
     * Default: - false
     */
    override fun includeExecutionData(): Boolean? = unwrap(this).getIncludeExecutionData()

    /**
     * Defines which category of execution history events are logged.
     *
     * Default: - ERROR
     */
    override fun level(): LogLevel? = unwrap(this).getLevel()?.let(LogLevel::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.LogOptions): LogOptions =
        CdkObjectWrappers.wrap(cdkObject) as? LogOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogOptions): software.amazon.awscdk.customresources.LogOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.customresources.LogOptions
  }
}
