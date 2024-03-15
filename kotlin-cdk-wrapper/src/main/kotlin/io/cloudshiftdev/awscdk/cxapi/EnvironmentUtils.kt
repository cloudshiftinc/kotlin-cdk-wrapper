@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class EnvironmentUtils internal constructor(
  internal override val cdkObject: software.amazon.awscdk.cxapi.EnvironmentUtils,
) : CdkObject(cdkObject) {
  public companion object {
    public fun format(account: String, region: String): String =
        software.amazon.awscdk.cxapi.EnvironmentUtils.format(account, region)

    public fun make(account: String, region: String): Environment =
        software.amazon.awscdk.cxapi.EnvironmentUtils.make(account, region).let(Environment::wrap)

    public fun parse(environment: String): Environment =
        software.amazon.awscdk.cxapi.EnvironmentUtils.parse(environment).let(Environment::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.EnvironmentUtils): EnvironmentUtils =
        EnvironmentUtils(cdkObject)

    internal fun unwrap(wrapped: EnvironmentUtils): software.amazon.awscdk.cxapi.EnvironmentUtils =
        wrapped.cdkObject
  }
}
