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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes an additional detail for a path analysis.
 *
 * For more information, see
 * [Reachability Analyzer additional detail codes](https://docs.aws.amazon.com/vpc/latest/reachability/additional-detail-codes.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AdditionalDetailProperty additionalDetailProperty = AdditionalDetailProperty.builder()
 * .additionalDetailType("additionalDetailType")
 * .component(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .loadBalancers(List.of(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build()))
 * .serviceName("serviceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisAdditionalDetailPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AdditionalDetailProperty.Builder =
        CfnNetworkInsightsAnalysis.AdditionalDetailProperty.builder()

    private val _loadBalancers: MutableList<Any> = mutableListOf()

    /** @param additionalDetailType The additional detail code. */
    public fun additionalDetailType(additionalDetailType: String) {
        cdkBuilder.additionalDetailType(additionalDetailType)
    }

    /** @param component The path component. */
    public fun component(component: IResolvable) {
        cdkBuilder.component(component)
    }

    /** @param component The path component. */
    public fun component(component: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.component(component)
    }

    /** @param loadBalancers The load balancers. */
    public fun loadBalancers(vararg loadBalancers: Any) {
        _loadBalancers.addAll(listOf(*loadBalancers))
    }

    /** @param loadBalancers The load balancers. */
    public fun loadBalancers(loadBalancers: Collection<Any>) {
        _loadBalancers.addAll(loadBalancers)
    }

    /** @param loadBalancers The load balancers. */
    public fun loadBalancers(loadBalancers: IResolvable) {
        cdkBuilder.loadBalancers(loadBalancers)
    }

    /** @param serviceName The name of the VPC endpoint service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AdditionalDetailProperty {
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        return cdkBuilder.build()
    }
}
