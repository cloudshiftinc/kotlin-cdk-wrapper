package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSamplingRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun ruleName(): String? = unwrap(this).getRuleName()

  @Deprecated(message = "deprecated in CDK")
  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  public open fun samplingRule(): Any? = unwrap(this).getSamplingRule()

  public open fun samplingRule(`value`: IResolvable) {
    unwrap(this).setSamplingRule(`value`.let(IResolvable::unwrap))
  }

  public open fun samplingRule(`value`: SamplingRuleProperty) {
    unwrap(this).setSamplingRule(`value`.let(SamplingRuleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37472a2510c859b7cbe11b1dc88b0a255339ce976cdb0d91ceecc303b0930a27")
  public open fun samplingRule(`value`: SamplingRuleProperty.Builder.() -> Unit): Unit =
      samplingRule(SamplingRuleProperty(`value`))

  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleRecord(): Any? = unwrap(this).getSamplingRuleRecord()

  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleRecord(`value`: IResolvable) {
    unwrap(this).setSamplingRuleRecord(`value`.let(IResolvable::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleRecord(`value`: SamplingRuleRecordProperty) {
    unwrap(this).setSamplingRuleRecord(`value`.let(SamplingRuleRecordProperty::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15adbfc34f3b59b8505c9787b7b0f468c359830643a1e9f060ff7d6bc3dbdb9d")
  public open fun samplingRuleRecord(`value`: SamplingRuleRecordProperty.Builder.() -> Unit): Unit =
      samplingRuleRecord(SamplingRuleRecordProperty(`value`))

  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleUpdate(): Any? = unwrap(this).getSamplingRuleUpdate()

  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleUpdate(`value`: IResolvable) {
    unwrap(this).setSamplingRuleUpdate(`value`.let(IResolvable::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleUpdate(`value`: SamplingRuleUpdateProperty) {
    unwrap(this).setSamplingRuleUpdate(`value`.let(SamplingRuleUpdateProperty::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("900633761a1f94263b9bb82b45f70b9e6a6ebf2afc1035b7332813c877cea9e0")
  public open fun samplingRuleUpdate(`value`: SamplingRuleUpdateProperty.Builder.() -> Unit): Unit =
      samplingRuleUpdate(SamplingRuleUpdateProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun ruleName(ruleName: String)

    public fun samplingRule(samplingRule: IResolvable)

    public fun samplingRule(samplingRule: SamplingRuleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("476ff858ddaa900ccc407e7324c1a97e86c63086543927965bc6df26dacdb71b")
    public fun samplingRule(samplingRule: SamplingRuleProperty.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleRecord(samplingRuleRecord: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleRecord(samplingRuleRecord: SamplingRuleRecordProperty)

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9512381903e4b282b50e8957ec042d2f99e67305fa5596a9d97eddf38683076")
    public fun samplingRuleRecord(samplingRuleRecord: SamplingRuleRecordProperty.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleUpdate(samplingRuleUpdate: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleUpdate(samplingRuleUpdate: SamplingRuleUpdateProperty)

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4de8ad76fdb29adbb93e3cb81dfc874a57d56809daebd73aa4c85e4f246035d2")
    public fun samplingRuleUpdate(samplingRuleUpdate: SamplingRuleUpdateProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnSamplingRule.Builder =
        software.amazon.awscdk.services.xray.CfnSamplingRule.Builder.create(scope, id)

    @Deprecated(message = "deprecated in CDK")
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun samplingRule(samplingRule: IResolvable) {
      cdkBuilder.samplingRule(samplingRule.let(IResolvable::unwrap))
    }

    override fun samplingRule(samplingRule: SamplingRuleProperty) {
      cdkBuilder.samplingRule(samplingRule.let(SamplingRuleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("476ff858ddaa900ccc407e7324c1a97e86c63086543927965bc6df26dacdb71b")
    override fun samplingRule(samplingRule: SamplingRuleProperty.Builder.() -> Unit): Unit =
        samplingRule(SamplingRuleProperty(samplingRule))

    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleRecord(samplingRuleRecord: IResolvable) {
      cdkBuilder.samplingRuleRecord(samplingRuleRecord.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleRecord(samplingRuleRecord: SamplingRuleRecordProperty) {
      cdkBuilder.samplingRuleRecord(samplingRuleRecord.let(SamplingRuleRecordProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9512381903e4b282b50e8957ec042d2f99e67305fa5596a9d97eddf38683076")
    override
        fun samplingRuleRecord(samplingRuleRecord: SamplingRuleRecordProperty.Builder.() -> Unit):
        Unit = samplingRuleRecord(SamplingRuleRecordProperty(samplingRuleRecord))

    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleUpdate(samplingRuleUpdate: IResolvable) {
      cdkBuilder.samplingRuleUpdate(samplingRuleUpdate.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleUpdate(samplingRuleUpdate: SamplingRuleUpdateProperty) {
      cdkBuilder.samplingRuleUpdate(samplingRuleUpdate.let(SamplingRuleUpdateProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4de8ad76fdb29adbb93e3cb81dfc874a57d56809daebd73aa4c85e4f246035d2")
    override
        fun samplingRuleUpdate(samplingRuleUpdate: SamplingRuleUpdateProperty.Builder.() -> Unit):
        Unit = samplingRuleUpdate(SamplingRuleUpdateProperty(samplingRuleUpdate))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.xray.CfnSamplingRule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSamplingRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSamplingRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule):
        CfnSamplingRule = CfnSamplingRule(cdkObject)

    internal fun unwrap(wrapped: CfnSamplingRule):
        software.amazon.awscdk.services.xray.CfnSamplingRule = wrapped.cdkObject
  }

  public interface SamplingRuleUpdateProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public fun fixedRate(): Number? = unwrap(this).getFixedRate()

    public fun host(): String? = unwrap(this).getHost()

    public fun httpMethod(): String? = unwrap(this).getHttpMethod()

    public fun priority(): Number? = unwrap(this).getPriority()

    public fun reservoirSize(): Number? = unwrap(this).getReservoirSize()

    public fun resourceArn(): String? = unwrap(this).getResourceArn()

    public fun ruleArn(): String? = unwrap(this).getRuleArn()

    public fun ruleName(): String? = unwrap(this).getRuleName()

    public fun serviceName(): String? = unwrap(this).getServiceName()

    public fun serviceType(): String? = unwrap(this).getServiceType()

    public fun urlPath(): String? = unwrap(this).getUrlPath()

    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: Map<String, String>)

      public fun fixedRate(fixedRate: Number)

      public fun host(host: String)

      public fun httpMethod(httpMethod: String)

      public fun priority(priority: Number)

      public fun reservoirSize(reservoirSize: Number)

      public fun resourceArn(resourceArn: String)

      public fun ruleArn(ruleArn: String)

      public fun ruleName(ruleName: String)

      public fun serviceName(serviceName: String)

      public fun serviceType(serviceType: String)

      public fun urlPath(urlPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty.Builder =
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      override fun fixedRate(fixedRate: Number) {
        cdkBuilder.fixedRate(fixedRate)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun reservoirSize(reservoirSize: Number) {
        cdkBuilder.reservoirSize(reservoirSize)
      }

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      override fun ruleArn(ruleArn: String) {
        cdkBuilder.ruleArn(ruleArn)
      }

      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      override fun serviceType(serviceType: String) {
        cdkBuilder.serviceType(serviceType)
      }

      override fun urlPath(urlPath: String) {
        cdkBuilder.urlPath(urlPath)
      }

      public fun build():
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty,
    ) : SamplingRuleUpdateProperty {
      override fun attributes(): Any? = unwrap(this).getAttributes()

      override fun fixedRate(): Number? = unwrap(this).getFixedRate()

      override fun host(): String? = unwrap(this).getHost()

      override fun httpMethod(): String? = unwrap(this).getHttpMethod()

      override fun priority(): Number? = unwrap(this).getPriority()

      override fun reservoirSize(): Number? = unwrap(this).getReservoirSize()

      override fun resourceArn(): String? = unwrap(this).getResourceArn()

      override fun ruleArn(): String? = unwrap(this).getRuleArn()

      override fun ruleName(): String? = unwrap(this).getRuleName()

      override fun serviceName(): String? = unwrap(this).getServiceName()

      override fun serviceType(): String? = unwrap(this).getServiceType()

      override fun urlPath(): String? = unwrap(this).getUrlPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SamplingRuleUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty):
          SamplingRuleUpdateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamplingRuleUpdateProperty):
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SamplingRuleRecordProperty {
    public fun createdAt(): String? = unwrap(this).getCreatedAt()

    public fun modifiedAt(): String? = unwrap(this).getModifiedAt()

    public fun samplingRule(): Any? = unwrap(this).getSamplingRule()

    public interface Builder {
      public fun createdAt(createdAt: String)

      public fun modifiedAt(modifiedAt: String)

      public fun samplingRule(samplingRule: IResolvable)

      public fun samplingRule(samplingRule: SamplingRuleProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c9de72ca80f09c20d098e90d2651b92910a0810750e74af4d05c2fa127941a")
      public fun samplingRule(samplingRule: SamplingRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty.Builder =
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty.builder()

      override fun createdAt(createdAt: String) {
        cdkBuilder.createdAt(createdAt)
      }

      override fun modifiedAt(modifiedAt: String) {
        cdkBuilder.modifiedAt(modifiedAt)
      }

      override fun samplingRule(samplingRule: IResolvable) {
        cdkBuilder.samplingRule(samplingRule.let(IResolvable::unwrap))
      }

      override fun samplingRule(samplingRule: SamplingRuleProperty) {
        cdkBuilder.samplingRule(samplingRule.let(SamplingRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c9de72ca80f09c20d098e90d2651b92910a0810750e74af4d05c2fa127941a")
      override fun samplingRule(samplingRule: SamplingRuleProperty.Builder.() -> Unit): Unit =
          samplingRule(SamplingRuleProperty(samplingRule))

      public fun build():
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty,
    ) : SamplingRuleRecordProperty {
      override fun createdAt(): String? = unwrap(this).getCreatedAt()

      override fun modifiedAt(): String? = unwrap(this).getModifiedAt()

      override fun samplingRule(): Any? = unwrap(this).getSamplingRule()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SamplingRuleRecordProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty):
          SamplingRuleRecordProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamplingRuleRecordProperty):
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SamplingRuleProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public fun fixedRate(): Number

    public fun host(): String

    public fun httpMethod(): String

    public fun priority(): Number

    public fun reservoirSize(): Number

    public fun resourceArn(): String

    public fun ruleArn(): String? = unwrap(this).getRuleArn()

    public fun ruleName(): String? = unwrap(this).getRuleName()

    public fun serviceName(): String

    public fun serviceType(): String

    public fun urlPath(): String

    public fun version(): Number? = unwrap(this).getVersion()

    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: Map<String, String>)

      public fun fixedRate(fixedRate: Number)

      public fun host(host: String)

      public fun httpMethod(httpMethod: String)

      public fun priority(priority: Number)

      public fun reservoirSize(reservoirSize: Number)

      public fun resourceArn(resourceArn: String)

      public fun ruleArn(ruleArn: String)

      public fun ruleName(ruleName: String)

      public fun serviceName(serviceName: String)

      public fun serviceType(serviceType: String)

      public fun urlPath(urlPath: String)

      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty.Builder =
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      override fun fixedRate(fixedRate: Number) {
        cdkBuilder.fixedRate(fixedRate)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun reservoirSize(reservoirSize: Number) {
        cdkBuilder.reservoirSize(reservoirSize)
      }

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      override fun ruleArn(ruleArn: String) {
        cdkBuilder.ruleArn(ruleArn)
      }

      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      override fun serviceType(serviceType: String) {
        cdkBuilder.serviceType(serviceType)
      }

      override fun urlPath(urlPath: String) {
        cdkBuilder.urlPath(urlPath)
      }

      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty,
    ) : SamplingRuleProperty {
      override fun attributes(): Any? = unwrap(this).getAttributes()

      override fun fixedRate(): Number = unwrap(this).getFixedRate()

      override fun host(): String = unwrap(this).getHost()

      override fun httpMethod(): String = unwrap(this).getHttpMethod()

      override fun priority(): Number = unwrap(this).getPriority()

      override fun reservoirSize(): Number = unwrap(this).getReservoirSize()

      override fun resourceArn(): String = unwrap(this).getResourceArn()

      override fun ruleArn(): String? = unwrap(this).getRuleArn()

      override fun ruleName(): String? = unwrap(this).getRuleName()

      override fun serviceName(): String = unwrap(this).getServiceName()

      override fun serviceType(): String = unwrap(this).getServiceType()

      override fun urlPath(): String = unwrap(this).getUrlPath()

      override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SamplingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty):
          SamplingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamplingRuleProperty):
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
