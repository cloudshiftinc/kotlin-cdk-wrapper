package io.cloudshiftdev.awscdk.services.sam

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sam.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun location(): Any = unwrap(this).getLocation()

  public open fun location(`value`: String) {
    unwrap(this).setLocation(`value`)
  }

  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun location(`value`: ApplicationLocationProperty) {
    unwrap(this).setLocation(`value`.let(ApplicationLocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1dcb31e66d0913c99b516e3e5eda6b247691a5d5e3e9eb879d4eb2c2b6cf4166")
  public open fun location(`value`: ApplicationLocationProperty.Builder.() -> Unit): Unit =
      location(ApplicationLocationProperty(`value`))

  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
      emptyList()

  public open fun notificationArns(`value`: List<String>) {
    unwrap(this).setNotificationArns(`value`)
  }

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun parameters(`value`: Map<String, String>) {
    unwrap(this).setParameters(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  public open fun timeoutInMinutes(`value`: Number) {
    unwrap(this).setTimeoutInMinutes(`value`)
  }

  public interface Builder {
    public fun location(location: String)

    public fun location(location: IResolvable)

    public fun location(location: ApplicationLocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52158d726646327e9d094bf58b871f34607bb62eb3f1bdc9c8d0fde88e133c5d")
    public fun location(location: ApplicationLocationProperty.Builder.() -> Unit)

    public fun notificationArns(notificationArns: List<String>)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: Map<String, String>)

    public fun tags(tags: Map<String, String>)

    public fun timeoutInMinutes(timeoutInMinutes: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApplication.Builder =
        software.amazon.awscdk.services.sam.CfnApplication.Builder.create(scope, id)

    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: ApplicationLocationProperty) {
      cdkBuilder.location(location.let(ApplicationLocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52158d726646327e9d094bf58b871f34607bb62eb3f1bdc9c8d0fde88e133c5d")
    override fun location(location: ApplicationLocationProperty.Builder.() -> Unit): Unit =
        location(ApplicationLocationProperty(location))

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnApplication = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApplication): CfnApplication
        = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication): software.amazon.awscdk.services.sam.CfnApplication
        = wrapped.cdkObject
  }

  public interface ApplicationLocationProperty {
    public fun applicationId(): String

    public fun semanticVersion(): String

    public interface Builder {
      public fun applicationId(applicationId: String)

      public fun semanticVersion(semanticVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.builder()

      override fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
      }

      override fun semanticVersion(semanticVersion: String) {
        cdkBuilder.semanticVersion(semanticVersion)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty,
    ) : ApplicationLocationProperty {
      override fun applicationId(): String = unwrap(this).getApplicationId()

      override fun semanticVersion(): String = unwrap(this).getSemanticVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty):
          ApplicationLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationLocationProperty):
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
