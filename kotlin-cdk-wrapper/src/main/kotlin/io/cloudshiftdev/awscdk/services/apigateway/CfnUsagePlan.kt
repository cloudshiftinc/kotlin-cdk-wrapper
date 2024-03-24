@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::UsagePlan` resource creates a usage plan for deployed APIs.
 *
 * A usage plan sets a target for the throttling and quota limits on individual client API keys. For
 * more information, see [Creating and Using API Usage Plans in Amazon API
 * Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html)
 * in the *API Gateway Developer Guide* .
 *
 * In some cases clients can exceed the targets that you set. Don’t rely on usage plans to control
 * costs. Consider using [AWS
 * Budgets](https://docs.aws.amazon.com/cost-management/latest/userguide/budgets-managing-costs.html)
 * to monitor costs and [AWS
 * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) to manage API requests.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnUsagePlan cfnUsagePlan = CfnUsagePlan.Builder.create(this, "MyCfnUsagePlan")
 * .apiStages(List.of(ApiStageProperty.builder()
 * .apiId("apiId")
 * .stage("stage")
 * .throttle(Map.of(
 * "throttleKey", ThrottleSettingsProperty.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build()))
 * .build()))
 * .description("description")
 * .quota(QuotaSettingsProperty.builder()
 * .limit(123)
 * .offset(123)
 * .period("period")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .throttle(ThrottleSettingsProperty.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build())
 * .usagePlanName("usagePlanName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
 */
public open class CfnUsagePlan(
  cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.apigateway.CfnUsagePlan(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUsagePlanProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnUsagePlan(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnUsagePlanProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUsagePlanProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUsagePlanProps(props)
  )

  /**
   * The associated API stages of a usage plan.
   */
  public open fun apiStages(): Any? = unwrap(this).getApiStages()

  /**
   * The associated API stages of a usage plan.
   */
  public open fun apiStages(`value`: IResolvable) {
    unwrap(this).setApiStages(`value`.let(IResolvable::unwrap))
  }

  /**
   * The associated API stages of a usage plan.
   */
  public open fun apiStages(`value`: List<Any>) {
    unwrap(this).setApiStages(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The associated API stages of a usage plan.
   */
  public open fun apiStages(vararg `value`: Any): Unit = apiStages(`value`.toList())

  /**
   * The ID for the usage plan.
   *
   * For example: `abc123` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description of a usage plan.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of a usage plan.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The target maximum number of permitted requests per a given unit time interval.
   */
  public open fun quota(): Any? = unwrap(this).getQuota()

  /**
   * The target maximum number of permitted requests per a given unit time interval.
   */
  public open fun quota(`value`: IResolvable) {
    unwrap(this).setQuota(`value`.let(IResolvable::unwrap))
  }

  /**
   * The target maximum number of permitted requests per a given unit time interval.
   */
  public open fun quota(`value`: QuotaSettingsProperty) {
    unwrap(this).setQuota(`value`.let(QuotaSettingsProperty::unwrap))
  }

  /**
   * The target maximum number of permitted requests per a given unit time interval.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("513d79bf55b0fc7e5fb826298997daf8a100ce76df384d6dccc51c8f4eb8ef1c")
  public open fun quota(`value`: QuotaSettingsProperty.Builder.() -> Unit): Unit =
      quota(QuotaSettingsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A map containing method level throttling information for API stage in a usage plan.
   */
  public open fun throttle(): Any? = unwrap(this).getThrottle()

  /**
   * A map containing method level throttling information for API stage in a usage plan.
   */
  public open fun throttle(`value`: IResolvable) {
    unwrap(this).setThrottle(`value`.let(IResolvable::unwrap))
  }

  /**
   * A map containing method level throttling information for API stage in a usage plan.
   */
  public open fun throttle(`value`: ThrottleSettingsProperty) {
    unwrap(this).setThrottle(`value`.let(ThrottleSettingsProperty::unwrap))
  }

  /**
   * A map containing method level throttling information for API stage in a usage plan.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9aa0bbb41cec396f73144459cccf376bbbf026fcd61769dfe3241000d44b5798")
  public open fun throttle(`value`: ThrottleSettingsProperty.Builder.() -> Unit): Unit =
      throttle(ThrottleSettingsProperty(`value`))

  /**
   * The name of a usage plan.
   */
  public open fun usagePlanName(): String? = unwrap(this).getUsagePlanName()

  /**
   * The name of a usage plan.
   */
  public open fun usagePlanName(`value`: String) {
    unwrap(this).setUsagePlanName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnUsagePlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     * @param apiStages The associated API stages of a usage plan. 
     */
    public fun apiStages(apiStages: IResolvable)

    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     * @param apiStages The associated API stages of a usage plan. 
     */
    public fun apiStages(apiStages: List<Any>)

    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     * @param apiStages The associated API stages of a usage plan. 
     */
    public fun apiStages(vararg apiStages: Any)

    /**
     * The description of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description)
     * @param description The description of a usage plan. 
     */
    public fun description(description: String)

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     * @param quota The target maximum number of permitted requests per a given unit time interval. 
     */
    public fun quota(quota: IResolvable)

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     * @param quota The target maximum number of permitted requests per a given unit time interval. 
     */
    public fun quota(quota: QuotaSettingsProperty)

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     * @param quota The target maximum number of permitted requests per a given unit time interval. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0183b02f64044bdf04ca00b27cc24e485809a67d79639146ce7dcb23f42d1edc")
    public fun quota(quota: QuotaSettingsProperty.Builder.() -> Unit)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan. 
     */
    public fun throttle(throttle: IResolvable)

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan. 
     */
    public fun throttle(throttle: ThrottleSettingsProperty)

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee354e813e0a512cded8fda38274ee50c28a68c3b2cdc4b5daff523545d7b71d")
    public fun throttle(throttle: ThrottleSettingsProperty.Builder.() -> Unit)

    /**
     * The name of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname)
     * @param usagePlanName The name of a usage plan. 
     */
    public fun usagePlanName(usagePlanName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnUsagePlan.Builder =
        software.amazon.awscdk.services.apigateway.CfnUsagePlan.Builder.create(scope, id)

    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     * @param apiStages The associated API stages of a usage plan. 
     */
    override fun apiStages(apiStages: IResolvable) {
      cdkBuilder.apiStages(apiStages.let(IResolvable::unwrap))
    }

    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     * @param apiStages The associated API stages of a usage plan. 
     */
    override fun apiStages(apiStages: List<Any>) {
      cdkBuilder.apiStages(apiStages.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     * @param apiStages The associated API stages of a usage plan. 
     */
    override fun apiStages(vararg apiStages: Any): Unit = apiStages(apiStages.toList())

    /**
     * The description of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description)
     * @param description The description of a usage plan. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     * @param quota The target maximum number of permitted requests per a given unit time interval. 
     */
    override fun quota(quota: IResolvable) {
      cdkBuilder.quota(quota.let(IResolvable::unwrap))
    }

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     * @param quota The target maximum number of permitted requests per a given unit time interval. 
     */
    override fun quota(quota: QuotaSettingsProperty) {
      cdkBuilder.quota(quota.let(QuotaSettingsProperty::unwrap))
    }

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     * @param quota The target maximum number of permitted requests per a given unit time interval. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0183b02f64044bdf04ca00b27cc24e485809a67d79639146ce7dcb23f42d1edc")
    override fun quota(quota: QuotaSettingsProperty.Builder.() -> Unit): Unit =
        quota(QuotaSettingsProperty(quota))

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan. 
     */
    override fun throttle(throttle: IResolvable) {
      cdkBuilder.throttle(throttle.let(IResolvable::unwrap))
    }

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan. 
     */
    override fun throttle(throttle: ThrottleSettingsProperty) {
      cdkBuilder.throttle(throttle.let(ThrottleSettingsProperty::unwrap))
    }

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee354e813e0a512cded8fda38274ee50c28a68c3b2cdc4b5daff523545d7b71d")
    override fun throttle(throttle: ThrottleSettingsProperty.Builder.() -> Unit): Unit =
        throttle(ThrottleSettingsProperty(throttle))

    /**
     * The name of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname)
     * @param usagePlanName The name of a usage plan. 
     */
    override fun usagePlanName(usagePlanName: String) {
      cdkBuilder.usagePlanName(usagePlanName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlan = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnUsagePlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUsagePlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUsagePlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan):
        CfnUsagePlan = CfnUsagePlan(cdkObject)

    internal fun unwrap(wrapped: CfnUsagePlan):
        software.amazon.awscdk.services.apigateway.CfnUsagePlan = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.CfnUsagePlan
  }

  /**
   * API stage name of the associated API stage in a usage plan.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * ApiStageProperty apiStageProperty = ApiStageProperty.builder()
   * .apiId("apiId")
   * .stage("stage")
   * .throttle(Map.of(
   * "throttleKey", ThrottleSettingsProperty.builder()
   * .burstLimit(123)
   * .rateLimit(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html)
   */
  public interface ApiStageProperty {
    /**
     * API Id of the associated API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid)
     */
    public fun apiId(): String? = unwrap(this).getApiId()

    /**
     * API stage name of the associated API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage)
     */
    public fun stage(): String? = unwrap(this).getStage()

    /**
     * Map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-throttle)
     */
    public fun throttle(): Any? = unwrap(this).getThrottle()

    /**
     * A builder for [ApiStageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiId API Id of the associated API stage in a usage plan.
       */
      public fun apiId(apiId: String)

      /**
       * @param stage API stage name of the associated API stage in a usage plan.
       */
      public fun stage(stage: String)

      /**
       * @param throttle Map containing method level throttling information for API stage in a usage
       * plan.
       */
      public fun throttle(throttle: IResolvable)

      /**
       * @param throttle Map containing method level throttling information for API stage in a usage
       * plan.
       */
      public fun throttle(throttle: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty.builder()

      /**
       * @param apiId API Id of the associated API stage in a usage plan.
       */
      override fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
      }

      /**
       * @param stage API stage name of the associated API stage in a usage plan.
       */
      override fun stage(stage: String) {
        cdkBuilder.stage(stage)
      }

      /**
       * @param throttle Map containing method level throttling information for API stage in a usage
       * plan.
       */
      override fun throttle(throttle: IResolvable) {
        cdkBuilder.throttle(throttle.let(IResolvable::unwrap))
      }

      /**
       * @param throttle Map containing method level throttling information for API stage in a usage
       * plan.
       */
      override fun throttle(throttle: Map<String, Any>) {
        cdkBuilder.throttle(throttle.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty,
    ) : CdkObject(cdkObject), ApiStageProperty {
      /**
       * API Id of the associated API stage in a usage plan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid)
       */
      override fun apiId(): String? = unwrap(this).getApiId()

      /**
       * API stage name of the associated API stage in a usage plan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage)
       */
      override fun stage(): String? = unwrap(this).getStage()

      /**
       * Map containing method level throttling information for API stage in a usage plan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-throttle)
       */
      override fun throttle(): Any? = unwrap(this).getThrottle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiStageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty):
          ApiStageProperty = CdkObjectWrappers.wrap(cdkObject) as? ApiStageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiStageProperty):
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty
    }
  }

  /**
   * `QuotaSettings` is a property of the
   * [AWS::ApiGateway::UsagePlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
   * resource that specifies a target for the maximum number of requests users can make to your REST
   * APIs.
   *
   * In some cases clients can exceed the targets that you set. Don’t rely on usage plans to control
   * costs. Consider using [AWS
   * Budgets](https://docs.aws.amazon.com/cost-management/latest/userguide/budgets-managing-costs.html)
   * to monitor costs and [AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) to manage API
   * requests.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * QuotaSettingsProperty quotaSettingsProperty = QuotaSettingsProperty.builder()
   * .limit(123)
   * .offset(123)
   * .period("period")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html)
   */
  public interface QuotaSettingsProperty {
    /**
     * The target maximum number of requests that can be made in a given time period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit)
     */
    public fun limit(): Number? = unwrap(this).getLimit()

    /**
     * The number of requests subtracted from the given limit in the initial time period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset)
     */
    public fun offset(): Number? = unwrap(this).getOffset()

    /**
     * The time period in which the limit applies.
     *
     * Valid values are "DAY", "WEEK" or "MONTH".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period)
     */
    public fun period(): String? = unwrap(this).getPeriod()

    /**
     * A builder for [QuotaSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param limit The target maximum number of requests that can be made in a given time period.
       */
      public fun limit(limit: Number)

      /**
       * @param offset The number of requests subtracted from the given limit in the initial time
       * period.
       */
      public fun offset(offset: Number)

      /**
       * @param period The time period in which the limit applies.
       * Valid values are "DAY", "WEEK" or "MONTH".
       */
      public fun period(period: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty.builder()

      /**
       * @param limit The target maximum number of requests that can be made in a given time period.
       */
      override fun limit(limit: Number) {
        cdkBuilder.limit(limit)
      }

      /**
       * @param offset The number of requests subtracted from the given limit in the initial time
       * period.
       */
      override fun offset(offset: Number) {
        cdkBuilder.offset(offset)
      }

      /**
       * @param period The time period in which the limit applies.
       * Valid values are "DAY", "WEEK" or "MONTH".
       */
      override fun period(period: String) {
        cdkBuilder.period(period)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty,
    ) : CdkObject(cdkObject), QuotaSettingsProperty {
      /**
       * The target maximum number of requests that can be made in a given time period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit)
       */
      override fun limit(): Number? = unwrap(this).getLimit()

      /**
       * The number of requests subtracted from the given limit in the initial time period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset)
       */
      override fun offset(): Number? = unwrap(this).getOffset()

      /**
       * The time period in which the limit applies.
       *
       * Valid values are "DAY", "WEEK" or "MONTH".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period)
       */
      override fun period(): String? = unwrap(this).getPeriod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QuotaSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty):
          QuotaSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? QuotaSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuotaSettingsProperty):
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty
    }
  }

  /**
   * `ThrottleSettings` is a property of the
   * [AWS::ApiGateway::UsagePlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
   * resource that specifies the overall request rate (average requests per second) and burst capacity
   * when users call your REST APIs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * ThrottleSettingsProperty throttleSettingsProperty = ThrottleSettingsProperty.builder()
   * .burstLimit(123)
   * .rateLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html)
   */
  public interface ThrottleSettingsProperty {
    /**
     * The API target request burst rate limit.
     *
     * This allows more requests through for a period of time than the target rate limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit)
     */
    public fun burstLimit(): Number? = unwrap(this).getBurstLimit()

    /**
     * The API target request rate limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit)
     */
    public fun rateLimit(): Number? = unwrap(this).getRateLimit()

    /**
     * A builder for [ThrottleSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param burstLimit The API target request burst rate limit.
       * This allows more requests through for a period of time than the target rate limit.
       */
      public fun burstLimit(burstLimit: Number)

      /**
       * @param rateLimit The API target request rate limit.
       */
      public fun rateLimit(rateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty.builder()

      /**
       * @param burstLimit The API target request burst rate limit.
       * This allows more requests through for a period of time than the target rate limit.
       */
      override fun burstLimit(burstLimit: Number) {
        cdkBuilder.burstLimit(burstLimit)
      }

      /**
       * @param rateLimit The API target request rate limit.
       */
      override fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty,
    ) : CdkObject(cdkObject), ThrottleSettingsProperty {
      /**
       * The API target request burst rate limit.
       *
       * This allows more requests through for a period of time than the target rate limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit)
       */
      override fun burstLimit(): Number? = unwrap(this).getBurstLimit()

      /**
       * The API target request rate limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit)
       */
      override fun rateLimit(): Number? = unwrap(this).getRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThrottleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty):
          ThrottleSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? ThrottleSettingsProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThrottleSettingsProperty):
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty
    }
  }
}
