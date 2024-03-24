@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUsagePlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnUsagePlanProps cfnUsagePlanProps = CfnUsagePlanProps.builder()
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
public interface CfnUsagePlanProps {
  /**
   * The associated API stages of a usage plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
   */
  public fun apiStages(): Any? = unwrap(this).getApiStages()

  /**
   * The description of a usage plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The target maximum number of permitted requests per a given unit time interval.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
   */
  public fun quota(): Any? = unwrap(this).getQuota()

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A map containing method level throttling information for API stage in a usage plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
   */
  public fun throttle(): Any? = unwrap(this).getThrottle()

  /**
   * The name of a usage plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname)
   */
  public fun usagePlanName(): String? = unwrap(this).getUsagePlanName()

  /**
   * A builder for [CfnUsagePlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiStages The associated API stages of a usage plan.
     */
    public fun apiStages(apiStages: IResolvable)

    /**
     * @param apiStages The associated API stages of a usage plan.
     */
    public fun apiStages(apiStages: List<Any>)

    /**
     * @param apiStages The associated API stages of a usage plan.
     */
    public fun apiStages(vararg apiStages: Any)

    /**
     * @param description The description of a usage plan.
     */
    public fun description(description: String)

    /**
     * @param quota The target maximum number of permitted requests per a given unit time interval.
     */
    public fun quota(quota: IResolvable)

    /**
     * @param quota The target maximum number of permitted requests per a given unit time interval.
     */
    public fun quota(quota: CfnUsagePlan.QuotaSettingsProperty)

    /**
     * @param quota The target maximum number of permitted requests per a given unit time interval.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9854b4b8e14da0947215c44a9a604a1c6ad7f01403b5cbbfd5bf922a06879247")
    public fun quota(quota: CfnUsagePlan.QuotaSettingsProperty.Builder.() -> Unit)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan.
     */
    public fun throttle(throttle: IResolvable)

    /**
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan.
     */
    public fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty)

    /**
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e17daf260e81ca19f9bc3053aa08921fc3944154cfa8c40bd38ddad7000251fb")
    public fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty.Builder.() -> Unit)

    /**
     * @param usagePlanName The name of a usage plan.
     */
    public fun usagePlanName(usagePlanName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnUsagePlanProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnUsagePlanProps.builder()

    /**
     * @param apiStages The associated API stages of a usage plan.
     */
    override fun apiStages(apiStages: IResolvable) {
      cdkBuilder.apiStages(apiStages.let(IResolvable::unwrap))
    }

    /**
     * @param apiStages The associated API stages of a usage plan.
     */
    override fun apiStages(apiStages: List<Any>) {
      cdkBuilder.apiStages(apiStages.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param apiStages The associated API stages of a usage plan.
     */
    override fun apiStages(vararg apiStages: Any): Unit = apiStages(apiStages.toList())

    /**
     * @param description The description of a usage plan.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param quota The target maximum number of permitted requests per a given unit time interval.
     */
    override fun quota(quota: IResolvable) {
      cdkBuilder.quota(quota.let(IResolvable::unwrap))
    }

    /**
     * @param quota The target maximum number of permitted requests per a given unit time interval.
     */
    override fun quota(quota: CfnUsagePlan.QuotaSettingsProperty) {
      cdkBuilder.quota(quota.let(CfnUsagePlan.QuotaSettingsProperty::unwrap))
    }

    /**
     * @param quota The target maximum number of permitted requests per a given unit time interval.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9854b4b8e14da0947215c44a9a604a1c6ad7f01403b5cbbfd5bf922a06879247")
    override fun quota(quota: CfnUsagePlan.QuotaSettingsProperty.Builder.() -> Unit): Unit =
        quota(CfnUsagePlan.QuotaSettingsProperty(quota))

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan.
     */
    override fun throttle(throttle: IResolvable) {
      cdkBuilder.throttle(throttle.let(IResolvable::unwrap))
    }

    /**
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan.
     */
    override fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty) {
      cdkBuilder.throttle(throttle.let(CfnUsagePlan.ThrottleSettingsProperty::unwrap))
    }

    /**
     * @param throttle A map containing method level throttling information for API stage in a usage
     * plan.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e17daf260e81ca19f9bc3053aa08921fc3944154cfa8c40bd38ddad7000251fb")
    override fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty.Builder.() -> Unit): Unit
        = throttle(CfnUsagePlan.ThrottleSettingsProperty(throttle))

    /**
     * @param usagePlanName The name of a usage plan.
     */
    override fun usagePlanName(usagePlanName: String) {
      cdkBuilder.usagePlanName(usagePlanName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanProps,
  ) : CdkObject(cdkObject), CfnUsagePlanProps {
    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     */
    override fun apiStages(): Any? = unwrap(this).getApiStages()

    /**
     * The description of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     */
    override fun quota(): Any? = unwrap(this).getQuota()

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     */
    override fun throttle(): Any? = unwrap(this).getThrottle()

    /**
     * The name of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname)
     */
    override fun usagePlanName(): String? = unwrap(this).getUsagePlanName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUsagePlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanProps):
        CfnUsagePlanProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUsagePlanProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUsagePlanProps):
        software.amazon.awscdk.services.apigateway.CfnUsagePlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
  }
}
