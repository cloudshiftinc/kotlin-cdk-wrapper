package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Extension internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.Extension,
) : Resource(cdkObject), IExtension {
  public override fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?:
      emptyList()

  public override fun description(): String? = unwrap(this).getDescription()

  public override fun extensionArn(): String = unwrap(this).getExtensionArn()

  public override fun extensionId(): String = unwrap(this).getExtensionId()

  public override fun extensionVersionNumber(): Number = unwrap(this).getExtensionVersionNumber()

  public override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public override fun name(): String? = unwrap(this).getName()

  public override fun parameters(): List<Parameter> =
      unwrap(this).getParameters()?.map(Parameter::wrap) ?: emptyList()

  public interface Builder {
    public fun actions(actions: List<Action>)

    public fun description(description: String)

    public fun extensionName(extensionName: String)

    public fun latestVersionNumber(latestVersionNumber: Number)

    public fun parameters(parameters: List<Parameter>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.Extension.Builder =
        software.amazon.awscdk.services.appconfig.Extension.Builder.create(scope, id)

    override fun actions(actions: List<Action>) {
      cdkBuilder.actions(actions.map(Action::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.appconfig.Extension = cdkBuilder.build()
  }

  public companion object {
    public open fun fromExtensionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      extensionArn: String,
    ): IExtension =
        software.amazon.awscdk.services.appconfig.Extension.fromExtensionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, extensionArn).let(IExtension::wrap)

    public open fun fromExtensionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExtensionAttributes,
    ): IExtension =
        software.amazon.awscdk.services.appconfig.Extension.fromExtensionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ExtensionAttributes::unwrap)).let(IExtension::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce882774c42632542413b4d9b2d595e936136045b89164d48d255b70c42f21ec")
    public open fun fromExtensionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExtensionAttributes.Builder.() -> Unit,
    ): IExtension = fromExtensionAttributes(scope, id, ExtensionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Extension {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Extension(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Extension): Extension =
        Extension(cdkObject)

    internal fun unwrap(wrapped: Extension): software.amazon.awscdk.services.appconfig.Extension =
        wrapped.cdkObject
  }
}
