@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnAttributeGroupProps {
  public fun attributes(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun attributes(attributes: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps.Builder =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps.builder()

    override fun attributes(attributes: Any) {
      cdkBuilder.attributes(attributes)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps,
  ) : CdkObject(cdkObject), CfnAttributeGroupProps {
    override fun attributes(): Any = unwrap(this).getAttributes()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAttributeGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps):
        CfnAttributeGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAttributeGroupProps):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps
  }
}
