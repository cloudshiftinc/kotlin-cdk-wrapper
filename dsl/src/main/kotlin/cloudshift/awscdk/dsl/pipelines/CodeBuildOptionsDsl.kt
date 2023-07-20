@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.codebuild.BuildEnvironmentDsl
import cloudshift.awscdk.dsl.services.codebuild.LoggingOptionsDsl
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.pipelines.CodeBuildOptions
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildSpec
import software.amazon.awscdk.services.codebuild.Cache
import software.amazon.awscdk.services.codebuild.IFileSystemLocation
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.PolicyStatement

@CdkDslMarker
public class CodeBuildOptionsDsl {
  private val cdkBuilder: CodeBuildOptions.Builder = CodeBuildOptions.builder()

  private val _fileSystemLocations: MutableList<IFileSystemLocation> = mutableListOf()

  private val _rolePolicy: MutableList<PolicyStatement> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun buildEnvironment(block: BuildEnvironmentDsl.() -> Unit = {}) {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    cdkBuilder.buildEnvironment(builder.build())
  }

  public fun buildEnvironment(buildEnvironment: BuildEnvironment) {
    cdkBuilder.buildEnvironment(buildEnvironment)
  }

  public fun cache(cache: Cache) {
    cdkBuilder.cache(cache)
  }

  public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation) {
    _fileSystemLocations.addAll(listOf(*fileSystemLocations))
  }

  public fun fileSystemLocations(fileSystemLocations: Collection<IFileSystemLocation>) {
    _fileSystemLocations.addAll(fileSystemLocations)
  }

  public fun logging(block: LoggingOptionsDsl.() -> Unit = {}) {
    val builder = LoggingOptionsDsl()
    builder.apply(block)
    cdkBuilder.logging(builder.build())
  }

  public fun logging(logging: LoggingOptions) {
    cdkBuilder.logging(logging)
  }

  public fun partialBuildSpec(partialBuildSpec: BuildSpec) {
    cdkBuilder.partialBuildSpec(partialBuildSpec)
  }

  public fun rolePolicy(rolePolicy: PolicyStatementDsl.() -> Unit) {
    _rolePolicy.add(PolicyStatementDsl().apply(rolePolicy).build())
  }

  public fun rolePolicy(rolePolicy: Collection<PolicyStatement>) {
    _rolePolicy.addAll(rolePolicy)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.subnetSelection(builder.build())
  }

  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CodeBuildOptions {
    if(_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
    if(_rolePolicy.isNotEmpty()) cdkBuilder.rolePolicy(_rolePolicy)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
