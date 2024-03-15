@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public open class ScopedAws internal constructor(
  internal override val cdkObject: software.amazon.awscdk.ScopedAws,
) : CdkObject(cdkObject) {
  public open fun accountId(): String = unwrap(this).getAccountId()

  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns()

  public open fun partition(): String = unwrap(this).getPartition()

  public open fun region(): String = unwrap(this).getRegion()

  public open fun stackId(): String = unwrap(this).getStackId()

  public open fun stackName(): String = unwrap(this).getStackName()

  public open fun urlSuffix(): String = unwrap(this).getUrlSuffix()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ScopedAws): ScopedAws = ScopedAws(cdkObject)

    internal fun unwrap(wrapped: ScopedAws): software.amazon.awscdk.ScopedAws = wrapped.cdkObject
  }
}
