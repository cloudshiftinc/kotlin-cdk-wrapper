package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccount internal constructor(
  private val cdkObject: software.amazon.awscdk.services.certificatemanager.CfnAccount,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  public open fun expiryEventsConfiguration(): Any = unwrap(this).getExpiryEventsConfiguration()

  public open fun expiryEventsConfiguration(`value`: IResolvable) {
    unwrap(this).setExpiryEventsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun expiryEventsConfiguration(`value`: ExpiryEventsConfigurationProperty) {
    unwrap(this).setExpiryEventsConfiguration(`value`.let(ExpiryEventsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43b541d7a8a7127a670a63095163b0fae9efafc0040432ef74e332281800813b")
  public open
      fun expiryEventsConfiguration(`value`: ExpiryEventsConfigurationProperty.Builder.() -> Unit):
      Unit = expiryEventsConfiguration(ExpiryEventsConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
    }

    public
        fun expiryEventsConfiguration(expiryEventsConfiguration: ExpiryEventsConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0842bef1cd54d71866d8e9087bdbdfc9adda308f78261c7e89717540064bb2")
    public
        fun expiryEventsConfiguration(expiryEventsConfiguration: ExpiryEventsConfigurationProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.certificatemanager.CfnAccount.Builder =
        software.amazon.awscdk.services.certificatemanager.CfnAccount.Builder.create(scope, id)

    public override fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
      cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun expiryEventsConfiguration(expiryEventsConfiguration: ExpiryEventsConfigurationProperty) {
      cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration.let(ExpiryEventsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0842bef1cd54d71866d8e9087bdbdfc9adda308f78261c7e89717540064bb2")
    public override
        fun expiryEventsConfiguration(expiryEventsConfiguration: ExpiryEventsConfigurationProperty.Builder.() -> Unit):
        Unit =
        expiryEventsConfiguration(ExpiryEventsConfigurationProperty(expiryEventsConfiguration))

    public fun build(): software.amazon.awscdk.services.certificatemanager.CfnAccount =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnAccount):
        CfnAccount = CfnAccount(cdkObject)

    internal fun unwrap(wrapped: CfnAccount):
        software.amazon.awscdk.services.certificatemanager.CfnAccount = wrapped.cdkObject
  }

  public interface ExpiryEventsConfigurationProperty {
    public fun daysBeforeExpiry(): Number? = unwrap(this).getDaysBeforeExpiry()

    public interface Builder {
      public fun daysBeforeExpiry(daysBeforeExpiry: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty.builder()

      public override fun daysBeforeExpiry(daysBeforeExpiry: Number) {
        cdkBuilder.daysBeforeExpiry(daysBeforeExpiry)
      }

      public fun build():
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty,
    ) : ExpiryEventsConfigurationProperty {
      public override fun daysBeforeExpiry(): Number? = unwrap(this).getDaysBeforeExpiry()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExpiryEventsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty):
          ExpiryEventsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExpiryEventsConfigurationProperty):
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
