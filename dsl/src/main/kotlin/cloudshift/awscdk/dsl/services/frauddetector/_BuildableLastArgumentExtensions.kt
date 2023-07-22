@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnDetector

/**
 * The event type associated with this detector.
 */
public inline fun CfnDetector.setEventType(block: CfnDetectorEventTypePropertyDsl.() -> Unit = {}) {
  val builder = CfnDetectorEventTypePropertyDsl()
  builder.apply(block)
  return setEventType(builder.build())
}
