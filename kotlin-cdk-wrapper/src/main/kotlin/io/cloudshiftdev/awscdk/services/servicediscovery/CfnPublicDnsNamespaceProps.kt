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

public interface CfnPublicDnsNamespaceProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun properties(): Any? = unwrap(this).getProperties()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun properties(properties: IResolvable)

    public fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c478bcb7470b1df94da8365888b982b64591c69a2cc230a276c7fdde2643e38")
    public fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    override fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty) {
      cdkBuilder.properties(properties.let(CfnPublicDnsNamespace.PropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c478bcb7470b1df94da8365888b982b64591c69a2cc230a276c7fdde2643e38")
    override
        fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty.Builder.() -> Unit):
        Unit = properties(CfnPublicDnsNamespace.PropertiesProperty(properties))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps,
  ) : CdkObject(cdkObject), CfnPublicDnsNamespaceProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun properties(): Any? = unwrap(this).getProperties()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicDnsNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps):
        CfnPublicDnsNamespaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublicDnsNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
  }
}
