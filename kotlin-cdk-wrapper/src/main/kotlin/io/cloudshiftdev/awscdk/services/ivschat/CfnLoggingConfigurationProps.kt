@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivschat

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLoggingConfigurationProps {
  public fun destinationConfiguration(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun destinationConfiguration(destinationConfiguration: IResolvable)

    public
        fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2956f2c1ce296e67d60466e3902f9ac5e6f120a73d0b9e57a1caa969a9757f55")
    public
        fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps.Builder =
        software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps.builder()

    override fun destinationConfiguration(destinationConfiguration: IResolvable) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(CfnLoggingConfiguration.DestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2956f2c1ce296e67d60466e3902f9ac5e6f120a73d0b9e57a1caa969a9757f55")
    override
        fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        destinationConfiguration(CfnLoggingConfiguration.DestinationConfigurationProperty(destinationConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps,
  ) : CdkObject(cdkObject), CfnLoggingConfigurationProps {
    override fun destinationConfiguration(): Any = unwrap(this).getDestinationConfiguration()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps):
        CfnLoggingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfigurationProps):
        software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps
  }
}
