package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CloudFormationRuleConstraintOptions : CommonConstraintOptions {
  /**
   * The rule with condition and assertions to apply to template.
   */
  public fun rule(): TemplateRule

  /**
   * A builder for [CloudFormationRuleConstraintOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the constraint.
     */
    public fun description(description: String)

    /**
     * @param messageLanguage The language code.
     * Configures the language for error messages from service catalog.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)

    /**
     * @param rule The rule with condition and assertions to apply to template. 
     */
    public fun rule(rule: TemplateRule)

    /**
     * @param rule The rule with condition and assertions to apply to template. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2170bf105cbbf6434c1e9c84526c0db8d9313aad9b6f2c08933e2834491b50a")
    public fun rule(rule: TemplateRule.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions.builder()

    /**
     * @param description The description of the constraint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param messageLanguage The language code.
     * Configures the language for error messages from service catalog.
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    /**
     * @param rule The rule with condition and assertions to apply to template. 
     */
    override fun rule(rule: TemplateRule) {
      cdkBuilder.rule(rule.let(TemplateRule::unwrap))
    }

    /**
     * @param rule The rule with condition and assertions to apply to template. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2170bf105cbbf6434c1e9c84526c0db8d9313aad9b6f2c08933e2834491b50a")
    override fun rule(rule: TemplateRule.Builder.() -> Unit): Unit = rule(TemplateRule(rule))

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions,
  ) : CdkObject(cdkObject), CloudFormationRuleConstraintOptions {
    /**
     * The description of the constraint.
     *
     * Default: - No description provided
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The language code.
     *
     * Configures the language for error messages from service catalog.
     *
     * Default: - English
     */
    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    /**
     * The rule with condition and assertions to apply to template.
     */
    override fun rule(): TemplateRule = unwrap(this).getRule().let(TemplateRule::wrap)
  }

  public companion object {
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
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions
  }
}
