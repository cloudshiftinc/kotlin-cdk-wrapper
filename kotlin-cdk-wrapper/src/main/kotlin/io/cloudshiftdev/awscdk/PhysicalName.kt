@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Includes special markers for automatic generation of physical names.
 */
public open class PhysicalName(
  cdkObject: software.amazon.awscdk.PhysicalName,
) : CdkObject(cdkObject) {
  public companion object {
    public val GENERATE_IF_NEEDED: String = software.amazon.awscdk.PhysicalName.GENERATE_IF_NEEDED

    internal fun wrap(cdkObject: software.amazon.awscdk.PhysicalName): PhysicalName =
        PhysicalName(cdkObject)

    internal fun unwrap(wrapped: PhysicalName): software.amazon.awscdk.PhysicalName =
        wrapped.cdkObject as software.amazon.awscdk.PhysicalName
  }
}
