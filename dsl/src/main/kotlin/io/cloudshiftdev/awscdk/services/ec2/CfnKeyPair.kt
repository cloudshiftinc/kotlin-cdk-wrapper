package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnKeyPair internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnKeyPair,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * If you created the key pair using Amazon EC2:.
   *
   * * For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
   * * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the
   * default for OpenSSH, starting with [OpenSSH
   * 6.8](https://docs.aws.amazon.com/http://www.openssh.com/txt/release-6.8) .
   *
   * If you imported the key pair to Amazon EC2:
   *
   * * For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in
   * section 4 of RFC 4716.
   * * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the
   * default for OpenSSH, starting with [OpenSSH
   * 6.8](https://docs.aws.amazon.com/http://www.openssh.com/txt/release-6.8) .
   */
  public open fun attrKeyFingerprint(): String = unwrap(this).getAttrKeyFingerprint()

  /**
   * The ID of the key pair.
   */
  public open fun attrKeyPairId(): String = unwrap(this).getAttrKeyPairId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The format of the key pair.
   */
  public open fun keyFormat(): String? = unwrap(this).getKeyFormat()

  /**
   * The format of the key pair.
   */
  public open fun keyFormat(`value`: String) {
    unwrap(this).setKeyFormat(`value`)
  }

  /**
   * A unique name for the key pair.
   */
  public open fun keyName(): String = unwrap(this).getKeyName()

  /**
   * A unique name for the key pair.
   */
  public open fun keyName(`value`: String) {
    unwrap(this).setKeyName(`value`)
  }

  /**
   * The type of key pair.
   *
   * Note that ED25519 keys are not supported for Windows instances.
   */
  public open fun keyType(): String? = unwrap(this).getKeyType()

  /**
   * The type of key pair.
   *
   * Note that ED25519 keys are not supported for Windows instances.
   */
  public open fun keyType(`value`: String) {
    unwrap(this).setKeyType(`value`)
  }

  /**
   * The public key material.
   */
  public open fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  /**
   * The public key material.
   */
  public open fun publicKeyMaterial(`value`: String) {
    unwrap(this).setPublicKeyMaterial(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to apply to the key pair.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to apply to the key pair.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to apply to the key pair.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnKeyPair].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The format of the key pair.
     *
     * Default: `pem`
     *
     * Default: - "pem"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyformat)
     * @param keyFormat The format of the key pair. 
     */
    public fun keyFormat(keyFormat: String)

    /**
     * A unique name for the key pair.
     *
     * Constraints: Up to 255 ASCII characters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyname)
     * @param keyName A unique name for the key pair. 
     */
    public fun keyName(keyName: String)

    /**
     * The type of key pair. Note that ED25519 keys are not supported for Windows instances.
     *
     * If the `PublicKeyMaterial` property is specified, the `KeyType` property is ignored, and the
     * key type is inferred from the `PublicKeyMaterial` value.
     *
     * Default: `rsa`
     *
     * Default: - "rsa"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keytype)
     * @param keyType The type of key pair. Note that ED25519 keys are not supported for Windows
     * instances. 
     */
    public fun keyType(keyType: String)

    /**
     * The public key material.
     *
     * The `PublicKeyMaterial` property is used to import a key pair. If this property is not
     * specified, then a new key pair will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-publickeymaterial)
     * @param publicKeyMaterial The public key material. 
     */
    public fun publicKeyMaterial(publicKeyMaterial: String)

    /**
     * The tags to apply to the key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-tags)
     * @param tags The tags to apply to the key pair. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to apply to the key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-tags)
     * @param tags The tags to apply to the key pair. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnKeyPair.Builder =
        software.amazon.awscdk.services.ec2.CfnKeyPair.Builder.create(scope, id)

    /**
     * The format of the key pair.
     *
     * Default: `pem`
     *
     * Default: - "pem"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyformat)
     * @param keyFormat The format of the key pair. 
     */
    override fun keyFormat(keyFormat: String) {
      cdkBuilder.keyFormat(keyFormat)
    }

    /**
     * A unique name for the key pair.
     *
     * Constraints: Up to 255 ASCII characters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyname)
     * @param keyName A unique name for the key pair. 
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * The type of key pair. Note that ED25519 keys are not supported for Windows instances.
     *
     * If the `PublicKeyMaterial` property is specified, the `KeyType` property is ignored, and the
     * key type is inferred from the `PublicKeyMaterial` value.
     *
     * Default: `rsa`
     *
     * Default: - "rsa"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keytype)
     * @param keyType The type of key pair. Note that ED25519 keys are not supported for Windows
     * instances. 
     */
    override fun keyType(keyType: String) {
      cdkBuilder.keyType(keyType)
    }

    /**
     * The public key material.
     *
     * The `PublicKeyMaterial` property is used to import a key pair. If this property is not
     * specified, then a new key pair will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-publickeymaterial)
     * @param publicKeyMaterial The public key material. 
     */
    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    /**
     * The tags to apply to the key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-tags)
     * @param tags The tags to apply to the key pair. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to apply to the key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-tags)
     * @param tags The tags to apply to the key pair. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnKeyPair = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeyPair {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeyPair(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnKeyPair): CfnKeyPair =
        CfnKeyPair(cdkObject)

    internal fun unwrap(wrapped: CfnKeyPair): software.amazon.awscdk.services.ec2.CfnKeyPair =
        wrapped.cdkObject
  }
}
