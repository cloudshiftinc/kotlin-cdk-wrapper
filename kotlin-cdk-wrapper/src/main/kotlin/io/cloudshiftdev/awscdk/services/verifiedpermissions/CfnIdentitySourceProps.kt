@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIdentitySource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
 * CfnIdentitySourceProps cfnIdentitySourceProps = CfnIdentitySourceProps.builder()
 * .configuration(IdentitySourceConfigurationProperty.builder()
 * .cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty.builder()
 * .userPoolArn("userPoolArn")
 * // the properties below are optional
 * .clientIds(List.of("clientIds"))
 * .build())
 * .build())
 * .policyStoreId("policyStoreId")
 * // the properties below are optional
 * .principalEntityType("principalEntityType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html)
 */
public interface CfnIdentitySourceProps {
  /**
   * Contains configuration information used when creating a new identity source.
   *
   *
   * At this time, the only valid member of this structure is a Amazon Cognito user pool
   * configuration.
   *
   * You must specify a `userPoolArn` , and optionally, a `ClientId` .
   *
   *
   * This data type is used as a request parameter for the
   * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
   * operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
   */
  public fun configuration(): Any

  /**
   * Specifies the ID of the policy store in which you want to store this identity source.
   *
   * Only policies and requests made using this policy store can reference identities from the
   * identity provider configured in the new identity source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-policystoreid)
   */
  public fun policyStoreId(): String

  /**
   * Specifies the namespace and data type of the principals generated for identities authenticated
   * by the new identity source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-principalentitytype)
   */
  public fun principalEntityType(): String? = unwrap(this).getPrincipalEntityType()

  /**
   * A builder for [CfnIdentitySourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     */
    public fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty)

    /**
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b629a9e57b120a7a975fd1c6bbec319e646a4f38b1564a226380c164c79c8c2f")
    public
        fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param policyStoreId Specifies the ID of the policy store in which you want to store this
     * identity source. 
     * Only policies and requests made using this policy store can reference identities from the
     * identity provider configured in the new identity source.
     */
    public fun policyStoreId(policyStoreId: String)

    /**
     * @param principalEntityType Specifies the namespace and data type of the principals generated
     * for identities authenticated by the new identity source.
     */
    public fun principalEntityType(principalEntityType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps.builder()

    /**
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     */
    override
        fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnIdentitySource.IdentitySourceConfigurationProperty::unwrap))
    }

    /**
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b629a9e57b120a7a975fd1c6bbec319e646a4f38b1564a226380c164c79c8c2f")
    override
        fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnIdentitySource.IdentitySourceConfigurationProperty(configuration))

    /**
     * @param policyStoreId Specifies the ID of the policy store in which you want to store this
     * identity source. 
     * Only policies and requests made using this policy store can reference identities from the
     * identity provider configured in the new identity source.
     */
    override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    /**
     * @param principalEntityType Specifies the namespace and data type of the principals generated
     * for identities authenticated by the new identity source.
     */
    override fun principalEntityType(principalEntityType: String) {
      cdkBuilder.principalEntityType(principalEntityType)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps,
  ) : CdkObject(cdkObject), CfnIdentitySourceProps {
    /**
     * Contains configuration information used when creating a new identity source.
     *
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()

    /**
     * Specifies the ID of the policy store in which you want to store this identity source.
     *
     * Only policies and requests made using this policy store can reference identities from the
     * identity provider configured in the new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-policystoreid)
     */
    override fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

    /**
     * Specifies the namespace and data type of the principals generated for identities
     * authenticated by the new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-principalentitytype)
     */
    override fun principalEntityType(): String? = unwrap(this).getPrincipalEntityType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentitySourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps):
        CfnIdentitySourceProps = CdkObjectWrappers.wrap(cdkObject) as CfnIdentitySourceProps

    internal fun unwrap(wrapped: CfnIdentitySourceProps):
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps
  }
}
