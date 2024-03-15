@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class Values internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.Values,
) : CdkObject(cdkObject) {
  public companion object {
    public fun attribute(attr: String): AttributeValuesStep =
        software.amazon.awscdk.services.appsync.Values.attribute(attr).let(AttributeValuesStep::wrap)

    public fun projecting(): AttributeValues =
        software.amazon.awscdk.services.appsync.Values.projecting().let(AttributeValues::wrap)

    public fun projecting(arg: String): AttributeValues =
        software.amazon.awscdk.services.appsync.Values.projecting(arg).let(AttributeValues::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Values): Values =
        Values(cdkObject)

    internal fun unwrap(wrapped: Values): software.amazon.awscdk.services.appsync.Values =
        wrapped.cdkObject
  }
}
