@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@CdkDslMarker
public class CfnPatchBaselineRulePropertyDsl {
  private val cdkBuilder: CfnPatchBaseline.RuleProperty.Builder =
      CfnPatchBaseline.RuleProperty.builder()

  /**
   * @param approveAfterDays The number of days after the release date of each patch matched by the
   * rule that the patch is marked as approved in the patch baseline.
   * For example, a value of `7` means that patches are approved seven days after they are released.
   *
   * You must specify a value for `ApproveAfterDays` .
   *
   * Exception: Not supported on Debian Server or Ubuntu Server.
   */
  public fun approveAfterDays(approveAfterDays: Number) {
    cdkBuilder.approveAfterDays(approveAfterDays)
  }

  /**
   * @param approveUntilDate The cutoff date for auto approval of released patches.
   * Any patches released on or before this date are installed automatically. Not supported on
   * Debian Server or Ubuntu Server.
   *
   * Enter dates in the format `YYYY-MM-DD` . For example, `2021-12-31` .
   */
  public fun approveUntilDate(approveUntilDate: String) {
    cdkBuilder.approveUntilDate(approveUntilDate)
  }

  /**
   * @param complianceLevel A compliance severity level for all approved patches in a patch
   * baseline.
   * Valid compliance severity levels include the following: `UNSPECIFIED` , `CRITICAL` , `HIGH` ,
   * `MEDIUM` , `LOW` , and `INFORMATIONAL` .
   */
  public fun complianceLevel(complianceLevel: String) {
    cdkBuilder.complianceLevel(complianceLevel)
  }

  /**
   * @param enableNonSecurity For managed nodes identified by the approval rule filters, enables a
   * patch baseline to apply non-security updates available in the specified repository.
   * The default value is `false` . Applies to Linux managed nodes only.
   */
  public fun enableNonSecurity(enableNonSecurity: Boolean) {
    cdkBuilder.enableNonSecurity(enableNonSecurity)
  }

  /**
   * @param enableNonSecurity For managed nodes identified by the approval rule filters, enables a
   * patch baseline to apply non-security updates available in the specified repository.
   * The default value is `false` . Applies to Linux managed nodes only.
   */
  public fun enableNonSecurity(enableNonSecurity: IResolvable) {
    cdkBuilder.enableNonSecurity(enableNonSecurity)
  }

  /**
   * @param patchFilterGroup The patch filter group that defines the criteria for the rule.
   */
  public fun patchFilterGroup(patchFilterGroup: IResolvable) {
    cdkBuilder.patchFilterGroup(patchFilterGroup)
  }

  /**
   * @param patchFilterGroup The patch filter group that defines the criteria for the rule.
   */
  public fun patchFilterGroup(patchFilterGroup: CfnPatchBaseline.PatchFilterGroupProperty) {
    cdkBuilder.patchFilterGroup(patchFilterGroup)
  }

  public fun build(): CfnPatchBaseline.RuleProperty = cdkBuilder.build()
}
