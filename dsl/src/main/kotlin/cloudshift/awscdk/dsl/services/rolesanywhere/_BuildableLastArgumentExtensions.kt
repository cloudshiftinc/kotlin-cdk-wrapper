@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rolesanywhere

import kotlin.Unit
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor

/**
 * The trust anchor type and its related certificate data.
 */
public inline fun CfnTrustAnchor.setSource(block: CfnTrustAnchorSourcePropertyDsl.() -> Unit = {}) {
  val builder = CfnTrustAnchorSourcePropertyDsl()
  builder.apply(block)
  return setSource(builder.build())
}
