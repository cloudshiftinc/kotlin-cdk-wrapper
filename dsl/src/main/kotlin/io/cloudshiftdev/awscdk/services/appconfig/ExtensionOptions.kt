package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ExtensionOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun extensionName(): String? = unwrap(this).getExtensionName()

  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap) ?:
      emptyList()

  public interface Builder {
    public fun description(description: String)

    public fun extensionName(extensionName: String)

    public fun latestVersionNumber(latestVersionNumber: Number)

    public fun parameters(parameters: List<Parameter>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ExtensionOptions.Builder =
        software.amazon.awscdk.services.appconfig.ExtensionOptions.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun extensionName(extensionName: String) {
      cdkBuilder.extensionName(extensionName)
    }

    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    override fun parameters(parameters: List<Parameter>) {
      cdkBuilder.parameters(parameters.map(Parameter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.ExtensionOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.ExtensionOptions,
  ) : ExtensionOptions {
    override fun description(): String? = unwrap(this).getDescription()

    override fun extensionName(): String? = unwrap(this).getExtensionName()

    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    override fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap)
        ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ExtensionOptions):
        ExtensionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtensionOptions):
        software.amazon.awscdk.services.appconfig.ExtensionOptions = (wrapped as Wrapper).cdkObject
  }
}
