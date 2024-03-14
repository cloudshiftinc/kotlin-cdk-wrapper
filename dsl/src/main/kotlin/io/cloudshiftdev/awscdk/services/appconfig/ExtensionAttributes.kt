package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ExtensionAttributes {
  public fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun extensionArn(): String? = unwrap(this).getExtensionArn()

  public fun extensionId(): String

  public fun extensionVersionNumber(): Number

  public fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun actions(actions: List<Action>) {
    }

    public fun description(description: String) {
    }

    public fun extensionArn(extensionArn: String) {
    }

    public fun extensionId(extensionId: String) {
    }

    public fun extensionVersionNumber(extensionVersionNumber: Number) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ExtensionAttributes.Builder =
        software.amazon.awscdk.services.appconfig.ExtensionAttributes.builder()

    public override fun actions(actions: List<Action>) {
      cdkBuilder.actions(actions.map(Action::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun extensionArn(extensionArn: String) {
      cdkBuilder.extensionArn(extensionArn)
    }

    public override fun extensionId(extensionId: String) {
      cdkBuilder.extensionId(extensionId)
    }

    public override fun extensionVersionNumber(extensionVersionNumber: Number) {
      cdkBuilder.extensionVersionNumber(extensionVersionNumber)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.ExtensionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.ExtensionAttributes,
  ) : ExtensionAttributes {
    public override fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?:
        emptyList()

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun extensionArn(): String? = unwrap(this).getExtensionArn()

    public override fun extensionId(): String = unwrap(this).getExtensionId()

    public override fun extensionVersionNumber(): Number = unwrap(this).getExtensionVersionNumber()

    public override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ExtensionAttributes):
        ExtensionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtensionAttributes):
        software.amazon.awscdk.services.appconfig.ExtensionAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
