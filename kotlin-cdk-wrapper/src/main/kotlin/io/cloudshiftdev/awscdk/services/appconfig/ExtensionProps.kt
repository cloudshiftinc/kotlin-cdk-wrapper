@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ExtensionProps : ExtensionOptions {
  public fun actions(): List<Action>

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: List<Action>)

    public fun actions(vararg actions: Action)

    public fun description(description: String)

    public fun extensionName(extensionName: String)

    public fun latestVersionNumber(latestVersionNumber: Number)

    public fun parameters(parameters: List<Parameter>)

    public fun parameters(vararg parameters: Parameter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ExtensionProps.Builder =
        software.amazon.awscdk.services.appconfig.ExtensionProps.builder()

    override fun actions(actions: List<Action>) {
      cdkBuilder.actions(actions.map(Action::unwrap))
    }

    override fun actions(vararg actions: Action): Unit = actions(actions.toList())

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

    public fun build(): software.amazon.awscdk.services.appconfig.ExtensionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ExtensionProps,
  ) : CdkObject(cdkObject), ExtensionProps {
    override fun actions(): List<Action> = unwrap(this).getActions().map(Action::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun extensionName(): String? = unwrap(this).getExtensionName()

    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

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
