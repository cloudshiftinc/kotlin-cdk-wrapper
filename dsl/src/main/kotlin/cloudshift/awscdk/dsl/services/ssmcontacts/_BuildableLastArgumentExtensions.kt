@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

public inline
    fun CfnRotation.setRecurrence(block: CfnRotationRecurrenceSettingsPropertyDsl.() -> Unit = {}) {
  val builder = CfnRotationRecurrenceSettingsPropertyDsl()
  builder.apply(block)
  return setRecurrence(builder.build())
}
