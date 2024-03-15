@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface InitCommandOptions {
  public fun cwd(): String? = unwrap(this).getCwd()

  public fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  public fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

  public fun key(): String? = unwrap(this).getKey()

  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  public fun testCmd(): String? = unwrap(this).getTestCmd()

  public fun waitAfterCompletion(): InitCommandWaitDuration? =
      unwrap(this).getWaitAfterCompletion()?.let(InitCommandWaitDuration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cwd(cwd: String)

    public fun env(env: Map<String, String>)

    public fun ignoreErrors(ignoreErrors: Boolean)

    public fun key(key: String)

    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)

    public fun testCmd(testCmd: String)

    public fun waitAfterCompletion(waitAfterCompletion: InitCommandWaitDuration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitCommandOptions.Builder =
        software.amazon.awscdk.services.ec2.InitCommandOptions.builder()

    override fun cwd(cwd: String) {
      cdkBuilder.cwd(cwd)
    }

    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

    override fun ignoreErrors(ignoreErrors: Boolean) {
      cdkBuilder.ignoreErrors(ignoreErrors)
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    override fun testCmd(testCmd: String) {
      cdkBuilder.testCmd(testCmd)
    }

    override fun waitAfterCompletion(waitAfterCompletion: InitCommandWaitDuration) {
      cdkBuilder.waitAfterCompletion(waitAfterCompletion.let(InitCommandWaitDuration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.InitCommandOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitCommandOptions,
  ) : CdkObject(cdkObject), InitCommandOptions {
    override fun cwd(): String? = unwrap(this).getCwd()

    override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

    override fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

    override fun key(): String? = unwrap(this).getKey()

    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

    override fun testCmd(): String? = unwrap(this).getTestCmd()

    override fun waitAfterCompletion(): InitCommandWaitDuration? =
        unwrap(this).getWaitAfterCompletion()?.let(InitCommandWaitDuration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitCommandOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitCommandOptions):
        InitCommandOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitCommandOptions):
        software.amazon.awscdk.services.ec2.InitCommandOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitCommandOptions
  }
}
