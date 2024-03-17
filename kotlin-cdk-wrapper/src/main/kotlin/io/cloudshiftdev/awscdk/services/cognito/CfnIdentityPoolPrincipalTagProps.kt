@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnIdentityPoolPrincipalTag`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object principalTags;
 * CfnIdentityPoolPrincipalTagProps cfnIdentityPoolPrincipalTagProps =
 * CfnIdentityPoolPrincipalTagProps.builder()
 * .identityPoolId("identityPoolId")
 * .identityProviderName("identityProviderName")
 * // the properties below are optional
 * .principalTags(principalTags)
 * .useDefaults(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html)
 */
public interface CfnIdentityPoolPrincipalTagProps {
  /**
   * The identity pool that you want to associate with this principal tag map.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identitypoolid)
   */
  public fun identityPoolId(): String

  /**
   * The identity pool identity provider (IdP) that you want to associate with this principal tag
   * map.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identityprovidername)
   */
  public fun identityProviderName(): String

  /**
   * A JSON-formatted list of user claims and the principal tags that you want to associate with
   * them.
   *
   * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
   * of the user's claim.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-principaltags)
   */
  public fun principalTags(): Any? = unwrap(this).getPrincipalTags()

  /**
   * Use a default set of mappings between claims and tags for this provider, instead of a custom
   * map.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-usedefaults)
   */
  public fun useDefaults(): Any? = unwrap(this).getUseDefaults()

  /**
   * A builder for [CfnIdentityPoolPrincipalTagProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identityPoolId The identity pool that you want to associate with this principal tag
     * map. 
     */
    public fun identityPoolId(identityPoolId: String)

    /**
     * @param identityProviderName The identity pool identity provider (IdP) that you want to
     * associate with this principal tag map. 
     */
    public fun identityProviderName(identityProviderName: String)

    /**
     * @param principalTags A JSON-formatted list of user claims and the principal tags that you
     * want to associate with them.
     * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
     * of the user's claim.
     */
    public fun principalTags(principalTags: Any)

    /**
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     * instead of a custom map.
     */
    public fun useDefaults(useDefaults: Boolean)

    /**
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     * instead of a custom map.
     */
    public fun useDefaults(useDefaults: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps.builder()

    /**
     * @param identityPoolId The identity pool that you want to associate with this principal tag
     * map. 
     */
    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param identityProviderName The identity pool identity provider (IdP) that you want to
     * associate with this principal tag map. 
     */
    override fun identityProviderName(identityProviderName: String) {
      cdkBuilder.identityProviderName(identityProviderName)
    }

    /**
     * @param principalTags A JSON-formatted list of user claims and the principal tags that you
     * want to associate with them.
     * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
     * of the user's claim.
     */
    override fun principalTags(principalTags: Any) {
      cdkBuilder.principalTags(principalTags)
    }

    /**
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     * instead of a custom map.
     */
    override fun useDefaults(useDefaults: Boolean) {
      cdkBuilder.useDefaults(useDefaults)
    }

    /**
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     * instead of a custom map.
     */
    override fun useDefaults(useDefaults: IResolvable) {
      cdkBuilder.useDefaults(useDefaults.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps,
  ) : CdkObject(cdkObject), CfnIdentityPoolPrincipalTagProps {
    /**
     * The identity pool that you want to associate with this principal tag map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identitypoolid)
     */
    override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    /**
     * The identity pool identity provider (IdP) that you want to associate with this principal tag
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identityprovidername)
     */
    override fun identityProviderName(): String = unwrap(this).getIdentityProviderName()

    /**
     * A JSON-formatted list of user claims and the principal tags that you want to associate with
     * them.
     *
     * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
     * of the user's claim.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-principaltags)
     */
    override fun principalTags(): Any? = unwrap(this).getPrincipalTags()

    /**
     * Use a default set of mappings between claims and tags for this provider, instead of a custom
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-usedefaults)
     */
    override fun useDefaults(): Any? = unwrap(this).getUseDefaults()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityPoolPrincipalTagProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps):
        CfnIdentityPoolPrincipalTagProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnIdentityPoolPrincipalTagProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolPrincipalTagProps):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps
  }
}
