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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import software.amazon.awscdk.services.opensearchservice.Domain
import software.amazon.awscdk.services.opensearchservice.IDomain

/**
 * Return the given named metric for this domain.
 *
 * @param metricName
 * @param props
 */
public inline fun IDomain.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * Metric for automated snapshot failures.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricAutomatedSnapshotFailure(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricAutomatedSnapshotFailure(builder.build())
}

/**
 * Metric for the cluster blocking index writes.
 *
 * Default: maximum over 1 minute
 *
 * @param props
 */
public inline fun IDomain.metricClusterIndexWritesBlocked(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClusterIndexWritesBlocked(builder.build())
}

/**
 * Metric for the time the cluster status is red.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricClusterStatusRed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClusterStatusRed(builder.build())
}

/**
 * Metric for the time the cluster status is yellow.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricClusterStatusYellow(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClusterStatusYellow(builder.build())
}

/**
 * Metric for CPU utilization.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCPUUtilization(builder.build())
}

/**
 * Metric for the storage space of nodes in the cluster.
 *
 * Default: minimum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeStorageSpace(builder.build())
}

/**
 * Metric for indexing latency.
 *
 * Default: p99 over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricIndexingLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIndexingLatency(builder.build())
}

/**
 * Metric for JVM memory pressure.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricJVMMemoryPressure(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricJVMMemoryPressure(builder.build())
}

/**
 * Metric for KMS key errors.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricKMSKeyError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricKMSKeyError(builder.build())
}

/**
 * Metric for KMS key being inaccessible.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricKMSKeyInaccessible(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricKMSKeyInaccessible(builder.build())
}

/**
 * Metric for master CPU utilization.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricMasterCPUUtilization(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricMasterCPUUtilization(builder.build())
}

/**
 * Metric for master JVM memory pressure.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricMasterJVMMemoryPressure(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricMasterJVMMemoryPressure(builder.build())
}

/**
 * Metric for the number of nodes.
 *
 * Default: minimum over 1 hour
 *
 * @param props
 */
public inline fun IDomain.metricNodes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNodes(builder.build())
}

/**
 * Metric for number of searchable documents.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricSearchableDocuments(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSearchableDocuments(builder.build())
}

/**
 * Metric for search latency.
 *
 * Default: p99 over 5 minutes
 *
 * @param props
 */
public inline fun IDomain.metricSearchLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSearchLatency(builder.build())
}

/**
 * Add policy statements to the domain access policy.
 *
 * @param accessPolicyStatements
 */
public inline fun Domain.addAccessPolicies(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addAccessPolicies(builder.build())
}

/**
 * Return the given named metric for this domain.
 *
 * @param metricName
 * @param props
 */
public inline fun Domain.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for automated snapshot failures.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricAutomatedSnapshotFailure(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricAutomatedSnapshotFailure(builder.build())
}

/**
 * Metric for the cluster blocking index writes.
 *
 * Default: maximum over 1 minute
 *
 * @param props
 */
public inline fun Domain.metricClusterIndexWritesBlocked(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClusterIndexWritesBlocked(builder.build())
}

/**
 * Metric for the time the cluster status is red.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricClusterStatusRed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClusterStatusRed(builder.build())
}

/**
 * Metric for the time the cluster status is yellow.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricClusterStatusYellow(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClusterStatusYellow(builder.build())
}

/**
 * Metric for CPU utilization.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCPUUtilization(builder.build())
}

/**
 * Metric for the storage space of nodes in the cluster.
 *
 * Default: minimum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFreeStorageSpace(builder.build())
}

/**
 * Metric for indexing latency.
 *
 * Default: p99 over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricIndexingLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIndexingLatency(builder.build())
}

/**
 * Metric for JVM memory pressure.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricJVMMemoryPressure(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricJVMMemoryPressure(builder.build())
}

/**
 * Metric for KMS key errors.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricKMSKeyError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricKMSKeyError(builder.build())
}

/**
 * Metric for KMS key being inaccessible.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricKMSKeyInaccessible(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricKMSKeyInaccessible(builder.build())
}

/**
 * Metric for master CPU utilization.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricMasterCPUUtilization(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricMasterCPUUtilization(builder.build())
}

/**
 * Metric for master JVM memory pressure.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricMasterJVMMemoryPressure(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricMasterJVMMemoryPressure(builder.build())
}

/**
 * Metric for the number of nodes.
 *
 * Default: minimum over 1 hour
 *
 * @param props
 */
