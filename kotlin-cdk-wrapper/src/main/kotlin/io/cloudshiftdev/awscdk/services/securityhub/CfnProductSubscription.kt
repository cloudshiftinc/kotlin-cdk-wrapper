@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::ProductSubscription` resource creates a subscription to a third-party
 * product that generates findings that you want to receive in AWS Security Hub .
 *
 * For a list of integrations to third-party products, see [Available third-party partner product
 * integrations](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-partner-providers.html)
 * in the *AWS Security Hub User Guide* .
 *
 * To change a product subscription, remove the current product subscription resource, and then
 * create a new one.
 *
 * Tags aren't supported for this resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnProductSubscription cfnProductSubscription = CfnProductSubscription.Builder.create(this,
 * "MyCfnProductSubscription")
 * .productArn("productArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-productsubscription.html)
 */
public open class CfnProductSubscription(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnProductSubscription,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProductSubscriptionProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnProductSubscription(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProductSubscriptionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProductSubscriptionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProductSubscriptionProps(props)
  )

  /**
   * The ARN of your subscription to the product to enable integrations for.
   */
  public open fun attrProductSubscriptionArn(): String =
      unwrap(this).getAttrProductSubscriptionArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the product to enable the integration for.
   */
  public open fun productArn(): String = unwrap(this).getProductArn()

  /**
   * The ARN of the product to enable the integration for.
   */
  public open fun productArn(`value`: String) {
    unwrap(this).setProductArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnProductSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the product to enable the integration for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-productsubscription.html#cfn-securityhub-productsubscription-productarn)
     * @param productArn The ARN of the product to enable the integration for. 
     */
    public fun productArn(productArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnProductSubscription.Builder =
        software.amazon.awscdk.services.securityhub.CfnProductSubscription.Builder.create(scope, id)

    /**
     * The ARN of the product to enable the integration for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-productsubscription.html#cfn-securityhub-productsubscription-productarn)
     * @param productArn The ARN of the product to enable the integration for. 
     */
    override fun productArn(productArn: String) {
      cdkBuilder.productArn(productArn)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnProductSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnProductSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProductSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProductSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnProductSubscription):
        CfnProductSubscription = CfnProductSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnProductSubscription):
        software.amazon.awscdk.services.securityhub.CfnProductSubscription = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnProductSubscription
  }
}
