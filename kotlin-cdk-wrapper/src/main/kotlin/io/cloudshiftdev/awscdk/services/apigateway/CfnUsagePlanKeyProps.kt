@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnUsagePlanKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnUsagePlanKeyProps cfnUsagePlanKeyProps = CfnUsagePlanKeyProps.builder()
 * .keyId("keyId")
 * .keyType("keyType")
 * .usagePlanId("usagePlanId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
 */
public interface CfnUsagePlanKeyProps {
  /**
   * The Id of the UsagePlanKey resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
   */
  public fun keyId(): String

  /**
   * The type of a UsagePlanKey resource for a plan customer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
   */
  public fun keyType(): String

  /**
   * The Id of the UsagePlan resource representing the usage plan containing the UsagePlanKey
   * resource representing a plan customer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
   */
  public fun usagePlanId(): String

  /**
   * A builder for [CfnUsagePlanKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param keyId The Id of the UsagePlanKey resource. 
     */
    public fun keyId(keyId: String)

    /**
     * @param keyType The type of a UsagePlanKey resource for a plan customer. 
     */
    public fun keyType(keyType: String)

    /**
     * @param usagePlanId The Id of the UsagePlan resource representing the usage plan containing
     * the UsagePlanKey resource representing a plan customer. 
     */
    public fun usagePlanId(usagePlanId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps.Builder
        = software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps.builder()

    /**
     * @param keyId The Id of the UsagePlanKey resource. 
     */
    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    /**
     * @param keyType The type of a UsagePlanKey resource for a plan customer. 
     */
    override fun keyType(keyType: String) {
      cdkBuilder.keyType(keyType)
    }

    /**
     * @param usagePlanId The Id of the UsagePlan resource representing the usage plan containing
     * the UsagePlanKey resource representing a plan customer. 
     */
    override fun usagePlanId(usagePlanId: String) {
      cdkBuilder.usagePlanId(usagePlanId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps,
  ) : CdkObject(cdkObject), CfnUsagePlanKeyProps {
    /**
     * The Id of the UsagePlanKey resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
     */
    override fun keyId(): String = unwrap(this).getKeyId()

    /**
     * The type of a UsagePlanKey resource for a plan customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
     */
    override fun keyType(): String = unwrap(this).getKeyType()

    /**
     * The Id of the UsagePlan resource representing the usage plan containing the UsagePlanKey
     * resource representing a plan customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
     */
    override fun usagePlanId(): String = unwrap(this).getUsagePlanId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUsagePlanKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps):
        CfnUsagePlanKeyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUsagePlanKeyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUsagePlanKeyProps):
        software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps
  }
}
