@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String

public open class Endpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.docdb.Endpoint,
) : CdkObject(cdkObject) {
  public open fun hostname(): String = unwrap(this).getHostname()

  public open fun port(): Number = unwrap(this).getPort()

  public open fun portAsString(): String = unwrap(this).portAsString()

  public open fun socketAddress(): String = unwrap(this).getSocketAddress()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.Endpoint): Endpoint =
        Endpoint(cdkObject)

    internal fun unwrap(wrapped: Endpoint): software.amazon.awscdk.services.docdb.Endpoint =
        wrapped.cdkObject
  }
}
