@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.collections.List

/**
 * Accessor for scoped pseudo parameters.
 *
 * These pseudo parameters are anchored to a stack somewhere in the construct
 * tree, and their values will be exported automatically.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * ScopedAws scopedAws = new ScopedAws(this);
 * ```
 */
public open class ScopedAws(
  cdkObject: software.amazon.awscdk.ScopedAws,
) : CdkObject(cdkObject) {
  public constructor(scope: Construct) :
      this(software.amazon.awscdk.ScopedAws(scope.let(Construct.Companion::unwrap))
  )

  /**
   *
   */
  public open fun accountId(): String = unwrap(this).getAccountId()

  /**
   *
   */
  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns()

  /**
   *
   */
  public open fun partition(): String = unwrap(this).getPartition()

  /**
   *
   */
  public open fun region(): String = unwrap(this).getRegion()

  /**
   *
   */
  public open fun stackId(): String = unwrap(this).getStackId()

  /**
   *
   */
  public open fun stackName(): String = unwrap(this).getStackName()

  /**
   *
   */
  public open fun urlSuffix(): String = unwrap(this).getUrlSuffix()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ScopedAws): ScopedAws = ScopedAws(cdkObject)

    internal fun unwrap(wrapped: ScopedAws): software.amazon.awscdk.ScopedAws = wrapped.cdkObject as
        software.amazon.awscdk.ScopedAws
  }
}
