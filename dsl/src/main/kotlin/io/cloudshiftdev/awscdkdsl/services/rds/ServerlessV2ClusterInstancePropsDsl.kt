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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.CaCertificate
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.PerformanceInsightRetention
import software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps

/**
 * Options for creating a serverless v2 instance.
 *
 * Example:
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .caCertificate(CaCertificate.RDS_CA_RDS2048_G1)
 * .build()))
 * .readers(List.of(ClusterInstance.serverlessV2("reader",
 * ServerlessV2ClusterInstanceProps.builder()
 * .caCertificate(CaCertificate.of("custom-ca"))
 * .build())))
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class ServerlessV2ClusterInstancePropsDsl {
    private val cdkBuilder: ServerlessV2ClusterInstanceProps.Builder =
        ServerlessV2ClusterInstanceProps.builder()

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
     *   If not specified, the cluster's vpcSubnets will be used to determine if the instance is
     *   internet-facing or not.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param scaleWithWriter Only applicable to reader instances. If this is true then the instance
     *   will be placed in promotion tier 1, otherwise it will be placed in promotion tier 2.
     *
     * For serverless v2 instances this means:
     * * true: The serverless v2 reader will scale to match the writer instance (provisioned or
     *   serverless)
     * * false: The serverless v2 reader will scale with the read workfload on the instance
     */
    public fun scaleWithWriter(scaleWithWriter: Boolean) {
        cdkBuilder.scaleWithWriter(scaleWithWriter)
    }

    public fun build(): ServerlessV2ClusterInstanceProps = cdkBuilder.build()
}
