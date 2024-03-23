@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFlowEntitlement`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnFlowEntitlementProps cfnFlowEntitlementProps = CfnFlowEntitlementProps.builder()
 * .description("description")
 * .flowArn("flowArn")
 * .name("name")
 * .subscribers(List.of("subscribers"))
 * // the properties below are optional
 * .dataTransferSubscriberFeePercent(123)
 * .encryption(EncryptionProperty.builder()
 * .algorithm("algorithm")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .deviceId("deviceId")
 * .keyType("keyType")
 * .region("region")
 * .resourceId("resourceId")
 * .secretArn("secretArn")
 * .url("url")
 * .build())
 * .entitlementStatus("entitlementStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html)
 */
public interface CfnFlowEntitlementProps {
  /**
   * The percentage of the entitlement data transfer fee that you want the subscriber to be
   * responsible for.
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-datatransfersubscriberfeepercent)
   */
  public fun dataTransferSubscriberFeePercent(): Number? =
      unwrap(this).getDataTransferSubscriberFeePercent()

  /**
   * A description of the entitlement.
   *
   * This description appears only on the MediaConnect console and is not visible outside of the
   * current AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-description)
   */
  public fun description(): String

  /**
   * The type of encryption that MediaConnect will use on the output that is associated with the
   * entitlement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
   */
  public fun encryption(): Any? = unwrap(this).getEncryption()

  /**
   * An indication of whether the new entitlement should be enabled or disabled as soon as it is
   * created.
   *
   * If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to
   * ENABLED.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-entitlementstatus)
   */
  public fun entitlementStatus(): String? = unwrap(this).getEntitlementStatus()

  /**
   * The Amazon Resource Name (ARN) of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-flowarn)
   */
  public fun flowArn(): String

  /**
   * The name of the entitlement.
   *
   * This value must be unique within the current flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-name)
   */
  public fun name(): String

  /**
   * The AWS account IDs that you want to share your content with.
   *
   * The receiving accounts (subscribers) will be allowed to create their own flows using your
   * content as the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-subscribers)
   */
  public fun subscribers(): List<String>

  /**
   * A builder for [CfnFlowEntitlementProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataTransferSubscriberFeePercent The percentage of the entitlement data transfer fee
     * that you want the subscriber to be responsible for.
     */
    public fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number)

    /**
     * @param description A description of the entitlement. 
     * This description appears only on the MediaConnect console and is not visible outside of the
     * current AWS account.
     */
    public fun description(description: String)

    /**
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement.
     */
    public fun encryption(encryption: IResolvable)

    /**
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement.
     */
    public fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty)

    /**
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9dbc636d06fdc06f25bba614880395d91ccedc0d4e14b939658c6397f2feb6ae")
    public fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty.Builder.() -> Unit)

    /**
     * @param entitlementStatus An indication of whether the new entitlement should be enabled or
     * disabled as soon as it is created.
     * If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to
     * ENABLED.
     */
    public fun entitlementStatus(entitlementStatus: String)

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow. 
     */
    public fun flowArn(flowArn: String)

    /**
     * @param name The name of the entitlement. 
     * This value must be unique within the current flow.
     */
    public fun name(name: String)

    /**
     * @param subscribers The AWS account IDs that you want to share your content with. 
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     */
    public fun subscribers(subscribers: List<String>)

    /**
     * @param subscribers The AWS account IDs that you want to share your content with. 
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     */
    public fun subscribers(vararg subscribers: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps.builder()

    /**
     * @param dataTransferSubscriberFeePercent The percentage of the entitlement data transfer fee
     * that you want the subscriber to be responsible for.
     */
    override fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number) {
      cdkBuilder.dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent)
    }

    /**
     * @param description A description of the entitlement. 
     * This description appears only on the MediaConnect console and is not visible outside of the
     * current AWS account.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement.
     */
    override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
    }

    /**
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement.
     */
    override fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(CfnFlowEntitlement.EncryptionProperty::unwrap))
    }

    /**
     * @param encryption The type of encryption that MediaConnect will use on the output that is
     * associated with the entitlement.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9dbc636d06fdc06f25bba614880395d91ccedc0d4e14b939658c6397f2feb6ae")
    override fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty.Builder.() -> Unit):
        Unit = encryption(CfnFlowEntitlement.EncryptionProperty(encryption))

    /**
     * @param entitlementStatus An indication of whether the new entitlement should be enabled or
     * disabled as soon as it is created.
     * If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to
     * ENABLED.
     */
    override fun entitlementStatus(entitlementStatus: String) {
      cdkBuilder.entitlementStatus(entitlementStatus)
    }

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * @param name The name of the entitlement. 
     * This value must be unique within the current flow.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param subscribers The AWS account IDs that you want to share your content with. 
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     */
    override fun subscribers(subscribers: List<String>) {
      cdkBuilder.subscribers(subscribers)
    }

    /**
     * @param subscribers The AWS account IDs that you want to share your content with. 
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     */
    override fun subscribers(vararg subscribers: String): Unit = subscribers(subscribers.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps,
  ) : CdkObject(cdkObject), CfnFlowEntitlementProps {
    /**
     * The percentage of the entitlement data transfer fee that you want the subscriber to be
     * responsible for.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-datatransfersubscriberfeepercent)
     */
    override fun dataTransferSubscriberFeePercent(): Number? =
        unwrap(this).getDataTransferSubscriberFeePercent()

    /**
     * A description of the entitlement.
     *
     * This description appears only on the MediaConnect console and is not visible outside of the
     * current AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The type of encryption that MediaConnect will use on the output that is associated with the
     * entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
     */
    override fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * An indication of whether the new entitlement should be enabled or disabled as soon as it is
     * created.
     *
     * If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to
     * ENABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-entitlementstatus)
     */
    override fun entitlementStatus(): String? = unwrap(this).getEntitlementStatus()

    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-flowarn)
     */
    override fun flowArn(): String = unwrap(this).getFlowArn()

    /**
     * The name of the entitlement.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The AWS account IDs that you want to share your content with.
     *
     * The receiving accounts (subscribers) will be allowed to create their own flows using your
     * content as the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-subscribers)
     */
    override fun subscribers(): List<String> = unwrap(this).getSubscribers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowEntitlementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps):
        CfnFlowEntitlementProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowEntitlementProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowEntitlementProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps
  }
}
