package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnConfigRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrComplianceType(): String = unwrap(this).getAttrComplianceType()

  public open fun attrConfigRuleId(): String = unwrap(this).getAttrConfigRuleId()

  public open fun compliance(): Any? = unwrap(this).getCompliance()

  public open fun compliance(`value`: IResolvable) {
    unwrap(this).setCompliance(`value`.let(IResolvable::unwrap))
  }

  public open fun compliance(`value`: ComplianceProperty) {
    unwrap(this).setCompliance(`value`.let(ComplianceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5aa4aa97a95780ebd4465b2cc59aa248471283b964a5fd83200062bbf0591a85")
  public open fun compliance(`value`: ComplianceProperty.Builder.() -> Unit): Unit =
      compliance(ComplianceProperty(`value`))

  public open fun configRuleName(): String? = unwrap(this).getConfigRuleName()

  public open fun configRuleName(`value`: String) {
    unwrap(this).setConfigRuleName(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun evaluationModes(): Any? = unwrap(this).getEvaluationModes()

  public open fun evaluationModes(`value`: IResolvable) {
    unwrap(this).setEvaluationModes(`value`.let(IResolvable::unwrap))
  }

  public open fun evaluationModes(__idx_ac66f0: List<Any>) {
    unwrap(this).setEvaluationModes(__idx_ac66f0)
  }

  public open fun inputParameters(): Any? = unwrap(this).getInputParameters()

  public open fun inputParameters(`value`: Any) {
    unwrap(this).setInputParameters(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

  public open fun maximumExecutionFrequency(`value`: String) {
    unwrap(this).setMaximumExecutionFrequency(`value`)
  }

  public open fun scope(): Any? = unwrap(this).getScope()

  public open fun scope(`value`: IResolvable) {
    unwrap(this).setScope(`value`.let(IResolvable::unwrap))
  }

  public open fun scope(`value`: ScopeProperty) {
    unwrap(this).setScope(`value`.let(ScopeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("390a60f46dd0922a4d8cd89756b8180784f6aa3413a6f44d591228b0503d9c1d")
  public open fun scope(`value`: ScopeProperty.Builder.() -> Unit): Unit =
      scope(ScopeProperty(`value`))

  public open fun source(): Any = unwrap(this).getSource()

  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1c900c6a442538776ec5cbab84829fd048258aa502e9055763f85089f8f65e45")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  public interface Builder {
    public fun compliance(compliance: IResolvable)

    public fun compliance(compliance: ComplianceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40cc0eb811f463942ccfc092ba362c59856e246850c65154b5dc32ba08aeca1c")
    public fun compliance(compliance: ComplianceProperty.Builder.() -> Unit)

    public fun configRuleName(configRuleName: String)

    public fun description(description: String)

    public fun evaluationModes(evaluationModes: IResolvable)

    public fun evaluationModes(evaluationModes: List<Any>)

    public fun inputParameters(inputParameters: Any)

    public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

    public fun scope(scope: IResolvable)

    public fun scope(scope: ScopeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5832333865e867e7a16d84ff1e2319b57320efc981e6e843d70a2da4bdc5721")
    public fun scope(scope: ScopeProperty.Builder.() -> Unit)

    public fun source(source: IResolvable)

    public fun source(source: SourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("196e11ddbe92fd8fdfdd311a27085f5e054dc375ddd2f07731f8984c9ea7c449")
    public fun source(source: SourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConfigRule.Builder =
        software.amazon.awscdk.services.config.CfnConfigRule.Builder.create(scope, id)

    override fun compliance(compliance: IResolvable) {
      cdkBuilder.compliance(compliance.let(IResolvable::unwrap))
    }

    override fun compliance(compliance: ComplianceProperty) {
      cdkBuilder.compliance(compliance.let(ComplianceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40cc0eb811f463942ccfc092ba362c59856e246850c65154b5dc32ba08aeca1c")
    override fun compliance(compliance: ComplianceProperty.Builder.() -> Unit): Unit =
        compliance(ComplianceProperty(compliance))

    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun evaluationModes(evaluationModes: IResolvable) {
      cdkBuilder.evaluationModes(evaluationModes.let(IResolvable::unwrap))
    }

    override fun evaluationModes(evaluationModes: List<Any>) {
      cdkBuilder.evaluationModes(evaluationModes)
    }

    override fun inputParameters(inputParameters: Any) {
      cdkBuilder.inputParameters(inputParameters)
    }

    override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable::unwrap))
    }

    override fun scope(scope: ScopeProperty) {
      cdkBuilder.scope(scope.let(ScopeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5832333865e867e7a16d84ff1e2319b57320efc981e6e843d70a2da4bdc5721")
    override fun scope(scope: ScopeProperty.Builder.() -> Unit): Unit = scope(ScopeProperty(scope))

    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("196e11ddbe92fd8fdfdd311a27085f5e054dc375ddd2f07731f8984c9ea7c449")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    public fun build(): software.amazon.awscdk.services.config.CfnConfigRule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule):
        CfnConfigRule = CfnConfigRule(cdkObject)

    internal fun unwrap(wrapped: CfnConfigRule):
        software.amazon.awscdk.services.config.CfnConfigRule = wrapped.cdkObject
  }

  public interface ScopeProperty {
    public fun complianceResourceId(): String? = unwrap(this).getComplianceResourceId()

    public fun complianceResourceTypes(): List<String> = unwrap(this).getComplianceResourceTypes()
        ?: emptyList()

    public fun tagKey(): String? = unwrap(this).getTagKey()

    public fun tagValue(): String? = unwrap(this).getTagValue()

    public interface Builder {
      public fun complianceResourceId(complianceResourceId: String)

      public fun complianceResourceTypes(complianceResourceTypes: List<String>)

      public fun tagKey(tagKey: String)

      public fun tagValue(tagValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.builder()

      override fun complianceResourceId(complianceResourceId: String) {
        cdkBuilder.complianceResourceId(complianceResourceId)
      }

      override fun complianceResourceTypes(complianceResourceTypes: List<String>) {
        cdkBuilder.complianceResourceTypes(complianceResourceTypes)
      }

      override fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
      }

      override fun tagValue(tagValue: String) {
        cdkBuilder.tagValue(tagValue)
      }

      public fun build(): software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty,
    ) : ScopeProperty {
      override fun complianceResourceId(): String? = unwrap(this).getComplianceResourceId()

      override fun complianceResourceTypes(): List<String> =
          unwrap(this).getComplianceResourceTypes() ?: emptyList()

      override fun tagKey(): String? = unwrap(this).getTagKey()

      override fun tagValue(): String? = unwrap(this).getTagValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty):
          ScopeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScopeProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EvaluationModeConfigurationProperty {
    public fun mode(): String? = unwrap(this).getMode()

    public interface Builder {
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty.builder()

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty,
    ) : EvaluationModeConfigurationProperty {
      override fun mode(): String? = unwrap(this).getMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationModeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty):
          EvaluationModeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationModeConfigurationProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.EvaluationModeConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceProperty {
    public fun customPolicyDetails(): Any? = unwrap(this).getCustomPolicyDetails()

    public fun owner(): String

    public fun sourceDetails(): Any? = unwrap(this).getSourceDetails()

    public fun sourceIdentifier(): String? = unwrap(this).getSourceIdentifier()

    public interface Builder {
      public fun customPolicyDetails(customPolicyDetails: IResolvable)

      public fun customPolicyDetails(customPolicyDetails: CustomPolicyDetailsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("196cd2034ed6c9f8d93d514180a07bb627d9af41ecd9db175ead0b5f36cdcbc0")
      public
          fun customPolicyDetails(customPolicyDetails: CustomPolicyDetailsProperty.Builder.() -> Unit)

      public fun owner(owner: String)

      public fun sourceDetails(sourceDetails: IResolvable)

      public fun sourceDetails(sourceDetails: List<Any>)

      public fun sourceIdentifier(sourceIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.builder()

      override fun customPolicyDetails(customPolicyDetails: IResolvable) {
        cdkBuilder.customPolicyDetails(customPolicyDetails.let(IResolvable::unwrap))
      }

      override fun customPolicyDetails(customPolicyDetails: CustomPolicyDetailsProperty) {
        cdkBuilder.customPolicyDetails(customPolicyDetails.let(CustomPolicyDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("196cd2034ed6c9f8d93d514180a07bb627d9af41ecd9db175ead0b5f36cdcbc0")
      override
          fun customPolicyDetails(customPolicyDetails: CustomPolicyDetailsProperty.Builder.() -> Unit):
          Unit = customPolicyDetails(CustomPolicyDetailsProperty(customPolicyDetails))

      override fun owner(owner: String) {
        cdkBuilder.owner(owner)
      }

      override fun sourceDetails(sourceDetails: IResolvable) {
        cdkBuilder.sourceDetails(sourceDetails.let(IResolvable::unwrap))
      }

      override fun sourceDetails(sourceDetails: List<Any>) {
        cdkBuilder.sourceDetails(sourceDetails)
      }

      override fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
      }

      public fun build(): software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty,
    ) : SourceProperty {
      override fun customPolicyDetails(): Any? = unwrap(this).getCustomPolicyDetails()

      override fun owner(): String = unwrap(this).getOwner()

      override fun sourceDetails(): Any? = unwrap(this).getSourceDetails()

      override fun sourceIdentifier(): String? = unwrap(this).getSourceIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SourceDetailProperty {
    public fun eventSource(): String

    public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    public fun messageType(): String

    public interface Builder {
      public fun eventSource(eventSource: String)

      public fun maximumExecutionFrequency(maximumExecutionFrequency: String)

      public fun messageType(messageType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.builder()

      override fun eventSource(eventSource: String) {
        cdkBuilder.eventSource(eventSource)
      }

      override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
      }

      override fun messageType(messageType: String) {
        cdkBuilder.messageType(messageType)
      }

      public fun build(): software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty,
    ) : SourceDetailProperty {
      override fun eventSource(): String = unwrap(this).getEventSource()

      override fun maximumExecutionFrequency(): String? =
          unwrap(this).getMaximumExecutionFrequency()

      override fun messageType(): String = unwrap(this).getMessageType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty):
          SourceDetailProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceDetailProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomPolicyDetailsProperty {
    public fun enableDebugLogDelivery(): Any? = unwrap(this).getEnableDebugLogDelivery()

    public fun policyRuntime(): String? = unwrap(this).getPolicyRuntime()

    public fun policyText(): String? = unwrap(this).getPolicyText()

    public interface Builder {
      public fun enableDebugLogDelivery(enableDebugLogDelivery: Boolean)

      public fun enableDebugLogDelivery(enableDebugLogDelivery: IResolvable)

      public fun policyRuntime(policyRuntime: String)

      public fun policyText(policyText: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty.builder()

      override fun enableDebugLogDelivery(enableDebugLogDelivery: Boolean) {
        cdkBuilder.enableDebugLogDelivery(enableDebugLogDelivery)
      }

      override fun enableDebugLogDelivery(enableDebugLogDelivery: IResolvable) {
        cdkBuilder.enableDebugLogDelivery(enableDebugLogDelivery.let(IResolvable::unwrap))
      }

      override fun policyRuntime(policyRuntime: String) {
        cdkBuilder.policyRuntime(policyRuntime)
      }

      override fun policyText(policyText: String) {
        cdkBuilder.policyText(policyText)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty,
    ) : CustomPolicyDetailsProperty {
      override fun enableDebugLogDelivery(): Any? = unwrap(this).getEnableDebugLogDelivery()

      override fun policyRuntime(): String? = unwrap(this).getPolicyRuntime()

      override fun policyText(): String? = unwrap(this).getPolicyText()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPolicyDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty):
          CustomPolicyDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPolicyDetailsProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.CustomPolicyDetailsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComplianceProperty {
    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty.Builder =
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty,
    ) : ComplianceProperty {
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComplianceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty):
          ComplianceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComplianceProperty):
          software.amazon.awscdk.services.config.CfnConfigRule.ComplianceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
