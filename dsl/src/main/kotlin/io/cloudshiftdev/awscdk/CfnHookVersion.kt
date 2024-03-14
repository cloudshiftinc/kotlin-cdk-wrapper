package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHookVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnHookVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrIsDefaultVersion(): IResolvable =
      unwrap(this).getAttrIsDefaultVersion().let(IResolvable::wrap)

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
  @JvmName("7f5cdeb6cefe2fb06e404764989b301eb4063fa51474a091aa1c684585aedd3e")
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
    public fun executionRoleArn(executionRoleArn: String)

    public fun loggingConfig(loggingConfig: IResolvable)

    public fun loggingConfig(loggingConfig: LoggingConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27803a6f475871d542d4fc635e75eeed0ab4ce21d9f0100c5494239cb853aa52")
    public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

    public fun schemaHandlerPackage(schemaHandlerPackage: String)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookVersion.Builder =
        software.amazon.awscdk.CfnHookVersion.Builder.create(scope, id)

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27803a6f475871d542d4fc635e75eeed0ab4ce21d9f0100c5494239cb853aa52")
    override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(loggingConfig))

    override fun schemaHandlerPackage(schemaHandlerPackage: String) {
      cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnHookVersion = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHookVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHookVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookVersion): CfnHookVersion =
        CfnHookVersion(cdkObject)

    internal fun unwrap(wrapped: CfnHookVersion): software.amazon.awscdk.CfnHookVersion =
        wrapped.cdkObject
  }

  public interface LoggingConfigProperty {
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

    public interface Builder {
      public fun logGroupName(logGroupName: String)

      public fun logRoleArn(logRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty.Builder =
          software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty.builder()

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      override fun logRoleArn(logRoleArn: String) {
        cdkBuilder.logRoleArn(logRoleArn)
      }

      public fun build(): software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty,
    ) : LoggingConfigProperty {
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      override fun logRoleArn(): String? = unwrap(this).getLogRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty):
          LoggingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.CfnHookVersion.LoggingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
