@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A container for the UI customization information for the hosted UI in a user pool.
 *
 * This data type is a response parameter of
 * [GetUICustomization](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPoolClient.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolUICustomizationAttachment cfnUserPoolUICustomizationAttachment =
 * CfnUserPoolUICustomizationAttachment.Builder.create(this, "MyCfnUserPoolUICustomizationAttachment")
 * .clientId("clientId")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .css("css")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html)
 */
public open class CfnUserPoolUICustomizationAttachment(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolUICustomizationAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserPoolUICustomizationAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolUICustomizationAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolUICustomizationAttachmentProps(props)
  )

  /**
   * The app client ID for your UI customization.
   */
  public open fun clientId(): String = unwrap(this).getClientId()

  /**
   * The app client ID for your UI customization.
   */
  public open fun clientId(`value`: String) {
    unwrap(this).setClientId(`value`)
  }

  /**
   * The CSS values in the UI customization.
   */
  public open fun css(): String? = unwrap(this).getCss()

  /**
   * The CSS values in the UI customization.
   */
  public open fun css(`value`: String) {
    unwrap(this).setCss(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The user pool ID for the user pool.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID for the user pool.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The app client ID for your UI customization.
     *
     * When this value isn't present, the customization applies to all user pool app clients that
     * don't have client-level settings..
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-clientid)
     * @param clientId The app client ID for your UI customization. 
     */
    public fun clientId(clientId: String)

    /**
     * The CSS values in the UI customization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-css)
     * @param css The CSS values in the UI customization. 
     */
    public fun css(css: String)

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-userpoolid)
     * @param userPoolId The user pool ID for the user pool. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment.Builder.create(scope,
        id)

    /**
     * The app client ID for your UI customization.
     *
     * When this value isn't present, the customization applies to all user pool app clients that
     * don't have client-level settings..
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-clientid)
     * @param clientId The app client ID for your UI customization. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * The CSS values in the UI customization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-css)
     * @param css The CSS values in the UI customization. 
     */
    override fun css(css: String) {
      cdkBuilder.css(css)
    }

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-userpoolid)
     * @param userPoolId The user pool ID for the user pool. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolUICustomizationAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolUICustomizationAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment):
        CfnUserPoolUICustomizationAttachment = CfnUserPoolUICustomizationAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUICustomizationAttachment):
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment =
        wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
  }
}
