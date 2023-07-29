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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster

/**
 * The cluster control plane logging configuration for your cluster.
 *
 * When updating a resource, you must include this `ClusterLogging` property if the previous
 * CloudFormation template of the resource had it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * ClusterLoggingProperty clusterLoggingProperty = ClusterLoggingProperty.builder()
 * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-clusterlogging.html)
 */
@CdkDslMarker
public class CfnClusterClusterLoggingPropertyDsl {
    private val cdkBuilder: CfnCluster.ClusterLoggingProperty.Builder =
        CfnCluster.ClusterLoggingProperty.builder()

    private val _enabledTypes: MutableList<Any> = mutableListOf()

    /**
     * @param enabledTypes The enabled control plane logs for your cluster. All log types are
     *   disabled if the array is empty.
     *
     * When updating a resource, you must include this `EnabledTypes` property if the previous
     * CloudFormation template of the resource had it.
     */
    public fun enabledTypes(vararg enabledTypes: Any) {
        _enabledTypes.addAll(listOf(*enabledTypes))
    }

    /**
     * @param enabledTypes The enabled control plane logs for your cluster. All log types are
     *   disabled if the array is empty.
     *
     * When updating a resource, you must include this `EnabledTypes` property if the previous
     * CloudFormation template of the resource had it.
     */
    public fun enabledTypes(enabledTypes: Collection<Any>) {
        _enabledTypes.addAll(enabledTypes)
    }

    /**
     * @param enabledTypes The enabled control plane logs for your cluster. All log types are
     *   disabled if the array is empty.
     *
     * When updating a resource, you must include this `EnabledTypes` property if the previous
     * CloudFormation template of the resource had it.
     */
    public fun enabledTypes(enabledTypes: IResolvable) {
        cdkBuilder.enabledTypes(enabledTypes)
    }

    public fun build(): CfnCluster.ClusterLoggingProperty {
        if (_enabledTypes.isNotEmpty()) cdkBuilder.enabledTypes(_enabledTypes)
        return cdkBuilder.build()
    }
}
