@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPublicKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnPublicKeyProps cfnPublicKeyProps = CfnPublicKeyProps.builder()
 * .name("name")
 * .publicKeyMaterial("publicKeyMaterial")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-publickey.html)
 */
public interface CfnPublicKeyProps {
  /**
   * Public key name.
   *
   * The value does not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-publickey.html#cfn-ivs-publickey-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The public portion of a customer-generated key pair.
   *
   * Note that this field is required to create the AWS::IVS::PublicKey resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-publickey.html#cfn-ivs-publickey-publickeymaterial)
   */
  public fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-publickey.html#cfn-ivs-publickey-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPublicKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Public key name.
     * The value does not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param publicKeyMaterial The public portion of a customer-generated key pair.
     * Note that this field is required to create the AWS::IVS::PublicKey resource.
     */
    public fun publicKeyMaterial(publicKeyMaterial: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnPublicKeyProps.Builder =
        software.amazon.awscdk.services.ivs.CfnPublicKeyProps.builder()

    /**
     * @param name Public key name.
     * The value does not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param publicKeyMaterial The public portion of a customer-generated key pair.
     * Note that this field is required to create the AWS::IVS::PublicKey resource.
     */
    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnPublicKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ivs.CfnPublicKeyProps,
  ) : CdkObject(cdkObject),
      CfnPublicKeyProps {
    /**
     * Public key name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-publickey.html#cfn-ivs-publickey-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The public portion of a customer-generated key pair.
     *
     * Note that this field is required to create the AWS::IVS::PublicKey resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-publickey.html#cfn-ivs-publickey-publickeymaterial)
     */
    override fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-publickey.html#cfn-ivs-publickey-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnPublicKeyProps):
        CfnPublicKeyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPublicKeyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublicKeyProps):
        software.amazon.awscdk.services.ivs.CfnPublicKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ivs.CfnPublicKeyProps
  }
}
