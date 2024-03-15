@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnListenerProps {
  public fun defaultAction(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun port(): Number? = unwrap(this).getPort()

  public fun protocol(): String

  public fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun defaultAction(defaultAction: IResolvable)

    public fun defaultAction(defaultAction: CfnListener.DefaultActionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7daaf940f20fcfd6eb61efd65478f8466ed33ef8bedba28e936ff918913ca348")
    public fun defaultAction(defaultAction: CfnListener.DefaultActionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun port(port: Number)

    public fun protocol(protocol: String)

    public fun serviceIdentifier(serviceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnListenerProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnListenerProps.builder()

    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    override fun defaultAction(defaultAction: CfnListener.DefaultActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(CfnListener.DefaultActionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7daaf940f20fcfd6eb61efd65478f8466ed33ef8bedba28e936ff918913ca348")
    override fun defaultAction(defaultAction: CfnListener.DefaultActionProperty.Builder.() -> Unit):
        Unit = defaultAction(CfnListener.DefaultActionProperty(defaultAction))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnListenerProps,
  ) : CdkObject(cdkObject), CfnListenerProps {
    override fun defaultAction(): Any = unwrap(this).getDefaultAction()

    override fun name(): String? = unwrap(this).getName()

    override fun port(): Number? = unwrap(this).getPort()

    override fun protocol(): String = unwrap(this).getProtocol()

    override fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListenerProps):
        CfnListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerProps):
        software.amazon.awscdk.services.vpclattice.CfnListenerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnListenerProps
  }
}
