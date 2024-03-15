@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTLSInspectionConfigurationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tlsInspectionConfiguration(): Any

  public fun tlsInspectionConfigurationName(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable)

    public
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5c5889473895ca12ac3ee4c34383e18319c56a9d744a4fad4adf5a59bbbfbbd")
    public
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.Builder.() -> Unit)

    public fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable) {
      cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty) {
      cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration.let(CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5c5889473895ca12ac3ee4c34383e18319c56a9d744a4fad4adf5a59bbbfbbd")
    override
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.Builder.() -> Unit):
        Unit =
        tlsInspectionConfiguration(CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty(tlsInspectionConfiguration))

    override fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String) {
      cdkBuilder.tlsInspectionConfigurationName(tlsInspectionConfigurationName)
    }

    public fun build():
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps,
  ) : CdkObject(cdkObject), CfnTLSInspectionConfigurationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tlsInspectionConfiguration(): Any = unwrap(this).getTlsInspectionConfiguration()

    override fun tlsInspectionConfigurationName(): String =
        unwrap(this).getTlsInspectionConfigurationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTLSInspectionConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps):
        CfnTLSInspectionConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTLSInspectionConfigurationProps):
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps
  }
}
