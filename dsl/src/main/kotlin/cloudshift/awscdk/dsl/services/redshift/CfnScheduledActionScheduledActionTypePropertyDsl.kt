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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnScheduledAction

/**
 * The action type that specifies an Amazon Redshift API operation that is supported by the Amazon
 * Redshift scheduler.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * ScheduledActionTypeProperty scheduledActionTypeProperty = ScheduledActionTypeProperty.builder()
 * .pauseCluster(PauseClusterMessageProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .build())
 * .resizeCluster(ResizeClusterMessageProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * // the properties below are optional
 * .classic(false)
 * .clusterType("clusterType")
 * .nodeType("nodeType")
 * .numberOfNodes(123)
 * .build())
 * .resumeCluster(ResumeClusterMessageProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-scheduledactiontype.html)
 */
@CdkDslMarker
public class CfnScheduledActionScheduledActionTypePropertyDsl {
    private val cdkBuilder: CfnScheduledAction.ScheduledActionTypeProperty.Builder =
        CfnScheduledAction.ScheduledActionTypeProperty.builder()

    /** @param pauseCluster An action that runs a `PauseCluster` API operation. */
    public fun pauseCluster(pauseCluster: IResolvable) {
        cdkBuilder.pauseCluster(pauseCluster)
    }

    /** @param pauseCluster An action that runs a `PauseCluster` API operation. */
    public fun pauseCluster(pauseCluster: CfnScheduledAction.PauseClusterMessageProperty) {
        cdkBuilder.pauseCluster(pauseCluster)
    }

    /** @param resizeCluster An action that runs a `ResizeCluster` API operation. */
    public fun resizeCluster(resizeCluster: IResolvable) {
        cdkBuilder.resizeCluster(resizeCluster)
    }

    /** @param resizeCluster An action that runs a `ResizeCluster` API operation. */
    public fun resizeCluster(resizeCluster: CfnScheduledAction.ResizeClusterMessageProperty) {
        cdkBuilder.resizeCluster(resizeCluster)
    }

    /** @param resumeCluster An action that runs a `ResumeCluster` API operation. */
    public fun resumeCluster(resumeCluster: IResolvable) {
        cdkBuilder.resumeCluster(resumeCluster)
    }

    /** @param resumeCluster An action that runs a `ResumeCluster` API operation. */
    public fun resumeCluster(resumeCluster: CfnScheduledAction.ResumeClusterMessageProperty) {
        cdkBuilder.resumeCluster(resumeCluster)
    }

    public fun build(): CfnScheduledAction.ScheduledActionTypeProperty = cdkBuilder.build()
}
