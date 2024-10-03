@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Public Key Configuration.
 *
 * Example:
 *
 * ```
 * // Validating signed URLs or signed cookies with Trusted Key Groups
 * // public key in PEM format
 * String publicKey;
 * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
 * .encodedKey(publicKey)
 * .build();
 * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
 * .items(List.of(pubKey))
 * .build();
 * Distribution.Builder.create(this, "Dist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new HttpOrigin("www.example.com"))
 * .trustedKeyGroups(List.of(keyGroup))
 * .build())
 * .build();
 * ```
 */
public open class PublicKey(
  cdkObject: software.amazon.awscdk.services.cloudfront.PublicKey,
) : Resource(cdkObject),
    IPublicKey {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PublicKeyProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.PublicKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(PublicKeyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PublicKeyProps.Builder.() -> Unit,
  ) : this(scope, id, PublicKeyProps(props)
  )

  /**
   * The ID of the key group.
   */
  public override fun publicKeyId(): String = unwrap(this).getPublicKeyId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.PublicKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment to describe the public key.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the public key. 
     */
    public fun comment(comment: String)

    /**
     * The public key that you can use with signed URLs and signed cookies, or with field-level
     * encryption.
     *
     * The `encodedKey` parameter must include `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC
     * KEY-----` lines.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * @param encodedKey The public key that you can use with signed URLs and signed cookies, or
     * with field-level encryption. 
     */
    public fun encodedKey(encodedKey: String)

    /**
     * A name to identify the public key.
     *
     * Default: - generated from the `id`
     *
     * @param publicKeyName A name to identify the public key. 
     */
    public fun publicKeyName(publicKeyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.PublicKey.Builder =
        software.amazon.awscdk.services.cloudfront.PublicKey.Builder.create(scope, id)

    /**
     * A comment to describe the public key.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the public key. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The public key that you can use with signed URLs and signed cookies, or with field-level
     * encryption.
     *
     * The `encodedKey` parameter must include `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC
     * KEY-----` lines.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * @param encodedKey The public key that you can use with signed URLs and signed cookies, or
     * with field-level encryption. 
     */
    override fun encodedKey(encodedKey: String) {
      cdkBuilder.encodedKey(encodedKey)
    }

    /**
     * A name to identify the public key.
     *
     * Default: - generated from the `id`
     *
     * @param publicKeyName A name to identify the public key. 
     */
    override fun publicKeyName(publicKeyName: String) {
      cdkBuilder.publicKeyName(publicKeyName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.PublicKey = cdkBuilder.build()
  }

  public companion object {
    public fun fromPublicKeyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      publicKeyId: String,
    ): IPublicKey =
        software.amazon.awscdk.services.cloudfront.PublicKey.fromPublicKeyId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, publicKeyId).let(IPublicKey::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PublicKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PublicKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.PublicKey): PublicKey =
        PublicKey(cdkObject)

    internal fun unwrap(wrapped: PublicKey): software.amazon.awscdk.services.cloudfront.PublicKey =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudfront.PublicKey
  }
}
