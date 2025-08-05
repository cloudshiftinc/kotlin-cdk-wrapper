@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a V2 automation rule.
 *
 * This API is in private preview and subject to change.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnAutomationRuleV2 cfnAutomationRuleV2 = CfnAutomationRuleV2.Builder.create(this,
 * "MyCfnAutomationRuleV2")
 * .actions(List.of(AutomationRulesActionV2Property.builder()
 * .type("type")
 * // the properties below are optional
 * .externalIntegrationConfiguration(ExternalIntegrationConfigurationProperty.builder()
 * .connectorArn("connectorArn")
 * .build())
 * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateV2Property.builder()
 * .comment("comment")
 * .severityId(123)
 * .statusId(123)
 * .build())
 * .build()))
 * .criteria(CriteriaProperty.builder()
 * .ocsfFindingCriteria(OcsfFindingFiltersProperty.builder()
 * .compositeFilters(List.of(CompositeFilterProperty.builder()
 * .booleanFilters(List.of(OcsfBooleanFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(BooleanFilterProperty.builder()
 * .value(false)
 * .build())
 * .build()))
 * .dateFilters(List.of(OcsfDateFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build())
 * .build()))
 * .mapFilters(List.of(OcsfMapFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(MapFilterProperty.builder()
 * .comparison("comparison")
 * .key("key")
 * .value("value")
 * .build())
 * .build()))
 * .numberFilters(List.of(OcsfNumberFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(NumberFilterProperty.builder()
 * .eq(123)
 * .gte(123)
 * .lte(123)
 * .build())
 * .build()))
 * .operator("operator")
 * .stringFilters(List.of(OcsfStringFilterProperty.builder()
 * .fieldName("fieldName")
 * .filter(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .build()))
 * .build()))
 * .compositeOperator("compositeOperator")
 * .build())
 * .build())
 * .description("description")
 * .ruleName("ruleName")
 * .ruleOrder(123)
 * // the properties below are optional
 * .ruleStatus("ruleStatus")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html)
 */
