package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ExtensionProps : ExtensionOptions {
  /**
   * The actions for the extension.
   */
  public fun actions(): List<Action>

  /**
   * A builder for [ExtensionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions for the extension. 
     */
    public fun actions(actions: List<Action>)

    /**
     * @param actions The actions for the extension. 
     */
    public fun actions(vararg actions: Action)

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
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ExtensionProps.Builder =
        software.amazon.awscdk.services.appconfig.ExtensionProps.builder()

    /**
     * @param actions The actions for the extension. 
     */
    override fun actions(actions: List<Action>) {
      cdkBuilder.actions(actions.map(Action::unwrap))
    }

    /**
     * @param actions The actions for the extension. 
     */
    override fun actions(vararg actions: Action): Unit = actions(actions.toList())

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
      cdkBuilder.parameters(parameters.map(Parameter::unwrap))
    }

    /**
     * @param parameters The parameters accepted for the extension.
     */
    override fun parameters(vararg parameters: Parameter): Unit = parameters(parameters.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.ExtensionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ExtensionProps,
  ) : CdkObject(cdkObject), ExtensionProps {
    /**
     * The actions for the extension.
     */
    override fun actions(): List<Action> = unwrap(this).getActions().map(Action::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ExtensionProps):
        ExtensionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtensionProps):
        software.amazon.awscdk.services.appconfig.ExtensionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appconfig.ExtensionProps
  }
}
