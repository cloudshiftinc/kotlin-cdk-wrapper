package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ServerlessV2ClusterInstanceProps : ClusterInstanceOptions {
  /**
   * Only applicable to reader instances.
   *
   * If this is true then the instance will be placed in promotion tier 1, otherwise
   * it will be placed in promotion tier 2.
   *
   * For serverless v2 instances this means:
   *
   * * true: The serverless v2 reader will scale to match the writer instance (provisioned or
   * serverless)
   * * false: The serverless v2 reader will scale with the read workfload on the instance
   *
   * Default: false
   */
  public fun scaleWithWriter(): Boolean? = unwrap(this).getScaleWithWriter()

  /**
   * A builder for [ServerlessV2ClusterInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB
     * instance.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for the
     * DB instance.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param caCertificate The identifier of the CA certificate for this DB cluster's instances.
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     */
    public fun caCertificate(caCertificate: CaCertificate)

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    /**
     * @param instanceIdentifier The identifier for the database instance.
     */
    public fun instanceIdentifier(instanceIdentifier: String)

    /**
     * @param isFromLegacyInstanceProps Only used for migrating existing clusters from using
     * `instanceProps` to `writer` and `readers`.
     */
    public fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean)

    /**
     * @param parameterGroup The DB parameter group to associate with the instance.
     * This is only needed if you need to configure different parameter
     * groups for each individual instance, otherwise you should not
     * provide this and just use the cluster parameter group
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically.
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data.
     */
    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey)

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data.
     */
    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention)

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If not specified,
     * the cluster's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param scaleWithWriter Only applicable to reader instances.
     * If this is true then the instance will be placed in promotion tier 1, otherwise
     * it will be placed in promotion tier 2.
     *
     * For serverless v2 instances this means:
     *
     * * true: The serverless v2 reader will scale to match the writer instance (provisioned or
     * serverless)
     * * false: The serverless v2 reader will scale with the read workfload on the instance
     */
    public fun scaleWithWriter(scaleWithWriter: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps.Builder =
        software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps.builder()

    /**
     * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB
     * instance.
     */
    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for the
     * DB instance.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param caCertificate The identifier of the CA certificate for this DB cluster's instances.
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     */
    override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate::unwrap))
    }

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param instanceIdentifier The identifier for the database instance.
     */
    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * @param isFromLegacyInstanceProps Only used for migrating existing clusters from using
     * `instanceProps` to `writer` and `readers`.
     */
    override fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean) {
      cdkBuilder.isFromLegacyInstanceProps(isFromLegacyInstanceProps)
    }

    /**
     * @param parameterGroup The DB parameter group to associate with the instance.
     * This is only needed if you need to configure different parameter
     * groups for each individual instance, otherwise you should not
     * provide this and just use the cluster parameter group
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically.
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     * data.
     */
    override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey::unwrap))
    }

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     * Insights data.
     */
    override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention::unwrap))
    }

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     * If not specified,
     * the cluster's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param scaleWithWriter Only applicable to reader instances.
     * If this is true then the instance will be placed in promotion tier 1, otherwise
     * it will be placed in promotion tier 2.
     *
     * For serverless v2 instances this means:
     *
     * * true: The serverless v2 reader will scale to match the writer instance (provisioned or
     * serverless)
     * * false: The serverless v2 reader will scale with the read workfload on the instance
     */
    override fun scaleWithWriter(scaleWithWriter: Boolean) {
      cdkBuilder.scaleWithWriter(scaleWithWriter)
    }

    public fun build(): software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps,
  ) : CdkObject(cdkObject), ServerlessV2ClusterInstanceProps {
    /**
     * Whether to allow upgrade of major version for the DB instance.
     *
     * Default: - false
     */
    override fun allowMajorVersionUpgrade(): Boolean? = unwrap(this).getAllowMajorVersionUpgrade()

    /**
     * Whether to enable automatic upgrade of minor version for the DB instance.
     *
     * Default: - true
     */
    override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * The identifier of the CA certificate for this DB cluster's instances.
     *
     * Specifying or updating this property triggers a reboot.
     *
     * For RDS DB engines:
     *
     * Default: - RDS will choose a certificate authority
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html)
     */
    override fun caCertificate(): CaCertificate? =
        unwrap(this).getCaCertificate()?.let(CaCertificate::wrap)

    /**
     * Whether to enable Performance Insights for the DB instance.
     *
     * Default: - false, unless ``performanceInsightRetention`` or
     * ``performanceInsightEncryptionKey`` is set.
     */
    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    /**
     * The identifier for the database instance.
     *
     * Default: - CloudFormation generated identifier
     */
    override fun instanceIdentifier(): String? = unwrap(this).getInstanceIdentifier()

    /**
     * Only used for migrating existing clusters from using `instanceProps` to `writer` and
     * `readers`.
     *
     * Default: false
     *
     * Example:
     *
     * ```
     * // existing cluster
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
     * .version(AuroraMysqlEngineVersion.VER_3_03_0)
     * .build()))
     * .instances(2)
     * .instanceProps(InstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .vpc(vpc)
     * .build())
     * .build();
     * // migration
     * Map&lt;String, Object&gt; instanceProps = Map.of(
     * "instanceType", InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL),
     * "isFromLegacyInstanceProps", true);
     * DatabaseCluster myCluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
     * .version(AuroraMysqlEngineVersion.VER_3_03_0)
     * .build()))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .vpc(vpc)
     * .writer(ClusterInstance.provisioned("Instance1", ProvisionedClusterInstanceProps.builder()
     * .instanceType(instanceProps.getInstanceType())
     * .isFromLegacyInstanceProps(instanceProps.getIsFromLegacyInstanceProps())
     * .build()))
     * .readers(List.of(ClusterInstance.provisioned("Instance2",
     * ProvisionedClusterInstanceProps.builder()
     * .instanceType(instanceProps.getInstanceType())
     * .isFromLegacyInstanceProps(instanceProps.getIsFromLegacyInstanceProps())
     * .build())))
     * .build();
     * ```
     */
    override fun isFromLegacyInstanceProps(): Boolean? = unwrap(this).getIsFromLegacyInstanceProps()

    /**
     * The DB parameter group to associate with the instance.
     *
     * This is only needed if you need to configure different parameter
     * groups for each individual instance, otherwise you should not
     * provide this and just use the cluster parameter group
     *
     * Default: the cluster parameter group is used
     */
    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    /**
     * The parameters in the DBParameterGroup to create automatically.
     *
     * You can only specify parameterGroup or parameters but not both.
     * You need to use a versioned engine to auto-generate a DBParameterGroup.
     *
     * Default: - None
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * The AWS KMS key for encryption of Performance Insights data.
     *
     * Default: - default master key
     */
    override fun performanceInsightEncryptionKey(): IKey? =
        unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

    /**
     * The amount of time, in days, to retain Performance Insights data.
     *
     * Default: 7
     */
    override fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

    /**
     * Indicates whether the DB instance is an internet-facing instance.
     *
     * If not specified,
     * the cluster's vpcSubnets will be used to determine if the instance is internet-facing
     * or not.
     *
     * Default: - `true` if the cluster's `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false`
     * otherwise
     */
    override fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()

    /**
     * Only applicable to reader instances.
     *
     * If this is true then the instance will be placed in promotion tier 1, otherwise
     * it will be placed in promotion tier 2.
     *
     * For serverless v2 instances this means:
     *
     * * true: The serverless v2 reader will scale to match the writer instance (provisioned or
     * serverless)
     * * false: The serverless v2 reader will scale with the read workfload on the instance
     *
     * Default: false
     */
    override fun scaleWithWriter(): Boolean? = unwrap(this).getScaleWithWriter()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessV2ClusterInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps):
        ServerlessV2ClusterInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerlessV2ClusterInstanceProps):
        software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps
  }
}
