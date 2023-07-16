@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.ConnectionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.lambda.FileSystemConfig
import software.constructs.IDependable

@CdkDslMarker
public class FileSystemConfigDsl {
  private val cdkBuilder: FileSystemConfig.Builder = FileSystemConfig.builder()

  private val _dependency: MutableList<IDependable> = mutableListOf()

  private val _policies: MutableList<PolicyStatement> = mutableListOf()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun connections(block: ConnectionsDsl.() -> Unit = {}) {
    val builder = ConnectionsDsl()
    builder.apply(block)
    cdkBuilder.connections(builder.build())
  }

  public fun connections(connections: Connections) {
    cdkBuilder.connections(connections)
  }

  public fun dependency(vararg dependency: IDependable) {
    _dependency.addAll(listOf(*dependency))
  }

  public fun dependency(dependency: Collection<IDependable>) {
    _dependency.addAll(dependency)
  }

  public fun localMountPath(localMountPath: String) {
    cdkBuilder.localMountPath(localMountPath)
  }

  public fun policies(policies: PolicyStatementDsl.() -> Unit) {
    _policies.add(PolicyStatementDsl().apply(policies).build())
  }

  public fun policies(policies: Collection<PolicyStatement>) {
    _policies.addAll(policies)
  }

  public fun build(): FileSystemConfig {
    if(_dependency.isNotEmpty()) cdkBuilder.dependency(_dependency)
    if(_policies.isNotEmpty()) cdkBuilder.policies(_policies)
    return cdkBuilder.build()
  }
}
