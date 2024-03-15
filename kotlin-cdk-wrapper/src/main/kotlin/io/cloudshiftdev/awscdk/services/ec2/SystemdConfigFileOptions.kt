@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SystemdConfigFileOptions {
  public fun afterNetwork(): Boolean? = unwrap(this).getAfterNetwork()

  public fun command(): String

  public fun cwd(): String? = unwrap(this).getCwd()

  public fun description(): String? = unwrap(this).getDescription()

  public fun group(): String? = unwrap(this).getGroup()

  public fun keepRunning(): Boolean? = unwrap(this).getKeepRunning()

  public fun user(): String? = unwrap(this).getUser()

  @CdkDslMarker
  public interface Builder {
    public fun afterNetwork(afterNetwork: Boolean)

    public fun command(command: String)

    public fun cwd(cwd: String)

    public fun description(description: String)

    public fun group(group: String)

    public fun keepRunning(keepRunning: Boolean)

    public fun user(user: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SystemdConfigFileOptions.Builder =
        software.amazon.awscdk.services.ec2.SystemdConfigFileOptions.builder()

    override fun afterNetwork(afterNetwork: Boolean) {
      cdkBuilder.afterNetwork(afterNetwork)
    }

    override fun command(command: String) {
      cdkBuilder.command(command)
    }

    override fun cwd(cwd: String) {
      cdkBuilder.cwd(cwd)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    override fun keepRunning(keepRunning: Boolean) {
      cdkBuilder.keepRunning(keepRunning)
    }

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SystemdConfigFileOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SystemdConfigFileOptions,
  ) : CdkObject(cdkObject), SystemdConfigFileOptions {
    override fun afterNetwork(): Boolean? = unwrap(this).getAfterNetwork()

    override fun command(): String = unwrap(this).getCommand()

    override fun cwd(): String? = unwrap(this).getCwd()

    override fun description(): String? = unwrap(this).getDescription()

    override fun group(): String? = unwrap(this).getGroup()

    override fun keepRunning(): Boolean? = unwrap(this).getKeepRunning()

    override fun user(): String? = unwrap(this).getUser()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SystemdConfigFileOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SystemdConfigFileOptions):
        SystemdConfigFileOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SystemdConfigFileOptions):
        software.amazon.awscdk.services.ec2.SystemdConfigFileOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SystemdConfigFileOptions
  }
}
