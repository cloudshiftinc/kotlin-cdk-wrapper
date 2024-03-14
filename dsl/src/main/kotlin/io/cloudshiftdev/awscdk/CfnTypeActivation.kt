package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTypeActivation internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnTypeActivation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun autoUpdate(): Any? = unwrap(this).getAutoUpdate()

  public open fun autoUpdate(`value`: Boolean) {
    unwrap(this).setAutoUpdate(`value`)
  }

  public open fun autoUpdate(`value`: IResolvable) {
    unwrap(this).setAutoUpdate(`value`.let(IResolvable::unwrap))
  }

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
  @JvmName("bc020d77eae03184379c5608f20fb6062211b85169332ef33cf405bc53c8016c")
  public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
      loggingConfig(LoggingConfigProperty(`value`))

  public open fun majorVersion(): String? = unwrap(this).getMajorVersion()

  public open fun majorVersion(`value`: String) {
    unwrap(this).setMajorVersion(`value`)
  }

  public open fun publicTypeArn(): String? = unwrap(this).getPublicTypeArn()

  public open fun publicTypeArn(`value`: String) {
    unwrap(this).setPublicTypeArn(`value`)
  }

  public open fun publisherId(): String? = unwrap(this).getPublisherId()

  public open fun publisherId(`value`: String) {
    unwrap(this).setPublisherId(`value`)
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun typeName(): String? = unwrap(this).getTypeName()

  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  public open fun typeNameAlias(): String? = unwrap(this).getTypeNameAlias()

  public open fun typeNameAlias(`value`: String) {
    unwrap(this).setTypeNameAlias(`value`)
  }

  public open fun versionBump(): String? = unwrap(this).getVersionBump()

  public open fun versionBump(`value`: String) {
    unwrap(this).setVersionBump(`value`)
  }

  public interface Builder {
    public fun autoUpdate(autoUpdate: Boolean)

    public fun autoUpdate(autoUpdate: IResolvable)

    public fun executionRoleArn(executionRoleArn: String)

    public fun loggingConfig(loggingConfig: IResolvable)

    public fun loggingConfig(loggingConfig: LoggingConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c1bbfec49c9f9961582a67a53408b16796a1f7127dc2abb183cd575761004f7")
    public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

    public fun majorVersion(majorVersion: String)

    public fun publicTypeArn(publicTypeArn: String)

    public fun publisherId(publisherId: String)

    public fun type(type: String)

    public fun typeName(typeName: String)

    public fun typeNameAlias(typeNameAlias: String)

    public fun versionBump(versionBump: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTypeActivation.Builder =
        software.amazon.awscdk.CfnTypeActivation.Builder.create(scope, id)

    override fun autoUpdate(autoUpdate: Boolean) {
      cdkBuilder.autoUpdate(autoUpdate)
    }

    override fun autoUpdate(autoUpdate: IResolvable) {
      cdkBuilder.autoUpdate(autoUpdate.let(IResolvable::unwrap))
    }

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
    @JvmName("6c1bbfec49c9f9961582a67a53408b16796a1f7127dc2abb183cd575761004f7")
    override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(loggingConfig))

    override fun majorVersion(majorVersion: String) {
      cdkBuilder.majorVersion(majorVersion)
    }

    override fun publicTypeArn(publicTypeArn: String) {
      cdkBuilder.publicTypeArn(publicTypeArn)
    }

    override fun publisherId(publisherId: String) {
      cdkBuilder.publisherId(publisherId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    override fun typeNameAlias(typeNameAlias: String) {
      cdkBuilder.typeNameAlias(typeNameAlias)
    }

    override fun versionBump(versionBump: String) {
      cdkBuilder.versionBump(versionBump)
    }

    public fun build(): software.amazon.awscdk.CfnTypeActivation = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTypeActivation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTypeActivation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTypeActivation): CfnTypeActivation =
        CfnTypeActivation(cdkObject)

    internal fun unwrap(wrapped: CfnTypeActivation): software.amazon.awscdk.CfnTypeActivation =
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
      private val cdkBuilder: software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty.Builder
          = software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty.builder()

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      override fun logRoleArn(logRoleArn: String) {
        cdkBuilder.logRoleArn(logRoleArn)
      }

      public fun build(): software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty,
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

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty):
          LoggingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
