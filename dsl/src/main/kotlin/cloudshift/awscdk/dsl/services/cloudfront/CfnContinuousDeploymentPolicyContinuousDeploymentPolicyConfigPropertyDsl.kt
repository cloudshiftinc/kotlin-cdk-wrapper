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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl {
    private val cdkBuilder:
        CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder =
        CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.builder()

    private val _stagingDistributionDnsNames: MutableList<String> = mutableListOf()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun stagingDistributionDnsNames(vararg stagingDistributionDnsNames: String) {
        _stagingDistributionDnsNames.addAll(listOf(*stagingDistributionDnsNames))
    }

    public fun stagingDistributionDnsNames(stagingDistributionDnsNames: Collection<String>) {
        _stagingDistributionDnsNames.addAll(stagingDistributionDnsNames)
    }

    public fun trafficConfig(trafficConfig: IResolvable) {
        cdkBuilder.trafficConfig(trafficConfig)
    }

    public fun trafficConfig(trafficConfig: CfnContinuousDeploymentPolicy.TrafficConfigProperty) {
        cdkBuilder.trafficConfig(trafficConfig)
    }

    public fun build(): CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty {
        if (_stagingDistributionDnsNames.isNotEmpty()) {
            cdkBuilder.stagingDistributionDnsNames(_stagingDistributionDnsNames)
        }
        return cdkBuilder.build()
    }
}
