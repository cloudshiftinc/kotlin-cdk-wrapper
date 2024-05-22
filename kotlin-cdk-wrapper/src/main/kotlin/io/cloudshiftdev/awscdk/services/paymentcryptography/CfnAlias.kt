@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.paymentcryptography

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an *alias* , or a friendly name, for an AWS Payment Cryptography key.
 *
 * You can use an alias to identify a key in the console and when you call cryptographic operations
 * such as
 * [EncryptData](https://docs.aws.amazon.com/payment-cryptography/latest/DataAPIReference/API_EncryptData.html)
 * or
 * [DecryptData](https://docs.aws.amazon.com/payment-cryptography/latest/DataAPIReference/API_DecryptData.html)
 * .
 *
 * You can associate the alias with any key in the same AWS Region . Each alias is associated with
 * only one key at a time, but a key can have multiple aliases. You can't create an alias without a
 * key. The alias must be unique in the account and AWS Region , but you can create another alias with
 * the same name in a different AWS Region .
 *
 * To change the key that's associated with the alias, call
 * [UpdateAlias](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_UpdateAlias.html)
 * . To delete the alias, call
 * [DeleteAlias](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_DeleteAlias.html)
 * . These operations don't affect the underlying key. To get the alias that you created, call
 * [ListAliases](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ListAliases.html)
 * .
 *
 * *Cross-account use* : This operation can't be used across different AWS accounts.
 *
 * *Related operations:*
 *
 * *
 * [DeleteAlias](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_DeleteAlias.html)
 * *
 * [GetAlias](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetAlias.html)
 * *
 * [ListAliases](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ListAliases.html)
 * *
 * [UpdateAlias](https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_UpdateAlias.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.paymentcryptography.*;
 * CfnAlias cfnAlias = CfnAlias.Builder.create(this, "MyCfnAlias")
 * .aliasName("aliasName")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html)
 */
public open class CfnAlias(
  cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnAlias,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAliasProps,
  ) :
      this(software.amazon.awscdk.services.paymentcryptography.CfnAlias(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAliasProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAliasProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAliasProps(props)
  )

  /**
   * A friendly name that you can use to refer to a key.
   *
   * The value must begin with `alias/` .
   */
  public open fun aliasName(): String = unwrap(this).getAliasName()

  /**
   * A friendly name that you can use to refer to a key.
   *
   * The value must begin with `alias/` .
   */
  public open fun aliasName(`value`: String) {
    unwrap(this).setAliasName(`value`)
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
   * The `KeyARN` of the key associated with the alias.
   */
  public open fun keyArn(): String? = unwrap(this).getKeyArn()

  /**
   * The `KeyARN` of the key associated with the alias.
   */
  public open fun keyArn(`value`: String) {
    unwrap(this).setKeyArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.paymentcryptography.CfnAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A friendly name that you can use to refer to a key. The value must begin with `alias/` .
     *
     *
     * Do not include confidential or sensitive information in this field. This field may be
     * displayed in plaintext in AWS CloudTrail logs and other output.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html#cfn-paymentcryptography-alias-aliasname)
     * @param aliasName A friendly name that you can use to refer to a key. The value must begin
     * with `alias/` . 
     */
    public fun aliasName(aliasName: String)

    /**
     * The `KeyARN` of the key associated with the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html#cfn-paymentcryptography-alias-keyarn)
     * @param keyArn The `KeyARN` of the key associated with the alias. 
     */
    public fun keyArn(keyArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.paymentcryptography.CfnAlias.Builder =
        software.amazon.awscdk.services.paymentcryptography.CfnAlias.Builder.create(scope, id)

    /**
     * A friendly name that you can use to refer to a key. The value must begin with `alias/` .
     *
     *
     * Do not include confidential or sensitive information in this field. This field may be
     * displayed in plaintext in AWS CloudTrail logs and other output.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html#cfn-paymentcryptography-alias-aliasname)
     * @param aliasName A friendly name that you can use to refer to a key. The value must begin
     * with `alias/` . 
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * The `KeyARN` of the key associated with the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html#cfn-paymentcryptography-alias-keyarn)
     * @param keyArn The `KeyARN` of the key associated with the alias. 
     */
    override fun keyArn(keyArn: String) {
      cdkBuilder.keyArn(keyArn)
    }

    public fun build(): software.amazon.awscdk.services.paymentcryptography.CfnAlias =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.paymentcryptography.CfnAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnAlias):
        CfnAlias = CfnAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAlias):
        software.amazon.awscdk.services.paymentcryptography.CfnAlias = wrapped.cdkObject as
        software.amazon.awscdk.services.paymentcryptography.CfnAlias
  }
}
