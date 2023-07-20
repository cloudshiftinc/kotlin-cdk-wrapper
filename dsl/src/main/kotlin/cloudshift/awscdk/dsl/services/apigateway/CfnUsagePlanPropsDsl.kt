@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUsagePlanPropsDsl {
    private val cdkBuilder: CfnUsagePlanProps.Builder = CfnUsagePlanProps.builder()

    private val _apiStages: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun apiStages(vararg apiStages: Any) {
        _apiStages.addAll(listOf(*apiStages))
    }

    public fun apiStages(apiStages: Collection<Any>) {
        _apiStages.addAll(apiStages)
    }

    public fun apiStages(apiStages: IResolvable) {
        cdkBuilder.apiStages(apiStages)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun quota(quota: IResolvable) {
        cdkBuilder.quota(quota)
    }

    public fun quota(quota: CfnUsagePlan.QuotaSettingsProperty) {
        cdkBuilder.quota(quota)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun throttle(throttle: IResolvable) {
        cdkBuilder.throttle(throttle)
    }

    public fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty) {
        cdkBuilder.throttle(throttle)
    }

    public fun usagePlanName(usagePlanName: String) {
        cdkBuilder.usagePlanName(usagePlanName)
    }

    public fun build(): CfnUsagePlanProps {
        if (_apiStages.isNotEmpty()) cdkBuilder.apiStages(_apiStages)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
