package io.cloudshiftdev.awscdk.services.opensearchserverless

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

public open class CfnSecurityConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun samlOptions(): Any? = unwrap(this).getSamlOptions()

  public open fun samlOptions(`value`: IResolvable) {
    unwrap(this).setSamlOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun samlOptions(`value`: SamlConfigOptionsProperty) {
    unwrap(this).setSamlOptions(`value`.let(SamlConfigOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4de935795cdebeb67e4642a8fd371bc8651ac6c7fe9df9018650d497514250c6")
  public open fun samlOptions(`value`: SamlConfigOptionsProperty.Builder.() -> Unit): Unit =
      samlOptions(SamlConfigOptionsProperty(`value`))

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun samlOptions(samlOptions: IResolvable)

    public fun samlOptions(samlOptions: SamlConfigOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6f686691d030724cbcf06455357d131785d142c32d88d2163185e08d40523f2")
    public fun samlOptions(samlOptions: SamlConfigOptionsProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun samlOptions(samlOptions: IResolvable) {
      cdkBuilder.samlOptions(samlOptions.let(IResolvable::unwrap))
    }

    override fun samlOptions(samlOptions: SamlConfigOptionsProperty) {
      cdkBuilder.samlOptions(samlOptions.let(SamlConfigOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6f686691d030724cbcf06455357d131785d142c32d88d2163185e08d40523f2")
    override fun samlOptions(samlOptions: SamlConfigOptionsProperty.Builder.() -> Unit): Unit =
        samlOptions(SamlConfigOptionsProperty(samlOptions))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig):
        CfnSecurityConfig = CfnSecurityConfig(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfig):
        software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig = wrapped.cdkObject
  }

  public interface SamlConfigOptionsProperty {
    public fun groupAttribute(): String? = unwrap(this).getGroupAttribute()

    public fun metadata(): String

    public fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

    public fun userAttribute(): String? = unwrap(this).getUserAttribute()

    public interface Builder {
      public fun groupAttribute(groupAttribute: String)

      public fun metadata(metadata: String)

      public fun sessionTimeout(sessionTimeout: Number)

      public fun userAttribute(userAttribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty.builder()

      override fun groupAttribute(groupAttribute: String) {
        cdkBuilder.groupAttribute(groupAttribute)
      }

      override fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
      }

      override fun sessionTimeout(sessionTimeout: Number) {
        cdkBuilder.sessionTimeout(sessionTimeout)
      }

      override fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty,
    ) : SamlConfigOptionsProperty {
      override fun groupAttribute(): String? = unwrap(this).getGroupAttribute()

      override fun metadata(): String = unwrap(this).getMetadata()

      override fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

      override fun userAttribute(): String? = unwrap(this).getUserAttribute()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SamlConfigOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty):
          SamlConfigOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamlConfigOptionsProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig.SamlConfigOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
