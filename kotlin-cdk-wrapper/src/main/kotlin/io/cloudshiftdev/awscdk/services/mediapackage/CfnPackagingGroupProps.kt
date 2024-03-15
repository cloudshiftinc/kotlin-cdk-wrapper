@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPackagingGroupProps {
  public fun authorization(): Any? = unwrap(this).getAuthorization()

  public fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

  public fun id(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun authorization(authorization: IResolvable)

    public fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6f5d48344104b06e8470d4a1e1ef1dd67aa13f06221da391424387a3bf9cd69")
    public
        fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty.Builder.() -> Unit)

    public fun egressAccessLogs(egressAccessLogs: IResolvable)

    public fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fdd57a6044873effdf8f64219020568cb08229297110754c5753695239faa54")
    public
        fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty.Builder.() -> Unit)

    public fun id(id: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps.builder()

    override fun authorization(authorization: IResolvable) {
      cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
    }

    override fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty) {
      cdkBuilder.authorization(authorization.let(CfnPackagingGroup.AuthorizationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6f5d48344104b06e8470d4a1e1ef1dd67aa13f06221da391424387a3bf9cd69")
    override
        fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty.Builder.() -> Unit):
        Unit = authorization(CfnPackagingGroup.AuthorizationProperty(authorization))

    override fun egressAccessLogs(egressAccessLogs: IResolvable) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(IResolvable::unwrap))
    }

    override fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(CfnPackagingGroup.LogConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fdd57a6044873effdf8f64219020568cb08229297110754c5753695239faa54")
    override
        fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty.Builder.() -> Unit):
        Unit = egressAccessLogs(CfnPackagingGroup.LogConfigurationProperty(egressAccessLogs))

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps,
  ) : CdkObject(cdkObject), CfnPackagingGroupProps {
    override fun authorization(): Any? = unwrap(this).getAuthorization()

    override fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

    override fun id(): String = unwrap(this).getId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPackagingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps):
        CfnPackagingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPackagingGroupProps):
        software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps
  }
}
