@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class FunctionRuntime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntime,
) : CdkObject(cdkObject) {
  public open fun name(): String = unwrap(this).getName()

  public open fun toProperties(): RuntimeConfig =
      unwrap(this).toProperties().let(RuntimeConfig::wrap)

  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public val JS_1_0_0: FunctionRuntime =
        FunctionRuntime.wrap(software.amazon.awscdk.services.appsync.FunctionRuntime.JS_1_0_0)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntime):
        FunctionRuntime = FunctionRuntime(cdkObject)

    internal fun unwrap(wrapped: FunctionRuntime):
        software.amazon.awscdk.services.appsync.FunctionRuntime = wrapped.cdkObject
  }
}
