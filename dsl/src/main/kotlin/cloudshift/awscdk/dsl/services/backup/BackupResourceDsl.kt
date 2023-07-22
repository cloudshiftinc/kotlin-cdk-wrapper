@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.TagOperation
import software.constructs.Construct

@CdkDslMarker
public class BackupResourceDsl(
  resource: String,
  construct: Construct,
) {
  private val cdkBuilder: BackupResource.Builder = BackupResource.Builder.create(resource,
      construct)

  /**
   * The key in a key-value pair.
   *
   * For example, in `"ec2:ResourceTag/Department": "accounting"`,
   * `ec2:ResourceTag/Department` is the key.
   *
   * @param key The key in a key-value pair. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * An operation that is applied to a key-value pair used to filter resources in a selection.
   *
   * Default: STRING_EQUALS
   *
   * @param operation An operation that is applied to a key-value pair used to filter resources in a
   * selection. 
   */
  public fun operation(operation: TagOperation) {
    cdkBuilder.operation(operation)
  }

  /**
   * The value in a key-value pair.
   *
   * For example, in `"ec2:ResourceTag/Department": "accounting"`,
   * `accounting` is the value.
   *
   * @param value The value in a key-value pair. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): BackupResource = cdkBuilder.build()
}
