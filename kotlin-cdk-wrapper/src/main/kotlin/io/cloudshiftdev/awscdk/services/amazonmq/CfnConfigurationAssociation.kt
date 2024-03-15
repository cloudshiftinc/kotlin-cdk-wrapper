@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun broker(): String = unwrap(this).getBroker()

  public open fun broker(`value`: String) {
    unwrap(this).setBroker(`value`)
  }

  public open fun configuration(): Any = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: ConfigurationIdProperty) {
    unwrap(this).setConfiguration(`value`.let(ConfigurationIdProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd76f337f3ee19b65d5b1709a50a50f7ac01533bd31ad7f10d2a3939159d25ad")
  public open fun configuration(`value`: ConfigurationIdProperty.Builder.() -> Unit): Unit =
      configuration(ConfigurationIdProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun broker(broker: String)

    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: ConfigurationIdProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d88bd8f261d9e2e83f9a1e32baef40dc865fef95b496c50d1c0ae9d0c9d10379")
    public fun configuration(configuration: ConfigurationIdProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.Builder =
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.Builder.create(scope,
        id)

    override fun broker(broker: String) {
      cdkBuilder.broker(broker)
    }

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: ConfigurationIdProperty) {
      cdkBuilder.configuration(configuration.let(ConfigurationIdProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d88bd8f261d9e2e83f9a1e32baef40dc865fef95b496c50d1c0ae9d0c9d10379")
    override fun configuration(configuration: ConfigurationIdProperty.Builder.() -> Unit): Unit =
        configuration(ConfigurationIdProperty(configuration))

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation):
        CfnConfigurationAssociation = CfnConfigurationAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationAssociation):
        software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation = wrapped.cdkObject
  }

  public interface ConfigurationIdProperty {
    public fun id(): String

    public fun revision(): Number

    @CdkDslMarker
    public interface Builder {
      public fun id(id: String)

      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder
          =
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty,
    ) : CdkObject(cdkObject), ConfigurationIdProperty {
      override fun id(): String = unwrap(this).getId()

      override fun revision(): Number = unwrap(this).getRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty):
          ConfigurationIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationIdProperty):
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
    }
  }
}
