@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnUsagePlanKey
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::UsagePlanKey` resource associates an API key with a usage plan.
 *
 * This association determines which users the usage plan is applied to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnUsagePlanKey cfnUsagePlanKey = CfnUsagePlanKey.Builder.create(this, "MyCfnUsagePlanKey")
 * .keyId("keyId")
 * .keyType("keyType")
 * .usagePlanId("usagePlanId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
 */
@CdkDslMarker
public class CfnUsagePlanKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUsagePlanKey.Builder = CfnUsagePlanKey.Builder.create(scope, id)

  /**
   * The Id of the UsagePlanKey resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
   * @param keyId The Id of the UsagePlanKey resource. 
   */
  public fun keyId(keyId: String) {
    cdkBuilder.keyId(keyId)
  }

  /**
   * The type of a UsagePlanKey resource for a plan customer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
   * @param keyType The type of a UsagePlanKey resource for a plan customer. 
   */
  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  /**
   * The Id of the UsagePlan resource representing the usage plan containing the UsagePlanKey
   * resource representing a plan customer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
   * @param usagePlanId The Id of the UsagePlan resource representing the usage plan containing the
   * UsagePlanKey resource representing a plan customer. 
   */
  public fun usagePlanId(usagePlanId: String) {
    cdkBuilder.usagePlanId(usagePlanId)
  }

  public fun build(): CfnUsagePlanKey = cdkBuilder.build()
}
