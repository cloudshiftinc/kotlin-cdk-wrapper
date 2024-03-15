@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ApplyCloudFormationInitOptions {
  public fun configSets(): List<String> = unwrap(this).getConfigSets() ?: emptyList()

  public fun embedFingerprint(): Boolean? = unwrap(this).getEmbedFingerprint()

  public fun ignoreFailures(): Boolean? = unwrap(this).getIgnoreFailures()

  public fun includeRole(): Boolean? = unwrap(this).getIncludeRole()

  public fun includeUrl(): Boolean? = unwrap(this).getIncludeUrl()

  public fun printLog(): Boolean? = unwrap(this).getPrintLog()

  @CdkDslMarker
  public interface Builder {
    public fun configSets(configSets: List<String>)

    public fun configSets(vararg configSets: String)

    public fun embedFingerprint(embedFingerprint: Boolean)

    public fun ignoreFailures(ignoreFailures: Boolean)

    public fun includeRole(includeRole: Boolean)

    public fun includeUrl(includeUrl: Boolean)

    public fun printLog(printLog: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions.Builder =
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions.builder()

    override fun configSets(configSets: List<String>) {
      cdkBuilder.configSets(configSets)
    }

    override fun configSets(vararg configSets: String): Unit = configSets(configSets.toList())

    override fun embedFingerprint(embedFingerprint: Boolean) {
      cdkBuilder.embedFingerprint(embedFingerprint)
    }

    override fun ignoreFailures(ignoreFailures: Boolean) {
      cdkBuilder.ignoreFailures(ignoreFailures)
    }

    override fun includeRole(includeRole: Boolean) {
      cdkBuilder.includeRole(includeRole)
    }

    override fun includeUrl(includeUrl: Boolean) {
      cdkBuilder.includeUrl(includeUrl)
    }

    override fun printLog(printLog: Boolean) {
      cdkBuilder.printLog(printLog)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions,
  ) : CdkObject(cdkObject), ApplyCloudFormationInitOptions {
    override fun configSets(): List<String> = unwrap(this).getConfigSets() ?: emptyList()

    override fun embedFingerprint(): Boolean? = unwrap(this).getEmbedFingerprint()

    override fun ignoreFailures(): Boolean? = unwrap(this).getIgnoreFailures()

    override fun includeRole(): Boolean? = unwrap(this).getIncludeRole()

    override fun includeUrl(): Boolean? = unwrap(this).getIncludeUrl()

    override fun printLog(): Boolean? = unwrap(this).getPrintLog()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplyCloudFormationInitOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions):
        ApplyCloudFormationInitOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplyCloudFormationInitOptions):
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions
  }
}
