@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.lambdalayer.awscli

import cloudshift.awscdk.dsl.services.lambda.LayerVersionPermissionDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer

public inline fun AwsCliLayer.addPermission(arg0: String,
    block: LayerVersionPermissionDsl.() -> Unit = {}) {
  val builder = LayerVersionPermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}
