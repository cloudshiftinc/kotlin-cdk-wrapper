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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.ClusterInstanceOptions
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.PerformanceInsightRetention

/**
 * Common options for creating a cluster instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kms.*;
 * import software.amazon.awscdk.services.rds.*;
 * Key key;
 * ParameterGroup parameterGroup;
 * ClusterInstanceOptions clusterInstanceOptions = ClusterInstanceOptions.builder()
 * .allowMajorVersionUpgrade(false)
 * .autoMinorVersionUpgrade(false)
 * .enablePerformanceInsights(false)
 * .instanceIdentifier("instanceIdentifier")
 * .isFromLegacyInstanceProps(false)
 * .parameterGroup(parameterGroup)
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .performanceInsightEncryptionKey(key)
 * .performanceInsightRetention(PerformanceInsightRetention.DEFAULT)
 * .publiclyAccessible(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class ClusterInstanceOptionsDsl {
    private val cdkBuilder: ClusterInstanceOptions.Builder = ClusterInstanceOptions.builder()

    /**
     * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB
     *   instance.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for the
     *   DB instance.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /** @param instanceIdentifier The identifier for the database instance. */
    public fun instanceIdentifier(instanceIdentifier: String) {
        cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * @param isFromLegacyInstanceProps Only used for migrating existing clusters from using
     *   `instanceProps` to `writer` and `readers`.
     */
    public fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean) {
        cdkBuilder.isFromLegacyInstanceProps(isFromLegacyInstanceProps)
    }

    /**
     * @param parameterGroup The DB parameter group to associate with the instance. This is only
     *   needed if you need to configure different parameter groups for each individual instance,
     *   otherwise you should not provide this and just use the cluster parameter group
     */
    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically. You can
     *   only specify parameterGroup or parameters but not both. You need to use a versioned engine
     *   to auto-generate a DBParameterGroup.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     *   data.
     */
    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
        cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey)
    }

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     *   Insights data.
     */
    public fun performanceInsightRetention(
        performanceInsightRetention: PerformanceInsightRetention
    ) {
        cdkBuilder.performanceInsightRetention(performanceInsightRetention)
    }

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun build(): ClusterInstanceOptions = cdkBuilder.build()
}
