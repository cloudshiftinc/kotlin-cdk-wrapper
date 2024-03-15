@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class Assign internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.Assign,
) : CdkObject(cdkObject) {
  public open fun putInMap(map: String): String = unwrap(this).putInMap(map)

  public open fun renderAsAssignment(): String = unwrap(this).renderAsAssignment()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Assign): Assign =
        Assign(cdkObject)

    internal fun unwrap(wrapped: Assign): software.amazon.awscdk.services.appsync.Assign =
        wrapped.cdkObject
  }
}
