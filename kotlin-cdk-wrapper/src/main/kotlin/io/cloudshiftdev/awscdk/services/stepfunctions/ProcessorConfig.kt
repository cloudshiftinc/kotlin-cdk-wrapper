@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Specifies the configuration for the processor Map state.
 *
 * Example:
 *
 * ```
 * Map map = Map.Builder.create(this, "Map State")
 * .maxConcurrency(1)
 * .itemsPath(JsonPath.stringAt("$.inputForMap"))
 * .itemSelector(Map.of(
 * "item", JsonPath.stringAt("$.Map.Item.Value")))
 * .resultPath("$.mapOutput")
 * .build();
 * map.itemProcessor(new Pass(this, "Pass State"), ProcessorConfig.builder()
 * .mode(ProcessorMode.DISTRIBUTED)
 * .executionType(ProcessorType.STANDARD)
 * .build());
 * ```
 */
public interface ProcessorConfig {
  /**
   * Specifies the execution type for the Map workflow.
   *
   * You must provide this field if you specified `DISTRIBUTED` for the `mode` sub-field.
   *
   * Default: - no execution type
   */
  public fun executionType(): ProcessorType? =
      unwrap(this).getExecutionType()?.let(ProcessorType::wrap)

  /**
   * Specifies the execution mode for the Map workflow.
   *
   * Default: - ProcessorMode.INLINE
   */
  public fun mode(): ProcessorMode? = unwrap(this).getMode()?.let(ProcessorMode::wrap)

  /**
   * A builder for [ProcessorConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param executionType Specifies the execution type for the Map workflow.
     * You must provide this field if you specified `DISTRIBUTED` for the `mode` sub-field.
     */
    public fun executionType(executionType: ProcessorType)

    /**
     * @param mode Specifies the execution mode for the Map workflow.
     */
    public fun mode(mode: ProcessorMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ProcessorConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.ProcessorConfig.builder()

    /**
     * @param executionType Specifies the execution type for the Map workflow.
     * You must provide this field if you specified `DISTRIBUTED` for the `mode` sub-field.
     */
    override fun executionType(executionType: ProcessorType) {
      cdkBuilder.executionType(executionType.let(ProcessorType.Companion::unwrap))
    }

    /**
     * @param mode Specifies the execution mode for the Map workflow.
     */
    override fun mode(mode: ProcessorMode) {
      cdkBuilder.mode(mode.let(ProcessorMode.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ProcessorConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.ProcessorConfig,
  ) : CdkObject(cdkObject), ProcessorConfig {
    /**
     * Specifies the execution type for the Map workflow.
     *
     * You must provide this field if you specified `DISTRIBUTED` for the `mode` sub-field.
     *
     * Default: - no execution type
     */
    override fun executionType(): ProcessorType? =
        unwrap(this).getExecutionType()?.let(ProcessorType::wrap)

    /**
     * Specifies the execution mode for the Map workflow.
     *
     * Default: - ProcessorMode.INLINE
     */
    override fun mode(): ProcessorMode? = unwrap(this).getMode()?.let(ProcessorMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ProcessorConfig):
        ProcessorConfig = CdkObjectWrappers.wrap(cdkObject) as? ProcessorConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProcessorConfig):
        software.amazon.awscdk.services.stepfunctions.ProcessorConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ProcessorConfig
  }
}
