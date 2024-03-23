@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A list of the identity pool principal tag assignments for attributes for access control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object principalTags;
 * CfnIdentityPoolPrincipalTag cfnIdentityPoolPrincipalTag =
 * CfnIdentityPoolPrincipalTag.Builder.create(this, "MyCfnIdentityPoolPrincipalTag")
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
public open class CfnIdentityPoolPrincipalTag(
  cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentityPoolPrincipalTagProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnIdentityPoolPrincipalTagProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentityPoolPrincipalTagProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIdentityPoolPrincipalTagProps(props)
  )

  /**
   * The identity pool that you want to associate with this principal tag map.
   */
  public open fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

  /**
   * The identity pool that you want to associate with this principal tag map.
   */
  public open fun identityPoolId(`value`: String) {
    unwrap(this).setIdentityPoolId(`value`)
  }

  /**
   * The identity pool identity provider (IdP) that you want to associate with this principal tag
   * map.
   */
  public open fun identityProviderName(): String = unwrap(this).getIdentityProviderName()

  /**
   * The identity pool identity provider (IdP) that you want to associate with this principal tag
   * map.
   */
  public open fun identityProviderName(`value`: String) {
    unwrap(this).setIdentityProviderName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A JSON-formatted list of user claims and the principal tags that you want to associate with
   * them.
   */
  public open fun principalTags(): Any? = unwrap(this).getPrincipalTags()

  /**
   * A JSON-formatted list of user claims and the principal tags that you want to associate with
   * them.
   */
  public open fun principalTags(`value`: Any) {
    unwrap(this).setPrincipalTags(`value`)
  }

  /**
   * Use a default set of mappings between claims and tags for this provider, instead of a custom
   * map.
   */
  public open fun useDefaults(): Any? = unwrap(this).getUseDefaults()

  /**
   * Use a default set of mappings between claims and tags for this provider, instead of a custom
   * map.
   */
  public open fun useDefaults(`value`: Boolean) {
    unwrap(this).setUseDefaults(`value`)
  }

  /**
   * Use a default set of mappings between claims and tags for this provider, instead of a custom
   * map.
   */
  public open fun useDefaults(`value`: IResolvable) {
    unwrap(this).setUseDefaults(`value`.let(IResolvable::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnIdentityPoolPrincipalTag].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identity pool that you want to associate with this principal tag map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identitypoolid)
     * @param identityPoolId The identity pool that you want to associate with this principal tag
     * map. 
     */
    public fun identityPoolId(identityPoolId: String)

    /**
     * The identity pool identity provider (IdP) that you want to associate with this principal tag
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identityprovidername)
     * @param identityProviderName The identity pool identity provider (IdP) that you want to
     * associate with this principal tag map. 
     */
    public fun identityProviderName(identityProviderName: String)

    /**
     * A JSON-formatted list of user claims and the principal tags that you want to associate with
     * them.
     *
     * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
     * of the user's claim.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-principaltags)
     * @param principalTags A JSON-formatted list of user claims and the principal tags that you
     * want to associate with them. 
     */
    public fun principalTags(principalTags: Any)

    /**
     * Use a default set of mappings between claims and tags for this provider, instead of a custom
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-usedefaults)
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     * instead of a custom map. 
     */
    public fun useDefaults(useDefaults: Boolean)

    /**
     * Use a default set of mappings between claims and tags for this provider, instead of a custom
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-usedefaults)
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     * instead of a custom map. 
     */
    public fun useDefaults(useDefaults: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag.Builder.create(scope,
        id)

    /**
     * The identity pool that you want to associate with this principal tag map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identitypoolid)
     * @param identityPoolId The identity pool that you want to associate with this principal tag
     * map. 
     */
    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * The identity pool identity provider (IdP) that you want to associate with this principal tag
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identityprovidername)
     * @param identityProviderName The identity pool identity provider (IdP) that you want to
     * associate with this principal tag map. 
     */
    override fun identityProviderName(identityProviderName: String) {
      cdkBuilder.identityProviderName(identityProviderName)
    }

    /**
     * A JSON-formatted list of user claims and the principal tags that you want to associate with
     * them.
     *
     * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
     * of the user's claim.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-principaltags)
     * @param principalTags A JSON-formatted list of user claims and the principal tags that you
     * want to associate with them. 
     */
    override fun principalTags(principalTags: Any) {
      cdkBuilder.principalTags(principalTags)
    }

    /**
     * Use a default set of mappings between claims and tags for this provider, instead of a custom
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-usedefaults)
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     * instead of a custom map. 
     */
    override fun useDefaults(useDefaults: Boolean) {
      cdkBuilder.useDefaults(useDefaults)
    }

    /**
     * Use a default set of mappings between claims and tags for this provider, instead of a custom
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-usedefaults)
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     * instead of a custom map. 
     */
    override fun useDefaults(useDefaults: IResolvable) {
      cdkBuilder.useDefaults(useDefaults.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentityPoolPrincipalTag {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentityPoolPrincipalTag(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag):
        CfnIdentityPoolPrincipalTag = CfnIdentityPoolPrincipalTag(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolPrincipalTag):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag
  }
}
