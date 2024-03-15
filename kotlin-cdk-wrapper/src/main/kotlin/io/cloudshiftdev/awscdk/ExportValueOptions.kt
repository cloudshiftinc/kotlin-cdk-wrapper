@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Options for the `stack.exportValue()` method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * ExportValueOptions exportValueOptions = ExportValueOptions.builder()
 * .description("description")
 * .name("name")
 * .build();
 * ```
 */
public interface ExportValueOptions {
  /**
   * The description of the outputs.
   *
   * Default: - No description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the export to create.
   *
   * Default: - A name is automatically chosen
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [ExportValueOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the outputs.
     */
    public fun description(description: String)

    /**
     * @param name The name of the export to create.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ExportValueOptions.Builder =
        software.amazon.awscdk.ExportValueOptions.builder()

    /**
     * @param description The description of the outputs.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the export to create.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.ExportValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ExportValueOptions,
  ) : CdkObject(cdkObject), ExportValueOptions {
    /**
     * The description of the outputs.
     *
     * Default: - No description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the export to create.
     *
     * Default: - A name is automatically chosen
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExportValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ExportValueOptions): ExportValueOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExportValueOptions): software.amazon.awscdk.ExportValueOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.ExportValueOptions
  }
}
