@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.IOptionGroup
import software.amazon.awscdk.services.rds.InstanceEngineBindOptions

@CdkDslMarker
public class InstanceEngineBindOptionsDsl {
  private val cdkBuilder: InstanceEngineBindOptions.Builder = InstanceEngineBindOptions.builder()

  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun optionGroup(optionGroup: IOptionGroup) {
    cdkBuilder.optionGroup(optionGroup)
  }

  public fun s3ExportRole(s3ExportRole: IRole) {
    cdkBuilder.s3ExportRole(s3ExportRole)
  }

  public fun s3ImportRole(s3ImportRole: IRole) {
    cdkBuilder.s3ImportRole(s3ImportRole)
  }

  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): InstanceEngineBindOptions = cdkBuilder.build()
}
