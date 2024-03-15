@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.nodejs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public interface ICommandHooks {
  public fun afterBundling(arg0: String, arg1: String): List<String>

  public fun beforeBundling(arg0: String, arg1: String): List<String>

  public fun beforeInstall(arg0: String, arg1: String): List<String>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.nodejs.ICommandHooks,
  ) : CdkObject(cdkObject), ICommandHooks {
    override fun afterBundling(arg0: String, arg1: String): List<String> =
        unwrap(this).afterBundling(arg0, arg1)

    override fun beforeBundling(arg0: String, arg1: String): List<String> =
        unwrap(this).beforeBundling(arg0, arg1)

    override fun beforeInstall(arg0: String, arg1: String): List<String> =
        unwrap(this).beforeInstall(arg0, arg1)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.ICommandHooks):
        ICommandHooks = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICommandHooks):
        software.amazon.awscdk.services.lambda.nodejs.ICommandHooks = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.nodejs.ICommandHooks
  }
}
