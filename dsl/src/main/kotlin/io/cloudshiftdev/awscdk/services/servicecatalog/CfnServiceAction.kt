package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServiceAction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceAction,
) : CfnResource(cdkObject), IInspectable {
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun definition(): Any = unwrap(this).getDefinition()

  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun definition(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefinition(__idx_ac66f0)
  }

  public open fun definition(vararg __idx_ac66f0: Any): Unit = definition(__idx_ac66f0.toList())

  public open fun definitionType(): String = unwrap(this).getDefinitionType()

  public open fun definitionType(`value`: String) {
    unwrap(this).setDefinitionType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun definition(definition: IResolvable)

    public fun definition(definition: List<Any>)

    public fun definition(vararg definition: Any)

    public fun definitionType(definitionType: String)

    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnServiceAction.Builder
        = software.amazon.awscdk.services.servicecatalog.CfnServiceAction.Builder.create(scope, id)

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: List<Any>) {
      cdkBuilder.definition(definition)
    }

    override fun definition(vararg definition: Any): Unit = definition(definition.toList())

    override fun definitionType(definitionType: String) {
      cdkBuilder.definitionType(definitionType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnServiceAction =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceAction):
        CfnServiceAction = CfnServiceAction(cdkObject)

    internal fun unwrap(wrapped: CfnServiceAction):
        software.amazon.awscdk.services.servicecatalog.CfnServiceAction = wrapped.cdkObject
  }

  public interface DefinitionParameterProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty,
    ) : DefinitionParameterProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty):
          DefinitionParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefinitionParameterProperty):
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
