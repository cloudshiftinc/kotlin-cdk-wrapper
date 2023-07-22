@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemElasticFileSystemTagPropertyDsl {
  private val cdkBuilder: CfnFileSystem.ElasticFileSystemTagProperty.Builder =
      CfnFileSystem.ElasticFileSystemTagProperty.builder()

  /**
   * @param key The tag key (String). 
   * The key can't start with `aws:` .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of the tag key. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnFileSystem.ElasticFileSystemTagProperty = cdkBuilder.build()
}
