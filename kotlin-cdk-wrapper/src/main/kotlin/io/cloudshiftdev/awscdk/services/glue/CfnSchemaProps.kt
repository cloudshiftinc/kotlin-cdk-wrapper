@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnSchemaProps {
  public fun checkpointVersion(): Any? = unwrap(this).getCheckpointVersion()

  public fun compatibility(): String

  public fun dataFormat(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun registry(): Any? = unwrap(this).getRegistry()

  public fun schemaDefinition(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun checkpointVersion(checkpointVersion: IResolvable)

    public fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c75c07562ce15d37ae224d124cc10908c5ef5ab588e50650b14d02e8490a8b58")
    public
        fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty.Builder.() -> Unit)

    public fun compatibility(compatibility: String)

    public fun dataFormat(dataFormat: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun registry(registry: IResolvable)

    public fun registry(registry: CfnSchema.RegistryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a3b2596fa4c40d4f30a161754f91ae2d6312f4b95f42094a100c0e572dce546")
    public fun registry(registry: CfnSchema.RegistryProperty.Builder.() -> Unit)

    public fun schemaDefinition(schemaDefinition: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchemaProps.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaProps.builder()

    override fun checkpointVersion(checkpointVersion: IResolvable) {
      cdkBuilder.checkpointVersion(checkpointVersion.let(IResolvable::unwrap))
    }

    override fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty) {
      cdkBuilder.checkpointVersion(checkpointVersion.let(CfnSchema.SchemaVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c75c07562ce15d37ae224d124cc10908c5ef5ab588e50650b14d02e8490a8b58")
    override
        fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty.Builder.() -> Unit):
        Unit = checkpointVersion(CfnSchema.SchemaVersionProperty(checkpointVersion))

    override fun compatibility(compatibility: String) {
      cdkBuilder.compatibility(compatibility)
    }

    override fun dataFormat(dataFormat: String) {
      cdkBuilder.dataFormat(dataFormat)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun registry(registry: IResolvable) {
      cdkBuilder.registry(registry.let(IResolvable::unwrap))
    }

    override fun registry(registry: CfnSchema.RegistryProperty) {
      cdkBuilder.registry(registry.let(CfnSchema.RegistryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a3b2596fa4c40d4f30a161754f91ae2d6312f4b95f42094a100c0e572dce546")
    override fun registry(registry: CfnSchema.RegistryProperty.Builder.() -> Unit): Unit =
        registry(CfnSchema.RegistryProperty(registry))

    override fun schemaDefinition(schemaDefinition: String) {
      cdkBuilder.schemaDefinition(schemaDefinition)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.glue.CfnSchemaProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaProps,
  ) : CdkObject(cdkObject), CfnSchemaProps {
    override fun checkpointVersion(): Any? = unwrap(this).getCheckpointVersion()

    override fun compatibility(): String = unwrap(this).getCompatibility()

    override fun dataFormat(): String = unwrap(this).getDataFormat()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun registry(): Any? = unwrap(this).getRegistry()

    override fun schemaDefinition(): String = unwrap(this).getSchemaDefinition()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchemaProps):
        CfnSchemaProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaProps):
        software.amazon.awscdk.services.glue.CfnSchemaProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnSchemaProps
  }
}
