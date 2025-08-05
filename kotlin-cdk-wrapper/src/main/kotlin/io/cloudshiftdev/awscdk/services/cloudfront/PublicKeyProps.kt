@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for creating a Public Key.
 *
 * Example:
 *
 * ```
 * // Create a key group to use with CloudFront signed URLs and signed cookies.
 * // Create a key group to use with CloudFront signed URLs and signed cookies.
 * KeyGroup.Builder.create(this, "MyKeyGroup")
 * .items(List.of(
 * PublicKey.Builder.create(this, "MyPublicKey")
 * .encodedKey("...")
 * .build()))
 * .build();
 * ```
 */
public interface PublicKeyProps {
  /**
   * A comment to describe the public key.
   *
   * Default: - no comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The public key that you can use with signed URLs and signed cookies, or with field-level
   * encryption.
   *
   * The `encodedKey` parameter must include `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC
   * KEY-----` lines.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   */
  public fun encodedKey(): String

  /**
   * A name to identify the public key.
   *
   * Default: - generated from the `id`
   */
  public fun publicKeyName(): String? = unwrap(this).getPublicKeyName()

  /**
   * A builder for [PublicKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment to describe the public key.
     */
    public fun comment(comment: String)

    /**
     * @param encodedKey The public key that you can use with signed URLs and signed cookies, or
     * with field-level encryption. 
     * The `encodedKey` parameter must include `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC
     * KEY-----` lines.
     */
    public fun encodedKey(encodedKey: String)

    /**
     * @param publicKeyName A name to identify the public key.
     */
    public fun publicKeyName(publicKeyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.PublicKeyProps.Builder =
        software.amazon.awscdk.services.cloudfront.PublicKeyProps.builder()

    /**
     * @param comment A comment to describe the public key.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param encodedKey The public key that you can use with signed URLs and signed cookies, or
     * with field-level encryption. 
     * The `encodedKey` parameter must include `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC
     * KEY-----` lines.
     */
    override fun encodedKey(encodedKey: String) {
      cdkBuilder.encodedKey(encodedKey)
    }

    /**
     * @param publicKeyName A name to identify the public key.
     */
    override fun publicKeyName(publicKeyName: String) {
      cdkBuilder.publicKeyName(publicKeyName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.PublicKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.PublicKeyProps,
  ) : CdkObject(cdkObject),
      PublicKeyProps {
    /**
     * A comment to describe the public key.
     *
     * Default: - no comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The public key that you can use with signed URLs and signed cookies, or with field-level
     * encryption.
     *
     * The `encodedKey` parameter must include `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC
     * KEY-----` lines.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     */
    override fun encodedKey(): String = unwrap(this).getEncodedKey()

    /**
     * A name to identify the public key.
     *
     * Default: - generated from the `id`
     */
    override fun publicKeyName(): String? = unwrap(this).getPublicKeyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PublicKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.PublicKeyProps):
        PublicKeyProps = CdkObjectWrappers.wrap(cdkObject) as? PublicKeyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicKeyProps):
        software.amazon.awscdk.services.cloudfront.PublicKeyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.PublicKeyProps
  }
}
