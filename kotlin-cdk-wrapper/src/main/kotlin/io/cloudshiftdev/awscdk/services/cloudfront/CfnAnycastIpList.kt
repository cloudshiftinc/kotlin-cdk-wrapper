@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An Anycast static IP list.
 *
 * For more information, see [Request Anycast static IPs to use for
 * allowlisting](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/request-static-ips.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnAnycastIpList cfnAnycastIpList = CfnAnycastIpList.Builder.create(this, "MyCfnAnycastIpList")
 * .ipCount(123)
 * .name("name")
 * // the properties below are optional
 * .tags(TagsProperty.builder()
 * .items(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html)
 */
public open class CfnAnycastIpList(
  cdkObject: software.amazon.awscdk.services.cloudfront.CfnAnycastIpList,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAnycastIpListProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnAnycastIpList(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAnycastIpListProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAnycastIpListProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAnycastIpListProps(props)
  )

  /**
   * An Anycast static IP list.
   *
   * For more information, see [Request Anycast static IPs to use for
   * allowlisting](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/request-static-ips.html)
   * in the *Amazon CloudFront Developer Guide*.
   */
  public open fun attrAnycastIpList(): IResolvable =
      unwrap(this).getAttrAnycastIpList().let(IResolvable::wrap)

  /**
   * A complex type that contains `Tag` key and `Tag` value.
   */
  public open fun attrETag(): String = unwrap(this).getAttrETag()

  /**
   * The ID of the Anycast static IP list.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The number of IP addresses in the Anycast static IP list.
   */
  public open fun ipCount(): Number = unwrap(this).getIpCount()

  /**
   * The number of IP addresses in the Anycast static IP list.
   */
  public open fun ipCount(`value`: Number) {
    unwrap(this).setIpCount(`value`)
  }

  /**
   * The name of the Anycast static IP list.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the Anycast static IP list.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tags(): TagsProperty? = unwrap(this).getTags()?.let(TagsProperty::wrap)

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tags(`value`: TagsProperty) {
    unwrap(this).setTags(`value`.let(TagsProperty.Companion::unwrap))
  }

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8adb39fd6934656c88034033de083f1cf9a24603934f5229908a8d82733e46e6")
  public open fun tags(`value`: TagsProperty.Builder.() -> Unit): Unit = tags(TagsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnAnycastIpList].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of IP addresses in the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-ipcount)
     * @param ipCount The number of IP addresses in the Anycast static IP list. 
     */
    public fun ipCount(ipCount: Number)

    /**
     * The name of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-name)
     * @param name The name of the Anycast static IP list. 
     */
    public fun name(name: String)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(tags: TagsProperty)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6f1bce52c2533d6aa1bf5642e3821b0b87b2c34ba7c15e56de8b846de8a4e8")
    public fun tags(tags: TagsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.Builder =
        software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.Builder.create(scope, id)

    /**
     * The number of IP addresses in the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-ipcount)
     * @param ipCount The number of IP addresses in the Anycast static IP list. 
     */
    override fun ipCount(ipCount: Number) {
      cdkBuilder.ipCount(ipCount)
    }

    /**
     * The name of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-name)
     * @param name The name of the Anycast static IP list. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(tags: TagsProperty) {
      cdkBuilder.tags(tags.let(TagsProperty.Companion::unwrap))
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-anycastiplist.html#cfn-cloudfront-anycastiplist-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6f1bce52c2533d6aa1bf5642e3821b0b87b2c34ba7c15e56de8b846de8a4e8")
    override fun tags(tags: TagsProperty.Builder.() -> Unit): Unit = tags(TagsProperty(tags))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnAnycastIpList =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnycastIpList {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnycastIpList(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnAnycastIpList):
        CfnAnycastIpList = CfnAnycastIpList(cdkObject)

    internal fun unwrap(wrapped: CfnAnycastIpList):
        software.amazon.awscdk.services.cloudfront.CfnAnycastIpList = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnAnycastIpList
  }

  /**
   * An Anycast static IP list.
   *
   * For more information, see [Request Anycast static IPs to use for
   * allowlisting](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/request-static-ips.html)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * AnycastIpListProperty anycastIpListProperty = AnycastIpListProperty.builder()
   * .anycastIps(List.of("anycastIps"))
   * .arn("arn")
   * .id("id")
   * .ipCount(123)
   * .lastModifiedTime("lastModifiedTime")
   * .name("name")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html)
   */
  public interface AnycastIpListProperty {
    /**
     * The static IP addresses that are allocated to the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-anycastips)
     */
    public fun anycastIps(): List<String>

    /**
     * The Amazon Resource Name (ARN) of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-arn)
     */
    public fun arn(): String

    /**
     * The ID of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-id)
     */
    public fun id(): String

    /**
     * The number of IP addresses in the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-ipcount)
     */
    public fun ipCount(): Number

    /**
     * The last time the Anycast static IP list was modified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-lastmodifiedtime)
     */
    public fun lastModifiedTime(): String

    /**
     * The name of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-name)
     */
    public fun name(): String

    /**
     * The status of the Anycast static IP list.
     *
     * Valid values: `Deployed` , `Deploying` , or `Failed` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-status)
     */
    public fun status(): String

    /**
     * A builder for [AnycastIpListProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param anycastIps The static IP addresses that are allocated to the Anycast static IP list.
       * 
       */
      public fun anycastIps(anycastIps: List<String>)

      /**
       * @param anycastIps The static IP addresses that are allocated to the Anycast static IP list.
       * 
       */
      public fun anycastIps(vararg anycastIps: String)

      /**
       * @param arn The Amazon Resource Name (ARN) of the Anycast static IP list. 
       */
      public fun arn(arn: String)

      /**
       * @param id The ID of the Anycast static IP list. 
       */
      public fun id(id: String)

      /**
       * @param ipCount The number of IP addresses in the Anycast static IP list. 
       */
      public fun ipCount(ipCount: Number)

      /**
       * @param lastModifiedTime The last time the Anycast static IP list was modified. 
       */
      public fun lastModifiedTime(lastModifiedTime: String)

      /**
       * @param name The name of the Anycast static IP list. 
       */
      public fun name(name: String)

      /**
       * @param status The status of the Anycast static IP list. 
       * Valid values: `Deployed` , `Deploying` , or `Failed` .
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.AnycastIpListProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.AnycastIpListProperty.builder()

      /**
       * @param anycastIps The static IP addresses that are allocated to the Anycast static IP list.
       * 
       */
      override fun anycastIps(anycastIps: List<String>) {
        cdkBuilder.anycastIps(anycastIps)
      }

      /**
       * @param anycastIps The static IP addresses that are allocated to the Anycast static IP list.
       * 
       */
      override fun anycastIps(vararg anycastIps: String): Unit = anycastIps(anycastIps.toList())

      /**
       * @param arn The Amazon Resource Name (ARN) of the Anycast static IP list. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param id The ID of the Anycast static IP list. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param ipCount The number of IP addresses in the Anycast static IP list. 
       */
      override fun ipCount(ipCount: Number) {
        cdkBuilder.ipCount(ipCount)
      }

      /**
       * @param lastModifiedTime The last time the Anycast static IP list was modified. 
       */
      override fun lastModifiedTime(lastModifiedTime: String) {
        cdkBuilder.lastModifiedTime(lastModifiedTime)
      }

      /**
       * @param name The name of the Anycast static IP list. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param status The status of the Anycast static IP list. 
       * Valid values: `Deployed` , `Deploying` , or `Failed` .
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.AnycastIpListProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.AnycastIpListProperty,
    ) : CdkObject(cdkObject),
        AnycastIpListProperty {
      /**
       * The static IP addresses that are allocated to the Anycast static IP list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-anycastips)
       */
      override fun anycastIps(): List<String> = unwrap(this).getAnycastIps()

      /**
       * The Amazon Resource Name (ARN) of the Anycast static IP list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The ID of the Anycast static IP list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The number of IP addresses in the Anycast static IP list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-ipcount)
       */
      override fun ipCount(): Number = unwrap(this).getIpCount()

      /**
       * The last time the Anycast static IP list was modified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-lastmodifiedtime)
       */
      override fun lastModifiedTime(): String = unwrap(this).getLastModifiedTime()

      /**
       * The name of the Anycast static IP list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The status of the Anycast static IP list.
       *
       * Valid values: `Deployed` , `Deploying` , or `Failed` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-anycastiplist.html#cfn-cloudfront-anycastiplist-anycastiplist-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnycastIpListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.AnycastIpListProperty):
          AnycastIpListProperty = CdkObjectWrappers.wrap(cdkObject) as? AnycastIpListProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnycastIpListProperty):
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.AnycastIpListProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.AnycastIpListProperty
    }
  }

  /**
   * A complex type that contains zero or more `Tag` elements.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * TagsProperty tagsProperty = TagsProperty.builder()
   * .items(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-tags.html)
   */
  public interface TagsProperty {
    /**
     * A complex type that contains `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-tags.html#cfn-cloudfront-anycastiplist-tags-items)
     */
    public fun items(): Any? = unwrap(this).getItems()

    /**
     * A builder for [TagsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items A complex type that contains `Tag` elements.
       */
      public fun items(items: IResolvable)

      /**
       * @param items A complex type that contains `Tag` elements.
       */
      public fun items(items: List<Any>)

      /**
       * @param items A complex type that contains `Tag` elements.
       */
      public fun items(vararg items: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.TagsProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.TagsProperty.builder()

      /**
       * @param items A complex type that contains `Tag` elements.
       */
      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param items A complex type that contains `Tag` elements.
       */
      override fun items(items: List<Any>) {
        cdkBuilder.items(items.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param items A complex type that contains `Tag` elements.
       */
      override fun items(vararg items: Any): Unit = items(items.toList())

      public fun build(): software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.TagsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.TagsProperty,
    ) : CdkObject(cdkObject),
        TagsProperty {
      /**
       * A complex type that contains `Tag` elements.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-anycastiplist-tags.html#cfn-cloudfront-anycastiplist-tags-items)
       */
      override fun items(): Any? = unwrap(this).getItems()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.TagsProperty):
          TagsProperty = CdkObjectWrappers.wrap(cdkObject) as? TagsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsProperty):
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.TagsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnAnycastIpList.TagsProperty
    }
  }
}
