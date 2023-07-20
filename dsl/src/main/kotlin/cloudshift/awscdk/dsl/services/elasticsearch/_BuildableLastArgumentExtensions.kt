@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import software.amazon.awscdk.services.elasticsearch.Domain
import software.amazon.awscdk.services.elasticsearch.IDomain

public inline fun IDomain.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun IDomain.metricAutomatedSnapshotFailure(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricAutomatedSnapshotFailure(builder.build())
}

public inline fun IDomain.metricClusterIndexWritesBlocked(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClusterIndexWritesBlocked(builder.build())
}

public inline fun IDomain.metricClusterStatusRed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClusterStatusRed(builder.build())
}

public inline fun IDomain.metricClusterStatusYellow(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClusterStatusYellow(builder.build())
}

public inline fun IDomain.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline fun IDomain.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeStorageSpace(builder.build())
}

public inline fun IDomain.metricIndexingLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIndexingLatency(builder.build())
}

public inline fun IDomain.metricJVMMemoryPressure(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricJVMMemoryPressure(builder.build())
}

public inline fun IDomain.metricKMSKeyError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricKMSKeyError(builder.build())
}

public inline fun IDomain.metricKMSKeyInaccessible(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricKMSKeyInaccessible(builder.build())
}

public inline fun IDomain.metricMasterCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMasterCPUUtilization(builder.build())
}

public inline fun IDomain.metricMasterJVMMemoryPressure(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMasterJVMMemoryPressure(builder.build())
}

public inline fun IDomain.metricNodes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNodes(builder.build())
}

public inline fun IDomain.metricSearchableDocuments(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSearchableDocuments(builder.build())
}

public inline fun IDomain.metricSearchLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSearchLatency(builder.build())
}

public inline fun Domain.addAccessPolicies(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addAccessPolicies(builder.build())
}

public inline fun Domain.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun Domain.metricAutomatedSnapshotFailure(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricAutomatedSnapshotFailure(builder.build())
}

public inline fun Domain.metricClusterIndexWritesBlocked(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClusterIndexWritesBlocked(builder.build())
}

public inline fun Domain.metricClusterStatusRed(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClusterStatusRed(builder.build())
}

public inline fun Domain.metricClusterStatusYellow(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClusterStatusYellow(builder.build())
}

public inline fun Domain.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline fun Domain.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeStorageSpace(builder.build())
}

public inline fun Domain.metricIndexingLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIndexingLatency(builder.build())
}

public inline fun Domain.metricJVMMemoryPressure(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricJVMMemoryPressure(builder.build())
}

public inline fun Domain.metricKMSKeyError(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricKMSKeyError(builder.build())
}

public inline fun Domain.metricKMSKeyInaccessible(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricKMSKeyInaccessible(builder.build())
}

public inline fun Domain.metricMasterCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMasterCPUUtilization(builder.build())
}

public inline fun Domain.metricMasterJVMMemoryPressure(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMasterJVMMemoryPressure(builder.build())
}

public inline fun Domain.metricNodes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNodes(builder.build())
}

public inline fun Domain.metricSearchableDocuments(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSearchableDocuments(builder.build())
}

public inline fun Domain.metricSearchLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSearchLatency(builder.build())
}

public inline
    fun CfnDomain.setAdvancedSecurityOptions(block: CfnDomainAdvancedSecurityOptionsInputPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainAdvancedSecurityOptionsInputPropertyDsl()
  builder.apply(block)
  return setAdvancedSecurityOptions(builder.build())
}

public inline fun CfnDomain.setCognitoOptions(block: CfnDomainCognitoOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDomainCognitoOptionsPropertyDsl()
  builder.apply(block)
  return setCognitoOptions(builder.build())
}

public inline
    fun CfnDomain.setDomainEndpointOptions(block: CfnDomainDomainEndpointOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainDomainEndpointOptionsPropertyDsl()
  builder.apply(block)
  return setDomainEndpointOptions(builder.build())
}

public inline fun CfnDomain.setEbsOptions(block: CfnDomainEBSOptionsPropertyDsl.() -> Unit = {}) {
  val builder = CfnDomainEBSOptionsPropertyDsl()
  builder.apply(block)
  return setEbsOptions(builder.build())
}

public inline
    fun CfnDomain.setElasticsearchClusterConfig(block: CfnDomainElasticsearchClusterConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainElasticsearchClusterConfigPropertyDsl()
  builder.apply(block)
  return setElasticsearchClusterConfig(builder.build())
}

public inline
    fun CfnDomain.setEncryptionAtRestOptions(block: CfnDomainEncryptionAtRestOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainEncryptionAtRestOptionsPropertyDsl()
  builder.apply(block)
  return setEncryptionAtRestOptions(builder.build())
}

public inline
    fun CfnDomain.setNodeToNodeEncryptionOptions(block: CfnDomainNodeToNodeEncryptionOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainNodeToNodeEncryptionOptionsPropertyDsl()
  builder.apply(block)
  return setNodeToNodeEncryptionOptions(builder.build())
}

public inline fun CfnDomain.setSnapshotOptions(block: CfnDomainSnapshotOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainSnapshotOptionsPropertyDsl()
  builder.apply(block)
  return setSnapshotOptions(builder.build())
}

public inline fun CfnDomain.setVpcOptions(block: CfnDomainVPCOptionsPropertyDsl.() -> Unit = {}) {
  val builder = CfnDomainVPCOptionsPropertyDsl()
  builder.apply(block)
  return setVpcOptions(builder.build())
}
