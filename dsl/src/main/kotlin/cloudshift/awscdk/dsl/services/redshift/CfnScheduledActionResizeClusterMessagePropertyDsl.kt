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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnScheduledAction
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnScheduledActionResizeClusterMessagePropertyDsl {
    private val cdkBuilder: CfnScheduledAction.ResizeClusterMessageProperty.Builder =
        CfnScheduledAction.ResizeClusterMessageProperty.builder()

    public fun classic(classic: Boolean) {
        cdkBuilder.classic(classic)
    }

    public fun classic(classic: IResolvable) {
        cdkBuilder.classic(classic)
    }

    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public fun clusterType(clusterType: String) {
        cdkBuilder.clusterType(clusterType)
    }

    public fun nodeType(nodeType: String) {
        cdkBuilder.nodeType(nodeType)
    }

    public fun numberOfNodes(numberOfNodes: Number) {
        cdkBuilder.numberOfNodes(numberOfNodes)
    }

    public fun build(): CfnScheduledAction.ResizeClusterMessageProperty = cdkBuilder.build()
}
