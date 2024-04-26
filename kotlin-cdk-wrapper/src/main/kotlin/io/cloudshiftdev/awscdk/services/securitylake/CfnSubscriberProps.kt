@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securitylake

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSubscriber`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securitylake.*;
 * CfnSubscriberProps cfnSubscriberProps = CfnSubscriberProps.builder()
 * .accessTypes(List.of("accessTypes"))
 * .dataLakeArn("dataLakeArn")
 * .sources(List.of(SourceProperty.builder()
 * .awsLogSource(AwsLogSourceProperty.builder()
 * .sourceName("sourceName")
 * .sourceVersion("sourceVersion")
 * .build())
 * .customLogSource(CustomLogSourceProperty.builder()
 * .sourceName("sourceName")
 * .sourceVersion("sourceVersion")
 * .build())
 * .build()))
 * .subscriberIdentity(SubscriberIdentityProperty.builder()
 * .externalId("externalId")
 * .principal("principal")
 * .build())
 * .subscriberName("subscriberName")
 * // the properties below are optional
 * .subscriberDescription("subscriberDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html)
 */
public interface CfnSubscriberProps {
  /**
   * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon
   * SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
   *
   * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
   * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-accesstypes)
   */
  public fun accessTypes(): List<String>

  /**
   * The Amazon Resource Name (ARN) used to create the data lake.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-datalakearn)
   */
  public fun dataLakeArn(): String

  /**
   * Amazon Security Lake supports log and event collection for natively supported AWS services .
   *
   * For more information, see the [Amazon Security Lake User
   * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-sources)
   */
  public fun sources(): Any

  /**
   * The subscriber descriptions for a subscriber account.
   *
   * The description for a subscriber includes `subscriberName` , `accountID` , `externalID` , and
   * `subscriberId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberdescription)
   */
  public fun subscriberDescription(): String? = unwrap(this).getSubscriberDescription()

  /**
   * The AWS identity used to access your data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberidentity)
   */
  public fun subscriberIdentity(): Any

  /**
   * The name of your Amazon Security Lake subscriber account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscribername)
   */
  public fun subscriberName(): String

  /**
   * An array of objects, one for each tag to associate with the subscriber.
   *
   * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null, but
   * it can be an empty string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSubscriberProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessTypes You can choose to notify subscribers of new objects with an Amazon Simple
     * Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the
     * subscriber. 
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     */
    public fun accessTypes(accessTypes: List<String>)

    /**
     * @param accessTypes You can choose to notify subscribers of new objects with an Amazon Simple
     * Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the
     * subscriber. 
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     */
    public fun accessTypes(vararg accessTypes: String)

    /**
     * @param dataLakeArn The Amazon Resource Name (ARN) used to create the data lake. 
     */
    public fun dataLakeArn(dataLakeArn: String)

    /**
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     */
    public fun sources(sources: IResolvable)

    /**
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     */
    public fun sources(sources: List<Any>)

    /**
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     */
    public fun sources(vararg sources: Any)

    /**
     * @param subscriberDescription The subscriber descriptions for a subscriber account.
     * The description for a subscriber includes `subscriberName` , `accountID` , `externalID` , and
     * `subscriberId` .
     */
    public fun subscriberDescription(subscriberDescription: String)

    /**
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    public fun subscriberIdentity(subscriberIdentity: IResolvable)

    /**
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    public fun subscriberIdentity(subscriberIdentity: CfnSubscriber.SubscriberIdentityProperty)

    /**
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b67a798bf5459f52c798e5fc88fed98d9ea8862f937ed990bedaeb4fe2a19e")
    public
        fun subscriberIdentity(subscriberIdentity: CfnSubscriber.SubscriberIdentityProperty.Builder.() -> Unit)

    /**
     * @param subscriberName The name of your Amazon Security Lake subscriber account. 
     */
    public fun subscriberName(subscriberName: String)

    /**
     * @param tags An array of objects, one for each tag to associate with the subscriber.
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of objects, one for each tag to associate with the subscriber.
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securitylake.CfnSubscriberProps.Builder
        = software.amazon.awscdk.services.securitylake.CfnSubscriberProps.builder()

    /**
     * @param accessTypes You can choose to notify subscribers of new objects with an Amazon Simple
     * Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the
     * subscriber. 
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     */
    override fun accessTypes(accessTypes: List<String>) {
      cdkBuilder.accessTypes(accessTypes)
    }

    /**
     * @param accessTypes You can choose to notify subscribers of new objects with an Amazon Simple
     * Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the
     * subscriber. 
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     */
    override fun accessTypes(vararg accessTypes: String): Unit = accessTypes(accessTypes.toList())

    /**
     * @param dataLakeArn The Amazon Resource Name (ARN) used to create the data lake. 
     */
    override fun dataLakeArn(dataLakeArn: String) {
      cdkBuilder.dataLakeArn(dataLakeArn)
    }

    /**
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    /**
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * @param subscriberDescription The subscriber descriptions for a subscriber account.
     * The description for a subscriber includes `subscriberName` , `accountID` , `externalID` , and
     * `subscriberId` .
     */
    override fun subscriberDescription(subscriberDescription: String) {
      cdkBuilder.subscriberDescription(subscriberDescription)
    }

    /**
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    override fun subscriberIdentity(subscriberIdentity: IResolvable) {
      cdkBuilder.subscriberIdentity(subscriberIdentity.let(IResolvable::unwrap))
    }

    /**
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    override fun subscriberIdentity(subscriberIdentity: CfnSubscriber.SubscriberIdentityProperty) {
      cdkBuilder.subscriberIdentity(subscriberIdentity.let(CfnSubscriber.SubscriberIdentityProperty::unwrap))
    }

    /**
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b67a798bf5459f52c798e5fc88fed98d9ea8862f937ed990bedaeb4fe2a19e")
    override
        fun subscriberIdentity(subscriberIdentity: CfnSubscriber.SubscriberIdentityProperty.Builder.() -> Unit):
        Unit = subscriberIdentity(CfnSubscriber.SubscriberIdentityProperty(subscriberIdentity))

    /**
     * @param subscriberName The name of your Amazon Security Lake subscriber account. 
     */
    override fun subscriberName(subscriberName: String) {
      cdkBuilder.subscriberName(subscriberName)
    }

    /**
     * @param tags An array of objects, one for each tag to associate with the subscriber.
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of objects, one for each tag to associate with the subscriber.
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.securitylake.CfnSubscriberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberProps,
  ) : CdkObject(cdkObject), CfnSubscriberProps {
    /**
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service
     * (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
     *
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-accesstypes)
     */
    override fun accessTypes(): List<String> = unwrap(this).getAccessTypes()

    /**
     * The Amazon Resource Name (ARN) used to create the data lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-datalakearn)
     */
    override fun dataLakeArn(): String = unwrap(this).getDataLakeArn()

    /**
     * Amazon Security Lake supports log and event collection for natively supported AWS services .
     *
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-sources)
     */
    override fun sources(): Any = unwrap(this).getSources()

    /**
     * The subscriber descriptions for a subscriber account.
     *
     * The description for a subscriber includes `subscriberName` , `accountID` , `externalID` , and
     * `subscriberId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberdescription)
     */
    override fun subscriberDescription(): String? = unwrap(this).getSubscriberDescription()

    /**
     * The AWS identity used to access your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberidentity)
     */
    override fun subscriberIdentity(): Any = unwrap(this).getSubscriberIdentity()

    /**
     * The name of your Amazon Security Lake subscriber account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscribername)
     */
    override fun subscriberName(): String = unwrap(this).getSubscriberName()

    /**
     * An array of objects, one for each tag to associate with the subscriber.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberProps):
        CfnSubscriberProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSubscriberProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriberProps):
        software.amazon.awscdk.services.securitylake.CfnSubscriberProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securitylake.CfnSubscriberProps
  }
}
