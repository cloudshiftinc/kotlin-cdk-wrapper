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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnListenerRuleRuleConditionPropertyDsl {
    private val cdkBuilder: CfnListenerRule.RuleConditionProperty.Builder =
        CfnListenerRule.RuleConditionProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    public fun hostHeaderConfig(hostHeaderConfig: IResolvable) {
        cdkBuilder.hostHeaderConfig(hostHeaderConfig)
    }

    public fun hostHeaderConfig(hostHeaderConfig: CfnListenerRule.HostHeaderConfigProperty) {
        cdkBuilder.hostHeaderConfig(hostHeaderConfig)
    }

    public fun httpHeaderConfig(httpHeaderConfig: IResolvable) {
        cdkBuilder.httpHeaderConfig(httpHeaderConfig)
    }

    public fun httpHeaderConfig(httpHeaderConfig: CfnListenerRule.HttpHeaderConfigProperty) {
        cdkBuilder.httpHeaderConfig(httpHeaderConfig)
    }

    public fun httpRequestMethodConfig(httpRequestMethodConfig: IResolvable) {
        cdkBuilder.httpRequestMethodConfig(httpRequestMethodConfig)
    }

    public fun httpRequestMethodConfig(httpRequestMethodConfig: CfnListenerRule.HttpRequestMethodConfigProperty) {
        cdkBuilder.httpRequestMethodConfig(httpRequestMethodConfig)
    }

    public fun pathPatternConfig(pathPatternConfig: IResolvable) {
        cdkBuilder.pathPatternConfig(pathPatternConfig)
    }

    public fun pathPatternConfig(pathPatternConfig: CfnListenerRule.PathPatternConfigProperty) {
        cdkBuilder.pathPatternConfig(pathPatternConfig)
    }

    public fun queryStringConfig(queryStringConfig: IResolvable) {
        cdkBuilder.queryStringConfig(queryStringConfig)
    }

    public fun queryStringConfig(queryStringConfig: CfnListenerRule.QueryStringConfigProperty) {
        cdkBuilder.queryStringConfig(queryStringConfig)
    }

    public fun sourceIpConfig(sourceIpConfig: IResolvable) {
        cdkBuilder.sourceIpConfig(sourceIpConfig)
    }

    public fun sourceIpConfig(sourceIpConfig: CfnListenerRule.SourceIpConfigProperty) {
        cdkBuilder.sourceIpConfig(sourceIpConfig)
    }

    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnListenerRule.RuleConditionProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
