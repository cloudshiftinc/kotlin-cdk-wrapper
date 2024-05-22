@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPublicKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnPublicKeyProps cfnPublicKeyProps = CfnPublicKeyProps.builder()
 * .publicKeyConfig(PublicKeyConfigProperty.builder()
 * .callerReference("callerReference")
 * .encodedKey("encodedKey")
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html)
 */
public interface CfnPublicKeyProps {
  /**
   * Configuration information about a public key that you can use with [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
   */
  public fun publicKeyConfig(): Any

  /**
   * A builder for [CfnPublicKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    public fun publicKeyConfig(publicKeyConfig: IResolvable)

    /**
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    public fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty)

    /**
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("668258ebd243d2e60b2cac045f934d9bece5add5db46f94c9cb13c6c8fcadafd")
    public
        fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps.builder()

    /**
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    override fun publicKeyConfig(publicKeyConfig: IResolvable) {
      cdkBuilder.publicKeyConfig(publicKeyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    override fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty) {
      cdkBuilder.publicKeyConfig(publicKeyConfig.let(CfnPublicKey.PublicKeyConfigProperty.Companion::unwrap))
    }

    /**
     * @param publicKeyConfig Configuration information about a public key that you can use with
     * [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("668258ebd243d2e60b2cac045f934d9bece5add5db46f94c9cb13c6c8fcadafd")
    override
        fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty.Builder.() -> Unit):
        Unit = publicKeyConfig(CfnPublicKey.PublicKeyConfigProperty(publicKeyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps,
  ) : CdkObject(cdkObject), CfnPublicKeyProps {
    /**
     * Configuration information about a public key that you can use with [signed URLs and signed
     * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with [field-level
     * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
     */
    override fun publicKeyConfig(): Any = unwrap(this).getPublicKeyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps):
        CfnPublicKeyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPublicKeyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublicKeyProps):
        software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps
  }
}
