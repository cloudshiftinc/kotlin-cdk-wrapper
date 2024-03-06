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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.CaCertificate
import software.amazon.awscdk.services.rds.ClusterInstanceProps
import software.amazon.awscdk.services.rds.ClusterInstanceType
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.PerformanceInsightRetention

/**
 * Common options for creating cluster instances (both serverless and provisioned).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kms.*;
 * import software.amazon.awscdk.services.rds.*;
 * CaCertificate caCertificate;
 * ClusterInstanceType clusterInstanceType;
 * Key key;
 * ParameterGroup parameterGroup;
 * ClusterInstanceProps clusterInstanceProps = ClusterInstanceProps.builder()
 * .instanceType(clusterInstanceType)
 * // the properties below are optional
 * .allowMajorVersionUpgrade(false)
 * .autoMinorVersionUpgrade(false)
 * .caCertificate(caCertificate)
 * .enablePerformanceInsights(false)
 * .instanceIdentifier("instanceIdentifier")
 * .isFromLegacyInstanceProps(false)
 * .parameterGroup(parameterGroup)
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .performanceInsightEncryptionKey(key)
 * .performanceInsightRetention(PerformanceInsightRetention.DEFAULT)
 * .promotionTier(123)
 * .publiclyAccessible(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class ClusterInstancePropsDsl {
    private val cdkBuilder: ClusterInstanceProps.Builder = ClusterInstanceProps.builder()

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
     * @param caCertificate The identifier of the CA certificate for this DB cluster's instances.
     *   Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     */
    public fun caCertificate(caCertificate: CaCertificate) {
        cdkBuilder.caCertificate(caCertificate)
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
     * @param instanceType The type of cluster instance to create. Can be either provisioned or
     *   serverless v2
     */
    public fun instanceType(instanceType: ClusterInstanceType) {
        cdkBuilder.instanceType(instanceType)
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
     * @param promotionTier The promotion tier of the cluster instance. This matters more for
     *   serverlessV2 instances. If a serverless instance is in tier 0-1 then it will scale with the
     *   writer.
     *
     * For provisioned instances this just determines the failover priority. If multiple instances
     * have the same priority then one will be picked at random
     */
    public fun promotionTier(promotionTier: Number) {
        cdkBuilder.promotionTier(promotionTier)
    }

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     *   If not specified, the cluster's vpcSubnets will be used to determine if the instance is
     *   internet-facing or not.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun build(): ClusterInstanceProps = cdkBuilder.build()
}