public open class CfnAutomationRuleV2(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAutomationRuleV2Props,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAutomationRuleV2Props.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAutomationRuleV2Props.Builder.() -> Unit,
  ) : this(scope, id, CfnAutomationRuleV2Props(props)
  )

  /**
   * A list of actions to be performed when the rule criteria is met.
   */
  public open fun actions(): Any = unwrap(this).getActions()

  /**
   * A list of actions to be performed when the rule criteria is met.
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of actions to be performed when the rule criteria is met.
   */
  public open fun actions(`value`: List<Any>) {
    unwrap(this).setActions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of actions to be performed when the rule criteria is met.
   */
  public open fun actions(vararg `value`: Any): Unit = actions(`value`.toList())

  /**
   * The timestamp when the V2 automation rule was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ARN of the V2 automation rule.
   */
  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

  /**
   * The ID of the V2 automation rule.
   */
  public open fun attrRuleId(): String = unwrap(this).getAttrRuleId()

  /**
   * The timestamp when the V2 automation rule was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The filtering type and configuration of the automation rule.
   */
  public open fun criteria(): Any = unwrap(this).getCriteria()

  /**
   * The filtering type and configuration of the automation rule.
   */
  public open fun criteria(`value`: IResolvable) {
    unwrap(this).setCriteria(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The filtering type and configuration of the automation rule.
   */
  public open fun criteria(`value`: CriteriaProperty) {
    unwrap(this).setCriteria(`value`.let(CriteriaProperty.Companion::unwrap))
  }

  /**
   * The filtering type and configuration of the automation rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("73e30afafea2c3f0e7d5f0c96dd3bba5b97d1be77f9324a9e702230c79a1afe0")
  public open fun criteria(`value`: CriteriaProperty.Builder.() -> Unit): Unit =
      criteria(CriteriaProperty(`value`))

  /**
   * A description of the V2 automation rule.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description of the V2 automation rule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the V2 automation rule.
   */
  public open fun ruleName(): String = unwrap(this).getRuleName()

  /**
   * The name of the V2 automation rule.
   */
  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  /**
   * The value for the rule priority.
   */
  public open fun ruleOrder(): Number = unwrap(this).getRuleOrder()

  /**
   * The value for the rule priority.
   */
  public open fun ruleOrder(`value`: Number) {
    unwrap(this).setRuleOrder(`value`)
  }

  /**
   * The status of the V2 automation rule.
   */
  public open fun ruleStatus(): String? = unwrap(this).getRuleStatus()

  /**
   * The status of the V2 automation rule.
   */
  public open fun ruleStatus(`value`: String) {
    unwrap(this).setRuleStatus(`value`)
  }

  /**
   * A list of key-value pairs associated with the V2 automation rule.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A list of key-value pairs associated with the V2 automation rule.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnAutomationRuleV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of actions to be performed when the rule criteria is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-actions)
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    public fun actions(actions: IResolvable)

    /**
     * A list of actions to be performed when the rule criteria is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-actions)
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    public fun actions(actions: List<Any>)

    /**
     * A list of actions to be performed when the rule criteria is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-actions)
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    public fun actions(vararg actions: Any)

    /**
     * The filtering type and configuration of the automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-criteria)
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    public fun criteria(criteria: IResolvable)

    /**
     * The filtering type and configuration of the automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-criteria)
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    public fun criteria(criteria: CriteriaProperty)

    /**
     * The filtering type and configuration of the automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-criteria)
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f4eaf073924cd6b6c52b0ba00ddf5867ce490fd9ba43ee5163b1f1ce5cb8514")
    public fun criteria(criteria: CriteriaProperty.Builder.() -> Unit)

    /**
     * A description of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-description)
     * @param description A description of the V2 automation rule. 
     */
    public fun description(description: String)

    /**
     * The name of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-rulename)
     * @param ruleName The name of the V2 automation rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * The value for the rule priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-ruleorder)
     * @param ruleOrder The value for the rule priority. 
     */
    public fun ruleOrder(ruleOrder: Number)

    /**
     * The status of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-rulestatus)
     * @param ruleStatus The status of the V2 automation rule. 
     */
    public fun ruleStatus(ruleStatus: String)

    /**
     * A list of key-value pairs associated with the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-tags)
     * @param tags A list of key-value pairs associated with the V2 automation rule. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.Builder
        = software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.Builder.create(scope, id)

    /**
     * A list of actions to be performed when the rule criteria is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-actions)
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of actions to be performed when the rule criteria is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-actions)
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of actions to be performed when the rule criteria is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-actions)
     * @param actions A list of actions to be performed when the rule criteria is met. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * The filtering type and configuration of the automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-criteria)
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * The filtering type and configuration of the automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-criteria)
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    override fun criteria(criteria: CriteriaProperty) {
      cdkBuilder.criteria(criteria.let(CriteriaProperty.Companion::unwrap))
    }

    /**
     * The filtering type and configuration of the automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-criteria)
     * @param criteria The filtering type and configuration of the automation rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f4eaf073924cd6b6c52b0ba00ddf5867ce490fd9ba43ee5163b1f1ce5cb8514")
    override fun criteria(criteria: CriteriaProperty.Builder.() -> Unit): Unit =
        criteria(CriteriaProperty(criteria))

    /**
     * A description of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-description)
     * @param description A description of the V2 automation rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-rulename)
     * @param ruleName The name of the V2 automation rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * The value for the rule priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-ruleorder)
     * @param ruleOrder The value for the rule priority. 
     */
    override fun ruleOrder(ruleOrder: Number) {
      cdkBuilder.ruleOrder(ruleOrder)
    }

    /**
     * The status of the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-rulestatus)
     * @param ruleStatus The status of the V2 automation rule. 
     */
    override fun ruleStatus(ruleStatus: String) {
      cdkBuilder.ruleStatus(ruleStatus)
    }

    /**
     * A list of key-value pairs associated with the V2 automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrulev2.html#cfn-securityhub-automationrulev2-tags)
     * @param tags A list of key-value pairs associated with the V2 automation rule. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAutomationRuleV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAutomationRuleV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2):
        CfnAutomationRuleV2 = CfnAutomationRuleV2(cdkObject)

    internal fun unwrap(wrapped: CfnAutomationRuleV2):
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2 = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2
  }

  /**
   * Allows you to configure automated responses.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * AutomationRulesActionV2Property automationRulesActionV2Property =
   * AutomationRulesActionV2Property.builder()
   * .type("type")
   * // the properties below are optional
   * .externalIntegrationConfiguration(ExternalIntegrationConfigurationProperty.builder()
   * .connectorArn("connectorArn")
   * .build())
   * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateV2Property.builder()
   * .comment("comment")
   * .severityId(123)
   * .statusId(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesactionv2.html)
   */
  public interface AutomationRulesActionV2Property {
    /**
     * The settings for integrating automation rule actions with external systems or service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesactionv2.html#cfn-securityhub-automationrulev2-automationrulesactionv2-externalintegrationconfiguration)
     */
    public fun externalIntegrationConfiguration(): Any? =
        unwrap(this).getExternalIntegrationConfiguration()

    /**
     * Specifies that the automation rule action is an update to a finding field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesactionv2.html#cfn-securityhub-automationrulev2-automationrulesactionv2-findingfieldsupdate)
     */
    public fun findingFieldsUpdate(): Any? = unwrap(this).getFindingFieldsUpdate()

    /**
     * Specifies the type of action that Security Hub takes when a finding matches the defined
     * criteria of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesactionv2.html#cfn-securityhub-automationrulev2-automationrulesactionv2-type)
     */
    public fun type(): String

    /**
     * A builder for [AutomationRulesActionV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param externalIntegrationConfiguration The settings for integrating automation rule
       * actions with external systems or service.
       */
      public fun externalIntegrationConfiguration(externalIntegrationConfiguration: IResolvable)

      /**
       * @param externalIntegrationConfiguration The settings for integrating automation rule
       * actions with external systems or service.
       */
      public
          fun externalIntegrationConfiguration(externalIntegrationConfiguration: ExternalIntegrationConfigurationProperty)

      /**
       * @param externalIntegrationConfiguration The settings for integrating automation rule
       * actions with external systems or service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad5010372ebf148e045cdb286304de05e29bbd657aa93727a0693c382834f5f1")
      public
          fun externalIntegrationConfiguration(externalIntegrationConfiguration: ExternalIntegrationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field.
       */
      public fun findingFieldsUpdate(findingFieldsUpdate: IResolvable)

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field.
       */
      public
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateV2Property)

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c58e22e63203f76ae4758b428bba6d022bedc86ab41cb1798db60acab91567")
      public
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateV2Property.Builder.() -> Unit)

      /**
       * @param type Specifies the type of action that Security Hub takes when a finding matches the
       * defined criteria of a rule. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesActionV2Property.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesActionV2Property.builder()

      /**
       * @param externalIntegrationConfiguration The settings for integrating automation rule
       * actions with external systems or service.
       */
      override fun externalIntegrationConfiguration(externalIntegrationConfiguration: IResolvable) {
        cdkBuilder.externalIntegrationConfiguration(externalIntegrationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param externalIntegrationConfiguration The settings for integrating automation rule
       * actions with external systems or service.
       */
      override
          fun externalIntegrationConfiguration(externalIntegrationConfiguration: ExternalIntegrationConfigurationProperty) {
        cdkBuilder.externalIntegrationConfiguration(externalIntegrationConfiguration.let(ExternalIntegrationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param externalIntegrationConfiguration The settings for integrating automation rule
       * actions with external systems or service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad5010372ebf148e045cdb286304de05e29bbd657aa93727a0693c382834f5f1")
      override
          fun externalIntegrationConfiguration(externalIntegrationConfiguration: ExternalIntegrationConfigurationProperty.Builder.() -> Unit):
          Unit =
          externalIntegrationConfiguration(ExternalIntegrationConfigurationProperty(externalIntegrationConfiguration))

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field.
       */
      override fun findingFieldsUpdate(findingFieldsUpdate: IResolvable) {
        cdkBuilder.findingFieldsUpdate(findingFieldsUpdate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field.
       */
      override
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateV2Property) {
        cdkBuilder.findingFieldsUpdate(findingFieldsUpdate.let(AutomationRulesFindingFieldsUpdateV2Property.Companion::unwrap))
      }

      /**
       * @param findingFieldsUpdate Specifies that the automation rule action is an update to a
       * finding field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c58e22e63203f76ae4758b428bba6d022bedc86ab41cb1798db60acab91567")
      override
          fun findingFieldsUpdate(findingFieldsUpdate: AutomationRulesFindingFieldsUpdateV2Property.Builder.() -> Unit):
          Unit =
          findingFieldsUpdate(AutomationRulesFindingFieldsUpdateV2Property(findingFieldsUpdate))

      /**
       * @param type Specifies the type of action that Security Hub takes when a finding matches the
       * defined criteria of a rule. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesActionV2Property
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesActionV2Property,
    ) : CdkObject(cdkObject),
        AutomationRulesActionV2Property {
      /**
       * The settings for integrating automation rule actions with external systems or service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesactionv2.html#cfn-securityhub-automationrulev2-automationrulesactionv2-externalintegrationconfiguration)
       */
      override fun externalIntegrationConfiguration(): Any? =
          unwrap(this).getExternalIntegrationConfiguration()

      /**
       * Specifies that the automation rule action is an update to a finding field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesactionv2.html#cfn-securityhub-automationrulev2-automationrulesactionv2-findingfieldsupdate)
       */
      override fun findingFieldsUpdate(): Any? = unwrap(this).getFindingFieldsUpdate()

      /**
       * Specifies the type of action that Security Hub takes when a finding matches the defined
       * criteria of a rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesactionv2.html#cfn-securityhub-automationrulev2-automationrulesactionv2-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutomationRulesActionV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesActionV2Property):
          AutomationRulesActionV2Property = CdkObjectWrappers.wrap(cdkObject) as?
          AutomationRulesActionV2Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomationRulesActionV2Property):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesActionV2Property
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesActionV2Property
    }
  }

  /**
   * Allows you to define the structure for modifying specific fields in security findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * AutomationRulesFindingFieldsUpdateV2Property automationRulesFindingFieldsUpdateV2Property =
   * AutomationRulesFindingFieldsUpdateV2Property.builder()
   * .comment("comment")
   * .severityId(123)
   * .statusId(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2.html)
   */
  public interface AutomationRulesFindingFieldsUpdateV2Property {
    /**
     * Notes or contextual information for findings that are modified by the automation rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2.html#cfn-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The severity level to be assigned to findings that match the automation rule criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2.html#cfn-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2-severityid)
     */
    public fun severityId(): Number? = unwrap(this).getSeverityId()

    /**
     * The status to be applied to findings that match automation rule criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2.html#cfn-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2-statusid)
     */
    public fun statusId(): Number? = unwrap(this).getStatusId()

    /**
     * A builder for [AutomationRulesFindingFieldsUpdateV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment Notes or contextual information for findings that are modified by the
       * automation rule.
       */
      public fun comment(comment: String)

      /**
       * @param severityId The severity level to be assigned to findings that match the automation
       * rule criteria.
       */
      public fun severityId(severityId: Number)

      /**
       * @param statusId The status to be applied to findings that match automation rule criteria.
       */
      public fun statusId(statusId: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesFindingFieldsUpdateV2Property.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesFindingFieldsUpdateV2Property.builder()

      /**
       * @param comment Notes or contextual information for findings that are modified by the
       * automation rule.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param severityId The severity level to be assigned to findings that match the automation
       * rule criteria.
       */
      override fun severityId(severityId: Number) {
        cdkBuilder.severityId(severityId)
      }

      /**
       * @param statusId The status to be applied to findings that match automation rule criteria.
       */
      override fun statusId(statusId: Number) {
        cdkBuilder.statusId(statusId)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesFindingFieldsUpdateV2Property
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesFindingFieldsUpdateV2Property,
    ) : CdkObject(cdkObject),
        AutomationRulesFindingFieldsUpdateV2Property {
      /**
       * Notes or contextual information for findings that are modified by the automation rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2.html#cfn-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The severity level to be assigned to findings that match the automation rule criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2.html#cfn-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2-severityid)
       */
      override fun severityId(): Number? = unwrap(this).getSeverityId()

      /**
       * The status to be applied to findings that match automation rule criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2.html#cfn-securityhub-automationrulev2-automationrulesfindingfieldsupdatev2-statusid)
       */
      override fun statusId(): Number? = unwrap(this).getStatusId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutomationRulesFindingFieldsUpdateV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesFindingFieldsUpdateV2Property):
          AutomationRulesFindingFieldsUpdateV2Property = CdkObjectWrappers.wrap(cdkObject) as?
          AutomationRulesFindingFieldsUpdateV2Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomationRulesFindingFieldsUpdateV2Property):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesFindingFieldsUpdateV2Property
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.AutomationRulesFindingFieldsUpdateV2Property
    }
  }

  /**
   * Boolean filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * BooleanFilterProperty booleanFilterProperty = BooleanFilterProperty.builder()
   * .value(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-booleanfilter.html)
   */
  public interface BooleanFilterProperty {
    /**
     * The value of the boolean.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-booleanfilter.html#cfn-securityhub-automationrulev2-booleanfilter-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [BooleanFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The value of the boolean. 
       */
      public fun `value`(`value`: Boolean)

      /**
       * @param value The value of the boolean. 
       */
      public fun `value`(`value`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.BooleanFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.BooleanFilterProperty.builder()

      /**
       * @param value The value of the boolean. 
       */
      override fun `value`(`value`: Boolean) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param value The value of the boolean. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.BooleanFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.BooleanFilterProperty,
    ) : CdkObject(cdkObject),
        BooleanFilterProperty {
      /**
       * The value of the boolean.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-booleanfilter.html#cfn-securityhub-automationrulev2-booleanfilter-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BooleanFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.BooleanFilterProperty):
          BooleanFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? BooleanFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BooleanFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.BooleanFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.BooleanFilterProperty
    }
  }

  /**
   * Enables the creation of filtering criteria for security findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * CompositeFilterProperty compositeFilterProperty = CompositeFilterProperty.builder()
   * .booleanFilters(List.of(OcsfBooleanFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(BooleanFilterProperty.builder()
   * .value(false)
   * .build())
   * .build()))
   * .dateFilters(List.of(OcsfDateFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build())
   * .build()))
   * .mapFilters(List.of(OcsfMapFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build())
   * .build()))
   * .numberFilters(List.of(OcsfNumberFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build())
   * .build()))
   * .operator("operator")
   * .stringFilters(List.of(OcsfStringFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html)
   */
  public interface CompositeFilterProperty {
    /**
     * Enables filtering based on boolean field values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-booleanfilters)
     */
    public fun booleanFilters(): Any? = unwrap(this).getBooleanFilters()

    /**
     * Enables filtering based on date and timestamp fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-datefilters)
     */
    public fun dateFilters(): Any? = unwrap(this).getDateFilters()

    /**
     * Enables the creation of filtering criteria for security findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-mapfilters)
     */
    public fun mapFilters(): Any? = unwrap(this).getMapFilters()

    /**
     * Enables filtering based on numerical field values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-numberfilters)
     */
    public fun numberFilters(): Any? = unwrap(this).getNumberFilters()

    /**
     * The logical operator used to combine multiple filter conditions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-operator)
     */
    public fun `operator`(): String? = unwrap(this).getOperator()

    /**
     * Enables filtering based on string field values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-stringfilters)
     */
    public fun stringFilters(): Any? = unwrap(this).getStringFilters()

    /**
     * A builder for [CompositeFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanFilters Enables filtering based on boolean field values.
       */
      public fun booleanFilters(booleanFilters: IResolvable)

      /**
       * @param booleanFilters Enables filtering based on boolean field values.
       */
      public fun booleanFilters(booleanFilters: List<Any>)

      /**
       * @param booleanFilters Enables filtering based on boolean field values.
       */
      public fun booleanFilters(vararg booleanFilters: Any)

      /**
       * @param dateFilters Enables filtering based on date and timestamp fields.
       */
      public fun dateFilters(dateFilters: IResolvable)

      /**
       * @param dateFilters Enables filtering based on date and timestamp fields.
       */
      public fun dateFilters(dateFilters: List<Any>)

      /**
       * @param dateFilters Enables filtering based on date and timestamp fields.
       */
      public fun dateFilters(vararg dateFilters: Any)

      /**
       * @param mapFilters Enables the creation of filtering criteria for security findings.
       */
      public fun mapFilters(mapFilters: IResolvable)

      /**
       * @param mapFilters Enables the creation of filtering criteria for security findings.
       */
      public fun mapFilters(mapFilters: List<Any>)

      /**
       * @param mapFilters Enables the creation of filtering criteria for security findings.
       */
      public fun mapFilters(vararg mapFilters: Any)

      /**
       * @param numberFilters Enables filtering based on numerical field values.
       */
      public fun numberFilters(numberFilters: IResolvable)

      /**
       * @param numberFilters Enables filtering based on numerical field values.
       */
      public fun numberFilters(numberFilters: List<Any>)

      /**
       * @param numberFilters Enables filtering based on numerical field values.
       */
      public fun numberFilters(vararg numberFilters: Any)

      /**
       * @param operator The logical operator used to combine multiple filter conditions.
       */
      public fun `operator`(`operator`: String)

      /**
       * @param stringFilters Enables filtering based on string field values.
       */
      public fun stringFilters(stringFilters: IResolvable)

      /**
       * @param stringFilters Enables filtering based on string field values.
       */
      public fun stringFilters(stringFilters: List<Any>)

      /**
       * @param stringFilters Enables filtering based on string field values.
       */
      public fun stringFilters(vararg stringFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CompositeFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CompositeFilterProperty.builder()

      /**
       * @param booleanFilters Enables filtering based on boolean field values.
       */
      override fun booleanFilters(booleanFilters: IResolvable) {
        cdkBuilder.booleanFilters(booleanFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param booleanFilters Enables filtering based on boolean field values.
       */
      override fun booleanFilters(booleanFilters: List<Any>) {
        cdkBuilder.booleanFilters(booleanFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param booleanFilters Enables filtering based on boolean field values.
       */
      override fun booleanFilters(vararg booleanFilters: Any): Unit =
          booleanFilters(booleanFilters.toList())

      /**
       * @param dateFilters Enables filtering based on date and timestamp fields.
       */
      override fun dateFilters(dateFilters: IResolvable) {
        cdkBuilder.dateFilters(dateFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dateFilters Enables filtering based on date and timestamp fields.
       */
      override fun dateFilters(dateFilters: List<Any>) {
        cdkBuilder.dateFilters(dateFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dateFilters Enables filtering based on date and timestamp fields.
       */
      override fun dateFilters(vararg dateFilters: Any): Unit = dateFilters(dateFilters.toList())

      /**
       * @param mapFilters Enables the creation of filtering criteria for security findings.
       */
      override fun mapFilters(mapFilters: IResolvable) {
        cdkBuilder.mapFilters(mapFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mapFilters Enables the creation of filtering criteria for security findings.
       */
      override fun mapFilters(mapFilters: List<Any>) {
        cdkBuilder.mapFilters(mapFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param mapFilters Enables the creation of filtering criteria for security findings.
       */
      override fun mapFilters(vararg mapFilters: Any): Unit = mapFilters(mapFilters.toList())

      /**
       * @param numberFilters Enables filtering based on numerical field values.
       */
      override fun numberFilters(numberFilters: IResolvable) {
        cdkBuilder.numberFilters(numberFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param numberFilters Enables filtering based on numerical field values.
       */
      override fun numberFilters(numberFilters: List<Any>) {
        cdkBuilder.numberFilters(numberFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param numberFilters Enables filtering based on numerical field values.
       */
      override fun numberFilters(vararg numberFilters: Any): Unit =
          numberFilters(numberFilters.toList())

      /**
       * @param operator The logical operator used to combine multiple filter conditions.
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param stringFilters Enables filtering based on string field values.
       */
      override fun stringFilters(stringFilters: IResolvable) {
        cdkBuilder.stringFilters(stringFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stringFilters Enables filtering based on string field values.
       */
      override fun stringFilters(stringFilters: List<Any>) {
        cdkBuilder.stringFilters(stringFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param stringFilters Enables filtering based on string field values.
       */
      override fun stringFilters(vararg stringFilters: Any): Unit =
          stringFilters(stringFilters.toList())

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CompositeFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CompositeFilterProperty,
    ) : CdkObject(cdkObject),
        CompositeFilterProperty {
      /**
       * Enables filtering based on boolean field values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-booleanfilters)
       */
      override fun booleanFilters(): Any? = unwrap(this).getBooleanFilters()

      /**
       * Enables filtering based on date and timestamp fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-datefilters)
       */
      override fun dateFilters(): Any? = unwrap(this).getDateFilters()

      /**
       * Enables the creation of filtering criteria for security findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-mapfilters)
       */
      override fun mapFilters(): Any? = unwrap(this).getMapFilters()

      /**
       * Enables filtering based on numerical field values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-numberfilters)
       */
      override fun numberFilters(): Any? = unwrap(this).getNumberFilters()

      /**
       * The logical operator used to combine multiple filter conditions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-operator)
       */
      override fun `operator`(): String? = unwrap(this).getOperator()

      /**
       * Enables filtering based on string field values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-compositefilter.html#cfn-securityhub-automationrulev2-compositefilter-stringfilters)
       */
      override fun stringFilters(): Any? = unwrap(this).getStringFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CompositeFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CompositeFilterProperty):
          CompositeFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? CompositeFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompositeFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CompositeFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CompositeFilterProperty
    }
  }

  /**
   * The filtering type and configuration of the automation rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * CriteriaProperty criteriaProperty = CriteriaProperty.builder()
   * .ocsfFindingCriteria(OcsfFindingFiltersProperty.builder()
   * .compositeFilters(List.of(CompositeFilterProperty.builder()
   * .booleanFilters(List.of(OcsfBooleanFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(BooleanFilterProperty.builder()
   * .value(false)
   * .build())
   * .build()))
   * .dateFilters(List.of(OcsfDateFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build())
   * .build()))
   * .mapFilters(List.of(OcsfMapFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build())
   * .build()))
   * .numberFilters(List.of(OcsfNumberFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build())
   * .build()))
   * .operator("operator")
   * .stringFilters(List.of(OcsfStringFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .build()))
   * .build()))
   * .compositeOperator("compositeOperator")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-criteria.html)
   */
  public interface CriteriaProperty {
    /**
     * The filtering conditions that align with OCSF standards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-criteria.html#cfn-securityhub-automationrulev2-criteria-ocsffindingcriteria)
     */
    public fun ocsfFindingCriteria(): Any? = unwrap(this).getOcsfFindingCriteria()

    /**
     * A builder for [CriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ocsfFindingCriteria The filtering conditions that align with OCSF standards.
       */
      public fun ocsfFindingCriteria(ocsfFindingCriteria: IResolvable)

      /**
       * @param ocsfFindingCriteria The filtering conditions that align with OCSF standards.
       */
      public fun ocsfFindingCriteria(ocsfFindingCriteria: OcsfFindingFiltersProperty)

      /**
       * @param ocsfFindingCriteria The filtering conditions that align with OCSF standards.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d959ba1a14da3c13d816a564d97b1e8df0b1cd0d928550adce6778d87737ed7b")
      public
          fun ocsfFindingCriteria(ocsfFindingCriteria: OcsfFindingFiltersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CriteriaProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CriteriaProperty.builder()

      /**
       * @param ocsfFindingCriteria The filtering conditions that align with OCSF standards.
       */
      override fun ocsfFindingCriteria(ocsfFindingCriteria: IResolvable) {
        cdkBuilder.ocsfFindingCriteria(ocsfFindingCriteria.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ocsfFindingCriteria The filtering conditions that align with OCSF standards.
       */
      override fun ocsfFindingCriteria(ocsfFindingCriteria: OcsfFindingFiltersProperty) {
        cdkBuilder.ocsfFindingCriteria(ocsfFindingCriteria.let(OcsfFindingFiltersProperty.Companion::unwrap))
      }

      /**
       * @param ocsfFindingCriteria The filtering conditions that align with OCSF standards.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d959ba1a14da3c13d816a564d97b1e8df0b1cd0d928550adce6778d87737ed7b")
      override
          fun ocsfFindingCriteria(ocsfFindingCriteria: OcsfFindingFiltersProperty.Builder.() -> Unit):
          Unit = ocsfFindingCriteria(OcsfFindingFiltersProperty(ocsfFindingCriteria))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CriteriaProperty,
    ) : CdkObject(cdkObject),
        CriteriaProperty {
      /**
       * The filtering conditions that align with OCSF standards.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-criteria.html#cfn-securityhub-automationrulev2-criteria-ocsffindingcriteria)
       */
      override fun ocsfFindingCriteria(): Any? = unwrap(this).getOcsfFindingCriteria()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CriteriaProperty):
          CriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as? CriteriaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CriteriaProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.CriteriaProperty
    }
  }

  /**
   * A date filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * DateFilterProperty dateFilterProperty = DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-datefilter.html)
   */
  public interface DateFilterProperty {
    /**
     * A date range for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-datefilter.html#cfn-securityhub-automationrulev2-datefilter-daterange)
     */
    public fun dateRange(): Any? = unwrap(this).getDateRange()

    /**
     * A timestamp that provides the end date for the date filter.
     *
     * For more information about the validation and formatting of timestamp fields in AWS Security
     * Hub , see
     * [Timestamps](https://docs.aws.amazon.com/securityhub/1.0/APIReference/Welcome.html#timestamps) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-datefilter.html#cfn-securityhub-automationrulev2-datefilter-end)
     */
    public fun end(): String? = unwrap(this).getEnd()

    /**
     * A timestamp that provides the start date for the date filter.
     *
     * For more information about the validation and formatting of timestamp fields in AWS Security
     * Hub , see
     * [Timestamps](https://docs.aws.amazon.com/securityhub/1.0/APIReference/Welcome.html#timestamps) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-datefilter.html#cfn-securityhub-automationrulev2-datefilter-start)
     */
    public fun start(): String? = unwrap(this).getStart()

    /**
     * A builder for [DateFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateRange A date range for the date filter.
       */
      public fun dateRange(dateRange: IResolvable)

      /**
       * @param dateRange A date range for the date filter.
       */
      public fun dateRange(dateRange: DateRangeProperty)

      /**
       * @param dateRange A date range for the date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7d7c1584686792460cda299442795c034cdb18dcb836766462805d1f1fbf036")
      public fun dateRange(dateRange: DateRangeProperty.Builder.() -> Unit)

      /**
       * @param end A timestamp that provides the end date for the date filter.
       * For more information about the validation and formatting of timestamp fields in AWS
       * Security Hub , see
       * [Timestamps](https://docs.aws.amazon.com/securityhub/1.0/APIReference/Welcome.html#timestamps)
       * .
       */
      public fun end(end: String)

      /**
       * @param start A timestamp that provides the start date for the date filter.
       * For more information about the validation and formatting of timestamp fields in AWS
       * Security Hub , see
       * [Timestamps](https://docs.aws.amazon.com/securityhub/1.0/APIReference/Welcome.html#timestamps)
       * .
       */
      public fun start(start: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateFilterProperty.builder()

      /**
       * @param dateRange A date range for the date filter.
       */
      override fun dateRange(dateRange: IResolvable) {
        cdkBuilder.dateRange(dateRange.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dateRange A date range for the date filter.
       */
      override fun dateRange(dateRange: DateRangeProperty) {
        cdkBuilder.dateRange(dateRange.let(DateRangeProperty.Companion::unwrap))
      }

      /**
       * @param dateRange A date range for the date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7d7c1584686792460cda299442795c034cdb18dcb836766462805d1f1fbf036")
      override fun dateRange(dateRange: DateRangeProperty.Builder.() -> Unit): Unit =
          dateRange(DateRangeProperty(dateRange))

      /**
       * @param end A timestamp that provides the end date for the date filter.
       * For more information about the validation and formatting of timestamp fields in AWS
       * Security Hub , see
       * [Timestamps](https://docs.aws.amazon.com/securityhub/1.0/APIReference/Welcome.html#timestamps)
       * .
       */
      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      /**
       * @param start A timestamp that provides the start date for the date filter.
       * For more information about the validation and formatting of timestamp fields in AWS
       * Security Hub , see
       * [Timestamps](https://docs.aws.amazon.com/securityhub/1.0/APIReference/Welcome.html#timestamps)
       * .
       */
      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateFilterProperty,
    ) : CdkObject(cdkObject),
        DateFilterProperty {
      /**
       * A date range for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-datefilter.html#cfn-securityhub-automationrulev2-datefilter-daterange)
       */
      override fun dateRange(): Any? = unwrap(this).getDateRange()

      /**
       * A timestamp that provides the end date for the date filter.
       *
       * For more information about the validation and formatting of timestamp fields in AWS
       * Security Hub , see
       * [Timestamps](https://docs.aws.amazon.com/securityhub/1.0/APIReference/Welcome.html#timestamps)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-datefilter.html#cfn-securityhub-automationrulev2-datefilter-end)
       */
      override fun end(): String? = unwrap(this).getEnd()

      /**
       * A timestamp that provides the start date for the date filter.
       *
       * For more information about the validation and formatting of timestamp fields in AWS
       * Security Hub , see
       * [Timestamps](https://docs.aws.amazon.com/securityhub/1.0/APIReference/Welcome.html#timestamps)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-datefilter.html#cfn-securityhub-automationrulev2-datefilter-start)
       */
      override fun start(): String? = unwrap(this).getStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateFilterProperty):
          DateFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? DateFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateFilterProperty
    }
  }

  /**
   * A date range for the date filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * DateRangeProperty dateRangeProperty = DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-daterange.html)
   */
  public interface DateRangeProperty {
    /**
     * A date range unit for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-daterange.html#cfn-securityhub-automationrulev2-daterange-unit)
     */
    public fun unit(): String

    /**
     * A date range value for the date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-daterange.html#cfn-securityhub-automationrulev2-daterange-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [DateRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit A date range unit for the date filter. 
       */
      public fun unit(unit: String)

      /**
       * @param value A date range value for the date filter. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateRangeProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateRangeProperty.builder()

      /**
       * @param unit A date range unit for the date filter. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value A date range value for the date filter. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateRangeProperty,
    ) : CdkObject(cdkObject),
        DateRangeProperty {
      /**
       * A date range unit for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-daterange.html#cfn-securityhub-automationrulev2-daterange-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * A date range value for the date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-daterange.html#cfn-securityhub-automationrulev2-daterange-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateRangeProperty):
          DateRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? DateRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateRangeProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateRangeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.DateRangeProperty
    }
  }

  /**
   * The settings for integrating automation rule actions with external systems or service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * ExternalIntegrationConfigurationProperty externalIntegrationConfigurationProperty =
   * ExternalIntegrationConfigurationProperty.builder()
   * .connectorArn("connectorArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-externalintegrationconfiguration.html)
   */
  public interface ExternalIntegrationConfigurationProperty {
    /**
     * The ARN of the connector that establishes the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-externalintegrationconfiguration.html#cfn-securityhub-automationrulev2-externalintegrationconfiguration-connectorarn)
     */
    public fun connectorArn(): String? = unwrap(this).getConnectorArn()

    /**
     * A builder for [ExternalIntegrationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorArn The ARN of the connector that establishes the integration.
       */
      public fun connectorArn(connectorArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.ExternalIntegrationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.ExternalIntegrationConfigurationProperty.builder()

      /**
       * @param connectorArn The ARN of the connector that establishes the integration.
       */
      override fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.ExternalIntegrationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.ExternalIntegrationConfigurationProperty,
    ) : CdkObject(cdkObject),
        ExternalIntegrationConfigurationProperty {
      /**
       * The ARN of the connector that establishes the integration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-externalintegrationconfiguration.html#cfn-securityhub-automationrulev2-externalintegrationconfiguration-connectorarn)
       */
      override fun connectorArn(): String? = unwrap(this).getConnectorArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExternalIntegrationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.ExternalIntegrationConfigurationProperty):
          ExternalIntegrationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExternalIntegrationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExternalIntegrationConfigurationProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.ExternalIntegrationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.ExternalIntegrationConfigurationProperty
    }
  }

  /**
   * A map filter for filtering AWS Security Hub findings.
   *
   * Each map filter provides the field to check for, the value to check for, and the comparison
   * operator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * MapFilterProperty mapFilterProperty = MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-mapfilter.html)
   */
  public interface MapFilterProperty {
    /**
     * The condition to apply to the key value when filtering Security Hub findings with a map
     * filter.
     *
     * To search for values that have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that include the filter value, use `CONTAINS` . For example, for the
     * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
     * the value `Security` for the `Department` tag. In the same example, a finding with a value of
     * `Security team` for the `Department` tag is a match.
     * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
     * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have the
     * value `Security` for the `Department` tag.
     *
     * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
     * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
     * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
     * both values.
     *
     * To search for values that don't have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
     * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
     * exclude the value `Finance` for the `Department` tag.
     * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
     * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
     * have the value `Finance` for the `Department` tag.
     *
     * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
     * matches only if it matches all of those filters. For example, the filters `Department
     * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
     * the `Security` and `Finance` values.
     *
     * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can
     * only be used with other `NOT_CONTAINS` filters.
     *
     * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
     * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
     * Combining filters in this way returns an error.
     *
     * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
     * information, see [Automation
     * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
     * *AWS Security Hub User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-mapfilter.html#cfn-securityhub-automationrulev2-mapfilter-comparison)
     */
    public fun comparison(): String

    /**
     * The key of the map filter.
     *
     * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
     * `UserDefinedFields` , `Key` is the name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-mapfilter.html#cfn-securityhub-automationrulev2-mapfilter-key)
     */
    public fun key(): String

    /**
     * The value for the key in the map filter.
     *
     * Filter values are case sensitive. For example, one of the values for a tag called
     * `Department` might be `Security` . If you provide `security` as the filter value, then there's
     * no match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-mapfilter.html#cfn-securityhub-automationrulev2-mapfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [MapFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparison The condition to apply to the key value when filtering Security Hub
       * findings with a map filter. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      public fun comparison(comparison: String)

      /**
       * @param key The key of the map filter. 
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       */
      public fun key(key: String)

      /**
       * @param value The value for the key in the map filter. 
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.MapFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.MapFilterProperty.builder()

      /**
       * @param comparison The condition to apply to the key value when filtering Security Hub
       * findings with a map filter. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      /**
       * @param key The key of the map filter. 
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value for the key in the map filter. 
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.MapFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.MapFilterProperty,
    ) : CdkObject(cdkObject),
        MapFilterProperty {
      /**
       * The condition to apply to the key value when filtering Security Hub findings with a map
       * filter.
       *
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, for the
       * `ResourceTags` field, the filter `Department CONTAINS Security` matches findings that include
       * the value `Security` for the `Department` tag. In the same example, a finding with a value of
       * `Security team` for the `Department` tag is a match.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, for
       * the `ResourceTags` field, the filter `Department EQUALS Security` matches findings that have
       * the value `Security` for the `Department` tag.
       *
       * `CONTAINS` and `EQUALS` filters on the same field are joined by `OR` . A finding matches if
       * it matches any one of those filters. For example, the filters `Department CONTAINS Security OR
       * Department CONTAINS Finance` match a finding that includes either `Security` , `Finance` , or
       * both values.
       *
       * To search for values that don't have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, for
       * the `ResourceTags` field, the filter `Department NOT_CONTAINS Finance` matches findings that
       * exclude the value `Finance` for the `Department` tag.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, for the
       * `ResourceTags` field, the filter `Department NOT_EQUALS Finance` matches findings that don’t
       * have the value `Finance` for the `Department` tag.
       *
       * `NOT_CONTAINS` and `NOT_EQUALS` filters on the same field are joined by `AND` . A finding
       * matches only if it matches all of those filters. For example, the filters `Department
       * NOT_CONTAINS Security AND Department NOT_CONTAINS Finance` match a finding that excludes both
       * the `Security` and `Finance` values.
       *
       * `CONTAINS` filters can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters
       * can only be used with other `NOT_CONTAINS` filters.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can’t have both an `EQUALS` filter and a `NOT_EQUALS` filter on the same field.
       * Combining filters in this way returns an error.
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules. For more
       * information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-mapfilter.html#cfn-securityhub-automationrulev2-mapfilter-comparison)
       */
      override fun comparison(): String = unwrap(this).getComparison()

      /**
       * The key of the map filter.
       *
       * For example, for `ResourceTags` , `Key` identifies the name of the tag. For
       * `UserDefinedFields` , `Key` is the name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-mapfilter.html#cfn-securityhub-automationrulev2-mapfilter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value for the key in the map filter.
       *
       * Filter values are case sensitive. For example, one of the values for a tag called
       * `Department` might be `Security` . If you provide `security` as the filter value, then there's
       * no match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-mapfilter.html#cfn-securityhub-automationrulev2-mapfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MapFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.MapFilterProperty):
          MapFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? MapFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MapFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.MapFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.MapFilterProperty
    }
  }

  /**
   * A number filter for querying findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * NumberFilterProperty numberFilterProperty = NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-numberfilter.html)
   */
  public interface NumberFilterProperty {
    /**
     * The equal-to condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-numberfilter.html#cfn-securityhub-automationrulev2-numberfilter-eq)
     */
    public fun eq(): Number? = unwrap(this).getEq()

    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-numberfilter.html#cfn-securityhub-automationrulev2-numberfilter-gte)
     */
    public fun gte(): Number? = unwrap(this).getGte()

    /**
     * The less-than-equal condition to be applied to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-numberfilter.html#cfn-securityhub-automationrulev2-numberfilter-lte)
     */
    public fun lte(): Number? = unwrap(this).getLte()

    /**
     * A builder for [NumberFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eq The equal-to condition to be applied to a single field when querying for
       * findings.
       */
      public fun eq(eq: Number)

      /**
       * @param gte The greater-than-equal condition to be applied to a single field when querying
       * for findings.
       */
      public fun gte(gte: Number)

      /**
       * @param lte The less-than-equal condition to be applied to a single field when querying for
       * findings.
       */
      public fun lte(lte: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.NumberFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.NumberFilterProperty.builder()

      /**
       * @param eq The equal-to condition to be applied to a single field when querying for
       * findings.
       */
      override fun eq(eq: Number) {
        cdkBuilder.eq(eq)
      }

      /**
       * @param gte The greater-than-equal condition to be applied to a single field when querying
       * for findings.
       */
      override fun gte(gte: Number) {
        cdkBuilder.gte(gte)
      }

      /**
       * @param lte The less-than-equal condition to be applied to a single field when querying for
       * findings.
       */
      override fun lte(lte: Number) {
        cdkBuilder.lte(lte)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.NumberFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.NumberFilterProperty,
    ) : CdkObject(cdkObject),
        NumberFilterProperty {
      /**
       * The equal-to condition to be applied to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-numberfilter.html#cfn-securityhub-automationrulev2-numberfilter-eq)
       */
      override fun eq(): Number? = unwrap(this).getEq()

      /**
       * The greater-than-equal condition to be applied to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-numberfilter.html#cfn-securityhub-automationrulev2-numberfilter-gte)
       */
      override fun gte(): Number? = unwrap(this).getGte()

      /**
       * The less-than-equal condition to be applied to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-numberfilter.html#cfn-securityhub-automationrulev2-numberfilter-lte)
       */
      override fun lte(): Number? = unwrap(this).getLte()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NumberFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.NumberFilterProperty):
          NumberFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? NumberFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumberFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.NumberFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.NumberFilterProperty
    }
  }

  /**
   * Enables filtering of security findings based on boolean field values in OCSF.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * OcsfBooleanFilterProperty ocsfBooleanFilterProperty = OcsfBooleanFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(BooleanFilterProperty.builder()
   * .value(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfbooleanfilter.html)
   */
  public interface OcsfBooleanFilterProperty {
    /**
     * The name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfbooleanfilter.html#cfn-securityhub-automationrulev2-ocsfbooleanfilter-fieldname)
     */
    public fun fieldName(): String

    /**
     * Enables filtering of security findings based on boolean field values in OCSF.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfbooleanfilter.html#cfn-securityhub-automationrulev2-ocsfbooleanfilter-filter)
     */
    public fun filter(): Any

    /**
     * A builder for [OcsfBooleanFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName The name of the field. 
       */
      public fun fieldName(fieldName: String)

      /**
       * @param filter Enables filtering of security findings based on boolean field values in OCSF.
       * 
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter Enables filtering of security findings based on boolean field values in OCSF.
       * 
       */
      public fun filter(filter: BooleanFilterProperty)

      /**
       * @param filter Enables filtering of security findings based on boolean field values in OCSF.
       * 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("492e8e849de2bb6f52dd2a46641fbac8148030b55e4adb0082e06047cad34eb0")
      public fun filter(filter: BooleanFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfBooleanFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfBooleanFilterProperty.builder()

      /**
       * @param fieldName The name of the field. 
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param filter Enables filtering of security findings based on boolean field values in OCSF.
       * 
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on boolean field values in OCSF.
       * 
       */
      override fun filter(filter: BooleanFilterProperty) {
        cdkBuilder.filter(filter.let(BooleanFilterProperty.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on boolean field values in OCSF.
       * 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("492e8e849de2bb6f52dd2a46641fbac8148030b55e4adb0082e06047cad34eb0")
      override fun filter(filter: BooleanFilterProperty.Builder.() -> Unit): Unit =
          filter(BooleanFilterProperty(filter))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfBooleanFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfBooleanFilterProperty,
    ) : CdkObject(cdkObject),
        OcsfBooleanFilterProperty {
      /**
       * The name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfbooleanfilter.html#cfn-securityhub-automationrulev2-ocsfbooleanfilter-fieldname)
       */
      override fun fieldName(): String = unwrap(this).getFieldName()

      /**
       * Enables filtering of security findings based on boolean field values in OCSF.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfbooleanfilter.html#cfn-securityhub-automationrulev2-ocsfbooleanfilter-filter)
       */
      override fun filter(): Any = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OcsfBooleanFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfBooleanFilterProperty):
          OcsfBooleanFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OcsfBooleanFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OcsfBooleanFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfBooleanFilterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfBooleanFilterProperty
    }
  }

  /**
   * Enables filtering of security findings based on date and timestamp fields in OCSF.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * OcsfDateFilterProperty ocsfDateFilterProperty = OcsfDateFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfdatefilter.html)
   */
  public interface OcsfDateFilterProperty {
    /**
     * The name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfdatefilter.html#cfn-securityhub-automationrulev2-ocsfdatefilter-fieldname)
     */
    public fun fieldName(): String

    /**
     * Enables filtering of security findings based on date and timestamp fields in OCSF.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfdatefilter.html#cfn-securityhub-automationrulev2-ocsfdatefilter-filter)
     */
    public fun filter(): Any

    /**
     * A builder for [OcsfDateFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName The name of the field. 
       */
      public fun fieldName(fieldName: String)

      /**
       * @param filter Enables filtering of security findings based on date and timestamp fields in
       * OCSF. 
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter Enables filtering of security findings based on date and timestamp fields in
       * OCSF. 
       */
      public fun filter(filter: DateFilterProperty)

      /**
       * @param filter Enables filtering of security findings based on date and timestamp fields in
       * OCSF. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("496fa2dbccbf98732d51677193d0921ea5b4d979cae91f6ae50d819545cc1a31")
      public fun filter(filter: DateFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfDateFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfDateFilterProperty.builder()

      /**
       * @param fieldName The name of the field. 
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param filter Enables filtering of security findings based on date and timestamp fields in
       * OCSF. 
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on date and timestamp fields in
       * OCSF. 
       */
      override fun filter(filter: DateFilterProperty) {
        cdkBuilder.filter(filter.let(DateFilterProperty.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on date and timestamp fields in
       * OCSF. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("496fa2dbccbf98732d51677193d0921ea5b4d979cae91f6ae50d819545cc1a31")
      override fun filter(filter: DateFilterProperty.Builder.() -> Unit): Unit =
          filter(DateFilterProperty(filter))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfDateFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfDateFilterProperty,
    ) : CdkObject(cdkObject),
        OcsfDateFilterProperty {
      /**
       * The name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfdatefilter.html#cfn-securityhub-automationrulev2-ocsfdatefilter-fieldname)
       */
      override fun fieldName(): String = unwrap(this).getFieldName()

      /**
       * Enables filtering of security findings based on date and timestamp fields in OCSF.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfdatefilter.html#cfn-securityhub-automationrulev2-ocsfdatefilter-filter)
       */
      override fun filter(): Any = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OcsfDateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfDateFilterProperty):
          OcsfDateFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? OcsfDateFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OcsfDateFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfDateFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfDateFilterProperty
    }
  }

  /**
   * Specifies the filtering criteria for security findings using OCSF.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * OcsfFindingFiltersProperty ocsfFindingFiltersProperty = OcsfFindingFiltersProperty.builder()
   * .compositeFilters(List.of(CompositeFilterProperty.builder()
   * .booleanFilters(List.of(OcsfBooleanFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(BooleanFilterProperty.builder()
   * .value(false)
   * .build())
   * .build()))
   * .dateFilters(List.of(OcsfDateFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(DateFilterProperty.builder()
   * .dateRange(DateRangeProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .end("end")
   * .start("start")
   * .build())
   * .build()))
   * .mapFilters(List.of(OcsfMapFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build())
   * .build()))
   * .numberFilters(List.of(OcsfNumberFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build())
   * .build()))
   * .operator("operator")
   * .stringFilters(List.of(OcsfStringFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .build()))
   * .build()))
   * .compositeOperator("compositeOperator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsffindingfilters.html)
   */
  public interface OcsfFindingFiltersProperty {
    /**
     * Enables the creation of complex filtering conditions by combining filter criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsffindingfilters.html#cfn-securityhub-automationrulev2-ocsffindingfilters-compositefilters)
     */
    public fun compositeFilters(): Any? = unwrap(this).getCompositeFilters()

    /**
     * The logical operators used to combine the filtering on multiple `CompositeFilters` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsffindingfilters.html#cfn-securityhub-automationrulev2-ocsffindingfilters-compositeoperator)
     */
    public fun compositeOperator(): String? = unwrap(this).getCompositeOperator()

    /**
     * A builder for [OcsfFindingFiltersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compositeFilters Enables the creation of complex filtering conditions by combining
       * filter criteria.
       */
      public fun compositeFilters(compositeFilters: IResolvable)

      /**
       * @param compositeFilters Enables the creation of complex filtering conditions by combining
       * filter criteria.
       */
      public fun compositeFilters(compositeFilters: List<Any>)

      /**
       * @param compositeFilters Enables the creation of complex filtering conditions by combining
       * filter criteria.
       */
      public fun compositeFilters(vararg compositeFilters: Any)

      /**
       * @param compositeOperator The logical operators used to combine the filtering on multiple
       * `CompositeFilters` .
       */
      public fun compositeOperator(compositeOperator: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfFindingFiltersProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfFindingFiltersProperty.builder()

      /**
       * @param compositeFilters Enables the creation of complex filtering conditions by combining
       * filter criteria.
       */
      override fun compositeFilters(compositeFilters: IResolvable) {
        cdkBuilder.compositeFilters(compositeFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param compositeFilters Enables the creation of complex filtering conditions by combining
       * filter criteria.
       */
      override fun compositeFilters(compositeFilters: List<Any>) {
        cdkBuilder.compositeFilters(compositeFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param compositeFilters Enables the creation of complex filtering conditions by combining
       * filter criteria.
       */
      override fun compositeFilters(vararg compositeFilters: Any): Unit =
          compositeFilters(compositeFilters.toList())

      /**
       * @param compositeOperator The logical operators used to combine the filtering on multiple
       * `CompositeFilters` .
       */
      override fun compositeOperator(compositeOperator: String) {
        cdkBuilder.compositeOperator(compositeOperator)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfFindingFiltersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfFindingFiltersProperty,
    ) : CdkObject(cdkObject),
        OcsfFindingFiltersProperty {
      /**
       * Enables the creation of complex filtering conditions by combining filter criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsffindingfilters.html#cfn-securityhub-automationrulev2-ocsffindingfilters-compositefilters)
       */
      override fun compositeFilters(): Any? = unwrap(this).getCompositeFilters()

      /**
       * The logical operators used to combine the filtering on multiple `CompositeFilters` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsffindingfilters.html#cfn-securityhub-automationrulev2-ocsffindingfilters-compositeoperator)
       */
      override fun compositeOperator(): String? = unwrap(this).getCompositeOperator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OcsfFindingFiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfFindingFiltersProperty):
          OcsfFindingFiltersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OcsfFindingFiltersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OcsfFindingFiltersProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfFindingFiltersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfFindingFiltersProperty
    }
  }

  /**
   * Enables filtering of security findings based on map field values in OCSF.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * OcsfMapFilterProperty ocsfMapFilterProperty = OcsfMapFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(MapFilterProperty.builder()
   * .comparison("comparison")
   * .key("key")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfmapfilter.html)
   */
  public interface OcsfMapFilterProperty {
    /**
     * The name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfmapfilter.html#cfn-securityhub-automationrulev2-ocsfmapfilter-fieldname)
     */
    public fun fieldName(): String

    /**
     * Enables filtering of security findings based on map field values in OCSF.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfmapfilter.html#cfn-securityhub-automationrulev2-ocsfmapfilter-filter)
     */
    public fun filter(): Any

    /**
     * A builder for [OcsfMapFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName The name of the field. 
       */
      public fun fieldName(fieldName: String)

      /**
       * @param filter Enables filtering of security findings based on map field values in OCSF. 
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter Enables filtering of security findings based on map field values in OCSF. 
       */
      public fun filter(filter: MapFilterProperty)

      /**
       * @param filter Enables filtering of security findings based on map field values in OCSF. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac94b8cc9a5fa69714002f0b50c46045b1c1b4ffff4d5998ebb98d96020666c7")
      public fun filter(filter: MapFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfMapFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfMapFilterProperty.builder()

      /**
       * @param fieldName The name of the field. 
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param filter Enables filtering of security findings based on map field values in OCSF. 
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on map field values in OCSF. 
       */
      override fun filter(filter: MapFilterProperty) {
        cdkBuilder.filter(filter.let(MapFilterProperty.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on map field values in OCSF. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac94b8cc9a5fa69714002f0b50c46045b1c1b4ffff4d5998ebb98d96020666c7")
      override fun filter(filter: MapFilterProperty.Builder.() -> Unit): Unit =
          filter(MapFilterProperty(filter))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfMapFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfMapFilterProperty,
    ) : CdkObject(cdkObject),
        OcsfMapFilterProperty {
      /**
       * The name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfmapfilter.html#cfn-securityhub-automationrulev2-ocsfmapfilter-fieldname)
       */
      override fun fieldName(): String = unwrap(this).getFieldName()

      /**
       * Enables filtering of security findings based on map field values in OCSF.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfmapfilter.html#cfn-securityhub-automationrulev2-ocsfmapfilter-filter)
       */
      override fun filter(): Any = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OcsfMapFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfMapFilterProperty):
          OcsfMapFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? OcsfMapFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OcsfMapFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfMapFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfMapFilterProperty
    }
  }

  /**
   * Enables filtering of security findings based on numerical field values in OCSF.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * OcsfNumberFilterProperty ocsfNumberFilterProperty = OcsfNumberFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(NumberFilterProperty.builder()
   * .eq(123)
   * .gte(123)
   * .lte(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfnumberfilter.html)
   */
  public interface OcsfNumberFilterProperty {
    /**
     * The name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfnumberfilter.html#cfn-securityhub-automationrulev2-ocsfnumberfilter-fieldname)
     */
    public fun fieldName(): String

    /**
     * Enables filtering of security findings based on numerical field values in OCSF.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfnumberfilter.html#cfn-securityhub-automationrulev2-ocsfnumberfilter-filter)
     */
    public fun filter(): Any

    /**
     * A builder for [OcsfNumberFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName The name of the field. 
       */
      public fun fieldName(fieldName: String)

      /**
       * @param filter Enables filtering of security findings based on numerical field values in
       * OCSF. 
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter Enables filtering of security findings based on numerical field values in
       * OCSF. 
       */
      public fun filter(filter: NumberFilterProperty)

      /**
       * @param filter Enables filtering of security findings based on numerical field values in
       * OCSF. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d89fced0299742192f12f739f3a17c6262a6b4c738e2189c9ae2f2288be0609c")
      public fun filter(filter: NumberFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfNumberFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfNumberFilterProperty.builder()

      /**
       * @param fieldName The name of the field. 
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param filter Enables filtering of security findings based on numerical field values in
       * OCSF. 
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on numerical field values in
       * OCSF. 
       */
      override fun filter(filter: NumberFilterProperty) {
        cdkBuilder.filter(filter.let(NumberFilterProperty.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on numerical field values in
       * OCSF. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d89fced0299742192f12f739f3a17c6262a6b4c738e2189c9ae2f2288be0609c")
      override fun filter(filter: NumberFilterProperty.Builder.() -> Unit): Unit =
          filter(NumberFilterProperty(filter))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfNumberFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfNumberFilterProperty,
    ) : CdkObject(cdkObject),
        OcsfNumberFilterProperty {
      /**
       * The name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfnumberfilter.html#cfn-securityhub-automationrulev2-ocsfnumberfilter-fieldname)
       */
      override fun fieldName(): String = unwrap(this).getFieldName()

      /**
       * Enables filtering of security findings based on numerical field values in OCSF.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfnumberfilter.html#cfn-securityhub-automationrulev2-ocsfnumberfilter-filter)
       */
      override fun filter(): Any = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OcsfNumberFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfNumberFilterProperty):
          OcsfNumberFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? OcsfNumberFilterProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OcsfNumberFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfNumberFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfNumberFilterProperty
    }
  }

  /**
   * Enables filtering of security findings based on string field values in OCSF.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * OcsfStringFilterProperty ocsfStringFilterProperty = OcsfStringFilterProperty.builder()
   * .fieldName("fieldName")
   * .filter(StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfstringfilter.html)
   */
  public interface OcsfStringFilterProperty {
    /**
     * The name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfstringfilter.html#cfn-securityhub-automationrulev2-ocsfstringfilter-fieldname)
     */
    public fun fieldName(): String

    /**
     * Enables filtering of security findings based on string field values in OCSF.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfstringfilter.html#cfn-securityhub-automationrulev2-ocsfstringfilter-filter)
     */
    public fun filter(): Any

    /**
     * A builder for [OcsfStringFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName The name of the field. 
       */
      public fun fieldName(fieldName: String)

      /**
       * @param filter Enables filtering of security findings based on string field values in OCSF. 
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter Enables filtering of security findings based on string field values in OCSF. 
       */
      public fun filter(filter: StringFilterProperty)

      /**
       * @param filter Enables filtering of security findings based on string field values in OCSF. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("102169fe3f900fbbb768d4bc9f206d688e3e0d282e40af000a52c07bb8f3bfed")
      public fun filter(filter: StringFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfStringFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfStringFilterProperty.builder()

      /**
       * @param fieldName The name of the field. 
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param filter Enables filtering of security findings based on string field values in OCSF. 
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on string field values in OCSF. 
       */
      override fun filter(filter: StringFilterProperty) {
        cdkBuilder.filter(filter.let(StringFilterProperty.Companion::unwrap))
      }

      /**
       * @param filter Enables filtering of security findings based on string field values in OCSF. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("102169fe3f900fbbb768d4bc9f206d688e3e0d282e40af000a52c07bb8f3bfed")
      override fun filter(filter: StringFilterProperty.Builder.() -> Unit): Unit =
          filter(StringFilterProperty(filter))

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfStringFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfStringFilterProperty,
    ) : CdkObject(cdkObject),
        OcsfStringFilterProperty {
      /**
       * The name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfstringfilter.html#cfn-securityhub-automationrulev2-ocsfstringfilter-fieldname)
       */
      override fun fieldName(): String = unwrap(this).getFieldName()

      /**
       * Enables filtering of security findings based on string field values in OCSF.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-ocsfstringfilter.html#cfn-securityhub-automationrulev2-ocsfstringfilter-filter)
       */
      override fun filter(): Any = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OcsfStringFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfStringFilterProperty):
          OcsfStringFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? OcsfStringFilterProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OcsfStringFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfStringFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.OcsfStringFilterProperty
    }
  }

  /**
   * A string filter for filtering AWS Security Hub findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * StringFilterProperty stringFilterProperty = StringFilterProperty.builder()
   * .comparison("comparison")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-stringfilter.html)
   */
  public interface StringFilterProperty {
    /**
     * The condition to apply to a string value when filtering Security Hub findings.
     *
     * To search for values that have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that include the filter value, use `CONTAINS` . For example, the
     * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the string
     * CloudFront.
     * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
     * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
     * `123456789012` .
     * * To search for values that start with the filter value, use `PREFIX` . For example, the
     * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts with
     * `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or `ca` ,
     * doesn't match.
     *
     * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A finding
     * matches if it matches any one of those filters. For example, the filters `Title CONTAINS
     * CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either `CloudFront` ,
     * `CloudWatch` , or both strings in the title.
     *
     * To search for values that don’t have the filter value, use one of the following comparison
     * operators:
     *
     * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
     * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
     * string CloudFront.
     * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
     * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
     * other than `123456789012` .
     * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` . For
     * example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
     * `ResourceRegion` that starts with a value other than `us` .
     *
     * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are joined
     * by `AND` . A finding matches only if it matches all of those filters. For example, the filters
     * `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that excludes
     * both `CloudFront` and `CloudWatch` in the title.
     *
     * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
     * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
     * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters can
     * only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with other
     * `NOT_CONTAINS` filters.
     *
     * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
     * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
     * `PREFIX_NOT_EQUALS` filters.
     *
     * For example, for the following filters, Security Hub first identifies findings that have
     * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that have
     * a resource type of `AwsIamPolicy` and findings that have a resource type of
     * `AwsEc2NetworkInterface` .
     *
     * * `ResourceType PREFIX AwsIam`
     * * `ResourceType PREFIX AwsEc2`
     * * `ResourceType NOT_EQUALS AwsIamPolicy`
     * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
     *
     * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules V1.
     * `CONTAINS_WORD` operator is only supported in `GetFindingsV2` , `GetFindingStatisticsV2` ,
     * `GetResourcesV2` , and `GetResourceStatisticsV2` APIs. For more information, see [Automation
     * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
     * *AWS Security Hub User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-stringfilter.html#cfn-securityhub-automationrulev2-stringfilter-comparison)
     */
    public fun comparison(): String

    /**
     * The string filter value.
     *
     * Filter values are case sensitive. For example, the product name for control-based findings is
     * `Security Hub` . If you provide `security hub` as the filter value, there's no match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-stringfilter.html#cfn-securityhub-automationrulev2-stringfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [StringFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparison The condition to apply to a string value when filtering Security Hub
       * findings. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules V1.
       * `CONTAINS_WORD` operator is only supported in `GetFindingsV2` , `GetFindingStatisticsV2` ,
       * `GetResourcesV2` , and `GetResourceStatisticsV2` APIs. For more information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      public fun comparison(comparison: String)

      /**
       * @param value The string filter value. 
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.StringFilterProperty.Builder
          =
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.StringFilterProperty.builder()

      /**
       * @param comparison The condition to apply to a string value when filtering Security Hub
       * findings. 
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules V1.
       * `CONTAINS_WORD` operator is only supported in `GetFindingsV2` , `GetFindingStatisticsV2` ,
       * `GetResourcesV2` , and `GetResourceStatisticsV2` APIs. For more information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       */
      override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      /**
       * @param value The string filter value. 
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.StringFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.StringFilterProperty,
    ) : CdkObject(cdkObject),
        StringFilterProperty {
      /**
       * The condition to apply to a string value when filtering Security Hub findings.
       *
       * To search for values that have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that include the filter value, use `CONTAINS` . For example, the
       * filter `Title CONTAINS CloudFront` matches findings that have a `Title` that includes the
       * string CloudFront.
       * * To search for values that exactly match the filter value, use `EQUALS` . For example, the
       * filter `AwsAccountId EQUALS 123456789012` only matches findings that have an account ID of
       * `123456789012` .
       * * To search for values that start with the filter value, use `PREFIX` . For example, the
       * filter `ResourceRegion PREFIX us` matches findings that have a `ResourceRegion` that starts
       * with `us` . A `ResourceRegion` that starts with a different value, such as `af` , `ap` , or
       * `ca` , doesn't match.
       *
       * `CONTAINS` , `EQUALS` , and `PREFIX` filters on the same field are joined by `OR` . A
       * finding matches if it matches any one of those filters. For example, the filters `Title
       * CONTAINS CloudFront OR Title CONTAINS CloudWatch` match a finding that includes either
       * `CloudFront` , `CloudWatch` , or both strings in the title.
       *
       * To search for values that don’t have the filter value, use one of the following comparison
       * operators:
       *
       * * To search for values that exclude the filter value, use `NOT_CONTAINS` . For example, the
       * filter `Title NOT_CONTAINS CloudFront` matches findings that have a `Title` that excludes the
       * string CloudFront.
       * * To search for values other than the filter value, use `NOT_EQUALS` . For example, the
       * filter `AwsAccountId NOT_EQUALS 123456789012` only matches findings that have an account ID
       * other than `123456789012` .
       * * To search for values that don't start with the filter value, use `PREFIX_NOT_EQUALS` .
       * For example, the filter `ResourceRegion PREFIX_NOT_EQUALS us` matches findings with a
       * `ResourceRegion` that starts with a value other than `us` .
       *
       * `NOT_CONTAINS` , `NOT_EQUALS` , and `PREFIX_NOT_EQUALS` filters on the same field are
       * joined by `AND` . A finding matches only if it matches all of those filters. For example, the
       * filters `Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch` match a finding that
       * excludes both `CloudFront` and `CloudWatch` in the title.
       *
       * You can’t have both a `CONTAINS` filter and a `NOT_CONTAINS` filter on the same field.
       * Similarly, you can't provide both an `EQUALS` filter and a `NOT_EQUALS` or `PREFIX_NOT_EQUALS`
       * filter on the same field. Combining filters in this way returns an error. `CONTAINS` filters
       * can only be used with other `CONTAINS` filters. `NOT_CONTAINS` filters can only be used with
       * other `NOT_CONTAINS` filters.
       *
       * You can combine `PREFIX` filters with `NOT_EQUALS` or `PREFIX_NOT_EQUALS` filters for the
       * same field. Security Hub first processes the `PREFIX` filters, and then the `NOT_EQUALS` or
       * `PREFIX_NOT_EQUALS` filters.
       *
       * For example, for the following filters, Security Hub first identifies findings that have
       * resource types that start with either `AwsIam` or `AwsEc2` . It then excludes findings that
       * have a resource type of `AwsIamPolicy` and findings that have a resource type of
       * `AwsEc2NetworkInterface` .
       *
       * * `ResourceType PREFIX AwsIam`
       * * `ResourceType PREFIX AwsEc2`
       * * `ResourceType NOT_EQUALS AwsIamPolicy`
       * * `ResourceType NOT_EQUALS AwsEc2NetworkInterface`
       *
       * `CONTAINS` and `NOT_CONTAINS` operators can be used only with automation rules V1.
       * `CONTAINS_WORD` operator is only supported in `GetFindingsV2` , `GetFindingStatisticsV2` ,
       * `GetResourcesV2` , and `GetResourceStatisticsV2` APIs. For more information, see [Automation
       * rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html) in the
       * *AWS Security Hub User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-stringfilter.html#cfn-securityhub-automationrulev2-stringfilter-comparison)
       */
      override fun comparison(): String = unwrap(this).getComparison()

      /**
       * The string filter value.
       *
       * Filter values are case sensitive. For example, the product name for control-based findings
       * is `Security Hub` . If you provide `security hub` as the filter value, there's no match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrulev2-stringfilter.html#cfn-securityhub-automationrulev2-stringfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StringFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.StringFilterProperty):
          StringFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? StringFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringFilterProperty):
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.StringFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2.StringFilterProperty
    }
  }
}
