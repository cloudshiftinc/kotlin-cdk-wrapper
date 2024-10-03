@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A partner account.
 *
 * If `PartnerAccountId` and `PartnerType` are `null` , returns all partner accounts.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnPartnerAccount cfnPartnerAccount = CfnPartnerAccount.Builder.create(this,
 * "MyCfnPartnerAccount")
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
public open class CfnPartnerAccount(
  cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iotwireless.CfnPartnerAccount(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartnerAccountProps,
  ) :
      this(software.amazon.awscdk.services.iotwireless.CfnPartnerAccount(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPartnerAccountProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartnerAccountProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPartnerAccountProps(props)
  )

  /**
   * Whether the partner account is linked to the AWS account.
   */
  public open fun accountLinked(): Any? = unwrap(this).getAccountLinked()

  /**
   * Whether the partner account is linked to the AWS account.
   */
  public open fun accountLinked(`value`: Boolean) {
    unwrap(this).setAccountLinked(`value`)
  }

  /**
   * Whether the partner account is linked to the AWS account.
   */
  public open fun accountLinked(`value`: IResolvable) {
    unwrap(this).setAccountLinked(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The fingerprint of the Sidewalk application server private key.
   */
  public open fun attrFingerprint(): String = unwrap(this).getAttrFingerprint()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the partner account to update.
   */
  public open fun partnerAccountId(): String? = unwrap(this).getPartnerAccountId()

  /**
   * The ID of the partner account to update.
   */
  public open fun partnerAccountId(`value`: String) {
    unwrap(this).setPartnerAccountId(`value`)
  }

  /**
   * The partner type.
   */
  public open fun partnerType(): String? = unwrap(this).getPartnerType()

  /**
   * The partner type.
   */
  public open fun partnerType(`value`: String) {
    unwrap(this).setPartnerType(`value`)
  }

  /**
   * The Sidewalk account credentials.
   */
  public open fun sidewalk(): Any? = unwrap(this).getSidewalk()

  /**
   * The Sidewalk account credentials.
   */
  public open fun sidewalk(`value`: IResolvable) {
    unwrap(this).setSidewalk(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Sidewalk account credentials.
   */
  public open fun sidewalk(`value`: SidewalkAccountInfoProperty) {
    unwrap(this).setSidewalk(`value`.let(SidewalkAccountInfoProperty.Companion::unwrap))
  }

  /**
   * The Sidewalk account credentials.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e04e111d957d00271f64784bdd96f6bb00e2d9e369d949d95b11baf97c1be366")
  public open fun sidewalk(`value`: SidewalkAccountInfoProperty.Builder.() -> Unit): Unit =
      sidewalk(SidewalkAccountInfoProperty(`value`))

  /**
   * Information about a Sidewalk account.
   */
  public open fun sidewalkResponse(): Any? = unwrap(this).getSidewalkResponse()

  /**
   * Information about a Sidewalk account.
   */
  public open fun sidewalkResponse(`value`: IResolvable) {
    unwrap(this).setSidewalkResponse(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about a Sidewalk account.
   */
  public open fun sidewalkResponse(`value`: SidewalkAccountInfoWithFingerprintProperty) {
    unwrap(this).setSidewalkResponse(`value`.let(SidewalkAccountInfoWithFingerprintProperty.Companion::unwrap))
  }

  /**
   * Information about a Sidewalk account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c1dc63264c77a2b76489797f4140defde3116748b7319db541327583e263e4c")
  public open
      fun sidewalkResponse(`value`: SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit):
      Unit = sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty(`value`))

  /**
   * Sidewalk update.
   */
  public open fun sidewalkUpdate(): Any? = unwrap(this).getSidewalkUpdate()

  /**
   * Sidewalk update.
   */
  public open fun sidewalkUpdate(`value`: IResolvable) {
    unwrap(this).setSidewalkUpdate(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Sidewalk update.
   */
  public open fun sidewalkUpdate(`value`: SidewalkUpdateAccountProperty) {
    unwrap(this).setSidewalkUpdate(`value`.let(SidewalkUpdateAccountProperty.Companion::unwrap))
  }

  /**
   * Sidewalk update.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7de7245a353fe6f0094c556f19bc140be3119eb6c5f90c00935464568b691329")
  public open fun sidewalkUpdate(`value`: SidewalkUpdateAccountProperty.Builder.() -> Unit): Unit =
      sidewalkUpdate(SidewalkUpdateAccountProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotwireless.CfnPartnerAccount].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the partner account is linked to the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-accountlinked)
     * @param accountLinked Whether the partner account is linked to the AWS account. 
     */
    public fun accountLinked(accountLinked: Boolean)

    /**
     * Whether the partner account is linked to the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-accountlinked)
     * @param accountLinked Whether the partner account is linked to the AWS account. 
     */
    public fun accountLinked(accountLinked: IResolvable)

    /**
     * The ID of the partner account to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partneraccountid)
     * @param partnerAccountId The ID of the partner account to update. 
     */
    public fun partnerAccountId(partnerAccountId: String)

    /**
     * The partner type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partnertype)
     * @param partnerType The partner type. 
     */
    public fun partnerType(partnerType: String)

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     * @param sidewalk The Sidewalk account credentials. 
     */
    public fun sidewalk(sidewalk: IResolvable)

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     * @param sidewalk The Sidewalk account credentials. 
     */
    public fun sidewalk(sidewalk: SidewalkAccountInfoProperty)

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     * @param sidewalk The Sidewalk account credentials. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c23f4ce3b6b1acdf5366e8266b214b62e3340aa21c8789029acd609d73249c5")
    public fun sidewalk(sidewalk: SidewalkAccountInfoProperty.Builder.() -> Unit)

    /**
     * Information about a Sidewalk account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     * @param sidewalkResponse Information about a Sidewalk account. 
     */
    public fun sidewalkResponse(sidewalkResponse: IResolvable)

    /**
     * Information about a Sidewalk account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     * @param sidewalkResponse Information about a Sidewalk account. 
     */
    public fun sidewalkResponse(sidewalkResponse: SidewalkAccountInfoWithFingerprintProperty)

    /**
     * Information about a Sidewalk account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     * @param sidewalkResponse Information about a Sidewalk account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf9853e743f05d34e8bf54bfc19754dcd8c261695e6dc792a26f569208b2a40b")
    public
        fun sidewalkResponse(sidewalkResponse: SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit)

    /**
     * Sidewalk update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     * @param sidewalkUpdate Sidewalk update. 
     */
    public fun sidewalkUpdate(sidewalkUpdate: IResolvable)

    /**
     * Sidewalk update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     * @param sidewalkUpdate Sidewalk update. 
     */
    public fun sidewalkUpdate(sidewalkUpdate: SidewalkUpdateAccountProperty)

    /**
     * Sidewalk update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     * @param sidewalkUpdate Sidewalk update. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50b2293303e851fca1e139168d0d98b54e0595482e874cc4b549b2872c17248f")
    public fun sidewalkUpdate(sidewalkUpdate: SidewalkUpdateAccountProperty.Builder.() -> Unit)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.Builder =
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.Builder.create(scope, id)

    /**
     * Whether the partner account is linked to the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-accountlinked)
     * @param accountLinked Whether the partner account is linked to the AWS account. 
     */
    override fun accountLinked(accountLinked: Boolean) {
      cdkBuilder.accountLinked(accountLinked)
    }

    /**
     * Whether the partner account is linked to the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-accountlinked)
     * @param accountLinked Whether the partner account is linked to the AWS account. 
     */
    override fun accountLinked(accountLinked: IResolvable) {
      cdkBuilder.accountLinked(accountLinked.let(IResolvable.Companion::unwrap))
    }

    /**
     * The ID of the partner account to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partneraccountid)
     * @param partnerAccountId The ID of the partner account to update. 
     */
    override fun partnerAccountId(partnerAccountId: String) {
      cdkBuilder.partnerAccountId(partnerAccountId)
    }

    /**
     * The partner type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partnertype)
     * @param partnerType The partner type. 
     */
    override fun partnerType(partnerType: String) {
      cdkBuilder.partnerType(partnerType)
    }

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     * @param sidewalk The Sidewalk account credentials. 
     */
    override fun sidewalk(sidewalk: IResolvable) {
      cdkBuilder.sidewalk(sidewalk.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     * @param sidewalk The Sidewalk account credentials. 
     */
    override fun sidewalk(sidewalk: SidewalkAccountInfoProperty) {
      cdkBuilder.sidewalk(sidewalk.let(SidewalkAccountInfoProperty.Companion::unwrap))
    }

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     * @param sidewalk The Sidewalk account credentials. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c23f4ce3b6b1acdf5366e8266b214b62e3340aa21c8789029acd609d73249c5")
    override fun sidewalk(sidewalk: SidewalkAccountInfoProperty.Builder.() -> Unit): Unit =
        sidewalk(SidewalkAccountInfoProperty(sidewalk))

    /**
     * Information about a Sidewalk account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     * @param sidewalkResponse Information about a Sidewalk account. 
     */
    override fun sidewalkResponse(sidewalkResponse: IResolvable) {
      cdkBuilder.sidewalkResponse(sidewalkResponse.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about a Sidewalk account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     * @param sidewalkResponse Information about a Sidewalk account. 
     */
    override fun sidewalkResponse(sidewalkResponse: SidewalkAccountInfoWithFingerprintProperty) {
      cdkBuilder.sidewalkResponse(sidewalkResponse.let(SidewalkAccountInfoWithFingerprintProperty.Companion::unwrap))
    }

    /**
     * Information about a Sidewalk account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     * @param sidewalkResponse Information about a Sidewalk account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf9853e743f05d34e8bf54bfc19754dcd8c261695e6dc792a26f569208b2a40b")
    override
        fun sidewalkResponse(sidewalkResponse: SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit):
        Unit = sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty(sidewalkResponse))

    /**
     * Sidewalk update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     * @param sidewalkUpdate Sidewalk update. 
     */
    override fun sidewalkUpdate(sidewalkUpdate: IResolvable) {
      cdkBuilder.sidewalkUpdate(sidewalkUpdate.let(IResolvable.Companion::unwrap))
    }

    /**
     * Sidewalk update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     * @param sidewalkUpdate Sidewalk update. 
     */
    override fun sidewalkUpdate(sidewalkUpdate: SidewalkUpdateAccountProperty) {
      cdkBuilder.sidewalkUpdate(sidewalkUpdate.let(SidewalkUpdateAccountProperty.Companion::unwrap))
    }

    /**
     * Sidewalk update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     * @param sidewalkUpdate Sidewalk update. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50b2293303e851fca1e139168d0d98b54e0595482e874cc4b549b2872c17248f")
    override fun sidewalkUpdate(sidewalkUpdate: SidewalkUpdateAccountProperty.Builder.() -> Unit):
        Unit = sidewalkUpdate(SidewalkUpdateAccountProperty(sidewalkUpdate))

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnPartnerAccount =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPartnerAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPartnerAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount):
        CfnPartnerAccount = CfnPartnerAccount(cdkObject)

    internal fun unwrap(wrapped: CfnPartnerAccount):
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccount = wrapped.cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
  }

  /**
   * Information about a Sidewalk account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * SidewalkAccountInfoProperty sidewalkAccountInfoProperty = SidewalkAccountInfoProperty.builder()
   * .appServerPrivateKey("appServerPrivateKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfo.html)
   */
  public interface SidewalkAccountInfoProperty {
    /**
     * The Sidewalk application server private key.
     *
     * The application server private key is a secret key, which you should handle in a similar way
     * as you would an application password. You can protect the application server private key by
     * storing the value in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfo.html#cfn-iotwireless-partneraccount-sidewalkaccountinfo-appserverprivatekey)
     */
    public fun appServerPrivateKey(): String

    /**
     * A builder for [SidewalkAccountInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appServerPrivateKey The Sidewalk application server private key. 
       * The application server private key is a secret key, which you should handle in a similar
       * way as you would an application password. You can protect the application server private key
       * by storing the value in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      public fun appServerPrivateKey(appServerPrivateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty.builder()

      /**
       * @param appServerPrivateKey The Sidewalk application server private key. 
       * The application server private key is a secret key, which you should handle in a similar
       * way as you would an application password. You can protect the application server private key
       * by storing the value in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       */
      override fun appServerPrivateKey(appServerPrivateKey: String) {
        cdkBuilder.appServerPrivateKey(appServerPrivateKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty,
    ) : CdkObject(cdkObject),
        SidewalkAccountInfoProperty {
      /**
       * The Sidewalk application server private key.
       *
       * The application server private key is a secret key, which you should handle in a similar
       * way as you would an application password. You can protect the application server private key
       * by storing the value in the AWS Secrets Manager and use the
       * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
       * to reference this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfo.html#cfn-iotwireless-partneraccount-sidewalkaccountinfo-appserverprivatekey)
       */
      override fun appServerPrivateKey(): String = unwrap(this).getAppServerPrivateKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SidewalkAccountInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty):
          SidewalkAccountInfoProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SidewalkAccountInfoProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SidewalkAccountInfoProperty):
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty
    }
  }

  /**
   * Information about a Sidewalk account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * SidewalkAccountInfoWithFingerprintProperty sidewalkAccountInfoWithFingerprintProperty =
   * SidewalkAccountInfoWithFingerprintProperty.builder()
   * .amazonId("amazonId")
   * .arn("arn")
   * .fingerprint("fingerprint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html)
   */
  public interface SidewalkAccountInfoWithFingerprintProperty {
    /**
     * The Sidewalk Amazon ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html#cfn-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint-amazonid)
     */
    public fun amazonId(): String? = unwrap(this).getAmazonId()

    /**
     * The Amazon Resource Name (ARN) of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html#cfn-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * The fingerprint of the Sidewalk application server private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html#cfn-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint-fingerprint)
     */
    public fun fingerprint(): String? = unwrap(this).getFingerprint()

    /**
     * A builder for [SidewalkAccountInfoWithFingerprintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amazonId The Sidewalk Amazon ID.
       */
      public fun amazonId(amazonId: String)

      /**
       * @param arn The Amazon Resource Name (ARN) of the resource.
       */
      public fun arn(arn: String)

      /**
       * @param fingerprint The fingerprint of the Sidewalk application server private key.
       */
      public fun fingerprint(fingerprint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.builder()

      /**
       * @param amazonId The Sidewalk Amazon ID.
       */
      override fun amazonId(amazonId: String) {
        cdkBuilder.amazonId(amazonId)
      }

      /**
       * @param arn The Amazon Resource Name (ARN) of the resource.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param fingerprint The fingerprint of the Sidewalk application server private key.
       */
      override fun fingerprint(fingerprint: String) {
        cdkBuilder.fingerprint(fingerprint)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty,
    ) : CdkObject(cdkObject),
        SidewalkAccountInfoWithFingerprintProperty {
      /**
       * The Sidewalk Amazon ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html#cfn-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint-amazonid)
       */
      override fun amazonId(): String? = unwrap(this).getAmazonId()

      /**
       * The Amazon Resource Name (ARN) of the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html#cfn-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * The fingerprint of the Sidewalk application server private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html#cfn-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint-fingerprint)
       */
      override fun fingerprint(): String? = unwrap(this).getFingerprint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SidewalkAccountInfoWithFingerprintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty):
          SidewalkAccountInfoWithFingerprintProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SidewalkAccountInfoWithFingerprintProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SidewalkAccountInfoWithFingerprintProperty):
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty
    }
  }

  /**
   * Sidewalk update.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * SidewalkUpdateAccountProperty sidewalkUpdateAccountProperty =
   * SidewalkUpdateAccountProperty.builder()
   * .appServerPrivateKey("appServerPrivateKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkupdateaccount.html)
   */
  public interface SidewalkUpdateAccountProperty {
    /**
     * The new Sidewalk application server private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkupdateaccount.html#cfn-iotwireless-partneraccount-sidewalkupdateaccount-appserverprivatekey)
     */
    public fun appServerPrivateKey(): String? = unwrap(this).getAppServerPrivateKey()

    /**
     * A builder for [SidewalkUpdateAccountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appServerPrivateKey The new Sidewalk application server private key.
       */
      public fun appServerPrivateKey(appServerPrivateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty.builder()

      /**
       * @param appServerPrivateKey The new Sidewalk application server private key.
       */
      override fun appServerPrivateKey(appServerPrivateKey: String) {
        cdkBuilder.appServerPrivateKey(appServerPrivateKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty,
    ) : CdkObject(cdkObject),
        SidewalkUpdateAccountProperty {
      /**
       * The new Sidewalk application server private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkupdateaccount.html#cfn-iotwireless-partneraccount-sidewalkupdateaccount-appserverprivatekey)
       */
      override fun appServerPrivateKey(): String? = unwrap(this).getAppServerPrivateKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SidewalkUpdateAccountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty):
          SidewalkUpdateAccountProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SidewalkUpdateAccountProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SidewalkUpdateAccountProperty):
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty
    }
  }
}
