@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun extensionName(extensionName: String)

    public fun latestVersionNumber(latestVersionNumber: Number)

    public fun parameters(parameters: List<Parameter>)

    public fun parameters(vararg parameters: Parameter)
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

    override fun parameters(vararg parameters: Parameter): Unit = parameters(parameters.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.ExtensionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ExtensionOptions,
  ) : CdkObject(cdkObject), ExtensionOptions {
    override fun description(): String? = unwrap(this).getDescription()

    override fun extensionName(): String? = unwrap(this).getExtensionName()

    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    override fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap)
        ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ExtensionOptions):
        ExtensionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtensionOptions):
        software.amazon.awscdk.services.appconfig.ExtensionOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ExtensionOptions
  }
}
