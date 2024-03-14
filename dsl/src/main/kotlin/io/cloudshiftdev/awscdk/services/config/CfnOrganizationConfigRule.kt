package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOrganizationConfigRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?:
      emptyList()

  public open fun excludedAccounts(`value`: List<String>) {
    unwrap(this).setExcludedAccounts(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun organizationConfigRuleName(): String =
      unwrap(this).getOrganizationConfigRuleName()

  public open fun organizationConfigRuleName(`value`: String) {
    unwrap(this).setOrganizationConfigRuleName(`value`)
  }

  public open fun organizationCustomPolicyRuleMetadata(): Any? =
      unwrap(this).getOrganizationCustomPolicyRuleMetadata()

  public open fun organizationCustomPolicyRuleMetadata(`value`: IResolvable) {
    unwrap(this).setOrganizationCustomPolicyRuleMetadata(`value`.let(IResolvable::unwrap))
  }

  public open
      fun organizationCustomPolicyRuleMetadata(`value`: OrganizationCustomPolicyRuleMetadataProperty) {
    unwrap(this).setOrganizationCustomPolicyRuleMetadata(`value`.let(OrganizationCustomPolicyRuleMetadataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28707c9db6493c309cfb7aac25bca957913d9a510dc5d1f5c38107f3e1043aa5")
  public open
      fun organizationCustomPolicyRuleMetadata(`value`: OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit):
      Unit =
      organizationCustomPolicyRuleMetadata(OrganizationCustomPolicyRuleMetadataProperty(`value`))

  public open fun organizationCustomRuleMetadata(): Any? =
      unwrap(this).getOrganizationCustomRuleMetadata()

  public open fun organizationCustomRuleMetadata(`value`: IResolvable) {
    unwrap(this).setOrganizationCustomRuleMetadata(`value`.let(IResolvable::unwrap))
  }

  public open fun organizationCustomRuleMetadata(`value`: OrganizationCustomRuleMetadataProperty) {
    unwrap(this).setOrganizationCustomRuleMetadata(`value`.let(OrganizationCustomRuleMetadataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08700c2d2ad01c88a0f6b332b3dbc0ead6218e89dfa66b54c9a89ceb5faaedd1")
  public open
      fun organizationCustomRuleMetadata(`value`: OrganizationCustomRuleMetadataProperty.Builder.() -> Unit):
      Unit = organizationCustomRuleMetadata(OrganizationCustomRuleMetadataProperty(`value`))

  public open fun organizationManagedRuleMetadata(): Any? =
      unwrap(this).getOrganizationManagedRuleMetadata()

  public open fun organizationManagedRuleMetadata(`value`: IResolvable) {
    unwrap(this).setOrganizationManagedRuleMetadata(`value`.let(IResolvable::unwrap))
  }

  public open
      fun organizationManagedRuleMetadata(`value`: OrganizationManagedRuleMetadataProperty) {
    unwrap(this).setOrganizationManagedRuleMetadata(`value`.let(OrganizationManagedRuleMetadataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb84dc82be42ba1def9fd1f42436c59be3b2d8eb36ae79f6cac9d713b4975c9c")
  public open
      fun organizationManagedRuleMetadata(`value`: OrganizationManagedRuleMetadataProperty.Builder.() -> Unit):
      Unit = organizationManagedRuleMetadata(OrganizationManagedRuleMetadataProperty(`value`))

  public interface Builder {
    public fun excludedAccounts(excludedAccounts: List<String>) {
    }

    public fun organizationConfigRuleName(organizationConfigRuleName: String) {
    }

    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable) {
    }

    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: OrganizationCustomPolicyRuleMetadataProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f08d08c57d84d7a6c704c25f83bb432876c4800d347cf2104cda2e0914f64c")
    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit) {
    }

    public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
    }

    public
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: OrganizationCustomRuleMetadataProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14d1253e88a58a6f7c872973ea8d4b6a3ed2d884444fc96852d29c7c0264e4c5")
    public
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: OrganizationCustomRuleMetadataProperty.Builder.() -> Unit) {
    }

    public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
    }

    public
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: OrganizationManagedRuleMetadataProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce5e5d3f5c4679b8801db5891aa1ce18dd3cba0f87da01202bf251a711bc4918")
    public
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: OrganizationManagedRuleMetadataProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnOrganizationConfigRule.Builder
        = software.amazon.awscdk.services.config.CfnOrganizationConfigRule.Builder.create(scope, id)

    public override fun excludedAccounts(excludedAccounts: List<String>) {
      cdkBuilder.excludedAccounts(excludedAccounts)
    }

    public override fun organizationConfigRuleName(organizationConfigRuleName: String) {
      cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
    }

    public override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable) {
      cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata.let(IResolvable::unwrap))
    }

    public override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: OrganizationCustomPolicyRuleMetadataProperty) {
      cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata.let(OrganizationCustomPolicyRuleMetadataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f08d08c57d84d7a6c704c25f83bb432876c4800d347cf2104cda2e0914f64c")
    public override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationCustomPolicyRuleMetadata(OrganizationCustomPolicyRuleMetadataProperty(organizationCustomPolicyRuleMetadata))

    public override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
      cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata.let(IResolvable::unwrap))
    }

    public override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: OrganizationCustomRuleMetadataProperty) {
      cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata.let(OrganizationCustomRuleMetadataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14d1253e88a58a6f7c872973ea8d4b6a3ed2d884444fc96852d29c7c0264e4c5")
    public override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: OrganizationCustomRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationCustomRuleMetadata(OrganizationCustomRuleMetadataProperty(organizationCustomRuleMetadata))

    public override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
      cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata.let(IResolvable::unwrap))
    }

    public override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: OrganizationManagedRuleMetadataProperty) {
      cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata.let(OrganizationManagedRuleMetadataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce5e5d3f5c4679b8801db5891aa1ce18dd3cba0f87da01202bf251a711bc4918")
    public override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: OrganizationManagedRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationManagedRuleMetadata(OrganizationManagedRuleMetadataProperty(organizationManagedRuleMetadata))

    public fun build(): software.amazon.awscdk.services.config.CfnOrganizationConfigRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganizationConfigRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganizationConfigRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule):
        CfnOrganizationConfigRule = CfnOrganizationConfigRule(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationConfigRule):
        software.amazon.awscdk.services.config.CfnOrganizationConfigRule = wrapped.cdkObject
  }

  public interface OrganizationCustomRuleMetadataProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun inputParameters(): String? = unwrap(this).getInputParameters()

    public fun lambdaFunctionArn(): String

    public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    public fun organizationConfigRuleTriggerTypes(): List<String>

    public fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

    public fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
        emptyList()

    public fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

    public fun tagValueScope(): String? = unwrap(this).getTagValueScope()

    public interface Builder {
      public fun description(description: String) {
      }

      public fun inputParameters(inputParameters: String) {
      }

      public fun lambdaFunctionArn(lambdaFunctionArn: String) {
      }

      public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
      }

      public
          fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: List<String>) {
      }

      public fun resourceIdScope(resourceIdScope: String) {
      }

      public fun resourceTypesScope(resourceTypesScope: List<String>) {
      }

      public fun tagKeyScope(tagKeyScope: String) {
      }

      public fun tagValueScope(tagValueScope: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
      }

      public override fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
      }

      public override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
      }

      public override
          fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: List<String>) {
        cdkBuilder.organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes)
      }

      public override fun resourceIdScope(resourceIdScope: String) {
        cdkBuilder.resourceIdScope(resourceIdScope)
      }

      public override fun resourceTypesScope(resourceTypesScope: List<String>) {
        cdkBuilder.resourceTypesScope(resourceTypesScope)
      }

      public override fun tagKeyScope(tagKeyScope: String) {
        cdkBuilder.tagKeyScope(tagKeyScope)
      }

      public override fun tagValueScope(tagValueScope: String) {
        cdkBuilder.tagValueScope(tagValueScope)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty,
    ) : OrganizationCustomRuleMetadataProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun inputParameters(): String? = unwrap(this).getInputParameters()

      public override fun lambdaFunctionArn(): String = unwrap(this).getLambdaFunctionArn()

      public override fun maximumExecutionFrequency(): String? =
          unwrap(this).getMaximumExecutionFrequency()

      public override fun organizationConfigRuleTriggerTypes(): List<String> =
          unwrap(this).getOrganizationConfigRuleTriggerTypes() ?: emptyList()

      public override fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

      public override fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope()
          ?: emptyList()

      public override fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

      public override fun tagValueScope(): String? = unwrap(this).getTagValueScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrganizationCustomRuleMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty):
          OrganizationCustomRuleMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrganizationCustomRuleMetadataProperty):
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OrganizationCustomPolicyRuleMetadataProperty {
    public fun debugLogDeliveryAccounts(): List<String> = unwrap(this).getDebugLogDeliveryAccounts()
        ?: emptyList()

    public fun description(): String? = unwrap(this).getDescription()

    public fun inputParameters(): String? = unwrap(this).getInputParameters()

    public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    public fun organizationConfigRuleTriggerTypes(): List<String> =
        unwrap(this).getOrganizationConfigRuleTriggerTypes() ?: emptyList()

    public fun policyText(): String

    public fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

    public fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
        emptyList()

    public fun runtime(): String

    public fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

    public fun tagValueScope(): String? = unwrap(this).getTagValueScope()

    public interface Builder {
      public fun debugLogDeliveryAccounts(debugLogDeliveryAccounts: List<String>) {
      }

      public fun description(description: String) {
      }

      public fun inputParameters(inputParameters: String) {
      }

      public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
      }

      public
          fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: List<String>) {
      }

      public fun policyText(policyText: String) {
      }

      public fun resourceIdScope(resourceIdScope: String) {
      }

      public fun resourceTypesScope(resourceTypesScope: List<String>) {
      }

      public fun runtime(runtime: String) {
      }

      public fun tagKeyScope(tagKeyScope: String) {
      }

      public fun tagValueScope(tagValueScope: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.builder()

      public override fun debugLogDeliveryAccounts(debugLogDeliveryAccounts: List<String>) {
        cdkBuilder.debugLogDeliveryAccounts(debugLogDeliveryAccounts)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
      }

      public override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
      }

      public override
          fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: List<String>) {
        cdkBuilder.organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes)
      }

      public override fun policyText(policyText: String) {
        cdkBuilder.policyText(policyText)
      }

      public override fun resourceIdScope(resourceIdScope: String) {
        cdkBuilder.resourceIdScope(resourceIdScope)
      }

      public override fun resourceTypesScope(resourceTypesScope: List<String>) {
        cdkBuilder.resourceTypesScope(resourceTypesScope)
      }

      public override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      public override fun tagKeyScope(tagKeyScope: String) {
        cdkBuilder.tagKeyScope(tagKeyScope)
      }

      public override fun tagValueScope(tagValueScope: String) {
        cdkBuilder.tagValueScope(tagValueScope)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty,
    ) : OrganizationCustomPolicyRuleMetadataProperty {
      public override fun debugLogDeliveryAccounts(): List<String> =
          unwrap(this).getDebugLogDeliveryAccounts() ?: emptyList()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun inputParameters(): String? = unwrap(this).getInputParameters()

      public override fun maximumExecutionFrequency(): String? =
          unwrap(this).getMaximumExecutionFrequency()

      public override fun organizationConfigRuleTriggerTypes(): List<String> =
          unwrap(this).getOrganizationConfigRuleTriggerTypes() ?: emptyList()

      public override fun policyText(): String = unwrap(this).getPolicyText()

      public override fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

      public override fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope()
          ?: emptyList()

      public override fun runtime(): String = unwrap(this).getRuntime()

      public override fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

      public override fun tagValueScope(): String? = unwrap(this).getTagValueScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrganizationCustomPolicyRuleMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty):
          OrganizationCustomPolicyRuleMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrganizationCustomPolicyRuleMetadataProperty):
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OrganizationManagedRuleMetadataProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun inputParameters(): String? = unwrap(this).getInputParameters()

    public fun maximumExecutionFrequency(): String? = unwrap(this).getMaximumExecutionFrequency()

    public fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

    public fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope() ?:
        emptyList()

    public fun ruleIdentifier(): String

    public fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

    public fun tagValueScope(): String? = unwrap(this).getTagValueScope()

    public interface Builder {
      public fun description(description: String) {
      }

      public fun inputParameters(inputParameters: String) {
      }

      public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
      }

      public fun resourceIdScope(resourceIdScope: String) {
      }

      public fun resourceTypesScope(resourceTypesScope: List<String>) {
      }

      public fun ruleIdentifier(ruleIdentifier: String) {
      }

      public fun tagKeyScope(tagKeyScope: String) {
      }

      public fun tagValueScope(tagValueScope: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
      }

      public override fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
      }

      public override fun resourceIdScope(resourceIdScope: String) {
        cdkBuilder.resourceIdScope(resourceIdScope)
      }

      public override fun resourceTypesScope(resourceTypesScope: List<String>) {
        cdkBuilder.resourceTypesScope(resourceTypesScope)
      }

      public override fun ruleIdentifier(ruleIdentifier: String) {
        cdkBuilder.ruleIdentifier(ruleIdentifier)
      }

      public override fun tagKeyScope(tagKeyScope: String) {
        cdkBuilder.tagKeyScope(tagKeyScope)
      }

      public override fun tagValueScope(tagValueScope: String) {
        cdkBuilder.tagValueScope(tagValueScope)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty,
    ) : OrganizationManagedRuleMetadataProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun inputParameters(): String? = unwrap(this).getInputParameters()

      public override fun maximumExecutionFrequency(): String? =
          unwrap(this).getMaximumExecutionFrequency()

      public override fun resourceIdScope(): String? = unwrap(this).getResourceIdScope()

      public override fun resourceTypesScope(): List<String> = unwrap(this).getResourceTypesScope()
          ?: emptyList()

      public override fun ruleIdentifier(): String = unwrap(this).getRuleIdentifier()

      public override fun tagKeyScope(): String? = unwrap(this).getTagKeyScope()

      public override fun tagValueScope(): String? = unwrap(this).getTagValueScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrganizationManagedRuleMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty):
          OrganizationManagedRuleMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrganizationManagedRuleMetadataProperty):
          software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
