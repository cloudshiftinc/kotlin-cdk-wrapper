@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps

/**
 * Properties for defining a `CfnUsagePlanKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnUsagePlanKeyProps cfnUsagePlanKeyProps = CfnUsagePlanKeyProps.builder()
 * .keyId("keyId")
 * .keyType("keyType")
 * .usagePlanId("usagePlanId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
 */
@CdkDslMarker
public class CfnUsagePlanKeyPropsDsl {
  private val cdkBuilder: CfnUsagePlanKeyProps.Builder = CfnUsagePlanKeyProps.builder()

  /**
   * @param keyId The Id of the UsagePlanKey resource. 
   */
  public fun keyId(keyId: String) {
    cdkBuilder.keyId(keyId)
  }

  /**
   * @param keyType The type of a UsagePlanKey resource for a plan customer. 
   */
  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  /**
   * @param usagePlanId The Id of the UsagePlan resource representing the usage plan containing the
   * UsagePlanKey resource representing a plan customer. 
   */
  public fun usagePlanId(usagePlanId: String) {
    cdkBuilder.usagePlanId(usagePlanId)
  }

  public fun build(): CfnUsagePlanKeyProps = cdkBuilder.build()
}
