@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

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
 * Properties for defining a `CfnPartnerAccount`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnPartnerAccountProps cfnPartnerAccountProps = CfnPartnerAccountProps.builder()
 * .accountLinked(false)
 * .partnerAccountId("partnerAccountId")
 * .partnerType("partnerType")
 * .sidewalk(SidewalkAccountInfoProperty.builder()
 * .appServerPrivateKey("appServerPrivateKey")
 * .build())
 * .sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty.builder()
 * .amazonId("amazonId")
 * .arn("arn")
 * .fingerprint("fingerprint")
 * .build())
 * .sidewalkUpdate(SidewalkUpdateAccountProperty.builder()
 * .appServerPrivateKey("appServerPrivateKey")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html)
 */
public interface CfnPartnerAccountProps {
  /**
   * Whether the partner account is linked to the AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-accountlinked)
   */
  public fun accountLinked(): Any? = unwrap(this).getAccountLinked()

  /**
   * The ID of the partner account to update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partneraccountid)
   */
  public fun partnerAccountId(): String? = unwrap(this).getPartnerAccountId()

  /**
   * The partner type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partnertype)
   */
  public fun partnerType(): String? = unwrap(this).getPartnerType()

  /**
   * The Sidewalk account credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
   */
  public fun sidewalk(): Any? = unwrap(this).getSidewalk()

  /**
   * Information about a Sidewalk account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
   */
  public fun sidewalkResponse(): Any? = unwrap(this).getSidewalkResponse()

  /**
   * Sidewalk update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
   */
  public fun sidewalkUpdate(): Any? = unwrap(this).getSidewalkUpdate()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPartnerAccountProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountLinked Whether the partner account is linked to the AWS account.
     */
    public fun accountLinked(accountLinked: Boolean)

    /**
     * @param accountLinked Whether the partner account is linked to the AWS account.
     */
    public fun accountLinked(accountLinked: IResolvable)

    /**
     * @param partnerAccountId The ID of the partner account to update.
     */
    public fun partnerAccountId(partnerAccountId: String)

    /**
     * @param partnerType The partner type.
     */
    public fun partnerType(partnerType: String)

    /**
     * @param sidewalk The Sidewalk account credentials.
     */
    public fun sidewalk(sidewalk: IResolvable)

    /**
     * @param sidewalk The Sidewalk account credentials.
     */
    public fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty)

    /**
     * @param sidewalk The Sidewalk account credentials.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70453240e8d81f1b7632ef9718fd7e724f7c6aad275604e18916a07d612c4133")
    public fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty.Builder.() -> Unit)

    /**
     * @param sidewalkResponse Information about a Sidewalk account.
     */
    public fun sidewalkResponse(sidewalkResponse: IResolvable)

    /**
     * @param sidewalkResponse Information about a Sidewalk account.
     */
    public
        fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty)

    /**
     * @param sidewalkResponse Information about a Sidewalk account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51c1b1ef513dd84a4926f5f4aa8a9841155e1a32bc5a49bdd4278ca6adbe6324")
    public
        fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit)

    /**
     * @param sidewalkUpdate Sidewalk update.
     */
    public fun sidewalkUpdate(sidewalkUpdate: IResolvable)

    /**
     * @param sidewalkUpdate Sidewalk update.
     */
    public fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty)

    /**
     * @param sidewalkUpdate Sidewalk update.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("923e4884efc2c2670c0c779ca44da7ab4ff0cea75c4dc7850d11f3636592331e")
    public
        fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder.() -> Unit)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps.builder()

    /**
     * @param accountLinked Whether the partner account is linked to the AWS account.
     */
    override fun accountLinked(accountLinked: Boolean) {
      cdkBuilder.accountLinked(accountLinked)
    }

    /**
     * @param accountLinked Whether the partner account is linked to the AWS account.
     */
    override fun accountLinked(accountLinked: IResolvable) {
      cdkBuilder.accountLinked(accountLinked.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param partnerAccountId The ID of the partner account to update.
     */
    override fun partnerAccountId(partnerAccountId: String) {
      cdkBuilder.partnerAccountId(partnerAccountId)
    }

    /**
     * @param partnerType The partner type.
     */
    override fun partnerType(partnerType: String) {
      cdkBuilder.partnerType(partnerType)
    }

    /**
     * @param sidewalk The Sidewalk account credentials.
     */
    override fun sidewalk(sidewalk: IResolvable) {
      cdkBuilder.sidewalk(sidewalk.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sidewalk The Sidewalk account credentials.
     */
    override fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty) {
      cdkBuilder.sidewalk(sidewalk.let(CfnPartnerAccount.SidewalkAccountInfoProperty.Companion::unwrap))
    }

    /**
     * @param sidewalk The Sidewalk account credentials.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70453240e8d81f1b7632ef9718fd7e724f7c6aad275604e18916a07d612c4133")
    override
        fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty.Builder.() -> Unit):
        Unit = sidewalk(CfnPartnerAccount.SidewalkAccountInfoProperty(sidewalk))

    /**
     * @param sidewalkResponse Information about a Sidewalk account.
     */
    override fun sidewalkResponse(sidewalkResponse: IResolvable) {
      cdkBuilder.sidewalkResponse(sidewalkResponse.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sidewalkResponse Information about a Sidewalk account.
     */
    override
        fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty) {
      cdkBuilder.sidewalkResponse(sidewalkResponse.let(CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Companion::unwrap))
    }

    /**
     * @param sidewalkResponse Information about a Sidewalk account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51c1b1ef513dd84a4926f5f4aa8a9841155e1a32bc5a49bdd4278ca6adbe6324")
    override
        fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit):
        Unit =
        sidewalkResponse(CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty(sidewalkResponse))

    /**
     * @param sidewalkUpdate Sidewalk update.
     */
    override fun sidewalkUpdate(sidewalkUpdate: IResolvable) {
      cdkBuilder.sidewalkUpdate(sidewalkUpdate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sidewalkUpdate Sidewalk update.
     */
    override fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty) {
      cdkBuilder.sidewalkUpdate(sidewalkUpdate.let(CfnPartnerAccount.SidewalkUpdateAccountProperty.Companion::unwrap))
    }

    /**
     * @param sidewalkUpdate Sidewalk update.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("923e4884efc2c2670c0c779ca44da7ab4ff0cea75c4dc7850d11f3636592331e")
    override
        fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder.() -> Unit):
        Unit = sidewalkUpdate(CfnPartnerAccount.SidewalkUpdateAccountProperty(sidewalkUpdate))

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps,
  ) : CdkObject(cdkObject), CfnPartnerAccountProps {
    /**
     * Whether the partner account is linked to the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-accountlinked)
     */
    override fun accountLinked(): Any? = unwrap(this).getAccountLinked()

    /**
     * The ID of the partner account to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partneraccountid)
     */
    override fun partnerAccountId(): String? = unwrap(this).getPartnerAccountId()

    /**
     * The partner type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partnertype)
     */
    override fun partnerType(): String? = unwrap(this).getPartnerType()

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     */
    override fun sidewalk(): Any? = unwrap(this).getSidewalk()

    /**
     * Information about a Sidewalk account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     */
    override fun sidewalkResponse(): Any? = unwrap(this).getSidewalkResponse()

    /**
     * Sidewalk update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     */
    override fun sidewalkUpdate(): Any? = unwrap(this).getSidewalkUpdate()

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPartnerAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps):
        CfnPartnerAccountProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPartnerAccountProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPartnerAccountProps):
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps
  }
}
