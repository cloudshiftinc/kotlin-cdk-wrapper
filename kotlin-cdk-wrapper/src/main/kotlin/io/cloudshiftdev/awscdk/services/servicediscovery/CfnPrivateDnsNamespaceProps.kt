@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPrivateDnsNamespaceProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun properties(): Any? = unwrap(this).getProperties()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpc(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun properties(properties: IResolvable)

    public fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b8744b5d0664d6548bb00c62ea9f8b0ee22b089a86783a9d4973be07766e7a7")
    public fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpc(vpc: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    override fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty) {
      cdkBuilder.properties(properties.let(CfnPrivateDnsNamespace.PropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b8744b5d0664d6548bb00c62ea9f8b0ee22b089a86783a9d4973be07766e7a7")
    override
        fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty.Builder.() -> Unit):
        Unit = properties(CfnPrivateDnsNamespace.PropertiesProperty(properties))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpc(vpc: String) {
      cdkBuilder.vpc(vpc)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps,
  ) : CdkObject(cdkObject), CfnPrivateDnsNamespaceProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun properties(): Any? = unwrap(this).getProperties()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpc(): String = unwrap(this).getVpc()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrivateDnsNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps):
        CfnPrivateDnsNamespaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrivateDnsNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
  }
}
