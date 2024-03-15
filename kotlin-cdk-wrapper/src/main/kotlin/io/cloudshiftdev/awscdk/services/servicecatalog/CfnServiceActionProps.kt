@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnServiceActionProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun definition(): Any

  public fun definitionType(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun definition(definition: IResolvable)

    public fun definition(definition: List<Any>)

    public fun definition(vararg definition: Any)

    public fun definitionType(definitionType: String)

    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps,
  ) : CdkObject(cdkObject), CfnServiceActionProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun definition(): Any = unwrap(this).getDefinition()

    override fun definitionType(): String = unwrap(this).getDefinitionType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps):
        CfnServiceActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceActionProps):
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps
  }
}
