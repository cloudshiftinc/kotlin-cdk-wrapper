package io.cloudshiftdev.awscdk.services.lambda.nodejs

import kotlin.String
import kotlin.collections.List

public interface ICommandHooks {
  public fun afterBundling(arg0: String, arg1: String): List<String>

  public fun beforeBundling(arg0: String, arg1: String): List<String>

  public fun beforeInstall(arg0: String, arg1: String): List<String>

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.nodejs.ICommandHooks,
  ) : ICommandHooks {
    override fun afterBundling(arg0: String, arg1: String): List<String> =
        unwrap(this).afterBundling(arg0, arg1) ?: emptyList()

    override fun beforeBundling(arg0: String, arg1: String): List<String> =
        unwrap(this).beforeBundling(arg0, arg1) ?: emptyList()

    override fun beforeInstall(arg0: String, arg1: String): List<String> =
        unwrap(this).beforeInstall(arg0, arg1) ?: emptyList()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.ICommandHooks):
        ICommandHooks = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICommandHooks):
        software.amazon.awscdk.services.lambda.nodejs.ICommandHooks = (wrapped as Wrapper).cdkObject
  }
}
