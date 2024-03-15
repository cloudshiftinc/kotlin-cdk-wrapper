@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTrustAnchorProps {
  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun name(): String

  public fun notificationSettings(): Any? = unwrap(this).getNotificationSettings()

  public fun source(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun name(name: String)

    public fun notificationSettings(notificationSettings: IResolvable)

    public fun notificationSettings(notificationSettings: List<Any>)

    public fun notificationSettings(vararg notificationSettings: Any)

    public fun source(source: IResolvable)

    public fun source(source: CfnTrustAnchor.SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5416a12a5f11415d062edffe9e877454d1adaba2dd108e8baccc432b71b61f50")
    public fun source(source: CfnTrustAnchor.SourceProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps.builder()

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun notificationSettings(notificationSettings: IResolvable) {
      cdkBuilder.notificationSettings(notificationSettings.let(IResolvable::unwrap))
    }

    override fun notificationSettings(notificationSettings: List<Any>) {
      cdkBuilder.notificationSettings(notificationSettings)
    }

    override fun notificationSettings(vararg notificationSettings: Any): Unit =
        notificationSettings(notificationSettings.toList())

    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    override fun source(source: CfnTrustAnchor.SourceProperty) {
      cdkBuilder.source(source.let(CfnTrustAnchor.SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5416a12a5f11415d062edffe9e877454d1adaba2dd108e8baccc432b71b61f50")
    override fun source(source: CfnTrustAnchor.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnTrustAnchor.SourceProperty(source))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps,
  ) : CdkObject(cdkObject), CfnTrustAnchorProps {
    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun name(): String = unwrap(this).getName()

    override fun notificationSettings(): Any? = unwrap(this).getNotificationSettings()

    override fun source(): Any = unwrap(this).getSource()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrustAnchorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps):
        CfnTrustAnchorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrustAnchorProps):
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps
  }
}
