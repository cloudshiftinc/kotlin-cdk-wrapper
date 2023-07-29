@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::UsagePlan` resource creates a usage plan for deployed APIs.
 *
 * A usage plan sets a target for the throttling and quota limits on individual client API keys. For
 * more information, see
 * [Creating and Using API Usage Plans in Amazon API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html)
 * in the *API Gateway Developer Guide* .
 *
 * In some cases clients can exceed the targets that you set. Don’t rely on usage plans to control
 * costs. Consider using
 * [AWS Budgets](https://docs.aws.amazon.com/cost-management/latest/userguide/budgets-managing-costs.html)
 * to monitor costs and
 * [AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) to manage API
 * requests.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
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
@CdkDslMarker
public class CfnUsagePlanDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUsagePlan.Builder = CfnUsagePlan.Builder.create(scope, id)

    private val _apiStages: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     *
     * @param apiStages The associated API stages of a usage plan.
     */
    public fun apiStages(vararg apiStages: Any) {
        _apiStages.addAll(listOf(*apiStages))
    }

    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     *
     * @param apiStages The associated API stages of a usage plan.
     */
    public fun apiStages(apiStages: Collection<Any>) {
        _apiStages.addAll(apiStages)
    }

    /**
     * The associated API stages of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
     *
     * @param apiStages The associated API stages of a usage plan.
     */
    public fun apiStages(apiStages: IResolvable) {
        cdkBuilder.apiStages(apiStages)
    }

    /**
     * The description of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description)
     *
     * @param description The description of a usage plan.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     *
     * @param quota The target maximum number of permitted requests per a given unit time interval.
     */
    public fun quota(quota: IResolvable) {
        cdkBuilder.quota(quota)
    }

    /**
     * The target maximum number of permitted requests per a given unit time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
     *
     * @param quota The target maximum number of permitted requests per a given unit time interval.
     */
    public fun quota(quota: CfnUsagePlan.QuotaSettingsProperty) {
        cdkBuilder.quota(quota)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-tags)
     *
     * @param tags The collection of tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-tags)
     *
     * @param tags The collection of tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     *
     * @param throttle A map containing method level throttling information for API stage in a usage
     *   plan.
     */
    public fun throttle(throttle: IResolvable) {
        cdkBuilder.throttle(throttle)
    }

    /**
     * A map containing method level throttling information for API stage in a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
     *
     * @param throttle A map containing method level throttling information for API stage in a usage
     *   plan.
     */
    public fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty) {
        cdkBuilder.throttle(throttle)
    }

    /**
     * The name of a usage plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname)
     *
     * @param usagePlanName The name of a usage plan.
     */
    public fun usagePlanName(usagePlanName: String) {
        cdkBuilder.usagePlanName(usagePlanName)
    }

    public fun build(): CfnUsagePlan {
        if (_apiStages.isNotEmpty()) cdkBuilder.apiStages(_apiStages)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
