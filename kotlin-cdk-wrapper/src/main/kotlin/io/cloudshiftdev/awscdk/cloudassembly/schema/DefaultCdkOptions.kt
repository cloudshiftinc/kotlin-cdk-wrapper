@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface DefaultCdkOptions {
  public fun all(): Boolean? = unwrap(this).getAll()

  public fun app(): String? = unwrap(this).getApp()

  public fun assetMetadata(): Boolean? = unwrap(this).getAssetMetadata()

  public fun caBundlePath(): String? = unwrap(this).getCaBundlePath()

  public fun color(): Boolean? = unwrap(this).getColor()

  public fun context(): Map<String, String> = unwrap(this).getContext() ?: emptyMap()

  public fun debug(): Boolean? = unwrap(this).getDebug()

  public fun ec2Creds(): Boolean? = unwrap(this).getEc2Creds()

  public fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

  public fun json(): Boolean? = unwrap(this).getJson()

  public fun lookups(): Boolean? = unwrap(this).getLookups()

  public fun notices(): Boolean? = unwrap(this).getNotices()

  public fun output(): String? = unwrap(this).getOutput()

  public fun pathMetadata(): Boolean? = unwrap(this).getPathMetadata()

  public fun profile(): String? = unwrap(this).getProfile()

  public fun proxy(): String? = unwrap(this).getProxy()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun stacks(): List<String> = unwrap(this).getStacks() ?: emptyList()

  public fun staging(): Boolean? = unwrap(this).getStaging()

  public fun strict(): Boolean? = unwrap(this).getStrict()

  public fun trace(): Boolean? = unwrap(this).getTrace()

  public fun verbose(): Boolean? = unwrap(this).getVerbose()

  public fun versionReporting(): Boolean? = unwrap(this).getVersionReporting()

  @CdkDslMarker
  public interface Builder {
    public fun all(all: Boolean)

    public fun app(app: String)

    public fun assetMetadata(assetMetadata: Boolean)

    public fun caBundlePath(caBundlePath: String)

    public fun color(color: Boolean)

    public fun context(context: Map<String, String>)

    public fun debug(debug: Boolean)

    public fun ec2Creds(ec2Creds: Boolean)

    public fun ignoreErrors(ignoreErrors: Boolean)

    public fun json(json: Boolean)

    public fun lookups(lookups: Boolean)

    public fun notices(notices: Boolean)

    public fun output(output: String)

    public fun pathMetadata(pathMetadata: Boolean)

    public fun profile(profile: String)

    public fun proxy(proxy: String)

    public fun roleArn(roleArn: String)

    public fun stacks(stacks: List<String>)

    public fun stacks(vararg stacks: String)

    public fun staging(staging: Boolean)

    public fun strict(strict: Boolean)

    public fun trace(trace: Boolean)

    public fun verbose(verbose: Boolean)

    public fun versionReporting(versionReporting: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions.Builder =
        software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions.builder()

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

    override fun color(color: Boolean) {
      cdkBuilder.color(color)
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

    override fun output(output: String) {
      cdkBuilder.output(output)
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

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
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

    override fun trace(trace: Boolean) {
      cdkBuilder.trace(trace)
    }

    override fun verbose(verbose: Boolean) {
      cdkBuilder.verbose(verbose)
    }

    override fun versionReporting(versionReporting: Boolean) {
      cdkBuilder.versionReporting(versionReporting)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions,
  ) : CdkObject(cdkObject), DefaultCdkOptions {
    override fun all(): Boolean? = unwrap(this).getAll()

    override fun app(): String? = unwrap(this).getApp()

    override fun assetMetadata(): Boolean? = unwrap(this).getAssetMetadata()

    override fun caBundlePath(): String? = unwrap(this).getCaBundlePath()

    override fun color(): Boolean? = unwrap(this).getColor()

    override fun context(): Map<String, String> = unwrap(this).getContext() ?: emptyMap()

    override fun debug(): Boolean? = unwrap(this).getDebug()

    override fun ec2Creds(): Boolean? = unwrap(this).getEc2Creds()

    override fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

    override fun json(): Boolean? = unwrap(this).getJson()

    override fun lookups(): Boolean? = unwrap(this).getLookups()

    override fun notices(): Boolean? = unwrap(this).getNotices()

    override fun output(): String? = unwrap(this).getOutput()

    override fun pathMetadata(): Boolean? = unwrap(this).getPathMetadata()

    override fun profile(): String? = unwrap(this).getProfile()

    override fun proxy(): String? = unwrap(this).getProxy()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun stacks(): List<String> = unwrap(this).getStacks() ?: emptyList()

    override fun staging(): Boolean? = unwrap(this).getStaging()

    override fun strict(): Boolean? = unwrap(this).getStrict()

    override fun trace(): Boolean? = unwrap(this).getTrace()

    override fun verbose(): Boolean? = unwrap(this).getVerbose()

    override fun versionReporting(): Boolean? = unwrap(this).getVersionReporting()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DefaultCdkOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions):
        DefaultCdkOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DefaultCdkOptions):
        software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions
  }
}
