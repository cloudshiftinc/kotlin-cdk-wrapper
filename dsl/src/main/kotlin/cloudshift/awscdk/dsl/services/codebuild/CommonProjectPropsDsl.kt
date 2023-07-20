@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.BuildSpec
import software.amazon.awscdk.services.codebuild.Cache
import software.amazon.awscdk.services.codebuild.CommonProjectProps
import software.amazon.awscdk.services.codebuild.IFileSystemLocation
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class CommonProjectPropsDsl {
  private val cdkBuilder: CommonProjectProps.Builder = CommonProjectProps.builder()

  private val _fileSystemLocations: MutableList<IFileSystemLocation> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  public fun badge(badge: Boolean) {
    cdkBuilder.badge(badge)
  }

  public fun buildSpec(buildSpec: BuildSpec) {
    cdkBuilder.buildSpec(buildSpec)
  }

  public fun cache(cache: Cache) {
    cdkBuilder.cache(cache)
  }

  public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
    cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
  }

  public fun concurrentBuildLimit(concurrentBuildLimit: Number) {
    cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun environment(block: BuildEnvironmentDsl.() -> Unit = {}) {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    cdkBuilder.environment(builder.build())
  }

  public fun environment(environment: BuildEnvironment) {
    cdkBuilder.environment(environment)
  }

  public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation) {
    _fileSystemLocations.addAll(listOf(*fileSystemLocations))
  }

  public fun fileSystemLocations(fileSystemLocations: Collection<IFileSystemLocation>) {
    _fileSystemLocations.addAll(fileSystemLocations)
  }

  public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
    cdkBuilder.grantReportGroupPermissions(grantReportGroupPermissions)
  }

  public fun logging(block: LoggingOptionsDsl.() -> Unit = {}) {
    val builder = LoggingOptionsDsl()
    builder.apply(block)
    cdkBuilder.logging(builder.build())
  }

  public fun logging(logging: LoggingOptions) {
    cdkBuilder.logging(logging)
  }

  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public fun queuedTimeout(queuedTimeout: Duration) {
    cdkBuilder.queuedTimeout(queuedTimeout)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
    cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
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

  public fun build(): CommonProjectProps {
    if(_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
