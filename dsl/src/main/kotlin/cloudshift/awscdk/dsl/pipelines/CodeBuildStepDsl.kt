@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.codebuild.BuildEnvironmentDsl
import cloudshift.awscdk.dsl.services.codebuild.LoggingOptionsDsl
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.Duration
import software.amazon.awscdk.pipelines.CodeBuildStep
import software.amazon.awscdk.pipelines.IFileSetProducer
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildSpec
import software.amazon.awscdk.services.codebuild.Cache
import software.amazon.awscdk.services.codebuild.IFileSystemLocation
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.PolicyStatement

@CdkDslMarker
public class CodeBuildStepDsl(
  arg0: String,
) {
  private val cdkBuilder: CodeBuildStep.Builder = CodeBuildStep.Builder.create(arg0)

  private val _commands: MutableList<String> = mutableListOf()

  private val _fileSystemLocations: MutableList<IFileSystemLocation> = mutableListOf()

  private val _installCommands: MutableList<String> = mutableListOf()

  private val _rolePolicyStatements: MutableList<PolicyStatement> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun actionRole(actionRole: IRole) {
    cdkBuilder.actionRole(actionRole)
  }

  public fun additionalInputs(additionalInputs: Map<String, out IFileSetProducer>) {
    cdkBuilder.additionalInputs(additionalInputs)
  }

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

  public fun commands(vararg commands: String) {
    _commands.addAll(listOf(*commands))
  }

  public fun commands(commands: Collection<String>) {
    _commands.addAll(commands)
  }

  public fun env(env: Map<String, String>) {
    cdkBuilder.env(env)
  }

  public fun envFromCfnOutputs(envFromCfnOutputs: Map<String, out CfnOutput>) {
    cdkBuilder.envFromCfnOutputs(envFromCfnOutputs)
  }

  public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation) {
    _fileSystemLocations.addAll(listOf(*fileSystemLocations))
  }

  public fun fileSystemLocations(fileSystemLocations: Collection<IFileSystemLocation>) {
    _fileSystemLocations.addAll(fileSystemLocations)
  }

  public fun input(input: IFileSetProducer) {
    cdkBuilder.input(input)
  }

  public fun installCommands(vararg installCommands: String) {
    _installCommands.addAll(listOf(*installCommands))
  }

  public fun installCommands(installCommands: Collection<String>) {
    _installCommands.addAll(installCommands)
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

  public fun primaryOutputDirectory(primaryOutputDirectory: String) {
    cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
  }

  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun rolePolicyStatements(rolePolicyStatements: PolicyStatementDsl.() -> Unit) {
    _rolePolicyStatements.add(PolicyStatementDsl().apply(rolePolicyStatements).build())
  }

  public fun rolePolicyStatements(rolePolicyStatements: Collection<PolicyStatement>) {
    _rolePolicyStatements.addAll(rolePolicyStatements)
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

  public fun build(): CodeBuildStep {
    if(_commands.isNotEmpty()) cdkBuilder.commands(_commands)
    if(_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
    if(_installCommands.isNotEmpty()) cdkBuilder.installCommands(_installCommands)
    if(_rolePolicyStatements.isNotEmpty()) cdkBuilder.rolePolicyStatements(_rolePolicyStatements)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
