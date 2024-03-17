@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnUserPoolUICustomizationAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolUICustomizationAttachmentProps cfnUserPoolUICustomizationAttachmentProps =
 * CfnUserPoolUICustomizationAttachmentProps.builder()
 * .clientId("clientId")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .css("css")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html)
 */
public interface CfnUserPoolUICustomizationAttachmentProps {
  /**
   * The client ID for the client app.
   *
   * You can specify the UI customization settings for a single client (with a specific clientId) or
   * for all clients (by setting the clientId to `ALL` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-clientid)
   */
  public fun clientId(): String

  /**
   * The CSS values in the UI customization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-css)
   */
  public fun css(): String? = unwrap(this).getCss()

  /**
   * The user pool ID for the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnUserPoolUICustomizationAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientId The client ID for the client app. 
     * You can specify the UI customization settings for a single client (with a specific clientId)
     * or for all clients (by setting the clientId to `ALL` ).
     */
    public fun clientId(clientId: String)

    /**
     * @param css The CSS values in the UI customization.
     */
    public fun css(css: String)

    /**
     * @param userPoolId The user pool ID for the user pool. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps.builder()

    /**
     * @param clientId The client ID for the client app. 
     * You can specify the UI customization settings for a single client (with a specific clientId)
     * or for all clients (by setting the clientId to `ALL` ).
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param css The CSS values in the UI customization.
     */
    override fun css(css: String) {
      cdkBuilder.css(css)
    }

    /**
     * @param userPoolId The user pool ID for the user pool. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps,
  ) : CdkObject(cdkObject), CfnUserPoolUICustomizationAttachmentProps {
    /**
     * The client ID for the client app.
     *
     * You can specify the UI customization settings for a single client (with a specific clientId)
     * or for all clients (by setting the clientId to `ALL` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-clientid)
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The CSS values in the UI customization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-css)
     */
    override fun css(): String? = unwrap(this).getCss()

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnUserPoolUICustomizationAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps):
        CfnUserPoolUICustomizationAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnUserPoolUICustomizationAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUICustomizationAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps
  }
}
