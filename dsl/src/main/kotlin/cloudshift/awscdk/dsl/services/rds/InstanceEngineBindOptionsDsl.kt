@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.IOptionGroup
import software.amazon.awscdk.services.rds.InstanceEngineBindOptions

/**
 * The options passed to `IInstanceEngine.bind`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.rds.*;
 * OptionGroup optionGroup;
 * Role role;
 * InstanceEngineBindOptions instanceEngineBindOptions = InstanceEngineBindOptions.builder()
 * .domain("domain")
 * .optionGroup(optionGroup)
 * .s3ExportRole(role)
 * .s3ImportRole(role)
 * .timezone("timezone")
 * .build();
 * ```
 */
@CdkDslMarker
public class InstanceEngineBindOptionsDsl {
  private val cdkBuilder: InstanceEngineBindOptions.Builder = InstanceEngineBindOptions.builder()

  /**
   * @param domain The Active Directory directory ID to create the DB instance in.
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param optionGroup The option group of the database.
   */
  public fun optionGroup(optionGroup: IOptionGroup) {
    cdkBuilder.optionGroup(optionGroup)
  }

  /**
   * @param s3ExportRole The role used for S3 exporting.
   */
  public fun s3ExportRole(s3ExportRole: IRole) {
    cdkBuilder.s3ExportRole(s3ExportRole)
  }

  /**
   * @param s3ImportRole The role used for S3 importing.
   */
  public fun s3ImportRole(s3ImportRole: IRole) {
    cdkBuilder.s3ImportRole(s3ImportRole)
  }

  /**
   * @param timezone The timezone of the database, set by the customer.
   */
  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): InstanceEngineBindOptions = cdkBuilder.build()
}
