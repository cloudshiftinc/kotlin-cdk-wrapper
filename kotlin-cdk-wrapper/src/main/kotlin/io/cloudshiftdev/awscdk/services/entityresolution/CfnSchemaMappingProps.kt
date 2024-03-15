@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSchemaMappingProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun mappedInputFields(): Any

  public fun schemaName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun mappedInputFields(mappedInputFields: IResolvable)

    public fun mappedInputFields(mappedInputFields: List<Any>)

    public fun mappedInputFields(vararg mappedInputFields: Any)

    public fun schemaName(schemaName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps.Builder =
        software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun mappedInputFields(mappedInputFields: IResolvable) {
      cdkBuilder.mappedInputFields(mappedInputFields.let(IResolvable::unwrap))
    }

    override fun mappedInputFields(mappedInputFields: List<Any>) {
      cdkBuilder.mappedInputFields(mappedInputFields)
    }

    override fun mappedInputFields(vararg mappedInputFields: Any): Unit =
        mappedInputFields(mappedInputFields.toList())

    override fun schemaName(schemaName: String) {
      cdkBuilder.schemaName(schemaName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps,
  ) : CdkObject(cdkObject), CfnSchemaMappingProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun mappedInputFields(): Any = unwrap(this).getMappedInputFields()

    override fun schemaName(): String = unwrap(this).getSchemaName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps):
        CfnSchemaMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaMappingProps):
        software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps
  }
}
