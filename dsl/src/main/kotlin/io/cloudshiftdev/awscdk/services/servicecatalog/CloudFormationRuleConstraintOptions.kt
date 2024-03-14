package io.cloudshiftdev.awscdk.services.servicecatalog

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CloudFormationRuleConstraintOptions : CommonConstraintOptions {
  public fun rule(): TemplateRule

  public interface Builder {
    public fun description(description: String) {
    }

    public fun messageLanguage(messageLanguage: MessageLanguage) {
    }

    public fun rule(rule: TemplateRule) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2170bf105cbbf6434c1e9c84526c0db8d9313aad9b6f2c08933e2834491b50a")
    public fun rule(rule: TemplateRule.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions.builder()

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    public override fun rule(rule: TemplateRule) {
      cdkBuilder.rule(rule.let(TemplateRule::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2170bf105cbbf6434c1e9c84526c0db8d9313aad9b6f2c08933e2834491b50a")
    public override fun rule(rule: TemplateRule.Builder.() -> Unit): Unit = rule(TemplateRule(rule))

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions,
  ) : CloudFormationRuleConstraintOptions {
    public override fun description(): String? = unwrap(this).getDescription()

    public override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    public override fun rule(): TemplateRule = unwrap(this).getRule().let(TemplateRule::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationRuleConstraintOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions):
        CloudFormationRuleConstraintOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationRuleConstraintOptions):
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions =
        (wrapped as Wrapper).cdkObject
  }
}
