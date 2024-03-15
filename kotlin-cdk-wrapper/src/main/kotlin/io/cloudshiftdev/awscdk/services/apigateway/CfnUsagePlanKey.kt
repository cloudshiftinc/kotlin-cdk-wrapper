@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnUsagePlanKey cfnUsagePlanKey = CfnUsagePlanKey.Builder.create(this, "MyCfnUsagePlanKey")
 * .keyId("keyId")
 * .keyType("keyType")
 * .usagePlanId("usagePlanId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
 */
public open class CfnUsagePlanKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanKey,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID for the usage plan key.
   *
   * For example: `abc123` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Id of the UsagePlanKey resource.
   */
  public open fun keyId(): String = unwrap(this).getKeyId()

  /**
   * The Id of the UsagePlanKey resource.
   */
  public open fun keyId(`value`: String) {
    unwrap(this).setKeyId(`value`)
  }

  /**
   * The type of a UsagePlanKey resource for a plan customer.
   */
  public open fun keyType(): String = unwrap(this).getKeyType()

  /**
   * The type of a UsagePlanKey resource for a plan customer.
   */
  public open fun keyType(`value`: String) {
    unwrap(this).setKeyType(`value`)
  }

  /**
   * The Id of the UsagePlan resource representing the usage plan containing the UsagePlanKey
   * resource representing a plan customer.
   */
  public open fun usagePlanId(): String = unwrap(this).getUsagePlanId()

  /**
   * The Id of the UsagePlan resource representing the usage plan containing the UsagePlanKey
   * resource representing a plan customer.
   */
  public open fun usagePlanId(`value`: String) {
    unwrap(this).setUsagePlanId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnUsagePlanKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Id of the UsagePlanKey resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
     * @param keyId The Id of the UsagePlanKey resource. 
     */
    public fun keyId(keyId: String)

    /**
     * The type of a UsagePlanKey resource for a plan customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
     * @param keyType The type of a UsagePlanKey resource for a plan customer. 
     */
    public fun keyType(keyType: String)

    /**
     * The Id of the UsagePlan resource representing the usage plan containing the UsagePlanKey
     * resource representing a plan customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
     * @param usagePlanId The Id of the UsagePlan resource representing the usage plan containing
     * the UsagePlanKey resource representing a plan customer. 
     */
    public fun usagePlanId(usagePlanId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnUsagePlanKey.Builder =
        software.amazon.awscdk.services.apigateway.CfnUsagePlanKey.Builder.create(scope, id)

    /**
     * The Id of the UsagePlanKey resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
     * @param keyId The Id of the UsagePlanKey resource. 
     */
    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    /**
     * The type of a UsagePlanKey resource for a plan customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
     * @param keyType The type of a UsagePlanKey resource for a plan customer. 
     */
    override fun keyType(keyType: String) {
      cdkBuilder.keyType(keyType)
    }

    /**
     * The Id of the UsagePlan resource representing the usage plan containing the UsagePlanKey
     * resource representing a plan customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
     * @param usagePlanId The Id of the UsagePlan resource representing the usage plan containing
     * the UsagePlanKey resource representing a plan customer. 
     */
    override fun usagePlanId(usagePlanId: String) {
      cdkBuilder.usagePlanId(usagePlanId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlanKey =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnUsagePlanKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUsagePlanKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUsagePlanKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanKey):
        CfnUsagePlanKey = CfnUsagePlanKey(cdkObject)

    internal fun unwrap(wrapped: CfnUsagePlanKey):
        software.amazon.awscdk.services.apigateway.CfnUsagePlanKey = wrapped.cdkObject
  }
}
