@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Utility class to allow assigning a value or an auto-generated id to a sort key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * Assign assign;
 * SortKeyStep sortKeyStep = new SortKeyStep(assign, "skey");
 * ```
 */
public open class SortKeyStep(
  cdkObject: software.amazon.awscdk.services.appsync.SortKeyStep,
) : CdkObject(cdkObject) {
  public constructor(pkey: Assign, skey: String) :
      this(software.amazon.awscdk.services.appsync.SortKeyStep(pkey.let(Assign::unwrap), skey)
  )

  /**
   * Assign an auto-generated value to the sort key.
   */
  public open fun auto(): PrimaryKey = unwrap(this).auto().let(PrimaryKey::wrap)

  /**
   * Assign an auto-generated value to the sort key.
   *
   * @param val 
   */
  public open fun `is`(`val`: String): PrimaryKey = unwrap(this).`is`(`val`).let(PrimaryKey::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SortKeyStep): SortKeyStep =
        SortKeyStep(cdkObject)

    internal fun unwrap(wrapped: SortKeyStep): software.amazon.awscdk.services.appsync.SortKeyStep =
        wrapped.cdkObject as software.amazon.awscdk.services.appsync.SortKeyStep
  }
}