public inline fun Domain.metricNodes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNodes(builder.build())
}

/**
 * Metric for number of searchable documents.
 *
 * Default: maximum over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricSearchableDocuments(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSearchableDocuments(builder.build())
}

/**
 * Metric for search latency.
 *
 * Default: p99 over 5 minutes
 *
 * @param props
 */
public inline fun Domain.metricSearchLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSearchLatency(builder.build())
}

/** Specifies options for fine-grained access control and SAML authentication. */
public inline fun CfnDomain.setAdvancedSecurityOptions(
    block: CfnDomainAdvancedSecurityOptionsInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainAdvancedSecurityOptionsInputPropertyDsl()
    builder.apply(block)
    return setAdvancedSecurityOptions(builder.build())
}

/** Container for the cluster configuration of a domain. */
public inline fun CfnDomain.setClusterConfig(
    block: CfnDomainClusterConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainClusterConfigPropertyDsl()
    builder.apply(block)
    return setClusterConfig(builder.build())
}

/** Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards. */
public inline fun CfnDomain.setCognitoOptions(
    block: CfnDomainCognitoOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainCognitoOptionsPropertyDsl()
    builder.apply(block)
    return setCognitoOptions(builder.build())
}

/**
 * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
 * traffic or whether to use a custom endpoint rather than the default endpoint.
 */
public inline fun CfnDomain.setDomainEndpointOptions(
    block: CfnDomainDomainEndpointOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainDomainEndpointOptionsPropertyDsl()
    builder.apply(block)
    return setDomainEndpointOptions(builder.build())
}

/**
 * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
 * nodes in the OpenSearch Service domain.
 */
public inline fun CfnDomain.setEbsOptions(block: CfnDomainEBSOptionsPropertyDsl.() -> Unit = {}) {
    val builder = CfnDomainEBSOptionsPropertyDsl()
    builder.apply(block)
    return setEbsOptions(builder.build())
}

/** Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use. */
public inline fun CfnDomain.setEncryptionAtRestOptions(
    block: CfnDomainEncryptionAtRestOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainEncryptionAtRestOptionsPropertyDsl()
    builder.apply(block)
    return setEncryptionAtRestOptions(builder.build())
}

/** Specifies whether node-to-node encryption is enabled. */
public inline fun CfnDomain.setNodeToNodeEncryptionOptions(
    block: CfnDomainNodeToNodeEncryptionOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainNodeToNodeEncryptionOptionsPropertyDsl()
    builder.apply(block)
    return setNodeToNodeEncryptionOptions(builder.build())
}

/**
 * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
 * configuration changes on the domain.
 */
public inline fun CfnDomain.setOffPeakWindowOptions(
    block: CfnDomainOffPeakWindowOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainOffPeakWindowOptionsPropertyDsl()
    builder.apply(block)
    return setOffPeakWindowOptions(builder.build())
}

/** *DEPRECATED* . */
public inline fun CfnDomain.setSnapshotOptions(
    block: CfnDomainSnapshotOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainSnapshotOptionsPropertyDsl()
    builder.apply(block)
    return setSnapshotOptions(builder.build())
}

/** Options for configuring service software updates for a domain. */
public inline fun CfnDomain.setSoftwareUpdateOptions(
    block: CfnDomainSoftwareUpdateOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainSoftwareUpdateOptionsPropertyDsl()
    builder.apply(block)
    return setSoftwareUpdateOptions(builder.build())
}

/** The virtual private cloud (VPC) configuration for the OpenSearch Service domain. */
public inline fun CfnDomain.setVpcOptions(block: CfnDomainVPCOptionsPropertyDsl.() -> Unit = {}) {
    val builder = CfnDomainVPCOptionsPropertyDsl()
    builder.apply(block)
    return setVpcOptions(builder.build())
}
