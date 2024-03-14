package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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

public open class CfnHoursOfOperation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrHoursOfOperationArn(): String = unwrap(this).getAttrHoursOfOperationArn()

  public open fun config(): Any = unwrap(this).getConfig()

  public open fun config(`value`: IResolvable) {
    unwrap(this).setConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun config(__idx_ac66f0: List<Any>) {
    unwrap(this).setConfig(__idx_ac66f0)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun timeZone(): String = unwrap(this).getTimeZone()

  public open fun timeZone(`value`: String) {
    unwrap(this).setTimeZone(`value`)
  }

  public interface Builder {
    public fun config(config: IResolvable)

    public fun config(config: List<Any>)

    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnHoursOfOperation.Builder =
        software.amazon.awscdk.services.connect.CfnHoursOfOperation.Builder.create(scope, id)

    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    override fun config(config: List<Any>) {
      cdkBuilder.config(config)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnHoursOfOperation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHoursOfOperation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHoursOfOperation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation):
        CfnHoursOfOperation = CfnHoursOfOperation(cdkObject)

    internal fun unwrap(wrapped: CfnHoursOfOperation):
        software.amazon.awscdk.services.connect.CfnHoursOfOperation = wrapped.cdkObject
  }

  public interface HoursOfOperationConfigProperty {
    public fun day(): String

    public fun endTime(): Any

    public fun startTime(): Any

    public interface Builder {
      public fun day(day: String)

      public fun endTime(endTime: IResolvable)

      public fun endTime(endTime: HoursOfOperationTimeSliceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b50e3243710ac7cd6e8858424d416e55fc4756b443deec1dccadd3c93e4e2ab3")
      public fun endTime(endTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit)

      public fun startTime(startTime: IResolvable)

      public fun startTime(startTime: HoursOfOperationTimeSliceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a29920f575c0d8cfb256bcf19483713c3a030a2684921b9da9e57c536e25fb6")
      public fun startTime(startTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty.builder()

      override fun day(day: String) {
        cdkBuilder.day(day)
      }

      override fun endTime(endTime: IResolvable) {
        cdkBuilder.endTime(endTime.let(IResolvable::unwrap))
      }

      override fun endTime(endTime: HoursOfOperationTimeSliceProperty) {
        cdkBuilder.endTime(endTime.let(HoursOfOperationTimeSliceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b50e3243710ac7cd6e8858424d416e55fc4756b443deec1dccadd3c93e4e2ab3")
      override fun endTime(endTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit): Unit =
          endTime(HoursOfOperationTimeSliceProperty(endTime))

      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable::unwrap))
      }

      override fun startTime(startTime: HoursOfOperationTimeSliceProperty) {
        cdkBuilder.startTime(startTime.let(HoursOfOperationTimeSliceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a29920f575c0d8cfb256bcf19483713c3a030a2684921b9da9e57c536e25fb6")
      override fun startTime(startTime: HoursOfOperationTimeSliceProperty.Builder.() -> Unit): Unit
          = startTime(HoursOfOperationTimeSliceProperty(startTime))

      public fun build():
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty,
    ) : HoursOfOperationConfigProperty {
      override fun day(): String = unwrap(this).getDay()

      override fun endTime(): Any = unwrap(this).getEndTime()

      override fun startTime(): Any = unwrap(this).getStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HoursOfOperationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty):
          HoursOfOperationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HoursOfOperationConfigProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HoursOfOperationTimeSliceProperty {
    public fun hours(): Number

    public fun minutes(): Number

    public interface Builder {
      public fun hours(hours: Number)

      public fun minutes(minutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.builder()

      override fun hours(hours: Number) {
        cdkBuilder.hours(hours)
      }

      override fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty,
    ) : HoursOfOperationTimeSliceProperty {
      override fun hours(): Number = unwrap(this).getHours()

      override fun minutes(): Number = unwrap(this).getMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HoursOfOperationTimeSliceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty):
          HoursOfOperationTimeSliceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HoursOfOperationTimeSliceProperty):
          software.amazon.awscdk.services.connect.CfnHoursOfOperation.HoursOfOperationTimeSliceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
