package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnQueue internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnQueue,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrQueueArn(): String = unwrap(this).getAttrQueueArn()

  public open fun attrType(): String = unwrap(this).getAttrType()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun hoursOfOperationArn(): String = unwrap(this).getHoursOfOperationArn()

  public open fun hoursOfOperationArn(`value`: String) {
    unwrap(this).setHoursOfOperationArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun maxContacts(): Number? = unwrap(this).getMaxContacts()

  public open fun maxContacts(`value`: Number) {
    unwrap(this).setMaxContacts(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outboundCallerConfig(): Any? = unwrap(this).getOutboundCallerConfig()

  public open fun outboundCallerConfig(`value`: IResolvable) {
    unwrap(this).setOutboundCallerConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun outboundCallerConfig(`value`: OutboundCallerConfigProperty) {
    unwrap(this).setOutboundCallerConfig(`value`.let(OutboundCallerConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab8ea47268cf497727d015924e56654bac17c87fede1a93f7211ca86e3804e06")
  public open fun outboundCallerConfig(`value`: OutboundCallerConfigProperty.Builder.() -> Unit):
      Unit = outboundCallerConfig(OutboundCallerConfigProperty(`value`))

  public open fun quickConnectArns(): List<String> = unwrap(this).getQuickConnectArns() ?:
      emptyList()

  public open fun quickConnectArns(`value`: List<String>) {
    unwrap(this).setQuickConnectArns(`value`)
  }

  public open fun quickConnectArns(vararg `value`: String): Unit =
      quickConnectArns(`value`.toList())

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun hoursOfOperationArn(hoursOfOperationArn: String)

    public fun instanceArn(instanceArn: String)

    public fun maxContacts(maxContacts: Number)

    public fun name(name: String)

    public fun outboundCallerConfig(outboundCallerConfig: IResolvable)

    public fun outboundCallerConfig(outboundCallerConfig: OutboundCallerConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fea0c6d4349f0a909729187b8314330b05c7d9bb80d6adb423178a0df302ce2")
    public
        fun outboundCallerConfig(outboundCallerConfig: OutboundCallerConfigProperty.Builder.() -> Unit)

    public fun quickConnectArns(quickConnectArns: List<String>)

    public fun quickConnectArns(vararg quickConnectArns: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnQueue.Builder =
        software.amazon.awscdk.services.connect.CfnQueue.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun hoursOfOperationArn(hoursOfOperationArn: String) {
      cdkBuilder.hoursOfOperationArn(hoursOfOperationArn)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun maxContacts(maxContacts: Number) {
      cdkBuilder.maxContacts(maxContacts)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outboundCallerConfig(outboundCallerConfig: IResolvable) {
      cdkBuilder.outboundCallerConfig(outboundCallerConfig.let(IResolvable::unwrap))
    }

    override fun outboundCallerConfig(outboundCallerConfig: OutboundCallerConfigProperty) {
      cdkBuilder.outboundCallerConfig(outboundCallerConfig.let(OutboundCallerConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fea0c6d4349f0a909729187b8314330b05c7d9bb80d6adb423178a0df302ce2")
    override
        fun outboundCallerConfig(outboundCallerConfig: OutboundCallerConfigProperty.Builder.() -> Unit):
        Unit = outboundCallerConfig(OutboundCallerConfigProperty(outboundCallerConfig))

    override fun quickConnectArns(quickConnectArns: List<String>) {
      cdkBuilder.quickConnectArns(quickConnectArns)
    }

    override fun quickConnectArns(vararg quickConnectArns: String): Unit =
        quickConnectArns(quickConnectArns.toList())

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnQueue = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQueue): CfnQueue =
        CfnQueue(cdkObject)

    internal fun unwrap(wrapped: CfnQueue): software.amazon.awscdk.services.connect.CfnQueue =
        wrapped.cdkObject
  }

  public interface OutboundCallerConfigProperty {
    public fun outboundCallerIdName(): String? = unwrap(this).getOutboundCallerIdName()

    public fun outboundCallerIdNumberArn(): String? = unwrap(this).getOutboundCallerIdNumberArn()

    public fun outboundFlowArn(): String? = unwrap(this).getOutboundFlowArn()

    public interface Builder {
      public fun outboundCallerIdName(outboundCallerIdName: String)

      public fun outboundCallerIdNumberArn(outboundCallerIdNumberArn: String)

      public fun outboundFlowArn(outboundFlowArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty.Builder =
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty.builder()

      override fun outboundCallerIdName(outboundCallerIdName: String) {
        cdkBuilder.outboundCallerIdName(outboundCallerIdName)
      }

      override fun outboundCallerIdNumberArn(outboundCallerIdNumberArn: String) {
        cdkBuilder.outboundCallerIdNumberArn(outboundCallerIdNumberArn)
      }

      override fun outboundFlowArn(outboundFlowArn: String) {
        cdkBuilder.outboundFlowArn(outboundFlowArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty,
    ) : OutboundCallerConfigProperty {
      override fun outboundCallerIdName(): String? = unwrap(this).getOutboundCallerIdName()

      override fun outboundCallerIdNumberArn(): String? =
          unwrap(this).getOutboundCallerIdNumberArn()

      override fun outboundFlowArn(): String? = unwrap(this).getOutboundFlowArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutboundCallerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty):
          OutboundCallerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutboundCallerConfigProperty):
          software.amazon.awscdk.services.connect.CfnQueue.OutboundCallerConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
