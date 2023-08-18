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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * The Amazon EC2 unit limits for a managed scaling policy.
 *
 * The managed scaling activity of a cluster can not be above or below these limits. The limit only
 * applies to the core and task nodes. The master node cannot be scaled after initial configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ComputeLimitsProperty computeLimitsProperty = ComputeLimitsProperty.builder()
 * .maximumCapacityUnits(123)
 * .minimumCapacityUnits(123)
 * .unitType("unitType")
 * // the properties below are optional
 * .maximumCoreCapacityUnits(123)
 * .maximumOnDemandCapacityUnits(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html)
 */
@CdkDslMarker
public class CfnClusterComputeLimitsPropertyDsl {
    private val cdkBuilder: CfnCluster.ComputeLimitsProperty.Builder =
        CfnCluster.ComputeLimitsProperty.builder()

    /**
     * @param maximumCapacityUnits The upper boundary of Amazon EC2 units. It is measured through
     *   vCPU cores or instances for instance groups and measured through units for instance fleets.
     *   Managed scaling activities are not allowed beyond this boundary. The limit only applies to
     *   the core and task nodes. The master node cannot be scaled after initial configuration.
     */
    public fun maximumCapacityUnits(maximumCapacityUnits: Number) {
        cdkBuilder.maximumCapacityUnits(maximumCapacityUnits)
    }

    /**
     * @param maximumCoreCapacityUnits The upper boundary of Amazon EC2 units for core node type in
     *   a cluster. It is measured through vCPU cores or instances for instance groups and measured
     *   through units for instance fleets. The core units are not allowed to scale beyond this
     *   boundary. The parameter is used to split capacity allocation between core and task nodes.
     */
    public fun maximumCoreCapacityUnits(maximumCoreCapacityUnits: Number) {
        cdkBuilder.maximumCoreCapacityUnits(maximumCoreCapacityUnits)
    }

    /**
     * @param maximumOnDemandCapacityUnits The upper boundary of On-Demand Amazon EC2 units. It is
     *   measured through vCPU cores or instances for instance groups and measured through units for
     *   instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The
     *   parameter is used to split capacity allocation between On-Demand and Spot Instances.
     */
    public fun maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits: Number) {
        cdkBuilder.maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits)
    }

    /**
     * @param minimumCapacityUnits The lower boundary of Amazon EC2 units. It is measured through
     *   vCPU cores or instances for instance groups and measured through units for instance fleets.
     *   Managed scaling activities are not allowed beyond this boundary. The limit only applies to
     *   the core and task nodes. The master node cannot be scaled after initial configuration.
     */
    public fun minimumCapacityUnits(minimumCapacityUnits: Number) {
        cdkBuilder.minimumCapacityUnits(minimumCapacityUnits)
    }

    /** @param unitType The unit type used for specifying a managed scaling policy. */
    public fun unitType(unitType: String) {
        cdkBuilder.unitType(unitType)
    }

    public fun build(): CfnCluster.ComputeLimitsProperty = cdkBuilder.build()
}
