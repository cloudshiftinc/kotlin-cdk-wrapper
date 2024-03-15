@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public open class AllowedMethods internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.AllowedMethods,
) : CdkObject(cdkObject) {
  public open fun methods(): List<String> = unwrap(this).getMethods()

  public companion object {
    public val ALLOW_ALL: AllowedMethods =
        AllowedMethods.wrap(software.amazon.awscdk.services.cloudfront.AllowedMethods.ALLOW_ALL)

    public val ALLOW_GET_HEAD: AllowedMethods =
        AllowedMethods.wrap(software.amazon.awscdk.services.cloudfront.AllowedMethods.ALLOW_GET_HEAD)

    public val ALLOW_GET_HEAD_OPTIONS: AllowedMethods =
        AllowedMethods.wrap(software.amazon.awscdk.services.cloudfront.AllowedMethods.ALLOW_GET_HEAD_OPTIONS)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.AllowedMethods):
        AllowedMethods = AllowedMethods(cdkObject)

    internal fun unwrap(wrapped: AllowedMethods):
        software.amazon.awscdk.services.cloudfront.AllowedMethods = wrapped.cdkObject
  }
}
