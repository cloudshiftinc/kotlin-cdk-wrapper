@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.paymentcryptography

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAlias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.paymentcryptography.*;
 * CfnAliasProps cfnAliasProps = CfnAliasProps.builder()
 * .aliasName("aliasName")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html)
 */
public interface CfnAliasProps {
  /**
   * A friendly name that you can use to refer to a key. The value must begin with `alias/` .
   *
   *
   * Do not include confidential or sensitive information in this field. This field may be displayed
   * in plaintext in AWS CloudTrail logs and other output.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html#cfn-paymentcryptography-alias-aliasname)
   */
  public fun aliasName(): String

  /**
   * The `KeyARN` of the key associated with the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html#cfn-paymentcryptography-alias-keyarn)
   */
  public fun keyArn(): String? = unwrap(this).getKeyArn()

  /**
   * A builder for [CfnAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aliasName A friendly name that you can use to refer to a key. The value must begin
     * with `alias/` . 
     *
     * Do not include confidential or sensitive information in this field. This field may be
     * displayed in plaintext in AWS CloudTrail logs and other output.
     */
    public fun aliasName(aliasName: String)

    /**
     * @param keyArn The `KeyARN` of the key associated with the alias.
     */
    public fun keyArn(keyArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.paymentcryptography.CfnAliasProps.Builder =
        software.amazon.awscdk.services.paymentcryptography.CfnAliasProps.builder()

    /**
     * @param aliasName A friendly name that you can use to refer to a key. The value must begin
     * with `alias/` . 
     *
     * Do not include confidential or sensitive information in this field. This field may be
     * displayed in plaintext in AWS CloudTrail logs and other output.
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * @param keyArn The `KeyARN` of the key associated with the alias.
     */
    override fun keyArn(keyArn: String) {
      cdkBuilder.keyArn(keyArn)
    }

    public fun build(): software.amazon.awscdk.services.paymentcryptography.CfnAliasProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnAliasProps,
  ) : CdkObject(cdkObject), CfnAliasProps {
    /**
     * A friendly name that you can use to refer to a key. The value must begin with `alias/` .
     *
     *
     * Do not include confidential or sensitive information in this field. This field may be
     * displayed in plaintext in AWS CloudTrail logs and other output.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html#cfn-paymentcryptography-alias-aliasname)
     */
    override fun aliasName(): String = unwrap(this).getAliasName()

    /**
     * The `KeyARN` of the key associated with the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-alias.html#cfn-paymentcryptography-alias-keyarn)
     */
    override fun keyArn(): String? = unwrap(this).getKeyArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnAliasProps):
        CfnAliasProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAliasProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAliasProps):
        software.amazon.awscdk.services.paymentcryptography.CfnAliasProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.paymentcryptography.CfnAliasProps
  }
}
