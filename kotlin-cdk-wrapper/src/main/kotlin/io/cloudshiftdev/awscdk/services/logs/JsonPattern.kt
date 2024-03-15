@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class JsonPattern internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.JsonPattern,
) : CdkObject(cdkObject), IFilterPattern {
  public open fun jsonPatternString(): String = unwrap(this).getJsonPatternString()

  public override fun logPatternString(): String = unwrap(this).getLogPatternString()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.JsonPattern,
  ) : JsonPattern(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.JsonPattern): JsonPattern =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonPattern): software.amazon.awscdk.services.logs.JsonPattern =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.JsonPattern
  }
}
