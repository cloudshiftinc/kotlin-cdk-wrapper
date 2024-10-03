@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * The input properties for an event target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * RuleTargetInputProperties ruleTargetInputProperties = RuleTargetInputProperties.builder()
 * .input("input")
 * .inputPath("inputPath")
 * .inputPathsMap(Map.of(
 * "inputPathsMapKey", "inputPathsMap"))
 * .inputTemplate("inputTemplate")
 * .build();
 * ```
 */
public interface RuleTargetInputProperties {
  /**
   * Literal input to the target service (must be valid JSON).
   *
   * Default: - input for the event target. If the input contains a paths map
   * values wil be extracted from event and inserted into the `inputTemplate`.
   */
  public fun input(): String? = unwrap(this).getInput()

  /**
   * JsonPath to take input from the input event.
   *
   * Default: - None. The entire matched event is passed as input
   */
  public fun inputPath(): String? = unwrap(this).getInputPath()

  /**
   * Paths map to extract values from event and insert into `inputTemplate`.
   *
   * Default: - No values extracted from event.
   */
  public fun inputPathsMap(): Map<String, String> = unwrap(this).getInputPathsMap() ?: emptyMap()

  /**
   * Input template to insert paths map into.
   *
   * Default: - None.
   */
  public fun inputTemplate(): String? = unwrap(this).getInputTemplate()

  /**
   * A builder for [RuleTargetInputProperties]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param input Literal input to the target service (must be valid JSON).
     */
    public fun input(input: String)

    /**
     * @param inputPath JsonPath to take input from the input event.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param inputPathsMap Paths map to extract values from event and insert into `inputTemplate`.
     */
    public fun inputPathsMap(inputPathsMap: Map<String, String>)

    /**
     * @param inputTemplate Input template to insert paths map into.
     */
    public fun inputTemplate(inputTemplate: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.RuleTargetInputProperties.Builder
        = software.amazon.awscdk.services.events.RuleTargetInputProperties.builder()

    /**
     * @param input Literal input to the target service (must be valid JSON).
     */
    override fun input(input: String) {
      cdkBuilder.input(input)
    }

    /**
     * @param inputPath JsonPath to take input from the input event.
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param inputPathsMap Paths map to extract values from event and insert into `inputTemplate`.
     */
    override fun inputPathsMap(inputPathsMap: Map<String, String>) {
      cdkBuilder.inputPathsMap(inputPathsMap)
    }

    /**
     * @param inputTemplate Input template to insert paths map into.
     */
    override fun inputTemplate(inputTemplate: String) {
      cdkBuilder.inputTemplate(inputTemplate)
    }

    public fun build(): software.amazon.awscdk.services.events.RuleTargetInputProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.RuleTargetInputProperties,
  ) : CdkObject(cdkObject),
      RuleTargetInputProperties {
    /**
     * Literal input to the target service (must be valid JSON).
     *
     * Default: - input for the event target. If the input contains a paths map
     * values wil be extracted from event and inserted into the `inputTemplate`.
     */
    override fun input(): String? = unwrap(this).getInput()

    /**
     * JsonPath to take input from the input event.
     *
     * Default: - None. The entire matched event is passed as input
     */
    override fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * Paths map to extract values from event and insert into `inputTemplate`.
     *
     * Default: - No values extracted from event.
     */
    override fun inputPathsMap(): Map<String, String> = unwrap(this).getInputPathsMap() ?:
        emptyMap()

    /**
     * Input template to insert paths map into.
     *
     * Default: - None.
     */
    override fun inputTemplate(): String? = unwrap(this).getInputTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleTargetInputProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleTargetInputProperties):
        RuleTargetInputProperties = CdkObjectWrappers.wrap(cdkObject) as? RuleTargetInputProperties
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleTargetInputProperties):
        software.amazon.awscdk.services.events.RuleTargetInputProperties = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.RuleTargetInputProperties
  }
}
