@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for the Extension construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * Parameter parameter;
 * ExtensionOptions extensionOptions = ExtensionOptions.builder()
 * .description("description")
 * .extensionName("extensionName")
 * .latestVersionNumber(123)
 * .parameters(List.of(parameter))
 * .build();
 * ```
 */
public interface ExtensionOptions {
  /**
   * A description of the extension.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the extension.
   *
   * Default: - A name is generated.
   */
  public fun extensionName(): String? = unwrap(this).getExtensionName()

  /**
   * The latest version number of the extension.
   *
   * When you create a new version,
   * specify the most recent current version number. For example, you create version 3,
   * enter 2 for this field.
   *
   * Default: - None.
   */
  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * The parameters accepted for the extension.
   *
   * Default: - None.
   */
  public fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap) ?:
      emptyList()

  /**
   * A builder for [ExtensionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the extension.
     */
    public fun description(description: String)

    /**
     * @param extensionName The name of the extension.
     */
    public fun extensionName(extensionName: String)

    /**
     * @param latestVersionNumber The latest version number of the extension.
     * When you create a new version,
     * specify the most recent current version number. For example, you create version 3,
     * enter 2 for this field.
     */
    public fun latestVersionNumber(latestVersionNumber: Number)

    /**
     * @param parameters The parameters accepted for the extension.
     */
    public fun parameters(parameters: List<Parameter>)

    /**
     * @param parameters The parameters accepted for the extension.
     */
    public fun parameters(vararg parameters: Parameter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ExtensionOptions.Builder =
        software.amazon.awscdk.services.appconfig.ExtensionOptions.builder()

    /**
     * @param description A description of the extension.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param extensionName The name of the extension.
     */
    override fun extensionName(extensionName: String) {
      cdkBuilder.extensionName(extensionName)
    }

    /**
     * @param latestVersionNumber The latest version number of the extension.
     * When you create a new version,
     * specify the most recent current version number. For example, you create version 3,
     * enter 2 for this field.
     */
    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * @param parameters The parameters accepted for the extension.
     */
    override fun parameters(parameters: List<Parameter>) {
      cdkBuilder.parameters(parameters.map(Parameter.Companion::unwrap))
    }

    /**
     * @param parameters The parameters accepted for the extension.
     */
    override fun parameters(vararg parameters: Parameter): Unit = parameters(parameters.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.ExtensionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.ExtensionOptions,
  ) : CdkObject(cdkObject),
      ExtensionOptions {
    /**
     * A description of the extension.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the extension.
     *
     * Default: - A name is generated.
     */
    override fun extensionName(): String? = unwrap(this).getExtensionName()

    /**
     * The latest version number of the extension.
     *
     * When you create a new version,
     * specify the most recent current version number. For example, you create version 3,
     * enter 2 for this field.
     *
     * Default: - None.
     */
    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    /**
     * The parameters accepted for the extension.
     *
     * Default: - None.
     */
    override fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap)
        ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ExtensionOptions):
        ExtensionOptions = CdkObjectWrappers.wrap(cdkObject) as? ExtensionOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtensionOptions):
        software.amazon.awscdk.services.appconfig.ExtensionOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ExtensionOptions
  }
}
