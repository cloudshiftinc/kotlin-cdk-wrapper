package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrIsDefaultVersion(): IResolvable =
      unwrap(this).getAttrIsDefaultVersion().let(IResolvable::wrap)

  public open fun attrProvisioningType(): String = unwrap(this).getAttrProvisioningType()

  public open fun attrTypeArn(): String = unwrap(this).getAttrTypeArn()

  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  public open fun attrVisibility(): String = unwrap(this).getAttrVisibility()

  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  public open fun loggingConfig(`value`: IResolvable) {
    unwrap(this).setLoggingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingConfig(`value`: LoggingConfigProperty) {
    unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a3b08ef49289590863b579c4ddae8ec5fa8bff3fe8f71be2baa93b6e000019")
  public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
      loggingConfig(LoggingConfigProperty(`value`))

  public open fun schemaHandlerPackage(): String = unwrap(this).getSchemaHandlerPackage()

  public open fun schemaHandlerPackage(`value`: String) {
    unwrap(this).setSchemaHandlerPackage(`value`)
  }

  public open fun typeName(): String = unwrap(this).getTypeName()

  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  public interface Builder {
    public fun executionRoleArn(executionRoleArn: String) {
    }

    public fun loggingConfig(loggingConfig: IResolvable) {
    }

    public fun loggingConfig(loggingConfig: LoggingConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10ec3fec1acf1d1aa9b49f4f1698b9b0f234e4248c80ce4ca2272fb706d600b9")
    public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit) {
    }

    public fun schemaHandlerPackage(schemaHandlerPackage: String) {
    }

    public fun typeName(typeName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnResourceVersion.Builder =
        software.amazon.awscdk.services.cloudformation.CfnResourceVersion.Builder.create(scope, id)

    public override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    public override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10ec3fec1acf1d1aa9b49f4f1698b9b0f234e4248c80ce4ca2272fb706d600b9")
    public override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit
        = loggingConfig(LoggingConfigProperty(loggingConfig))

    public override fun schemaHandlerPackage(schemaHandlerPackage: String) {
      cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    public override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnResourceVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersion):
        CfnResourceVersion = CfnResourceVersion(cdkObject)

    internal fun unwrap(wrapped: CfnResourceVersion):
        software.amazon.awscdk.services.cloudformation.CfnResourceVersion = wrapped.cdkObject
  }

  public interface LoggingConfigProperty {
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

    public interface Builder {
      public fun logGroupName(logGroupName: String) {
      }

      public fun logRoleArn(logRoleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty.builder()

      public override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public override fun logRoleArn(logRoleArn: String) {
        cdkBuilder.logRoleArn(logRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty,
    ) : LoggingConfigProperty {
      public override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      public override fun logRoleArn(): String? = unwrap(this).getLogRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty):
          LoggingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.services.cloudformation.CfnResourceVersion.LoggingConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
