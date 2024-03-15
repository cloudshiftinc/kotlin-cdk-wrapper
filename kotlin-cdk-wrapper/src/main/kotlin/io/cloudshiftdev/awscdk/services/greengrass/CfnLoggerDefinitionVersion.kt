@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

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
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoggerDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggerDefinitionId(): String = unwrap(this).getLoggerDefinitionId()

  public open fun loggerDefinitionId(`value`: String) {
    unwrap(this).setLoggerDefinitionId(`value`)
  }

  public open fun loggers(): Any = unwrap(this).getLoggers()

  public open fun loggers(`value`: IResolvable) {
    unwrap(this).setLoggers(`value`.let(IResolvable::unwrap))
  }

  public open fun loggers(__idx_ac66f0: List<Any>) {
    unwrap(this).setLoggers(__idx_ac66f0)
  }

  public open fun loggers(vararg __idx_ac66f0: Any): Unit = loggers(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun loggerDefinitionId(loggerDefinitionId: String)

    public fun loggers(loggers: IResolvable)

    public fun loggers(loggers: List<Any>)

    public fun loggers(vararg loggers: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder.create(scope,
        id)

    override fun loggerDefinitionId(loggerDefinitionId: String) {
      cdkBuilder.loggerDefinitionId(loggerDefinitionId)
    }

    override fun loggers(loggers: IResolvable) {
      cdkBuilder.loggers(loggers.let(IResolvable::unwrap))
    }

    override fun loggers(loggers: List<Any>) {
      cdkBuilder.loggers(loggers)
    }

    override fun loggers(vararg loggers: Any): Unit = loggers(loggers.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggerDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggerDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion):
        CfnLoggerDefinitionVersion = CfnLoggerDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnLoggerDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion = wrapped.cdkObject
  }

  public interface LoggerProperty {
    public fun component(): String

    public fun id(): String

    public fun level(): String

    public fun space(): Number? = unwrap(this).getSpace()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun component(component: String)

      public fun id(id: String)

      public fun level(level: String)

      public fun space(space: Number)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty.builder()

      override fun component(component: String) {
        cdkBuilder.component(component)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      override fun space(space: Number) {
        cdkBuilder.space(space)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty,
    ) : CdkObject(cdkObject), LoggerProperty {
      override fun component(): String = unwrap(this).getComponent()

      override fun id(): String = unwrap(this).getId()

      override fun level(): String = unwrap(this).getLevel()

      override fun space(): Number? = unwrap(this).getSpace()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty):
          LoggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggerProperty):
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty
    }
  }
}
