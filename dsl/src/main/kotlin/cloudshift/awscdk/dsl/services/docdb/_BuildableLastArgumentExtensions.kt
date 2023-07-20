@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseCluster
import software.amazon.awscdk.services.secretsmanager.SecretRotation

public inline fun DatabaseCluster.addRotationMultiUser(id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(id, builder.build())
}
