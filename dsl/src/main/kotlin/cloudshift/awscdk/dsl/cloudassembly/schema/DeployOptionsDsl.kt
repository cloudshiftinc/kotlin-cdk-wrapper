@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.DeployOptions
import software.amazon.awscdk.cloudassembly.schema.RequireApproval

@CdkDslMarker
public class DeployOptionsDsl {
  private val cdkBuilder: DeployOptions.Builder = DeployOptions.builder()

  private val _notificationArns: MutableList<String> = mutableListOf()

  private val _reuseAssets: MutableList<String> = mutableListOf()

  private val _stacks: MutableList<String> = mutableListOf()

  public fun all(all: Boolean) {
    cdkBuilder.all(all)
  }

  public fun app(app: String) {
    cdkBuilder.app(app)
  }

  public fun assetMetadata(assetMetadata: Boolean) {
    cdkBuilder.assetMetadata(assetMetadata)
  }

  public fun caBundlePath(caBundlePath: String) {
    cdkBuilder.caBundlePath(caBundlePath)
  }

  public fun changeSetName(changeSetName: String) {
    cdkBuilder.changeSetName(changeSetName)
  }

  public fun ci(ci: Boolean) {
    cdkBuilder.ci(ci)
  }

  public fun color(color: Boolean) {
    cdkBuilder.color(color)
  }

  public fun context(context: Map<String, String>) {
    cdkBuilder.context(context)
  }

  public fun debug(debug: Boolean) {
    cdkBuilder.debug(debug)
  }

  public fun ec2Creds(ec2Creds: Boolean) {
    cdkBuilder.ec2Creds(ec2Creds)
  }

  public fun exclusively(exclusively: Boolean) {
    cdkBuilder.exclusively(exclusively)
  }

  public fun execute(execute: Boolean) {
    cdkBuilder.execute(execute)
  }

  public fun force(force: Boolean) {
    cdkBuilder.force(force)
  }

  public fun ignoreErrors(ignoreErrors: Boolean) {
    cdkBuilder.ignoreErrors(ignoreErrors)
  }

  public fun json(json: Boolean) {
    cdkBuilder.json(json)
  }

  public fun lookups(lookups: Boolean) {
    cdkBuilder.lookups(lookups)
  }

  public fun notices(notices: Boolean) {
    cdkBuilder.notices(notices)
  }

  public fun notificationArns(vararg notificationArns: String) {
    _notificationArns.addAll(listOf(*notificationArns))
  }

  public fun notificationArns(notificationArns: Collection<String>) {
    _notificationArns.addAll(notificationArns)
  }

  public fun output(output: String) {
    cdkBuilder.output(output)
  }

  public fun outputsFile(outputsFile: String) {
    cdkBuilder.outputsFile(outputsFile)
  }

  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun pathMetadata(pathMetadata: Boolean) {
    cdkBuilder.pathMetadata(pathMetadata)
  }

  public fun profile(profile: String) {
    cdkBuilder.profile(profile)
  }

  public fun proxy(proxy: String) {
    cdkBuilder.proxy(proxy)
  }

  public fun requireApproval(requireApproval: RequireApproval) {
    cdkBuilder.requireApproval(requireApproval)
  }

  public fun reuseAssets(vararg reuseAssets: String) {
    _reuseAssets.addAll(listOf(*reuseAssets))
  }

  public fun reuseAssets(reuseAssets: Collection<String>) {
    _reuseAssets.addAll(reuseAssets)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun rollback(rollback: Boolean) {
    cdkBuilder.rollback(rollback)
  }

  public fun stacks(vararg stacks: String) {
    _stacks.addAll(listOf(*stacks))
  }

  public fun stacks(stacks: Collection<String>) {
    _stacks.addAll(stacks)
  }

  public fun staging(staging: Boolean) {
    cdkBuilder.staging(staging)
  }

  public fun strict(strict: Boolean) {
    cdkBuilder.strict(strict)
  }

  public fun toolkitStackName(toolkitStackName: String) {
    cdkBuilder.toolkitStackName(toolkitStackName)
  }

  public fun trace(trace: Boolean) {
    cdkBuilder.trace(trace)
  }

  public fun usePreviousParameters(usePreviousParameters: Boolean) {
    cdkBuilder.usePreviousParameters(usePreviousParameters)
  }

  public fun verbose(verbose: Boolean) {
    cdkBuilder.verbose(verbose)
  }

  public fun versionReporting(versionReporting: Boolean) {
    cdkBuilder.versionReporting(versionReporting)
  }

  public fun build(): DeployOptions {
    if(_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
    if(_reuseAssets.isNotEmpty()) cdkBuilder.reuseAssets(_reuseAssets)
    if(_stacks.isNotEmpty()) cdkBuilder.stacks(_stacks)
    return cdkBuilder.build()
  }
}
