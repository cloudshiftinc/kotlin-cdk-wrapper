@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.TagOperation
import software.constructs.Construct

@CdkDslMarker
public class BackupResourceDsl(
  arg0: String,
  arg1: Construct,
) {
  private val cdkBuilder: BackupResource.Builder = BackupResource.Builder.create(arg0, arg1)

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun operation(operation: TagOperation) {
    cdkBuilder.operation(operation)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): BackupResource = cdkBuilder.build()
}
