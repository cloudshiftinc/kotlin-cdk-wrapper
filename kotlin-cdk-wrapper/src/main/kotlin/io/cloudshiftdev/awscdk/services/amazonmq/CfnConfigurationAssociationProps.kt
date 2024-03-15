@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConfigurationAssociationProps {
  public fun broker(): String

  public fun configuration(): Any

  @CdkDslMarker
  public interface Builder {
    public fun broker(broker: String)

    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("860af6d2a776a57d90af09a63d38ef580c8ed1f37884fca63d1a6f9bb8955b60")
    public
        fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder =
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.builder()

    override fun broker(broker: String) {
      cdkBuilder.broker(broker)
    }

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty) {
      cdkBuilder.configuration(configuration.let(CfnConfigurationAssociation.ConfigurationIdProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("860af6d2a776a57d90af09a63d38ef580c8ed1f37884fca63d1a6f9bb8955b60")
    override
        fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty.Builder.() -> Unit):
        Unit = configuration(CfnConfigurationAssociation.ConfigurationIdProperty(configuration))

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps,
  ) : CdkObject(cdkObject), CfnConfigurationAssociationProps {
    override fun broker(): String = unwrap(this).getBroker()

    override fun configuration(): Any = unwrap(this).getConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps):
        CfnConfigurationAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationAssociationProps):
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
  }
}
