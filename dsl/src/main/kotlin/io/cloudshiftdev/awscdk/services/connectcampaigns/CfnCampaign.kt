package io.cloudshiftdev.awscdk.services.connectcampaigns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnCampaign internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun connectInstanceArn(): String = unwrap(this).getConnectInstanceArn()

  public open fun connectInstanceArn(`value`: String) {
    unwrap(this).setConnectInstanceArn(`value`)
  }

  public open fun dialerConfig(): Any = unwrap(this).getDialerConfig()

  public open fun dialerConfig(`value`: IResolvable) {
    unwrap(this).setDialerConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun dialerConfig(`value`: DialerConfigProperty) {
    unwrap(this).setDialerConfig(`value`.let(DialerConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1342c6fbb8f0cf07234456bb5c3bf577989c593826c26e0f8ae29128687e6a71")
  public open fun dialerConfig(`value`: DialerConfigProperty.Builder.() -> Unit): Unit =
      dialerConfig(DialerConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outboundCallConfig(): Any = unwrap(this).getOutboundCallConfig()

  public open fun outboundCallConfig(`value`: IResolvable) {
    unwrap(this).setOutboundCallConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun outboundCallConfig(`value`: OutboundCallConfigProperty) {
    unwrap(this).setOutboundCallConfig(`value`.let(OutboundCallConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("59c6144b6ed2768384def521c363736d76933122a1bef8641e64a8592d96fd53")
  public open fun outboundCallConfig(`value`: OutboundCallConfigProperty.Builder.() -> Unit): Unit =
      outboundCallConfig(OutboundCallConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun connectInstanceArn(connectInstanceArn: String)

    public fun dialerConfig(dialerConfig: IResolvable)

    public fun dialerConfig(dialerConfig: DialerConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f55c809b3e8c0f3b83dab3a144dada3015026ada9a6a4d8d0e3905a638abf64")
    public fun dialerConfig(dialerConfig: DialerConfigProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun outboundCallConfig(outboundCallConfig: IResolvable)

    public fun outboundCallConfig(outboundCallConfig: OutboundCallConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8c96dc62df14c4127f1ecaff294064aab077816c13f7001d89338b6c13ff5b9")
    public fun outboundCallConfig(outboundCallConfig: OutboundCallConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.Builder =
        software.amazon.awscdk.services.connectcampaigns.CfnCampaign.Builder.create(scope, id)

    override fun connectInstanceArn(connectInstanceArn: String) {
      cdkBuilder.connectInstanceArn(connectInstanceArn)
    }

    override fun dialerConfig(dialerConfig: IResolvable) {
      cdkBuilder.dialerConfig(dialerConfig.let(IResolvable::unwrap))
    }

    override fun dialerConfig(dialerConfig: DialerConfigProperty) {
      cdkBuilder.dialerConfig(dialerConfig.let(DialerConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f55c809b3e8c0f3b83dab3a144dada3015026ada9a6a4d8d0e3905a638abf64")
    override fun dialerConfig(dialerConfig: DialerConfigProperty.Builder.() -> Unit): Unit =
        dialerConfig(DialerConfigProperty(dialerConfig))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outboundCallConfig(outboundCallConfig: IResolvable) {
      cdkBuilder.outboundCallConfig(outboundCallConfig.let(IResolvable::unwrap))
    }

    override fun outboundCallConfig(outboundCallConfig: OutboundCallConfigProperty) {
      cdkBuilder.outboundCallConfig(outboundCallConfig.let(OutboundCallConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8c96dc62df14c4127f1ecaff294064aab077816c13f7001d89338b6c13ff5b9")
    override
        fun outboundCallConfig(outboundCallConfig: OutboundCallConfigProperty.Builder.() -> Unit):
        Unit = outboundCallConfig(OutboundCallConfigProperty(outboundCallConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connectcampaigns.CfnCampaign =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCampaign {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCampaign(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign):
        CfnCampaign = CfnCampaign(cdkObject)

    internal fun unwrap(wrapped: CfnCampaign):
        software.amazon.awscdk.services.connectcampaigns.CfnCampaign = wrapped.cdkObject
  }

  public interface AnswerMachineDetectionConfigProperty {
    public fun enableAnswerMachineDetection(): Any

    public interface Builder {
      public fun enableAnswerMachineDetection(enableAnswerMachineDetection: Boolean)

      public fun enableAnswerMachineDetection(enableAnswerMachineDetection: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty.builder()

      override fun enableAnswerMachineDetection(enableAnswerMachineDetection: Boolean) {
        cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection)
      }

      override fun enableAnswerMachineDetection(enableAnswerMachineDetection: IResolvable) {
        cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty,
    ) : AnswerMachineDetectionConfigProperty {
      override fun enableAnswerMachineDetection(): Any =
          unwrap(this).getEnableAnswerMachineDetection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnswerMachineDetectionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty):
          AnswerMachineDetectionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnswerMachineDetectionConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AgentlessDialerConfigProperty {
    public fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()

    public interface Builder {
      public fun dialingCapacity(dialingCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty.builder()

      override fun dialingCapacity(dialingCapacity: Number) {
        cdkBuilder.dialingCapacity(dialingCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty,
    ) : AgentlessDialerConfigProperty {
      override fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AgentlessDialerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty):
          AgentlessDialerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentlessDialerConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutboundCallConfigProperty {
    public fun answerMachineDetectionConfig(): Any? = unwrap(this).getAnswerMachineDetectionConfig()

    public fun connectContactFlowArn(): String

    public fun connectQueueArn(): String? = unwrap(this).getConnectQueueArn()

    public fun connectSourcePhoneNumber(): String? = unwrap(this).getConnectSourcePhoneNumber()

    public interface Builder {
      public fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable)

      public
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30b5821eb58e3395cd2d600c69a1fc9ca3fbab80d0f64fe4265499bbfaf82784")
      public
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty.Builder.() -> Unit)

      public fun connectContactFlowArn(connectContactFlowArn: String)

      public fun connectQueueArn(connectQueueArn: String)

      public fun connectSourcePhoneNumber(connectSourcePhoneNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty.builder()

      override fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable) {
        cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig.let(IResolvable::unwrap))
      }

      override
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty) {
        cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig.let(AnswerMachineDetectionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30b5821eb58e3395cd2d600c69a1fc9ca3fbab80d0f64fe4265499bbfaf82784")
      override
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty.Builder.() -> Unit):
          Unit =
          answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty(answerMachineDetectionConfig))

      override fun connectContactFlowArn(connectContactFlowArn: String) {
        cdkBuilder.connectContactFlowArn(connectContactFlowArn)
      }

      override fun connectQueueArn(connectQueueArn: String) {
        cdkBuilder.connectQueueArn(connectQueueArn)
      }

      override fun connectSourcePhoneNumber(connectSourcePhoneNumber: String) {
        cdkBuilder.connectSourcePhoneNumber(connectSourcePhoneNumber)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty,
    ) : OutboundCallConfigProperty {
      override fun answerMachineDetectionConfig(): Any? =
          unwrap(this).getAnswerMachineDetectionConfig()

      override fun connectContactFlowArn(): String = unwrap(this).getConnectContactFlowArn()

      override fun connectQueueArn(): String? = unwrap(this).getConnectQueueArn()

      override fun connectSourcePhoneNumber(): String? = unwrap(this).getConnectSourcePhoneNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutboundCallConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty):
          OutboundCallConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutboundCallConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DialerConfigProperty {
    public fun agentlessDialerConfig(): Any? = unwrap(this).getAgentlessDialerConfig()

    public fun predictiveDialerConfig(): Any? = unwrap(this).getPredictiveDialerConfig()

    public fun progressiveDialerConfig(): Any? = unwrap(this).getProgressiveDialerConfig()

    public interface Builder {
      public fun agentlessDialerConfig(agentlessDialerConfig: IResolvable)

      public fun agentlessDialerConfig(agentlessDialerConfig: AgentlessDialerConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b45977c5de4e7662314547f9d6ec3f9572397a61960db97c408fcf7651dd4fe6")
      public
          fun agentlessDialerConfig(agentlessDialerConfig: AgentlessDialerConfigProperty.Builder.() -> Unit)

      public fun predictiveDialerConfig(predictiveDialerConfig: IResolvable)

      public fun predictiveDialerConfig(predictiveDialerConfig: PredictiveDialerConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83e453982aa0bff87c995c7b9d0c614bc3746d4e4c83d18172d9e4d3b9f42059")
      public
          fun predictiveDialerConfig(predictiveDialerConfig: PredictiveDialerConfigProperty.Builder.() -> Unit)

      public fun progressiveDialerConfig(progressiveDialerConfig: IResolvable)

      public fun progressiveDialerConfig(progressiveDialerConfig: ProgressiveDialerConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a824f01e264afcdef0e7e56bc6fcedf0053fdc65017727ec0f7824869d40e46")
      public
          fun progressiveDialerConfig(progressiveDialerConfig: ProgressiveDialerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty.builder()

      override fun agentlessDialerConfig(agentlessDialerConfig: IResolvable) {
        cdkBuilder.agentlessDialerConfig(agentlessDialerConfig.let(IResolvable::unwrap))
      }

      override fun agentlessDialerConfig(agentlessDialerConfig: AgentlessDialerConfigProperty) {
        cdkBuilder.agentlessDialerConfig(agentlessDialerConfig.let(AgentlessDialerConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b45977c5de4e7662314547f9d6ec3f9572397a61960db97c408fcf7651dd4fe6")
      override
          fun agentlessDialerConfig(agentlessDialerConfig: AgentlessDialerConfigProperty.Builder.() -> Unit):
          Unit = agentlessDialerConfig(AgentlessDialerConfigProperty(agentlessDialerConfig))

      override fun predictiveDialerConfig(predictiveDialerConfig: IResolvable) {
        cdkBuilder.predictiveDialerConfig(predictiveDialerConfig.let(IResolvable::unwrap))
      }

      override fun predictiveDialerConfig(predictiveDialerConfig: PredictiveDialerConfigProperty) {
        cdkBuilder.predictiveDialerConfig(predictiveDialerConfig.let(PredictiveDialerConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83e453982aa0bff87c995c7b9d0c614bc3746d4e4c83d18172d9e4d3b9f42059")
      override
          fun predictiveDialerConfig(predictiveDialerConfig: PredictiveDialerConfigProperty.Builder.() -> Unit):
          Unit = predictiveDialerConfig(PredictiveDialerConfigProperty(predictiveDialerConfig))

      override fun progressiveDialerConfig(progressiveDialerConfig: IResolvable) {
        cdkBuilder.progressiveDialerConfig(progressiveDialerConfig.let(IResolvable::unwrap))
      }

      override
          fun progressiveDialerConfig(progressiveDialerConfig: ProgressiveDialerConfigProperty) {
        cdkBuilder.progressiveDialerConfig(progressiveDialerConfig.let(ProgressiveDialerConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a824f01e264afcdef0e7e56bc6fcedf0053fdc65017727ec0f7824869d40e46")
      override
          fun progressiveDialerConfig(progressiveDialerConfig: ProgressiveDialerConfigProperty.Builder.() -> Unit):
          Unit = progressiveDialerConfig(ProgressiveDialerConfigProperty(progressiveDialerConfig))

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty,
    ) : DialerConfigProperty {
      override fun agentlessDialerConfig(): Any? = unwrap(this).getAgentlessDialerConfig()

      override fun predictiveDialerConfig(): Any? = unwrap(this).getPredictiveDialerConfig()

      override fun progressiveDialerConfig(): Any? = unwrap(this).getProgressiveDialerConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DialerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty):
          DialerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialerConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PredictiveDialerConfigProperty {
    public fun bandwidthAllocation(): Number

    public fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()

    public interface Builder {
      public fun bandwidthAllocation(bandwidthAllocation: Number)

      public fun dialingCapacity(dialingCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty.builder()

      override fun bandwidthAllocation(bandwidthAllocation: Number) {
        cdkBuilder.bandwidthAllocation(bandwidthAllocation)
      }

      override fun dialingCapacity(dialingCapacity: Number) {
        cdkBuilder.dialingCapacity(dialingCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty,
    ) : PredictiveDialerConfigProperty {
      override fun bandwidthAllocation(): Number = unwrap(this).getBandwidthAllocation()

      override fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PredictiveDialerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty):
          PredictiveDialerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveDialerConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProgressiveDialerConfigProperty {
    public fun bandwidthAllocation(): Number

    public fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()

    public interface Builder {
      public fun bandwidthAllocation(bandwidthAllocation: Number)

      public fun dialingCapacity(dialingCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty.builder()

      override fun bandwidthAllocation(bandwidthAllocation: Number) {
        cdkBuilder.bandwidthAllocation(bandwidthAllocation)
      }

      override fun dialingCapacity(dialingCapacity: Number) {
        cdkBuilder.dialingCapacity(dialingCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty,
    ) : ProgressiveDialerConfigProperty {
      override fun bandwidthAllocation(): Number = unwrap(this).getBandwidthAllocation()

      override fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProgressiveDialerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty):
          ProgressiveDialerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProgressiveDialerConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
