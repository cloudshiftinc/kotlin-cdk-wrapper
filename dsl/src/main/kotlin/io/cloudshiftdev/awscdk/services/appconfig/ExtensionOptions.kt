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
    public fun description(description: String) {
    }

    public fun extensionName(extensionName: String) {
    }

    public fun latestVersionNumber(latestVersionNumber: Number) {
    }

    public fun parameters(parameters: List<Parameter>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ExtensionOptions.Builder =
        software.amazon.awscdk.services.appconfig.ExtensionOptions.builder()

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun extensionName(extensionName: String) {
      cdkBuilder.extensionName(extensionName)
    }

    public override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    public override fun parameters(parameters: List<Parameter>) {
      cdkBuilder.parameters(parameters.map(Parameter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.ExtensionOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.ExtensionOptions,
  ) : ExtensionOptions {
    public override fun description(): String? = unwrap(this).getDescription()

    public override fun extensionName(): String? = unwrap(this).getExtensionName()

    public override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    public override fun parameters(): List<Parameter> =
        unwrap(this).getParameters()?.map(Parameter::wrap) ?: emptyList()
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
