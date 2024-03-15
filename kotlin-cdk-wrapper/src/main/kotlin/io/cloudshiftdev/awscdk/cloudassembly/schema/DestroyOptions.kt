@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface DestroyOptions : DefaultCdkOptions {
  public fun exclusively(): Boolean? = unwrap(this).getExclusively()

  public fun force(): Boolean? = unwrap(this).getForce()

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

    public fun exclusively(exclusively: Boolean)

    public fun force(force: Boolean)

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
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DestroyOptions.Builder =
        software.amazon.awscdk.cloudassembly.schema.DestroyOptions.builder()

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

    override fun exclusively(exclusively: Boolean) {
      cdkBuilder.exclusively(exclusively)
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

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DestroyOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.DestroyOptions,
  ) : CdkObject(cdkObject), DestroyOptions {
    override fun all(): Boolean? = unwrap(this).getAll()

    override fun app(): String? = unwrap(this).getApp()

    override fun assetMetadata(): Boolean? = unwrap(this).getAssetMetadata()

    override fun caBundlePath(): String? = unwrap(this).getCaBundlePath()

    override fun color(): Boolean? = unwrap(this).getColor()

    override fun context(): Map<String, String> = unwrap(this).getContext() ?: emptyMap()

    override fun debug(): Boolean? = unwrap(this).getDebug()

    override fun ec2Creds(): Boolean? = unwrap(this).getEc2Creds()

    override fun exclusively(): Boolean? = unwrap(this).getExclusively()

    override fun force(): Boolean? = unwrap(this).getForce()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): DestroyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DestroyOptions):
        DestroyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestroyOptions):
        software.amazon.awscdk.cloudassembly.schema.DestroyOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DestroyOptions
  }
}
