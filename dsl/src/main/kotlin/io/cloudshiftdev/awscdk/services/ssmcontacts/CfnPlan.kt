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

public open class CfnPlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun contactId(): String = unwrap(this).getContactId()

  public open fun contactId(`value`: String) {
    unwrap(this).setContactId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

  public open fun rotationIds(`value`: List<String>) {
    unwrap(this).setRotationIds(`value`)
  }

  public open fun rotationIds(vararg `value`: String): Unit = rotationIds(`value`.toList())

  public open fun stages(): Any? = unwrap(this).getStages()

  public open fun stages(`value`: IResolvable) {
    unwrap(this).setStages(`value`.let(IResolvable::unwrap))
  }

  public open fun stages(__idx_ac66f0: List<Any>) {
    unwrap(this).setStages(__idx_ac66f0)
  }

  public open fun stages(vararg __idx_ac66f0: Any): Unit = stages(__idx_ac66f0.toList())

  public interface Builder {
    public fun contactId(contactId: String)

    public fun rotationIds(rotationIds: List<String>)

    public fun rotationIds(vararg rotationIds: String)

    public fun stages(stages: IResolvable)

    public fun stages(stages: List<Any>)

    public fun stages(vararg stages: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnPlan.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnPlan.Builder.create(scope, id)

    override fun contactId(contactId: String) {
      cdkBuilder.contactId(contactId)
    }

    override fun rotationIds(rotationIds: List<String>) {
      cdkBuilder.rotationIds(rotationIds)
    }

    override fun rotationIds(vararg rotationIds: String): Unit = rotationIds(rotationIds.toList())

    override fun stages(stages: IResolvable) {
      cdkBuilder.stages(stages.let(IResolvable::unwrap))
    }

    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages)
    }

    override fun stages(vararg stages: Any): Unit = stages(stages.toList())

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnPlan = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan): CfnPlan =
        CfnPlan(cdkObject)

    internal fun unwrap(wrapped: CfnPlan): software.amazon.awscdk.services.ssmcontacts.CfnPlan =
        wrapped.cdkObject
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
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty.builder()

      override fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
      }

      override fun retryIntervalInMinutes(retryIntervalInMinutes: Number) {
        cdkBuilder.retryIntervalInMinutes(retryIntervalInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty):
          ChannelTargetInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelTargetInfoProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TargetsProperty {
    public fun channelTargetInfo(): Any? = unwrap(this).getChannelTargetInfo()

    public fun contactTargetInfo(): Any? = unwrap(this).getContactTargetInfo()

    public interface Builder {
      public fun channelTargetInfo(channelTargetInfo: IResolvable)

      public fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e71becc743875d6062f09190ed71b0cc7036598b981ca96b066ae6778c1c94f")
      public fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty.Builder.() -> Unit)

      public fun contactTargetInfo(contactTargetInfo: IResolvable)

      public fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("117105694507bf7d70016ab178c9333de2b3a6a01ed47a06890d9f3ff81c73eb")
      public fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty.builder()

      override fun channelTargetInfo(channelTargetInfo: IResolvable) {
        cdkBuilder.channelTargetInfo(channelTargetInfo.let(IResolvable::unwrap))
      }

      override fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty) {
        cdkBuilder.channelTargetInfo(channelTargetInfo.let(ChannelTargetInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e71becc743875d6062f09190ed71b0cc7036598b981ca96b066ae6778c1c94f")
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
      @JvmName("117105694507bf7d70016ab178c9333de2b3a6a01ed47a06890d9f3ff81c73eb")
      override
          fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty.Builder.() -> Unit):
          Unit = contactTargetInfo(ContactTargetInfoProperty(contactTargetInfo))

      public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty):
          TargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetsProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty = (wrapped as
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
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty.builder()

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
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty):
          ContactTargetInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContactTargetInfoProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface StageProperty {
    public fun durationInMinutes(): Number

    public fun targets(): Any? = unwrap(this).getTargets()

    public interface Builder {
      public fun durationInMinutes(durationInMinutes: Number)

      public fun targets(targets: IResolvable)

      public fun targets(targets: List<Any>)

      public fun targets(vararg targets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty.builder()

      override fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
      }

      override fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets.let(IResolvable::unwrap))
      }

      override fun targets(targets: List<Any>) {
        cdkBuilder.targets(targets)
      }

      override fun targets(vararg targets: Any): Unit = targets(targets.toList())

      public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty,
    ) : StageProperty {
      override fun durationInMinutes(): Number = unwrap(this).getDurationInMinutes()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty):
          StageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
