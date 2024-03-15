@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface DeployOptions : DefaultCdkOptions {
  public fun changeSetName(): String? = unwrap(this).getChangeSetName()

  public fun ci(): Boolean? = unwrap(this).getCi()

  public fun concurrency(): Number? = unwrap(this).getConcurrency()

  public fun exclusively(): Boolean? = unwrap(this).getExclusively()

  public fun execute(): Boolean? = unwrap(this).getExecute()

  public fun force(): Boolean? = unwrap(this).getForce()

  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  public fun outputsFile(): String? = unwrap(this).getOutputsFile()

  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun requireApproval(): RequireApproval? =
      unwrap(this).getRequireApproval()?.let(RequireApproval::wrap)

  public fun reuseAssets(): List<String> = unwrap(this).getReuseAssets() ?: emptyList()

  public fun rollback(): Boolean? = unwrap(this).getRollback()

  public fun toolkitStackName(): String? = unwrap(this).getToolkitStackName()

  public fun usePreviousParameters(): Boolean? = unwrap(this).getUsePreviousParameters()

  @CdkDslMarker
  public interface Builder {
    public fun all(all: Boolean)

    public fun app(app: String)

    public fun assetMetadata(assetMetadata: Boolean)

    public fun caBundlePath(caBundlePath: String)

    public fun changeSetName(changeSetName: String)

    public fun ci(ci: Boolean)

    public fun color(color: Boolean)

    public fun concurrency(concurrency: Number)

    public fun context(context: Map<String, String>)

    public fun debug(debug: Boolean)

    public fun ec2Creds(ec2Creds: Boolean)

    public fun exclusively(exclusively: Boolean)

    public fun execute(execute: Boolean)

    public fun force(force: Boolean)

    public fun ignoreErrors(ignoreErrors: Boolean)

    public fun json(json: Boolean)

    public fun lookups(lookups: Boolean)

    public fun notices(notices: Boolean)

    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun output(output: String)

    public fun outputsFile(outputsFile: String)

    public fun parameters(parameters: Map<String, String>)

    public fun pathMetadata(pathMetadata: Boolean)

    public fun profile(profile: String)

    public fun proxy(proxy: String)

    public fun requireApproval(requireApproval: RequireApproval)

    public fun reuseAssets(reuseAssets: List<String>)

    public fun reuseAssets(vararg reuseAssets: String)

    public fun roleArn(roleArn: String)

    public fun rollback(rollback: Boolean)

    public fun stacks(stacks: List<String>)

    public fun stacks(vararg stacks: String)

    public fun staging(staging: Boolean)

    public fun strict(strict: Boolean)

    public fun toolkitStackName(toolkitStackName: String)

    public fun trace(trace: Boolean)

    public fun usePreviousParameters(usePreviousParameters: Boolean)

    public fun verbose(verbose: Boolean)

    public fun versionReporting(versionReporting: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DeployOptions.Builder =
        software.amazon.awscdk.cloudassembly.schema.DeployOptions.builder()

    override fun all(all: Boolean) {
      cdkBuilder.all(all)
    }

    override fun app(app: String) {
      cdkBuilder.app(app)
    }

    override fun assetMetadata(assetMetadata: Boolean) {
      cdkBuilder.assetMetadata(assetMetadata)
    }

    override fun caBundlePath(caBundlePath: String) {
      cdkBuilder.caBundlePath(caBundlePath)
    }

    override fun changeSetName(changeSetName: String) {
      cdkBuilder.changeSetName(changeSetName)
    }

    override fun ci(ci: Boolean) {
      cdkBuilder.ci(ci)
    }

    override fun color(color: Boolean) {
      cdkBuilder.color(color)
    }

    override fun concurrency(concurrency: Number) {
      cdkBuilder.concurrency(concurrency)
    }

    override fun context(context: Map<String, String>) {
      cdkBuilder.context(context)
    }

    override fun debug(debug: Boolean) {
      cdkBuilder.debug(debug)
    }

    override fun ec2Creds(ec2Creds: Boolean) {
      cdkBuilder.ec2Creds(ec2Creds)
    }

    override fun exclusively(exclusively: Boolean) {
      cdkBuilder.exclusively(exclusively)
    }

    override fun execute(execute: Boolean) {
      cdkBuilder.execute(execute)
    }

    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    override fun ignoreErrors(ignoreErrors: Boolean) {
      cdkBuilder.ignoreErrors(ignoreErrors)
    }

    override fun json(json: Boolean) {
      cdkBuilder.json(json)
    }

    override fun lookups(lookups: Boolean) {
      cdkBuilder.lookups(lookups)
    }

    override fun notices(notices: Boolean) {
      cdkBuilder.notices(notices)
    }

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    override fun output(output: String) {
      cdkBuilder.output(output)
    }

    override fun outputsFile(outputsFile: String) {
      cdkBuilder.outputsFile(outputsFile)
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun pathMetadata(pathMetadata: Boolean) {
      cdkBuilder.pathMetadata(pathMetadata)
    }

    override fun profile(profile: String) {
      cdkBuilder.profile(profile)
    }

    override fun proxy(proxy: String) {
      cdkBuilder.proxy(proxy)
    }

    override fun requireApproval(requireApproval: RequireApproval) {
      cdkBuilder.requireApproval(requireApproval.let(RequireApproval::unwrap))
    }

    override fun reuseAssets(reuseAssets: List<String>) {
      cdkBuilder.reuseAssets(reuseAssets)
    }

    override fun reuseAssets(vararg reuseAssets: String): Unit = reuseAssets(reuseAssets.toList())

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun rollback(rollback: Boolean) {
      cdkBuilder.rollback(rollback)
    }

    override fun stacks(stacks: List<String>) {
      cdkBuilder.stacks(stacks)
    }

    override fun stacks(vararg stacks: String): Unit = stacks(stacks.toList())

    override fun staging(staging: Boolean) {
      cdkBuilder.staging(staging)
    }

    override fun strict(strict: Boolean) {
      cdkBuilder.strict(strict)
    }

    override fun toolkitStackName(toolkitStackName: String) {
      cdkBuilder.toolkitStackName(toolkitStackName)
    }

    override fun trace(trace: Boolean) {
      cdkBuilder.trace(trace)
    }

    override fun usePreviousParameters(usePreviousParameters: Boolean) {
      cdkBuilder.usePreviousParameters(usePreviousParameters)
    }

    override fun verbose(verbose: Boolean) {
      cdkBuilder.verbose(verbose)
    }

    override fun versionReporting(versionReporting: Boolean) {
      cdkBuilder.versionReporting(versionReporting)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DeployOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.DeployOptions,
  ) : CdkObject(cdkObject), DeployOptions {
    override fun all(): Boolean? = unwrap(this).getAll()

    override fun app(): String? = unwrap(this).getApp()

    override fun assetMetadata(): Boolean? = unwrap(this).getAssetMetadata()

    override fun caBundlePath(): String? = unwrap(this).getCaBundlePath()

    override fun changeSetName(): String? = unwrap(this).getChangeSetName()

    override fun ci(): Boolean? = unwrap(this).getCi()

    override fun color(): Boolean? = unwrap(this).getColor()

    override fun concurrency(): Number? = unwrap(this).getConcurrency()

    override fun context(): Map<String, String> = unwrap(this).getContext() ?: emptyMap()

    override fun debug(): Boolean? = unwrap(this).getDebug()

    override fun ec2Creds(): Boolean? = unwrap(this).getEc2Creds()

    override fun exclusively(): Boolean? = unwrap(this).getExclusively()

    override fun execute(): Boolean? = unwrap(this).getExecute()

    override fun force(): Boolean? = unwrap(this).getForce()

    override fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

    override fun json(): Boolean? = unwrap(this).getJson()

    override fun lookups(): Boolean? = unwrap(this).getLookups()

    override fun notices(): Boolean? = unwrap(this).getNotices()

    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    override fun output(): String? = unwrap(this).getOutput()

    override fun outputsFile(): String? = unwrap(this).getOutputsFile()

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun pathMetadata(): Boolean? = unwrap(this).getPathMetadata()

    override fun profile(): String? = unwrap(this).getProfile()

    override fun proxy(): String? = unwrap(this).getProxy()

    override fun requireApproval(): RequireApproval? =
        unwrap(this).getRequireApproval()?.let(RequireApproval::wrap)

    override fun reuseAssets(): List<String> = unwrap(this).getReuseAssets() ?: emptyList()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun rollback(): Boolean? = unwrap(this).getRollback()

    override fun stacks(): List<String> = unwrap(this).getStacks() ?: emptyList()

    override fun staging(): Boolean? = unwrap(this).getStaging()

    override fun strict(): Boolean? = unwrap(this).getStrict()

    override fun toolkitStackName(): String? = unwrap(this).getToolkitStackName()

    override fun trace(): Boolean? = unwrap(this).getTrace()

    override fun usePreviousParameters(): Boolean? = unwrap(this).getUsePreviousParameters()

    override fun verbose(): Boolean? = unwrap(this).getVerbose()

    override fun versionReporting(): Boolean? = unwrap(this).getVersionReporting()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeployOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DeployOptions):
        DeployOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeployOptions):
        software.amazon.awscdk.cloudassembly.schema.DeployOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.DeployOptions
  }
}
