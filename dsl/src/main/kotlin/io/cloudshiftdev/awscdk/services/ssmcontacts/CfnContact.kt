package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnContact internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact,
) : CfnResource(cdkObject), IInspectable {
  public open fun alias(): String = unwrap(this).getAlias()

  public open fun alias(`value`: String) {
    unwrap(this).setAlias(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun displayName(): String = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun plan(): Any? = unwrap(this).getPlan()

  public open fun plan(`value`: IResolvable) {
    unwrap(this).setPlan(`value`.let(IResolvable::unwrap))
  }

  public open fun plan(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlan(__idx_ac66f0)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun alias(alias: String)

    public fun displayName(displayName: String)

    public fun plan(plan: IResolvable)

    public fun plan(plan: List<Any>)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnContact.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnContact.Builder.create(scope, id)

    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun plan(plan: IResolvable) {
      cdkBuilder.plan(plan.let(IResolvable::unwrap))
    }

    override fun plan(plan: List<Any>) {
      cdkBuilder.plan(plan)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContact = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContact {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContact(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact): CfnContact
        = CfnContact(cdkObject)

    internal fun unwrap(wrapped: CfnContact): software.amazon.awscdk.services.ssmcontacts.CfnContact
        = wrapped.cdkObject
  }

  public interface StageProperty {
    public fun durationInMinutes(): Number? = unwrap(this).getDurationInMinutes()

    public fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

    public fun targets(): Any? = unwrap(this).getTargets()

    public interface Builder {
      public fun durationInMinutes(durationInMinutes: Number)

      public fun rotationIds(rotationIds: List<String>)

      public fun targets(targets: IResolvable)

      public fun targets(targets: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty.builder()

      override fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
      }

      override fun rotationIds(rotationIds: List<String>) {
        cdkBuilder.rotationIds(rotationIds)
      }

      override fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets.let(IResolvable::unwrap))
      }

      override fun targets(targets: List<Any>) {
        cdkBuilder.targets(targets)
      }

      public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty,
    ) : StageProperty {
      override fun durationInMinutes(): Number? = unwrap(this).getDurationInMinutes()

      override fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

      override fun targets(): Any? = unwrap(this).getTargets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty):
          StageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ContactTargetInfoProperty {
    public fun contactId(): String

    public fun isEssential(): Any

    public interface Builder {
      public fun contactId(contactId: String)

      public fun isEssential(isEssential: Boolean)

      public fun isEssential(isEssential: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty.builder()

      override fun contactId(contactId: String) {
        cdkBuilder.contactId(contactId)
      }

      override fun isEssential(isEssential: Boolean) {
        cdkBuilder.isEssential(isEssential)
      }

      override fun isEssential(isEssential: IResolvable) {
        cdkBuilder.isEssential(isEssential.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty,
    ) : ContactTargetInfoProperty {
      override fun contactId(): String = unwrap(this).getContactId()

      override fun isEssential(): Any = unwrap(this).getIsEssential()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContactTargetInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty):
          ContactTargetInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContactTargetInfoProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetsProperty {
    public fun channelTargetInfo(): Any? = unwrap(this).getChannelTargetInfo()

    public fun contactTargetInfo(): Any? = unwrap(this).getContactTargetInfo()

    public interface Builder {
      public fun channelTargetInfo(channelTargetInfo: IResolvable)

      public fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29d09db8273549d79e0633f214d08200e579b7d9337a6f78508bbac922b90efc")
      public fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty.Builder.() -> Unit)

      public fun contactTargetInfo(contactTargetInfo: IResolvable)

      public fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3361af6b198f0ec3cd7e76ac13b8a39a3214c6fc8e33f79f59039cb4015cce2")
      public fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty.builder()

      override fun channelTargetInfo(channelTargetInfo: IResolvable) {
        cdkBuilder.channelTargetInfo(channelTargetInfo.let(IResolvable::unwrap))
      }

      override fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty) {
        cdkBuilder.channelTargetInfo(channelTargetInfo.let(ChannelTargetInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29d09db8273549d79e0633f214d08200e579b7d9337a6f78508bbac922b90efc")
      override
          fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty.Builder.() -> Unit):
          Unit = channelTargetInfo(ChannelTargetInfoProperty(channelTargetInfo))

      override fun contactTargetInfo(contactTargetInfo: IResolvable) {
        cdkBuilder.contactTargetInfo(contactTargetInfo.let(IResolvable::unwrap))
      }

      override fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty) {
        cdkBuilder.contactTargetInfo(contactTargetInfo.let(ContactTargetInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3361af6b198f0ec3cd7e76ac13b8a39a3214c6fc8e33f79f59039cb4015cce2")
      override
          fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty.Builder.() -> Unit):
          Unit = contactTargetInfo(ContactTargetInfoProperty(contactTargetInfo))

      public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty,
    ) : TargetsProperty {
      override fun channelTargetInfo(): Any? = unwrap(this).getChannelTargetInfo()

      override fun contactTargetInfo(): Any? = unwrap(this).getContactTargetInfo()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty):
          TargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetsProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ChannelTargetInfoProperty {
    public fun channelId(): String

    public fun retryIntervalInMinutes(): Number

    public interface Builder {
      public fun channelId(channelId: String)

      public fun retryIntervalInMinutes(retryIntervalInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty.builder()

      override fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
      }

      override fun retryIntervalInMinutes(retryIntervalInMinutes: Number) {
        cdkBuilder.retryIntervalInMinutes(retryIntervalInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty,
    ) : ChannelTargetInfoProperty {
      override fun channelId(): String = unwrap(this).getChannelId()

      override fun retryIntervalInMinutes(): Number = unwrap(this).getRetryIntervalInMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelTargetInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty):
          ChannelTargetInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelTargetInfoProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
