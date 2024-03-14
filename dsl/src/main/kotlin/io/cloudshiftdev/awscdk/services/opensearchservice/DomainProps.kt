package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DomainProps {
  /**
   * Domain access policies.
   *
   * Default: - No access policies.
   */
  public fun accessPolicies(): List<PolicyStatement> =
      unwrap(this).getAccessPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * Additional options to specify for the Amazon OpenSearch Service domain.
   *
   * Default: - no advanced options are specified
   *
   * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
   */
  public fun advancedOptions(): Map<String, String> = unwrap(this).getAdvancedOptions() ?:
      emptyMap()

  /**
   * The hour in UTC during which the service takes an automated daily snapshot of the indices in
   * the Amazon OpenSearch Service domain.
   *
   * Only applies for Elasticsearch versions
   * below 5.3.
   *
   * Default: - Hourly automated snapshots not used
   */
  public fun automatedSnapshotStartHour(): Number? = unwrap(this).getAutomatedSnapshotStartHour()

  /**
   * The cluster capacity configuration for the Amazon OpenSearch Service domain.
   *
   * Default: - 1 r5.large.search data node; no dedicated master nodes.
   */
  public fun capacity(): CapacityConfig? = unwrap(this).getCapacity()?.let(CapacityConfig::wrap)

  /**
   * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
   * Dashboards.
   *
   * Default: - Cognito not used for authentication to OpenSearch Dashboards.
   */
  public fun cognitoDashboardsAuth(): CognitoOptions? =
      unwrap(this).getCognitoDashboardsAuth()?.let(CognitoOptions::wrap)

  /**
   * To configure a custom domain configure these options.
   *
   * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
   * the certificate
   *
   * Default: - no custom domain endpoint will be configured
   */
  public fun customEndpoint(): CustomEndpointOptions? =
      unwrap(this).getCustomEndpoint()?.let(CustomEndpointOptions::wrap)

  /**
   * Enforces a particular physical domain name.
   *
   * Default: - A name will be auto-generated.
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the Amazon OpenSearch Service domain.
   *
   * Default: - 10 GiB General Purpose (SSD) volumes per node.
   */
  public fun ebs(): EbsOptions? = unwrap(this).getEbs()?.let(EbsOptions::wrap)

  /**
   * Specifies whether automatic service software updates are enabled for the domain.
   *
   * Default: - false
   *
   * [Documentation](https://docs.aws.amazon.com/it_it/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html)
   */
  public fun enableAutoSoftwareUpdate(): Boolean? = unwrap(this).getEnableAutoSoftwareUpdate()

  /**
   * To upgrade an Amazon OpenSearch Service domain to a new version, rather than replacing the
   * entire domain resource, use the EnableVersionUpgrade update policy.
   *
   * Default: - false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
   */
  public fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

  /**
   * Encryption at rest options for the cluster.
   *
   * Default: - No encryption at rest
   */
  public fun encryptionAtRest(): EncryptionAtRestOptions? =
      unwrap(this).getEncryptionAtRest()?.let(EncryptionAtRestOptions::wrap)

  /**
   * True to require that all traffic to the domain arrive over HTTPS.
   *
   * Default: - false
   */
  public fun enforceHttps(): Boolean? = unwrap(this).getEnforceHttps()

  /**
   * Specifies options for fine-grained access control.
   *
   * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
   * fine-grained access control
   * also requires encryption of data at rest and node-to-node encryption, along with
   * enforced HTTPS.
   *
   * Default: - fine-grained access control is disabled
   */
  public fun fineGrainedAccessControl(): AdvancedSecurityOptions? =
      unwrap(this).getFineGrainedAccessControl()?.let(AdvancedSecurityOptions::wrap)

  /**
   * Specify either dual stack or IPv4 as your IP address type.
   *
   * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is the
   * recommended option.
   *
   * If you set your IP address type to dual stack, you can't change your address type later.
   *
   * Default: - IpAddressType.IPV4
   */
  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * Configuration log publishing configuration options.
   *
   * Default: - No logs are published
   */
  public fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  /**
   * Specify true to enable node to node encryption.
   *
   * Requires Elasticsearch version 6.0 or later or OpenSearch version 1.0 or later.
   *
   * Default: - Node to node encryption is not enabled.
   */
  public fun nodeToNodeEncryption(): Boolean? = unwrap(this).getNodeToNodeEncryption()

  /**
   * Options for enabling a domain's off-peak window, during which OpenSearch Service can perform
   * mandatory configuration changes on the domain.
   *
   * Off-peak windows were introduced on February 16, 2023.
   * All domains created before this date have the off-peak window disabled by default.
   * You must manually enable and configure the off-peak window for these domains.
   * All domains created after this date will have the off-peak window enabled by default.
   * You can't disable the off-peak window for a domain after it's enabled.
   *
   * Default: - Disabled for domains created before February 16, 2023. Enabled for domains created
   * after. Enabled if `offPeakWindowStart` is set.
   *
   * [Documentation](https://docs.aws.amazon.com/it_it/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindow.html)
   */
  public fun offPeakWindowEnabled(): Boolean? = unwrap(this).getOffPeakWindowEnabled()

  /**
   * Start time for the off-peak window, in Coordinated Universal Time (UTC).
   *
   * The window length will always be 10 hours, so you can't specify an end time.
   * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically be
   * set to 9:00 A.M.
   *
   * Default: - 10:00 P.M. local time
   */
  public fun offPeakWindowStart(): WindowStartTime? =
      unwrap(this).getOffPeakWindowStart()?.let(WindowStartTime::wrap)

  /**
   * Policy to apply when the domain is removed from the stack.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The list of security groups that are associated with the VPC endpoints for the domain.
   *
   * Only used if `vpc` is specified.
   *
   * Default: - One new security group is created.
   *
   * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Specify whether to create a CloudWatch Logs resource policy or not.
   *
   * When logging is enabled for the domain, a CloudWatch Logs resource policy is created by
   * default.
   * However, CloudWatch Logs supports only 10 resource policies per region.
   * If you enable logging for several domains, it may hit the quota and cause an error.
   * By setting this property to true, creating a resource policy is suppressed, allowing you to
   * avoid this problem.
   *
   * If you set this option to true, you must create a resource policy before deployment.
   *
   * Default: - false
   *
   * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html)
   */
  public fun suppressLogsResourcePolicy(): Boolean? = unwrap(this).getSuppressLogsResourcePolicy()

  /**
   * The minimum TLS version required for traffic to the domain.
   *
   * Default: - TLSSecurityPolicy.TLS_1_0
   */
  public fun tlsSecurityPolicy(): TLSSecurityPolicy? =
      unwrap(this).getTlsSecurityPolicy()?.let(TLSSecurityPolicy::wrap)

  /**
   * Configures the domain so that unsigned basic auth is enabled.
   *
   * If no master user is provided a default master user
   * with username `admin` and a dynamically generated password stored in KMS is created. The
   * password can be retrieved
   * by getting `masterUserPassword` from the domain instance.
   *
   * Setting this to true will also add an access policy that allows unsigned
   * access, enable node to node encryption, encryption at rest. If conflicting
   * settings are encountered (like disabling encryption at rest) enabling this
   * setting will cause a failure.
   *
   * Default: - false
   */
  public fun useUnsignedBasicAuth(): Boolean? = unwrap(this).getUseUnsignedBasicAuth()

  /**
   * The Elasticsearch/OpenSearch version that your domain will leverage.
   */
  public fun version(): EngineVersion

  /**
   * Place the domain inside this VPC.
   *
   * Default: - Domain is not placed in a VPC.
   *
   * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * The specific vpc subnets the domain will be placed in.
   *
   * You must provide one subnet for each Availability Zone
   * that your domain uses. For example, you must specify three subnet IDs for a three Availability
   * Zone
   * domain.
   *
   * Only used if `vpc` is specified.
   *
   * Default: - All private subnets.
   *
   * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html)
   */
  public fun vpcSubnets(): List<SubnetSelection> =
      unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

  /**
   * The cluster zone awareness configuration for the Amazon OpenSearch Service domain.
   *
   * Default: - no zone awareness (1 AZ)
   */
  public fun zoneAwareness(): ZoneAwarenessConfig? =
      unwrap(this).getZoneAwareness()?.let(ZoneAwarenessConfig::wrap)

  /**
   * A builder for [DomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPolicies Domain access policies.
     */
    public fun accessPolicies(accessPolicies: List<PolicyStatement>)

    /**
     * @param accessPolicies Domain access policies.
     */
    public fun accessPolicies(vararg accessPolicies: PolicyStatement)

    /**
     * @param advancedOptions Additional options to specify for the Amazon OpenSearch Service
     * domain.
     */
    public fun advancedOptions(advancedOptions: Map<String, String>)

    /**
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     * daily snapshot of the indices in the Amazon OpenSearch Service domain.
     * Only applies for Elasticsearch versions
     * below 5.3.
     */
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)

    /**
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain.
     */
    public fun capacity(capacity: CapacityConfig)

    /**
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d17b221e87d243df16c7252c6ebb457f876efd1c16e0fc27b4390f1c30df304b")
    public fun capacity(capacity: CapacityConfig.Builder.() -> Unit)

    /**
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     * authentication for OpenSearch Dashboards.
     */
    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions)

    /**
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     * authentication for OpenSearch Dashboards.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7b0909f0598e484969e326b739d47118b07ab6ec85c8226ca4af46f560057a7")
    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions.Builder.() -> Unit)

    /**
     * @param customEndpoint To configure a custom domain configure these options.
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     */
    public fun customEndpoint(customEndpoint: CustomEndpointOptions)

    /**
     * @param customEndpoint To configure a custom domain configure these options.
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdf5b2d75b35bcdddb04ffe29da4de4c9e4bf733b565a995741a0537ac14a7b9")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit)

    /**
     * @param domainName Enforces a particular physical domain name.
     */
    public fun domainName(domainName: String)

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon OpenSearch Service domain.
     */
    public fun ebs(ebs: EbsOptions)

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon OpenSearch Service domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9001bb79f0578857cecc95ce96cf807ea71335c7e4d4e8c72e2c6221420d13b0")
    public fun ebs(ebs: EbsOptions.Builder.() -> Unit)

    /**
     * @param enableAutoSoftwareUpdate Specifies whether automatic service software updates are
     * enabled for the domain.
     */
    public fun enableAutoSoftwareUpdate(enableAutoSoftwareUpdate: Boolean)

    /**
     * @param enableVersionUpgrade To upgrade an Amazon OpenSearch Service domain to a new version,
     * rather than replacing the entire domain resource, use the EnableVersionUpgrade update policy.
     */
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     */
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions)

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed3218d8f8662ab49b5919a4e80ec6ccb6b765caa314fdef579be7c881f5c5c9")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit)

    /**
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
     */
    public fun enforceHttps(enforceHttps: Boolean)

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     */
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions)

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0451d562325cd4aabdf0096513de3e8ffcba6027563de5d5fb19f0f1190359f5")
    public
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit)

    /**
     * @param ipAddressType Specify either dual stack or IPv4 as your IP address type.
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option.
     *
     * If you set your IP address type to dual stack, you can't change your address type later.
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * @param logging Configuration log publishing configuration options.
     */
    public fun logging(logging: LoggingOptions)

    /**
     * @param logging Configuration log publishing configuration options.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18c4305abd171c7ac1ab935481ae51bb0128240a90888efbfc49e28faef3f3d7")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    /**
     * @param nodeToNodeEncryption Specify true to enable node to node encryption.
     * Requires Elasticsearch version 6.0 or later or OpenSearch version 1.0 or later.
     */
    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean)

    /**
     * @param offPeakWindowEnabled Options for enabling a domain's off-peak window, during which
     * OpenSearch Service can perform mandatory configuration changes on the domain.
     * Off-peak windows were introduced on February 16, 2023.
     * All domains created before this date have the off-peak window disabled by default.
     * You must manually enable and configure the off-peak window for these domains.
     * All domains created after this date will have the off-peak window enabled by default.
     * You can't disable the off-peak window for a domain after it's enabled.
     */
    public fun offPeakWindowEnabled(offPeakWindowEnabled: Boolean)

    /**
     * @param offPeakWindowStart Start time for the off-peak window, in Coordinated Universal Time
     * (UTC).
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     */
    public fun offPeakWindowStart(offPeakWindowStart: WindowStartTime)

    /**
     * @param offPeakWindowStart Start time for the off-peak window, in Coordinated Universal Time
     * (UTC).
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a7241b81db94838055df7bc3fb613e6fbbe54d245153be4d536750027c8d210")
    public fun offPeakWindowStart(offPeakWindowStart: WindowStartTime.Builder.() -> Unit)

    /**
     * @param removalPolicy Policy to apply when the domain is removed from the stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain.
     * Only used if `vpc` is specified.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain.
     * Only used if `vpc` is specified.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param suppressLogsResourcePolicy Specify whether to create a CloudWatch Logs resource policy
     * or not.
     * When logging is enabled for the domain, a CloudWatch Logs resource policy is created by
     * default.
     * However, CloudWatch Logs supports only 10 resource policies per region.
     * If you enable logging for several domains, it may hit the quota and cause an error.
     * By setting this property to true, creating a resource policy is suppressed, allowing you to
     * avoid this problem.
     *
     * If you set this option to true, you must create a resource policy before deployment.
     */
    public fun suppressLogsResourcePolicy(suppressLogsResourcePolicy: Boolean)

    /**
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain.
     */
    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy)

    /**
     * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled.
     * If no master user is provided a default master user
     * with username `admin` and a dynamically generated password stored in KMS is created. The
     * password can be retrieved
     * by getting `masterUserPassword` from the domain instance.
     *
     * Setting this to true will also add an access policy that allows unsigned
     * access, enable node to node encryption, encryption at rest. If conflicting
     * settings are encountered (like disabling encryption at rest) enabling this
     * setting will cause a failure.
     */
    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean)

    /**
     * @param version The Elasticsearch/OpenSearch version that your domain will leverage. 
     */
    public fun version(version: EngineVersion)

    /**
     * @param vpc Place the domain inside this VPC.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     */
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     */
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     * Service domain.
     */
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig)

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     * Service domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405ef68e0f28476fbc594af980692b73b8b213552bcce55e1e8ac5a96a025481")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.DomainProps.Builder =
        software.amazon.awscdk.services.opensearchservice.DomainProps.builder()

    /**
     * @param accessPolicies Domain access policies.
     */
    override fun accessPolicies(accessPolicies: List<PolicyStatement>) {
      cdkBuilder.accessPolicies(accessPolicies.map(PolicyStatement::unwrap))
    }

    /**
     * @param accessPolicies Domain access policies.
     */
    override fun accessPolicies(vararg accessPolicies: PolicyStatement): Unit =
        accessPolicies(accessPolicies.toList())

    /**
     * @param advancedOptions Additional options to specify for the Amazon OpenSearch Service
     * domain.
     */
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     * daily snapshot of the indices in the Amazon OpenSearch Service domain.
     * Only applies for Elasticsearch versions
     * below 5.3.
     */
    override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
      cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    /**
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain.
     */
    override fun capacity(capacity: CapacityConfig) {
      cdkBuilder.capacity(capacity.let(CapacityConfig::unwrap))
    }

    /**
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d17b221e87d243df16c7252c6ebb457f876efd1c16e0fc27b4390f1c30df304b")
    override fun capacity(capacity: CapacityConfig.Builder.() -> Unit): Unit =
        capacity(CapacityConfig(capacity))

    /**
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     * authentication for OpenSearch Dashboards.
     */
    override fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions) {
      cdkBuilder.cognitoDashboardsAuth(cognitoDashboardsAuth.let(CognitoOptions::unwrap))
    }

    /**
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     * authentication for OpenSearch Dashboards.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7b0909f0598e484969e326b739d47118b07ab6ec85c8226ca4af46f560057a7")
    override fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions.Builder.() -> Unit):
        Unit = cognitoDashboardsAuth(CognitoOptions(cognitoDashboardsAuth))

    /**
     * @param customEndpoint To configure a custom domain configure these options.
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     */
    override fun customEndpoint(customEndpoint: CustomEndpointOptions) {
      cdkBuilder.customEndpoint(customEndpoint.let(CustomEndpointOptions::unwrap))
    }

    /**
     * @param customEndpoint To configure a custom domain configure these options.
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdf5b2d75b35bcdddb04ffe29da4de4c9e4bf733b565a995741a0537ac14a7b9")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit): Unit =
        customEndpoint(CustomEndpointOptions(customEndpoint))

    /**
     * @param domainName Enforces a particular physical domain name.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon OpenSearch Service domain.
     */
    override fun ebs(ebs: EbsOptions) {
      cdkBuilder.ebs(ebs.let(EbsOptions::unwrap))
    }

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon OpenSearch Service domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9001bb79f0578857cecc95ce96cf807ea71335c7e4d4e8c72e2c6221420d13b0")
    override fun ebs(ebs: EbsOptions.Builder.() -> Unit): Unit = ebs(EbsOptions(ebs))

    /**
     * @param enableAutoSoftwareUpdate Specifies whether automatic service software updates are
     * enabled for the domain.
     */
    override fun enableAutoSoftwareUpdate(enableAutoSoftwareUpdate: Boolean) {
      cdkBuilder.enableAutoSoftwareUpdate(enableAutoSoftwareUpdate)
    }

    /**
     * @param enableVersionUpgrade To upgrade an Amazon OpenSearch Service domain to a new version,
     * rather than replacing the entire domain resource, use the EnableVersionUpgrade update policy.
     */
    override fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
      cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     */
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
      cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestOptions::unwrap))
    }

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed3218d8f8662ab49b5919a4e80ec6ccb6b765caa314fdef579be7c881f5c5c9")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit):
        Unit = encryptionAtRest(EncryptionAtRestOptions(encryptionAtRest))

    /**
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
     */
    override fun enforceHttps(enforceHttps: Boolean) {
      cdkBuilder.enforceHttps(enforceHttps)
    }

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     */
    override fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
      cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl.let(AdvancedSecurityOptions::unwrap))
    }

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0451d562325cd4aabdf0096513de3e8ffcba6027563de5d5fb19f0f1190359f5")
    override
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit):
        Unit = fineGrainedAccessControl(AdvancedSecurityOptions(fineGrainedAccessControl))

    /**
     * @param ipAddressType Specify either dual stack or IPv4 as your IP address type.
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option.
     *
     * If you set your IP address type to dual stack, you can't change your address type later.
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    /**
     * @param logging Configuration log publishing configuration options.
     */
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    /**
     * @param logging Configuration log publishing configuration options.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18c4305abd171c7ac1ab935481ae51bb0128240a90888efbfc49e28faef3f3d7")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    /**
     * @param nodeToNodeEncryption Specify true to enable node to node encryption.
     * Requires Elasticsearch version 6.0 or later or OpenSearch version 1.0 or later.
     */
    override fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
      cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
    }

    /**
     * @param offPeakWindowEnabled Options for enabling a domain's off-peak window, during which
     * OpenSearch Service can perform mandatory configuration changes on the domain.
     * Off-peak windows were introduced on February 16, 2023.
     * All domains created before this date have the off-peak window disabled by default.
     * You must manually enable and configure the off-peak window for these domains.
     * All domains created after this date will have the off-peak window enabled by default.
     * You can't disable the off-peak window for a domain after it's enabled.
     */
    override fun offPeakWindowEnabled(offPeakWindowEnabled: Boolean) {
      cdkBuilder.offPeakWindowEnabled(offPeakWindowEnabled)
    }

    /**
     * @param offPeakWindowStart Start time for the off-peak window, in Coordinated Universal Time
     * (UTC).
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     */
    override fun offPeakWindowStart(offPeakWindowStart: WindowStartTime) {
      cdkBuilder.offPeakWindowStart(offPeakWindowStart.let(WindowStartTime::unwrap))
    }

    /**
     * @param offPeakWindowStart Start time for the off-peak window, in Coordinated Universal Time
     * (UTC).
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a7241b81db94838055df7bc3fb613e6fbbe54d245153be4d536750027c8d210")
    override fun offPeakWindowStart(offPeakWindowStart: WindowStartTime.Builder.() -> Unit): Unit =
        offPeakWindowStart(WindowStartTime(offPeakWindowStart))

    /**
     * @param removalPolicy Policy to apply when the domain is removed from the stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain.
     * Only used if `vpc` is specified.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain.
     * Only used if `vpc` is specified.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param suppressLogsResourcePolicy Specify whether to create a CloudWatch Logs resource policy
     * or not.
     * When logging is enabled for the domain, a CloudWatch Logs resource policy is created by
     * default.
     * However, CloudWatch Logs supports only 10 resource policies per region.
     * If you enable logging for several domains, it may hit the quota and cause an error.
     * By setting this property to true, creating a resource policy is suppressed, allowing you to
     * avoid this problem.
     *
     * If you set this option to true, you must create a resource policy before deployment.
     */
    override fun suppressLogsResourcePolicy(suppressLogsResourcePolicy: Boolean) {
      cdkBuilder.suppressLogsResourcePolicy(suppressLogsResourcePolicy)
    }

    /**
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain.
     */
    override fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
      cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy.let(TLSSecurityPolicy::unwrap))
    }

    /**
     * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled.
     * If no master user is provided a default master user
     * with username `admin` and a dynamically generated password stored in KMS is created. The
     * password can be retrieved
     * by getting `masterUserPassword` from the domain instance.
     *
     * Setting this to true will also add an access policy that allows unsigned
     * access, enable node to node encryption, encryption at rest. If conflicting
     * settings are encountered (like disabling encryption at rest) enabling this
     * setting will cause a failure.
     */
    override fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
      cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    /**
     * @param version The Elasticsearch/OpenSearch version that your domain will leverage. 
     */
    override fun version(version: EngineVersion) {
      cdkBuilder.version(version.let(EngineVersion::unwrap))
    }

    /**
     * @param vpc Place the domain inside this VPC.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     */
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     */
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     * Service domain.
     */
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
      cdkBuilder.zoneAwareness(zoneAwareness.let(ZoneAwarenessConfig::unwrap))
    }

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     * Service domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405ef68e0f28476fbc594af980692b73b8b213552bcce55e1e8ac5a96a025481")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit): Unit =
        zoneAwareness(ZoneAwarenessConfig(zoneAwareness))

    public fun build(): software.amazon.awscdk.services.opensearchservice.DomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.DomainProps,
  ) : CdkObject(cdkObject), DomainProps {
    /**
     * Domain access policies.
     *
     * Default: - No access policies.
     */
    override fun accessPolicies(): List<PolicyStatement> =
        unwrap(this).getAccessPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * Additional options to specify for the Amazon OpenSearch Service domain.
     *
     * Default: - no advanced options are specified
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     */
    override fun advancedOptions(): Map<String, String> = unwrap(this).getAdvancedOptions() ?:
        emptyMap()

    /**
     * The hour in UTC during which the service takes an automated daily snapshot of the indices in
     * the Amazon OpenSearch Service domain.
     *
     * Only applies for Elasticsearch versions
     * below 5.3.
     *
     * Default: - Hourly automated snapshots not used
     */
    override fun automatedSnapshotStartHour(): Number? =
        unwrap(this).getAutomatedSnapshotStartHour()

    /**
     * The cluster capacity configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - 1 r5.large.search data node; no dedicated master nodes.
     */
    override fun capacity(): CapacityConfig? = unwrap(this).getCapacity()?.let(CapacityConfig::wrap)

    /**
     * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
     * Dashboards.
     *
     * Default: - Cognito not used for authentication to OpenSearch Dashboards.
     */
    override fun cognitoDashboardsAuth(): CognitoOptions? =
        unwrap(this).getCognitoDashboardsAuth()?.let(CognitoOptions::wrap)

    /**
     * To configure a custom domain configure these options.
     *
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     *
     * Default: - no custom domain endpoint will be configured
     */
    override fun customEndpoint(): CustomEndpointOptions? =
        unwrap(this).getCustomEndpoint()?.let(CustomEndpointOptions::wrap)

    /**
     * Enforces a particular physical domain name.
     *
     * Default: - A name will be auto-generated.
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the Amazon OpenSearch Service domain.
     *
     * Default: - 10 GiB General Purpose (SSD) volumes per node.
     */
    override fun ebs(): EbsOptions? = unwrap(this).getEbs()?.let(EbsOptions::wrap)

    /**
     * Specifies whether automatic service software updates are enabled for the domain.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/it_it/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html)
     */
    override fun enableAutoSoftwareUpdate(): Boolean? = unwrap(this).getEnableAutoSoftwareUpdate()

    /**
     * To upgrade an Amazon OpenSearch Service domain to a new version, rather than replacing the
     * entire domain resource, use the EnableVersionUpgrade update policy.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     */
    override fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

    /**
     * Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     */
    override fun encryptionAtRest(): EncryptionAtRestOptions? =
        unwrap(this).getEncryptionAtRest()?.let(EncryptionAtRestOptions::wrap)

    /**
     * True to require that all traffic to the domain arrive over HTTPS.
     *
     * Default: - false
     */
    override fun enforceHttps(): Boolean? = unwrap(this).getEnforceHttps()

    /**
     * Specifies options for fine-grained access control.
     *
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     *
     * Default: - fine-grained access control is disabled
     */
    override fun fineGrainedAccessControl(): AdvancedSecurityOptions? =
        unwrap(this).getFineGrainedAccessControl()?.let(AdvancedSecurityOptions::wrap)

    /**
     * Specify either dual stack or IPv4 as your IP address type.
     *
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option.
     *
     * If you set your IP address type to dual stack, you can't change your address type later.
     *
     * Default: - IpAddressType.IPV4
     */
    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    /**
     * Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     */
    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    /**
     * Specify true to enable node to node encryption.
     *
     * Requires Elasticsearch version 6.0 or later or OpenSearch version 1.0 or later.
     *
     * Default: - Node to node encryption is not enabled.
     */
    override fun nodeToNodeEncryption(): Boolean? = unwrap(this).getNodeToNodeEncryption()

    /**
     * Options for enabling a domain's off-peak window, during which OpenSearch Service can perform
     * mandatory configuration changes on the domain.
     *
     * Off-peak windows were introduced on February 16, 2023.
     * All domains created before this date have the off-peak window disabled by default.
     * You must manually enable and configure the off-peak window for these domains.
     * All domains created after this date will have the off-peak window enabled by default.
     * You can't disable the off-peak window for a domain after it's enabled.
     *
     * Default: - Disabled for domains created before February 16, 2023. Enabled for domains created
     * after. Enabled if `offPeakWindowStart` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/it_it/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindow.html)
     */
    override fun offPeakWindowEnabled(): Boolean? = unwrap(this).getOffPeakWindowEnabled()

    /**
     * Start time for the off-peak window, in Coordinated Universal Time (UTC).
     *
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     *
     * Default: - 10:00 P.M. local time
     */
    override fun offPeakWindowStart(): WindowStartTime? =
        unwrap(this).getOffPeakWindowStart()?.let(WindowStartTime::wrap)

    /**
     * Policy to apply when the domain is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The list of security groups that are associated with the VPC endpoints for the domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - One new security group is created.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Specify whether to create a CloudWatch Logs resource policy or not.
     *
     * When logging is enabled for the domain, a CloudWatch Logs resource policy is created by
     * default.
     * However, CloudWatch Logs supports only 10 resource policies per region.
     * If you enable logging for several domains, it may hit the quota and cause an error.
     * By setting this property to true, creating a resource policy is suppressed, allowing you to
     * avoid this problem.
     *
     * If you set this option to true, you must create a resource policy before deployment.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html)
     */
    override fun suppressLogsResourcePolicy(): Boolean? =
        unwrap(this).getSuppressLogsResourcePolicy()

    /**
     * The minimum TLS version required for traffic to the domain.
     *
     * Default: - TLSSecurityPolicy.TLS_1_0
     */
    override fun tlsSecurityPolicy(): TLSSecurityPolicy? =
        unwrap(this).getTlsSecurityPolicy()?.let(TLSSecurityPolicy::wrap)

    /**
     * Configures the domain so that unsigned basic auth is enabled.
     *
     * If no master user is provided a default master user
     * with username `admin` and a dynamically generated password stored in KMS is created. The
     * password can be retrieved
     * by getting `masterUserPassword` from the domain instance.
     *
     * Setting this to true will also add an access policy that allows unsigned
     * access, enable node to node encryption, encryption at rest. If conflicting
     * settings are encountered (like disabling encryption at rest) enabling this
     * setting will cause a failure.
     *
     * Default: - false
     */
    override fun useUnsignedBasicAuth(): Boolean? = unwrap(this).getUseUnsignedBasicAuth()

    /**
     * The Elasticsearch/OpenSearch version that your domain will leverage.
     */
    override fun version(): EngineVersion = unwrap(this).getVersion().let(EngineVersion::wrap)

    /**
     * Place the domain inside this VPC.
     *
     * Default: - Domain is not placed in a VPC.
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * The specific vpc subnets the domain will be placed in.
     *
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - All private subnets.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html)
     */
    override fun vpcSubnets(): List<SubnetSelection> =
        unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

    /**
     * The cluster zone awareness configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - no zone awareness (1 AZ)
     */
    override fun zoneAwareness(): ZoneAwarenessConfig? =
        unwrap(this).getZoneAwareness()?.let(ZoneAwarenessConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.DomainProps):
        DomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainProps):
        software.amazon.awscdk.services.opensearchservice.DomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.DomainProps
  }
}
