@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Extension internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.Extension,
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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.Extension.Builder =
        software.amazon.awscdk.services.appconfig.Extension.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.appconfig.Extension = cdkBuilder.build()
  }

  public companion object {
    public fun fromExtensionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      extensionArn: String,
    ): IExtension =
        software.amazon.awscdk.services.appconfig.Extension.fromExtensionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, extensionArn).let(IExtension::wrap)

    public fun fromExtensionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExtensionAttributes,
    ): IExtension =
        software.amazon.awscdk.services.appconfig.Extension.fromExtensionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ExtensionAttributes::unwrap)).let(IExtension::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce882774c42632542413b4d9b2d595e936136045b89164d48d255b70c42f21ec")
    public fun fromExtensionAttributes(
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
