@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.paymentcryptography

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.paymentcryptography.*;
 * CfnKeyProps cfnKeyProps = CfnKeyProps.builder()
 * .exportable(false)
 * .keyAttributes(KeyAttributesProperty.builder()
 * .keyAlgorithm("keyAlgorithm")
 * .keyClass("keyClass")
 * .keyModesOfUse(KeyModesOfUseProperty.builder()
 * .decrypt(false)
 * .deriveKey(false)
 * .encrypt(false)
 * .generate(false)
 * .noRestrictions(false)
 * .sign(false)
 * .unwrap(false)
 * .verify(false)
 * .wrap(false)
 * .build())
 * .keyUsage("keyUsage")
 * .build())
 * // the properties below are optional
 * .enabled(false)
 * .keyCheckValueAlgorithm("keyCheckValueAlgorithm")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html)
 */
public interface CfnKeyProps {
  /**
   * Specifies whether the key is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether the key is exportable.
   *
   * This data is immutable after the key is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-exportable)
   */
  public fun exportable(): Any

  /**
   * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
   * the key.
   *
   * This data is immutable after the key is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keyattributes)
   */
  public fun keyAttributes(): Any

  /**
   * The algorithm that AWS Payment Cryptography uses to calculate the key check value (KCV).
   *
   * It is used to validate the key integrity.
   *
   * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key
   * to be checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the
   * KCV is computed using a CMAC algorithm where the input data is 16 bytes of zero and retaining the
   * 3 highest order bytes of the encrypted result.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keycheckvaluealgorithm)
   */
  public fun keyCheckValueAlgorithm(): String? = unwrap(this).getKeyCheckValueAlgorithm()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Specifies whether the key is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether the key is enabled.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param exportable Specifies whether the key is exportable. 
     * This data is immutable after the key is created.
     */
    public fun exportable(exportable: Boolean)

    /**
     * @param exportable Specifies whether the key is exportable. 
     * This data is immutable after the key is created.
     */
    public fun exportable(exportable: IResolvable)

    /**
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     * This data is immutable after the key is created.
     */
    public fun keyAttributes(keyAttributes: IResolvable)

    /**
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     * This data is immutable after the key is created.
     */
    public fun keyAttributes(keyAttributes: CfnKey.KeyAttributesProperty)

    /**
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     * This data is immutable after the key is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a20c708ae3266f76fc2daadbfa4daf16ba06adb86d55e9eae6747ba8b83743bf")
    public fun keyAttributes(keyAttributes: CfnKey.KeyAttributesProperty.Builder.() -> Unit)

    /**
     * @param keyCheckValueAlgorithm The algorithm that AWS Payment Cryptography uses to calculate
     * the key check value (KCV).
     * It is used to validate the key integrity.
     *
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the
     * key to be checked and retaining the 3 highest order bytes of the encrypted result. For AES keys,
     * the KCV is computed using a CMAC algorithm where the input data is 16 bytes of zero and
     * retaining the 3 highest order bytes of the encrypted result.
     */
    public fun keyCheckValueAlgorithm(keyCheckValueAlgorithm: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.paymentcryptography.CfnKeyProps.Builder
        = software.amazon.awscdk.services.paymentcryptography.CfnKeyProps.builder()

    /**
     * @param enabled Specifies whether the key is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether the key is enabled.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param exportable Specifies whether the key is exportable. 
     * This data is immutable after the key is created.
     */
    override fun exportable(exportable: Boolean) {
      cdkBuilder.exportable(exportable)
    }

    /**
     * @param exportable Specifies whether the key is exportable. 
     * This data is immutable after the key is created.
     */
    override fun exportable(exportable: IResolvable) {
      cdkBuilder.exportable(exportable.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     * This data is immutable after the key is created.
     */
    override fun keyAttributes(keyAttributes: IResolvable) {
      cdkBuilder.keyAttributes(keyAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     * This data is immutable after the key is created.
     */
    override fun keyAttributes(keyAttributes: CfnKey.KeyAttributesProperty) {
      cdkBuilder.keyAttributes(keyAttributes.let(CfnKey.KeyAttributesProperty.Companion::unwrap))
    }

    /**
     * @param keyAttributes The role of the key, the algorithm it supports, and the cryptographic
     * operations allowed with the key. 
     * This data is immutable after the key is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a20c708ae3266f76fc2daadbfa4daf16ba06adb86d55e9eae6747ba8b83743bf")
    override fun keyAttributes(keyAttributes: CfnKey.KeyAttributesProperty.Builder.() -> Unit): Unit
        = keyAttributes(CfnKey.KeyAttributesProperty(keyAttributes))

    /**
     * @param keyCheckValueAlgorithm The algorithm that AWS Payment Cryptography uses to calculate
     * the key check value (KCV).
     * It is used to validate the key integrity.
     *
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the
     * key to be checked and retaining the 3 highest order bytes of the encrypted result. For AES keys,
     * the KCV is computed using a CMAC algorithm where the input data is 16 bytes of zero and
     * retaining the 3 highest order bytes of the encrypted result.
     */
    override fun keyCheckValueAlgorithm(keyCheckValueAlgorithm: String) {
      cdkBuilder.keyCheckValueAlgorithm(keyCheckValueAlgorithm)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.paymentcryptography.CfnKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnKeyProps,
  ) : CdkObject(cdkObject),
      CfnKeyProps {
    /**
     * Specifies whether the key is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Specifies whether the key is exportable.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-exportable)
     */
    override fun exportable(): Any = unwrap(this).getExportable()

    /**
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with
     * the key.
     *
     * This data is immutable after the key is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keyattributes)
     */
    override fun keyAttributes(): Any = unwrap(this).getKeyAttributes()

    /**
     * The algorithm that AWS Payment Cryptography uses to calculate the key check value (KCV).
     *
     * It is used to validate the key integrity.
     *
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the
     * key to be checked and retaining the 3 highest order bytes of the encrypted result. For AES keys,
     * the KCV is computed using a CMAC algorithm where the input data is 16 bytes of zero and
     * retaining the 3 highest order bytes of the encrypted result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-keycheckvaluealgorithm)
     */
    override fun keyCheckValueAlgorithm(): String? = unwrap(this).getKeyCheckValueAlgorithm()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-paymentcryptography-key.html#cfn-paymentcryptography-key-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.paymentcryptography.CfnKeyProps):
        CfnKeyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnKeyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyProps):
        software.amazon.awscdk.services.paymentcryptography.CfnKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.paymentcryptography.CfnKeyProps
  }
}
