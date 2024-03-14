package io.cloudshiftdev.awscdk.services.lambda

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

public open class CfnVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrFunctionArn(): String = unwrap(this).getAttrFunctionArn()

  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  public open fun codeSha256(): String? = unwrap(this).getCodeSha256()

  public open fun codeSha256(`value`: String) {
    unwrap(this).setCodeSha256(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun functionName(): String = unwrap(this).getFunctionName()

  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun provisionedConcurrencyConfig(): Any? =
      unwrap(this).getProvisionedConcurrencyConfig()

  public open fun provisionedConcurrencyConfig(`value`: IResolvable) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(IResolvable::unwrap))
  }

  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigurationProperty) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(ProvisionedConcurrencyConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bce3e1203f25d7f54d7c0600ff88df5f2bdb34e43783ff15b82f37a6b96bce7c")
  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
      Unit = provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty(`value`))

  public open fun runtimePolicy(): Any? = unwrap(this).getRuntimePolicy()

  public open fun runtimePolicy(`value`: IResolvable) {
    unwrap(this).setRuntimePolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun runtimePolicy(`value`: RuntimePolicyProperty) {
    unwrap(this).setRuntimePolicy(`value`.let(RuntimePolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5ce6ca93eebe50a05090453fa3f644dd4864a1a0fc1dacdbee33c4caf5a3325")
  public open fun runtimePolicy(`value`: RuntimePolicyProperty.Builder.() -> Unit): Unit =
      runtimePolicy(RuntimePolicyProperty(`value`))

  public interface Builder {
    public fun codeSha256(codeSha256: String)

    public fun description(description: String)

    public fun functionName(functionName: String)

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("432d513b1b189cd2d3072b81cb79413843ea783d3ab9da260500e42fd1f195a5")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit)

    public fun runtimePolicy(runtimePolicy: IResolvable)

    public fun runtimePolicy(runtimePolicy: RuntimePolicyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0ab2f030fc478fd5d60453eabf7b2bd12e0ba9a0baf099951259bc38c6da412")
    public fun runtimePolicy(runtimePolicy: RuntimePolicyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnVersion.Builder =
        software.amazon.awscdk.services.lambda.CfnVersion.Builder.create(scope, id)

    override fun codeSha256(codeSha256: String) {
      cdkBuilder.codeSha256(codeSha256)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(ProvisionedConcurrencyConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("432d513b1b189cd2d3072b81cb79413843ea783d3ab9da260500e42fd1f195a5")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty(provisionedConcurrencyConfig))

    override fun runtimePolicy(runtimePolicy: IResolvable) {
      cdkBuilder.runtimePolicy(runtimePolicy.let(IResolvable::unwrap))
    }

    override fun runtimePolicy(runtimePolicy: RuntimePolicyProperty) {
      cdkBuilder.runtimePolicy(runtimePolicy.let(RuntimePolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0ab2f030fc478fd5d60453eabf7b2bd12e0ba9a0baf099951259bc38c6da412")
    override fun runtimePolicy(runtimePolicy: RuntimePolicyProperty.Builder.() -> Unit): Unit =
        runtimePolicy(RuntimePolicyProperty(runtimePolicy))

    public fun build(): software.amazon.awscdk.services.lambda.CfnVersion = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnVersion): CfnVersion =
        CfnVersion(cdkObject)

    internal fun unwrap(wrapped: CfnVersion): software.amazon.awscdk.services.lambda.CfnVersion =
        wrapped.cdkObject
  }

  public interface ProvisionedConcurrencyConfigurationProperty {
    public fun provisionedConcurrentExecutions(): Number

    public interface Builder {
      public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty.builder()

      override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty,
    ) : ProvisionedConcurrencyConfigurationProperty {
      override fun provisionedConcurrentExecutions(): Number =
          unwrap(this).getProvisionedConcurrentExecutions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisionedConcurrencyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty):
          ProvisionedConcurrencyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedConcurrencyConfigurationProperty):
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RuntimePolicyProperty {
    public fun runtimeVersionArn(): String? = unwrap(this).getRuntimeVersionArn()

    public fun updateRuntimeOn(): String

    public interface Builder {
      public fun runtimeVersionArn(runtimeVersionArn: String)

      public fun updateRuntimeOn(updateRuntimeOn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty.builder()

      override fun runtimeVersionArn(runtimeVersionArn: String) {
        cdkBuilder.runtimeVersionArn(runtimeVersionArn)
      }

      override fun updateRuntimeOn(updateRuntimeOn: String) {
        cdkBuilder.updateRuntimeOn(updateRuntimeOn)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty,
    ) : RuntimePolicyProperty {
      override fun runtimeVersionArn(): String? = unwrap(this).getRuntimeVersionArn()

      override fun updateRuntimeOn(): String = unwrap(this).getUpdateRuntimeOn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty):
          RuntimePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimePolicyProperty):
          software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
