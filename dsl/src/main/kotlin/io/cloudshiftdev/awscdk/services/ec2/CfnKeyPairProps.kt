package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnKeyPairProps {
  /**
   * The format of the key pair.
   *
   * Default: `pem`
   *
   * Default: - "pem"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyformat)
   */
  public fun keyFormat(): String? = unwrap(this).getKeyFormat()

  /**
   * A unique name for the key pair.
   *
   * Constraints: Up to 255 ASCII characters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyname)
   */
  public fun keyName(): String

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
   */
  public fun keyType(): String? = unwrap(this).getKeyType()

  /**
   * The public key material.
   *
   * The `PublicKeyMaterial` property is used to import a key pair. If this property is not
   * specified, then a new key pair will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-publickeymaterial)
   */
  public fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  /**
   * The tags to apply to the key pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnKeyPairProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param keyFormat The format of the key pair.
     * Default: `pem`
     */
    public fun keyFormat(keyFormat: String)

    /**
     * @param keyName A unique name for the key pair. 
     * Constraints: Up to 255 ASCII characters
     */
    public fun keyName(keyName: String)

    /**
     * @param keyType The type of key pair. Note that ED25519 keys are not supported for Windows
     * instances.
     * If the `PublicKeyMaterial` property is specified, the `KeyType` property is ignored, and the
     * key type is inferred from the `PublicKeyMaterial` value.
     *
     * Default: `rsa`
     */
    public fun keyType(keyType: String)

    /**
     * @param publicKeyMaterial The public key material.
     * The `PublicKeyMaterial` property is used to import a key pair. If this property is not
     * specified, then a new key pair will be created.
     */
    public fun publicKeyMaterial(publicKeyMaterial: String)

    /**
     * @param tags The tags to apply to the key pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to apply to the key pair.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnKeyPairProps.Builder =
        software.amazon.awscdk.services.ec2.CfnKeyPairProps.builder()

    /**
     * @param keyFormat The format of the key pair.
     * Default: `pem`
     */
    override fun keyFormat(keyFormat: String) {
      cdkBuilder.keyFormat(keyFormat)
    }

    /**
     * @param keyName A unique name for the key pair. 
     * Constraints: Up to 255 ASCII characters
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * @param keyType The type of key pair. Note that ED25519 keys are not supported for Windows
     * instances.
     * If the `PublicKeyMaterial` property is specified, the `KeyType` property is ignored, and the
     * key type is inferred from the `PublicKeyMaterial` value.
     *
     * Default: `rsa`
     */
    override fun keyType(keyType: String) {
      cdkBuilder.keyType(keyType)
    }

    /**
     * @param publicKeyMaterial The public key material.
     * The `PublicKeyMaterial` property is used to import a key pair. If this property is not
     * specified, then a new key pair will be created.
     */
    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    /**
     * @param tags The tags to apply to the key pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to apply to the key pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnKeyPairProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnKeyPairProps,
  ) : CdkObject(cdkObject), CfnKeyPairProps {
    /**
     * The format of the key pair.
     *
     * Default: `pem`
     *
     * Default: - "pem"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyformat)
     */
    override fun keyFormat(): String? = unwrap(this).getKeyFormat()

    /**
     * A unique name for the key pair.
     *
     * Constraints: Up to 255 ASCII characters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyname)
     */
    override fun keyName(): String = unwrap(this).getKeyName()

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
     */
    override fun keyType(): String? = unwrap(this).getKeyType()

    /**
     * The public key material.
     *
     * The `PublicKeyMaterial` property is used to import a key pair. If this property is not
     * specified, then a new key pair will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-publickeymaterial)
     */
    override fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

    /**
     * The tags to apply to the key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyPairProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnKeyPairProps):
        CfnKeyPairProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyPairProps):
        software.amazon.awscdk.services.ec2.CfnKeyPairProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnKeyPairProps
  }
}
