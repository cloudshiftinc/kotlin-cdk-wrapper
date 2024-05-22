@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securitylake

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a subscriber for accounts that are already enabled in Amazon Security Lake.
 *
 * You can create a subscriber with access to data in the current AWS Region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securitylake.*;
 * CfnSubscriber cfnSubscriber = CfnSubscriber.Builder.create(this, "MyCfnSubscriber")
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
public open class CfnSubscriber(
  cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriberProps,
  ) :
      this(software.amazon.awscdk.services.securitylake.CfnSubscriber(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSubscriberProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriberProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSubscriberProps(props)
  )

  /**
   * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon
   * SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
   */
  public open fun accessTypes(): List<String> = unwrap(this).getAccessTypes()

  /**
   * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon
   * SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
   */
  public open fun accessTypes(`value`: List<String>) {
    unwrap(this).setAccessTypes(`value`)
  }

  /**
   * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon
   * SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
   */
  public open fun accessTypes(vararg `value`: String): Unit = accessTypes(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the Amazon Security Lake subscriber.
   */
  public open fun attrResourceShareArn(): String = unwrap(this).getAttrResourceShareArn()

  /**
   * The ARN name of the Amazon Security Lake subscriber.
   */
  public open fun attrResourceShareName(): String = unwrap(this).getAttrResourceShareName()

  /**
   * The Amazon Resource Name (ARN) of the S3 bucket.
   */
  public open fun attrS3BucketArn(): String = unwrap(this).getAttrS3BucketArn()

  /**
   * The Amazon Resource Name (ARN) of the Security Lake subscriber.
   */
  public open fun attrSubscriberArn(): String = unwrap(this).getAttrSubscriberArn()

  /**
   * The Amazon Resource Name (ARN) of the role used to create the Security Lake subscriber.
   */
  public open fun attrSubscriberRoleArn(): String = unwrap(this).getAttrSubscriberRoleArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) used to create the data lake.
   */
  public open fun dataLakeArn(): String = unwrap(this).getDataLakeArn()

  /**
   * The Amazon Resource Name (ARN) used to create the data lake.
   */
  public open fun dataLakeArn(`value`: String) {
    unwrap(this).setDataLakeArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Amazon Security Lake supports log and event collection for natively supported AWS services .
   */
  public open fun sources(): Any = unwrap(this).getSources()

  /**
   * Amazon Security Lake supports log and event collection for natively supported AWS services .
   */
  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Amazon Security Lake supports log and event collection for natively supported AWS services .
   */
  public open fun sources(`value`: List<Any>) {
    unwrap(this).setSources(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Amazon Security Lake supports log and event collection for natively supported AWS services .
   */
  public open fun sources(vararg `value`: Any): Unit = sources(`value`.toList())

  /**
   * The subscriber descriptions for a subscriber account.
   */
  public open fun subscriberDescription(): String? = unwrap(this).getSubscriberDescription()

  /**
   * The subscriber descriptions for a subscriber account.
   */
  public open fun subscriberDescription(`value`: String) {
    unwrap(this).setSubscriberDescription(`value`)
  }

  /**
   * The AWS identity used to access your data.
   */
  public open fun subscriberIdentity(): Any = unwrap(this).getSubscriberIdentity()

  /**
   * The AWS identity used to access your data.
   */
  public open fun subscriberIdentity(`value`: IResolvable) {
    unwrap(this).setSubscriberIdentity(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The AWS identity used to access your data.
   */
  public open fun subscriberIdentity(`value`: SubscriberIdentityProperty) {
    unwrap(this).setSubscriberIdentity(`value`.let(SubscriberIdentityProperty.Companion::unwrap))
  }

  /**
   * The AWS identity used to access your data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("675f0c0bdfbe8722cd9e2d826b31079e33064511be3c8de541fc1cac524611aa")
  public open fun subscriberIdentity(`value`: SubscriberIdentityProperty.Builder.() -> Unit): Unit =
      subscriberIdentity(SubscriberIdentityProperty(`value`))

  /**
   * The name of your Amazon Security Lake subscriber account.
   */
  public open fun subscriberName(): String = unwrap(this).getSubscriberName()

  /**
   * The name of your Amazon Security Lake subscriber account.
   */
  public open fun subscriberName(`value`: String) {
    unwrap(this).setSubscriberName(`value`)
  }

  /**
   * An array of objects, one for each tag to associate with the subscriber.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of objects, one for each tag to associate with the subscriber.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of objects, one for each tag to associate with the subscriber.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securitylake.CfnSubscriber].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service
     * (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
     *
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-accesstypes)
     * @param accessTypes You can choose to notify subscribers of new objects with an Amazon Simple
     * Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the
     * subscriber. 
     */
    public fun accessTypes(accessTypes: List<String>)

    /**
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service
     * (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
     *
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-accesstypes)
     * @param accessTypes You can choose to notify subscribers of new objects with an Amazon Simple
     * Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the
     * subscriber. 
     */
    public fun accessTypes(vararg accessTypes: String)

    /**
     * The Amazon Resource Name (ARN) used to create the data lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-datalakearn)
     * @param dataLakeArn The Amazon Resource Name (ARN) used to create the data lake. 
     */
    public fun dataLakeArn(dataLakeArn: String)

    /**
     * Amazon Security Lake supports log and event collection for natively supported AWS services .
     *
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-sources)
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     */
    public fun sources(sources: IResolvable)

    /**
     * Amazon Security Lake supports log and event collection for natively supported AWS services .
     *
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-sources)
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     */
    public fun sources(sources: List<Any>)

    /**
     * Amazon Security Lake supports log and event collection for natively supported AWS services .
     *
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-sources)
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     */
    public fun sources(vararg sources: Any)

    /**
     * The subscriber descriptions for a subscriber account.
     *
     * The description for a subscriber includes `subscriberName` , `accountID` , `externalID` , and
     * `subscriberId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberdescription)
     * @param subscriberDescription The subscriber descriptions for a subscriber account. 
     */
    public fun subscriberDescription(subscriberDescription: String)

    /**
     * The AWS identity used to access your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberidentity)
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    public fun subscriberIdentity(subscriberIdentity: IResolvable)

    /**
     * The AWS identity used to access your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberidentity)
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    public fun subscriberIdentity(subscriberIdentity: SubscriberIdentityProperty)

    /**
     * The AWS identity used to access your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberidentity)
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4afabb8d740999272c83d9ce1a1012dcede5cfc2ec4f2bb4704dcdf44f41344")
    public fun subscriberIdentity(subscriberIdentity: SubscriberIdentityProperty.Builder.() -> Unit)

    /**
     * The name of your Amazon Security Lake subscriber account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscribername)
     * @param subscriberName The name of your Amazon Security Lake subscriber account. 
     */
    public fun subscriberName(subscriberName: String)

    /**
     * An array of objects, one for each tag to associate with the subscriber.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-tags)
     * @param tags An array of objects, one for each tag to associate with the subscriber. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of objects, one for each tag to associate with the subscriber.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-tags)
     * @param tags An array of objects, one for each tag to associate with the subscriber. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securitylake.CfnSubscriber.Builder =
        software.amazon.awscdk.services.securitylake.CfnSubscriber.Builder.create(scope, id)

    /**
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service
     * (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
     *
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-accesstypes)
     * @param accessTypes You can choose to notify subscribers of new objects with an Amazon Simple
     * Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the
     * subscriber. 
     */
    override fun accessTypes(accessTypes: List<String>) {
      cdkBuilder.accessTypes(accessTypes)
    }

    /**
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service
     * (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.
     *
     * Subscribers can consume data by directly querying AWS Lake Formation tables in your Amazon S3
     * bucket through services like Amazon Athena. This subscription type is defined as `LAKEFORMATION`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-accesstypes)
     * @param accessTypes You can choose to notify subscribers of new objects with an Amazon Simple
     * Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the
     * subscriber. 
     */
    override fun accessTypes(vararg accessTypes: String): Unit = accessTypes(accessTypes.toList())

    /**
     * The Amazon Resource Name (ARN) used to create the data lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-datalakearn)
     * @param dataLakeArn The Amazon Resource Name (ARN) used to create the data lake. 
     */
    override fun dataLakeArn(dataLakeArn: String) {
      cdkBuilder.dataLakeArn(dataLakeArn)
    }

    /**
     * Amazon Security Lake supports log and event collection for natively supported AWS services .
     *
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-sources)
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
    }

    /**
     * Amazon Security Lake supports log and event collection for natively supported AWS services .
     *
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-sources)
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Amazon Security Lake supports log and event collection for natively supported AWS services .
     *
     * For more information, see the [Amazon Security Lake User
     * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/source-management.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-sources)
     * @param sources Amazon Security Lake supports log and event collection for natively supported
     * AWS services . 
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * The subscriber descriptions for a subscriber account.
     *
     * The description for a subscriber includes `subscriberName` , `accountID` , `externalID` , and
     * `subscriberId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberdescription)
     * @param subscriberDescription The subscriber descriptions for a subscriber account. 
     */
    override fun subscriberDescription(subscriberDescription: String) {
      cdkBuilder.subscriberDescription(subscriberDescription)
    }

    /**
     * The AWS identity used to access your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberidentity)
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    override fun subscriberIdentity(subscriberIdentity: IResolvable) {
      cdkBuilder.subscriberIdentity(subscriberIdentity.let(IResolvable.Companion::unwrap))
    }

    /**
     * The AWS identity used to access your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberidentity)
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    override fun subscriberIdentity(subscriberIdentity: SubscriberIdentityProperty) {
      cdkBuilder.subscriberIdentity(subscriberIdentity.let(SubscriberIdentityProperty.Companion::unwrap))
    }

    /**
     * The AWS identity used to access your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscriberidentity)
     * @param subscriberIdentity The AWS identity used to access your data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4afabb8d740999272c83d9ce1a1012dcede5cfc2ec4f2bb4704dcdf44f41344")
    override
        fun subscriberIdentity(subscriberIdentity: SubscriberIdentityProperty.Builder.() -> Unit):
        Unit = subscriberIdentity(SubscriberIdentityProperty(subscriberIdentity))

    /**
     * The name of your Amazon Security Lake subscriber account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-subscribername)
     * @param subscriberName The name of your Amazon Security Lake subscriber account. 
     */
    override fun subscriberName(subscriberName: String) {
      cdkBuilder.subscriberName(subscriberName)
    }

    /**
     * An array of objects, one for each tag to associate with the subscriber.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-tags)
     * @param tags An array of objects, one for each tag to associate with the subscriber. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of objects, one for each tag to associate with the subscriber.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscriber.html#cfn-securitylake-subscriber-tags)
     * @param tags An array of objects, one for each tag to associate with the subscriber. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.securitylake.CfnSubscriber =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securitylake.CfnSubscriber.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriber {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriber(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber):
        CfnSubscriber = CfnSubscriber(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriber):
        software.amazon.awscdk.services.securitylake.CfnSubscriber = wrapped.cdkObject as
        software.amazon.awscdk.services.securitylake.CfnSubscriber
  }

  /**
   * Adds a natively supported AWS service as an Amazon Security Lake source.
   *
   * Enables source types for member accounts in required AWS Regions, based on the parameters you
   * specify. You can choose any source type in any Region for either accounts that are part of a
   * trusted organization or standalone accounts. Once you add an AWS service as a source, Security
   * Lake starts collecting logs and events from it.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * AwsLogSourceProperty awsLogSourceProperty = AwsLogSourceProperty.builder()
   * .sourceName("sourceName")
   * .sourceVersion("sourceVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-awslogsource.html)
   */
  public interface AwsLogSourceProperty {
    /**
     * Source name of the natively supported AWS service that is supported as an Amazon Security
     * Lake source.
     *
     * For the list of sources supported by Amazon Security Lake see [Collecting data from AWS
     * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html) in
     * the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-awslogsource.html#cfn-securitylake-subscriber-awslogsource-sourcename)
     */
    public fun sourceName(): String? = unwrap(this).getSourceName()

    /**
     * Source version of the natively supported AWS service that is supported as an Amazon Security
     * Lake source.
     *
     * For more details about source versions supported by Amazon Security Lake see [OCSF source
     * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
     * in the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-awslogsource.html#cfn-securitylake-subscriber-awslogsource-sourceversion)
     */
    public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

    /**
     * A builder for [AwsLogSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceName Source name of the natively supported AWS service that is supported as an
       * Amazon Security Lake source.
       * For the list of sources supported by Amazon Security Lake see [Collecting data from AWS
       * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html)
       * in the Amazon Security Lake User Guide.
       */
      public fun sourceName(sourceName: String)

      /**
       * @param sourceVersion Source version of the natively supported AWS service that is supported
       * as an Amazon Security Lake source.
       * For more details about source versions supported by Amazon Security Lake see [OCSF source
       * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
       * in the Amazon Security Lake User Guide.
       */
      public fun sourceVersion(sourceVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnSubscriber.AwsLogSourceProperty.Builder =
          software.amazon.awscdk.services.securitylake.CfnSubscriber.AwsLogSourceProperty.builder()

      /**
       * @param sourceName Source name of the natively supported AWS service that is supported as an
       * Amazon Security Lake source.
       * For the list of sources supported by Amazon Security Lake see [Collecting data from AWS
       * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html)
       * in the Amazon Security Lake User Guide.
       */
      override fun sourceName(sourceName: String) {
        cdkBuilder.sourceName(sourceName)
      }

      /**
       * @param sourceVersion Source version of the natively supported AWS service that is supported
       * as an Amazon Security Lake source.
       * For more details about source versions supported by Amazon Security Lake see [OCSF source
       * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
       * in the Amazon Security Lake User Guide.
       */
      override fun sourceVersion(sourceVersion: String) {
        cdkBuilder.sourceVersion(sourceVersion)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnSubscriber.AwsLogSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber.AwsLogSourceProperty,
    ) : CdkObject(cdkObject), AwsLogSourceProperty {
      /**
       * Source name of the natively supported AWS service that is supported as an Amazon Security
       * Lake source.
       *
       * For the list of sources supported by Amazon Security Lake see [Collecting data from AWS
       * services](https://docs.aws.amazon.com//security-lake/latest/userguide/internal-sources.html)
       * in the Amazon Security Lake User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-awslogsource.html#cfn-securitylake-subscriber-awslogsource-sourcename)
       */
      override fun sourceName(): String? = unwrap(this).getSourceName()

      /**
       * Source version of the natively supported AWS service that is supported as an Amazon
       * Security Lake source.
       *
       * For more details about source versions supported by Amazon Security Lake see [OCSF source
       * identification](https://docs.aws.amazon.com//security-lake/latest/userguide/open-cybersecurity-schema-framework.html#ocsf-source-identification)
       * in the Amazon Security Lake User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-awslogsource.html#cfn-securitylake-subscriber-awslogsource-sourceversion)
       */
      override fun sourceVersion(): String? = unwrap(this).getSourceVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsLogSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber.AwsLogSourceProperty):
          AwsLogSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? AwsLogSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsLogSourceProperty):
          software.amazon.awscdk.services.securitylake.CfnSubscriber.AwsLogSourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnSubscriber.AwsLogSourceProperty
    }
  }

  /**
   * Third-party custom log source that meets the requirements to be added to Amazon Security Lake .
   *
   * For more details, see [Custom log
   * source](https://docs.aws.amazon.com//security-lake/latest/userguide/custom-sources.html#iam-roles-custom-sources)
   * in the *Amazon Security Lake User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * CustomLogSourceProperty customLogSourceProperty = CustomLogSourceProperty.builder()
   * .sourceName("sourceName")
   * .sourceVersion("sourceVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-customlogsource.html)
   */
  public interface CustomLogSourceProperty {
    /**
     * The name of the custom log source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-customlogsource.html#cfn-securitylake-subscriber-customlogsource-sourcename)
     */
    public fun sourceName(): String? = unwrap(this).getSourceName()

    /**
     * The source version of the custom log source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-customlogsource.html#cfn-securitylake-subscriber-customlogsource-sourceversion)
     */
    public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

    /**
     * A builder for [CustomLogSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceName The name of the custom log source.
       */
      public fun sourceName(sourceName: String)

      /**
       * @param sourceVersion The source version of the custom log source.
       */
      public fun sourceVersion(sourceVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnSubscriber.CustomLogSourceProperty.Builder
          =
          software.amazon.awscdk.services.securitylake.CfnSubscriber.CustomLogSourceProperty.builder()

      /**
       * @param sourceName The name of the custom log source.
       */
      override fun sourceName(sourceName: String) {
        cdkBuilder.sourceName(sourceName)
      }

      /**
       * @param sourceVersion The source version of the custom log source.
       */
      override fun sourceVersion(sourceVersion: String) {
        cdkBuilder.sourceVersion(sourceVersion)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnSubscriber.CustomLogSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber.CustomLogSourceProperty,
    ) : CdkObject(cdkObject), CustomLogSourceProperty {
      /**
       * The name of the custom log source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-customlogsource.html#cfn-securitylake-subscriber-customlogsource-sourcename)
       */
      override fun sourceName(): String? = unwrap(this).getSourceName()

      /**
       * The source version of the custom log source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-customlogsource.html#cfn-securitylake-subscriber-customlogsource-sourceversion)
       */
      override fun sourceVersion(): String? = unwrap(this).getSourceVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomLogSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber.CustomLogSourceProperty):
          CustomLogSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomLogSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomLogSourceProperty):
          software.amazon.awscdk.services.securitylake.CfnSubscriber.CustomLogSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnSubscriber.CustomLogSourceProperty
    }
  }

  /**
   * Sources are logs and events generated from a single system that match a specific event class in
   * the Open Cybersecurity Schema Framework (OCSF) schema.
   *
   * Amazon Security Lake can collect logs and events from a variety of sources, including natively
   * supported AWS services and third-party custom sources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * SourceProperty sourceProperty = SourceProperty.builder()
   * .awsLogSource(AwsLogSourceProperty.builder()
   * .sourceName("sourceName")
   * .sourceVersion("sourceVersion")
   * .build())
   * .customLogSource(CustomLogSourceProperty.builder()
   * .sourceName("sourceName")
   * .sourceVersion("sourceVersion")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-source.html)
   */
  public interface SourceProperty {
    /**
     * The natively supported AWS service which is used a Amazon Security Lake source to collect
     * logs and events from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-source.html#cfn-securitylake-subscriber-source-awslogsource)
     */
    public fun awsLogSource(): Any? = unwrap(this).getAwsLogSource()

    /**
     * The custom log source AWS which is used a Amazon Security Lake source to collect logs and
     * events from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-source.html#cfn-securitylake-subscriber-source-customlogsource)
     */
    public fun customLogSource(): Any? = unwrap(this).getCustomLogSource()

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsLogSource The natively supported AWS service which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      public fun awsLogSource(awsLogSource: IResolvable)

      /**
       * @param awsLogSource The natively supported AWS service which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      public fun awsLogSource(awsLogSource: AwsLogSourceProperty)

      /**
       * @param awsLogSource The natively supported AWS service which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d769dfff0b12a1aacefb6bb4adb2d37278b54ebdd43c4f7337fa054151bb205f")
      public fun awsLogSource(awsLogSource: AwsLogSourceProperty.Builder.() -> Unit)

      /**
       * @param customLogSource The custom log source AWS which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      public fun customLogSource(customLogSource: IResolvable)

      /**
       * @param customLogSource The custom log source AWS which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      public fun customLogSource(customLogSource: CustomLogSourceProperty)

      /**
       * @param customLogSource The custom log source AWS which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e01ca4efc11677d5d2186428404d9c638cfd3bacda9d305c9f4b8ab75d4418c")
      public fun customLogSource(customLogSource: CustomLogSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SourceProperty.Builder =
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SourceProperty.builder()

      /**
       * @param awsLogSource The natively supported AWS service which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      override fun awsLogSource(awsLogSource: IResolvable) {
        cdkBuilder.awsLogSource(awsLogSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsLogSource The natively supported AWS service which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      override fun awsLogSource(awsLogSource: AwsLogSourceProperty) {
        cdkBuilder.awsLogSource(awsLogSource.let(AwsLogSourceProperty.Companion::unwrap))
      }

      /**
       * @param awsLogSource The natively supported AWS service which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d769dfff0b12a1aacefb6bb4adb2d37278b54ebdd43c4f7337fa054151bb205f")
      override fun awsLogSource(awsLogSource: AwsLogSourceProperty.Builder.() -> Unit): Unit =
          awsLogSource(AwsLogSourceProperty(awsLogSource))

      /**
       * @param customLogSource The custom log source AWS which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      override fun customLogSource(customLogSource: IResolvable) {
        cdkBuilder.customLogSource(customLogSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customLogSource The custom log source AWS which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      override fun customLogSource(customLogSource: CustomLogSourceProperty) {
        cdkBuilder.customLogSource(customLogSource.let(CustomLogSourceProperty.Companion::unwrap))
      }

      /**
       * @param customLogSource The custom log source AWS which is used a Amazon Security Lake
       * source to collect logs and events from.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e01ca4efc11677d5d2186428404d9c638cfd3bacda9d305c9f4b8ab75d4418c")
      override fun customLogSource(customLogSource: CustomLogSourceProperty.Builder.() -> Unit):
          Unit = customLogSource(CustomLogSourceProperty(customLogSource))

      public fun build(): software.amazon.awscdk.services.securitylake.CfnSubscriber.SourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      /**
       * The natively supported AWS service which is used a Amazon Security Lake source to collect
       * logs and events from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-source.html#cfn-securitylake-subscriber-source-awslogsource)
       */
      override fun awsLogSource(): Any? = unwrap(this).getAwsLogSource()

      /**
       * The custom log source AWS which is used a Amazon Security Lake source to collect logs and
       * events from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-source.html#cfn-securitylake-subscriber-source-customlogsource)
       */
      override fun customLogSource(): Any? = unwrap(this).getCustomLogSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber.SourceProperty):
          SourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SourceProperty
    }
  }

  /**
   * Specify the AWS account ID and external ID that the subscriber will use to access source data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * SubscriberIdentityProperty subscriberIdentityProperty = SubscriberIdentityProperty.builder()
   * .externalId("externalId")
   * .principal("principal")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-subscriberidentity.html)
   */
  public interface SubscriberIdentityProperty {
    /**
     * The external ID is a unique identifier that the subscriber provides to you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-subscriberidentity.html#cfn-securitylake-subscriber-subscriberidentity-externalid)
     */
    public fun externalId(): String

    /**
     * Principals can include accounts, users, roles, federated users, or AWS services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-subscriberidentity.html#cfn-securitylake-subscriber-subscriberidentity-principal)
     */
    public fun principal(): String

    /**
     * A builder for [SubscriberIdentityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param externalId The external ID is a unique identifier that the subscriber provides to
       * you. 
       */
      public fun externalId(externalId: String)

      /**
       * @param principal Principals can include accounts, users, roles, federated users, or AWS
       * services. 
       */
      public fun principal(principal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SubscriberIdentityProperty.Builder
          =
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SubscriberIdentityProperty.builder()

      /**
       * @param externalId The external ID is a unique identifier that the subscriber provides to
       * you. 
       */
      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      /**
       * @param principal Principals can include accounts, users, roles, federated users, or AWS
       * services. 
       */
      override fun principal(principal: String) {
        cdkBuilder.principal(principal)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SubscriberIdentityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber.SubscriberIdentityProperty,
    ) : CdkObject(cdkObject), SubscriberIdentityProperty {
      /**
       * The external ID is a unique identifier that the subscriber provides to you.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-subscriberidentity.html#cfn-securitylake-subscriber-subscriberidentity-externalid)
       */
      override fun externalId(): String = unwrap(this).getExternalId()

      /**
       * Principals can include accounts, users, roles, federated users, or AWS services.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscriber-subscriberidentity.html#cfn-securitylake-subscriber-subscriberidentity-principal)
       */
      override fun principal(): String = unwrap(this).getPrincipal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriberIdentityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriber.SubscriberIdentityProperty):
          SubscriberIdentityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SubscriberIdentityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriberIdentityProperty):
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SubscriberIdentityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnSubscriber.SubscriberIdentityProperty
    }
  }
}
