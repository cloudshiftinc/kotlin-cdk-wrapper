package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoggerDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun initialVersion(`value`: LoggerDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(LoggerDefinitionVersionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfcae09ab4c5beede673395f0bf853578b20abb2afd40416d10f0e28e7eaf4bc")
  public open fun initialVersion(`value`: LoggerDefinitionVersionProperty.Builder.() -> Unit): Unit
      = initialVersion(LoggerDefinitionVersionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable) {
    }

    public fun initialVersion(initialVersion: LoggerDefinitionVersionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff51c6a522dd0e33bb35210369ae1aabab9f410e36ef84e09d2939d7cfd3b367")
    public fun initialVersion(initialVersion: LoggerDefinitionVersionProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.Builder.create(scope, id)

    public override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    public override fun initialVersion(initialVersion: LoggerDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(LoggerDefinitionVersionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff51c6a522dd0e33bb35210369ae1aabab9f410e36ef84e09d2939d7cfd3b367")
    public override
        fun initialVersion(initialVersion: LoggerDefinitionVersionProperty.Builder.() -> Unit): Unit
        = initialVersion(LoggerDefinitionVersionProperty(initialVersion))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggerDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggerDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition):
        CfnLoggerDefinition = CfnLoggerDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnLoggerDefinition):
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinition = wrapped.cdkObject
  }

  public interface LoggerDefinitionVersionProperty {
    public fun loggers(): Any

    public interface Builder {
      public fun loggers(loggers: IResolvable) {
      }

      public fun loggers(loggers: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty.builder()

      public override fun loggers(loggers: IResolvable) {
        cdkBuilder.loggers(loggers.let(IResolvable::unwrap))
      }

      public override fun loggers(loggers: List<Any>) {
        cdkBuilder.loggers(loggers)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty,
    ) : LoggerDefinitionVersionProperty {
      public override fun loggers(): Any = unwrap(this).getLoggers()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggerDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty):
          LoggerDefinitionVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggerDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoggerProperty {
    public fun component(): String

    public fun id(): String

    public fun level(): String

    public fun space(): Number? = unwrap(this).getSpace()

    public fun type(): String

    public interface Builder {
      public fun component(component: String) {
      }

      public fun id(id: String) {
      }

      public fun level(level: String) {
      }

      public fun space(space: Number) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty.builder()

      public override fun component(component: String) {
        cdkBuilder.component(component)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public override fun space(space: Number) {
        cdkBuilder.space(space)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty,
    ) : LoggerProperty {
      public override fun component(): String = unwrap(this).getComponent()

      public override fun id(): String = unwrap(this).getId()

      public override fun level(): String = unwrap(this).getLevel()

      public override fun space(): Number? = unwrap(this).getSpace()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty):
          LoggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggerProperty):
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
