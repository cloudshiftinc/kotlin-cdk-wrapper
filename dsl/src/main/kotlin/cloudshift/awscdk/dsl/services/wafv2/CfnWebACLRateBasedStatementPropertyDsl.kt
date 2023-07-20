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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnWebACLRateBasedStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.RateBasedStatementProperty.Builder =
        CfnWebACL.RateBasedStatementProperty.builder()

    public fun aggregateKeyType(aggregateKeyType: String) {
        cdkBuilder.aggregateKeyType(aggregateKeyType)
    }

    public fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig)
    }

    public fun forwardedIpConfig(forwardedIpConfig: CfnWebACL.ForwardedIPConfigurationProperty) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig)
    }

    public fun limit(limit: Number) {
        cdkBuilder.limit(limit)
    }

    public fun scopeDownStatement(scopeDownStatement: IResolvable) {
        cdkBuilder.scopeDownStatement(scopeDownStatement)
    }

    public fun scopeDownStatement(scopeDownStatement: CfnWebACL.StatementProperty) {
        cdkBuilder.scopeDownStatement(scopeDownStatement)
    }

    public fun build(): CfnWebACL.RateBasedStatementProperty = cdkBuilder.build()
}
