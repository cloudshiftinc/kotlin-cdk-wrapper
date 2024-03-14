package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnQuickConnect internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrQuickConnectArn(): String = unwrap(this).getAttrQuickConnectArn()

  public open fun attrQuickConnectType(): String = unwrap(this).getAttrQuickConnectType()

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

  public open fun quickConnectConfig(): Any = unwrap(this).getQuickConnectConfig()

  public open fun quickConnectConfig(`value`: IResolvable) {
    unwrap(this).setQuickConnectConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun quickConnectConfig(`value`: QuickConnectConfigProperty) {
    unwrap(this).setQuickConnectConfig(`value`.let(QuickConnectConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c0360f57021ec0b5a9864268641e31c827c2add76c550e97e9bf263ff3a3c7d2")
  public open fun quickConnectConfig(`value`: QuickConnectConfigProperty.Builder.() -> Unit): Unit =
      quickConnectConfig(QuickConnectConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun quickConnectConfig(quickConnectConfig: IResolvable)

    public fun quickConnectConfig(quickConnectConfig: QuickConnectConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66facc532a2e04b3aeb9c446901372563a69d59c013e8aab2c125b1fdcf2ec41")
    public fun quickConnectConfig(quickConnectConfig: QuickConnectConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnQuickConnect.Builder =
        software.amazon.awscdk.services.connect.CfnQuickConnect.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun quickConnectConfig(quickConnectConfig: IResolvable) {
      cdkBuilder.quickConnectConfig(quickConnectConfig.let(IResolvable::unwrap))
    }

    override fun quickConnectConfig(quickConnectConfig: QuickConnectConfigProperty) {
      cdkBuilder.quickConnectConfig(quickConnectConfig.let(QuickConnectConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66facc532a2e04b3aeb9c446901372563a69d59c013e8aab2c125b1fdcf2ec41")
    override
        fun quickConnectConfig(quickConnectConfig: QuickConnectConfigProperty.Builder.() -> Unit):
        Unit = quickConnectConfig(QuickConnectConfigProperty(quickConnectConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnQuickConnect = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQuickConnect {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQuickConnect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect):
        CfnQuickConnect = CfnQuickConnect(cdkObject)

    internal fun unwrap(wrapped: CfnQuickConnect):
        software.amazon.awscdk.services.connect.CfnQuickConnect = wrapped.cdkObject
  }

  public interface PhoneNumberQuickConnectConfigProperty {
    public fun phoneNumber(): String

    public interface Builder {
      public fun phoneNumber(phoneNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.builder()

      override fun phoneNumber(phoneNumber: String) {
        cdkBuilder.phoneNumber(phoneNumber)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty,
    ) : PhoneNumberQuickConnectConfigProperty {
      override fun phoneNumber(): String = unwrap(this).getPhoneNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PhoneNumberQuickConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty):
          PhoneNumberQuickConnectConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhoneNumberQuickConnectConfigProperty):
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface QuickConnectConfigProperty {
    public fun phoneConfig(): Any? = unwrap(this).getPhoneConfig()

    public fun queueConfig(): Any? = unwrap(this).getQueueConfig()

    public fun quickConnectType(): String

    public fun userConfig(): Any? = unwrap(this).getUserConfig()

    public interface Builder {
      public fun phoneConfig(phoneConfig: IResolvable)

      public fun phoneConfig(phoneConfig: PhoneNumberQuickConnectConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cd908e480eaaa1a415c0cfc241b89017d858ffe71e52b69ee36a7549850ea97")
      public fun phoneConfig(phoneConfig: PhoneNumberQuickConnectConfigProperty.Builder.() -> Unit)

      public fun queueConfig(queueConfig: IResolvable)

      public fun queueConfig(queueConfig: QueueQuickConnectConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b017bd39c984da0288194f7ee2258d3baea9f333ac105fbfca15bd258043ebac")
      public fun queueConfig(queueConfig: QueueQuickConnectConfigProperty.Builder.() -> Unit)

      public fun quickConnectType(quickConnectType: String)

      public fun userConfig(userConfig: IResolvable)

      public fun userConfig(userConfig: UserQuickConnectConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("841daf7430e31b2285dd0f375fab0519cc1a3755c3297f1c297f9761ce90cf40")
      public fun userConfig(userConfig: UserQuickConnectConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty.builder()

      override fun phoneConfig(phoneConfig: IResolvable) {
        cdkBuilder.phoneConfig(phoneConfig.let(IResolvable::unwrap))
      }

      override fun phoneConfig(phoneConfig: PhoneNumberQuickConnectConfigProperty) {
        cdkBuilder.phoneConfig(phoneConfig.let(PhoneNumberQuickConnectConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cd908e480eaaa1a415c0cfc241b89017d858ffe71e52b69ee36a7549850ea97")
      override
          fun phoneConfig(phoneConfig: PhoneNumberQuickConnectConfigProperty.Builder.() -> Unit):
          Unit = phoneConfig(PhoneNumberQuickConnectConfigProperty(phoneConfig))

      override fun queueConfig(queueConfig: IResolvable) {
        cdkBuilder.queueConfig(queueConfig.let(IResolvable::unwrap))
      }

      override fun queueConfig(queueConfig: QueueQuickConnectConfigProperty) {
        cdkBuilder.queueConfig(queueConfig.let(QueueQuickConnectConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b017bd39c984da0288194f7ee2258d3baea9f333ac105fbfca15bd258043ebac")
      override fun queueConfig(queueConfig: QueueQuickConnectConfigProperty.Builder.() -> Unit):
          Unit = queueConfig(QueueQuickConnectConfigProperty(queueConfig))

      override fun quickConnectType(quickConnectType: String) {
        cdkBuilder.quickConnectType(quickConnectType)
      }

      override fun userConfig(userConfig: IResolvable) {
        cdkBuilder.userConfig(userConfig.let(IResolvable::unwrap))
      }

      override fun userConfig(userConfig: UserQuickConnectConfigProperty) {
        cdkBuilder.userConfig(userConfig.let(UserQuickConnectConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("841daf7430e31b2285dd0f375fab0519cc1a3755c3297f1c297f9761ce90cf40")
      override fun userConfig(userConfig: UserQuickConnectConfigProperty.Builder.() -> Unit): Unit =
          userConfig(UserQuickConnectConfigProperty(userConfig))

      public fun build():
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty,
    ) : QuickConnectConfigProperty {
      override fun phoneConfig(): Any? = unwrap(this).getPhoneConfig()

      override fun queueConfig(): Any? = unwrap(this).getQueueConfig()

      override fun quickConnectType(): String = unwrap(this).getQuickConnectType()

      override fun userConfig(): Any? = unwrap(this).getUserConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QuickConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty):
          QuickConnectConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuickConnectConfigProperty):
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UserQuickConnectConfigProperty {
    public fun contactFlowArn(): String

    public fun userArn(): String

    public interface Builder {
      public fun contactFlowArn(contactFlowArn: String)

      public fun userArn(userArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty.builder()

      override fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
      }

      override fun userArn(userArn: String) {
        cdkBuilder.userArn(userArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty,
    ) : UserQuickConnectConfigProperty {
      override fun contactFlowArn(): String = unwrap(this).getContactFlowArn()

      override fun userArn(): String = unwrap(this).getUserArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserQuickConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty):
          UserQuickConnectConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserQuickConnectConfigProperty):
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface QueueQuickConnectConfigProperty {
    public fun contactFlowArn(): String

    public fun queueArn(): String

    public interface Builder {
      public fun contactFlowArn(contactFlowArn: String)

      public fun queueArn(queueArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty.builder()

      override fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
      }

      override fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty,
    ) : QueueQuickConnectConfigProperty {
      override fun contactFlowArn(): String = unwrap(this).getContactFlowArn()

      override fun queueArn(): String = unwrap(this).getQueueArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QueueQuickConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty):
          QueueQuickConnectConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueueQuickConnectConfigProperty):
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
